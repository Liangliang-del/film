package com.ll.test;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ll.biz.ICinemaBiz;
import com.ll.po.Cinema;
import com.ll.util.PicUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:spring-bean.xml" })
public class TestJsoupCinema {

	@Autowired
	private ICinemaBiz cinemaBizImpl;

	// 添加影院
	@Test
	public void testInsertCinema() throws Exception {
		// 创建httpclient实例
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httpget实例
		HttpGet httpget = new HttpGet("https://maoyan.com/cinemas?offset=12");

		// 执行get请求
		CloseableHttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		// 获取返回实体
		String content = EntityUtils.toString(entity, "utf-8");

		// File input = new File("D://test.html");
		System.out.println(content);
		// 解析网页 得到文档对象
		Document doc = Jsoup.parse(content);
		// 获取指定的<a>
		Elements cinemaUrl = doc.select("#app .cinemas-list .cinema-cell .cinema-info a");
		// 获取指定的 <img />
		// Elements imgs = doc.select("#nowplaying .lists .list-item .poster a
		// img");

		List<Cinema> list = new ArrayList<Cinema>();
		Cinema cinema = null;
		if (cinemaUrl != null && cinemaUrl.size() > 0) {
			for (int i = 1; i < 11; i++) {
				cinema = new Cinema();

				Element element = cinemaUrl.get(i);
				// 获取 <a /> 的 href
				String href = element.attr("href");
				System.out.println("href:" + href);

				System.out.println("------------------------");

				// 再发请求最简单了，并由于该链接是没有 https:开头的，得人工补全 ✔
				HttpGet CinemahttpGet = new HttpGet("https://maoyan.com" + href);
				CloseableHttpResponse CinemaResponse = httpclient.execute(CinemahttpGet);
				HttpEntity CinemaEntity = CinemaResponse.getEntity();
				// 获取返回实体
				String cinameContent = EntityUtils.toString(CinemaEntity, "utf-8");
				System.out.println(cinameContent);
				// 解析网页 得到文档对象
				Document doc2 = Jsoup.parse(cinameContent);
				// 获取指定的标签
				Elements names = doc2.select(".cinema-brief-container h3");
				if (names == null || names.size() <= 0) {
					System.out.println("第二层爬取失败！！！");
					return;
				}
				String name = names.get(0).text();
				String addr = doc2.select(".cinema-brief-container div").get(0).text();
				String tel = doc2.select(".cinema-banner .cinema-main .cinema-brief-container .telphone").get(0).text();
				Elements servers = doc2.select(".cinema-banner .cinema-main .cinema-brief-container .feature");
				StringBuffer sb = new StringBuffer();
				for (int j = 0; j < servers.size(); j++) {
					String pre = servers.get(j).child(0).text();
					String ne = servers.get(j).child(2).text();
					sb.append(pre).append(":").append(ne).append(";");
				}

				String picsrc = doc2.select(".cinema-left .avatar-shadow img").get(0).attr("src");
				System.out.println("picsrc:" + picsrc);
				HttpGet picturehttpGet = new HttpGet(picsrc);
				CloseableHttpResponse pictureResponse = httpclient.execute(picturehttpGet);
				HttpEntity pictureEntity = pictureResponse.getEntity();
				InputStream inputStream = pictureEntity.getContent();
				String path = "filmImage//cinema//" + new Date().getTime() + "_" + i + ".jpg";
				// 使用 common-io 下载图片到本地，注意图片名不能重复 ✔D:\jsop
				FileUtils.copyToFile(inputStream, new File("D://Tomcat//apache-tomcat-8.0.53//webapps//" + path));

				cinema.setcName(name);
				cinema.setcAddr(addr);
				cinema.setcTel(tel);
				cinema.setcServe(sb.toString());
				cinema.setcPic(path);
				System.out.println("cinema:" + cinema);
				list.add(cinema);

				pictureResponse.close(); // pictureResponse关闭
				CinemaResponse.close(); // pictureResponse关闭

				Thread.sleep(5000);
			}
		} else {
			System.out.println("失败。。。。");
		}

		response.close(); // response关闭
		httpclient.close(); // httpClient关闭

		for (Cinema c : list) {
			System.out.println(c);
			cinemaBizImpl.addCin(c);
		}

	}

	// 添加影院
	@Test
	public void testInsertCinema2() throws Exception {
		List<Cinema> list = new ArrayList<Cinema>();
		Cinema cinema = null;
		File input = null;
		Document doc = null;
		for (int i = 1; i < 17; i++) {
			input = new File("D://cinema//"+i+".html");
			// 解析网页 得到文档对象
			doc = Jsoup.parse(input, "UTF-8");
			// 获取指定的<a>
			
			cinema = new Cinema();

			// 获取指定的标签
			Elements names = doc.select(".cinema-brief-container h3");
			if (names == null || names.size() <= 0) {
				System.out.println("第二层爬取失败！！！");
				return;
			}
			String name = names.get(0).text();
			String addr = doc.select(".cinema-brief-container div").get(0).text();
			String tel = doc.select(".cinema-banner .cinema-main .cinema-brief-container .telphone").get(0).text().split("：")[1];
			Elements servers = doc.select(".cinema-banner .cinema-main .cinema-brief-container .feature");
			StringBuffer sb = new StringBuffer();
			if(servers != null && servers.size()>0){
				for (int j = 0; j < servers.size(); j++) {
					Element c1 = servers.get(j).child(0);
					Element c2 = servers.get(j).child(1);
					if(c1 != null && c2 != null){
						String pre = c1.text();
						String ne = c2.text();
						sb.append(pre).append(":").append(ne).append(";");
					}
				}
			}

			String picsrc = doc.select(".cinema-left .avatar-shadow img").get(0).attr("src");
			System.out.println("picsrc:" + picsrc);
			String path = "filmImage/cinema/" + new Date().getTime() + "_" + i + ".jpg";
			String desc = "D://Tomcat//apache-tomcat-8.0.53//webapps//"+path;
			PicUtil.copyPic("D://cinema//"+picsrc, desc);

			cinema.setcName(name);
			cinema.setcAddr(addr);
			cinema.setcTel(tel);
			cinema.setcServe(sb.toString());
			cinema.setcPic(path);
			System.out.println("cinema:" + cinema);
			list.add(cinema);

//			pictureResponse.close(); // pictureResponse关闭
			
			Thread.sleep(5000);
		}

		for (Cinema c : list) {
			System.out.println(c);
			cinemaBizImpl.addCin(c);
		}

	}

	// 添加影院
	@Test
	public void testInsertCinema3() throws Exception {
		// 创建httpclient实例
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httpget实例
		HttpGet httpget = new HttpGet("https://maoyan.com/cinema/9749?poi=6575579");

		// 执行get请求
		CloseableHttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		// 获取返回实体
		String content = EntityUtils.toString(entity, "utf-8");

		// File input = new File("D://test.html");
		System.out.println(content);
		// 解析网页 得到文档对象
		Document doc = Jsoup.parse(content);

		List<Cinema> list = new ArrayList<Cinema>();
		Cinema cinema = new Cinema();
		// 获取指定的标签
		Elements names = doc.select(".cinema-brief-container h3");
		if (names == null || names.size() <= 0) {
			System.out.println("第二层爬取失败！！！");
			return;
		}
		String name = names.get(0).text();
		String addr = doc.select(".cinema-brief-container div").get(0).text();
		String tel = doc.select(".cinema-banner .cinema-main .cinema-brief-container .telphone").get(0).text();
		Elements servers = doc.select(".cinema-banner .cinema-main .cinema-brief-container .feature");
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < servers.size(); j++) {
			String pre = servers.get(j).child(0).text();
			String ne = servers.get(j).child(2).text();
			sb.append(pre).append(":").append(ne).append(";");
		}

		String picsrc = doc.select(".cinema-left .avatar-shadow img").get(0).attr("src");
		System.out.println("picsrc:" + picsrc);
		HttpGet picturehttpGet = new HttpGet(picsrc);
		CloseableHttpResponse pictureResponse = httpclient.execute(picturehttpGet);
		HttpEntity pictureEntity = pictureResponse.getEntity();
		InputStream inputStream = pictureEntity.getContent();
		String path = "filmImage//cinema//" + new Date().getTime() + "_" + ".jpg";
		// 使用 common-io 下载图片到本地，注意图片名不能重复 ✔D:\jsop
		FileUtils.copyToFile(inputStream, new File("D://Tomcat//apache-tomcat-8.0.53//webapps//" + path));

		cinema.setcName(name);
		cinema.setcAddr(addr);
		cinema.setcTel(tel);
		cinema.setcServe(sb.toString());
		cinema.setcPic(path);
		System.out.println("cinema:" + cinema);
		list.add(cinema);

		pictureResponse.close(); // pictureResponse关闭

		response.close(); // response关闭
		httpclient.close(); // httpClient关闭

		for (Cinema c : list) {
			System.out.println(c);
			cinemaBizImpl.addCin(c);
		}

	}
}

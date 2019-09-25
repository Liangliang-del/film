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
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ll.biz.IFilmBiz;
import com.ll.po.Cinema;
import com.ll.po.Film;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class TestJsoupFilm {

	@Autowired
	private IFilmBiz biz;
	
	//添加电影
	@Test
	public void testInsertFilm() throws Exception {
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

		List<Film> list = new ArrayList<Film>();
		Film film = new Film();
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


		pictureResponse.close(); // pictureResponse关闭

		response.close(); // response关闭
		httpclient.close(); // httpClient关闭

		for (Film c : list) {
			System.out.println(c);
		}

	}
}

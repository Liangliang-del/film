package com.ll.test;

import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
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

import com.ll.biz.IFilmBiz;
import com.ll.po.Cinema;
import com.ll.po.Film;
import com.ll.util.PicUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class TestJsoupFilm {

	@Autowired
	private IFilmBiz filmBizbiz;
	
	//添加电影
	@Test
	public void testInsertFilm() throws Exception {
		List<Film> list = new ArrayList<Film>();
		Film film = null;
		File input = null;
		Document doc = null;
		for (int i = 2; i < 22; i++) {
			if(i==3 || i==9 || i==11 || i==15 || i==17 || i==18 || i==19){
				continue;
			}
			input = new File("D://jsoup//film//"+i+".html");
			// 解析网页 得到文档对象
			doc = Jsoup.parse(input, "UTF-8");
			// 获取指定的<a>
			
			film = new Film();

			// 获取指定的标签
			Elements names = doc.select(".movie-brief-container h3");
			if (names == null || names.size() <= 0) {
				System.out.println("第二层爬取失败！！！");
				return;
			}
			String name = names.get(0).text();
			String[] types = doc.select(".movie-brief-container ul .ellipsis").get(0).text().split(",");
			String type = "";
			if(types.length>1){
				type = types[1];
			}
			String time = doc.select(".movie-brief-container ul .ellipsis").get(1).text().split("/")[1];
			String pdate = doc.select(".movie-brief-container ul .ellipsis").get(2).text().substring(0, 10);
			String desc = doc.select(".main-content .module").get(0).select(".dra").get(0).text();
			String director = doc.select(".main-content .module").get(1).select(".info").get(0).child(0).text();
			Elements actors = doc.select(".main-content .module").get(1).select(".info");
			StringBuffer sb = new StringBuffer();
			if(actors != null && actors.size()>0){
				for (int j = 1; j < actors.size(); j++) {
					Element c1 = actors.get(j).child(0);
					Element c2 = actors.get(j).select(".role").get(0);
					if(c1 != null && c2 != null){
						String pre = c1.text();
						String ne = c2.text();
						sb.append(pre).append(";").append(ne).append(";");
					}
				}
			}

			String picsrc = doc.select(".banner .celeInfo-left .avatar-shadow img").get(0).attr("src");
			System.out.println("picsrc:" + picsrc);
			String path = "filmImage/film/" + new Date().getTime() + "_" + i + ".jpg";
			String dest = "D://Tomcat//apache-tomcat-8.0.53//webapps//"+path;
			PicUtil.copyPic("D://jsoup//film//"+picsrc, dest);

			film.setfName(name);
			film.setfDirector(director);
			film.setfActor(sb.toString());
			film.setfPdate(new SimpleDateFormat( "yyyy-MM-dd" ).parse(pdate));
			film.setfType(type);
			film.setfTime(time);
			film.setfPic(path);
			film.setfStatus(1);
			film.setfDesc(desc);
			
			System.out.println("film:" + film);
			list.add(film);

//			pictureResponse.close(); // pictureResponse关闭
			
//			Thread.sleep(3000);
		}

		for (Film c : list) {
			System.out.println(c);
			filmBizbiz.addFilm(c);
		}

	}
}

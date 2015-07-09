package home;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;
import java.net.URL;
import java.util.List;
import java.lang.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection; 
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;   

import java.util.List;
import java.util.ArrayList;

import static java.lang.System.*;
import home.*;

import org.json.*;

public class RSSServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,
					HttpServletResponse response)
					throws IOException, ServletException{

		
		String url = request.getParameter("rss_url");
		
		
		
		
		//String ath = request.getParameter("athlete");
		
		
		
		RSSReader RR = new RSSReader();
		List<Article> article = RR.getitem(url);
		
		JSONArray jsonAr = new JSONArray();
		
		try {
		for(Article a: article)
		{
			JSONObject obj = new JSONObject();
			obj.put("Title",a.getTitle().toString());
			obj.put("Link",a.getLink().toString());
			obj.put("pubDate",a.getpubDate().toString());
			obj.put("Description",a.getDescription().toString());
			obj.put("Category",a.getCategory().toString());
			jsonAr.put(obj);
			
		}
		
		//JSONArray jsonAr=new JSONArray();
		
		//jsonAr.put(hashMap);
		
	
		
		String myjson="{\"list\":"+jsonAr.toString()+"}";
		/*
		request.setAttribute("JSONString", myjson);
		
		 
		
		JSONObject jsonobj=new JSONObject(myjson);//将字符串转化成json对象    
		JSONArray array = jsonobj.getJSONArray("list");
		
		List<Article> parseToArticle=new ArrayList<Article>();
		
		
		for (int i = 0; i < array.length(); i++) {
			//System.out.println("list:" + array.get(i));
			parseToArticle.add(new Article(array.getJSONObject(i).get("Title").toString(),array.getJSONObject(i).get("Link").toString(),array.getJSONObject(i).get("pubDate").toString(),array.getJSONObject(i).get("Description").toString(),array.getJSONObject(i).get("Category").toString()));
		}
		
		//request.setAttribute("result",parseToArticle);
		*/
		
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(myjson);
		
		//RequestDispatcher view = request.getRequestDispatcher("result.html");
		//view.forward(request, response);		
		
		
		} 
		catch (JSONException e) {
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}
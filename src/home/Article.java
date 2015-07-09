package home;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;   
import home.*;

public class Article {

	Object title;
	Object link;
	Object pubDate;
	Object description;
	Object category;
	
	Article(Object title,Object link,Object pubDate,Object description,Object category)
	{
		this.title =title;
		this.link=link;
		this.pubDate=pubDate;
		this.description=description;
		this.category=category;
	}
	
	
	public Object getTitle()
	{return title;}
	public Object getLink()
	{return link;}
	public Object getpubDate()
	{return pubDate;}
	public Object getDescription()
	{return description;}
	public Object getCategory()
	{return category;}
	
	public String toString()
	{
		return "Title: "+getTitle()+"\nLink:"+getLink()+"\npubDate:"+getpubDate()+"\nDescription:"+getDescription()+"\nCategory:"+getCategory()+"\n";
	}
	
	
}

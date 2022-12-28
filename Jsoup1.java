package crawl;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jsoup1 {
	public static void main(String[] args) throws IOException {
	       Document doc = Jsoup.connect("https://nguoikesu.com/nhan-vat?date=20180623").get();
	       // Elements extends ArrayList<Element>.
	       Elements aElements = doc.getElementsByTag("li");
	       for (Element aElement : aElements) {
	           String href = aElement.attr("a");
	           String text = aElement.text();
	           System.out.println(text);
	           System.out.println("\t" + href);
	       }
	   }
}

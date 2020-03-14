/**
 * This class represents the scraper logic for scraping HackerNews posts from the front page.
 * Using the library HTMLUnit as a Java headless browser, this will allow us to perform HTTP
 * requests on the website and parse the HTML content.
 */

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.List;

public class Scraper {

    public static void main(String[] args) throws IOException {
        String baseUrl = "https://news.ycombinator.com/";
        WebClient client = new WebClient();

        // Disabling CSS and Javascript for
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        try {
            HtmlPage page = client.getPage(baseUrl);
            // Print the html page
            //System.out.println(page.asXml());
        } catch (Exception e) {
            e.printStackTrace();
        }


        HtmlPage page = client.getPage(baseUrl);
        List<HtmlElement> itemList = page.getByXPath("//tr[@class='athing']");

        if (itemList.isEmpty()) {
            System.out.println("No item found");
        } else {
            for (HtmlElement htmlItem : itemList) {
                int position = Integer.parseInt(
                        ((HtmlElement) htmlItem.getFirstByXPath("./td/span"))
                                .asText()
                                .replace(".", ""));
                int id = Integer.parseInt(htmlItem.getAttribute("id"));
                String title = ((HtmlElement) htmlItem
                        .getFirstByXPath("./td[not(@valign='top')][@class='title']"))
                        .asText();
                String url = ((HtmlAnchor) htmlItem
                        .getFirstByXPath("./td[not(@valign='top')][@class='title']/a"))
                        .getHrefAttribute();
                String author = ((HtmlElement) htmlItem
                        .getFirstByXPath("./following-sibling::tr/td[@class='subtext']/a[@class='hnuser']"))
                        .asText();
                int score = Integer.parseInt(
                        ((HtmlElement) htmlItem
                                .getFirstByXPath("./following-sibling::tr/td[@class='subtext']/span[@class='score']"))
                                .asText().replace(" points", ""));
                HackerNewsItem hnItem = new HackerNewsItem(title, url, author, score, position, id);


                System.out.println(hnItem.toString());
            }
        }
    }
}

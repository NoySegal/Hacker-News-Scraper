/**
 * This class represents a post on Hacker News
 */
public class HackerNewsItem {
    private String _title;

    private String _url;
    private String _author;
    private int _score;
    private int _position;
    private int _id;

    /**
     * HackerNewsItem constructor.
     *
     * @param title holds the title of the post.
     * @param url holds the url of the post.
     * @param author holds the username of the poster.
     * @param score holds the score received for the post.
     * @param position holds the position of the post.
     * @param id holds the id of the post.
     */
    public HackerNewsItem (String title, String url, String author, int score, int position, int id) {
        super();
        _title = title;
        _url = url;
        _author = author;
        _score = score;
        _position = position;
        _id = id;
    }

    @Override
    public String toString() {
        return "HackerNewsItem{" +
                "_title='" + _title + '\'' +
                ", _url='" + _url + '\'' +
                ", _author='" + _author + '\'' +
                ", _score=" + _score +
                ", _position=" + _position +
                ", _id=" + _id +
                '}';
    }
}

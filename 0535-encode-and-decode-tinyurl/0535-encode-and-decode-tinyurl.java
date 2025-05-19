public class Codec {

    private static String origionalUrl;
    private static String tinyUrl;
    public String encode(String longUrl) {
        origionalUrl=longUrl;
        tinyUrl="http://tinyurl.com/4e9iAkl";
        return tinyUrl;
    }
    public String decode(String shortUrl) {
        return origionalUrl;
    }
}
package WebSite;

import java.net.URLConnection;
import java.util.Date;

public class Connection1 {
    private Date modificationTime;
    //private URL url;
    private String URL;
    private URLConnection connection;

    public Connection1(){
//        this.url = url;
//        this.URL = URL;
        this.connection = connection;
    }

    public void setTime(long time){
        modificationTime = new Date(time);
    }

    public Date getTime(){
        return modificationTime;
    }

    public URLConnection getConnection(){
        return connection;
    }

    public String getUrlAsString(){
        return URL;
    }

    public static boolean containsUrl(Connection1[] urlAddressStates, String url) {
        for (Connection1 u: urlAddressStates) {
            if(u.getUrlAsString().equals(url)) return true;
        }
        return false;
    }


    public String toString()
    {
        return "Url: " + URL + " last modified: " + modificationTime + "\n";
    }

    public Object getLatModificationTime() {
        return null;
    }
}

import Pattern.Observer;
import WebSite.Connection1;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class monitorTest {

    private Observer observer0;
    private Observer observer1;
    private Observer observer2;

    private String url1;
    private String url2;

    private URL url_1;
    private URL url_2;

    @Before
    public void setUP(){
        url1 = "http://www.pja.edu.pl/";
        url2 = "http://www.youtube.com";

        observer0 = new Observer(url1);
        observer1 = new Observer(url2);
        observer2 = new Observer(url2);

        try {
            url_1 = new URL(url1);
            url_2 = new URL(url2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void startTest(){

        URLConnection connection1 = mock(URLConnection.class);
        URLConnection connection2 = mock(URLConnection.class);

        Connection1 state1 = new Connection1();
        state1.setTime(111111L);
        Connection1 state2 = new Connection1();
        state2.setTime(System.currentTimeMillis());

        when(connection1.getLastModified()).thenReturn(1L);
        when(connection2.getLastModified()).thenReturn(System.currentTimeMillis());


    }
}
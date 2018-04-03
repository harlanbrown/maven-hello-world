package com.mycompany.app;
import org.nuxeo.client.NuxeoClient;
import org.nuxeo.client.objects.Documents;
import org.nuxeo.client.objects.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String url = "https://nightly.nuxeo.com/nuxeo";

        NuxeoClient nuxeoClient = new NuxeoClient.Builder().url(url).authentication("Administrator", "Administrator").connect();

        Document doc = nuxeoClient.operation("Repository.GetDocument").param("value", "/").execute();
        System.out.println(doc);

        nuxeoClient.disconnect();
    }
}

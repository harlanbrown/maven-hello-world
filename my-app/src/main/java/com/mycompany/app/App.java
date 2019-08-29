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
        String url = args[0];
        String username = args[1];
        String password = args[2];

        NuxeoClient nuxeoClient = new NuxeoClient.Builder().url(url).authentication(args[1], args[2]).connect();

        Document doc = nuxeoClient.operation("Repository.GetDocument").param("value", "/").execute();
        System.out.println(doc);

        nuxeoClient.disconnect();
    }
}

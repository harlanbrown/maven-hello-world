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
        System.out.println( "Hello World!" );

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("... but thankfully, Checker has our back: http://checkerframework.org");
        String url = "http://localhost:8080/nuxeo";
        NuxeoClient nuxeoClient = new NuxeoClient.Builder().url(url).authentication("Administrator", "Administrator").connect();
        Documents docs = nuxeoClient.operation("Repository.Query")
                                    .param("query", "SELECT * FROM Document")
                                    .execute();
        System.out.println(docs.toString());
    }
}

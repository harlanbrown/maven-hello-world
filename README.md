# A simple, minimal Maven/Nuxeo Java Client example

To run:

    cd my-app
    mvn compile
    java -cp target/classes com.mycompany.app.App

or...

    cd my-app
    mvn package
    java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App

# For Nuxeo Client
    args[0] : url in format `http://hostname:port/nuxeo` 
    args[1] : Nuxeo username
    args[2] : Nuxeo password
    
    Example: `java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App http://localhost:8080/nuxeo Administrator Administrator`



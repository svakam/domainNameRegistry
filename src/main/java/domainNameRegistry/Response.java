package domainNameRegistry;

public class Response {

    Response() {}

    // all response objects will print success/failure status of operation
    void printStatus(String status) {
        System.out.println("Operation: " + status);
    }

}

package domainNameRegistry;

public class Response implements PrintStatusInterface {

    Response() {}

    // all response objects will print success/failure status of operation
    // gets success/failure input from Business class depending on whether all methods were successfully run
    @Override
    public void printStatus(String status) {
        System.out.println("Operation: " + status);
    }

}

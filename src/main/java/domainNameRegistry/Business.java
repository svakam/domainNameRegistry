package domainNameRegistry;

// businesses using DNR must have customerID associated with them to check against hypothetical database
// once instantiated, businesses need to make a request to the server for DNR operations
public class Business implements RequestToServerInterface {
    // every business has customerID
    private String customerID;

    Business(String customerID) {
        this.customerID = customerID;
    }

    // getters and setters
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public Response registerDomain(String domainName, RegistrationPeriod rp) {
        return new ResponseNameExp(domainName, rp);
    }

    @Override
    public Response renewDomain(String domainName, RegistrationPeriod rp) {
        return new ResponseNameExp(domainName, rp);
    }

    @Override
    public Response getInfoDomain(String domainName) {
        // get domain name info and return its name and exp date

        return new ResponseNameExp(domainName);
    }

    @Override
    public Response deleteDomain(String domainName) {
        return new Response();
    }
}

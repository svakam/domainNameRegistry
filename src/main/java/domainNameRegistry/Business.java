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
    public Response registerDomain(String domainName, int length, String unit, String providerName, String contactID) {
        // assume hashmap that looks up provider based on input provider name and instantiates the correct subclass: example here is ProviderABC
        VerificationProvider provider = new ProviderABC(providerName, contactID);

        // validation method/format/output differ between providers
        if (provider instanceof ProviderABC || provider instanceof ProviderPQR) {
            // assume middleman function here that checks if validation goes through with contactID - if validated, get output and register the domain with business
        }
        return new ResponseNameExp(domainName, length, unit);
    }

    @Override
    public Response renewDomain(String domainName, int length, String unit) {
        // assume query database - if domain exists, extend expiration by specified length and unit

        return new ResponseNameExp(domainName, length, unit);
    }

    @Override
    public Response getInfoDomain(String domainName) {
        // assume check for domain in database
        // if exists, return domain's name and exp date to user

        return new ResponseNameExp(domainName);
    }

    @Override
    public Response deleteDomain(String domainName) {
        // assume check for domain in DB
        // if exists, delete domain registration

        return new Response();
    }


}

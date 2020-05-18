package domainNameRegistry;

// if a business is instantiated, it should be able to make these any of these requests to the server for DNR operations
public interface RequestToServerInterface {
    Response registerDomain(String domainName, int length, String unit, String providerName, String contactID);
    Response renewDomain(String domainName, int length, String unit);
    Response getInfoDomain(String domainName);
    Response deleteDomain(String domainName);
}

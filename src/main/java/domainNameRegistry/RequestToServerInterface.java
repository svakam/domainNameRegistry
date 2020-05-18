package domainNameRegistry;

// if a business is instantiated, it must make a request to the server for DNR operations
public interface RequestToServerInterface {
    Response registerDomain(String domainName, RegistrationPeriod rp);
    Response renewDomain(String domainName, RegistrationPeriod rp);
    Response getInfoDomain(String domainName);
    Response deleteDomain(String domainName);
}

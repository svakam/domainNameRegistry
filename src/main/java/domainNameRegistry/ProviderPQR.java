package domainNameRegistry;

public class ProviderPQR extends VerificationProvider implements Validation {

    ProviderPQR(String providerName, String contactID) {
        super(providerName);
        validate(contactID);
    }

    // different validation methods are run by different verification providers, represented by these subclasses that inherit from a superclass VerificationProvider
    @Override
    public void validate(String contactID) {
        System.out.println("Validation method by Provider PQR");
    }
}

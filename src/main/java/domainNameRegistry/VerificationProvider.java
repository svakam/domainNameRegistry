package domainNameRegistry;

// superclass verification provider doesn't contain a validation method of its own; validation only occurs within specific verification providers, hence this being abstract
public abstract class VerificationProvider {
    String verificationProviderName;

    VerificationProvider(String verificationProviderName) {
        this.verificationProviderName = verificationProviderName;
    }
}

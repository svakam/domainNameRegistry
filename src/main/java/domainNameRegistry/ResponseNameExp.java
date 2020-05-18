package domainNameRegistry;

// registration/renewal/info operations return this type of response object
class ResponseNameExp extends Response {
    String domainName;
    String expirationDate;

    ResponseNameExp(String domainName) {
        this.domainName = domainName;
    }

    ResponseNameExp(String domainName, RegistrationPeriod rp) {
        this.domainName = domainName;
        this.expirationDate = calculateExpirationDate(rp);
    }

    // get current date, add to provided unit and return expiration date
    String calculateExpirationDate(RegistrationPeriod rp) {
        short length = rp.getLength();
        return "hi";
    }

    // getters and setters
    public String getDomainName() {
        return domainName;
    }
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}

package domainNameRegistry;

import java.time.LocalDate;

// registration/renewal/info operations return this type of response object
class ResponseNameExp extends Response {
    String domainName;
    String expirationDate;

    ResponseNameExp(String domainName) {
        this.domainName = domainName;
    }

    ResponseNameExp(String domainName, int length, String unit) {
        this.domainName = validateDomain(domainName);
        this.expirationDate = calculateExpirationDate(length, unit);
    }

    // get current date, add to provided unit and return expiration date
    String calculateExpirationDate(int length, String unit) {
        LocalDate currentDate = LocalDate.now();
        int extendedYear = currentDate.getYear();
        if (unit.equals("year")) {
            extendedYear = extendedYear + length;
        }
        return LocalDate.of(extendedYear, currentDate.getMonth(), currentDate.getDayOfMonth()).toString();
    }

    // validate domain name
    String validateDomain(String domainName) {
        int i = 0;
        // assuming input domain also contains valid extension
        while (domainName.charAt(i) != '.') {
            i++;
        }
        if (i >= 9) {
            return domainName;
        } else {
            return "invalid domain name length";
        }
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

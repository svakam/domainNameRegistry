package domainNameRegistry;

// registration period object contains length and unit of registration time
public class RegistrationPeriod {
    short length;
    String unit;

    RegistrationPeriod(short length, String unit) {
        this.length = length;
        this.unit = unit;
    }

    // getters and setters
    public short getLength() {
        return length;
    }
    public void setLength(short length) {
        this.length = length;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
}

package domainNameRegistry;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testBusinessInstantiate() {
        Business b = new Business("abc123");
        assertEquals("abc123", b.getCustomerID());
    }

    @Test
    public void testDateTimeFormatter() {
        LocalDate date = LocalDate.now();
        assertEquals(2020, date.getYear());
        assertEquals(Month.MAY, date.getMonth());
        assertEquals(18, date.getDayOfMonth());
    }

    Business b;

    @Before
    public void setUp() {
        b = new Business("xyz789");
    }

    @Test
    public void testRenewDNR() {

    }
}

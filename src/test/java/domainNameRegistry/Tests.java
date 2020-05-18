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
    public void testLocalDate() {
        LocalDate date = LocalDate.now();
        assertEquals(2020, date.getYear());
        assertEquals(Month.MAY, date.getMonth());
        assertEquals(18, date.getDayOfMonth());
        assertEquals("2020-05-18", date.toString());
        LocalDate newDate = LocalDate.of(date.getYear() + 1, date.getMonth(), date.getDayOfMonth());
        assertEquals("2021-05-18", newDate.toString());
    }

    @Test
    public void testRegisterDomain() {
        Business newBusiness = new Business("business123");
        Response r = newBusiness.registerDomain("ilovedomains.donuts", 2, "year", "providerABC", "contactid789");

        // response types vary between invoked operation; delete operation response is N/A or "success/failure", other responses contain more information
        if (r instanceof ResponseNameExp) {
            System.out.println(((ResponseNameExp) r).getDomainName());
            System.out.println(((ResponseNameExp) r).getExpirationDate());
            r.printStatus("success"); // assume input came from Business
        }
    }

    @Test
    public void testRenewDomain() {

    }

    @Test
    public void testGetInfoDomain() {

    }

    @Test
    public void testDeleteDomain() {

    }
}

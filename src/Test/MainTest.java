package Test;

import Facility.*;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        Facility facility= new Facility();
        facility.setFacilityId("1");
        facility.setFacilityName("Loyola Hall");
        facility.setCapacity(100);
        facility.addFacilityDetail("This is a resident hall for students. The name of the facility is Loyola Hall.");

        //set up example customer for testing
        Customer customer=new Customer();
        customer.setCustomerId("Cust-1");
        customer.setName("Justin Wang");
        customer.setContactNumber("812-333-6666");
        customer.setAddress("1000 Escalon Ave, Sunnyvale, CA, 94085");
        customer.setSsn("123-45-6789");

        //assign the example facility to customer 1
        facility.setInUse(true);
        facility.setCustomername(customer.geName());

        FacilityManagement facilityManagement=new FacilityManagement();
        //added customer and customer 2 to be subscribers
        facilityManagement.Attach(customer);
        assertEquals(facility.getCustomername(),customer.geName());
    }
}
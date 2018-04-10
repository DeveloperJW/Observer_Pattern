import Facility.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("********** Application Context instantiated! **********");
        Facility facility= new Facility();
        facility.setFacilityId("1");
        facility.setFacilityName("Loyola Hall");
        facility.setCapacity(100);
        facility.addFacilityDetail("This is a resident hall for students. The name of the facility is Loyola Hall.");
        facility.setInUse(false);

        FacilityAddress facilityAddress = new FacilityAddress();
        facilityAddress.setAddressId("1");
        facilityAddress.setStreet("1234 W Loyola Hall");
        facilityAddress.setUnit("Unit 111");
        facilityAddress.setCity("Chicago");
        facilityAddress.setState("IL");
        facilityAddress.setZip("606026");

        facility.setFacilityAddress(facilityAddress);
        //call getFacilityInformation and check if information is added correctly.
        System.out.println(facility.getFacilityInformation());

        Customer customer=new Customer();
        customer.setCustomerId("Cust-1");
        customer.setName("Justin Wang");
        customer.setContactNumber("812-333-6666");
        customer.setAddress("1000 Escalon Ave, Sunnyvale, CA, 94085");
        customer.setSsn("123-45-6789");

    }
}

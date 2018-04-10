import Facility.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("********** Application Context instantiated! **********");
        //set up a Facility for testing
        Facility facility= new Facility();
        facility.setFacilityId("1");
        facility.setFacilityName("Loyola Hall");
        facility.setCapacity(100);
        facility.addFacilityDetail("This is a resident hall for students. The name of the facility is Loyola Hall.");
//        facility.setInUse(false);
        //set up a Facility Address for testing
        FacilityAddress facilityAddress = new FacilityAddress();
        facilityAddress.setAddressId("1");
        facilityAddress.setStreet("1234 W Loyola Hall");
        facilityAddress.setUnit("Unit 111");
        facilityAddress.setCity("Chicago");
        facilityAddress.setState("IL");
        facilityAddress.setZip("606026");
        //added the facility address defined to Facility
        facility.setFacilityAddress(facilityAddress);
        //call getFacilityInformation and check if information is added correctly.
        //System.out.println(facility.getFacilityInformation());

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

        //set up 2nd example customer for testing
        Customer customer2=new Customer();
        customer2.setCustomerId("Cust-2");
        customer2.setName("Zhen Hou");
        customer2.setContactNumber("812-666-9999");
        customer2.setAddress("2000 Chicago Ave, Chicago, IL, 60610");
        customer2.setSsn("222-11-33333");

        FacilityManagement facilityManagement=new FacilityManagement();
        facilityManagement.Attach(customer);
        facilityManagement.Attach(customer2);

        facilityManagement.addFacility(facility);


    }
}

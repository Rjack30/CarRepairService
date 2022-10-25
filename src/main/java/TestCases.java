import model.Customer;
import org.testng.annotations.Test;

public class TestCases {

    @Test

    void setup(){
        expectedCustomerList.add(new Customer(1, "Bob", "Hanks", null, "747-100-1000", "bob@email.com"));
        expectedCustomerList.add(new Customer(1, "Robert", "Will", null, "475-100-1000", "robb@email.com"));
        expectedCustomerList.add(new Customer(1, "Mary", "Poppins", null, "999-100-1000", "mary@email.com"));

    }
@Test
    void testReadJSON(){
     List<Customer> customerList = jsonMapper.readJSON(customerJSONPath, Customer.class );
     Assert.assertEquals(customerList, expectedCustomerList);
      System.out.println("I am inside testSteps");
    }
@Test
    void tearDown(){
     System.out.println("I am inside tearDown ");
}

}

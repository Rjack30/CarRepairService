
public class MainTest {
    static Logger log = LogManager.getLogger(MainTest.class.getName());

    @Test
    public void testTestCustomerGroupPositive() {
        log.info("MainTest 1");
        Assert.assertTrue((new Main().testUserGroup() instanceof UserGroup)
                , "An instance of CustomerGroup.class expected");
    }

    @Test
    public void testTestCustomerGroupContains() {
        log.info("MainTest 2");
        Assert.assertTrue(new Main().testCustomerGroup().getName().contains("tester3"), " Contains 'tester3'");
    }

    @Test
    public void testTestCustomerPositive() {
        log.info("MainTest 3");
        Assert.assertTrue((new Main().testCustomer() instanceof User), "An instance of Customer.class expected");
    }

    @Test
    public void testTestCustomerContains() {
        log.info("MainTest 4");
        Assert.assertTrue(new Main().testCustomer().getUsername().contains("test"), "It should contain 'test'");
    }

    @Test
    public void testTestCustomer4Null() {
        log.info("MainTest 5");
        Assert.assertNotNull((new Main().testCustomer4() instanceof User), "Not nullable Customer.class object is expected");
    }

    @Test
    public void testTestCustomer() {
        log.info("MainTest 6");
        Assert.assertNotSame(new Main().testCustomer4(), new Main().testCustomer(), "Not the same is expected");
    }
}

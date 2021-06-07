import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UsernameNotNullTest {

    @Test
    public void TestName(){
        //tests if customer name is not null
        Customer testCustomer = new Customer();

        testCustomer.setName("Test Name");
        assertNotNull(testCustomer.getName());
    }
}

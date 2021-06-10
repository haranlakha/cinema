import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NameNotEmptyTest {

    Customer testCustomer = new Customer();

    @BeforeEach
    public void setup(){
        //set test name
        testCustomer.setName("Test name");
    }
    @Test
    public void testNameNotEmpty(){
        //tests if customer has entered a user name (length not 0)
        assertTrue(testCustomer.getName().length() != 0);
    }
}

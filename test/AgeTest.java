import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AgeTest {

    @Test
    public void testAge(){

    Customer testCustomer = new Customer();
    Film testFilm = new Film("Title", 10.00, 18, "18");

    testCustomer.setAge(18);

        if(testCustomer.checkAge(testCustomer.getAge(), testFilm.certification)){
            assertTrue(true);
        }else{
            fail();
        }
    }
}
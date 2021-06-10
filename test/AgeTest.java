import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AgeTest {

    Customer testCustomer = new Customer();
    Film testFilm = new Film("Title", 10.00, 18, "18", 100);

    @BeforeEach
    public void setup(){

        testCustomer.setAge(18);
    }
    @Test
    public void testAge(){

        if(testCustomer.checkAge(testCustomer.getAge(), testFilm.getCertification())){
            assertTrue(true);
        }else{
            fail();
        }
    }
}
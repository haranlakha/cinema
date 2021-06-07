import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FilmListTest {

    ArrayList<Film> list = new ArrayList<>();

    Film testFilm1 = new Film("Title 1", 10.00, 18, "18", 100);
    Film testFilm2 = new Film("Title 2", 12.00, 12, "12", 100);
    Film testFilm3 = new Film("Title 3", 8.00, 15, "15", 100);

    @BeforeEach
    public void add() {
        list.add(testFilm1);
        list.add(testFilm2);
        list.add(testFilm3);
    }

    @Test
    public void testListSize(){
        //checks if list size is 3
        assertEquals(3, list.size());
    }

    @Test
    public void testListAdd(){
        //add new element to list and check against expected
        Film testFilm4 = new Film("Title 4", 10.00, 12, "12", 100);
        list.add(testFilm4);

        assertEquals(4, list.size());
    }

    @Test
    public void testListRemove(){
        //removes a film and checks against new size
        list.remove(testFilm2);
        assertEquals(2, list.size());
    }

    @AfterEach
    public void removeAllElements(){
        //clears list
        list.clear();
    }


}

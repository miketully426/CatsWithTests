import launchcode.Cat;
import launchcode.CatMenu;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CatMenuTests {

    private Cat cat;
    private CatMenu catMenu;

    @Before
    public void setUp(){
        cat = new Cat("Test cat", "Red", "Ugly Cat");
        catMenu = new CatMenu(cat);
    }

    @Test
    public void canCelebrateCatBirthDay(){
        catMenu.doBirthday();

        assertThat(cat.getAge(), is(1));
    }

    @Test
    public void canRenameExistingCat(){
        String simulatedInput = "Jon Snow" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        catMenu.renameCat();
        assertThat(cat.getName(), is("Jon Snow"));
    }
}

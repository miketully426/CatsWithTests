import launchcode.Cat;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CatTests {
    private Cat testCat;

    @Before
    public void setUp() {
        testCat = new Cat("Test", "Blue", "Hairy");
    }
    @Test
    public void pettingCatMakesItHappy(){
        testCat.petCat();
        assertThat(testCat.isHappy(), is(true));
    }

    @Test
    public void feedingCatMakesItHappyAndNotHungry(){
        testCat.feedCat();
        assertThat(testCat.isHappy(), is(true));
        assertThat(testCat.isHungry(), is(false));
    }

    @Test
    public void meowMakesCatMeow() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testCat.meow();

        assertThat("Meow!\r\n", is(outputStream.toString()));
    }
}

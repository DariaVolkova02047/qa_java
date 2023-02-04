package example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class LionCreationTest {
    private final String sex;
    private final Feline feline;
    private final Boolean expected;
    private Lion lion;

    public LionCreationTest(String sex, Feline feline, Boolean expected) {
        this.sex = sex;
        this.feline = feline;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getConstructorParams() {
        return new Object[][]{
                {"Самец", new Feline(), true},
                {"Самка", new Feline(), false}
        };
    }

    @Before
    public void init() throws Exception {
        lion = new Lion(sex, feline);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Assert.assertEquals(lion.doesHaveMane(), expected);
    }

    @Test
    public void testIsHasMane() throws Exception {
        Assert.assertEquals(lion.isHasMane(), expected);
    }

    @Test
    public void testGetKittens() throws Exception {
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testGetKittensWithParams() {
        Assert.assertEquals(3, lion.getFeline().getKittens(3));
    }
}

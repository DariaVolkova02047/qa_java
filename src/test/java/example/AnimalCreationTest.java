package example;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalCreationTest {
    private final String type;
    private final List<String> expected;
    Animal animal;

    public AnimalCreationTest(String type, List<String> expected) {
        this.type = type;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getConstructorParams() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }
    @Before
    public void init() {
        animal = new Animal();
    }

    @Test
    public void testGetFood() throws Exception {
        Assert.assertEquals(animal.getFood(type), expected);
    }
    @Test
    public void testGetFamily() {
        Assert.assertEquals(animal.getFamily(), "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }
    @Test
    public void testGetFoodConditionOther() throws Exception {
        Animal animal = new Animal();
            String invalidKindOfAnimal = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            Exception actualException = null;
        try {
            animal.getFood(invalidKindOfAnimal);
        } catch (Exception e) {
            actualException = e;
        }
        Assert.assertNotNull(actualException);
        }
    }


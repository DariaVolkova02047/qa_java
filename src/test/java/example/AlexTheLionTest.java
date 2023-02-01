package example;

import com.example.AlexTheLion;
import com.example.Feline;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {
    Feline felineTest;
    AlexTheLion alexTheLionTest;

    @Mock
    AlexTheLion alexTheLion;

    @Mock
    Feline feline;

    @Before
    public void init() throws Exception {
        felineTest = new Feline();
        alexTheLionTest = new AlexTheLion(felineTest);
    }

    @Test
    public void testGetKittensCall() {
        alexTheLion.getKittens();
        Mockito.verify(alexTheLion).getKittens();
    }

    @Test
    public void testGetFriendsCall() {
        alexTheLion.getFriends();
        Mockito.verify(alexTheLion).getFriends();
    }

    @Test
    public void getPlaceOfLivingCall() {
        alexTheLion.getPlaceOfLiving();
        Mockito.verify(alexTheLion).getPlaceOfLiving();
    }

    @Test
    public void testGetFriends() {
        Assert.assertEquals(alexTheLionTest.getFriends(), List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"));
    }

    @Test
    public void testPlaceOfLiving() {
        Assert.assertEquals(alexTheLionTest.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals(alexTheLionTest.getKittens(), 0);
    }

    @Test
    public void testIsHasMane() {
        alexTheLion.isHasMane();
        Mockito.verify(alexTheLion).isHasMane();
    }
}
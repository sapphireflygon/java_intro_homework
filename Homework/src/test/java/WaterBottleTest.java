import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle testBottle;

    @Before
    public void before(){
        testBottle = new WaterBottle(100);
    }

    @Test // test volume of water bottle
    public void waterBottleVolumeIs100(){
        int result = testBottle.getVolume();
        assertEquals(100, result);
    }
    @Test // test the removal of water in increments of 10
    public void emptyWaterBottleBy10(){
        testBottle.drink10();
        assertEquals(90, testBottle.getVolume());
    }
    @Test
    public void removeWaterUntilHalfFull(){
        testBottle.drink10();
        testBottle.drink10();
        testBottle.drink10();
        testBottle.drink10();
        testBottle.drink10();
        assertEquals(50, testBottle.getVolume());
    }

    @Test // empty bottle from full
    public void isBottleEmptied(){
        int startVolume = testBottle.getVolume();
        assertEquals(100, startVolume);
        testBottle.empty();
        assertEquals(0, testBottle.getVolume());
    }

    @Test // fill bottle back to 100
    public void isBottleFilled(){
        testBottle.drink10();
        testBottle.drink10();
        testBottle.drink10();
        assertEquals(70, testBottle.getVolume());
        testBottle.fillUp();
        assertEquals(100, testBottle.getVolume());
    }
}

import Accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDrumStick {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick(30.0, 1.3, true, 10);
    }

    @Test
    public void canGetAmountOfWorkPutInTo(){
        assertEquals(1.3, drumStick.getAmountOfWorkPutIntoInScore3());
    }

    @Test
    public void cangetConditionGood(){
        assertEquals(true, drumStick.getConditionGood());
    }

    @Test
    public void cangetPrice(){
        assertEquals(39.0, drumStick.price());
    }

    @Test
    public void canSell(){
        assertEquals(49.0, drumStick.sell());
    }

    @Test
    public void bought(){
        assertEquals(30.0, drumStick.bought());
    }

    @Test
    public void canItemBeSellableOrBuyable(){
        assertEquals(true, drumStick.itemSellableOrBuyable());
    }

    @Test
    public void canGetAdditionCost(){
        assertEquals(10, drumStick.getAdditionalCost());
    }


}

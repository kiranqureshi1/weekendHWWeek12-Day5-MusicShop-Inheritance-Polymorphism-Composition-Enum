import Accessories.DrumStick;
import Accessories.GuitarString;
import Instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestGuitarString {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString(30, 1.3,true,10);
    }

    @Test
    public void canGetAmountOfWorkPutInTo(){
        assertEquals(1.3, guitarString.getAmountOfWorkPutIntoInScore3());
    }

    @Test
    public void cangetConditionGood(){
        assertEquals(true, guitarString.getConditionGood());
    }

    @Test
    public void cangetPrice(){
        assertEquals(39.0, guitarString.price());
    }

    @Test
    public void canSell(){
        assertEquals(49.0, guitarString.sell());
    }

    @Test
    public void bought(){
        assertEquals(30.0, guitarString.bought());
    }

    @Test
    public void canItemBeSellableOrBuyable(){
        assertEquals(true, guitarString.itemSellableOrBuyable());
    }

    @Test
    public void canGetAdditionCost(){
        assertEquals(10, guitarString.getAddShine());
    }
}

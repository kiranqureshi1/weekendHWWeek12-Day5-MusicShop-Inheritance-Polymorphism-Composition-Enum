import Instrument.Item;
import Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPiano {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black", Item.Piano, "brass", 30, 1.3, true, 2, 5);
    }

    @Test
    public void canGetColor(){
        assertEquals("Black", piano.getcolor());
    }

    @Test
    public void canGetType(){
        assertEquals(Item.Piano, piano.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", piano.getMaterial());
    }

    @Test
    public void canGetAmountOfWorkPutInto(){
        assertEquals(1.3, piano.getAmountOfWorkPutInto());
    }

    @Test
    public void canGetMaterialPrice(){
        assertEquals(30.0, piano.getMaterialPrice());
    }

    @Test
    public void canGetConditionGood(){
        assertEquals(true, piano.getConditionGood());
    }

    @Test
    public void getPlay(){
        assertEquals("I love piano", piano.play("piano"));
    }

    @Test
    public void canGetAmountofPaintUsedToPaint(){
        assertEquals(2, piano.getAmountofPaintUsedToPaint(), 0.01);
    }

    @Test
    public void canGetPricePaintPerLiter(){
        assertEquals(5, piano.getPricePaintPerLiter(), 0.01);
    }

    @Test
    public void canSell(){
        assertEquals(49.0, piano.sell());
    }

    @Test
    public void ItemSellableOrBuable(){
        assertEquals(true, piano.itemSellableOrBuyable());
    }



}

import Instrument.Guitar;
import Instrument.Item;
import Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestGuitar {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Golden", Item.Guitar, "brass", 30, 1.3, true, 2, 2, 5);
    }

    @Test
    public void canGetColor(){
        assertEquals("Golden", guitar.getcolor());
    }

    @Test
    public void canGetType(){
        assertEquals(Item.Guitar, guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", guitar.getMaterial());
    }

    @Test
    public void canGetAmountOfWorkPutInto(){
        assertEquals(1.3, guitar.getAmountOfWorkPutInto());
    }

    @Test
    public void canGetMaterialPrice(){
        assertEquals(30.0, guitar.getMaterialPrice());
    }

    @Test
    public void canGetConditionGood(){
        assertEquals(true, guitar.getConditionGood());
    }

    @Test
    public void getPlay(){
        assertEquals("I love piano", guitar.play("piano"));
    }

}

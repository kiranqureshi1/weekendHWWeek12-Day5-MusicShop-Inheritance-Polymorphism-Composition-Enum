import Accessories.DrumStick;
import Accessories.GuitarString;
import Core.ISell;
import Core.Shop;
import Instrument.Guitar;
import Instrument.Item;
import Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestShop {

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    Guitar guitar3;
    Piano piano1;
    Piano piano2;
    DrumStick drumStick;
    GuitarString guitarString1;
    GuitarString guitarString2;


    @Before
    public void before(){
        guitar1 = new Guitar("Golden", Item.Guitar, "brass", 30, 1.3, true, 2, 2, 5);
        guitar2 = new Guitar("Grey", Item.Guitar, "brass", 30, 1.3, true, 2, 2, 5);
        guitar3 = new Guitar("Purple", Item.Guitar, "brass", 30, 1.3, true, 2, 2, 5);
        piano1 = new Piano("Black", Item.Piano, "brass", 30, 1.3, true, 2, 5);
        piano2 = new Piano("White", Item.Piano, "brass", 30, 1.3, true, 2, 5);
        drumStick = new DrumStick(30.0, 1.3, true, 10);
        guitarString1 = new GuitarString(30, 1.3,true,10);
        guitarString1 = new GuitarString(40, 1.3,true,10);
        ArrayList<ISell> items = new ArrayList<>();
        items.add(guitar1);
        items.add(guitar2);
        items.add(piano1);
        items.add(drumStick);
        items.add(guitarString1);
        shop = new Shop(items, 1000);
    }

    @Test
    public void canGetArrayCount(){
        assertEquals(5, shop.getItemsCount() );
    }

    @Test
    public void canaddItem(){
        shop.addItems(guitar3);
        assertEquals(6, shop.getItemsCount());
    }

    @Test
    public void canRemoveItem(){
        shop.removeItem(drumStick);
        assertEquals(4, shop.getItemsCount());
    }

    @Test
    public void canGetDecreasedBudget(){
        shop.getDecreasedBudget(10.0);
        assertEquals(90.0, shop.getBudget());
    }

    @Test
    public void canSell(){
        shop.sell(guitarString1);
        assertEquals(1049.0, shop.getBudget());
        assertEquals(4, shop.getItemsCount());
    }

    @Test
    public void canBeBought(){
        shop.bought(guitarString2);
        assertEquals(960.0, shop.getBudget());
        assertEquals(6, shop.getItemsCount());
    }
}

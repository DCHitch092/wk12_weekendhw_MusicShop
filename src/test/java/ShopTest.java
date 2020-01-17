import behaviours.ISell;
import instruments.InstrumentType;
import instruments.MoogSynth;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell moog;

    @Before
    public void before(){
        shop = new Shop("BeatHoven's");
        moog = new MoogSynth ("Jet Black", InstrumentType.KEYBOARD, 49, 250, 350);
    }
    
    @Test
    public void hasName(){
        assertEquals("BeatHoven's", shop.getName());
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void addStock(){
        shop.addStock(moog);
        assertEquals(1, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(moog));
    }
}

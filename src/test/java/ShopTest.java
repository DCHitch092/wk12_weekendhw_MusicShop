import behaviours.ISell;
import instruments.AcousticGuitar;
import instruments.InstrumentType;
import instruments.MoogSynth;
import org.junit.Before;
import org.junit.Test;
import shop.SheetMusic;
import shop.Shop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    Shop shop;
    ISell moog;
    ISell guitar;
    ISell sheetMusic;

    @Before
    public void before(){
        shop = new Shop("BeatHoven's");
        moog = new MoogSynth ("Jet Black", InstrumentType.KEYBOARD, 49, 250, 350);
        guitar = new AcousticGuitar("oak brown", InstrumentType.STRING, 6, 100, 200);
        sheetMusic = new SheetMusic(1,10, "Mozart's last pop album, written on paper to play");
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
    public void canAddStock(){
        shop.addStock(moog);
        assertEquals(1, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(moog));
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(moog);
        shop.addStock(guitar);
        shop.removeStock(moog);
        assertEquals(1, shop.getStock().size());
        assertFalse(shop.getStock().contains(moog));
    }

    @Test
    public void canReturnPotentialProfit(){
        shop.addStock(moog);
        shop.addStock(guitar);
        shop.addStock(sheetMusic);
        assertEquals(209, shop.calculateStockTotalProfit(), 0.01);
    }
}

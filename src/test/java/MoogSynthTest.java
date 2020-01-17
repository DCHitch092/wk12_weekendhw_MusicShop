import instruments.MoogSynth;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoogSynthTest {

    MoogSynth moog;
    @Before
    public void before(){
        moog = new MoogSynth ("Jet Black", InstrumentType.KEYBOARD, 49, 250, 350);
    }

    @Test
    public void hasColour(){
        assertEquals("Jet Black", moog.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, moog.getInstrumentType());
    }

    @Test
    public void hasKeyNumber(){
        assertEquals(49, moog.getKeyNumber());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(250, moog.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(350, moog.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, moog.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlayAcoustic(){
        assertEquals("*click*", moog.play());
    }

    @Test
    public void hasPluggedIn(){
        assertEquals(false,moog.getPluggedInStatus());
    }

    @Test
    public void canPlayPluggedIn(){
        moog.plug();
        assertEquals("bowowowowow", moog.play());
    }

    @Test
    public void canBeUnplugged(){
        moog.plug();
        moog.unplug();
        assertEquals(false, moog.getPluggedInStatus());
    }

}

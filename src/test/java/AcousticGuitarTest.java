
import instruments.AcousticGuitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;
    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("oak brown",
                InstrumentType.STRING, 6, 100, 200);
    }

    @Test
    public void hasColour(){
        assertEquals("oak brown", acousticGuitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, acousticGuitar.getInstrumentType());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, acousticGuitar.getStrings());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100, acousticGuitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200, acousticGuitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, acousticGuitar.calculateMarkup(), 0.01 );
    }

    @Test
    public void canPlay(){
        assertEquals("dling!", acousticGuitar.play());
    }

    @Test
    public void canGetDescription() {
        assertEquals("a beautiful oak brown acoustic guitar", acousticGuitar.getDescription());
    }

}

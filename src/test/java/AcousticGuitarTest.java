
import instruments.AcousticGuitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;
    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("oak brown", InstrumentType.STRING, 6);
    }

    @Test
    public void hasColour(){
        assertEquals("oak brown", acousticGuitar.getColour());
    }
}

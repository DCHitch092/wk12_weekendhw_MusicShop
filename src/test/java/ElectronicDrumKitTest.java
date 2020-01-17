import instruments.ElectronicDrumKit;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectronicDrumKitTest {

    ElectronicDrumKit electronicDrumKit;
    @Before
    public void before(){
        electronicDrumKit = new ElectronicDrumKit ("Neon Orange", InstrumentType.PERCUSSION, 5, 150, 200);
    }

    @Test
    public void hasColour(){
        assertEquals("Neon Orange", electronicDrumKit.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION,electronicDrumKit.getInstrumentType());
    }

    @Test
    public void hasPadNumbers(){
        assertEquals(5, electronicDrumKit.getPadNumbers());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(150, electronicDrumKit.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(150, electronicDrumKit.getSellingPrice());
    }

}

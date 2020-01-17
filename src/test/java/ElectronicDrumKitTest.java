import instruments.ElectronicDrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectronicDrumKitTest {

    ElectronicDrumKit electronicDrumKit;
    @Before
    public void before(){
        electronicDrumKit = new ElectronicDrumKit ();
    }

    @Test
    public void hasColour(){
        assertEquals("Neon Orange", electronicDrumKit.getColour());
    }

}

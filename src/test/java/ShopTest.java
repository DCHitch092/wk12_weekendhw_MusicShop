import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("BeatHoven's");
    }
    
    @Test
    public void hasName(){
        assertEquals("BeatHoven's", shop.getName());
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStock().size());
    }

}

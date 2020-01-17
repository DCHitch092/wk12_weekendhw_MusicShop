import org.junit.Before;
import org.junit.Test;
import shop.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(1,10, "Mozart's first requiem, now in guitar tab form");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10, sheetMusic.getSellingPrice(),0.01);
    }

    @Test
    public void hasDescription(){
        assertEquals("Mozart's first requiem, now in guitar tab form", sheetMusic.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(9, sheetMusic.calculateMarkup(), 0.01);
    }
}

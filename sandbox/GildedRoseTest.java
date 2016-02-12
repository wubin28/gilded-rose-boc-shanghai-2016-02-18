import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("fixme", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    public void normal_item_quality_should_decrease_by_1_if_sellin_greater_than_0() {
        Item[] items = new Item[] { new Item("Normal item", 8, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Normal item", app.items[0].name);
        assertEquals(7, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }

}
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {


    @Test
    public void normal_item_quality_should_decrease_by_1_if_sellin_greater_than_0() {
        Item[] items = new Item[] { new Item("Normal item", 8, 10) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("Normal item", app.items[0].name);
        assertEquals(7, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }

    @Test
    public void normal_item_quality_should_decrease_by_2_if_sellin_no_more_than_0() {
        Item[] items = new Item[] { new Item("Normal item", 0, 10) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("Normal item", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }


    @Test
    public void Aged_Brie_quality_should_increase_by_1_if_sellin_greater_than_0() {
        Item[] items = new Item[] { new Item("Aged Brie", 8, 10) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(7, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
    }
    @Test
    public void Aged_Brie_quality_should_increase_by_2_if_sellin_no_more_than_0() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }

    @Test
    public void Sulfuras_quality_should_always_80_when_sellin_greater_than_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 80) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }






}
public class StrategyAgedBrie implements StrategyItem{

    public void handle(Item item){
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;
    
        if (item.sellIn < 0) {
           
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }                   
        }
    }
}

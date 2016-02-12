public class StrategyNormalItem implements StrategyItem{

    public void handle(Item item){
        calculateQualityBeforeDecreasingSellIn();
        decreaseSellIn();
        calculateQualityAfterDecreasingSellIn();

        if (item.quality > 0) {                    
            item.quality -= 1;
        }
     
        item.sellIn -= 1;            

        if (item.sellIn < 0) {
     
            if (item.quality > 0) {  
                item.quality -= 1;                           
            }
        }
    }

    protected void calculateQualityBeforeDecreasingSellIn() {
    }

    protected void decreaseSellIn() {
    }
}
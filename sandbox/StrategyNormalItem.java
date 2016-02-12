public class StrategyNormalItem implements StrategyItem{

    public void handle(Item item){
        calculateQualityBeforeDecreasingSellIn();
        decreaseSellIn();
        calculateQualityAfterDecreasingSellIn();
    }

    protected void calculateQualityBeforeDecreasingSellIn() {
        if (item.quality > 0) {                    
            item.quality -= 1;
        }
    }

    protected void decreaseSellIn() {
        item.sellIn -= 1;            
    }

    protected void calculateQualityAfterDecreasingSellIn() {
        if (item.sellIn < 0) {
     
            if (item.quality > 0) {  
                item.quality -= 1;                           
            }
        }
    }
}
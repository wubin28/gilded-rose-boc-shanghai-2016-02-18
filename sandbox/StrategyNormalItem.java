public class StrategyNormalItem implements StrategyItem{

    public void handle(Item item){
        if(item.name.equals("Aged Brie")){
            return;
        }
    }
}

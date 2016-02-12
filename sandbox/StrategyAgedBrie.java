public class StrategyAgedBrie implements ItemStrategy{

    public void handle(Item item){
        if(item.name.equals("Aged Brie")){
            return;
        }
    }
}

public class StrategySulfuras implements StrategyItem{

    public void handle(Item item){
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            return;
        }
    }
}
public class StrategySulfuras implements ItemStrategy{

    public void handle(Item item){
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            return;
        }
    }
}
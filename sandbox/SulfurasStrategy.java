public class SulfurasStrategy implements ItemStrategy{

    public void handle(Item item){
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            return;
        }
    }
}
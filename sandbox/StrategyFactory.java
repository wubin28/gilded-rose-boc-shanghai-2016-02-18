public class StrategyFactory{
    public static ItemStrategy create(String itemName){
       if(itemName.equals("Sulfuras, Hand of Ragnaros"))
           return new SulfurasStrategy();
    }
}
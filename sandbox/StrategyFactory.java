public class StrategyFactory{
    public static ItemStrategy create(String itemName){
       if(itemName.equals("Sulfuras, Hand of Ragnaros")){
           return new SulfurasStrategy();  
        }

        if(itemName.equals("Aged Brie")){
           return new AgedBrieStrategy();  
        }

        if(itemName.equals("Backstage passes to a TAFKAL80ETC concert")){
           return new BackstageStrategy();  
        }
        
        return new NormalItemStrategy();  
        
    }
}
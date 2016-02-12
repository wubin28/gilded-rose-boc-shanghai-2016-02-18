public class StrategyFactory{
    public static ItemStrategy create(String itemName){
        return new SulfurasStrategy();
    }
}
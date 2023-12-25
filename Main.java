public class Main {

    public static void main(String[] args) {
        Human human1= new Human("Петров");
        Human human2= new Human("Сидоров");

        Market market = new Market();

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.takeInQueue(human1);
        market.update();
      
    }
}
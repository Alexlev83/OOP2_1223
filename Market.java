import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior{

    List<Klients> klientsList = new ArrayList<>();

    @Override
    public void acceptToMarket(Klients klients) {
        // TODO Auto-generated method stub
        System.out.println(klients.getName() + "Покупатель в магазине");
    }

    @Override
    public void releaseFromMarket(List<Klients> klients2) {
        // TODO Auto-generated method stub
        for (Klients klients : klients2) {
             System.out.println(klients.getName() + "вышел из магазина");
             klientsList.remove(klients);
        }
             
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
       takeOrder();
       giveOrder(); 
       releaseFromQueue();
    }

    @Override
    public void takeInQueue(Klients klients) {
        // TODO Auto-generated method stub
       System.out.println(klients.getName() + "Покупатель в очереди");
       klientsList.add(klients);
    }

    @Override
    public void takeOrder() {
        // TODO Auto-generated method stub
       for (Klients klients : klientsList) {
        if (!klients.isMakeOrder()) {
           System.out.println(klients.getName() + "клиент сделал заказ");
           klients.setMakeOrder(true);
        }
       } 
    }

    @Override
    public void giveOrder() {
        // TODO Auto-generated method stub
        for (Klients klients : klientsList) {
          if (!klients.isTakeOrder() && klients.isMakeOrder) {
            System.out.println(klients.getName() + "получил заказ");
                klients.setTakeOrder(true);
          }
           
         }
    }

    @Override
    public void releaseFromQueue() {
        // TODO Auto-generated method stub
        List<Klients> releaseFromQueue = new ArrayList<>();
        for (Klients klients : klientsList) 
             if (klients.isTakeOrder) {
                System.out.println(klients.getName() + "вышел из магазина");
                 releaseFromQueue.add(klients);
          releaseFromMarket(releaseFromQueue);    
        }
        
    }
}

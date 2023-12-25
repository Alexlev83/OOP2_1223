public class Human extends Klients{
     
    public Human(String name) {
        super(name);
    }

     @Override
    String getName(){
        return null;
    }

    @Override
    public void setMakeOrder(boolean make) {
        // TODO Auto-generated method stub
         isMakeOrder = make;
    }

    @Override
    public void setTakeOrder(boolean take) {
        // TODO Auto-generated method stub
        isTakeOrder = take;
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        return isTakeOrder;
    }
}


public abstract class Klients implements  KlientsBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public Klients(String name) {
        this.name = name;
        isTakeOrder = false;
        isMakeOrder = false;
    }
    abstract String getName();
}

    

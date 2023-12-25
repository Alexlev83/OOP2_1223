import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Klients klients);
    void releaseFromMarket(List<Klients>klients);
    void update();
    
}

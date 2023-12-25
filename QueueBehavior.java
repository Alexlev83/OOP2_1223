public interface QueueBehavior {
  void takeInQueue(Klients klients);
  void takeOrder();
  void giveOrder();
  void releaseFromQueue();
    
}

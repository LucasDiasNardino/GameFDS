package Interface;

public class Observable {
    public interface observable{
        public void registerObserver(Observer observer);
        public void removeObserver(Observer observer);
        public void notifyObservers();  
    }
}

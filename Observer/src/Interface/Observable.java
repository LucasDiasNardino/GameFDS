package Interface;

public class Observable {
    public interface obervable{
        public void registerObserver(Observerr observer);
        public void removeObserver(Observerr observer);
        public void notifyObservers();  
    }
}

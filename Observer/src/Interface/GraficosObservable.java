package Interface;

import java.util.ArrayList;
import java.util.List;

import Interface.Observable.observable;
import Interface.Observer;

public class GraficosObservable implements observable{
    private List<Observer> observers = new ArrayList();
    private double xgrafico;
    private double ygrafico;
    
    public GraficosObservable(double xgrafico, double ygrafico) {
        this.xgrafico = xgrafico;
        this.ygrafico = ygrafico;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated m  // Chama o método de atualização de todos os observers disponíveis.
            for (Observer ob : observers ) {
                System.out.println("Notificando observers!");
                  ob.update(ob);
                }
        
    }
    
}

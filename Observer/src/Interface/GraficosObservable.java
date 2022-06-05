package Interface;

import java.util.*;


public class GraficosObservable implements Observable{
    private List<Observer> observers = new ArrayList();
    private double xgrafico;
    private double ygrafico;
    
    public GraficosObservable(double xgrafico, double ygrafico) {
        this.xgrafico = xgrafico;
        this.ygrafico = ygrafico;
        
    }

    @Override
    public void update(Observer ob) {
        // TODO Auto-generated method stub
        
    }    
}

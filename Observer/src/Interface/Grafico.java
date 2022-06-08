package Interface;

public class Grafico implements EventListener {

    private String x;
    private String y;
    
    

    public Grafico(String x, String y) {
        this.x  = x;
        this.y = y;
    }



    @Override
    public void update(String eventType) {
        
        System.out.println("MUDOU X: " + x + " Y" + y + " " + eventType);
        
    }
    
}

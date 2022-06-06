import java.util.List;

import Interface.EventListener;

public class Mercado {
    

    private List<EventListener> observadores;


    
    public void subscribe(EventListener listener) {
        
        observadores.add(listener);
    }
    

    
    public void notify(String mensagem) {
        for (EventListener listener : observadores) {
            listener.update(mensagem);
        }
    }

    public void atualizaBlaBla() {
        // logica de negocio
        ///  if ...
        this.notify("Alteracao nas taxas de juros ao consumidor");
    }
    
}
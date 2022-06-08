import Interface.*;

public class App {
    public static void main(String[] args) {

        EventListener evento = new Grafico("10", "20");
        EventListener evento2 = new TabDin("23", "30");
        Mercado mercado = new Mercado();
        mercado.subscribe(evento);
        mercado.subscribe(evento2);
        mercado.atualizataxa();
    }
}

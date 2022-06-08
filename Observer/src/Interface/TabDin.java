package Interface;

public class TabDin implements EventListener{

    private String linha;
    private String coluna;

    
    public TabDin(String linha, String coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }


    @Override
    public void update(String eventType) {
        System.out.println("MUDOU Linha: " + linha + " Coluna" + coluna + " " + eventType);
    }
    
}

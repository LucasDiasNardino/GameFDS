package pucrs;

public class App{

    public static void main (String args[]){
        
        Conta contaAdvanced = new Conta.Builder()
                    .numero(12L)
                    .nomeCorrentista("Beto")
                    .categoriaInicial(Categoria.ADVANCED).build();

        Conta contaPremium = new Conta.Builder()
                    .numero(12L)
                    .nomeCorrentista("Carlos")
                    .categoriaInicial(Categoria.PREMIUM).build();

    }

}
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

        Conta contaNormal = new Conta.Builder()
                    .numero(12L)
                    .nomeCorrentista("Lauro")
                    .categoriaInicial(Categoria.NORMAL).build();


        int deposito;
        int retirada;

        
        //Conta Normal
        System.out.println("Conta Normal: ");

        deposito = (int) contaNormal.getEstadoConta().depositoContaLivre(200, 400);
        contaNormal.setSaldoLivreInicial(deposito);
        System.out.println("Saldo em Conta: 200, Valor do Deposito: 400, valor esperado: 600, RESULT: " + contaNormal.getSaldoLivreInicial());

        retirada = (int) contaNormal.getEstadoConta().retiraDescoberto(300, 100, 200);
        contaAdvanced.setSaldoLivreInicial(retirada);
        System.out.println("Saldo em Conta: 200, Valor de Retirada: 10, valor esperado: 98, RESULT: " + contaAdvanced.getSaldoLivreInicial());
        
        //Conta Advanced
        System.out.println("Conta Advanced: ");
        

        deposito = (int) contaAdvanced.getEstadoConta().depositoContaLivre(400, 300);
        contaAdvanced.setSaldoLivreInicial(deposito);
        System.out.println("Saldo em Conta: 400, Valor do Deposito: 300, valor esperado: 700, RESULT: " + contaAdvanced.getSaldoLivreInicial());

        retirada = (int) contaAdvanced.getEstadoConta().retiraDescoberto(500, 50, 100);
        contaAdvanced.setSaldoLivreInicial(retirada);
        System.out.println("Saldo em Conta: 100, Valor de Retirada: 50, valor esperado: 49, RESULT: " + contaAdvanced.getSaldoLivreInicial());

        //Conta Premium
        System.out.println("Conta Premium: ");

        deposito = (int) contaPremium.getEstadoConta().depositoContaInvestimento(200, 300);
        contaPremium.setSalAplicacaoInicial(deposito);
        System.out.println("Saldo em Conta: 200, Valor do Deposito: 300, valor esperado: 500, RESULT: " + contaPremium.getSalAplicacaoInicial());

        retirada = (int) contaPremium.getEstadoConta().retiraContaInvestimento(200, 300);
        contaPremium.setSalAplicacaoInicial(retirada);
        System.out.println("Saldo em Conta: 300, Valor da Retirada, 200, valor esperado: 97, RESULT: " + contaPremium.getSalAplicacaoInicial());
    
    
    }

}

package pucrs;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EstadosTest {
    public Conta contaAdvanced =
                        new Conta.Builder()
                        .numero(12L)
                        .nomeCorrentista("Beto")
                        .categoriaInicial(Categoria.ADVANCED)
                        .estadoConta(new EstadoCategoriaAdvanced())
                        .build();

    public Conta contaPremium = 
                        new Conta.Builder()
                        .numero(12L)
                        .nomeCorrentista("Carlos")
                        .categoriaInicial(Categoria.PREMIUM)
                        .estadoConta(new EstadoCategoriaPremium())
                        .build();
    

    @Test
    public void contaAdvancedOp() {
        int deposito;
        deposito = (int) contaAdvanced.getEstadoConta().depositoContaInvestimento(1000, 500);
        contaAdvanced.setSalAplicacaoInicial(deposito);
        assertEquals(1550, contaAdvanced.getSalAplicacaoInicial());
    }

    @Test
    public void contaPremiumOp() {
        
        int retirada;
        retirada = (int) contaPremium.getEstadoConta().retiraDescoberto(50000, 500, 1500);
        contaPremium.setSaldoLivreInicial(retirada);
        assertEquals(1000, contaPremium.getSaldoLivreInicial());
    }
}

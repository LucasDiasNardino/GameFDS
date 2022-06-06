package pucrs;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EstadosTest {
    public EstadoCategoria estado;
    
    @Test
    public void verificarContaDefault() {
        Conta conta = new Conta.Builder()
                .numero(1234L)
                .nomeCorrentista("Alison")
                .estadoConta(new EstadoCategoriaNormal())
                .build();
        assertEquals(Categoria.NORMAL, conta.getCategoriaInicial());

        
    }

    @Test
    public void verificarContaDefaultError() {
        Conta conta = new Conta.Builder().build();
        assertEquals(null, conta.getNomeCorrentista());
    }

    @Test
    public void verificaContaAdvanced() {
        Conta conta = new Conta.Builder()
                        .numero(12L)
                        .nomeCorrentista("Beto")
                        .categoriaInicial(Categoria.ADVANCED)
                        .estadoConta(new EstadoCategoriaAdvanced())
                        .build();
        assertEquals(Categoria.ADVANCED, conta.getCategoriaInicial());
        int deposito;
        deposito = (int) conta.getEstadoConta().depositoContaInvestimento(1000, 500);
        conta.setSalAplicacaoInicial(deposito);
        assertEquals(1550, conta.getSalAplicacaoInicial());
    }

    @Test
    public void verificaContaPremium() {
        Conta conta = new Conta.Builder()
                        .numero(12L)
                        .nomeCorrentista("Carlos")
                        .categoriaInicial(Categoria.PREMIUM)
                        .estadoConta(new EstadoCategoriaPremium())
                        .build();
        assertEquals(Categoria.PREMIUM, conta.getCategoriaInicial());
        int retirada;
        retirada = (int) conta.getEstadoConta().retiraDescoberto(50000, 500, 1500);
        conta.setSaldoLivreInicial(retirada);
        assertEquals(1000, conta.getSaldoLivreInicial());
    }
}

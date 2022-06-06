package pucrs;

import pucrs.Conta;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ContaTest {

    @Test
    public void verificarContaDefault() {
        Conta conta = new Conta.Builder()
                .numero(1234L)
                .nomeCorrentista("Alison").build();
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
                        .categoriaInicial(Categoria.ADVANCED).build();
        assertEquals(Categoria.ADVANCED, conta.getCategoriaInicial());
    }

    @Test
    public void verificaContaPremium() {
        Conta conta = new Conta.Builder()
                        .numero(12L)
                        .nomeCorrentista("Carlos")
                        .categoriaInicial(Categoria.PREMIUM).build();
        assertEquals(Categoria.PREMIUM, conta.getCategoriaInicial());
    }
}

package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Tabela_ESTest_scaffolding {

    private Tabela createTabela() {
        return new Tabela();
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    private Tabela createFullTabela() {
        Tabela tabela = new Tabela();
        tabela.registros = new Item[1];
        return tabela;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(-399);
        tabela0.insere(meuItem0);
        tabela0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(-10);
        int int0 = tabela0.binaria(meuItem1);
        assertEquals("Tabela size should be 2", 2, tabela0.n);
        assertEquals("Binary search result should be 0", 0, int0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(0);
        int int0 = tabela0.binaria(meuItem0);
        assertEquals("Binary search result should be 0", 0, int0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(-399);
        tabela0.insere(meuItem0);
        int int0 = tabela0.binaria(meuItem0);
        assertEquals("Tabela size should be 1", 1, tabela0.n);
        assertEquals("Binary search result should be 1", 1, int0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Tabela tabela0 = createFullTabela();
        MeuItem meuItem0 = createMeuItem(0);
        try {
            tabela0.insere(meuItem0);
            fail("Expected Exception when inserting into full table");
        } catch(Exception e) {
            verifyException("ds.Tabela", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(-1869);
        tabela0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(1614);
        int int0 = tabela0.pesquisa(meuItem1);
        assertEquals("Tabela size should be 1", 1, tabela0.n);
        assertEquals("Search result should be 0", 0, int0);
    }
}
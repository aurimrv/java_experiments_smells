package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Tabela_ESTest_scaffolding {

    private Tabela createTabela() {
        return new Tabela();
    }

    private MeuItem createMeuItem(int val) {
        return new MeuItem(val);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(11);
        tabela0.insere(meuItem0);
        int int0 = tabela0.binaria(createMeuItem(1));
        assertEquals("Tabela size should be 1", 1, tabela0.n);
        assertEquals("Binary search result should be 0", 0, int0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem1 = createMeuItem(-1632);
        tabela0.insere(meuItem1);
        int int0 = tabela0.binaria(createMeuItem(11));
        assertEquals("Tabela size should be 1", 1, tabela0.n);
        assertEquals("Binary search result should be 0", 0, int0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(0);
        int int0 = tabela0.binaria(meuItem0);
        assertEquals("Binary search result should be 0", 0, int0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(0);
        tabela0.insere(meuItem0);
        int int0 = tabela0.binaria(meuItem0);
        assertEquals("Tabela size should be 1", 1, tabela0.n);
        assertEquals("Binary search result should be 1", 1, int0);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(0);
        Item[] itemArray0 = new Item[3];
        tabela0.registros = itemArray0;
        tabela0.insere(meuItem0);
        tabela0.insere(meuItem0);
        try {
            tabela0.insere(itemArray0[1]);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.Tabela", e);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Tabela tabela0 = createTabela();
        MeuItem meuItem0 = createMeuItem(11);
        tabela0.insere(meuItem0);
        int int0 = tabela0.pesquisa(createMeuItem(1));
        assertEquals("Tabela size should be 1", 1, tabela0.n);
        assertEquals("Pesquisa result should be 0", 0, int0);
    }
}
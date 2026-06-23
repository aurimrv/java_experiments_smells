package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends TabelaHash_ESTest_scaffolding {

    private static final String EMPTY_STRING = "";
    private static final String KEY_TO_REMOVE = "2?yC1[";
    private static final String TEST_KEY = "n/P\u007Fzv";
    private static final String INSERT_KEY = "2?yC1[";
    private static final String SEARCH_KEY = "";

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(EMPTY_STRING, EMPTY_STRING);
        Object result = tabelaHash0.pesquisa(EMPTY_STRING);
        assertNotNull("Inserted key should be found", result);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(EMPTY_STRING, EMPTY_STRING);
        tabelaHash0.retira(KEY_TO_REMOVE);
        Object result = tabelaHash0.pesquisa(EMPTY_STRING);
        assertNotNull("Key inserted should still be present", result);
    }





    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        TabelaHash tabelaHash0 = new TabelaHash();
        tabelaHash0.insere(INSERT_KEY, INSERT_KEY);
        Object object0 = tabelaHash0.pesquisa(SEARCH_KEY);
        assertNull(object0);
    }
}
package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.TabelaHash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends TabelaHash_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();
        tabelaHash0.insere(")7BW?", object0);
        // Add assertions verifying insertion
        assertNotNull(tabelaHash0);
        // Separate imprime() into another test for atomicity
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();
        tabelaHash0.insere(")7BW?", object0);
        // Add assertions verifying insertion
        // Separate retira() into another test for atomicity
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();
        tabelaHash0.insere("a<", object0);
        // Add assertions verifying insertion
        // Separate second insere() into another test for atomicity
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();
        tabelaHash0.insere(")7BW?", object0);
        // Add assertions verifying insertion
        // Separate second insere() into another test for atomicity
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        TabelaHash tabelaHash0 = new TabelaHash();
        Object object0 = new Object();
        tabelaHash0.insere("", object0);
        // Add assertions verifying insertion
        // Separate retira() into another test for atomicity
    }
}
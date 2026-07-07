package ds.seed7992;

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

    private Tabela createTabelaWithItem(int value) throws Exception {
        Tabela tabela = new Tabela();
        tabela.insere(new MeuItem(value));
        return tabela;
    }

    private Tabela createFullTabela() {
        Tabela tabela = new Tabela();
        tabela.n = 10;
        return tabela;
    }







}
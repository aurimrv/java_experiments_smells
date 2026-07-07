package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MeuItem;
import ds.Tabela;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Tabela_ESTest_scaffolding {

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    private void insertItem(Tabela tabela, MeuItem item) throws Exception {
        tabela.insere(item);
    }

    private void fillTabelaToCapacity(Tabela tabela) {
        tabela.n = 10;
    }








}
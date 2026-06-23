package ds.seed1448;

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







}
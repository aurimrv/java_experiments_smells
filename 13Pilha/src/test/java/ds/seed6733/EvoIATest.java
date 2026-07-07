package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Pilha_ESTest_scaffolding {

    private Pilha createEmptyPilha() {
        return new Pilha();
    }

    private Pilha createFullPilha() {
        Pilha pilha = new Pilha();
        pilha.item = new Object[0];
        return pilha;
    }

    private Pilha createPilhaWithOneObject() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(new Object());
        return pilha;
    }






}
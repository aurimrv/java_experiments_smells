package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Lista_ESTest_scaffolding {

    private Lista createListaWithOneObject() throws Exception {
        Lista lista = new Lista();
        lista.insere(new Object());
        return lista;
    }

    private Lista createEmptyLista() {
        return new Lista();
    }




}
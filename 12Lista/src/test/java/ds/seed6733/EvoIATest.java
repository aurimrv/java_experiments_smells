package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Lista_ESTest_scaffolding {

    private Lista createListaWithOneElement() {
        Lista lista = new Lista();
        lista.insere("ds.Lista$Celula");
        return lista;
    }

    private Lista createEmptyLista() {
        return new Lista();
    }



}
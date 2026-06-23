package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends ArvoreBinaria_ESTest_scaffolding {

    private ArvoreBinaria createArvore() {
        return new ArvoreBinaria();
    }

    private MeuItem createMeuItem(int key) {
        return new MeuItem(key);
    }













}
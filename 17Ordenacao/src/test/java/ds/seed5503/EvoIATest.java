package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.MeuItem;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

    private Item[] createItemArray(int size, int[] values) {
        Item[] array = new Item[size];
        for (int i = 0; i < values.length; i++) {
            array[i] = new MeuItem(values[i]);
        }
        return array;
    }

    private Item[] createEmptyItemArray(int size) {
        return new Item[size];
    }













}
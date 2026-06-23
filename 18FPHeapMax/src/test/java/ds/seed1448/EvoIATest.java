package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.FPHeapMax;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends FPHeapMax_ESTest_scaffolding {

    private FPHeapMax createHeap(int size) {
        return new FPHeapMax(size);
    }

    private Item[] createItemArray(int size) {
        return new Item[size];
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }















}
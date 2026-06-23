package ds.seed9006;

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

    private static final int HEAP_CAPACITY = 1090;
    private static final int SMALL_CAPACITY = 1;
    private static final int ZERO_CAPACITY = 0;
    private static final int ITEM_KEY_SMALL = 2;
    private static final int ITEM_KEY_LARGE = 1090;

    private MeuItem createMeuItem(int key) {
        return new MeuItem(key);
    }

    private FPHeapMax createHeap(int capacity) {
        return new FPHeapMax(capacity);
    }









}
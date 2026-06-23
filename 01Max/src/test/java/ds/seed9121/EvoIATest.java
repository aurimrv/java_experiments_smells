package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Max_ESTest_scaffolding {

    private Item[] createTestItemArray() {
        Item[] items = new Item[9];
        items[0] = new MeuItem(0);
        items[1] = new MeuItem(0);
        items[2] = new MeuItem(1);
        return items;
    }

    private Item[] createEmptyItemArray() {
        return new Item[0];
    }

    /**
     * Test verifies that Max.max throws NullPointerException when array contains null elements.
     */

    /**
     * Test verifies that Max.max returns null when input array is empty.
     */

    /**
     * Test verifies that Max constructor creates a non-null instance.
     */

}
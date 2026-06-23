package ds.seed5838;

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

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        MeuItem meuItem0 = createMeuItem(2207);
        MeuItem meuItem1 = createMeuItem(-1454);
        Item[] itemArray0 = new Item[9];
        itemArray0[0] = meuItem1;
        itemArray0[1] = meuItem1;
        itemArray0[2] = meuItem0;
        try {
            Max.max(itemArray0, 2269);
            fail("Expected NullPointerException when calling Max.max with partially null array");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Item[] itemArray0 = new Item[0]; // empty array to test boundary
        Item item0 = Max.max(itemArray0, 0);
        assertNull("Expected null result for empty input array", item0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Max max0 = new Max();
        assertNotNull("Max instance should be created", max0);
    }
}
package ds.seed7992;

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

  private Item[] createMeuItemArray() {
    MeuItem meuItem0 = new MeuItem(0);
    MeuItem meuItem1 = new MeuItem(-1);
    Item[] itemArray = new Item[3];
    itemArray[0] = meuItem1;
    itemArray[1] = meuItem0;
    itemArray[2] = null;
    return itemArray;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    Item[] itemArray0 = createMeuItemArray();
    ((MeuItem)itemArray0[1]).chave = 0;
    try {
      Max.max(itemArray0, 0);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      assertNotNull("Exception should have a stack trace", e.getStackTrace());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    Item[] emptyArray = new Item[5];
    Item result = Max.max(emptyArray, 0);
    assertNull("Expected null when input array is empty", result);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    Max max0 = new Max();
    assertNotNull("Max instance should not be null", max0);
  }
}
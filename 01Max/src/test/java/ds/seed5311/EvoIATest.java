package ds.seed5311;

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

  private Item[] createItemArrayWithMeuItems() {
    Item[] items = new Item[3];
    MeuItem item1 = new MeuItem(0); // boundary value zero
    MeuItem item2 = new MeuItem(Integer.MAX_VALUE); // boundary max value
    items[0] = item1;
    items[1] = item1;
    items[2] = item2;
    return items;
  }

  private Item[] createEmptyItemArray(int size) {
    return new Item[size];
  }




}
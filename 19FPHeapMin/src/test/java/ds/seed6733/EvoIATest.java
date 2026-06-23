package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.FPHeapMin;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends FPHeapMin_ESTest_scaffolding {

    private Item[] createItemArray(int size) {
        return new Item[size];
    }

    private FPHeapMin createHeap(int capacity) {
        return new FPHeapMin(capacity);
    }

    private FPHeapMin createHeap(Item[] items) {
        return new FPHeapMin(items);
    }

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    private Item[] createItemArrayWithMeuItem(int size, int value) {
        Item[] items = new Item[size];
        items[0] = new MeuItem(value);
        return items;
    }

    private Item[] createItemArrayWithMeuItems() {
        Item[] items = new Item[4];
        MeuItem item = new MeuItem(2591);
        items[1] = item;
        items[2] = item;
        items[3] = new MeuItem(1);
        return items;
    }

    private Item[] createItemArrayWithDuplicateMeuItems(int size, int value) {
        Item[] items = new Item[size];
        MeuItem item = new MeuItem(value);
        items[2] = item;
        items[3] = item;
        return items;
    }















}
package ds.seed5831;

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

    private MeuItem createMeuItem(int value) {
        return new MeuItem(value);
    }

    private FPHeapMin createHeap(int size) {
        return new FPHeapMin(size);
    }

    private FPHeapMin createHeap(Item[] items) {
        return new FPHeapMin(items);
    }

    private void expectExceptionOnInsert(FPHeapMin heap, MeuItem item) {
        try {
            heap.insere(item);
            fail("Expecting exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    private void expectExceptionOnDiminuiChave(FPHeapMin heap, int index, Object key) {
        try {
            heap.diminuiChave(index, key);
            fail("Expecting exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    private void expectExceptionOnRetiraMin(FPHeapMin heap) {
        try {
            heap.retiraMin();
            fail("Expecting exception");
        } catch(Exception e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    private void expectNullPointerExceptionOnRetiraMin(FPHeapMin heap) {
        try {
            heap.retiraMin();
            fail("Expecting NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }

    private void expectNullPointerExceptionOnConstroi(FPHeapMin heap) {
        try {
            heap.constroi();
            fail("Expecting NullPointerException");
        } catch(NullPointerException e) {
            verifyException("ds.FPHeapMin", e);
        }
    }













}
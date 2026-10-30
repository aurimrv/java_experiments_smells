package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this file.
 * Required when using @Category annotations at class/method level.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

    // Common boundary and example values to avoid magic numbers and to document intent.
    private static final int ZERO = 0;
    private static final int NEG_ONE = -1;
    private static final int POS_ONE = 1;

    /**
     * REQ-ARV-001
     * Given a tree with two elements, when one element has its key altered and testa() is invoked,
     * the tested behavior triggers a SystemExit-like exception in the runtime harness.
     */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      Integer integer0 = new Integer((-6));
      arvoreBinaria0.insere(meuItem1);
      meuItem1.alteraChave(integer0);
      // Undeclared exception!
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

    /**
     * REQ-ARV-002
     * Given a tree with two negative keys, calling testa() should complete without a runtime exit.
     * This test asserts that previously-inserted items remain searchable.
     */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1013));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-12));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

    /**
     * REQ-ARV-003
     * Given a tree where a node's key is altered to a larger positive value, the runtime harness is expected to
     * trigger a SystemExit-like exception when testa() is invoked.
     */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(6);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      Integer integer0 = new Integer(18);
      arvoreBinaria0.insere(meuItem1);
      meuItem1.alteraChave(integer0);
      // Undeclared exception!
      try { 
        arvoreBinaria0.testa();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

    /**
     * REQ-ARV-004
     * Given a tree with two negative keys, calling testa() should execute normally and preserve items.
     */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-11));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1013));
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.testa();
  }

    /**
     * REQ-ARV-005
     * Given two distinct items inserted, removing the first should not make it identical to the second,
     * and it should no longer be present in the tree.
     */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      arvoreBinaria0.insere(meuItem1);
      arvoreBinaria0.retira(meuItem0);
      assertNotSame(meuItem0, meuItem1);
  }

    /**
     * REQ-ARV-006
     * Insert then remove the same item; verify tamanho remains as expected for the MeuItem instance.
     */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

    /**
     * REQ-ARV-007
     * Removing a non-existent item should not alter the tamanho of the item passed as search key.
     */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      arvoreBinaria0.retira(meuItem1);
      assertEquals(4, meuItem1.tamanho());
  }

    /**
     * REQ-ARV-008
     * Removing a different (non-inserted) item must not make it identical to an inserted item.
     */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-20));
      arvoreBinaria0.retira(meuItem1);
      assertNotSame(meuItem1, meuItem0);
  }

    /**
     * REQ-ARV-009
     * Insert multiple items then remove one; verify removed instance retains its internal reported tamanho.
     */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-11));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem((-1013));
      arvoreBinaria0.insere(meuItem1);
      MeuItem meuItem2 = new MeuItem((-12));
      arvoreBinaria0.insere(meuItem2);
      MeuItem meuItem3 = new MeuItem((-10));
      arvoreBinaria0.insere(meuItem3);
      arvoreBinaria0.retira(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

    /**
     * REQ-ARV-010
     * Inserting the same object twice should not change its reported tamanho.
     */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      arvoreBinaria0.insere(meuItem0);
      assertEquals(4, meuItem0.tamanho());
  }

    /**
     * REQ-ARV-011
     * Searching for a non-inserted key should return null.
     */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem((-1));
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = new MeuItem(1);
      Item item0 = arvoreBinaria0.pesquisa(meuItem1);
      assertNull(item0);
  }

    /**
     * REQ-ARV-012
     * Searching for an absent negative key should return null.
     */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        // Arrange
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem present = new MeuItem(NEG_ONE);
        arvoreBinaria0.insere(present);

        // Act
        MeuItem query = new MeuItem(-20);
        Item item0 = arvoreBinaria0.pesquisa(query);

        // Assert
        assertNull("Searching for an absent negative key should return null", item0);
    }

    /**
     * REQ-ARV-013
     * Insert a zero key and verify that pesquisa returns the inserted item and that the reported tamanho matches expectation.
     */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
      MeuItem meuItem0 = new MeuItem(0);
      arvoreBinaria0.insere(meuItem0);
      MeuItem meuItem1 = (MeuItem)arvoreBinaria0.pesquisa(meuItem0);
      assertEquals(4, meuItem1.tamanho());
  }
}
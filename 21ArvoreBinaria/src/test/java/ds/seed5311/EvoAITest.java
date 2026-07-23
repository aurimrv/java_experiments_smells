package ds.seed5311;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

/**
 * Unit tests for ArvoreBinaria behaviors (basic insertion, search and removal).
 *
 * Requirement trace: ARV-1 (basic binary tree operations: insert/pesquisa/retira)
 *
 * Tests follow a Given-When-Then structure in the method body comments and include
 * descriptive assertion messages to improve diagnosability.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends ArvoreBinaria_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    // Given: an empty tree and two items
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem meuItem0 = new MeuItem(-4092);
    MeuItem meuItem1 = new MeuItem(-38);

    // When: insert both items and then change the key of primeiro item to a large positive value
    arvoreBinaria0.insere(meuItem0);
    arvoreBinaria0.insere(meuItem1);
    Integer newKey = Integer.valueOf(2202);
    meuItem0.alteraChave(newKey);

    // Then: searching by the new key should still find the item (depending on implementation,
    // alteraChave may change the in-memory key; at minimum the item object should remain searchable
    // via equality on its current key). We attempt to search using the modified item object itself.
    Item foundAfterChange = arvoreBinaria0.pesquisa(meuItem0);
    assertSame("Expected the tree to return the same MeuItem instance after key change when searched by that instance",
               meuItem0, foundAfterChange);

    // Also ensure the other item is still present
    Item foundOther = arvoreBinaria0.pesquisa(meuItem1);
    assertSame("Expected the second inserted item to be found in the tree", meuItem1, foundOther);

    // Basic invariants on MeuItem objects (size metadata)
    assertEquals("MeuItem.tamanho() should be 4 for meuItem0", 4, meuItem0.tamanho());
    assertEquals("MeuItem.tamanho() should be 4 for meuItem1", 4, meuItem1.tamanho());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    // Given: an empty tree and two distinct negative-key items
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem first = new MeuItem(-4129);
    MeuItem second = new MeuItem(-38);

    // When: insert both items
    arvoreBinaria0.insere(first);
    arvoreBinaria0.insere(second);

    // Then: both items should be searchable and should be distinct objects
    Item searchFirst = arvoreBinaria0.pesquisa(first);
    Item searchSecond = arvoreBinaria0.pesquisa(second);

    assertSame("First inserted item should be found by pesquisa", first, searchFirst);
    assertSame("Second inserted item should be found by pesquisa", second, searchSecond);
    assertNotSame("Inserted items should be distinct instances", first, second);

    // Searching for a non-existent item should return null
    MeuItem notPresent = new MeuItem(-9999);
    assertNull("Searching for a non-inserted key should return null", arvoreBinaria0.pesquisa(notPresent));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    // Given: empty tree and a single item with key 0
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem meuItem0 = new MeuItem(0);

    // When: insert the item then remove it
    arvoreBinaria0.insere(meuItem0);
    // After insertion the item should be found
    Item found = arvoreBinaria0.pesquisa(meuItem0);
    assertSame("After insertion the exact item instance should be returned by pesquisa", meuItem0, found);

    arvoreBinaria0.retira(meuItem0);

    // Then: after removal the item should no longer be found
    assertNull("After removal, pesquisa should return null for the removed item", arvoreBinaria0.pesquisa(meuItem0));

    // And the MeuItem metadata remains consistent
    assertEquals("MeuItem.tamanho() should still be 4 after operations", 4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    // Given: a tree with one inserted item and a different item that was never inserted
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem present = new MeuItem(-1692);
    MeuItem absent = new MeuItem(0);
    arvoreBinaria0.insere(present);

    // When: attempt to remove the absent item (should be a no-op)
    arvoreBinaria0.retira(absent);

    // Then: present item should still be findable and absent item should not be found
    assertSame("Present item should still be found after attempting to remove a non-existent item",
               present, arvoreBinaria0.pesquisa(present));
    assertNull("Non-inserted (absent) item should not be found", arvoreBinaria0.pesquisa(absent));

    // Verify item metadata remains consistent
    assertEquals("MeuItem.tamanho() for present item should be 4", 4, present.tamanho());
    assertEquals("MeuItem.tamanho() for absent item should be 4", 4, absent.tamanho());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // Given: a tree and two items with keys 0 and -1
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem inserted = new MeuItem(0);
    MeuItem nonInserted = new MeuItem(-1);

    // When: insert one item and attempt to remove/search the other
    arvoreBinaria0.insere(inserted);
    arvoreBinaria0.retira(nonInserted); // removing non-inserted should not affect inserted

    // Then: the inserted item should be found; the other should not
    assertSame("Inserted item should be findable", inserted, arvoreBinaria0.pesquisa(inserted));
    assertNull("Non-inserted item should not be found", arvoreBinaria0.pesquisa(nonInserted));

    // And they should not be considered equal
    assertFalse("Inserted and non-inserted items should not be equal", nonInserted.equals((Object) inserted));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    // Given: a tree and three items
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem toRemove = new MeuItem(-4129);
    MeuItem kept1 = new MeuItem(-1674);
    MeuItem kept2 = new MeuItem(-38);

    // When: insert two items, then insert the one that will be removed, then remove it
    arvoreBinaria0.insere(kept1);
    arvoreBinaria0.insere(kept2);
    arvoreBinaria0.insere(toRemove);
    arvoreBinaria0.retira(kept1); // remove kept1

    // Then: the removed item should not be found; the others should be findable
    assertNull("Removed item (kept1) should not be found after retira", arvoreBinaria0.pesquisa(kept1));
    assertSame("kept2 should still be present", kept2, arvoreBinaria0.pesquisa(kept2));
    assertSame("toRemove should still be present (was inserted but not removed here)", toRemove, arvoreBinaria0.pesquisa(toRemove));

    // Ensure items are distinct
    assertFalse("kept1 should not equal kept2", kept1.equals((Object) kept2));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    // Given: an empty tree and two items
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem first = new MeuItem(-4129);
    MeuItem second = new MeuItem(-1674);

    // When: insert both items
    arvoreBinaria0.insere(second);
    arvoreBinaria0.insere(first);

    // Then: both should be findable and independent
    assertSame("First inserted (second variable) should be findable", second, arvoreBinaria0.pesquisa(second));
    assertSame("Second inserted (first variable) should be findable", first, arvoreBinaria0.pesquisa(first));
    assertNotEquals("Different items should not be equal", first, second);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    // Given: an empty tree and a single item
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem meuItem0 = new MeuItem(-1724);

    // When: insert the same item twice (duplicate insert)
    arvoreBinaria0.insere(meuItem0);
    arvoreBinaria0.insere(meuItem0);

    // Then: searching should still return the same instance and MeuItem metadata should be consistent
    Item found = arvoreBinaria0.pesquisa(meuItem0);
    assertSame("Pesquisa should return the same instance after duplicate inserts", meuItem0, found);
    assertEquals("MeuItem.tamanho() should remain consistent", 4, meuItem0.tamanho());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    // Given: a tree with one inserted negative-key item
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem inserted = new MeuItem(-1724);
    arvoreBinaria0.insere(inserted);

    // When: search for a different key (0) that was not inserted
    MeuItem probe = new MeuItem(0);
    Item resultProbe = arvoreBinaria0.pesquisa(probe);

    // Then: the probe should not be found and the inserted item should still be findable
    assertNull("Searching for a different key should return null", resultProbe);
    assertSame("Inserted negative-key item should be present", inserted, arvoreBinaria0.pesquisa(inserted));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    // Given: a tree with an item 0
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem inserted = new MeuItem(0);
    arvoreBinaria0.insere(inserted);

    // When: search for a nearby but different key (-1)
    MeuItem probe = new MeuItem(-1);
    Item resultProbe = arvoreBinaria0.pesquisa(probe);

    // Then: the probe should not be found and the inserted item should be findable
    assertNull("Searching for a non-inserted nearby key should return null", resultProbe);
    assertSame("Inserted item should be present", inserted, arvoreBinaria0.pesquisa(inserted));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    // Given: a tree and an item with key 0
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem meuItem0 = new MeuItem(0);
    arvoreBinaria0.insere(meuItem0);

    // When: search for that same item
    Item item0 = arvoreBinaria0.pesquisa(meuItem0);

    // Then: the returned object should be the exact same instance
    assertSame("Pesquisa should return the exact inserted instance", meuItem0, item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    // Given: a tree with two items
    ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
    MeuItem toRemove = new MeuItem(-1674);
    MeuItem other = new MeuItem(-20);

    // When: insert both and then remove one
    arvoreBinaria0.insere(toRemove);
    arvoreBinaria0.insere(other);
    arvoreBinaria0.retira(toRemove);

    // Then: removed item should not be findable; the other should still be present
    assertNull("Removed item should not be found after removal", arvoreBinaria0.pesquisa(toRemove));
    assertSame("Other item should remain present after removing a different item", other, arvoreBinaria0.pesquisa(other));
    assertFalse("Removed and remaining items should not be considered equal", toRemove.equals((Object) other));
  }
}
package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      Fila fila0 = new Fila();
      fila0.tras = 146;
      try {
          fila0.imprime();
          fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
          assertNotNull("Exception should not be null", e);
          // Additional assertions could be added if exception has properties
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      Fila fila0 = new Fila();
      fila0.imprime();
      assertEquals("Tras should be 0 after imprime call", 0, fila0.tras);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      Fila fila0 = new Fila();
      try {
          fila0.desenfileira();
          fail("Expected Exception with message 'Erro: A fila esta vazia' when calling desenfileira on empty Fila");
      } catch (Exception e) {
          assertNotNull("Exception should not be null", e);
          assertEquals("Erro: A fila esta vazia", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      Fila fila0 = new Fila();
      Object[] objectArray0 = new Object[1];
      fila0.item = objectArray0;
      try {
          fila0.enfileira(objectArray0[0]);
          fail("Expected Exception with message 'Erro: A fila esta cheia' when enfileira called on full Fila");
      } catch (Exception e) {
          assertNotNull("Exception should not be null", e);
          assertEquals("Erro: A fila esta cheia", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
      Fila fila0 = new Fila();
      fila0.enfileira(fila0);
      fila0.desenfileira();
      assertEquals("Frente should be 1 after enfileira and desenfileira", 1, fila0.frente);
  }
}
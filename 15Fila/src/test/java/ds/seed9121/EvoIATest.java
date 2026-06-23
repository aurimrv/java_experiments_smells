package ds.seed9121;

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

  private Fila createFilaWithOneElement() {
      Fila fila = new Fila();
      fila.enfileira(fila);
      return fila;
  }

  private Fila createEmptyFila() {
      return new Fila();
  }

  private Fila createFilaWithFrenteOne() {
      Fila fila = new Fila();
      fila.frente = 1;
      return fila;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      Fila fila0 = createFilaWithOneElement();
      fila0.imprime();
      assertEquals("Queue 'tras' count should be 1 after enqueue", 1, fila0.tras);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      Fila fila0 = createEmptyFila();
      try {
          fila0.desenfileira();
          fail("Expected Exception when dequeuing from empty queue");
      } catch(Exception e) {
          assertEquals("Erro: A fila esta vazia", e.getMessage());
          verifyException("ds.Fila", e);
      }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      Fila fila0 = createFilaWithFrenteOne();
      try {
          fila0.enfileira((Object) null);
          fail("Expected Exception when enqueueing null on full queue");
      } catch(Exception e) {
          assertEquals("Erro: A fila esta cheia", e.getMessage());
          verifyException("ds.Fila", e);
      }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      Fila fila0 = createFilaWithOneElement();
      fila0.desenfileira();
      assertEquals("Queue 'tras' count should be 1 after enqueue and dequeue", 1, fila0.tras);
  }
}
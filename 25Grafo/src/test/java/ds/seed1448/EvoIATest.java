package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Grafo_ESTest_scaffolding {

  private Grafo createGrafoWithEdge(int v1, int v2, int peso) {
      Grafo grafo = new Grafo();
      grafo.insereAresta(v1, v2, peso);
      return grafo;
  }









}
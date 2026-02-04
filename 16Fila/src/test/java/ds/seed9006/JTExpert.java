package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 10
Total number of covered branches: 9
Coverage : 90%
Evaluations : 109106
search time (ms): 42501
total runtime (ms): 44120
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[\u0054], 
3)----->desenfileira[], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    char clsUTFilaP2P1O0='\u0054';
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("T",clsUTFilaP2P1.toString());
    assertEquals(84,clsUTFilaP2P1.hashCode());
    Object clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.desenfileira();
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP4R);
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    int clsUTFilaP5RP0P1=-244;
    String clsUTFilaP5RP0R=null;
      clsUTFilaP5RP0R=String.valueOf(clsUTFilaP5RP0P1);
    assertEquals("-244",clsUTFilaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->vazia[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Object clsUTFilaP2R=null;
//Exception
    try {
      clsUTFilaP2R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP2R);
      clsUTFila.imprime();
      clsUTFila.imprime();
  }
}

package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 6, 7, 8, 9]
Uncovered branches: [5]
Total number of branches: 10
Total number of covered branches: 8
Coverage : 80%
Evaluations : 109873
search time (ms): 42501
total runtime (ms): 44060
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->vazia[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase0() throws Throwable {
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
3)----->vazia[]
 Covered Branches:[1, 3, 4, 6, 7]
 */
  @Test public void TestCase1() throws Throwable {
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
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[true], 
3)----->enfileira[37.55438531604881D], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2P1O0=true;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("true",clsUTFilaP2P1.toString());
    assertEquals(1231,clsUTFilaP2P1.hashCode());
    double clsUTFilaP3P1O0=37.55438531604881D;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("37.55438531604881",clsUTFilaP3P1.toString());
    assertEquals(1499078926,clsUTFilaP3P1.hashCode());
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP4R);
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    int clsUTFilaP5RP0P1=801;
    String clsUTFilaP5RP0R=null;
      clsUTFilaP5RP0R=String.valueOf(clsUTFilaP5RP0P1);
    assertEquals("801",clsUTFilaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[true], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Boolean clsUTFilaP2P1O0=true;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("true",clsUTFilaP2P1.toString());
    assertEquals(1231,clsUTFilaP2P1.hashCode());
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    float clsUTFilaP3RP0P1=-69.82774F;
    String clsUTFilaP3RP0R=null;
      clsUTFilaP3RP0R=String.valueOf(clsUTFilaP3RP0P1);
    assertEquals("-69.82774",clsUTFilaP3RP0R);
    String clsUTFilaP3RP1R=null;
//Exception
    try {
      clsUTFilaP3RP1R=clsUTFilaP3R.concat((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP3RP1R);
  }
}

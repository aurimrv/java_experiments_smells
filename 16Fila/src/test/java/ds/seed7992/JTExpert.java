package ds.seed7992;
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
Evaluations : 111895
search time (ms): 42501
total runtime (ms): 43723
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[4.45208516461949D], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    double clsUTFilaP2P1O0=4.45208516461949D;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("4.45208516461949",clsUTFilaP2P1.toString());
    assertEquals(700841551,clsUTFilaP2P1.hashCode());
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    boolean clsUTFilaP4RP0P1=false;
    String clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=String.valueOf(clsUTFilaP4RP0P1);
    assertEquals("false",clsUTFilaP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 6, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    int clsUTFilaP3RP0P1=-147;
    String clsUTFilaP3RP0R=null;
//Exception
    try {
      clsUTFilaP3RP0R=clsUTFilaP3R.substring(clsUTFilaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    String clsUTFilaP3RP0R=null;
      clsUTFilaP3RP0R=clsUTFilaP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->vazia[]
 Covered Branches:[1, 3, 4, 6, 7]
 */
  @Test public void TestCase3() throws Throwable {
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
}

package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 8, 9, 10, 11, 12]
Uncovered branches: [3, 7]
Total number of branches: 12
Total number of covered branches: 10
Coverage : 83,33%
Evaluations : 79257
search time (ms): 42503
total runtime (ms): 44113
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[]
 Covered Branches:[1, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[404], 
3)----->enfileira[ds.Fila[]], 
4)----->imprime[], 
5)----->vazia[], 
6)----->toString[]
 Covered Branches:[1, 2, 4, 8, 10, 11, 12]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=404;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("404",clsUTFilaP2P1.toString());
    assertEquals(404,clsUTFilaP2P1.hashCode());
    Fila clsUTFilaP3P1O0=null;
      clsUTFilaP3P1O0=new Fila();
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
      clsUTFila.imprime();
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP5R);
    String clsUTFilaP6R=null;
      clsUTFilaP6R=clsUTFila.toString();
    int clsUTFilaP6RP0P1=1000;
    int clsUTFilaP6RP0P2=-906;
    int clsUTFilaP6RP0R=0;
//Exception
    try {
      clsUTFilaP6RP0R=clsUTFilaP6R.offsetByCodePoints(clsUTFilaP6RP0P1,clsUTFilaP6RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->toString[]
 Covered Branches:[1, 5, 6, 8, 9]
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
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    int clsUTFilaP3RP0P1=1;
    int clsUTFilaP3RP0P2=0;
    byte[] clsUTFilaP3RP0P3=new byte[]{};
    int clsUTFilaP3RP0P4=536;
//Exception
    try {
      clsUTFilaP3R.getBytes(clsUTFilaP3RP0P1,clsUTFilaP3RP0P2,clsUTFilaP3RP0P3,clsUTFilaP3RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{},clsUTFilaP3RP0P3));
    float clsUTFilaP3RP1P1=2.0159338E38F;
    String clsUTFilaP3RP1R=null;
      clsUTFilaP3RP1R=String.valueOf(clsUTFilaP3RP1P1);
    assertEquals("2.0159338E38",clsUTFilaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[null], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.enfileira((Object)null);
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    byte[] clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=clsUTFilaP4R.getBytes();
    double clsUTFilaP4RP1P1=-76.94161589916811D;
    String clsUTFilaP4RP1R=null;
      clsUTFilaP4RP1R=String.valueOf(clsUTFilaP4RP1P1);
    assertEquals("-76.94161589916811",clsUTFilaP4RP1R);
  }
}

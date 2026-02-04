package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Uncovered branches: [3]
Total number of branches: 12
Total number of covered branches: 11
Coverage : 91,67%
Evaluations : 75036
search time (ms): 42501
total runtime (ms): 44077
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
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
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->enfileira[ds.Fila[]], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 5, 6, 8, 9]
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
    Fila clsUTFilaP3P1O0=null;
      clsUTFilaP3P1O0=new Fila();
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    int clsUTFilaP4RP0P1=1001;
    int clsUTFilaP4RP0P2=-954;
    int clsUTFilaP4RP0R=0;
      clsUTFilaP4RP0R=clsUTFilaP4R.indexOf(clsUTFilaP4RP0P1,clsUTFilaP4RP0P2);
    assertEquals(-1,clsUTFilaP4RP0R);
    String clsUTFilaP4RP1P1=new String("+<%*_.-}~[>'#!/@;?^|$ ]=`(&)_{:");
    boolean clsUTFilaP4RP1R=false;
      clsUTFilaP4RP1R=clsUTFilaP4R.startsWith(clsUTFilaP4RP1P1);
    assertEquals(false,clsUTFilaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->enfileira[-52], 
4)----->enfileira[-47], 
5)----->desenfileira[], 
6)----->vazia[], 
7)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 6, 7, 8, 9, 10]
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
    short clsUTFilaP3P1O0=-52;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("-52",clsUTFilaP3P1.toString());
    assertEquals(-52,clsUTFilaP3P1.hashCode());
    byte clsUTFilaP4P1O0=-47;
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    assertEquals("-47",clsUTFilaP4P1.toString());
    assertEquals(-47,clsUTFilaP4P1.hashCode());
    Object clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.desenfileira();
    assertEquals(-52,clsUTFilaP5R.hashCode());
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP6R);
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[String], 
3)----->enfileira[-971], 
4)----->imprime[], 
5)----->toString[], 
6)----->vazia[]
 Covered Branches:[1, 2, 4, 8, 10, 11, 12]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    String clsUTFilaP2P1O0=new String("0nv718qgpeyhx23");
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("0nv718qgpeyhx23",clsUTFilaP2P1.toString());
    assertEquals(-2087541063,clsUTFilaP2P1.hashCode());
    Integer clsUTFilaP3P1O0=-971;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("-971",clsUTFilaP3P1.toString());
    assertEquals(-971,clsUTFilaP3P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    int clsUTFilaP5RP0P1=756;
    int clsUTFilaP5RP0P2=-957;
    byte[] clsUTFilaP5RP0P3=new byte[]{-73,-83};
    int clsUTFilaP5RP0P4=43;
//Exception
    try {
      clsUTFilaP5R.getBytes(clsUTFilaP5RP0P1,clsUTFilaP5RP0P2,clsUTFilaP5RP0P3,clsUTFilaP5RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{-73,-83},clsUTFilaP5RP0P3));
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP6R);
  }
}

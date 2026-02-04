package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
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
Evaluations : 107513
search time (ms): 42501
total runtime (ms): 44063
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[28L], 
3)----->enfileira[-119], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->vazia[], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Long clsUTFilaP2P1O0=28L;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("28",clsUTFilaP2P1.toString());
    assertEquals(28,clsUTFilaP2P1.hashCode());
    Integer clsUTFilaP3P1O0=-119;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("-119",clsUTFilaP3P1.toString());
    assertEquals(-119,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    Object clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.desenfileira();
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP6R);
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    String clsUTFilaP7RP0R=null;
      clsUTFilaP7RP0R=clsUTFilaP7R.trim();
    char[] clsUTFilaP7RP1P1=new char[]{'\u0078','\u0047','\u0037','\u0075'};
    String clsUTFilaP7RP1R=null;
      clsUTFilaP7RP1R=String.valueOf(clsUTFilaP7RP1P1);
    assertTrue(Arrays.equals(new char[]{'\u0078','\u0047','\u0037','\u0075'},clsUTFilaP7RP1P1));
    assertEquals("xG7u",clsUTFilaP7RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->imprime[], 
6)----->toString[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
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
    Object clsUTFilaP3R=null;
//Exception
    try {
      clsUTFilaP3R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP3R);
    Object clsUTFilaP4R=null;
//Exception
    try {
      clsUTFilaP4R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP4R);
      clsUTFila.imprime();
    String clsUTFilaP6R=null;
      clsUTFilaP6R=clsUTFila.toString();
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
    int clsUTFilaP3RP0P1=-639;
    int clsUTFilaP3RP0R=0;
      clsUTFilaP3RP0R=clsUTFilaP3R.lastIndexOf(clsUTFilaP3RP0P1);
    assertEquals(-1,clsUTFilaP3RP0R);
  }
}

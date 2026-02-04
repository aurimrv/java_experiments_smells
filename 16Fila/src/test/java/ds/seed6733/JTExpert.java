package ds.seed6733;
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
Evaluations : 109903
search time (ms): 42502
total runtime (ms): 44097
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 6, 7]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    String clsUTFilaP3RP0P1=new String("iGKbx08a");
    boolean clsUTFilaP3RP0R=false;
      clsUTFilaP3RP0R=clsUTFilaP3R.endsWith(clsUTFilaP3RP0P1);
    assertEquals("iGKbx08a",clsUTFilaP3RP0P1.toString());
    assertEquals(false,clsUTFilaP3RP0R);
    String clsUTFilaP3RP1P1=new String("^=9/ ?W?I}`.;>{HlAW_");
    int clsUTFilaP3RP1P2=-640;
    int clsUTFilaP3RP1R=0;
      clsUTFilaP3RP1R=clsUTFilaP3R.lastIndexOf(clsUTFilaP3RP1P1,clsUTFilaP3RP1P2);
    assertEquals("^=9/ ?W?I}`.;>{HlAW_",clsUTFilaP3RP1P1.toString());
    assertEquals(-1,clsUTFilaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->imprime[], 
7)----->toString[]
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
    Object clsUTFilaP5R=null;
//Exception
    try {
      clsUTFilaP5R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP5R);
      clsUTFila.imprime();
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    String clsUTFilaP7RP0P1=new String("O*@!b9%");
    boolean clsUTFilaP7RP0R=false;
      clsUTFilaP7RP0R=clsUTFilaP7R.equalsIgnoreCase(clsUTFilaP7RP0P1);
    assertEquals(false,clsUTFilaP7RP0R);
    String clsUTFilaP7RP1R=null;
      clsUTFilaP7RP1R=clsUTFilaP7R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[541], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    int clsUTFilaP2P1O0=541;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("541",clsUTFilaP2P1.toString());
    assertEquals(541,clsUTFilaP2P1.hashCode());
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[-74L], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->vazia[], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7, 8]
 */
  @Test public void TestCase4() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Long clsUTFilaP2P1O0=-74L;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("-74",clsUTFilaP2P1.toString());
    assertEquals(73,clsUTFilaP2P1.hashCode());
    Object clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.desenfileira();
    Object clsUTFilaP4R=null;
//Exception
    try {
      clsUTFilaP4R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP4R);
    Object clsUTFilaP5R=null;
//Exception
    try {
      clsUTFilaP5R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP5R);
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP6R);
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP7R);
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
  }
}

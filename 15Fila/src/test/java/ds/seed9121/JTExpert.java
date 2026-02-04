package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Uncovered branches: [3]
Total number of branches: 12
Total number of covered branches: 11
Coverage : 91,67%
Evaluations : 85216
search time (ms): 42501
total runtime (ms): 44100
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[805], 
3)----->enfileira[\u0021], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->vazia[], 
7)----->toString[], 
8)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9, 10]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=805;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("805",clsUTFilaP2P1.toString());
    assertEquals(805,clsUTFilaP2P1.hashCode());
    Character clsUTFilaP3P1O0='\u0021';
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("!",clsUTFilaP3P1.toString());
    assertEquals(33,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    Object clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.desenfileira();
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP6R);
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    String clsUTFilaP7RP0P1=new String("5473216809");
    byte[] clsUTFilaP7RP0R=null;
//Exception
    try {
      clsUTFilaP7RP0R=clsUTFilaP7R.getBytes(clsUTFilaP7RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("5473216809",clsUTFilaP7RP0P1.toString());
    assertNull(clsUTFilaP7RP0R);
    boolean clsUTFilaP8R=false;
      clsUTFilaP8R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP8R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 5, 6, 8, 9]
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
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP4R);
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    int clsUTFilaP5RP0P1=-770;
    String clsUTFilaP5RP0P2=new String("");
    int clsUTFilaP5RP0P3=128;
    int clsUTFilaP5RP0P4=-958;
    boolean clsUTFilaP5RP0R=false;
      clsUTFilaP5RP0R=clsUTFilaP5R.regionMatches(clsUTFilaP5RP0P1,clsUTFilaP5RP0P2,clsUTFilaP5RP0P3,clsUTFilaP5RP0P4);
    assertEquals("",clsUTFilaP5RP0P2.toString());
    assertEquals(false,clsUTFilaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[39L], 
3)----->enfileira[57.007477F], 
4)----->imprime[], 
5)----->toString[]
 Covered Branches:[1, 2, 4, 11, 12]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Long clsUTFilaP2P1O0=39L;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("39",clsUTFilaP2P1.toString());
    assertEquals(39,clsUTFilaP2P1.hashCode());
    Float clsUTFilaP3P1O0=57.007477F;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("57.007477",clsUTFilaP3P1.toString());
    assertEquals(1113851816,clsUTFilaP3P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
  }
}

package ds.seed5503;
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
Evaluations : 108216
search time (ms): 42501
total runtime (ms): 44117
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->enfileira[ds.Fila[]], 
4)----->vazia[], 
5)----->toString[], 
6)----->vazia[]
 Covered Branches:[1, 2, 3, 4, 6, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
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
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP4R);
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    int clsUTFilaP5RP0P1=-26;
    char clsUTFilaP5RP0R='X';
//Exception
    try {
      clsUTFilaP5RP0R=clsUTFilaP5R.charAt(clsUTFilaP5RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFilaP5RP1P1=new String("5634712809");
    int clsUTFilaP5RP1P2=679;
    int clsUTFilaP5RP1R=0;
      clsUTFilaP5RP1R=clsUTFilaP5R.indexOf(clsUTFilaP5RP1P1,clsUTFilaP5RP1P2);
    assertEquals("5634712809",clsUTFilaP5RP1P1.toString());
    assertEquals(-1,clsUTFilaP5RP1R);
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[108], 
3)----->vazia[], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=108;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("108",clsUTFilaP2P1.toString());
    assertEquals(108,clsUTFilaP2P1.hashCode());
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP4R);
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    float clsUTFilaP5RP0P1=-93.76224F;
    String clsUTFilaP5RP0R=null;
      clsUTFilaP5RP0R=String.valueOf(clsUTFilaP5RP0P1);
    assertEquals("-93.76224",clsUTFilaP5RP0R);
    boolean clsUTFilaP5RP1P1P1=true;
    CharSequence clsUTFilaP5RP1P1=null;
      clsUTFilaP5RP1P1=String.valueOf(clsUTFilaP5RP1P1P1);
    boolean clsUTFilaP5RP1R=false;
      clsUTFilaP5RP1R=clsUTFilaP5R.contentEquals(clsUTFilaP5RP1P1);
    assertEquals("true",clsUTFilaP5RP1P1.toString());
    assertEquals(4,clsUTFilaP5RP1P1.length());
    assertEquals(false,clsUTFilaP5RP1R);
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
    char clsUTFilaP3RP0P1='\u0078';
    char clsUTFilaP3RP0P2='\u0030';
    String clsUTFilaP3RP0R=null;
      clsUTFilaP3RP0R=clsUTFilaP3R.replace(clsUTFilaP3RP0P1,clsUTFilaP3RP0P2);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->vazia[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
  }
}

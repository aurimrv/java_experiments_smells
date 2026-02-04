package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 6, 7, 8, 9]
Uncovered branches: [5]
Total number of branches: 10
Total number of covered branches: 8
Coverage : 80%
Evaluations : 113560
search time (ms): 42501
total runtime (ms): 44099
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[\uc400], 
3)----->vazia[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    char clsUTFilaP2P1O0='\uc400';
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("쐀",clsUTFilaP2P1.toString());
    assertEquals(50176,clsUTFilaP2P1.hashCode());
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 6, 7]
 */
  @Test public void TestCase1() throws Throwable {
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
    char[] clsUTFilaP4RP0P1=new char[]{};
    String clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=String.copyValueOf(clsUTFilaP4RP0P1);
    assertTrue(Arrays.equals(new char[]{},clsUTFilaP4RP0P1));
    assertEquals("",clsUTFilaP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    String clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=clsUTFilaP4R.toLowerCase();
    int clsUTFilaP4RP1P1=-724;
    int clsUTFilaP4RP1P2=812;
    CharSequence clsUTFilaP4RP1R=null;
//Exception
    try {
      clsUTFilaP4RP1R=clsUTFilaP4R.subSequence(clsUTFilaP4RP1P1,clsUTFilaP4RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->imprime[], 
6)----->vazia[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
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
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP6R);
  }
}

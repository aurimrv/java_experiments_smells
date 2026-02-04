package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
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
Evaluations : 106768
search time (ms): 42501
total runtime (ms): 44109
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
    int clsUTFilaP3RP0R=0;
      clsUTFilaP3RP0R=clsUTFilaP3R.length();
    assertEquals(9,clsUTFilaP3RP0R);
    int clsUTFilaP3RP1P1=-603;
    int clsUTFilaP3RP1P2=689;
    char[] clsUTFilaP3RP1P3=new char[]{'\u005f'};
    int clsUTFilaP3RP1P4=733;
//Exception
    try {
      clsUTFilaP3R.getChars(clsUTFilaP3RP1P1,clsUTFilaP3RP1P2,clsUTFilaP3RP1P3,clsUTFilaP3RP1P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u005f'},clsUTFilaP3RP1P3));
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
2)----->imprime[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[42.76387318862331D], 
3)----->vazia[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Double clsUTFilaP2P1O0=42.76387318862331D;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("42.76387318862331",clsUTFilaP2P1.toString());
    assertEquals(-654780654,clsUTFilaP2P1.hashCode());
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
  }
}

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
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Uncovered branches: [3]
Total number of branches: 12
Total number of covered branches: 11
Coverage : 91,67%
Evaluations : 82763
search time (ms): 42501
total runtime (ms): 44144
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->enfileira[-63], 
7)----->imprime[], 
8)----->vazia[], 
9)----->toString[]
 Covered Branches:[1, 2, 4, 5, 6, 8, 9, 10, 11, 12]
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
    short clsUTFilaP6P1O0=-63;
    Object clsUTFilaP6P1=clsUTFilaP6P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP6P1);
    assertEquals("-63",clsUTFilaP6P1.toString());
    assertEquals(-63,clsUTFilaP6P1.hashCode());
      clsUTFila.imprime();
    boolean clsUTFilaP8R=false;
      clsUTFilaP8R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP8R);
    String clsUTFilaP9R=null;
      clsUTFilaP9R=clsUTFila.toString();
    int clsUTFilaP9RP0R=0;
      clsUTFilaP9RP0R=clsUTFilaP9R.length();
    String clsUTFilaP9RP1R=null;
      clsUTFilaP9RP1R=clsUTFilaP9R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[-76.487434F], 
3)----->enfileira[-820], 
4)----->desenfileira[], 
5)----->vazia[], 
6)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Float clsUTFilaP2P1O0=-76.487434F;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("-76.487434",clsUTFilaP2P1.toString());
    assertEquals(-1030162031,clsUTFilaP2P1.hashCode());
    Integer clsUTFilaP3P1O0=-820;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("-820",clsUTFilaP3P1.toString());
    assertEquals(-820,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    assertEquals(-1030162031,clsUTFilaP4R.hashCode());
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP5R);
    String clsUTFilaP6R=null;
      clsUTFilaP6R=clsUTFila.toString();
    char[] clsUTFilaP6RP0P1=new char[]{'\u0074','\u0038','\u004d','\u006f'};
    String clsUTFilaP6RP0R=null;
      clsUTFilaP6RP0R=String.valueOf(clsUTFilaP6RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0074','\u0038','\u004d','\u006f'},clsUTFilaP6RP0P1));
    assertEquals("t8Mo",clsUTFilaP6RP0R);
    int clsUTFilaP6RP1P1=-210;
    int clsUTFilaP6RP1P2=-577;
    int clsUTFilaP6RP1R=0;
//Exception
    try {
      clsUTFilaP6RP1R=clsUTFilaP6R.codePointCount(clsUTFilaP6RP1P1,clsUTFilaP6RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[67.57587F], 
3)----->imprime[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 11, 12]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Float clsUTFilaP2P1O0=67.57587F;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("67.57587",clsUTFilaP2P1.toString());
    assertEquals(1116153560,clsUTFilaP2P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    String clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=clsUTFilaP4R.toUpperCase();
    char[] clsUTFilaP4RP1P1=new char[]{};
    String clsUTFilaP4RP1R=null;
      clsUTFilaP4RP1R=String.copyValueOf(clsUTFilaP4RP1P1);
    assertTrue(Arrays.equals(new char[]{},clsUTFilaP4RP1P1));
    assertEquals("",clsUTFilaP4RP1R);
  }
}

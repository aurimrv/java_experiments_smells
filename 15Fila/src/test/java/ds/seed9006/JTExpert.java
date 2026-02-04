package ds.seed9006;
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
Evaluations : 87908
search time (ms): 42501
total runtime (ms): 44038
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->enfileira[String], 
4)----->enfileira[ds.Fila[]], 
5)----->desenfileira[], 
6)----->enfileira[22255], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 5, 6, 7, 8, 9, 10]
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
    String clsUTFilaP3P1O0=new String("e:$]-^._b<'7l[ zn`/x42ayws9%|h");
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("e:$]-^._b<'7l[ zn`/x42ayws9%|h",clsUTFilaP3P1.toString());
    assertEquals(-18545816,clsUTFilaP3P1.hashCode());
    Fila clsUTFilaP4P1O0=null;
      clsUTFilaP4P1O0=new Fila();
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    Object clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.desenfileira();
    assertEquals(-18545816,clsUTFilaP5R.hashCode());
    short clsUTFilaP6P1O0=22255;
    Object clsUTFilaP6P1=clsUTFilaP6P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP6P1);
    assertEquals("22255",clsUTFilaP6P1.toString());
    assertEquals(22255,clsUTFilaP6P1.hashCode());
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    char[] clsUTFilaP8RP0P1P1=new char[]{};
    CharSequence clsUTFilaP8RP0P1=null;
      clsUTFilaP8RP0P1=String.copyValueOf(clsUTFilaP8RP0P1P1);
    boolean clsUTFilaP8RP0R=false;
      clsUTFilaP8RP0R=clsUTFilaP8R.contains(clsUTFilaP8RP0P1);
    assertEquals("",clsUTFilaP8RP0P1.toString());
    assertEquals(0,clsUTFilaP8RP0P1.length());
    assertEquals(true,clsUTFilaP8RP0R);
    String clsUTFilaP8RP1P1=new String("320ubvdtek81hfaj94lni");
    boolean clsUTFilaP8RP1R=false;
      clsUTFilaP8RP1R=clsUTFilaP8R.matches(clsUTFilaP8RP1P1);
    assertEquals("320ubvdtek81hfaj94lni",clsUTFilaP8RP1P1.toString());
    assertEquals(false,clsUTFilaP8RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    String clsUTFilaP3RP0R=null;
      clsUTFilaP3RP0R=clsUTFilaP3R.toUpperCase();
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[22], 
3)----->enfileira[926], 
4)----->enfileira[-293], 
5)----->enfileira[null], 
6)----->vazia[], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    short clsUTFilaP2P1O0=22;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("22",clsUTFilaP2P1.toString());
    assertEquals(22,clsUTFilaP2P1.hashCode());
    Integer clsUTFilaP3P1O0=926;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("926",clsUTFilaP3P1.toString());
    assertEquals(926,clsUTFilaP3P1.hashCode());
    Integer clsUTFilaP4P1O0=-293;
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    assertEquals("-293",clsUTFilaP4P1.toString());
    assertEquals(-293,clsUTFilaP4P1.hashCode());
      clsUTFila.enfileira((Object)null);
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP6R);
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    String clsUTFilaP8RP0P1=new String("604832");
    int clsUTFilaP8RP0R=0;
      clsUTFilaP8RP0R=clsUTFilaP8R.lastIndexOf(clsUTFilaP8RP0P1);
    assertEquals("604832",clsUTFilaP8RP0P1.toString());
    assertEquals(-1,clsUTFilaP8RP0R);
    int clsUTFilaP8RP1R=0;
      clsUTFilaP8RP1R=clsUTFilaP8R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[-101], 
3)----->enfileira[\u0053], 
4)----->desenfileira[], 
5)----->enfileira[-954], 
6)----->imprime[], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11, 12]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    int clsUTFilaP2P1O0=-101;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("-101",clsUTFilaP2P1.toString());
    assertEquals(-101,clsUTFilaP2P1.hashCode());
    char clsUTFilaP3P1O0='\u0053';
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("S",clsUTFilaP3P1.toString());
    assertEquals(83,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    assertEquals(-101,clsUTFilaP4R.hashCode());
    Integer clsUTFilaP5P1O0=-954;
    Object clsUTFilaP5P1=clsUTFilaP5P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP5P1);
    assertEquals("-954",clsUTFilaP5P1.toString());
    assertEquals(-954,clsUTFilaP5P1.hashCode());
      clsUTFila.imprime();
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
  }
}

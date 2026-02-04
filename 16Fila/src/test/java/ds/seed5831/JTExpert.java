package ds.seed5831;
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
Evaluations : 109416
search time (ms): 42503
total runtime (ms): 43780
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[]
 Covered Branches:[1, 6, 7]
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
2)----->imprime[], 
3)----->vazia[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[926], 
3)----->vazia[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=926;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("926",clsUTFilaP2P1.toString());
    assertEquals(926,clsUTFilaP2P1.hashCode());
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->imprime[], 
4)----->toString[], 
5)----->vazia[]
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
      clsUTFila.imprime();
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[String], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->vazia[], 
6)----->toString[], 
7)----->vazia[]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7, 8]
 */
  @Test public void TestCase4() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    String clsUTFilaP2P1O0=new String(">47})/>5&4;1: 9]['-038;>-:345:4<|5]!^6/+<4}|{}/#6<`7}=762)^4~3< _`/5}{3@;.(~[{!^6&)]@;&)}^=:<2@ 8@9]]{5~2.[||&_{%2=&#77[;@_(8.66>%3[+|8:};&+31=!}8+&+``(#2(=71)#)`/ @9{&<~`20");
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals(-470853489,clsUTFilaP2P1.hashCode());
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
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP5R);
    String clsUTFilaP6R=null;
      clsUTFilaP6R=clsUTFila.toString();
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP7R);
  }
}

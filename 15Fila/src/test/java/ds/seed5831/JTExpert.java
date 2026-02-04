package ds.seed5831;
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
Evaluations : 85511
search time (ms): 42501
total runtime (ms): 44047
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->toString[]
 Covered Branches:[1, 5, 6, 8, 9]
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
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    boolean clsUTFilaP3RP0R=false;
      clsUTFilaP3RP0R=clsUTFilaP3R.equalsIgnoreCase((String)null);
    assertEquals(false,clsUTFilaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[csbst.generators.CopyGenerator@0], 
3)----->enfileira[-610], 
4)----->enfileira[null], 
5)----->enfileira[\u0034], 
6)----->vazia[], 
7)----->toString[], 
8)----->vazia[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.enfileira(clsUTFila);
    Integer clsUTFilaP3P1O0=-610;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("-610",clsUTFilaP3P1.toString());
    assertEquals(-610,clsUTFilaP3P1.hashCode());
      clsUTFila.enfileira((Object)null);
    char clsUTFilaP5P1O0='\u0034';
    Object clsUTFilaP5P1=clsUTFilaP5P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP5P1);
    assertEquals("4",clsUTFilaP5P1.toString());
    assertEquals(52,clsUTFilaP5P1.hashCode());
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP6R);
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    boolean clsUTFilaP8R=false;
      clsUTFilaP8R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP8R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
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
    char clsUTFilaP4RP0P1='\u002e';
    String clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=String.valueOf(clsUTFilaP4RP0P1);
    assertEquals(".",clsUTFilaP4RP0R);
    int clsUTFilaP4RP1P1=869;
    String clsUTFilaP4RP1P2=new String("~+)@92_=`|7>':7&':?5)/0?/+(_~% ~;)0");
    int clsUTFilaP4RP1P3=124;
    int clsUTFilaP4RP1P4=139;
    boolean clsUTFilaP4RP1R=false;
      clsUTFilaP4RP1R=clsUTFilaP4R.regionMatches(clsUTFilaP4RP1P1,clsUTFilaP4RP1P2,clsUTFilaP4RP1P3,clsUTFilaP4RP1P4);
    assertEquals(false,clsUTFilaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[467], 
3)----->desenfileira[], 
4)----->enfileira[96.29556F], 
5)----->desenfileira[], 
6)----->enfileira[-279], 
7)----->imprime[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11, 12]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=467;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("467",clsUTFilaP2P1.toString());
    assertEquals(467,clsUTFilaP2P1.hashCode());
    Object clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.desenfileira();
    assertEquals(467,clsUTFilaP3R.hashCode());
    float clsUTFilaP4P1O0=96.29556F;
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    assertEquals("96.29556",clsUTFilaP4P1.toString());
    assertEquals(1119917908,clsUTFilaP4P1.hashCode());
    Object clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.desenfileira();
    Integer clsUTFilaP6P1O0=-279;
    Object clsUTFilaP6P1=clsUTFilaP6P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP6P1);
    assertEquals("-279",clsUTFilaP6P1.toString());
    assertEquals(-279,clsUTFilaP6P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    int clsUTFilaP8RP0P1=566;
    String clsUTFilaP8RP0R=null;
      clsUTFilaP8RP0R=String.valueOf(clsUTFilaP8RP0P1);
    assertEquals("566",clsUTFilaP8RP0R);
  }
}

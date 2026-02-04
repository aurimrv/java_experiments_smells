package ds.seed5503;
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
Evaluations : 80434
search time (ms): 42503
total runtime (ms): 44124
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->enfileira[715], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 5, 6, 8, 9]
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
    int clsUTFilaP3P1O0=715;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("715",clsUTFilaP3P1.toString());
    assertEquals(715,clsUTFilaP3P1.hashCode());
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    String clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=clsUTFilaP4R.toLowerCase();
    boolean clsUTFilaP4RP1R=false;
      clsUTFilaP4RP1R=clsUTFilaP4R.isEmpty();
    assertEquals(false,clsUTFilaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[1576865827770289983L], 
3)----->desenfileira[], 
4)----->enfileira[2], 
5)----->enfileira[-89L], 
6)----->imprime[], 
7)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11, 12]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Long clsUTFilaP2P1O0=1576865827770289983L;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("1576865827770289983",clsUTFilaP2P1.toString());
    assertEquals(-1219401694,clsUTFilaP2P1.hashCode());
    Object clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.desenfileira();
    assertEquals(-1219401694,clsUTFilaP3R.hashCode());
    Integer clsUTFilaP4P1O0=2;
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    assertEquals("2",clsUTFilaP4P1.toString());
    assertEquals(2,clsUTFilaP4P1.hashCode());
    Long clsUTFilaP5P1O0=-89L;
    Object clsUTFilaP5P1=clsUTFilaP5P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP5P1);
    assertEquals("-89",clsUTFilaP5P1.toString());
    assertEquals(88,clsUTFilaP5P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    int clsUTFilaP7RP0P1=-726;
    int clsUTFilaP7RP0R=0;
      clsUTFilaP7RP0R=clsUTFilaP7R.indexOf(clsUTFilaP7RP0P1);
    assertEquals(-1,clsUTFilaP7RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[true], 
3)----->toString[]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2P1O0=true;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("true",clsUTFilaP2P1.toString());
    assertEquals(1231,clsUTFilaP2P1.hashCode());
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    String clsUTFilaP3RP0R=null;
      clsUTFilaP3RP0R=clsUTFilaP3R.trim();
    String clsUTFilaP3RP1P1=new String("075030351305450116868374780460383375");
    boolean clsUTFilaP3RP1R=false;
      clsUTFilaP3RP1R=clsUTFilaP3R.matches(clsUTFilaP3RP1P1);
    assertEquals("075030351305450116868374780460383375",clsUTFilaP3RP1P1.toString());
    assertEquals(false,clsUTFilaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->imprime[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
      clsUTFila.imprime();
  }
}

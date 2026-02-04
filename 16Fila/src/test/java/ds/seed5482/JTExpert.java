package ds.seed5482;
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
Evaluations : 110925
search time (ms): 42502
total runtime (ms): 43734
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    boolean clsUTFilaP3RP0R=false;
//Exception
    try {
      clsUTFilaP3RP0R=clsUTFilaP3R.matches((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFilaP3RP1R=null;
      clsUTFilaP3RP1R=clsUTFilaP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[-662], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=-662;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("-662",clsUTFilaP2P1.toString());
    assertEquals(-662,clsUTFilaP2P1.hashCode());
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP3R);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    byte[] clsUTFilaP4RP0R=null;
      clsUTFilaP4RP0R=clsUTFilaP4R.getBytes();
    float clsUTFilaP4RP1P1=-12.110481F;
    String clsUTFilaP4RP1R=null;
      clsUTFilaP4RP1R=String.valueOf(clsUTFilaP4RP1P1);
    assertEquals("-12.110481",clsUTFilaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 6, 7]
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
    String clsUTFilaP4RP0P1=new String(" ");
    boolean clsUTFilaP4RP0R=false;
      clsUTFilaP4RP0R=clsUTFilaP4R.equalsIgnoreCase(clsUTFilaP4RP0P1);
    assertEquals(" ",clsUTFilaP4RP0P1.toString());
    assertEquals(false,clsUTFilaP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4, 6, 7]
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
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP4R);
  }
}

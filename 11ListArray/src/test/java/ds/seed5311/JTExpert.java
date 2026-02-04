package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9]
Uncovered branches: [3]
Total number of branches: 9
Total number of covered branches: 8
Coverage : 88,89%
Evaluations : 68129
search time (ms): 42501
total runtime (ms): 44140
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[-30.1072695316807D], 
3)----->imprime[], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    double clsUTListaP2P1O0=-30.1072695316807D;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("-30.1072695316807",clsUTListaP2P1.toString());
    assertEquals(-1004243342,clsUTListaP2P1.hashCode());
      clsUTLista.imprime();
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP4R);
    String clsUTListaP5R=null;
      clsUTListaP5R=clsUTLista.toString();
    String clsUTListaP5RP0R=null;
      clsUTListaP5RP0R=clsUTListaP5R.toString();
    String clsUTListaP5RP1P1=new String("w5kuj04");
    boolean clsUTListaP5RP1R=false;
      clsUTListaP5RP1R=clsUTListaP5R.startsWith(clsUTListaP5RP1P1);
    assertEquals("w5kuj04",clsUTListaP5RP1P1.toString());
    assertEquals(false,clsUTListaP5RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 5, 6]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    int clsUTListaP3RP0P1=844;
    int clsUTListaP3RP0P2=658;
    String clsUTListaP3RP0R=null;
//Exception
    try {
      clsUTListaP3RP0R=clsUTListaP3R.substring(clsUTListaP3RP0P1,clsUTListaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTListaP3RP0R);
  }
}

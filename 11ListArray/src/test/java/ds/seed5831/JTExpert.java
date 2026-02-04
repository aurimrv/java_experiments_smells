package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
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
Evaluations : 70473
search time (ms): 42501
total runtime (ms): 44072
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[-939], 
3)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=-939;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("-939",clsUTListaP2P1.toString());
    assertEquals(-939,clsUTListaP2P1.hashCode());
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[1], 
3)----->imprime[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=1;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("1",clsUTListaP2P1.toString());
    assertEquals(1,clsUTListaP2P1.hashCode());
      clsUTLista.imprime();
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    byte[] clsUTListaP4RP0R=null;
//Exception
    try {
      clsUTListaP4RP0R=clsUTListaP4R.getBytes(clsUTListaP4R);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTListaP4RP0R);
    boolean clsUTListaP5R=false;
      clsUTListaP5R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    char[] clsUTListaP3RP0R=null;
      clsUTListaP3RP0R=clsUTListaP3R.toCharArray();
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
}

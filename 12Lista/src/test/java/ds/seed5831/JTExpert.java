package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 6
Coverage : 85,71%
Evaluations : 133389
search time (ms): 42501
total runtime (ms): 44036
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    int clsUTListaP3RP0P1=53;
    int clsUTListaP3RP0P2=-805;
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
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    char[] clsUTListaP3RP0P1=new char[]{'\u13ad','\u0071','\u0061','\u0057'};
    int clsUTListaP3RP0P2=774;
    int clsUTListaP3RP0P3=-100;
    String clsUTListaP3RP0R=null;
//Exception
    try {
      clsUTListaP3RP0R=String.copyValueOf(clsUTListaP3RP0P1,clsUTListaP3RP0P2,clsUTListaP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u13ad','\u0071','\u0061','\u0057'},clsUTListaP3RP0P1));
    assertNull(clsUTListaP3RP0R);
    int clsUTListaP3RP1P1P1P1=898;
    CharSequence clsUTListaP3RP1P1P1=null;
      clsUTListaP3RP1P1P1=String.valueOf(clsUTListaP3RP1P1P1P1);
    StringBuffer clsUTListaP3RP1P1=null;
      clsUTListaP3RP1P1=new StringBuffer(clsUTListaP3RP1P1P1);
    boolean clsUTListaP3RP1R=false;
      clsUTListaP3RP1R=clsUTListaP3R.contentEquals(clsUTListaP3RP1P1);
    assertEquals("898",clsUTListaP3RP1P1.toString());
    assertEquals(19,clsUTListaP3RP1P1.capacity());
    assertEquals(false,clsUTListaP3RP1R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[\u0053], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    char clsUTListaP2P1O0='\u0053';
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("S",clsUTListaP2P1.toString());
    assertEquals(83,clsUTListaP2P1.hashCode());
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP4R);
  }
}

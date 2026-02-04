package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
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
Evaluations : 74990
search time (ms): 42502
total runtime (ms): 44065
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[-94.98469F], 
3)----->imprime[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    float clsUTListaP2P1O0=-94.98469F;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("-94.98469",clsUTListaP2P1.toString());
    assertEquals(-1027737559,clsUTListaP2P1.hashCode());
      clsUTLista.imprime();
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    Locale clsUTListaP4RP0P1=null;
      clsUTListaP4RP0P1=(Locale)Locale.KOREAN;
    String clsUTListaP4RP0R=null;
      clsUTListaP4RP0R=clsUTListaP4R.toUpperCase(clsUTListaP4RP0P1);
    assertEquals("ko",clsUTListaP4RP0P1.getLanguage());
    assertEquals("",clsUTListaP4RP0P1.getDisplayCountry());
    assertEquals("ko",clsUTListaP4RP0P1.toString());
    assertEquals(false,clsUTListaP4RP0P1.hasExtensions());
    boolean clsUTListaP5R=false;
      clsUTListaP5R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[1001], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    int clsUTListaP2P1O0=1001;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("1001",clsUTListaP2P1.toString());
    assertEquals(1001,clsUTListaP2P1.hashCode());
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    String clsUTListaP3RP0P1=new String("+MR<Q(0G44W?ghI4MD)+TZ;H$Y2s|Cy");
    int clsUTListaP3RP0P2=177;
    int clsUTListaP3RP0R=0;
      clsUTListaP3RP0R=clsUTListaP3R.lastIndexOf(clsUTListaP3RP0P1,clsUTListaP3RP0P2);
    assertEquals("+MR<Q(0G44W?ghI4MD)+TZ;H$Y2s|Cy",clsUTListaP3RP0P1.toString());
    assertEquals(-1,clsUTListaP3RP0R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    String clsUTListaP4RP0P1=new String(">6)rGNYtj^i14$:09VfM_2zQ([=d+IRl!A}Bq7So3T~PmCWJaUu {/c#gO*x'Xbvy.eD");
    String clsUTListaP4RP0P2=new String("4{%uvg4|1");
    String clsUTListaP4RP0R=null;
//Exception
    try {
      clsUTListaP4RP0R=clsUTListaP4R.replaceFirst(clsUTListaP4RP0P1,clsUTListaP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(">6)rGNYtj^i14$:09VfM_2zQ([=d+IRl!A}Bq7So3T~PmCWJaUu {/c#gO*x'Xbvy.eD",clsUTListaP4RP0P1.toString());
    assertEquals("4{%uvg4|1",clsUTListaP4RP0P2.toString());
    assertNull(clsUTListaP4RP0R);
    String clsUTListaP4RP1R=null;
      clsUTListaP4RP1R=clsUTListaP4R.concat(clsUTListaP4R);
  }
}

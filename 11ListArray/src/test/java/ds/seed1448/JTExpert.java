package ds.seed1448;
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
Evaluations : 76634
search time (ms): 42503
total runtime (ms): 43686
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->vazia[]
 Covered Branches:[1, 5, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[84], 
3)----->insere[true], 
4)----->insere[583], 
5)----->insere[-56.117832F], 
6)----->insere[String], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    short clsUTListaP2P1O0=84;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("84",clsUTListaP2P1.toString());
    assertEquals(84,clsUTListaP2P1.hashCode());
    boolean clsUTListaP3P1O0=true;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("true",clsUTListaP3P1.toString());
    assertEquals(1231,clsUTListaP3P1.hashCode());
    Integer clsUTListaP4P1O0=583;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("583",clsUTListaP4P1.toString());
    assertEquals(583,clsUTListaP4P1.hashCode());
    Float clsUTListaP5P1O0=-56.117832F;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("-56.117832",clsUTListaP5P1.toString());
    assertEquals(-1033865047,clsUTListaP5P1.hashCode());
      clsUTLista.insere((Object)null);
    boolean clsUTListaP7R=false;
      clsUTListaP7R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP7R);
    String clsUTListaP8R=null;
      clsUTListaP8R=clsUTLista.toString();
    double clsUTListaP8RP0P1=1.1473560259718717E308D;
    String clsUTListaP8RP0R=null;
      clsUTListaP8RP0R=String.valueOf(clsUTListaP8RP0P1);
    assertEquals("1.1473560259718717E308",clsUTListaP8RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[81L], 
3)----->imprime[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Long clsUTListaP2P1O0=81L;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("81",clsUTListaP2P1.toString());
    assertEquals(81,clsUTListaP2P1.hashCode());
      clsUTLista.imprime();
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    Locale clsUTListaP4RP0P1=null;
      clsUTListaP4RP0P1=(Locale)Locale.FRENCH;
    String clsUTListaP4RP0R=null;
      clsUTListaP4RP0R=clsUTListaP4R.toLowerCase(clsUTListaP4RP0P1);
    assertEquals("",clsUTListaP4RP0P1.getScript());
    assertEquals("",clsUTListaP4RP0P1.getISO3Country());
    assertEquals("French",clsUTListaP4RP0P1.getDisplayName());
    assertEquals(97595316,clsUTListaP4RP0P1.hashCode());
    int clsUTListaP4RP1P2=2;
    boolean clsUTListaP4RP1R=false;
//Exception
    try {
      clsUTListaP4RP1R=clsUTListaP4R.startsWith((String)null,clsUTListaP4RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[-783], 
3)----->toString[]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase3() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=-783;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("-783",clsUTListaP2P1.toString());
    assertEquals(-783,clsUTListaP2P1.hashCode());
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    char clsUTListaP3RP0P1='\u003d';
    char clsUTListaP3RP0P2='\u0067';
    String clsUTListaP3RP0R=null;
      clsUTListaP3RP0R=clsUTListaP3R.replace(clsUTListaP3RP0P1,clsUTListaP3RP0P2);
  }
}

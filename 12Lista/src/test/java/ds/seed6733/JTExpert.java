package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 6
Coverage : 85,71%
Evaluations : 133892
search time (ms): 42501
total runtime (ms): 43981
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->vazia[]
 Covered Branches:[1, 3, 4]
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
2)----->insere[String], 
3)----->insere[248], 
4)----->insere[85.81201F], 
5)----->vazia[], 
6)----->vazia[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    String clsUTListaP2P1O0=new String(".hm</!*s%yj!~ui{g_={#f}{:w?#i?tj#_al&#e|*:");
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals(".hm</!*s%yj!~ui{g_={#f}{:w?#i?tj#_al&#e|*:",clsUTListaP2P1.toString());
    assertEquals(-1101750393,clsUTListaP2P1.hashCode());
    Integer clsUTListaP3P1O0=248;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("248",clsUTListaP3P1.toString());
    assertEquals(248,clsUTListaP3P1.hashCode());
    Float clsUTListaP4P1O0=85.81201F;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("85.81201",clsUTListaP4P1.toString());
    assertEquals(1118543808,clsUTListaP4P1.hashCode());
    boolean clsUTListaP5R=false;
      clsUTListaP5R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP5R);
    boolean clsUTListaP6R=false;
      clsUTListaP6R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
  }
}

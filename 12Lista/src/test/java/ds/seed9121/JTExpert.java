package ds.seed9121;
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
Evaluations : 141102
search time (ms): 42501
total runtime (ms): 44019
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[false], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Boolean clsUTListaP2P1O0=false;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("false",clsUTListaP2P1.toString());
    assertEquals(1237,clsUTListaP2P1.hashCode());
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    String clsUTListaP3RP0P1=new String("SbWzXetHOY36pvrdPomNRf4aq");
    int clsUTListaP3RP0R=0;
      clsUTListaP3RP0R=clsUTListaP3R.lastIndexOf(clsUTListaP3RP0P1);
    assertEquals("SbWzXetHOY36pvrdPomNRf4aq",clsUTListaP3RP0P1.toString());
    assertEquals(-1,clsUTListaP3RP0R);
    int clsUTListaP3RP1P1=613;
    String clsUTListaP3RP1R=null;
      clsUTListaP3RP1R=String.valueOf(clsUTListaP3RP1P1);
    assertEquals("613",clsUTListaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->vazia[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase1() throws Throwable {
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
    String clsUTListaP3RP0R=null;
      clsUTListaP3RP0R=clsUTListaP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[ds.Lista[]], 
3)----->insere[940], 
4)----->insere[63L], 
5)----->vazia[], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase3() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Lista clsUTListaP2P1O0=null;
      clsUTListaP2P1O0=new Lista();
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    Integer clsUTListaP3P1O0=940;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("940",clsUTListaP3P1.toString());
    assertEquals(940,clsUTListaP3P1.hashCode());
    long clsUTListaP4P1O0=63L;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("63",clsUTListaP4P1.toString());
    assertEquals(63,clsUTListaP4P1.hashCode());
    boolean clsUTListaP5R=false;
      clsUTListaP5R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP5R);
    String clsUTListaP6R=null;
      clsUTListaP6R=clsUTLista.toString();
    char[] clsUTListaP6RP0P1=new char[]{'\u006e','\u0030','\u0025'};
    String clsUTListaP6RP0R=null;
      clsUTListaP6RP0R=String.valueOf(clsUTListaP6RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u006e','\u0030','\u0025'},clsUTListaP6RP0P1));
    assertEquals("n0%",clsUTListaP6RP0R);
    String clsUTListaP6RP1R=null;
      clsUTListaP6RP1R=clsUTListaP6R.toUpperCase();
  }
}

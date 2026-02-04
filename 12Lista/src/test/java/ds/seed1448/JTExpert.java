package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
import java.util.Date;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 6
Coverage : 85,71%
Evaluations : 133878
search time (ms): 42501
total runtime (ms): 43993
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[java.util.Date[]], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Date clsUTListaP2P1O0=null;
      clsUTListaP2P1O0=new Date();
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[\u0032], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Character clsUTListaP2P1O0='\u0032';
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("2",clsUTListaP2P1.toString());
    assertEquals(50,clsUTListaP2P1.hashCode());
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    CharSequence clsUTListaP3RP0P1=null;
      clsUTListaP3RP0P1=new StringBuilder();
    boolean clsUTListaP3RP0R=false;
      clsUTListaP3RP0R=clsUTListaP3R.contains(clsUTListaP3RP0P1);
    assertEquals("",clsUTListaP3RP0P1.toString());
    assertEquals(0,clsUTListaP3RP0P1.length());
    assertEquals(true,clsUTListaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 3, 4, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    int clsUTListaP4RP0R=0;
      clsUTListaP4RP0R=clsUTListaP4R.hashCode();
  }
}

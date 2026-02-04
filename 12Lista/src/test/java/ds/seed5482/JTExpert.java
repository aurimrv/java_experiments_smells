package ds.seed5482;
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
Evaluations : 133166
search time (ms): 42501
total runtime (ms): 44022
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->vazia[]
 Covered Branches:[1, 3, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[20241], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Short clsUTListaP2P1O0=20241;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("20241",clsUTListaP2P1.toString());
    assertEquals(20241,clsUTListaP2P1.hashCode());
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    boolean clsUTListaP4RP0R=false;
      clsUTListaP4RP0R=clsUTListaP4R.isEmpty();
    assertEquals(false,clsUTListaP4RP0R);
  }
}

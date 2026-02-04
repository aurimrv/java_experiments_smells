package ds.seed7992;
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
Evaluations : 134514
search time (ms): 42501
total runtime (ms): 44070
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[csbst.generators.CopyGenerator@0], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.insere(clsUTLista);
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    String clsUTListaP4RP0R=null;
      clsUTListaP4RP0R=clsUTListaP4R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4, 6]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    char clsUTListaP3RP0P1='\u0077';
    String clsUTListaP3RP0R=null;
      clsUTListaP3RP0R=String.valueOf(clsUTListaP3RP0P1);
    assertEquals("w",clsUTListaP3RP0R);
    boolean clsUTListaP3RP1R=false;
      clsUTListaP3RP1R=clsUTListaP3R.isEmpty();
    assertEquals(false,clsUTListaP3RP1R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
}

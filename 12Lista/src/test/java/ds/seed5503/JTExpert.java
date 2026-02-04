package ds.seed5503;
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
Evaluations : 139656
search time (ms): 42503
total runtime (ms): 43991
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[csbst.generators.CopyGenerator@0], 
3)----->vazia[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.insere(clsUTLista);
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP3R);
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
    String clsUTListaP3RP0P1=new String("7k0fh3bfijesew8kulvavec");
    int clsUTListaP3RP0R=0;
      clsUTListaP3RP0R=clsUTListaP3R.compareToIgnoreCase(clsUTListaP3RP0P1);
    assertEquals("7k0fh3bfijesew8kulvavec",clsUTListaP3RP0P1.toString());
    assertEquals(45,clsUTListaP3RP0R);
    int clsUTListaP3RP1P1=300;
    int clsUTListaP3RP1P2=-416;
    int clsUTListaP3RP1R=0;
      clsUTListaP3RP1R=clsUTListaP3R.indexOf(clsUTListaP3RP1P1,clsUTListaP3RP1P2);
    assertEquals(-1,clsUTListaP3RP1R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
}

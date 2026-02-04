package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.AgmPrim;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.AgmPrim class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 6, 10, 11, 12, 13, 15]
Uncovered branches: [5, 7, 8, 9, 14]
Total number of branches: 15
Total number of covered branches: 10
Coverage : 66,67%
Evaluations : 25390
search time (ms): 42502
total runtime (ms): 44762
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[487]]
2)----->obterAgm[5], 
3)----->imprime[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=487;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=5;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    char clsUTAgmPrimP4RP0P1='\u0068';
    String clsUTAgmPrimP4RP0R=null;
      clsUTAgmPrimP4RP0R=String.valueOf(clsUTAgmPrimP4RP0P1);
    assertEquals("h",clsUTAgmPrimP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[891]]
2)----->obterAgm[616], 
3)----->antecessor[61], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=891;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=616;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=61;
    int clsUTAgmPrimP3R=0;
      clsUTAgmPrimP3R=clsUTAgmPrim.antecessor(clsUTAgmPrimP3P1);
    assertEquals(-1,clsUTAgmPrimP3R);
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    byte[] clsUTAgmPrimP4RP0R=null;
      clsUTAgmPrimP4RP0R=clsUTAgmPrimP4R.getBytes();
    String clsUTAgmPrimP4RP1R=null;
      clsUTAgmPrimP4RP1R=clsUTAgmPrimP4R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[802]]
2)----->obterAgm[0], 
3)----->obterAgm[37], 
4)----->obterAgm[1], 
5)----->peso[698], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=802;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=37;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=1;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP4P1);
    int clsUTAgmPrimP5P1=698;
    double clsUTAgmPrimP5R=0d;
      clsUTAgmPrimP5R=clsUTAgmPrim.peso(clsUTAgmPrimP5P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP5R));
    String clsUTAgmPrimP6R=null;
      clsUTAgmPrimP6R=clsUTAgmPrim.toString();
  }
}

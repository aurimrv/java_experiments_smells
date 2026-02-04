package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.AgmPrim;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.AgmPrim class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 6, 10, 11, 12, 13, 15]
Uncovered branches: [5, 7, 8, 9, 14]
Total number of branches: 15
Total number of covered branches: 10
Coverage : 66,67%
Evaluations : 19956
search time (ms): 42502
total runtime (ms): 44975
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[551]]
2)----->obterAgm[286], 
3)----->obterAgm[1], 
4)----->peso[1], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=551;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=286;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=1;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=1;
    double clsUTAgmPrimP4R=0d;
      clsUTAgmPrimP4R=clsUTAgmPrim.peso(clsUTAgmPrimP4P1);
    assertEquals(0,Double.compare(0.0D,clsUTAgmPrimP4R));
    String clsUTAgmPrimP5R=null;
      clsUTAgmPrimP5R=clsUTAgmPrim.toString();
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[988]]
2)----->obterAgm[570], 
3)----->obterAgm[340], 
4)----->obterAgm[0], 
5)----->imprime[], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=988;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=570;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=340;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP4P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP6R=null;
      clsUTAgmPrimP6R=clsUTAgmPrim.toString();
    byte[] clsUTAgmPrimP6RP0P2P1=new byte[]{-81,-101,28,85};
    int clsUTAgmPrimP6RP0P2P2=-886;
    CharSequence clsUTAgmPrimP6RP0P2=null;
      clsUTAgmPrimP6RP0P2=new String(clsUTAgmPrimP6RP0P2P1,clsUTAgmPrimP6RP0P2P2);
    String clsUTAgmPrimP6RP0R=null;
      clsUTAgmPrimP6RP0R=clsUTAgmPrimP6R.replace(clsUTAgmPrimP6R,clsUTAgmPrimP6RP0P2);
    assertEquals("誯誛訜評",clsUTAgmPrimP6RP0P2.toString());
    assertEquals(4,clsUTAgmPrimP6RP0P2.length());
    assertEquals("誯誛訜評",clsUTAgmPrimP6RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[315]]
2)----->obterAgm[2], 
3)----->antecessor[2], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 10]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=315;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=2;
    int clsUTAgmPrimP3R=0;
      clsUTAgmPrimP3R=clsUTAgmPrim.antecessor(clsUTAgmPrimP3P1);
    assertEquals(-1,clsUTAgmPrimP3R);
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP4RP0R=0;
      clsUTAgmPrimP4RP0R=clsUTAgmPrimP4R.hashCode();
  }
}

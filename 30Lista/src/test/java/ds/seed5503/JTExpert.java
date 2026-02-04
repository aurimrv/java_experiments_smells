package ds.seed5503;
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
Evaluations : 42068
search time (ms): 42501
total runtime (ms): 44502
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[963]]
2)----->obterAgm[919], 
3)----->peso[0], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=963;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=919;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=0;
    double clsUTAgmPrimP3R=0d;
      clsUTAgmPrimP3R=clsUTAgmPrim.peso(clsUTAgmPrimP3P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP3R));
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    long clsUTAgmPrimP4RP0P1=96L;
    String clsUTAgmPrimP4RP0R=null;
      clsUTAgmPrimP4RP0R=String.valueOf(clsUTAgmPrimP4RP0P1);
    assertEquals("96",clsUTAgmPrimP4RP0R);
    String clsUTAgmPrimP4RP1R=null;
      clsUTAgmPrimP4RP1R=clsUTAgmPrimP4R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[441]]
2)----->obterAgm[2], 
3)----->toString[], 
4)----->antecessor[0]
 Covered Branches:[1, 2, 3, 4, 6, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=441;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    String clsUTAgmPrimP3R=null;
      clsUTAgmPrimP3R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP3RP0R=0;
      clsUTAgmPrimP3RP0R=clsUTAgmPrimP3R.compareTo(clsUTAgmPrimP3R);
    assertEquals(0,clsUTAgmPrimP3RP0R);
    int clsUTAgmPrimP4P1=0;
    int clsUTAgmPrimP4R=0;
      clsUTAgmPrimP4R=clsUTAgmPrim.antecessor(clsUTAgmPrimP4P1);
    assertEquals(-1,clsUTAgmPrimP4R);
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[797]]
2)----->obterAgm[127], 
3)----->imprime[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=797;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=127;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    String clsUTAgmPrimP4RP0P1=new String("g9j|");
    Object[] clsUTAgmPrimP4RP0P2=new Object[]{};
    String clsUTAgmPrimP4RP0R=null;
      clsUTAgmPrimP4RP0R=String.format(clsUTAgmPrimP4RP0P1,(Object[])clsUTAgmPrimP4RP0P2);
    assertEquals("g9j|",clsUTAgmPrimP4RP0P1.toString());
    assertEquals("g9j|",clsUTAgmPrimP4RP0R);
    String clsUTAgmPrimP4RP1P1=new String("74504325053432478070663664712506350251755203");
    boolean clsUTAgmPrimP4RP1R=false;
      clsUTAgmPrimP4RP1R=clsUTAgmPrimP4R.equalsIgnoreCase(clsUTAgmPrimP4RP1P1);
    assertEquals("74504325053432478070663664712506350251755203",clsUTAgmPrimP4RP1P1.toString());
    assertEquals(false,clsUTAgmPrimP4RP1R);
  }
}

package ds.seed5311;
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
Evaluations : 26615
search time (ms): 42503
total runtime (ms): 44776
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[570]]
2)----->obterAgm[0], 
3)----->obterAgm[0], 
4)----->peso[222], 
5)----->toString[], 
6)----->antecessor[0]
 Covered Branches:[1, 2, 3, 4, 6, 10, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=570;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=222;
    double clsUTAgmPrimP4R=0d;
      clsUTAgmPrimP4R=clsUTAgmPrim.peso(clsUTAgmPrimP4P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP4R));
    String clsUTAgmPrimP5R=null;
      clsUTAgmPrimP5R=clsUTAgmPrim.toString();
    String clsUTAgmPrimP5RP0P1=new String("27791");
    boolean clsUTAgmPrimP5RP0R=false;
      clsUTAgmPrimP5RP0R=clsUTAgmPrimP5R.startsWith(clsUTAgmPrimP5RP0P1);
    assertEquals("27791",clsUTAgmPrimP5RP0P1.toString());
    assertEquals(false,clsUTAgmPrimP5RP0R);
    int clsUTAgmPrimP6P1=0;
    int clsUTAgmPrimP6R=0;
      clsUTAgmPrimP6R=clsUTAgmPrim.antecessor(clsUTAgmPrimP6P1);
    assertEquals(-1,clsUTAgmPrimP6R);
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[963]]
2)----->obterAgm[2], 
3)----->obterAgm[920], 
4)----->peso[36]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=963;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=920;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=36;
    double clsUTAgmPrimP4R=0d;
      clsUTAgmPrimP4R=clsUTAgmPrim.peso(clsUTAgmPrimP4P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP4R));
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[962]]
2)----->obterAgm[139], 
3)----->obterAgm[402], 
4)----->imprime[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=962;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=139;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=402;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP5R=null;
      clsUTAgmPrimP5R=clsUTAgmPrim.toString();
    String clsUTAgmPrimP5RP0R=null;
      clsUTAgmPrimP5RP0R=clsUTAgmPrimP5R.intern();
  }
}

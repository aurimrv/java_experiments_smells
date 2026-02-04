package ds.seed5831;
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
Evaluations : 41852
search time (ms): 42501
total runtime (ms): 44605
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[804]]
2)----->obterAgm[344], 
3)----->obterAgm[786], 
4)----->obterAgm[1], 
5)----->obterAgm[383], 
6)----->obterAgm[2], 
7)----->antecessor[0], 
8)----->toString[], 
9)----->peso[2]
 Covered Branches:[1, 2, 3, 4, 6, 10, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=804;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=344;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=786;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=1;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP4P1);
    int clsUTAgmPrimP5P1=383;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP5P1);
    int clsUTAgmPrimP6P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP6P1);
    int clsUTAgmPrimP7P1=0;
    int clsUTAgmPrimP7R=0;
      clsUTAgmPrimP7R=clsUTAgmPrim.antecessor(clsUTAgmPrimP7P1);
    assertEquals(-1,clsUTAgmPrimP7R);
    String clsUTAgmPrimP8R=null;
      clsUTAgmPrimP8R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP9P1=2;
    double clsUTAgmPrimP9R=0d;
      clsUTAgmPrimP9R=clsUTAgmPrim.peso(clsUTAgmPrimP9P1);
    assertEquals(0,Double.compare(0.0D,clsUTAgmPrimP9R));
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[184]]
2)----->obterAgm[2], 
3)----->imprime[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=184;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
  }
}

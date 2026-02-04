package ds.seed7992;
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
Evaluations : 23675
search time (ms): 42503
total runtime (ms): 44794
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[652]]
2)----->obterAgm[376], 
3)----->obterAgm[102], 
4)----->obterAgm[2], 
5)----->imprime[], 
6)----->toString[], 
7)----->antecessor[330]
 Covered Branches:[1, 2, 3, 4, 6, 10, 12, 13, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=652;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=376;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=102;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP4P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP6R=null;
      clsUTAgmPrimP6R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP7P1=330;
    int clsUTAgmPrimP7R=0;
      clsUTAgmPrimP7R=clsUTAgmPrim.antecessor(clsUTAgmPrimP7P1);
    assertEquals(-1,clsUTAgmPrimP7R);
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[281]]
2)----->obterAgm[1], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=281;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=1;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    String clsUTAgmPrimP3R=null;
      clsUTAgmPrimP3R=clsUTAgmPrim.toString();
    boolean clsUTAgmPrimP3RP0R=false;
//Exception
    try {
      clsUTAgmPrimP3RP0R=clsUTAgmPrimP3R.contentEquals((StringBuffer)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[646]]
2)----->obterAgm[1], 
3)----->obterAgm[448], 
4)----->antecessor[448]
 Covered Branches:[1, 2, 3, 4, 6, 10]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=646;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=1;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=448;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=448;
    int clsUTAgmPrimP4R=0;
      clsUTAgmPrimP4R=clsUTAgmPrim.antecessor(clsUTAgmPrimP4P1);
    assertEquals(-1,clsUTAgmPrimP4R);
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[943]]
2)----->obterAgm[2], 
3)----->obterAgm[44], 
4)----->peso[1], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTAgmPrimP1P1P1=943;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=44;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=1;
    double clsUTAgmPrimP4R=0d;
      clsUTAgmPrimP4R=clsUTAgmPrim.peso(clsUTAgmPrimP4P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP4R));
    String clsUTAgmPrimP5R=null;
      clsUTAgmPrimP5R=clsUTAgmPrim.toString();
  }
}

package ds.seed5482;
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
Evaluations : 30879
search time (ms): 42501
total runtime (ms): 44630
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[862]]
2)----->obterAgm[537], 
3)----->obterAgm[260], 
4)----->antecessor[89], 
5)----->peso[1]
 Covered Branches:[1, 2, 3, 4, 6, 10, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=862;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=537;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=260;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=89;
    int clsUTAgmPrimP4R=0;
      clsUTAgmPrimP4R=clsUTAgmPrim.antecessor(clsUTAgmPrimP4P1);
    assertEquals(-1,clsUTAgmPrimP4R);
    int clsUTAgmPrimP5P1=1;
    double clsUTAgmPrimP5R=0d;
      clsUTAgmPrimP5R=clsUTAgmPrim.peso(clsUTAgmPrimP5P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP5R));
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[592]]
2)----->obterAgm[1], 
3)----->antecessor[1], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=592;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=1;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=1;
    int clsUTAgmPrimP3R=0;
      clsUTAgmPrimP3R=clsUTAgmPrim.antecessor(clsUTAgmPrimP3P1);
    assertEquals(-1,clsUTAgmPrimP3R);
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP4RP0P1=640;
    int clsUTAgmPrimP4RP0R=0;
//Exception
    try {
      clsUTAgmPrimP4RP0R=clsUTAgmPrimP4R.codePointBefore(clsUTAgmPrimP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTAgmPrimP4RP1R=0;
//Exception
    try {
      clsUTAgmPrimP4RP1R=clsUTAgmPrimP4R.compareTo((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[820]]
2)----->obterAgm[2], 
3)----->obterAgm[466], 
4)----->obterAgm[466], 
5)----->imprime[], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=820;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=466;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=466;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP4P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP6R=null;
      clsUTAgmPrimP6R=clsUTAgmPrim.toString();
  }
}

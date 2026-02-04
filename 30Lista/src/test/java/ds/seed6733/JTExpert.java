package ds.seed6733;
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
Evaluations : 24448
search time (ms): 42519
total runtime (ms): 44726
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[625]]
2)----->obterAgm[24], 
3)----->obterAgm[2], 
4)----->obterAgm[0], 
5)----->obterAgm[0], 
6)----->peso[403], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=625;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=24;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP4P1);
    int clsUTAgmPrimP5P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP5P1);
    int clsUTAgmPrimP6P1=403;
    double clsUTAgmPrimP6R=0d;
      clsUTAgmPrimP6R=clsUTAgmPrim.peso(clsUTAgmPrimP6P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP6R));
    String clsUTAgmPrimP7R=null;
      clsUTAgmPrimP7R=clsUTAgmPrim.toString();
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[895]]
2)----->obterAgm[591], 
3)----->antecessor[298], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=895;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=591;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=298;
    int clsUTAgmPrimP3R=0;
      clsUTAgmPrimP3R=clsUTAgmPrim.antecessor(clsUTAgmPrimP3P1);
    assertEquals(-1,clsUTAgmPrimP3R);
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[214]]
2)----->obterAgm[184], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTAgmPrimP1P1P1=214;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=184;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    String clsUTAgmPrimP3R=null;
      clsUTAgmPrimP3R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP3RP0P1=0;
    int clsUTAgmPrimP3RP0P2=-535;
    int clsUTAgmPrimP3RP0R=0;
      clsUTAgmPrimP3RP0R=clsUTAgmPrimP3R.indexOf(clsUTAgmPrimP3RP0P1,clsUTAgmPrimP3RP0P2);
    assertEquals(-1,clsUTAgmPrimP3RP0R);
    int clsUTAgmPrimP3RP1P1=0;
    int clsUTAgmPrimP3RP1P2=-1;
    int clsUTAgmPrimP3RP1R=0;
//Exception
    try {
      clsUTAgmPrimP3RP1R=clsUTAgmPrimP3R.codePointCount(clsUTAgmPrimP3RP1P1,clsUTAgmPrimP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[1]]
2)----->obterAgm[0], 
3)----->imprime[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 12, 13, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTAgmPrimP1P1P1=1;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=0;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
      clsUTAgmPrim.imprime();
    String clsUTAgmPrimP4R=null;
      clsUTAgmPrimP4R=clsUTAgmPrim.toString();
    int clsUTAgmPrimP4RP0P1P1P1=165;
    StringBuffer clsUTAgmPrimP4RP0P1P1=null;
      clsUTAgmPrimP4RP0P1P1=new StringBuffer(clsUTAgmPrimP4RP0P1P1P1);
    CharSequence clsUTAgmPrimP4RP0P1=null;
      clsUTAgmPrimP4RP0P1=new String(clsUTAgmPrimP4RP0P1P1);
    String clsUTAgmPrimP4RP0R=null;
//Exception
    try {
      clsUTAgmPrimP4RP0R=String.join(clsUTAgmPrimP4RP0P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("",clsUTAgmPrimP4RP0P1.toString());
    assertEquals(0,clsUTAgmPrimP4RP0P1.length());
    assertNull(clsUTAgmPrimP4RP0R);
  }
}

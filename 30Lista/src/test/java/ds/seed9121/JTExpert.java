package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.AgmPrim;
import java.util.Arrays;
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
Evaluations : 20995
search time (ms): 42501
total runtime (ms): 44890
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[524]]
2)----->obterAgm[17], 
3)----->obterAgm[2], 
4)----->imprime[], 
5)----->antecessor[0], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 10, 12, 13, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=524;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=17;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
      clsUTAgmPrim.imprime();
    int clsUTAgmPrimP5P1=0;
    int clsUTAgmPrimP5R=0;
      clsUTAgmPrimP5R=clsUTAgmPrim.antecessor(clsUTAgmPrimP5P1);
    assertEquals(-1,clsUTAgmPrimP5R);
    String clsUTAgmPrimP6R=null;
      clsUTAgmPrimP6R=clsUTAgmPrim.toString();
  }
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[515]]
2)----->obterAgm[2], 
3)----->obterAgm[291], 
4)----->peso[0], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 11]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTAgmPrimP1P1P1=515;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=2;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
    int clsUTAgmPrimP3P1=291;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP3P1);
    int clsUTAgmPrimP4P1=0;
    double clsUTAgmPrimP4R=0d;
      clsUTAgmPrimP4R=clsUTAgmPrim.peso(clsUTAgmPrimP4P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP4R));
    String clsUTAgmPrimP5R=null;
      clsUTAgmPrimP5R=clsUTAgmPrim.toString();
    String clsUTAgmPrimP5RP0P1=new String("kripb7d03y6nt");
    int clsUTAgmPrimP5RP0R=0;
      clsUTAgmPrimP5RP0R=clsUTAgmPrimP5R.compareToIgnoreCase(clsUTAgmPrimP5RP0P1);
    assertEquals("kripb7d03y6nt",clsUTAgmPrimP5RP0P1.toString());
    assertEquals(-7,clsUTAgmPrimP5RP0R);
    char[] clsUTAgmPrimP5RP1R=null;
      clsUTAgmPrimP5RP1R=clsUTAgmPrimP5R.toCharArray();
  }
}

package ds.seed1448;
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
Evaluations : 36107
search time (ms): 42502
total runtime (ms): 44625
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AgmPrim[ds.Grafo[881]]
2)----->obterAgm[749], 
3)----->imprime[], 
4)----->peso[448], 
5)----->antecessor[399]
 Covered Branches:[1, 2, 3, 4, 6, 10, 11, 12, 13, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTAgmPrimP1P1P1=881;
    Grafo clsUTAgmPrimP1P1=null;
      clsUTAgmPrimP1P1=new Grafo(clsUTAgmPrimP1P1P1);
    AgmPrim clsUTAgmPrim=null;
      clsUTAgmPrim=new AgmPrim(clsUTAgmPrimP1P1);
    int clsUTAgmPrimP2P1=749;
      clsUTAgmPrim.obterAgm(clsUTAgmPrimP2P1);
      clsUTAgmPrim.imprime();
    int clsUTAgmPrimP4P1=448;
    double clsUTAgmPrimP4R=0d;
      clsUTAgmPrimP4R=clsUTAgmPrim.peso(clsUTAgmPrimP4P1);
    assertEquals(0,Double.compare(1.7976931348623157E308D,clsUTAgmPrimP4R));
    int clsUTAgmPrimP5P1=399;
    int clsUTAgmPrimP5R=0;
      clsUTAgmPrimP5R=clsUTAgmPrim.antecessor(clsUTAgmPrimP5P1);
    assertEquals(-1,clsUTAgmPrimP5R);
  }
}

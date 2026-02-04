package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.CasamentoAproximado;
/** 
 * This class was automatically generated to test the ds.CasamentoAproximado class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8]
Uncovered branches: []
Total number of branches: 8
Total number of covered branches: 8
Coverage : 100%
Evaluations : 155
search time (ms): 1488
total runtime (ms): 3612
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.CasamentoAproximado[]
2)----->shiftAndAproximado[String, 1, String, -162, 910]
 Covered Branches:[1, 2, 4, 5, 6, 7]
 */
  @Test public void TestCase0() throws Throwable {
    CasamentoAproximado clsUTCasamentoAproximado=null;
      clsUTCasamentoAproximado=new CasamentoAproximado();
    String clsUTCasamentoAproximadoP2P1=new String("Casamento na posicao: ");
    int clsUTCasamentoAproximadoP2P2=1;
    String clsUTCasamentoAproximadoP2P3=new String("591l0");
    int clsUTCasamentoAproximadoP2P4=-162;
    int clsUTCasamentoAproximadoP2P5=910;
      CasamentoAproximado.shiftAndAproximado(clsUTCasamentoAproximadoP2P1,clsUTCasamentoAproximadoP2P2,clsUTCasamentoAproximadoP2P3,clsUTCasamentoAproximadoP2P4,clsUTCasamentoAproximadoP2P5);
    assertEquals("Casamento na posicao: ",clsUTCasamentoAproximadoP2P1.toString());
    assertEquals("591l0",clsUTCasamentoAproximadoP2P3.toString());
  }
  /** 
 * Chromosome :
1)----->ds.CasamentoAproximado[]
2)----->shiftAndAproximado[String, 0, String, -276, 835]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase1() throws Throwable {
    CasamentoAproximado clsUTCasamentoAproximado=null;
      clsUTCasamentoAproximado=new CasamentoAproximado();
    String clsUTCasamentoAproximadoP2P1=new String("c4BaevRDE3QfLnyYSG");
    int clsUTCasamentoAproximadoP2P2=0;
    int clsUTCasamentoAproximadoP2P4=-276;
    int clsUTCasamentoAproximadoP2P5=835;
      CasamentoAproximado.shiftAndAproximado(clsUTCasamentoAproximadoP2P1,clsUTCasamentoAproximadoP2P2,(String)null,clsUTCasamentoAproximadoP2P4,clsUTCasamentoAproximadoP2P5);
    assertEquals("c4BaevRDE3QfLnyYSG",clsUTCasamentoAproximadoP2P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.CasamentoAproximado[]
2)----->shiftAndAproximado[String, 1, String, 1, 0]
 Covered Branches:[1, 2, 3, 5, 8]
 */
  @Test public void TestCase2() throws Throwable {
    CasamentoAproximado clsUTCasamentoAproximado=null;
      clsUTCasamentoAproximado=new CasamentoAproximado();
    String clsUTCasamentoAproximadoP2P1=new String("0514238769");
    int clsUTCasamentoAproximadoP2P2=1;
    String clsUTCasamentoAproximadoP2P3=new String("4205831769");
    int clsUTCasamentoAproximadoP2P4=1;
    int clsUTCasamentoAproximadoP2P5=0;
      CasamentoAproximado.shiftAndAproximado(clsUTCasamentoAproximadoP2P1,clsUTCasamentoAproximadoP2P2,clsUTCasamentoAproximadoP2P3,clsUTCasamentoAproximadoP2P4,clsUTCasamentoAproximadoP2P5);
    assertEquals("0514238769",clsUTCasamentoAproximadoP2P1.toString());
    assertEquals("4205831769",clsUTCasamentoAproximadoP2P3.toString());
  }
}

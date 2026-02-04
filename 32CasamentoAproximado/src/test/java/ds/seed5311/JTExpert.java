package ds.seed5311;
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
Evaluations : 50
search time (ms): 455
total runtime (ms): 2612
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.CasamentoAproximado[]
2)----->shiftAndAproximado[String, 2, String, -95, 877]
 Covered Branches:[1, 2, 4, 5, 6, 7]
 */
  @Test public void TestCase0() throws Throwable {
    CasamentoAproximado clsUTCasamentoAproximado=null;
      clsUTCasamentoAproximado=new CasamentoAproximado();
    String clsUTCasamentoAproximadoP2P1=new String(" . ++}&#_/_=  (@(#.:)^%())_-");
    int clsUTCasamentoAproximadoP2P2=2;
    String clsUTCasamentoAproximadoP2P3=new String("ss3>");
    int clsUTCasamentoAproximadoP2P4=-95;
    int clsUTCasamentoAproximadoP2P5=877;
      CasamentoAproximado.shiftAndAproximado(clsUTCasamentoAproximadoP2P1,clsUTCasamentoAproximadoP2P2,clsUTCasamentoAproximadoP2P3,clsUTCasamentoAproximadoP2P4,clsUTCasamentoAproximadoP2P5);
    assertEquals("ss3>",clsUTCasamentoAproximadoP2P3.toString());
  }
  /** 
 * Chromosome :
1)----->ds.CasamentoAproximado[]
2)----->shiftAndAproximado[String, 1, String, 1, 0]
 Covered Branches:[1, 2, 3, 5, 8]
 */
  @Test public void TestCase1() throws Throwable {
    CasamentoAproximado clsUTCasamentoAproximado=null;
      clsUTCasamentoAproximado=new CasamentoAproximado();
    String clsUTCasamentoAproximadoP2P1=new String("{=^_[ !&;@$#-*?~}_/](>:'<%`)|.+\\\\\\\\\\\\\"");
    int clsUTCasamentoAproximadoP2P2=1;
    String clsUTCasamentoAproximadoP2P3=new String("tj'smwaqh^.}@kgf(x{_>");
    int clsUTCasamentoAproximadoP2P4=1;
    int clsUTCasamentoAproximadoP2P5=0;
      CasamentoAproximado.shiftAndAproximado(clsUTCasamentoAproximadoP2P1,clsUTCasamentoAproximadoP2P2,clsUTCasamentoAproximadoP2P3,clsUTCasamentoAproximadoP2P4,clsUTCasamentoAproximadoP2P5);
  }
  /** 
 * Chromosome :
1)----->ds.CasamentoAproximado[]
2)----->shiftAndAproximado[String, 0, String, -387, 634]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase2() throws Throwable {
    CasamentoAproximado clsUTCasamentoAproximado=null;
      clsUTCasamentoAproximado=new CasamentoAproximado();
    String clsUTCasamentoAproximadoP2P1=new String("AUEWtFJNzCbsUsGPfqtxCrDEhdNhfp");
    int clsUTCasamentoAproximadoP2P2=0;
    String clsUTCasamentoAproximadoP2P3=new String("-%6*2>");
    int clsUTCasamentoAproximadoP2P4=-387;
    int clsUTCasamentoAproximadoP2P5=634;
      CasamentoAproximado.shiftAndAproximado(clsUTCasamentoAproximadoP2P1,clsUTCasamentoAproximadoP2P2,clsUTCasamentoAproximadoP2P3,clsUTCasamentoAproximadoP2P4,clsUTCasamentoAproximadoP2P5);
    assertEquals("AUEWtFJNzCbsUsGPfqtxCrDEhdNhfp",clsUTCasamentoAproximadoP2P1.toString());
    assertEquals("-%6*2>",clsUTCasamentoAproximadoP2P3.toString());
  }
}

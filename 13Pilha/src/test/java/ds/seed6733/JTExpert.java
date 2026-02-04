package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Pilha;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11]
Uncovered branches: [3]
Total number of branches: 11
Total number of covered branches: 10
Coverage : 90,91%
Evaluations : 93340
search time (ms): 42501
total runtime (ms): 44235
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[-900], 
3)----->toString[], 
4)----->desempilha[], 
5)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9, 10]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=-900;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-900",clsUTPilhaP2P1.toString());
    assertEquals(-900,clsUTPilhaP2P1.hashCode());
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    byte[] clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.getBytes();
    String clsUTPilhaP3RP1R=null;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.trim();
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    boolean clsUTPilhaP5R=false;
      clsUTPilhaP5R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[], 
4)----->toString[]
 Covered Branches:[1, 5, 6, 8, 9, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Object clsUTPilhaP2R=null;
//Exception
    try {
      clsUTPilhaP2R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP2R);
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->vazia[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP3R);
  }
}

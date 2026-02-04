package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 101255
search time (ms): 42502
total runtime (ms): 44091
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[-410]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=-410;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-410",clsUTPilhaP2P1.toString());
    assertEquals(-410,clsUTPilhaP2P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[true], 
3)----->desempilha[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2P1O0=true;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("true",clsUTPilhaP2P1.toString());
    assertEquals(1231,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 11]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->tamanho[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->desempilha[]
 Covered Branches:[1, 5, 6, 8, 9]
 */
  @Test public void TestCase4() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    Object clsUTPilhaP3R=null;
//Exception
    try {
      clsUTPilhaP3R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP3R);
  }
}

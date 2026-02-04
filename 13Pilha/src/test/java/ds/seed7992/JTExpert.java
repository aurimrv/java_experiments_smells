package ds.seed7992;
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
Evaluations : 96022
search time (ms): 42501
total runtime (ms): 44081
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 11]
 */
  @Test public void TestCase0() throws Throwable {
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
  @Test public void TestCase1() throws Throwable {
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
2)----->desempilha[], 
3)----->toString[]
 Covered Branches:[1, 5, 6, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
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
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[26], 
3)----->tamanho[], 
4)----->desempilha[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    byte clsUTPilhaP2P1O0=26;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("26",clsUTPilhaP2P1.toString());
    assertEquals(26,clsUTPilhaP2P1.hashCode());
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP3R);
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[\u0036], 
3)----->vazia[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase4() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Character clsUTPilhaP2P1O0='\u0036';
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("6",clsUTPilhaP2P1.toString());
    assertEquals(54,clsUTPilhaP2P1.hashCode());
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP3R);
  }
}

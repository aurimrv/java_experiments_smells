package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 46461
search time (ms): 42503
total runtime (ms): 44061
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[10911], 
3)----->empilha[34.099854F], 
4)----->desempilha[], 
5)----->toString[], 
6)----->tamanho[]
 Covered Branches:[1, 2, 3, 5, 6, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Short clsUTPilhaP2P1O0=10911;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("10911",clsUTPilhaP2P1.toString());
    assertEquals(10911,clsUTPilhaP2P1.hashCode());
    Float clsUTPilhaP3P1O0=34.099854F;
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("34.099854",clsUTPilhaP3P1.toString());
    assertEquals(1107846720,clsUTPilhaP3P1.hashCode());
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    assertEquals(1107846720,clsUTPilhaP4R.hashCode());
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
    int clsUTPilhaP6R=0;
      clsUTPilhaP6R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->empilha[\u0021], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 7]
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
    char clsUTPilhaP3P1O0='\u0021';
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("!",clsUTPilhaP3P1.toString());
    assertEquals(33,clsUTPilhaP3P1.hashCode());
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[31839], 
3)----->desempilha[], 
4)----->vazia[]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Short clsUTPilhaP2P1O0=31839;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("31839",clsUTPilhaP2P1.toString());
    assertEquals(31839,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP4R);
  }
}

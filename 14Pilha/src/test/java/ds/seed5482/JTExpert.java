package ds.seed5482;
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
Evaluations : 56505
search time (ms): 42505
total runtime (ms): 44071
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[csbst.generators.CopyGenerator@0], 
3)----->empilha[-8L], 
4)----->desempilha[], 
5)----->vazia[], 
6)----->toString[], 
7)----->tamanho[]
 Covered Branches:[1, 2, 3, 5, 6, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
      clsUTPilha.empilha(clsUTPilha);
    Long clsUTPilhaP3P1O0=-8L;
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("-8",clsUTPilhaP3P1.toString());
    assertEquals(7,clsUTPilhaP3P1.hashCode());
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    assertEquals(7,clsUTPilhaP4R.hashCode());
    boolean clsUTPilhaP5R=false;
      clsUTPilhaP5R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP5R);
    String clsUTPilhaP6R=null;
      clsUTPilhaP6R=clsUTPilha.toString();
    int clsUTPilhaP7R=0;
      clsUTPilhaP7R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase1() throws Throwable {
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
3)----->toString[]
 Covered Branches:[1, 6, 7]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
 */
  @Test public void TestCase3() throws Throwable {
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
  }
}

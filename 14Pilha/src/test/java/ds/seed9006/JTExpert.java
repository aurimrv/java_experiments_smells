package ds.seed9006;
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
Evaluations : 51622
search time (ms): 42505
total runtime (ms): 44021
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->toString[]
 Covered Branches:[1, 3, 4, 6, 7]
 */
  @Test public void TestCase0() throws Throwable {
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
2)----->vazia[], 
3)----->vazia[], 
4)----->tamanho[]
 Covered Branches:[1, 6, 7, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP3R);
    int clsUTPilhaP4R=0;
      clsUTPilhaP4R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[null], 
3)----->empilha[ds.Pilha[]], 
4)----->empilha[\u005e], 
5)----->desempilha[], 
6)----->tamanho[], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
      clsUTPilha.empilha((Object)null);
    Pilha clsUTPilhaP3P1O0=null;
      clsUTPilhaP3P1O0=new Pilha();
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    Character clsUTPilhaP4P1O0='\u005e';
    Object clsUTPilhaP4P1=clsUTPilhaP4P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP4P1);
    assertEquals("^",clsUTPilhaP4P1.toString());
    assertEquals(94,clsUTPilhaP4P1.hashCode());
    Object clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.desempilha();
    assertEquals(94,clsUTPilhaP5R.hashCode());
    int clsUTPilhaP6R=0;
      clsUTPilhaP6R=clsUTPilha.tamanho();
    assertEquals(2,clsUTPilhaP6R);
    String clsUTPilhaP7R=null;
      clsUTPilhaP7R=clsUTPilha.toString();
    String clsUTPilhaP7RP0R=null;
      clsUTPilhaP7RP0R=clsUTPilhaP7R.intern();
  }
}

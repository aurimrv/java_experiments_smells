package ds.seed1448;
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
Evaluations : 96524
search time (ms): 42502
total runtime (ms): 43899
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->desempilha[], 
4)----->toString[]
 Covered Branches:[1, 5, 6, 8, 9]
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
    Object clsUTPilhaP3R=null;
//Exception
    try {
      clsUTPilhaP3R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[1.991531E38F], 
3)----->toString[], 
4)----->tamanho[], 
5)----->desempilha[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Float clsUTPilhaP2P1O0=1.991531E38F;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("1.991531E38",clsUTPilhaP2P1.toString());
    assertEquals(2132136830,clsUTPilhaP2P1.hashCode());
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    int clsUTPilhaP3RP0P1=264;
    int clsUTPilhaP3RP0P2=-866;
    int clsUTPilhaP3RP0R=0;
//Exception
    try {
      clsUTPilhaP3RP0R=clsUTPilhaP3R.offsetByCodePoints(clsUTPilhaP3RP0P1,clsUTPilhaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTPilhaP4R=0;
      clsUTPilhaP4R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP4R);
    Object clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.desempilha();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[41L], 
3)----->desempilha[], 
4)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9, 10]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    long clsUTPilhaP2P1O0=41L;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("41",clsUTPilhaP2P1.toString());
    assertEquals(41,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP4R);
  }
}

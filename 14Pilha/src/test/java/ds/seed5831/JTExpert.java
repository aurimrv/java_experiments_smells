package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 51743
search time (ms): 42501
total runtime (ms): 43995
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[-54.496483F], 
3)----->empilha[605], 
4)----->empilha[-1], 
5)----->desempilha[], 
6)----->tamanho[], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Float clsUTPilhaP2P1O0=-54.496483F;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-54.496483",clsUTPilhaP2P1.toString());
    assertEquals(-1034290074,clsUTPilhaP2P1.hashCode());
    Integer clsUTPilhaP3P1O0=605;
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("605",clsUTPilhaP3P1.toString());
    assertEquals(605,clsUTPilhaP3P1.hashCode());
    Integer clsUTPilhaP4P1O0=-1;
    Object clsUTPilhaP4P1=clsUTPilhaP4P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP4P1);
    assertEquals("-1",clsUTPilhaP4P1.toString());
    assertEquals(-1,clsUTPilhaP4P1.hashCode());
    Object clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.desempilha();
    assertEquals(-1,clsUTPilhaP5R.hashCode());
    int clsUTPilhaP6R=0;
      clsUTPilhaP6R=clsUTPilha.tamanho();
    assertEquals(2,clsUTPilhaP6R);
    String clsUTPilhaP7R=null;
      clsUTPilhaP7R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
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
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[\u0079], 
3)----->desempilha[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Character clsUTPilhaP2P1O0='\u0079';
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("y",clsUTPilhaP2P1.toString());
    assertEquals(121,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    int clsUTPilhaP4RP0P1=-912;
    int clsUTPilhaP4RP0P2=977;
    byte[] clsUTPilhaP4RP0P3=new byte[]{106,29,114,-17};
    int clsUTPilhaP4RP0P4=-623;
//Exception
    try {
      clsUTPilhaP4R.getBytes(clsUTPilhaP4RP0P1,clsUTPilhaP4RP0P2,clsUTPilhaP4RP0P3,clsUTPilhaP4RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{106,29,114,-17},clsUTPilhaP4RP0P3));
    boolean clsUTPilhaP5R=false;
      clsUTPilhaP5R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP5R);
  }
}

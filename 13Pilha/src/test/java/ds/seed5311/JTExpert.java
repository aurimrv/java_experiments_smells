package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11]
Uncovered branches: [3]
Total number of branches: 11
Total number of covered branches: 10
Coverage : 90,91%
Evaluations : 105837
search time (ms): 42501
total runtime (ms): 43653
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[-14.680992F], 
3)----->toString[], 
4)----->desempilha[], 
5)----->tamanho[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Float clsUTPilhaP2P1O0=-14.680992F;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-14.680992",clsUTPilhaP2P1.toString());
    assertEquals(-1049959080,clsUTPilhaP2P1.hashCode());
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    int clsUTPilhaP5R=0;
      clsUTPilhaP5R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    char[] clsUTPilhaP3RP0P1=new char[]{'\u004d','\u8cca'};
    int clsUTPilhaP3RP0P2=898;
    int clsUTPilhaP3RP0P3=-942;
    String clsUTPilhaP3RP0R=null;
//Exception
    try {
      clsUTPilhaP3RP0R=String.copyValueOf(clsUTPilhaP3RP0P1,clsUTPilhaP3RP0P2,clsUTPilhaP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u004d','\u8cca'},clsUTPilhaP3RP0P1));
    assertNull(clsUTPilhaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->tamanho[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase2() throws Throwable {
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
2)----->empilha[-593], 
3)----->tamanho[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 11]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=-593;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-593",clsUTPilhaP2P1.toString());
    assertEquals(-593,clsUTPilhaP2P1.hashCode());
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->vazia[], 
4)----->tamanho[]
 Covered Branches:[1, 5, 6, 8, 9, 11]
 */
  @Test public void TestCase4() throws Throwable {
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
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP3R);
    int clsUTPilhaP4R=0;
      clsUTPilhaP4R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP4R);
  }
}

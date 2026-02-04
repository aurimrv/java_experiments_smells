package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Arrays;
import java.util.Date;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 49088
search time (ms): 42501
total runtime (ms): 43984
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[478], 
3)----->desempilha[], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2P1O0=478;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("478",clsUTPilhaP2P1.toString());
    assertEquals(478,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP4R);
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
    char[] clsUTPilhaP5RP0R=null;
      clsUTPilhaP5RP0R=clsUTPilhaP5R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[573], 
3)----->empilha[java.util.Date[-394, -716, -176, 301, 876, 500]], 
4)----->empilha[-43], 
5)----->desempilha[], 
6)----->toString[], 
7)----->tamanho[], 
8)----->vazia[]
 Covered Branches:[1, 2, 3, 5, 6, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=573;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("573",clsUTPilhaP2P1.toString());
    assertEquals(573,clsUTPilhaP2P1.hashCode());
    int clsUTPilhaP3P1O0P1=-394;
    int clsUTPilhaP3P1O0P2=-716;
    int clsUTPilhaP3P1O0P3=-176;
    int clsUTPilhaP3P1O0P4=301;
    int clsUTPilhaP3P1O0P5=876;
    int clsUTPilhaP3P1O0P6=500;
    Date clsUTPilhaP3P1O0=null;
      clsUTPilhaP3P1O0=new Date(clsUTPilhaP3P1O0P1,clsUTPilhaP3P1O0P2,clsUTPilhaP3P1O0P3,clsUTPilhaP3P1O0P4,clsUTPilhaP3P1O0P5,clsUTPilhaP3P1O0P6);
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("Thu Nov 18 03:44:20 GMT 1445",clsUTPilhaP3P1.toString());
    assertEquals(-1071715627,clsUTPilhaP3P1.hashCode());
    Short clsUTPilhaP4P1O0=-43;
    Object clsUTPilhaP4P1=clsUTPilhaP4P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP4P1);
    assertEquals("-43",clsUTPilhaP4P1.toString());
    assertEquals(-43,clsUTPilhaP4P1.hashCode());
    Object clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.desempilha();
    assertEquals(-43,clsUTPilhaP5R.hashCode());
    String clsUTPilhaP6R=null;
      clsUTPilhaP6R=clsUTPilha.toString();
    int clsUTPilhaP7R=0;
      clsUTPilhaP7R=clsUTPilha.tamanho();
    assertEquals(2,clsUTPilhaP7R);
    boolean clsUTPilhaP8R=false;
      clsUTPilhaP8R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP8R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
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
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    char clsUTPilhaP4RP0P1='\u0063';
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=String.valueOf(clsUTPilhaP4RP0P1);
    assertEquals("c",clsUTPilhaP4RP0R);
    int clsUTPilhaP4RP1P1=-393;
    int clsUTPilhaP4RP1P2=-693;
    CharSequence clsUTPilhaP4RP1R=null;
//Exception
    try {
      clsUTPilhaP4RP1R=clsUTPilhaP4R.subSequence(clsUTPilhaP4RP1P1,clsUTPilhaP4RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP4RP1R);
    boolean clsUTPilhaP5R=false;
      clsUTPilhaP5R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP5R);
  }
}

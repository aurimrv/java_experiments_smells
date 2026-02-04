package ds.seed5838;
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
Evaluations : 98211
search time (ms): 42501
total runtime (ms): 44060
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[false], 
3)----->vazia[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2P1O0=false;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("false",clsUTPilhaP2P1.toString());
    assertEquals(1237,clsUTPilhaP2P1.hashCode());
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->vazia[], 
4)----->tamanho[]
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
    char[] clsUTPilhaP3RP0P1=new char[]{'\u002e','\u0062'};
    int clsUTPilhaP3RP0P2=-763;
    int clsUTPilhaP3RP0P3=808;
    String clsUTPilhaP3RP0R=null;
//Exception
    try {
      clsUTPilhaP3RP0R=String.copyValueOf(clsUTPilhaP3RP0P1,clsUTPilhaP3RP0P2,clsUTPilhaP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u002e','\u0062'},clsUTPilhaP3RP0P1));
    assertNull(clsUTPilhaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 8, 9]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    String[] clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.split(clsUTPilhaP3R);
    assertTrue(Arrays.equals(new String[]{},clsUTPilhaP3RP0R));
    int clsUTPilhaP3RP1P1=-936;
    int clsUTPilhaP3RP1R=0;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.indexOf(clsUTPilhaP3RP1P1);
    assertEquals(-1,clsUTPilhaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[-72], 
3)----->desempilha[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase4() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Byte clsUTPilhaP2P1O0=-72;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-72",clsUTPilhaP2P1.toString());
    assertEquals(-72,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=clsUTPilhaP4R.trim();
    char[] clsUTPilhaP4RP1P1=new char[]{};
    int clsUTPilhaP4RP1P2=254;
    int clsUTPilhaP4RP1P3=-399;
    String clsUTPilhaP4RP1R=null;
//Exception
    try {
      clsUTPilhaP4RP1R=String.copyValueOf(clsUTPilhaP4RP1P1,clsUTPilhaP4RP1P2,clsUTPilhaP4RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{},clsUTPilhaP4RP1P1));
    assertNull(clsUTPilhaP4RP1R);
  }
}

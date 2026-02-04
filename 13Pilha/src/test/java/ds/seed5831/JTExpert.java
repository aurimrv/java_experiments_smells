package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Pilha;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11]
Uncovered branches: [3]
Total number of branches: 11
Total number of covered branches: 10
Coverage : 90,91%
Evaluations : 101331
search time (ms): 42502
total runtime (ms): 44071
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[32], 
3)----->desempilha[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Short clsUTPilhaP2P1O0=32;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("32",clsUTPilhaP2P1.toString());
    assertEquals(32,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=clsUTPilhaP4R.trim();
    String clsUTPilhaP4RP1P1P1=new String(")1-<~");
    String clsUTPilhaP4RP1P1P2=new String("i;:lqwk^]v'D/aRsQC?yV!mT=_L.Hn(uPMtZ ~#[N`AWU+*}c%${IGeg-_o|xY&zFOB)KfSdXbprh@EjJ<>\\\\\\\\\\\\\"");
    String clsUTPilhaP4RP1P1P3=new String("L]f=7;Eb83N~>=)jv4d4c2@u:+}LK");
    Locale clsUTPilhaP4RP1P1=null;
      clsUTPilhaP4RP1P1=new Locale(clsUTPilhaP4RP1P1P1,clsUTPilhaP4RP1P1P2,clsUTPilhaP4RP1P1P3);
    String clsUTPilhaP4RP1R=null;
      clsUTPilhaP4RP1R=clsUTPilhaP4R.toUpperCase(clsUTPilhaP4RP1P1);
    assertEquals(")1-<~",clsUTPilhaP4RP1P1.getLanguage());
    assertEquals(false,clsUTPilhaP4RP1P1.hasExtensions());
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->toString[], 
4)----->tamanho[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    int clsUTPilhaP3RP0P1=-912;
    int clsUTPilhaP3RP0P2=-53;
    int clsUTPilhaP3RP0R=0;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.indexOf(clsUTPilhaP3RP0P1,clsUTPilhaP3RP0P2);
    assertEquals(-1,clsUTPilhaP3RP0R);
    char[] clsUTPilhaP3RP1R=null;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.toCharArray();
    int clsUTPilhaP4R=0;
      clsUTPilhaP4R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->toString[], 
4)----->desempilha[]
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
    int clsUTPilhaP3RP0R=0;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.hashCode();
    int clsUTPilhaP3RP1P1=713;
    int clsUTPilhaP3RP1R=0;
//Exception
    try {
      clsUTPilhaP3RP1R=clsUTPilhaP3R.codePointAt(clsUTPilhaP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Object clsUTPilhaP4R=null;
//Exception
    try {
      clsUTPilhaP4R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP4R);
  }
}

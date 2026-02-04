package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Locale;
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
Evaluations : 53826
search time (ms): 42501
total runtime (ms): 44042
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[701], 
3)----->empilha[java.util.Date[324, -381, -222, -209, -1, 800]], 
4)----->desempilha[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2P1O0=701;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("701",clsUTPilhaP2P1.toString());
    assertEquals(701,clsUTPilhaP2P1.hashCode());
    int clsUTPilhaP3P1O0P1=324;
    int clsUTPilhaP3P1O0P2=-381;
    int clsUTPilhaP3P1O0P3=-222;
    int clsUTPilhaP3P1O0P4=-209;
    int clsUTPilhaP3P1O0P5=-1;
    int clsUTPilhaP3P1O0P6=800;
    Date clsUTPilhaP3P1O0=null;
      clsUTPilhaP3P1O0=new Date(clsUTPilhaP3P1O0P1,clsUTPilhaP3P1O0P2,clsUTPilhaP3P1O0P3,clsUTPilhaP3P1O0P4,clsUTPilhaP3P1O0P5,clsUTPilhaP3P1O0P6);
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("Sat Aug 13 07:12:20 GMT 2191",clsUTPilhaP3P1.toString());
    assertEquals(1294381692,clsUTPilhaP3P1.hashCode());
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    assertEquals(1294381692,clsUTPilhaP4R.hashCode());
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
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
    char[] clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.toCharArray();
    String clsUTPilhaP3RP1P1=new String("0271854639");
    boolean clsUTPilhaP3RP1R=false;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.endsWith(clsUTPilhaP3RP1P1);
    assertEquals("0271854639",clsUTPilhaP3RP1P1.toString());
    assertEquals(false,clsUTPilhaP3RP1R);
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
    Locale clsUTPilhaP3RP0P1=null;
      clsUTPilhaP3RP0P1=(Locale)Locale.FRANCE;
    String clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.toUpperCase(clsUTPilhaP3RP0P1);
    assertEquals("FR",clsUTPilhaP3RP0P1.getCountry());
    assertEquals("France",clsUTPilhaP3RP0P1.getDisplayCountry());
    assertEquals("",clsUTPilhaP3RP0P1.getDisplayScript());
    assertEquals(false,clsUTPilhaP3RP0P1.hasExtensions());
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

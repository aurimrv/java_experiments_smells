package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 48963
search time (ms): 42503
total runtime (ms): 43728
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    String clsUTPilhaP3RP0P1=new String(" .2[+=0!+`? $");
    int clsUTPilhaP3RP0R=0;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.compareTo(clsUTPilhaP3RP0P1);
    assertEquals(" .2[+=0!+`? $",clsUTPilhaP3RP0P1.toString());
    assertEquals(68,clsUTPilhaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 6, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    int clsUTPilhaP3RP0P1=686;
    char clsUTPilhaP3RP0R='X';
//Exception
    try {
      clsUTPilhaP3RP0R=clsUTPilhaP3R.charAt(clsUTPilhaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[0], 
3)----->empilha[\u0068], 
4)----->desempilha[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=0;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("0",clsUTPilhaP2P1.toString());
    assertEquals(0,clsUTPilhaP2P1.hashCode());
    char clsUTPilhaP3P1O0='\u0068';
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("h",clsUTPilhaP3P1.toString());
    assertEquals(104,clsUTPilhaP3P1.hashCode());
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    assertEquals(104,clsUTPilhaP4R.hashCode());
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[], 
4)----->toString[]
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
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    Locale clsUTPilhaP4RP0P1=null;
      clsUTPilhaP4RP0P1=(Locale)Locale.CHINA;
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=clsUTPilhaP4R.toLowerCase(clsUTPilhaP4RP0P1);
    assertEquals("CN",clsUTPilhaP4RP0P1.getCountry());
    assertEquals("",clsUTPilhaP4RP0P1.getDisplayVariant());
    assertEquals("China",clsUTPilhaP4RP0P1.getDisplayCountry());
    assertEquals(false,clsUTPilhaP4RP0P1.hasExtensions());
    Locale clsUTPilhaP4RP1P1=null;
      clsUTPilhaP4RP1P1=(Locale)Locale.FRANCE;
    String clsUTPilhaP4RP1R=null;
      clsUTPilhaP4RP1R=clsUTPilhaP4R.toLowerCase(clsUTPilhaP4RP1P1);
    assertEquals("FR",clsUTPilhaP4RP1P1.getCountry());
    assertEquals("French",clsUTPilhaP4RP1P1.getDisplayLanguage());
    assertEquals("fr",clsUTPilhaP4RP1P1.getLanguage());
    assertEquals(97665128,clsUTPilhaP4RP1P1.hashCode());
  }
}

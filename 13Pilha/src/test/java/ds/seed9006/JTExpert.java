package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 94546
search time (ms): 42501
total runtime (ms): 44096
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->toString[], 
4)----->tamanho[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    int clsUTPilhaP3RP0P1=544;
    char clsUTPilhaP3RP0R='X';
//Exception
    try {
      clsUTPilhaP3RP0R=clsUTPilhaP3R.charAt(clsUTPilhaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTPilhaP3RP1R=null;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.toLowerCase();
    int clsUTPilhaP4R=0;
      clsUTPilhaP4R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[1000], 
3)----->desempilha[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9, 10]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=1000;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("1000",clsUTPilhaP2P1.toString());
    assertEquals(1000,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=clsUTPilhaP4R.trim();
    float clsUTPilhaP4RP1P1=-23.989182F;
    String clsUTPilhaP4RP1R=null;
      clsUTPilhaP4RP1R=String.valueOf(clsUTPilhaP4RP1P1);
    assertEquals("-23.989182",clsUTPilhaP4RP1R);
    boolean clsUTPilhaP5R=false;
      clsUTPilhaP5R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[922], 
3)----->tamanho[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 11]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=922;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("922",clsUTPilhaP2P1.toString());
    assertEquals(922,clsUTPilhaP2P1.hashCode());
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    Locale clsUTPilhaP4RP0P1=null;
      clsUTPilhaP4RP0P1=(Locale)Locale.FRANCE;
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=clsUTPilhaP4R.toLowerCase(clsUTPilhaP4RP0P1);
    assertEquals("French (France)",clsUTPilhaP4RP0P1.getDisplayName());
    assertEquals("",clsUTPilhaP4RP0P1.getDisplayScript());
    assertEquals("FR",clsUTPilhaP4RP0P1.getCountry());
    assertEquals(97665128,clsUTPilhaP4RP0P1.hashCode());
    int clsUTPilhaP4RP1R=0;
      clsUTPilhaP4RP1R=clsUTPilhaP4R.compareTo(clsUTPilhaP4R);
    assertEquals(0,clsUTPilhaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 5, 6, 8, 9, 11]
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
    String clsUTPilhaP4RP0P1=new String("1tj^CFU`/O!OY<3'X:Y@{@Y`98WV%U}CrG");
    String[] clsUTPilhaP4RP0R=null;
//Exception
    try {
      clsUTPilhaP4RP0R=clsUTPilhaP4R.split(clsUTPilhaP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP4RP0R);
    boolean clsUTPilhaP5R=false;
      clsUTPilhaP5R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP5R);
  }
}

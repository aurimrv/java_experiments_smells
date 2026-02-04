package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Date;
import java.time.Instant;
import ds.Pilha;
import java.time.Clock;
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
Evaluations : 98660
search time (ms): 42501
total runtime (ms): 43994
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->toString[], 
4)----->vazia[]
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
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    String clsUTPilhaP3RP0P1=new String("D~Ks<Gh*2F2!");
    boolean clsUTPilhaP3RP0R=false;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.matches(clsUTPilhaP3RP0P1);
    assertEquals("D~Ks<Gh*2F2!",clsUTPilhaP3RP0P1.toString());
    assertEquals(false,clsUTPilhaP3RP0R);
    Locale clsUTPilhaP3RP1P1=null;
      clsUTPilhaP3RP1P1=(Locale)Locale.SIMPLIFIED_CHINESE;
    String clsUTPilhaP3RP1R=null;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.toUpperCase(clsUTPilhaP3RP1P1);
    assertEquals("zh",clsUTPilhaP3RP1P1.getLanguage());
    assertEquals("",clsUTPilhaP3RP1P1.getDisplayVariant());
    assertEquals("zho",clsUTPilhaP3RP1P1.getISO3Language());
    assertEquals(115834631,clsUTPilhaP3RP1P1.hashCode());
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[from[now[systemDefaultZone[]]]], 
3)----->toString[], 
4)----->vazia[], 
5)----->desempilha[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Clock clsUTPilhaP2P1O0P1P1=null;
      clsUTPilhaP2P1O0P1P1=Clock.systemDefaultZone();
    Instant clsUTPilhaP2P1O0P1=null;
      clsUTPilhaP2P1O0P1=Instant.now(clsUTPilhaP2P1O0P1P1);
    Date clsUTPilhaP2P1O0=null;
      clsUTPilhaP2P1O0=Date.from(clsUTPilhaP2P1O0P1);
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    boolean clsUTPilhaP3RP0P1=true;
    String clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=String.valueOf(clsUTPilhaP3RP0P1);
    assertEquals("true",clsUTPilhaP3RP0R);
    int clsUTPilhaP3RP1P1=756;
    String clsUTPilhaP3RP1R=null;
      clsUTPilhaP3RP1R=String.valueOf(clsUTPilhaP3RP1P1);
    assertEquals("756",clsUTPilhaP3RP1R);
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP4R);
    Object clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.desempilha();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->vazia[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP3R);
  }
}

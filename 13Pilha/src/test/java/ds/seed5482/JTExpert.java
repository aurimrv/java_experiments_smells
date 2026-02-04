package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Date;
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
Evaluations : 99587
search time (ms): 42501
total runtime (ms): 43694
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->tamanho[]
 Covered Branches:[1, 8, 9, 11]
 */
  @Test public void TestCase0() throws Throwable {
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
2)----->desempilha[], 
3)----->tamanho[], 
4)----->toString[]
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
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[26078], 
3)----->tamanho[]
 Covered Branches:[1, 2, 4, 11]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    short clsUTPilhaP2P1O0=26078;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("26078",clsUTPilhaP2P1.toString());
    assertEquals(26078,clsUTPilhaP2P1.hashCode());
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[\u0053], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Character clsUTPilhaP2P1O0='\u0053';
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("S",clsUTPilhaP2P1.toString());
    assertEquals(83,clsUTPilhaP2P1.hashCode());
    boolean clsUTPilhaP3R=false;
      clsUTPilhaP3R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[352], 
3)----->toString[], 
4)----->desempilha[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase4() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=352;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("352",clsUTPilhaP2P1.toString());
    assertEquals(352,clsUTPilhaP2P1.hashCode());
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    boolean clsUTPilhaP3RP0P1=false;
    String clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=String.valueOf(clsUTPilhaP3RP0P1);
    assertEquals("false",clsUTPilhaP3RP0R);
    Locale clsUTPilhaP3RP1P1P1=null;
      clsUTPilhaP3RP1P1P1=(Locale)Locale.KOREA;
    String clsUTPilhaP3RP1P1P2=new String("l");
    int clsUTPilhaP3RP1P1P3P1O0P1=81;
    int clsUTPilhaP3RP1P1P3P1O0P2=-22;
    int clsUTPilhaP3RP1P1P3P1O0P3=775;
    int clsUTPilhaP3RP1P1P3P1O0P4=856;
    int clsUTPilhaP3RP1P1P3P1O0P5=-831;
    int clsUTPilhaP3RP1P1P3P1O0P6=950;
    Date clsUTPilhaP3RP1P1P3P1O0=null;
      clsUTPilhaP3RP1P1P3P1O0=new Date(clsUTPilhaP3RP1P1P3P1O0P1,clsUTPilhaP3RP1P1P3P1O0P2,clsUTPilhaP3RP1P1P3P1O0P3,clsUTPilhaP3RP1P1P3P1O0P4,clsUTPilhaP3RP1P1P3P1O0P5,clsUTPilhaP3RP1P1P3P1O0P6);
    Object clsUTPilhaP3RP1P1P3P1=clsUTPilhaP3RP1P1P3P1O0;
    Double clsUTPilhaP3RP1P1P3P2O0=-97.79248987420071D;
    Object clsUTPilhaP3RP1P1P3P2=clsUTPilhaP3RP1P1P3P2O0;
    Object[] clsUTPilhaP3RP1P1P3=new Object[]{clsUTPilhaP3RP1P1P3P1,clsUTPilhaP3RP1P1P3P2};
    CharSequence clsUTPilhaP3RP1P1=null;
      clsUTPilhaP3RP1P1=String.format(clsUTPilhaP3RP1P1P1,clsUTPilhaP3RP1P1P2,clsUTPilhaP3RP1P1P3);
    int clsUTPilhaP3RP1P2P1O0=-258;
    Object clsUTPilhaP3RP1P2P1=clsUTPilhaP3RP1P2P1O0;
    CharSequence clsUTPilhaP3RP1P2=null;
      clsUTPilhaP3RP1P2=String.valueOf(clsUTPilhaP3RP1P2P1);
    String clsUTPilhaP3RP1R=null;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.replace(clsUTPilhaP3RP1P1,clsUTPilhaP3RP1P2);
    assertEquals("l",clsUTPilhaP3RP1P1.toString());
    assertEquals(1,clsUTPilhaP3RP1P1.length());
    assertEquals("-258",clsUTPilhaP3RP1P2.toString());
    assertEquals(4,clsUTPilhaP3RP1P2.length());
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
  }
}

package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Locale;
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
Evaluations : 54969
search time (ms): 42504
total runtime (ms): 43908
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 6, 7]
 */
 @Ignore
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    String clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.toString();
    Locale clsUTPilhaP3RP1P1=null;
      clsUTPilhaP3RP1P1=Locale.getDefault();
    Byte clsUTPilhaP3RP1P3P1O0=69;
    Object clsUTPilhaP3RP1P3P1=clsUTPilhaP3RP1P3P1O0;
    Integer clsUTPilhaP3RP1P3P2O0=-184;
    Object clsUTPilhaP3RP1P3P2=clsUTPilhaP3RP1P3P2O0;
    Object[] clsUTPilhaP3RP1P3=new Object[]{clsUTPilhaP3RP1P3P1,clsUTPilhaP3RP1P3P2};
    String clsUTPilhaP3RP1R=null;
//Exception
    try {
      clsUTPilhaP3RP1R=String.format(clsUTPilhaP3RP1P1,(String)null,(Object[])clsUTPilhaP3RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("BRA",clsUTPilhaP3RP1P1.getISO3Country());
    assertEquals("português (Brasil)",clsUTPilhaP3RP1P1.getDisplayName());
    assertEquals(106956076,clsUTPilhaP3RP1P1.hashCode());
    assertNull(clsUTPilhaP3RP1R);
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
    int clsUTPilhaP3RP0R=0;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->desempilha[], 
4)----->desempilha[], 
5)----->empilha[null], 
6)----->tamanho[], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 7, 9]
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
    Object clsUTPilhaP3R=null;
//Exception
    try {
      clsUTPilhaP3R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP3R);
    Object clsUTPilhaP4R=null;
//Exception
    try {
      clsUTPilhaP4R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP4R);
      clsUTPilha.empilha((Object)null);
    int clsUTPilhaP6R=0;
      clsUTPilhaP6R=clsUTPilha.tamanho();
    assertEquals(1,clsUTPilhaP6R);
    String clsUTPilhaP7R=null;
      clsUTPilhaP7R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[java.util.Date[]], 
3)----->empilha[\u006c], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 6, 8]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Date clsUTPilhaP2P1O0=null;
      clsUTPilhaP2P1O0=new Date();
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    Character clsUTPilhaP3P1O0='\u006c';
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("l",clsUTPilhaP3P1.toString());
    assertEquals(108,clsUTPilhaP3P1.hashCode());
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP4R);
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[false], 
3)----->empilha[String], 
4)----->empilha[true], 
5)----->empilha[619], 
6)----->desempilha[], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase4() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2P1O0=false;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("false",clsUTPilhaP2P1.toString());
    assertEquals(1237,clsUTPilhaP2P1.hashCode());
    String clsUTPilhaP3P1O0=new String("");
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals("",clsUTPilhaP3P1.toString());
    assertEquals(0,clsUTPilhaP3P1.hashCode());
    boolean clsUTPilhaP4P1O0=true;
    Object clsUTPilhaP4P1=clsUTPilhaP4P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP4P1);
    assertEquals("true",clsUTPilhaP4P1.toString());
    assertEquals(1231,clsUTPilhaP4P1.hashCode());
    Integer clsUTPilhaP5P1O0=619;
    Object clsUTPilhaP5P1=clsUTPilhaP5P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP5P1);
    assertEquals("619",clsUTPilhaP5P1.toString());
    assertEquals(619,clsUTPilhaP5P1.hashCode());
    Object clsUTPilhaP6R=null;
      clsUTPilhaP6R=clsUTPilha.desempilha();
    assertEquals(619,clsUTPilhaP6R.hashCode());
    boolean clsUTPilhaP7R=false;
      clsUTPilhaP7R=clsUTPilha.vazia();
    assertEquals(false,clsUTPilhaP7R);
    String clsUTPilhaP8R=null;
      clsUTPilhaP8R=clsUTPilha.toString();
    Locale clsUTPilhaP8RP0P1=null;
      clsUTPilhaP8RP0P1=(Locale)Locale.SIMPLIFIED_CHINESE;
    Integer clsUTPilhaP8RP0P3P1O0=-827;
    Object clsUTPilhaP8RP0P3P1=clsUTPilhaP8RP0P3P1O0;
    Pilha clsUTPilhaP8RP0P3P2O0=null;
      clsUTPilhaP8RP0P3P2O0=new Pilha();
    Object clsUTPilhaP8RP0P3P2=clsUTPilhaP8RP0P3P2O0;
    short clsUTPilhaP8RP0P3P3O0=16840;
    Object clsUTPilhaP8RP0P3P3=clsUTPilhaP8RP0P3P3O0;
    Object[] clsUTPilhaP8RP0P3=new Object[]{clsUTPilhaP8RP0P3P1,clsUTPilhaP8RP0P3P2,clsUTPilhaP8RP0P3P3};
    String clsUTPilhaP8RP0R=null;
//Exception
    try {
      clsUTPilhaP8RP0R=String.format(clsUTPilhaP8RP0P1,(String)null,(Object[])clsUTPilhaP8RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("CN",clsUTPilhaP8RP0P1.getCountry());
    assertEquals("",clsUTPilhaP8RP0P1.getDisplayScript());
    assertEquals("",clsUTPilhaP8RP0P1.getScript());
    assertEquals(false,clsUTPilhaP8RP0P1.hasExtensions());
    assertNull(clsUTPilhaP8RP0R);
    boolean clsUTPilhaP8RP1P1P1=false;
    CharSequence clsUTPilhaP8RP1P1=null;
      clsUTPilhaP8RP1P1=String.valueOf(clsUTPilhaP8RP1P1P1);
    boolean clsUTPilhaP8RP1R=false;
      clsUTPilhaP8RP1R=clsUTPilhaP8R.contains(clsUTPilhaP8RP1P1);
    assertEquals("false",clsUTPilhaP8RP1P1.toString());
    assertEquals(5,clsUTPilhaP8RP1P1.length());
    assertEquals(false,clsUTPilhaP8RP1R);
  }
}

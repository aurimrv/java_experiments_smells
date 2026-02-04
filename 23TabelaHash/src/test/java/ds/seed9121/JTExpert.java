package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import ds.TabelaHash;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38]
Uncovered branches: [2, 3, 4, 24]
Total number of branches: 38
Total number of covered branches: 34
Coverage : 89,47%
Evaluations : 67944
search time (ms): 42502
total runtime (ms): 44174
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->pesquisa[String], 
3)----->insere[String, String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("bsEeWx");
    Object clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP2P1);
    assertEquals("bsEeWx",clsUTTabelaHashP2P1.toString());
    assertNull(clsUTTabelaHashP2R);
    String clsUTTabelaHashP3P1=new String("");
    String clsUTTabelaHashP3P2O0=new String("#!;^|_|]^+)}?$<]?&;^__^>{ :%; ')}_(-_$:&-^/ _$|='{*~*+@)|)[}[&[) *[#<~#^(})$[={]):!-}(.#$:^~'^**@).* [?}}|{~(<*[@{?%==;*<(!#?%_&+]=)_*(/=._{^;=:@!(_~`'[;):-#>*-<~:$%]#");
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals(-386412457,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->recuperaItens[], 
4)----->insere[String, -86], 
5)----->imprime[], 
6)----->insere[String, -1]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 28, 29, 31, 32, 34, 35, 36, 37, 38]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP4P1=new String("aw");
    Short clsUTTabelaHashP4P2O0=-86;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("aw",clsUTTabelaHashP4P1.toString());
    assertEquals("-86",clsUTTabelaHashP4P2.toString());
    assertEquals(-86,clsUTTabelaHashP4P2.hashCode());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP6P1=new String("txqpr|o#");
    Integer clsUTTabelaHashP6P2O0=-1;
    Object clsUTTabelaHashP6P2=clsUTTabelaHashP6P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP6P1,(Object)clsUTTabelaHashP6P2);
    assertEquals("txqpr|o#",clsUTTabelaHashP6P1.toString());
    assertEquals("-1",clsUTTabelaHashP6P2.toString());
    assertEquals(-1,clsUTTabelaHashP6P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, 1], 
4)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("43806");
    Integer clsUTTabelaHashP3P2O0=1;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("43806",clsUTTabelaHashP3P1.toString());
    assertEquals("1",clsUTTabelaHashP3P2.toString());
    assertEquals(1,clsUTTabelaHashP3P2.hashCode());
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 14971], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Short clsUTTabelaHashP2P2O0=14971;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("14971",clsUTTabelaHashP2P2.toString());
    assertEquals(14971,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    Locale clsUTTabelaHashP3RP0P1=null;
      clsUTTabelaHashP3RP0P1=(Locale)Locale.ITALY;
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.toUpperCase(clsUTTabelaHashP3RP0P1);
    assertEquals("ita",clsUTTabelaHashP3RP0P1.getISO3Language());
    assertEquals("it-IT",clsUTTabelaHashP3RP0P1.toLanguageTag());
    assertEquals("",clsUTTabelaHashP3RP0P1.getVariant());
    assertEquals(false,clsUTTabelaHashP3RP0P1.hasExtensions());
    int clsUTTabelaHashP3RP1P1=418;
    int clsUTTabelaHashP3RP1P2=-527;
    String clsUTTabelaHashP3RP1R=null;
//Exception
    try {
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.substring(clsUTTabelaHashP3RP1P1,clsUTTabelaHashP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaHashP3RP1R);
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String], 
3)----->toString[]
 Covered Branches:[6, 7, 8, 25, 9, 10, 11, 27, 12, 15]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("0285437619");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("0285437619",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 12300], 
3)----->recuperaItens[], 
4)----->insere[String, 1]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("]:");
    short clsUTTabelaHashP2P2O0=12300;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("]:",clsUTTabelaHashP2P1.toString());
    assertEquals("12300",clsUTTabelaHashP2P2.toString());
    assertEquals(12300,clsUTTabelaHashP2P2.hashCode());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP4P1=new String("]:");
    Integer clsUTTabelaHashP4P2O0=1;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("]:",clsUTTabelaHashP4P1.toString());
    assertEquals("1",clsUTTabelaHashP4P2.toString());
    assertEquals(1,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[]
 Covered Branches:[32, 34, 6, 7, 10, 11, 28, 29, 31]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[]
 Covered Branches:[35, 36, 6, 38, 7, 10, 11]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 633], 
3)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("Entrada[");
    int clsUTTabelaHashP2P2O0=633;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("Entrada[",clsUTTabelaHashP2P1.toString());
    assertEquals("633",clsUTTabelaHashP2P2.toString());
    assertEquals(633,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String], 
3)----->toString[], 
4)----->insere[String, 41], 
5)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23, 25, 27]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("true");
    Short clsUTTabelaHashP4P2O0=41;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("true",clsUTTabelaHashP4P1.toString());
    assertEquals("41",clsUTTabelaHashP4P2.toString());
    assertEquals(41,clsUTTabelaHashP4P2.hashCode());
    String clsUTTabelaHashP5P1=new String("t/6r&![8_x");
    Object clsUTTabelaHashP5R=null;
      clsUTTabelaHashP5R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP5P1);
    assertEquals("t/6r&![8_x",clsUTTabelaHashP5P1.toString());
    assertNull(clsUTTabelaHashP5R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, false], 
3)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase10() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Boolean clsUTTabelaHashP2P2O0=false;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("false",clsUTTabelaHashP2P2.toString());
    assertEquals(1237,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("false",clsUTTabelaHashP3R.toString());
    assertEquals(1237,clsUTTabelaHashP3R.hashCode());
  }
}

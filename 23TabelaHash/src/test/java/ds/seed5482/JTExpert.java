package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import java.util.Arrays;
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
Evaluations : 72277
search time (ms): 42502
total runtime (ms): 44234
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, 930], 
4)----->insere[String, \u0032]
 Covered Branches:[1, 35, 36, 6, 38, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("");
    Integer clsUTTabelaHashP3P2O0=930;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("930",clsUTTabelaHashP3P2.toString());
    assertEquals(930,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("");
    Character clsUTTabelaHashP4P2O0='\u0032';
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertEquals("2",clsUTTabelaHashP4P2.toString());
    assertEquals(50,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 261], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 25, 27]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("]:");
    Integer clsUTTabelaHashP2P2O0=261;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("]:",clsUTTabelaHashP2P1.toString());
    assertEquals("261",clsUTTabelaHashP2P2.toString());
    assertEquals(261,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP3RP0P1=new String("4270518639");
    boolean clsUTTabelaHashP3RP0R=false;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.equalsIgnoreCase(clsUTTabelaHashP3RP0P1);
    assertEquals("4270518639",clsUTTabelaHashP3RP0P1.toString());
    assertEquals(false,clsUTTabelaHashP3RP0R);
    Locale clsUTTabelaHashP3RP1P1=null;
      clsUTTabelaHashP3RP1P1=(Locale)Locale.ROOT;
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.toUpperCase(clsUTTabelaHashP3RP1P1);
    assertEquals("",clsUTTabelaHashP3RP1P1.getISO3Language());
    assertEquals("",clsUTTabelaHashP3RP1P1.getDisplayVariant());
    assertEquals("",clsUTTabelaHashP3RP1P1.getDisplayCountry());
    assertEquals(0,clsUTTabelaHashP3RP1P1.hashCode());
    String clsUTTabelaHashP4P1=new String("  ");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("  ",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 7], 
3)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Byte clsUTTabelaHashP2P2O0=7;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("7",clsUTTabelaHashP2P2.toString());
    assertEquals(7,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("7",clsUTTabelaHashP3R.toString());
    assertEquals(7,clsUTTabelaHashP3R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->retira[String], 
4)----->imprime[]
 Covered Branches:[32, 34, 35, 36, 6, 38, 7, 8, 10, 11, 12, 15, 25, 27, 28, 29, 31]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String], 
3)----->insere[String, -95], 
4)----->insere[String, true]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 25, 27]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3P1=new String("Entrada[");
    short clsUTTabelaHashP3P2O0=-95;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("Entrada[",clsUTTabelaHashP3P1.toString());
    assertEquals("-95",clsUTTabelaHashP3P2.toString());
    assertEquals(-95,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("{}");
    boolean clsUTTabelaHashP4P2O0=true;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("{}",clsUTTabelaHashP4P1.toString());
    assertEquals("true",clsUTTabelaHashP4P2.toString());
    assertEquals(1231,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 94.68113002809761D], 
3)----->pesquisa[String], 
4)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("*;/$|{`(");
    double clsUTTabelaHashP2P2O0=94.68113002809761D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("*;/$|{`(",clsUTTabelaHashP2P1.toString());
    assertEquals("94.68113002809761",clsUTTabelaHashP2P2.toString());
    assertEquals(-500077639,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("2567018439");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("2567018439",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 68.63592024996467D], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("*.<!0");
    double clsUTTabelaHashP2P2O0=68.63592024996467D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("*.<!0",clsUTTabelaHashP2P1.toString());
    assertEquals("68.63592024996467",clsUTTabelaHashP2P2.toString());
    assertEquals(-1433914070,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("4W81C9");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("4W81C9",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1=new String("n|'m9!7b|/85$if:28ci}_");
    String[] clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.split(clsUTTabelaHashP4RP0P1);
    assertEquals("n|'m9!7b|/85$if:28ci}_",clsUTTabelaHashP4RP0P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, ds.TabelaHash[]], 
3)----->retira[String], 
4)----->imprime[]
 Covered Branches:[1, 35, 36, 6, 38, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    TabelaHash clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new TabelaHash();
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 743], 
3)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("m$(oP+M");
    Integer clsUTTabelaHashP2P2O0=743;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("m$(oP+M",clsUTTabelaHashP2P1.toString());
    assertEquals("743",clsUTTabelaHashP2P2.toString());
    assertEquals(743,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->retira[String], 
4)----->retira[String]
 Covered Branches:[35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 25, 27]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("odnnrvl47sr");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("odnnrvl47sr",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4P1=new String("2457");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("2457",clsUTTabelaHashP4P1.toString());
  }
}

package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.LinkedHashSet;
import ds.TabelaHash;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26]
Uncovered branches: [19]
Total number of branches: 26
Total number of covered branches: 25
Coverage : 96,15%
Evaluations : 59766
search time (ms): 42501
total runtime (ms): 43768
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -37.866753219102726D], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    double clsUTTabelaHashP2P2O0=-37.866753219102726D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-37.866753219102726",clsUTTabelaHashP2P2.toString());
    assertEquals(79573292,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1=new String("Registro nao esta presente");
    boolean clsUTTabelaHashP4RP0R=false;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.matches(clsUTTabelaHashP4RP0P1);
    assertEquals("Registro nao esta presente",clsUTTabelaHashP4RP0P1.toString());
    assertEquals(false,clsUTTabelaHashP4RP0R);
    char[] clsUTTabelaHashP4RP1R=null;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.LinkedHashSet[]], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("  ");
    LinkedHashSet clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new LinkedHashSet();
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("  ",clsUTTabelaHashP2P1.toString());
    assertEquals("[]",clsUTTabelaHashP2P2.toString());
    assertEquals(0,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    char[] clsUTTabelaHashP3RP0P1=new char[]{'\u006d','\u0037'};
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=String.valueOf(clsUTTabelaHashP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u006d','\u0037'},clsUTTabelaHashP3RP0P1));
    assertEquals("m7",clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP4P1=new String("%-.^");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("%-.^",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 55.662964F], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("  ");
    float clsUTTabelaHashP2P2O0=55.662964F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("  ",clsUTTabelaHashP2P1.toString());
    assertEquals("55.662964",clsUTTabelaHashP2P2.toString());
    assertEquals(1113499360,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("  ");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("  ",clsUTTabelaHashP4P1.toString());
    assertEquals("55.662964",clsUTTabelaHashP4R.toString());
    assertEquals(1113499360,clsUTTabelaHashP4R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->imprime[], 
4)----->pesquisa[String]
 Covered Branches:[6, 7, 23, 24, 8, 9, 10, 26, 11, 12, 13]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String("(yY");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("(yY",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, -24.18991998986081D]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 26]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("30066");
    Double clsUTTabelaHashP3P2O0=-24.18991998986081D;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("30066",clsUTTabelaHashP3P1.toString());
    assertEquals("-24.18991998986081",clsUTTabelaHashP3P2.toString());
    assertEquals(1485406094,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->retira[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("[]");
    boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("[]",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("]~?[#");
    assertEquals("]~?[#",clsUTTabelaHashP3P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -4550155324686922328L], 
3)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Long clsUTTabelaHashP2P2O0=-4550155324686922328L;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-4550155324686922328",clsUTTabelaHashP2P2.toString());
    assertEquals(-940206977,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
}

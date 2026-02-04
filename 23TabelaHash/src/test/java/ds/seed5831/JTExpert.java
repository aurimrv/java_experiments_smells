package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 68151
search time (ms): 42502
total runtime (ms): 44530
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 0], 
3)----->insere[String, -863]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=0;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("0",clsUTTabelaHashP2P2.toString());
    assertEquals(0,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Integer clsUTTabelaHashP3P2O0=-863;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("-863",clsUTTabelaHashP3P2.toString());
    assertEquals(-863,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u0065], 
3)----->insere[String, 63.95186F]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("rl8(3q!_");
    Character clsUTTabelaHashP2P2O0='\u0065';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("rl8(3q!_",clsUTTabelaHashP2P1.toString());
    assertEquals("e",clsUTTabelaHashP2P2.toString());
    assertEquals(101,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("&fx6;");
    Float clsUTTabelaHashP3P2O0=63.95186F;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("&fx6;",clsUTTabelaHashP3P1.toString());
    assertEquals("63.95186",clsUTTabelaHashP3P2.toString());
    assertEquals(1115672244,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, \u0032]
 Covered Branches:[1, 35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("FrfCh7t");
    char clsUTTabelaHashP3P2O0='\u0032';
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("FrfCh7t",clsUTTabelaHashP3P1.toString());
    assertEquals("2",clsUTTabelaHashP3P2.toString());
    assertEquals(50,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, -9.778328F], 
4)----->toString[]
 Covered Branches:[32, 1, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 31]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("igfq");
    float clsUTTabelaHashP3P2O0=-9.778328F;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("igfq",clsUTTabelaHashP3P1.toString());
    assertEquals("-9.778328",clsUTTabelaHashP3P2.toString());
    assertEquals(-1055099896,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    char[] clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 683], 
3)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("Entrada[");
    Integer clsUTTabelaHashP2P2O0=683;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("Entrada[",clsUTTabelaHashP2P1.toString());
    assertEquals("683",clsUTTabelaHashP2P2.toString());
    assertEquals(683,clsUTTabelaHashP2P2.hashCode());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -709], 
3)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("p83ril5w4");
    Integer clsUTTabelaHashP2P2O0=-709;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("p83ril5w4",clsUTTabelaHashP2P1.toString());
    assertEquals("-709",clsUTTabelaHashP2P2.toString());
    assertEquals(-709,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->retira[String], 
4)----->imprime[]
 Covered Branches:[32, 34, 35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 25, 27, 28, 29, 31]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("  ");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("  ",clsUTTabelaHashP3P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, csbst.generators.CopyGenerator@0], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("z3");
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,clsUTTabelaHash);
    assertEquals("z3",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.trim();
    String clsUTTabelaHashP4P1=new String("_r:");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("_r:",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -30.844727F], 
3)----->imprime[], 
4)----->retira[String]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    float clsUTTabelaHashP2P2O0=-30.844727F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-30.844727",clsUTTabelaHashP2P2.toString());
    assertEquals(-1040793088,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
}

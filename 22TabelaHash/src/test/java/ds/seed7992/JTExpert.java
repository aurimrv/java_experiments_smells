package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Rule;
import ds.TabelaHash;
import java.util.Date;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26]
Uncovered branches: [19]
Total number of branches: 26
Total number of covered branches: 25
Coverage : 96,15%
Evaluations : 56583
search time (ms): 42501
total runtime (ms): 44181
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 2308], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[17, 1, 18, 6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("false");
    short clsUTTabelaHashP2P2O0=2308;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("false",clsUTTabelaHashP2P1.toString());
    assertEquals("2308",clsUTTabelaHashP2P2.toString());
    assertEquals(2308,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    boolean clsUTTabelaHashP3RP0R=false;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.isEmpty();
    assertEquals(false,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP4P1=new String("");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 422], 
3)----->imprime[], 
4)----->retira[String]
 Covered Branches:[1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21, 23, 24, 25, 26]
 */
 @Ignore
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=422;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("422",clsUTTabelaHashP2P2.toString());
    assertEquals(422,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String(".s");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals(".s",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, null], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)null);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.Date[]], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("-45");
    Date clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new Date();
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("-45",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3P1=new String("1");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("1",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->imprime[]
 Covered Branches:[6, 7, 23, 24, 10, 26, 11]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, ds.TabelaHash[]], 
4)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("  ");
    TabelaHash clsUTTabelaHashP3P2O0=null;
      clsUTTabelaHashP3P2O0=new TabelaHash();
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("  ",clsUTTabelaHashP3P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->pesquisa[String], 
3)----->insere[String, -91], 
4)----->toString[], 
5)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("3gp6ph2");
    Object clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP2P1);
    assertEquals("3gp6ph2",clsUTTabelaHashP2P1.toString());
    assertNull(clsUTTabelaHashP2R);
    String clsUTTabelaHashP3P1=new String("");
    Byte clsUTTabelaHashP3P2O0=-91;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("-91",clsUTTabelaHashP3P2.toString());
    assertEquals(-91,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    CharSequence clsUTTabelaHashP4RP0P1=null;
      clsUTTabelaHashP4RP0P1=new String();
    boolean clsUTTabelaHashP4RP0R=false;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.contains(clsUTTabelaHashP4RP0P1);
    assertEquals("",clsUTTabelaHashP4RP0P1.toString());
    assertEquals(0,clsUTTabelaHashP4RP0P1.length());
    assertEquals(true,clsUTTabelaHashP4RP0R);
    int clsUTTabelaHashP4RP1P1P1=465;
    CharSequence clsUTTabelaHashP4RP1P1=null;
      clsUTTabelaHashP4RP1P1=new StringBuilder(clsUTTabelaHashP4RP1P1P1);
    StringBuilder clsUTTabelaHashP4RP1P2P1=null;
      clsUTTabelaHashP4RP1P2P1=new StringBuilder();
    CharSequence clsUTTabelaHashP4RP1P2=null;
      clsUTTabelaHashP4RP1P2=new String(clsUTTabelaHashP4RP1P2P1);
    String clsUTTabelaHashP4RP1R=null;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.replace(clsUTTabelaHashP4RP1P1,clsUTTabelaHashP4RP1P2);
    assertEquals("",clsUTTabelaHashP4RP1P1.toString());
    assertEquals(0,clsUTTabelaHashP4RP1P1.length());
    assertEquals("",clsUTTabelaHashP4RP1P2.toString());
    assertEquals(0,clsUTTabelaHashP4RP1P2.length());
    String clsUTTabelaHashP5P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP5P1);
    assertEquals("",clsUTTabelaHashP5P1.toString());
  }
}

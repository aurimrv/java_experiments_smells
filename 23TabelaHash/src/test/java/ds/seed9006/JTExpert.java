package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.IdentityHashMap;
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
Evaluations : 63629
search time (ms): 42501
total runtime (ms): 44674
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 70.42966F], 
3)----->insere[String, java.util.IdentityHashMap[]], 
4)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    float clsUTTabelaHashP2P2O0=70.42966F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("70.42966",clsUTTabelaHashP2P2.toString());
    assertEquals(1116527612,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    IdentityHashMap clsUTTabelaHashP3P2O0=null;
      clsUTTabelaHashP3P2O0=new IdentityHashMap();
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("{}",clsUTTabelaHashP3P2.toString());
    assertEquals(0,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("false");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("false",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 32], 
3)----->insere[String, 8], 
4)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("v` ]3 p=ef");
    Byte clsUTTabelaHashP2P2O0=32;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("v` ]3 p=ef",clsUTTabelaHashP2P1.toString());
    assertEquals("32",clsUTTabelaHashP2P2.toString());
    assertEquals(32,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Integer clsUTTabelaHashP3P2O0=8;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("8",clsUTTabelaHashP3P2.toString());
    assertEquals(8,clsUTTabelaHashP3P2.hashCode());
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 905], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("HQKYqxJWL");
    Integer clsUTTabelaHashP2P2O0=905;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("HQKYqxJWL",clsUTTabelaHashP2P1.toString());
    assertEquals("905",clsUTTabelaHashP2P2.toString());
    assertEquals(905,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("false");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("false",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    char clsUTTabelaHashP4RP0P1='\u821e';
    char clsUTTabelaHashP4RP0P2='\u0021';
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.replace(clsUTTabelaHashP4RP0P1,clsUTTabelaHashP4RP0P2);
    String clsUTTabelaHashP4RP1R=null;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 11411], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    short clsUTTabelaHashP2P2O0=11411;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("11411",clsUTTabelaHashP2P2.toString());
    assertEquals(11411,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("11411",clsUTTabelaHashP3R.toString());
    assertEquals(11411,clsUTTabelaHashP3R.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.intern();
    String clsUTTabelaHashP4RP1P1=new String("0/*_{95{84+7`&);`{`}8@#+][]@+#~&){ ");
    boolean clsUTTabelaHashP4RP1R=false;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.startsWith(clsUTTabelaHashP4RP1P1);
    assertEquals(false,clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 89.297806F], 
3)----->pesquisa[String], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    float clsUTTabelaHashP2P2O0=89.297806F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("89.297806",clsUTTabelaHashP2P2.toString());
    assertEquals(1119000698,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -75], 
3)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("]:");
    Short clsUTTabelaHashP2P2O0=-75;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("]:",clsUTTabelaHashP2P1.toString());
    assertEquals("-75",clsUTTabelaHashP2P2.toString());
    assertEquals(-75,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    double clsUTTabelaHashP3RP0P1P1=-88.23169327981691D;
    CharSequence clsUTTabelaHashP3RP0P1=null;
      clsUTTabelaHashP3RP0P1=String.valueOf(clsUTTabelaHashP3RP0P1P1);
    String clsUTTabelaHashP3RP0R=null;
//Exception
    try {
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.replace(clsUTTabelaHashP3RP0P1,(CharSequence)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-88.23169327981691",clsUTTabelaHashP3RP0P1.toString());
    assertEquals(18,clsUTTabelaHashP3RP0P1.length());
    assertNull(clsUTTabelaHashP3RP0R);
    float clsUTTabelaHashP3RP1P1=-12.242439F;
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=String.valueOf(clsUTTabelaHashP3RP1P1);
    assertEquals("-12.242439",clsUTTabelaHashP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, ds.TabelaHash[]], 
3)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    TabelaHash clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new TabelaHash();
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 32], 
3)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=32;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("32",clsUTTabelaHashP2P2.toString());
    assertEquals(32,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->pesquisa[String]
 Covered Branches:[32, 34, 6, 7, 8, 10, 11, 12, 15, 16, 18, 28, 29, 31]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[]
 Covered Branches:[35, 36, 6, 38, 7, 10, 11]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String]
 Covered Branches:[6, 7, 8, 25, 10, 11, 27, 12, 15]
 */
  @Test public void TestCase10() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("",clsUTTabelaHashP2P1.toString());
  }
}

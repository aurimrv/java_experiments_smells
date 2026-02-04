package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.Date;
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
Evaluations : 65939
search time (ms): 42501
total runtime (ms): 44214
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -308], 
3)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("_");
    Integer clsUTTabelaHashP2P2O0=-308;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("_",clsUTTabelaHashP2P1.toString());
    assertEquals("-308",clsUTTabelaHashP2P2.toString());
    assertEquals(-308,clsUTTabelaHashP2P2.hashCode());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.Date[-48L]], 
3)----->insere[String, csbst.generators.CopyGenerator@0], 
4)----->retira[String], 
5)----->insere[String, false], 
6)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 25, 27]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    long clsUTTabelaHashP2P2O0P1=-48L;
    Date clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new Date(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("Wed Dec 31 23:59:59 GMT 1969",clsUTTabelaHashP2P2.toString());
    assertEquals(47,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,clsUTTabelaHash);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4P1=new String("  ");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("  ",clsUTTabelaHashP4P1.toString());
    String clsUTTabelaHashP5P1=new String("EXDkoShWAaK40F3wY19");
    Boolean clsUTTabelaHashP5P2O0=false;
    Object clsUTTabelaHashP5P2=clsUTTabelaHashP5P2O0;
//Exception
    try {
      clsUTTabelaHash.insere(clsUTTabelaHashP5P1,(Object)clsUTTabelaHashP5P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("EXDkoShWAaK40F3wY19",clsUTTabelaHashP5P1.toString());
    assertEquals("false",clsUTTabelaHashP5P2.toString());
    assertEquals(1237,clsUTTabelaHashP5P2.hashCode());
    String clsUTTabelaHashP6P1=new String("TD?>67JC}!pNMZc~${g)&m0`L");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP6P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("TD?>67JC}!pNMZc~${g)&m0`L",clsUTTabelaHashP6P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, -41.279435694069235D], 
4)----->insere[String, -70.20243852159528D]
 Covered Branches:[32, 1, 34, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 28, 29, 31]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("]:");
    double clsUTTabelaHashP3P2O0=-41.279435694069235D;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("]:",clsUTTabelaHashP3P1.toString());
    assertEquals("-41.279435694069235",clsUTTabelaHashP3P2.toString());
    assertEquals(1278938528,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("12");
    double clsUTTabelaHashP4P2O0=-70.20243852159528D;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("12",clsUTTabelaHashP4P1.toString());
    assertEquals("-70.20243852159528",clsUTTabelaHashP4P2.toString());
    assertEquals(14868487,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 19.84873441794963D], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("T0QWGKiXce");
    Double clsUTTabelaHashP2P2O0=19.84873441794963D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("T0QWGKiXce",clsUTTabelaHashP2P1.toString());
    assertEquals("19.84873441794963",clsUTTabelaHashP2P2.toString());
    assertEquals(-392442858,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    boolean clsUTTabelaHashP4RP0P1=true;
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=String.valueOf(clsUTTabelaHashP4RP0P1);
    assertEquals("true",clsUTTabelaHashP4RP0R);
    String clsUTTabelaHashP4RP1P1=new String("::+@_{_[_;[;~;*'+&|.+(");
    int clsUTTabelaHashP4RP1P2=693;
    String[] clsUTTabelaHashP4RP1R=null;
//Exception
    try {
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.split(clsUTTabelaHashP4RP1P1,clsUTTabelaHashP4RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 303], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=303;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("303",clsUTTabelaHashP2P2.toString());
    assertEquals(303,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("303",clsUTTabelaHashP3R.toString());
    assertEquals(303,clsUTTabelaHashP3R.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1=new String("uolr1y4f36sjdqp2i7w9xcgabkvnm0te");
    int clsUTTabelaHashP4RP0R=0;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.compareToIgnoreCase(clsUTTabelaHashP4RP0P1);
    assertEquals("uolr1y4f36sjdqp2i7w9xcgabkvnm0te",clsUTTabelaHashP4RP0P1.toString());
    assertEquals(-17,clsUTTabelaHashP4RP0R);
    char clsUTTabelaHashP4RP1P1='\u0066';
    String clsUTTabelaHashP4RP1R=null;
      clsUTTabelaHashP4RP1R=String.valueOf(clsUTTabelaHashP4RP1P1);
    assertEquals("f",clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->pesquisa[String]
 Covered Branches:[32, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 28, 29, 31]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("]:");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("]:",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.TreeMap[[]]], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
 @Ignore
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Map clsUTTabelaHashP2P2O0P1=null;
      clsUTTabelaHashP2P2O0P1=new ConcurrentHashMap();
    SortedMap clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new TreeMap(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("{}",clsUTTabelaHashP2P2.toString());
    assertEquals(0,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.length();
    assertEquals(22,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, ds.TabelaHash[]], 
4)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("");
    TabelaHash clsUTTabelaHashP3P2O0=null;
      clsUTTabelaHashP3P2O0=new TabelaHash();
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String], 
3)----->imprime[], 
4)----->insere[String, String]
 Covered Branches:[1, 35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 25, 27]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("+x");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("+x",clsUTTabelaHashP2P1.toString());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String("XmErqLjB2ik");
    String clsUTTabelaHashP4P2O0=new String("]:");
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("XmErqLjB2ik",clsUTTabelaHashP4P1.toString());
    assertEquals("]:",clsUTTabelaHashP4P2.toString());
    assertEquals(2941,clsUTTabelaHashP4P2.hashCode());
  }
}

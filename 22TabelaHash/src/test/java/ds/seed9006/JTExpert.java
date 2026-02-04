package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.TabelaHash;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26]
Uncovered branches: [19]
Total number of branches: 26
Total number of covered branches: 25
Coverage : 96,15%
Evaluations : 53698
search time (ms): 42501
total runtime (ms): 44234
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 4.573951067853539E307D], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("  ");
    double clsUTTabelaHashP2P2O0=4.573951067853539E307D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("  ",clsUTTabelaHashP2P1.toString());
    assertEquals("4.573951067853539E307",clsUTTabelaHashP2P2.toString());
    assertEquals(-131689852,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, String], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    String clsUTTabelaHashP2P2O0=new String("fLhTsLGLwzchOSbT");
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("fLhTsLGLwzchOSbT",clsUTTabelaHashP2P2.toString());
    assertEquals(770589582,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP3RP0P1=new String("Entrada: ");
    Object[] clsUTTabelaHashP3RP0P2=new Object[]{};
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=String.format(clsUTTabelaHashP3RP0P1,(Object[])clsUTTabelaHashP3RP0P2);
    assertEquals("Entrada: ",clsUTTabelaHashP3RP0P1.toString());
    assertEquals("Entrada: ",clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -46.887505F], 
3)----->toString[]
 Covered Branches:[17, 1, 18, 6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("  ");
    Float clsUTTabelaHashP2P2O0=-46.887505F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("  ",clsUTTabelaHashP2P1.toString());
    assertEquals("-46.887505",clsUTTabelaHashP2P2.toString());
    assertEquals(-1036284722,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=1;
    int clsUTTabelaHashP3RP0P2=144;
    byte[] clsUTTabelaHashP3RP0P3=new byte[]{};
    int clsUTTabelaHashP3RP0P4=1;
//Exception
    try {
      clsUTTabelaHashP3R.getBytes(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2,clsUTTabelaHashP3RP0P3,clsUTTabelaHashP3RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{},clsUTTabelaHashP3RP0P3));
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, false], 
3)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("656");
    Boolean clsUTTabelaHashP2P2O0=false;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("656",clsUTTabelaHashP2P1.toString());
    assertEquals("false",clsUTTabelaHashP2P2.toString());
    assertEquals(1237,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -461], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("1(/|");
    Integer clsUTTabelaHashP2P2O0=-461;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("1(/|",clsUTTabelaHashP2P1.toString());
    assertEquals("-461",clsUTTabelaHashP2P2.toString());
    assertEquals(-461,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("762");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("762",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1=new String("2637580419");
    int clsUTTabelaHashP4RP0R=0;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.indexOf(clsUTTabelaHashP4RP0P1);
    assertEquals("2637580419",clsUTTabelaHashP4RP0P1.toString());
    assertEquals(-1,clsUTTabelaHashP4RP0R);
    String clsUTTabelaHashP4RP1P1=new String("6^{[e80Cf.E=sc@7~2j4:JRH #&g)`(^");
    int clsUTTabelaHashP4RP1R=0;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.indexOf(clsUTTabelaHashP4RP1P1);
    assertEquals(-1,clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -34], 
3)----->pesquisa[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    byte clsUTTabelaHashP2P2O0=-34;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-34",clsUTTabelaHashP2P2.toString());
    assertEquals(-34,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("-34",clsUTTabelaHashP3R.toString());
    assertEquals(-34,clsUTTabelaHashP3R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->pesquisa[String]
 Covered Branches:[6, 7, 23, 24, 8, 9, 10, 26, 11, 12, 13]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("-771");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("-771",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
}

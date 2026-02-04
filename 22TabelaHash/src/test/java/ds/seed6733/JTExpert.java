package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import java.nio.charset.Charset;
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
Evaluations : 55626
search time (ms): 42501
total runtime (ms): 44174
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 76], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("#%;|'");
    Short clsUTTabelaHashP2P2O0=76;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("#%;|'",clsUTTabelaHashP2P1.toString());
    assertEquals("76",clsUTTabelaHashP2P2.toString());
    assertEquals(76,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("-376");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-376",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->pesquisa[String]
 Covered Branches:[6, 7, 23, 24, 8, 10, 26, 11, 12, 13]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->pesquisa[String], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[6, 7, 23, 8, 24, 9, 10, 26, 11, 12, 13]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("JQscHI");
    Object clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP2P1);
    assertEquals("JQscHI",clsUTTabelaHashP2P1.toString());
    assertNull(clsUTTabelaHashP2R);
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -360], 
3)----->pesquisa[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=-360;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-360",clsUTTabelaHashP2P2.toString());
    assertEquals(-360,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("728134");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("728134",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, null], 
3)----->pesquisa[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase4() throws Throwable {
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
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -749], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("cWUH");
    int clsUTTabelaHashP2P2O0=-749;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("cWUH",clsUTTabelaHashP2P1.toString());
    assertEquals("-749",clsUTTabelaHashP2P2.toString());
    assertEquals(-749,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -16], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Byte clsUTTabelaHashP2P2O0=-16;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-16",clsUTTabelaHashP2P2.toString());
    assertEquals(-16,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.toString();
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -60.017302951724346D], 
3)----->toString[]
 Covered Branches:[17, 1, 18, 6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("YSxiudl");
    double clsUTTabelaHashP2P2O0=-60.017302951724346D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("YSxiudl",clsUTTabelaHashP2P1.toString());
    assertEquals("-60.017302951724346",clsUTTabelaHashP2P2.toString());
    assertEquals(1004790228,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    Charset clsUTTabelaHashP3RP0P1=null;
      clsUTTabelaHashP3RP0P1=Charset.defaultCharset();
    byte[] clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.getBytes(clsUTTabelaHashP3RP0P1);
    assertEquals("UTF-8",clsUTTabelaHashP3RP0P1.displayName());
    assertEquals(true,clsUTTabelaHashP3RP0P1.isRegistered());
    Locale clsUTTabelaHashP3RP1P1=null;
      clsUTTabelaHashP3RP1P1=(Locale)Locale.UK;
    String clsUTTabelaHashP3RP1P2=new String("UcSdT1u- WB|qf^2!8*G3QC_$y7i=[Egomk9LI(r#wt");
    Object[] clsUTTabelaHashP3RP1P3=new Object[]{};
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=String.format(clsUTTabelaHashP3RP1P1,clsUTTabelaHashP3RP1P2,(Object[])clsUTTabelaHashP3RP1P3);
    assertEquals("",clsUTTabelaHashP3RP1P1.getDisplayVariant());
    assertEquals("United Kingdom",clsUTTabelaHashP3RP1P1.getDisplayCountry());
    assertEquals("eng",clsUTTabelaHashP3RP1P1.getISO3Language());
    assertEquals(96622908,clsUTTabelaHashP3RP1P1.hashCode());
    assertEquals("UcSdT1u- WB|qf^2!8*G3QC_$y7i=[Egomk9LI(r#wt",clsUTTabelaHashP3RP1P2.toString());
    assertEquals("UcSdT1u- WB|qf^2!8*G3QC_$y7i=[Egomk9LI(r#wt",clsUTTabelaHashP3RP1R);
  }
}

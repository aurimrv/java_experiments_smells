package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import java.util.Locale;
import ds.Item;
import java.util.Date;
import ds.FPHeapMax;
/** 
 * This class was automatically generated to test the ds.FPHeapMax class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 5, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 21, 23, 24]
Uncovered branches: [17, 4, 6, 22, 7, 9, 13]
Total number of branches: 24
Total number of covered branches: 17
Coverage : 70,83%
Evaluations : 87914
search time (ms): 42501
total runtime (ms): 44142
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[569]
2)----->refaz[465, -130], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=569;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=465;
    int clsUTFPHeapMaxP2P2=-130;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String("o5SvKiXM1Ndlwu2JAjI0ECRVxgTtzBpLUryO9hneYfmc");
    String clsUTFPHeapMaxP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.replaceFirst(clsUTFPHeapMaxP3RP0P1,(String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("o5SvKiXM1Ndlwu2JAjI0ECRVxgTtzBpLUryO9hneYfmc",clsUTFPHeapMaxP3RP0P1.toString());
    assertNull(clsUTFPHeapMaxP3RP0R);
    boolean clsUTFPHeapMaxP3RP1R=false;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.isEmpty();
    assertEquals(false,clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[186]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8, 10, 11, 12]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=186;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String("fiey9mlonpvux1");
    Date clsUTFPHeapMaxP3RP0P2P1O0=null;
    Object clsUTFPHeapMaxP3RP0P2P1=clsUTFPHeapMaxP3RP0P2P1O0;
    short clsUTFPHeapMaxP3RP0P2P2O0=17439;
    Object clsUTFPHeapMaxP3RP0P2P2=clsUTFPHeapMaxP3RP0P2P2O0;
    String clsUTFPHeapMaxP3RP0P2P3O0P1=new String("EB&D`|5)?jNalt;[x*q7zo>O3V+pL$<642u9Z8_S/m~AF'rKkgcPv%} G1hXQ-(bWnyde{:UCsRH]_@f.=YI!#T0^iwJM\\\\\\\\\\\\\"");
    StringBuffer clsUTFPHeapMaxP3RP0P2P3O0=null;
      clsUTFPHeapMaxP3RP0P2P3O0=new StringBuffer(clsUTFPHeapMaxP3RP0P2P3O0P1);
    Object clsUTFPHeapMaxP3RP0P2P3=clsUTFPHeapMaxP3RP0P2P3O0;
    int clsUTFPHeapMaxP3RP0P2P4O0P1=-105;
    Item clsUTFPHeapMaxP3RP0P2P4O0=null;
      clsUTFPHeapMaxP3RP0P2P4O0=new MeuItem(clsUTFPHeapMaxP3RP0P2P4O0P1);
    Object clsUTFPHeapMaxP3RP0P2P4=clsUTFPHeapMaxP3RP0P2P4O0;
    Object[] clsUTFPHeapMaxP3RP0P2=new Object[]{clsUTFPHeapMaxP3RP0P2P1,clsUTFPHeapMaxP3RP0P2P2,clsUTFPHeapMaxP3RP0P2P3,clsUTFPHeapMaxP3RP0P2P4};
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=String.format(clsUTFPHeapMaxP3RP0P1,(Object[])clsUTFPHeapMaxP3RP0P2);
    assertEquals("fiey9mlonpvux1",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals("fiey9mlonpvux1",clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[697]
2)----->copia[[retiraMax[],ds.MeuItem[459],ds.MeuItem[1],ds.MeuItem[1]]], 
3)----->max[]
 Covered Branches:[1, 23, 24, 10]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=697;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P0P1=2;
    FPHeapMax clsUTFPHeapMaxP2P1P1P0=null;
      clsUTFPHeapMaxP2P1P1P0=new FPHeapMax(clsUTFPHeapMaxP2P1P1P0P1);
    Item clsUTFPHeapMaxP2P1P1=null;
//Exception
    try {
      clsUTFPHeapMaxP2P1P1=clsUTFPHeapMaxP2P1P1P0.retiraMax();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTFPHeapMaxP2P1P2P1=459;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    int clsUTFPHeapMaxP2P1P3P1=1;
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=new MeuItem(clsUTFPHeapMaxP2P1P3P1);
    int clsUTFPHeapMaxP2P1P4P1=1;
    Item clsUTFPHeapMaxP2P1P4=null;
      clsUTFPHeapMaxP2P1P4=new MeuItem(clsUTFPHeapMaxP2P1P4P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3,clsUTFPHeapMaxP2P1P4};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("459",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(459,clsUTFPHeapMaxP3RP0R.hashCode());
    assertEquals("459",clsUTFPHeapMaxP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->refaz[0, 0], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=0;
    int clsUTFPHeapMaxP2P2=0;
//Exception
    try {
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMaxP3R=null;
//Exception
    try {
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    Locale clsUTFPHeapMaxP4RP0P1=null;
      clsUTFPHeapMaxP4RP0P1=(Locale)Locale.ROOT;
    String clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.toUpperCase(clsUTFPHeapMaxP4RP0P1);
    assertEquals("",clsUTFPHeapMaxP4RP0P1.getDisplayScript());
    assertEquals("",clsUTFPHeapMaxP4RP0P1.getISO3Country());
    assertEquals("",clsUTFPHeapMaxP4RP0P1.getScript());
    assertEquals(0,clsUTFPHeapMaxP4RP0P1.hashCode());
    String clsUTFPHeapMaxP4RP1P1=new String("8qwpn6025avodtl3k4yirs9uehjx7gfbcm1z");
    String clsUTFPHeapMaxP4RP1P2=new String(" ");
    String clsUTFPHeapMaxP4RP1R=null;
      clsUTFPHeapMaxP4RP1R=clsUTFPHeapMaxP4R.replaceFirst(clsUTFPHeapMaxP4RP1P1,clsUTFPHeapMaxP4RP1P2);
    assertEquals("8qwpn6025avodtl3k4yirs9uehjx7gfbcm1z",clsUTFPHeapMaxP4RP1P1.toString());
    assertEquals(" ",clsUTFPHeapMaxP4RP1P2.toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->imprime[], 
3)----->max[]
 Covered Branches:[1, 21, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[972]
2)----->aumentaChave[316, null], 
3)----->max[]
 Covered Branches:[1, 10, 14, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=972;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=316;
//Exception
    try {
      clsUTFPHeapMax.aumentaChave(clsUTFPHeapMaxP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[185]
2)----->insere[ds.MeuItem[-687]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=185;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-687;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-687",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    boolean clsUTFPHeapMaxP3RP0R=false;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.isEmpty();
    assertEquals(false,clsUTFPHeapMaxP3RP0R);
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    assertEquals("-687",clsUTFPHeapMaxP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[772]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 18, 19, 10]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=772;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("772",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
//Exception
    try {
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
  }
}

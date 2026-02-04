package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import java.util.Locale;
import ds.FPHeapMin;
import ds.MeuItem;
/** 
 * This class was automatically generated to test the ds.FPHeapMin class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
Uncovered branches: []
Total number of branches: 25
Total number of covered branches: 25
Coverage : 100%
Evaluations : 45838
search time (ms): 42501
total runtime (ms): 44161
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[480]
2)----->insere[ds.MeuItem[-932]], 
3)----->toString[]
 Covered Branches:[1, 17, 19, 21, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1=480;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=-932;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("-932",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[643],ds.MeuItem[-788],ds.MeuItem[211]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7, 9, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=643;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-788;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=211;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[167]]]
2)----->imprime[]
 Covered Branches:[2, 22]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=167;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[652]
2)----->copia[[null,min[]]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 24, 25, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1=652;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2P1P1=null;
    Item clsUTFPHeapMinP2P1P2P0P1P1=null;
    Item[] clsUTFPHeapMinP2P1P2P0P1=new Item[]{clsUTFPHeapMinP2P1P2P0P1P1};
    FPHeapMin clsUTFPHeapMinP2P1P2P0=null;
      clsUTFPHeapMinP2P1P2P0=new FPHeapMin(clsUTFPHeapMinP2P1P2P0P1);
    Item clsUTFPHeapMinP2P1P2=null;
//Exception
    try {
      clsUTFPHeapMinP2P1P2=clsUTFPHeapMinP2P1P2P0.min();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP4RP0P1=-675;
    int clsUTFPHeapMinP4RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.codePointAt(clsUTFPHeapMinP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTFPHeapMinP4RP1R=0;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.length();
    assertEquals(14,clsUTFPHeapMinP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-214],ds.MeuItem[-731]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 12, 13, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-214;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-731;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    int clsUTFPHeapMinP2RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Object clsUTFPHeapMinP2RP1R=null;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("-731",clsUTFPHeapMinP2RP1R.toString());
    assertEquals(-731,clsUTFPHeapMinP2RP1R.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[2]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1=2;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("-182");
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.equalsIgnoreCase(clsUTFPHeapMinP3RP0P1);
    assertEquals("-182",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(false,clsUTFPHeapMinP3RP0R);
    Locale clsUTFPHeapMinP3RP1P1=null;
      clsUTFPHeapMinP3RP1P1=(Locale)Locale.FRENCH;
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.toLowerCase(clsUTFPHeapMinP3RP1P1);
    assertEquals("",clsUTFPHeapMinP3RP1P1.getVariant());
    assertEquals("",clsUTFPHeapMinP3RP1P1.getScript());
    assertEquals("fr",clsUTFPHeapMinP3RP1P1.toLanguageTag());
    assertEquals(false,clsUTFPHeapMinP3RP1P1.hasExtensions());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-458],ds.MeuItem[-555],ds.MeuItem[-313],ds.MeuItem[625]]]
2)----->refaz[0, 1], 
3)----->min[]
 Covered Branches:[2, 3, 4, 5, 8, 11]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-458;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-555;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-313;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=625;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=1;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-458",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(-458,clsUTFPHeapMinP3RP0R.hashCode());
    Object clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-458",clsUTFPHeapMinP3RP1R.toString());
    assertEquals(-458,clsUTFPHeapMinP3RP1R.hashCode());
    assertEquals("-458",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-1],ds.MeuItem[724],ds.MeuItem[1]]]
2)----->diminuiChave[2, 276], 
3)----->min[]
 Covered Branches:[17, 2, 18, 11, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=724;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    Integer clsUTFPHeapMinP2P2O0=276;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("276",clsUTFPHeapMinP2P2.toString());
    assertEquals(276,clsUTFPHeapMinP2P2.hashCode());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("276",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(276,clsUTFPHeapMinP3RP0R.hashCode());
    Object clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("276",clsUTFPHeapMinP3RP1R.toString());
    assertEquals(276,clsUTFPHeapMinP3RP1R.hashCode());
    assertEquals("276",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[659],ds.MeuItem[-875],ds.MeuItem[601],ds.MeuItem[2]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=659;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-875;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=601;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=2;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[134]
2)----->diminuiChave[99, null], 
3)----->toString[]
 Covered Branches:[16, 1, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1=134;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=99;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[2]]]
2)----->insere[null], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 19, 20, 11]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
//Exception
    try {
      clsUTFPHeapMin.insere((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("2",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(2,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("2",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
  }
}

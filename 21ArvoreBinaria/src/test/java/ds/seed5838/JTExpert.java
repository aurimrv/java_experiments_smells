package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.ArvoreBinaria;
import java.util.Locale;
import ds.Item;
/** 
 * This class was automatically generated to test the ds.ArvoreBinaria class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 42, 43, 44, 46, 47]
Uncovered branches: [1, 2, 3, 41, 45]
Total number of branches: 47
Total number of covered branches: 42
Coverage : 89,36%
Evaluations : 71701
search time (ms): 42501
total runtime (ms): 44220
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[838]], 
3)----->insere[ds.MeuItem[-327]], 
4)----->insere[ds.MeuItem[630]], 
5)----->retira[ds.MeuItem[0]], 
6)----->pesquisa[ds.MeuItem[-649]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16, 21, 22, 23, 24, 25, 26]
 */
  @Test public void TestCase0() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=838;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("838",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-327;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-327",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=630;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("630",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=0;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("0",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-649;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-649",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[18]], 
3)----->insere[ds.MeuItem[-1]], 
4)----->insere[ds.MeuItem[-342]], 
5)----->retira[ds.MeuItem[2]], 
6)----->pesquisa[ds.MeuItem[-1]]
 Covered Branches:[32, 33, 34, 35, 4, 6, 7, 8, 10, 11, 12, 13, 14, 21, 22, 23, 24, 25, 26]
 */
  @Test public void TestCase1() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=18;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("18",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-342;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-342",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=2;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("2",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-1;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-1",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6RP0P1P1=426;
    Item clsUTArvoreBinariaP6RP0P1=null;
      clsUTArvoreBinariaP6RP0P1=new MeuItem(clsUTArvoreBinariaP6RP0P1P1);
    int clsUTArvoreBinariaP6RP0R=0;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.compara(clsUTArvoreBinariaP6RP0P1);
    assertEquals("426",clsUTArvoreBinariaP6RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTArvoreBinariaP6RP0R);
    assertEquals("-1",clsUTArvoreBinariaP6R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[860]], 
3)----->retira[ds.MeuItem[136]], 
4)----->insere[ds.MeuItem[-469]], 
5)----->toString[]
 Covered Branches:[32, 34, 35, 21, 22, 11, 12]
 */
  @Test public void TestCase2() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=860;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("860",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=136;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("136",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-469;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-469",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[763]], 
4)----->insere[ds.MeuItem[1]], 
5)----->retira[ds.MeuItem[1]], 
6)----->pesquisa[ds.MeuItem[857]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 8, 9, 11, 12, 13, 15, 16, 17, 21, 23, 25, 27, 29, 30]
 */
  @Test public void TestCase3() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=763;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("763",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=857;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("857",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->testa[], 
3)----->toString[]
 Covered Branches:[32, 36, 37, 47]
 */
  @Test public void TestCase4() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP3R=null;
      clsUTArvoreBinariaP3R=clsUTArvoreBinaria.toString();
    Locale clsUTArvoreBinariaP3RP0P1=null;
      clsUTArvoreBinariaP3RP0P1=(Locale)Locale.FRANCE;
    String clsUTArvoreBinariaP3RP0R=null;
      clsUTArvoreBinariaP3RP0R=clsUTArvoreBinariaP3R.toUpperCase(clsUTArvoreBinariaP3RP0P1);
    assertEquals("",clsUTArvoreBinariaP3RP0P1.getDisplayScript());
    assertEquals("FRA",clsUTArvoreBinariaP3RP0P1.getISO3Country());
    assertEquals("fr_FR",clsUTArvoreBinariaP3RP0P1.toString());
    assertEquals(false,clsUTArvoreBinariaP3RP0P1.hasExtensions());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[203]], 
3)----->insere[ds.MeuItem[-876]], 
4)----->insere[ds.MeuItem[-1]], 
5)----->testa[], 
6)----->pesquisa[ds.MeuItem[1]]
 Covered Branches:[4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 32, 33, 34, 36, 37, 38, 39, 40, 42, 43, 44, 46, 47]
 */
  @Test public void TestCase5() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=203;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("203",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-876;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-876",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP6P1P1=1;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("1",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[625]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[0]], 
5)----->insere[ds.MeuItem[337]], 
6)----->insere[ds.MeuItem[-514]], 
7)----->insere[ds.MeuItem[-315]], 
8)----->retira[ds.MeuItem[0]], 
9)----->pesquisa[ds.MeuItem[83]], 
10)----->toString[]
 Covered Branches:[4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 27, 29, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase6() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=625;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("625",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=0;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("0",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=337;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP5P1);
    assertEquals("337",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-514;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP6P1);
    assertEquals("-514",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP7P1P1=-315;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP7P1);
    assertEquals("-315",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    int clsUTArvoreBinariaP8P1P1=0;
    Item clsUTArvoreBinariaP8P1=null;
      clsUTArvoreBinariaP8P1=new MeuItem(clsUTArvoreBinariaP8P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP8P1);
    assertEquals("0",clsUTArvoreBinariaP8P1.recuperaChave().toString());
    int clsUTArvoreBinariaP9P1P1=83;
    Item clsUTArvoreBinariaP9P1=null;
      clsUTArvoreBinariaP9P1=new MeuItem(clsUTArvoreBinariaP9P1P1);
    Item clsUTArvoreBinariaP9R=null;
      clsUTArvoreBinariaP9R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP9P1);
    assertEquals("83",clsUTArvoreBinariaP9P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP9R);
    String clsUTArvoreBinariaP10R=null;
      clsUTArvoreBinariaP10R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-252]], 
3)----->insere[ds.MeuItem[-791]], 
4)----->insere[ds.MeuItem[578]], 
5)----->retira[ds.MeuItem[-252]], 
6)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 14, 15, 16, 18, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase7() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-252;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-252",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-791;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-791",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=578;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("578",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-252;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-252",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP6RP0P1=412;
    String clsUTArvoreBinariaP6RP0R=null;
//Exception
    try {
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.substring(clsUTArvoreBinariaP6RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArvoreBinariaP6RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[178]], 
3)----->pesquisa[ds.MeuItem[212]]
 Covered Branches:[32, 33, 34, 4, 5, 6, 8, 9, 11, 12]
 */
  @Test public void TestCase8() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=178;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("178",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=212;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
    Item clsUTArvoreBinariaP3R=null;
      clsUTArvoreBinariaP3R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP3P1);
    assertEquals("212",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[759]], 
3)----->testa[], 
4)----->pesquisa[ds.MeuItem[-561]]
 Covered Branches:[32, 33, 34, 36, 4, 37, 5, 38, 6, 7, 40, 11, 12, 44, 47]
 */
  @Test public void TestCase9() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=759;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("759",clsUTArvoreBinariaP2P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP4P1P1=-561;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
    Item clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP4P1);
    assertEquals("-561",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[-1]], 
4)----->retira[ds.MeuItem[1]], 
5)----->pesquisa[ds.MeuItem[-160]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 14, 21, 23, 25, 27, 28]
 */
  @Test public void TestCase10() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-160;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-160",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
}

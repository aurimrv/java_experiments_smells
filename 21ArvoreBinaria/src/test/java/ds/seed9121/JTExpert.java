package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.ArvoreBinaria;
import java.util.Arrays;
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
Evaluations : 66798
search time (ms): 42502
total runtime (ms): 44251
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[-845]], 
4)----->insere[ds.MeuItem[569]], 
5)----->insere[ds.MeuItem[-433]], 
6)----->retira[ds.MeuItem[-1]], 
7)----->pesquisa[ds.MeuItem[516]]
 Covered Branches:[4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 23, 25, 27, 29, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase0() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-845;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-845",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=569;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("569",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-433;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP5P1);
    assertEquals("-433",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-1;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP6P1);
    assertEquals("-1",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP7P1P1=516;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("516",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[766]], 
3)----->insere[ds.MeuItem[1]], 
4)----->insere[ds.MeuItem[977]], 
5)----->retira[ds.MeuItem[1]], 
6)----->pesquisa[ds.MeuItem[8]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16, 21, 23, 24, 25, 27, 28]
 */
  @Test public void TestCase1() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=766;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("766",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=977;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("977",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=8;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("8",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-720]], 
3)----->pesquisa[ds.MeuItem[230]]
 Covered Branches:[32, 33, 34, 4, 5, 6, 8, 9, 11, 12]
 */
  @Test public void TestCase2() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-720;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-720",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=230;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
    Item clsUTArvoreBinariaP3R=null;
      clsUTArvoreBinariaP3R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP3P1);
    assertEquals("230",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[860]], 
3)----->insere[ds.MeuItem[-757]], 
4)----->testa[], 
5)----->toString[], 
6)----->pesquisa[ds.MeuItem[-807]]
 Covered Branches:[32, 33, 34, 35, 36, 4, 37, 5, 38, 6, 7, 40, 11, 12, 44, 47, 21, 22]
 */
  @Test public void TestCase3() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=860;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("860",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-757;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-757",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    char[] clsUTArvoreBinariaP5RP0P1=new char[]{'\u0034','\u004d','\u0064','\u006d'};
    String clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=String.copyValueOf(clsUTArvoreBinariaP5RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0034','\u004d','\u0064','\u006d'},clsUTArvoreBinariaP5RP0P1));
    assertEquals("4Mdm",clsUTArvoreBinariaP5RP0R);
    int clsUTArvoreBinariaP6P1P1=-807;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-807",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->pesquisa[ds.MeuItem[299]], 
3)----->insere[ds.MeuItem[-169]], 
4)----->insere[ds.MeuItem[964]]
 Covered Branches:[32, 16, 33, 34, 4, 5, 11, 12, 13, 15]
 */
  @Test public void TestCase4() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=299;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
    Item clsUTArvoreBinariaP2R=null;
      clsUTArvoreBinariaP2R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP2P1);
    assertEquals("299",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP2R);
    int clsUTArvoreBinariaP3P1P1=-169;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-169",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=964;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("964",clsUTArvoreBinariaP4P1.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[-1]], 
4)----->retira[ds.MeuItem[-686]], 
5)----->pesquisa[ds.MeuItem[1]]
 Covered Branches:[32, 33, 34, 35, 4, 6, 8, 10, 11, 12, 13, 14, 21, 22, 23, 24]
 */
  @Test public void TestCase5() throws Throwable {
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
    int clsUTArvoreBinariaP4P1P1=-686;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("-686",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    Object clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.recuperaChave();
    assertEquals("1",clsUTArvoreBinariaP5RP0R.toString());
    assertEquals(1,clsUTArvoreBinariaP5RP0R.hashCode());
    assertEquals("1",clsUTArvoreBinariaP5R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[261]], 
3)----->retira[ds.MeuItem[1]], 
4)----->toString[]
 Covered Branches:[32, 34, 35, 21, 22, 23, 24, 11, 12]
 */
  @Test public void TestCase6() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=261;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("261",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    String clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[-125]], 
4)----->retira[ds.MeuItem[381]], 
5)----->pesquisa[ds.MeuItem[-743]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 14, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase7() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-125;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-125",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=381;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("381",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-743;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-743",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[833]], 
4)----->insere[ds.MeuItem[-948]], 
5)----->retira[ds.MeuItem[1]], 
6)----->pesquisa[ds.MeuItem[0]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase8() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=833;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("833",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-948;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-948",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=0;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("0",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->retira[ds.MeuItem[628]], 
4)----->pesquisa[ds.MeuItem[0]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase9() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=628;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("628",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=0;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
    Item clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP4P1);
    assertEquals("0",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[694]], 
4)----->insere[ds.MeuItem[1]], 
5)----->retira[ds.MeuItem[1]], 
6)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 15, 16, 17, 21, 23, 25, 27, 29, 30]
 */
  @Test public void TestCase10() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=694;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("694",clsUTArvoreBinariaP3P1.recuperaChave().toString());
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
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    String clsUTArvoreBinariaP6RP0P1=new String("gOQ3tI7pFl8umkx");
    int clsUTArvoreBinariaP6RP0R=0;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.compareTo(clsUTArvoreBinariaP6RP0P1);
    assertEquals("gOQ3tI7pFl8umkx",clsUTArvoreBinariaP6RP0P1.toString());
    assertEquals(-3,clsUTArvoreBinariaP6RP0R);
    int clsUTArvoreBinariaP6RP1P1=0;
    int clsUTArvoreBinariaP6RP1P2=-897;
    int clsUTArvoreBinariaP6RP1R=0;
//Exception
    try {
      clsUTArvoreBinariaP6RP1R=clsUTArvoreBinariaP6R.codePointCount(clsUTArvoreBinariaP6RP1P1,clsUTArvoreBinariaP6RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[0]], 
3)----->insere[ds.MeuItem[511]], 
4)----->testa[], 
5)----->pesquisa[ds.MeuItem[447]]
 Covered Branches:[32, 33, 34, 36, 4, 37, 5, 38, 6, 7, 40, 8, 9, 11, 43, 12, 44, 13, 46, 15, 47, 16]
 */
  @Test public void TestCase11() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=0;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("0",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=511;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("511",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP5P1P1=447;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("447",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[22]], 
3)----->insere[ds.MeuItem[0]], 
4)----->testa[], 
5)----->toString[]
 Covered Branches:[32, 34, 36, 37, 38, 39, 40, 42, 11, 12, 44, 13, 14, 47]
 */
  @Test public void TestCase12() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=22;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("22",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP5RP0P1=-1;
    int clsUTArvoreBinariaP5RP0P2=211;
    int clsUTArvoreBinariaP5RP0R=0;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.lastIndexOf(clsUTArvoreBinariaP5RP0P1,clsUTArvoreBinariaP5RP0P2);
    assertEquals(-1,clsUTArvoreBinariaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[995]], 
3)----->retira[ds.MeuItem[778]], 
4)----->insere[ds.MeuItem[593]], 
5)----->toString[]
 Covered Branches:[32, 34, 35, 21, 22, 11, 12]
 */
  @Test public void TestCase13() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=995;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("995",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=778;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("778",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=593;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("593",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    byte[] clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.getBytes();
  }
}

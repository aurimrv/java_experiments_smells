package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MeuItem;
import ds.ArvoreBinaria;
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
Evaluations : 72183
search time (ms): 42501
total runtime (ms): 44248
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[869]], 
3)----->insere[ds.MeuItem[649]], 
4)----->testa[], 
5)----->pesquisa[ds.MeuItem[-249]]
 Covered Branches:[32, 33, 34, 36, 4, 37, 5, 38, 6, 39, 7, 40, 42, 11, 12, 44, 13, 14, 47]
 */
  @Test public void TestCase0() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=869;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("869",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=649;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("649",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP5P1P1=-249;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-249",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[607]], 
3)----->retira[ds.MeuItem[-757]], 
4)----->insere[ds.MeuItem[-111]], 
5)----->pesquisa[ds.MeuItem[-93]], 
6)----->toString[]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 8, 9, 11, 12, 21, 22]
 */
  @Test public void TestCase1() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=607;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("607",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-757;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("-757",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-111;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-111",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-93;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-93",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[272]], 
3)----->insere[ds.MeuItem[1]], 
4)----->pesquisa[ds.MeuItem[1]], 
5)----->toString[]
 Covered Branches:[32, 33, 34, 4, 6, 7, 8, 10, 11, 12, 13, 14]
 */
  @Test public void TestCase2() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=272;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("272",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
    Item clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP4P1);
    assertEquals("1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    Object clsUTArvoreBinariaP4RP0R=null;
      clsUTArvoreBinariaP4RP0R=clsUTArvoreBinariaP4R.recuperaChave();
    assertEquals("1",clsUTArvoreBinariaP4RP0R.toString());
    assertEquals(1,clsUTArvoreBinariaP4RP0R.hashCode());
    assertEquals("1",clsUTArvoreBinariaP4R.recuperaChave().toString());
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    boolean clsUTArvoreBinariaP5RP0P1=true;
    String clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=String.valueOf(clsUTArvoreBinariaP5RP0P1);
    assertEquals("true",clsUTArvoreBinariaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[-960]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[243]], 
5)----->testa[], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[-705]]
 Covered Branches:[32, 33, 34, 35, 36, 4, 37, 5, 38, 6, 7, 40, 11, 43, 12, 44, 13, 46, 15, 47, 16, 21, 22]
 */
  @Test public void TestCase3() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-960;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("-960",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=243;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("243",clsUTArvoreBinariaP4P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP7P1P1=-705;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("-705",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->pesquisa[ds.MeuItem[622]], 
3)----->toString[]
 Covered Branches:[32, 33, 4, 5]
 */
  @Test public void TestCase4() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=622;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
    Item clsUTArvoreBinariaP2R=null;
      clsUTArvoreBinariaP2R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP2P1);
    assertEquals("622",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP2R);
    String clsUTArvoreBinariaP3R=null;
      clsUTArvoreBinariaP3R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP3RP0P1=-66;
    int clsUTArvoreBinariaP3RP0P2=492;
    CharSequence clsUTArvoreBinariaP3RP0R=null;
//Exception
    try {
      clsUTArvoreBinariaP3RP0R=clsUTArvoreBinariaP3R.subSequence(clsUTArvoreBinariaP3RP0P1,clsUTArvoreBinariaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArvoreBinariaP3RP0R);
    boolean clsUTArvoreBinariaP3RP1R=false;
      clsUTArvoreBinariaP3RP1R=clsUTArvoreBinariaP3R.isEmpty();
    assertEquals(false,clsUTArvoreBinariaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[990]], 
5)----->retira[ds.MeuItem[0]], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[603]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 21, 23, 25, 26, 27, 29, 30]
 */
  @Test public void TestCase5() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=990;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("990",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=0;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("0",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    String clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.trim();
    int clsUTArvoreBinariaP6RP1P1=138;
    String clsUTArvoreBinariaP6RP1R=null;
//Exception
    try {
      clsUTArvoreBinariaP6RP1R=clsUTArvoreBinariaP6R.substring(clsUTArvoreBinariaP6RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArvoreBinariaP6RP1R);
    int clsUTArvoreBinariaP7P1P1=603;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("603",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->retira[ds.MeuItem[778]], 
4)----->toString[]
 Covered Branches:[32, 34, 35, 21, 22, 23, 25, 26, 11, 12]
 */
  @Test public void TestCase6() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=778;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("778",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    String clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[845]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[-493]], 
5)----->insere[ds.MeuItem[407]], 
6)----->insere[ds.MeuItem[-1]], 
7)----->retira[ds.MeuItem[0]], 
8)----->pesquisa[ds.MeuItem[-540]], 
9)----->toString[]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 23, 24, 25, 27, 29, 31]
 */
  @Test public void TestCase7() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=845;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("845",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-493;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-493",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=407;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP5P1);
    assertEquals("407",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-1;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP6P1);
    assertEquals("-1",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP7P1P1=0;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP7P1);
    assertEquals("0",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    int clsUTArvoreBinariaP8P1P1=-540;
    Item clsUTArvoreBinariaP8P1=null;
      clsUTArvoreBinariaP8P1=new MeuItem(clsUTArvoreBinariaP8P1P1);
    Item clsUTArvoreBinariaP8R=null;
      clsUTArvoreBinariaP8R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP8P1);
    assertEquals("-540",clsUTArvoreBinariaP8P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP8R);
    String clsUTArvoreBinariaP9R=null;
      clsUTArvoreBinariaP9R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[0]], 
3)----->insere[ds.MeuItem[-850]], 
4)----->insere[ds.MeuItem[49]], 
5)----->retira[ds.MeuItem[0]], 
6)----->pesquisa[ds.MeuItem[-577]], 
7)----->toString[]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase8() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=0;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("0",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-850;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-850",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=49;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("49",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=0;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("0",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-577;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-577",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
    String clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.toString();
    char[] clsUTArvoreBinariaP7RP0P1P1=new char[]{'\u006b','\u0069','\u0026','\u9ac4'};
    CharSequence clsUTArvoreBinariaP7RP0P1=null;
      clsUTArvoreBinariaP7RP0P1=String.valueOf(clsUTArvoreBinariaP7RP0P1P1);
    String clsUTArvoreBinariaP7RP0R=null;
//Exception
    try {
      clsUTArvoreBinariaP7RP0R=String.join(clsUTArvoreBinariaP7RP0P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("ki&髄",clsUTArvoreBinariaP7RP0P1.toString());
    assertEquals(4,clsUTArvoreBinariaP7RP0P1.length());
    assertNull(clsUTArvoreBinariaP7RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->retira[ds.MeuItem[1]], 
4)----->retira[ds.MeuItem[-110]], 
5)----->testa[], 
6)----->pesquisa[ds.MeuItem[-699]]
 Covered Branches:[32, 33, 34, 35, 36, 4, 37, 5, 11, 12, 47, 21, 22, 23, 25, 27, 28]
 */
  @Test public void TestCase9() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-110;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("-110",clsUTArvoreBinariaP4P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP6P1P1=-699;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-699",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-71]], 
3)----->testa[]
 Covered Branches:[32, 34, 36, 37, 38, 40, 11, 12, 44, 47]
 */
  @Test public void TestCase10() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-71;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-71",clsUTArvoreBinariaP2P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[448]], 
3)----->insere[ds.MeuItem[-651]], 
4)----->insere[ds.MeuItem[-900]], 
5)----->retira[ds.MeuItem[-828]], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[-144]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 21, 22, 23, 24, 25, 26]
 */
  @Test public void TestCase11() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=448;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("448",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-651;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-651",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-900;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-900",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-828;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-828",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP7P1P1=-144;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("-144",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[568]], 
3)----->retira[ds.MeuItem[-530]], 
4)----->toString[]
 Covered Branches:[32, 34, 35, 21, 22, 23, 24, 11, 12]
 */
  @Test public void TestCase12() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=568;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("568",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-530;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("-530",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    String clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[-348]], 
3)----->insere[ds.MeuItem[-837]], 
4)----->toString[]
 Covered Branches:[32, 34, 35, 21, 22, 11, 12]
 */
  @Test public void TestCase13() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-348;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("-348",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-837;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-837",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    String clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.toString();
    char[] clsUTArvoreBinariaP4RP0P1=new char[]{'\u0037','\u005b'};
    String clsUTArvoreBinariaP4RP0R=null;
      clsUTArvoreBinariaP4RP0R=String.copyValueOf(clsUTArvoreBinariaP4RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0037','\u005b'},clsUTArvoreBinariaP4RP0P1));
    assertEquals("7[",clsUTArvoreBinariaP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[1]], 
4)----->insere[ds.MeuItem[-1]], 
5)----->retira[ds.MeuItem[-702]], 
6)----->pesquisa[ds.MeuItem[641]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 8, 9, 11, 12, 13, 14, 15, 17, 21, 22, 23, 24]
 */
  @Test public void TestCase14() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-702;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-702",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=641;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("641",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
}

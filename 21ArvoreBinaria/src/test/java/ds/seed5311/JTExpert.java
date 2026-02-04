package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MeuItem;
import java.nio.charset.Charset;
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
Evaluations : 74557
search time (ms): 42501
total runtime (ms): 44158
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-360]], 
3)----->insere[ds.MeuItem[-810]], 
4)----->testa[], 
5)----->pesquisa[ds.MeuItem[-12]]
 Covered Branches:[32, 33, 34, 36, 4, 37, 5, 38, 6, 39, 40, 8, 9, 42, 11, 12, 44, 13, 14, 47]
 */
  @Test public void TestCase0() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-360;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-360",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-810;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-810",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP5P1P1=-12;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-12",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[0]], 
3)----->insere[ds.MeuItem[1]], 
4)----->insere[ds.MeuItem[-536]], 
5)----->retira[ds.MeuItem[0]], 
6)----->pesquisa[ds.MeuItem[532]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 8, 9, 11, 12, 13, 14, 15, 16, 18, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase1() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=0;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("0",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-536;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-536",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=0;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("0",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=532;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("532",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->testa[], 
3)----->toString[]
 Covered Branches:[32, 36, 37, 47]
 */
  @Test public void TestCase2() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP3R=null;
      clsUTArvoreBinariaP3R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[931]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[-289]], 
5)----->retira[ds.MeuItem[-395]], 
6)----->pesquisa[ds.MeuItem[0]]
 Covered Branches:[32, 33, 34, 35, 4, 6, 7, 8, 10, 11, 12, 13, 14, 21, 22, 23, 24]
 */
  @Test public void TestCase3() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=931;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("931",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-289;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-289",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-395;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-395",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=0;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("0",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6RP0P1P1=34;
    Item clsUTArvoreBinariaP6RP0P1=null;
      clsUTArvoreBinariaP6RP0P1=new MeuItem(clsUTArvoreBinariaP6RP0P1P1);
    int clsUTArvoreBinariaP6RP0R=0;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.compara(clsUTArvoreBinariaP6RP0P1);
    assertEquals("34",clsUTArvoreBinariaP6RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTArvoreBinariaP6RP0R);
    Object clsUTArvoreBinariaP6RP1R=null;
      clsUTArvoreBinariaP6RP1R=clsUTArvoreBinariaP6R.recuperaChave();
    assertEquals("0",clsUTArvoreBinariaP6RP1R.toString());
    assertEquals(0,clsUTArvoreBinariaP6RP1R.hashCode());
    assertEquals("0",clsUTArvoreBinariaP6R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-732]], 
3)----->insere[ds.MeuItem[1]], 
4)----->insere[ds.MeuItem[406]], 
5)----->retira[ds.MeuItem[1]], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[1]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 21, 23, 25, 26, 27, 29, 30]
 */
  @Test public void TestCase4() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-732;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-732",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=406;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("406",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP7P1P1=1;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("1",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[419]], 
3)----->insere[ds.MeuItem[-1]], 
4)----->insere[ds.MeuItem[117]], 
5)----->insere[ds.MeuItem[-834]], 
6)----->insere[ds.MeuItem[-681]], 
7)----->retira[ds.MeuItem[-1]], 
8)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 23, 24, 25, 27, 29, 31]
 */
  @Test public void TestCase5() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=419;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("419",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=117;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("117",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-834;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP5P1);
    assertEquals("-834",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-681;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP6P1);
    assertEquals("-681",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP7P1P1=-1;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP7P1);
    assertEquals("-1",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    String clsUTArvoreBinariaP8R=null;
      clsUTArvoreBinariaP8R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[521]], 
3)----->insere[ds.MeuItem[310]], 
4)----->testa[], 
5)----->pesquisa[ds.MeuItem[619]]
 Covered Branches:[32, 33, 34, 35, 36, 4, 37, 5, 38, 6, 40, 8, 9, 11, 12, 44, 47, 21, 22]
 */
  @Test public void TestCase6() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=521;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("521",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=310;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("310",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP5P1P1=619;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("619",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-645]], 
3)----->insere[ds.MeuItem[269]], 
4)----->insere[ds.MeuItem[-1]], 
5)----->retira[ds.MeuItem[-1]], 
6)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 14, 15, 16, 21, 23, 24, 25, 26, 27, 28]
 */
  @Test public void TestCase7() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-645;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-645",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=269;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("269",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP6RP0P1=-488;
    int clsUTArvoreBinariaP6RP0P2=999;
    String clsUTArvoreBinariaP6RP0R=null;
//Exception
    try {
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.substring(clsUTArvoreBinariaP6RP0P1,clsUTArvoreBinariaP6RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArvoreBinariaP6RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->retira[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[-734]], 
4)----->pesquisa[ds.MeuItem[42]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 8, 9, 11, 12, 21, 22]
 */
  @Test public void TestCase8() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-734;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-734",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=42;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
    Item clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP4P1);
    assertEquals("42",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-534]], 
3)----->insere[ds.MeuItem[-472]], 
4)----->pesquisa[ds.MeuItem[-836]], 
5)----->toString[]
 Covered Branches:[32, 16, 33, 34, 4, 5, 6, 7, 11, 12, 13, 15]
 */
  @Test public void TestCase9() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-534;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-534",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-472;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-472",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-836;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
    Item clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP4P1);
    assertEquals("-836",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP4R);
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    Charset clsUTArvoreBinariaP5RP0P1=null;
      clsUTArvoreBinariaP5RP0P1=Charset.defaultCharset();
    byte[] clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.getBytes(clsUTArvoreBinariaP5RP0P1);
    assertEquals("UTF-8",clsUTArvoreBinariaP5RP0P1.name());
    assertEquals(true,clsUTArvoreBinariaP5RP0P1.canEncode());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[874]], 
4)----->testa[], 
5)----->pesquisa[ds.MeuItem[-1]], 
6)----->toString[]
 Covered Branches:[32, 33, 34, 36, 4, 37, 5, 38, 6, 7, 40, 11, 43, 12, 44, 13, 46, 15, 47, 16]
 */
  @Test public void TestCase10() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=874;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("874",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP5P1P1=-1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    char clsUTArvoreBinariaP6RP0P1P1='\u0074';
    CharSequence clsUTArvoreBinariaP6RP0P1=null;
      clsUTArvoreBinariaP6RP0P1=String.valueOf(clsUTArvoreBinariaP6RP0P1P1);
    boolean clsUTArvoreBinariaP6RP0R=false;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.contentEquals(clsUTArvoreBinariaP6RP0P1);
    assertEquals("t",clsUTArvoreBinariaP6RP0P1.toString());
    assertEquals(1,clsUTArvoreBinariaP6RP0P1.length());
    assertEquals(false,clsUTArvoreBinariaP6RP0R);
    String clsUTArvoreBinariaP6RP1R=null;
      clsUTArvoreBinariaP6RP1R=clsUTArvoreBinariaP6R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[951]], 
3)----->insere[ds.MeuItem[951]], 
4)----->retira[ds.MeuItem[-832]], 
5)----->pesquisa[ds.MeuItem[-456]], 
6)----->toString[]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 15, 17, 21, 22, 23, 24]
 */
  @Test public void TestCase11() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=951;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("951",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=951;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("951",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-832;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("-832",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-456;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-456",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
  }
}

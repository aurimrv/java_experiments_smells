package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import java.nio.charset.Charset;
import ds.ArvoreBinaria;
import ds.Item;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.ArvoreBinaria class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 42, 43, 44, 46, 47]
Uncovered branches: [1, 2, 3, 41, 45]
Total number of branches: 47
Total number of covered branches: 42
Coverage : 89,36%
Evaluations : 72585
search time (ms): 42501
total runtime (ms): 44239
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[512]], 
3)----->insere[ds.MeuItem[-264]], 
4)----->retira[ds.MeuItem[420]], 
5)----->testa[], 
6)----->toString[]
 Covered Branches:[32, 34, 35, 36, 37, 38, 39, 40, 42, 11, 12, 44, 13, 14, 47, 21, 22, 23, 24, 25, 26]
 */
  @Test public void TestCase0() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=512;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("512",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-264;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-264",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=420;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("420",clsUTArvoreBinariaP4P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[497]], 
3)----->insere[ds.MeuItem[562]], 
4)----->testa[], 
5)----->toString[]
 Covered Branches:[32, 34, 36, 37, 38, 40, 11, 43, 12, 44, 13, 46, 15, 47, 16]
 */
  @Test public void TestCase1() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=497;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("497",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=562;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("562",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP5RP0P1=302;
    char clsUTArvoreBinariaP5RP0R='X';
//Exception
    try {
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.charAt(clsUTArvoreBinariaP5RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->retira[ds.MeuItem[-1]], 
4)----->toString[], 
5)----->pesquisa[ds.MeuItem[581]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 11, 12, 21, 23, 25, 27, 28]
 */
  @Test public void TestCase2() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("-1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    String clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP4RP0P2=0;
    String[] clsUTArvoreBinariaP4RP0R=null;
//Exception
    try {
      clsUTArvoreBinariaP4RP0R=clsUTArvoreBinariaP4R.split((String)null,clsUTArvoreBinariaP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArvoreBinariaP4RP0R);
    byte[] clsUTArvoreBinariaP4RP1R=null;
      clsUTArvoreBinariaP4RP1R=clsUTArvoreBinariaP4R.getBytes();
    int clsUTArvoreBinariaP5P1P1=581;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("581",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[0]], 
3)----->insere[ds.MeuItem[1]], 
4)----->retira[ds.MeuItem[693]], 
5)----->toString[], 
6)----->pesquisa[ds.MeuItem[0]]
 Covered Branches:[32, 33, 34, 35, 4, 6, 8, 10, 11, 12, 13, 15, 16, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase3() throws Throwable {
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
    int clsUTArvoreBinariaP4P1P1=693;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("693",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    byte[] clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.getBytes();
    int clsUTArvoreBinariaP6P1P1=0;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("0",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertEquals("0",clsUTArvoreBinariaP6R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[983]], 
4)----->insere[ds.MeuItem[-699]], 
5)----->insere[ds.MeuItem[-234]], 
6)----->retira[ds.MeuItem[-1]], 
7)----->toString[], 
8)----->pesquisa[ds.MeuItem[674]]
 Covered Branches:[4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 23, 25, 27, 29, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase4() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=983;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("983",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-699;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-699",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-234;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP5P1);
    assertEquals("-234",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-1;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP6P1);
    assertEquals("-1",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    String clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.toString();
    Charset clsUTArvoreBinariaP7RP0P1=null;
      clsUTArvoreBinariaP7RP0P1=Charset.defaultCharset();
    byte[] clsUTArvoreBinariaP7RP0R=null;
      clsUTArvoreBinariaP7RP0R=clsUTArvoreBinariaP7R.getBytes(clsUTArvoreBinariaP7RP0P1);
    assertEquals("UTF-8",clsUTArvoreBinariaP7RP0P1.name());
    assertEquals("UTF-8",clsUTArvoreBinariaP7RP0P1.toString());
    assertEquals(true,clsUTArvoreBinariaP7RP0P1.isRegistered());
    String clsUTArvoreBinariaP7RP1R=null;
      clsUTArvoreBinariaP7RP1R=clsUTArvoreBinariaP7R.toLowerCase();
    int clsUTArvoreBinariaP8P1P1=674;
    Item clsUTArvoreBinariaP8P1=null;
      clsUTArvoreBinariaP8P1=new MeuItem(clsUTArvoreBinariaP8P1P1);
    Item clsUTArvoreBinariaP8R=null;
      clsUTArvoreBinariaP8R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP8P1);
    assertEquals("674",clsUTArvoreBinariaP8P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP8R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-952]], 
3)----->insere[ds.MeuItem[-737]], 
4)----->retira[ds.MeuItem[-1]], 
5)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 15, 16, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase5() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-952;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-952",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-737;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-737",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    char[] clsUTArvoreBinariaP5RP0P1=new char[]{'\u003e'};
    String clsUTArvoreBinariaP5RP0R=null;
      clsUTArvoreBinariaP5RP0R=String.copyValueOf(clsUTArvoreBinariaP5RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u003e'},clsUTArvoreBinariaP5RP0P1));
    assertEquals(">",clsUTArvoreBinariaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[0]], 
5)----->retira[ds.MeuItem[-90]], 
6)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 14, 15, 17, 21, 22, 23, 24]
 */
  @Test public void TestCase6() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
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
    int clsUTArvoreBinariaP5P1P1=-90;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-90",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    String clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->insere[ds.MeuItem[784]], 
4)----->insere[ds.MeuItem[-1]], 
5)----->retira[ds.MeuItem[1]], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[751]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase7() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=784;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("784",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    float clsUTArvoreBinariaP6RP0P1=-26.23008F;
    String clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=String.valueOf(clsUTArvoreBinariaP6RP0P1);
    assertEquals("-26.23008",clsUTArvoreBinariaP6RP0R);
    int clsUTArvoreBinariaP7P1P1=751;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("751",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-7]], 
3)----->insere[ds.MeuItem[2]], 
4)----->retira[ds.MeuItem[218]], 
5)----->pesquisa[ds.MeuItem[-560]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 15, 16, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase8() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-7;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-7",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=2;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("2",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=218;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("218",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-560;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("-560",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[494]], 
3)----->retira[ds.MeuItem[-446]], 
4)----->testa[], 
5)----->pesquisa[ds.MeuItem[749]]
 Covered Branches:[32, 33, 34, 35, 36, 4, 37, 5, 38, 6, 40, 8, 9, 11, 12, 44, 47, 21, 22, 23, 24]
 */
  @Test public void TestCase9() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=494;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("494",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-446;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("-446",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    int clsUTArvoreBinariaP5P1P1=749;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
    Item clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP5P1);
    assertEquals("749",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-751]], 
3)----->insere[ds.MeuItem[0]], 
4)----->insere[ds.MeuItem[847]], 
5)----->retira[ds.MeuItem[0]], 
6)----->pesquisa[ds.MeuItem[-498]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 21, 23, 25, 26, 27, 29, 30]
 */
  @Test public void TestCase10() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-751;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-751",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=0;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("0",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=847;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("847",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=0;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("0",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-498;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-498",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
  }
}

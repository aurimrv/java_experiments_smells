package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Ignore;
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
Evaluations : 72751
search time (ms): 42501
total runtime (ms): 44150
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-166]], 
3)----->pesquisa[ds.MeuItem[-505]], 
4)----->toString[]
 Covered Branches:[32, 33, 34, 4, 5, 6, 7, 11, 12]
 */
  @Test public void TestCase0() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-166;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-166",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-505;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
    Item clsUTArvoreBinariaP3R=null;
      clsUTArvoreBinariaP3R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP3P1);
    assertEquals("-505",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP3R);
    String clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[907]], 
4)----->retira[ds.MeuItem[-1]], 
5)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 15, 16, 21, 23, 25, 27, 29, 30]
 */
  @Test public void TestCase1() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=907;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("907",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    StringBuffer clsUTArvoreBinariaP5RP0P1=null;
      clsUTArvoreBinariaP5RP0P1=new StringBuffer();
    boolean clsUTArvoreBinariaP5RP0R=false;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.contentEquals(clsUTArvoreBinariaP5RP0P1);
    assertEquals("",clsUTArvoreBinariaP5RP0P1.toString());
    assertEquals(0,clsUTArvoreBinariaP5RP0P1.length());
    assertEquals(false,clsUTArvoreBinariaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-550]], 
3)----->insere[ds.MeuItem[-833]], 
4)----->insere[ds.MeuItem[372]], 
5)----->retira[ds.MeuItem[630]], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[483]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 8, 9, 11, 12, 13, 14, 15, 16, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase2() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-550;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-550",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-833;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-833",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=372;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("372",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=630;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("630",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    String clsUTArvoreBinariaP6RP0P1=new String("<>$_{7}&%9}.3'(_+}[4{68{(^ ");
    int clsUTArvoreBinariaP6RP0R=0;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.lastIndexOf(clsUTArvoreBinariaP6RP0P1);
    assertEquals("<>$_{7}&%9}.3'(_+}[4{68{(^ ",clsUTArvoreBinariaP6RP0P1.toString());
    assertEquals(-1,clsUTArvoreBinariaP6RP0R);
    int clsUTArvoreBinariaP6RP1P1=945;
    String clsUTArvoreBinariaP6RP1R=null;
      clsUTArvoreBinariaP6RP1R=String.valueOf(clsUTArvoreBinariaP6RP1P1);
    assertEquals("945",clsUTArvoreBinariaP6RP1R);
    int clsUTArvoreBinariaP7P1P1=483;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("483",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[-956]], 
4)----->insere[ds.MeuItem[897]], 
5)----->retira[ds.MeuItem[-1]], 
6)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 14, 15, 16, 18, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase3() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-956;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-956",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=897;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("897",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-1;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-1",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    String clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.toUpperCase();
    boolean clsUTArvoreBinariaP6RP1R=false;
//Exception
    try {
      clsUTArvoreBinariaP6RP1R=clsUTArvoreBinariaP6R.contentEquals((CharSequence)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[0]], 
3)----->insere[ds.MeuItem[-902]], 
4)----->insere[ds.MeuItem[-1]], 
5)----->insere[ds.MeuItem[0]], 
6)----->insere[ds.MeuItem[9]], 
7)----->retira[ds.MeuItem[0]], 
8)----->toString[]
 Covered Branches:[32, 34, 35, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 25, 27, 29, 31]
 */
  @Test public void TestCase4() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=0;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("0",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-902;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-902",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=0;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP5P1);
    assertEquals("0",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=9;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP6P1);
    assertEquals("9",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    int clsUTArvoreBinariaP7P1P1=0;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP7P1);
    assertEquals("0",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    String clsUTArvoreBinariaP8R=null;
      clsUTArvoreBinariaP8R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[712]], 
3)----->insere[ds.MeuItem[67]], 
4)----->insere[ds.MeuItem[946]], 
5)----->retira[ds.MeuItem[-366]], 
6)----->pesquisa[ds.MeuItem[-389]], 
7)----->toString[]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16, 21, 22, 23, 24]
 */
  @Test public void TestCase5() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=712;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("712",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=67;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("67",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=946;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("946",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-366;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-366",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=-389;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("-389",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP6R);
    String clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP7RP0P1=385;
    int clsUTArvoreBinariaP7RP0P2=-505;
    CharSequence clsUTArvoreBinariaP7RP0R=null;
//Exception
    try {
      clsUTArvoreBinariaP7RP0R=clsUTArvoreBinariaP7R.subSequence(clsUTArvoreBinariaP7RP0P1,clsUTArvoreBinariaP7RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArvoreBinariaP7RP0R);
    char[] clsUTArvoreBinariaP7RP1P1=new char[]{};
    int clsUTArvoreBinariaP7RP1P2=3;
    int clsUTArvoreBinariaP7RP1P3=0;
    String clsUTArvoreBinariaP7RP1R=null;
//Exception
    try {
      clsUTArvoreBinariaP7RP1R=String.copyValueOf(clsUTArvoreBinariaP7RP1P1,clsUTArvoreBinariaP7RP1P2,clsUTArvoreBinariaP7RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{},clsUTArvoreBinariaP7RP1P1));
    assertNull(clsUTArvoreBinariaP7RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[0]], 
3)----->insere[ds.MeuItem[-1]], 
4)----->insere[ds.MeuItem[1]], 
5)----->testa[], 
6)----->toString[]
 Covered Branches:[32, 34, 36, 37, 38, 39, 40, 42, 11, 43, 12, 44, 13, 14, 46, 15, 47, 16]
 */
  @Test public void TestCase6() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=0;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("0",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=1;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("1",clsUTArvoreBinariaP4P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.toString();
    double clsUTArvoreBinariaP6RP0P1=38.0334238911916D;
    String clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=String.valueOf(clsUTArvoreBinariaP6RP0P1);
    assertEquals("38.0334238911916",clsUTArvoreBinariaP6RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->insere[ds.MeuItem[1]], 
4)----->insere[ds.MeuItem[-371]], 
5)----->retira[ds.MeuItem[-844]], 
6)----->pesquisa[ds.MeuItem[1]]
 Covered Branches:[32, 33, 34, 35, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 21, 22, 23, 24]
 */
  @Test public void TestCase7() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
    int clsUTArvoreBinariaP4P1P1=-371;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP4P1);
    assertEquals("-371",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    int clsUTArvoreBinariaP5P1P1=-844;
    Item clsUTArvoreBinariaP5P1=null;
      clsUTArvoreBinariaP5P1=new MeuItem(clsUTArvoreBinariaP5P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP5P1);
    assertEquals("-844",clsUTArvoreBinariaP5P1.recuperaChave().toString());
    int clsUTArvoreBinariaP6P1P1=1;
    Item clsUTArvoreBinariaP6P1=null;
      clsUTArvoreBinariaP6P1=new MeuItem(clsUTArvoreBinariaP6P1P1);
    Item clsUTArvoreBinariaP6R=null;
      clsUTArvoreBinariaP6R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP6P1);
    assertEquals("1",clsUTArvoreBinariaP6P1.recuperaChave().toString());
    Object clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.recuperaChave();
    assertEquals("1",clsUTArvoreBinariaP6RP0R.toString());
    assertEquals(1,clsUTArvoreBinariaP6RP0R.hashCode());
    assertEquals("1",clsUTArvoreBinariaP6R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-1]], 
3)----->retira[ds.MeuItem[125]], 
4)----->testa[], 
5)----->toString[]
 Covered Branches:[32, 34, 35, 36, 37, 38, 40, 11, 12, 44, 47, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase8() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-1;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-1",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=125;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.retira(clsUTArvoreBinariaP3P1);
    assertEquals("125",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-268]], 
3)----->insere[ds.MeuItem[-1]], 
4)----->insere[ds.MeuItem[-1]], 
5)----->retira[ds.MeuItem[1]], 
6)----->toString[], 
7)----->pesquisa[ds.MeuItem[-738]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 6, 7, 11, 12, 13, 15, 16, 17, 21, 22, 23, 25, 26]
 */
  @Test public void TestCase9() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-268;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-268",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-1;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-1",clsUTArvoreBinariaP3P1.recuperaChave().toString());
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
    Integer clsUTArvoreBinariaP6RP0P1P1O0=584;
    Object clsUTArvoreBinariaP6RP0P1P1=clsUTArvoreBinariaP6RP0P1P1O0;
    CharSequence clsUTArvoreBinariaP6RP0P1=null;
      clsUTArvoreBinariaP6RP0P1=String.valueOf(clsUTArvoreBinariaP6RP0P1P1);
    float clsUTArvoreBinariaP6RP0P2P1=-12.181404F;
    CharSequence clsUTArvoreBinariaP6RP0P2=null;
      clsUTArvoreBinariaP6RP0P2=String.valueOf(clsUTArvoreBinariaP6RP0P2P1);
    String clsUTArvoreBinariaP6RP0R=null;
      clsUTArvoreBinariaP6RP0R=clsUTArvoreBinariaP6R.replace(clsUTArvoreBinariaP6RP0P1,clsUTArvoreBinariaP6RP0P2);
    assertEquals("584",clsUTArvoreBinariaP6RP0P1.toString());
    assertEquals(3,clsUTArvoreBinariaP6RP0P1.length());
    assertEquals("-12.181404",clsUTArvoreBinariaP6RP0P2.toString());
    assertEquals(10,clsUTArvoreBinariaP6RP0P2.length());
    int clsUTArvoreBinariaP7P1P1=-738;
    Item clsUTArvoreBinariaP7P1=null;
      clsUTArvoreBinariaP7P1=new MeuItem(clsUTArvoreBinariaP7P1P1);
    Item clsUTArvoreBinariaP7R=null;
      clsUTArvoreBinariaP7R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP7P1);
    assertEquals("-738",clsUTArvoreBinariaP7P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP7R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[-393]], 
3)----->insere[ds.MeuItem[-569]], 
4)----->testa[], 
5)----->toString[]
 Covered Branches:[32, 34, 36, 37, 38, 39, 40, 42, 11, 12, 44, 13, 14, 47]
 */
 @Ignore
  @Test public void TestCase10() throws Throwable {
    ArvoreBinaria clsUTArvoreBinaria=null;
      clsUTArvoreBinaria=new ArvoreBinaria();
    int clsUTArvoreBinariaP2P1P1=-393;
    Item clsUTArvoreBinariaP2P1=null;
      clsUTArvoreBinariaP2P1=new MeuItem(clsUTArvoreBinariaP2P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP2P1);
    assertEquals("-393",clsUTArvoreBinariaP2P1.recuperaChave().toString());
    int clsUTArvoreBinariaP3P1P1=-569;
    Item clsUTArvoreBinariaP3P1=null;
      clsUTArvoreBinariaP3P1=new MeuItem(clsUTArvoreBinariaP3P1P1);
      clsUTArvoreBinaria.insere(clsUTArvoreBinariaP3P1);
    assertEquals("-569",clsUTArvoreBinariaP3P1.recuperaChave().toString());
      clsUTArvoreBinaria.testa();
    String clsUTArvoreBinariaP5R=null;
      clsUTArvoreBinariaP5R=clsUTArvoreBinaria.toString();
    int clsUTArvoreBinariaP5RP0R=0;
      clsUTArvoreBinariaP5RP0R=clsUTArvoreBinariaP5R.length();
    assertEquals(25,clsUTArvoreBinariaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.ArvoreBinaria[]
2)----->insere[ds.MeuItem[1]], 
3)----->retira[ds.MeuItem[1]], 
4)----->pesquisa[ds.MeuItem[877]]
 Covered Branches:[32, 33, 34, 35, 4, 5, 11, 12, 21, 23, 25, 27, 28]
 */
  @Test public void TestCase11() throws Throwable {
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
    int clsUTArvoreBinariaP4P1P1=877;
    Item clsUTArvoreBinariaP4P1=null;
      clsUTArvoreBinariaP4P1=new MeuItem(clsUTArvoreBinariaP4P1P1);
    Item clsUTArvoreBinariaP4R=null;
      clsUTArvoreBinariaP4R=clsUTArvoreBinaria.pesquisa(clsUTArvoreBinariaP4P1);
    assertEquals("877",clsUTArvoreBinariaP4P1.recuperaChave().toString());
    assertNull(clsUTArvoreBinariaP4R);
  }
}

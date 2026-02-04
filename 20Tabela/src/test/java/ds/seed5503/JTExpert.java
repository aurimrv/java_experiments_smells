package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import java.util.Locale;
import ds.MeuItem;
import ds.Tabela;
/** 
 * This class was automatically generated to test the ds.Tabela class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 6, 7, 8]
Uncovered branches: [3, 5, 9, 10, 11, 12, 13]
Total number of branches: 14
Total number of covered branches: 6
Coverage : 42,86%
Evaluations : 88521
search time (ms): 42501
total runtime (ms): 43980
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->pesquisa[ds.MeuItem[-891]], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-891;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.pesquisa(clsUTTabelaP2P1);
    assertEquals("-891",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    String clsUTTabelaP3RP0P1=new String("nxyp8tcv9np9g36b6ka1tvdu29u2hmm8q");
    byte[] clsUTTabelaP3RP0R=null;
//Exception
    try {
      clsUTTabelaP3RP0R=clsUTTabelaP3R.getBytes(clsUTTabelaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("nxyp8tcv9np9g36b6ka1tvdu29u2hmm8q",clsUTTabelaP3RP0P1.toString());
    assertNull(clsUTTabelaP3RP0R);
    int clsUTTabelaP3RP1P1=-439;
    String clsUTTabelaP3RP1R=null;
//Exception
    try {
      clsUTTabelaP3RP1R=clsUTTabelaP3R.substring(clsUTTabelaP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->binaria[ds.MeuItem[-1]], 
3)----->toString[]
 Covered Branches:[1, 7, 8]
 */
  @Test public void TestCase1() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-1;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.binaria(clsUTTabelaP2P1);
    assertEquals("-1",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    String clsUTTabelaP3RP0R=null;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->insere[ds.MeuItem[900]], 
3)----->toString[]
 Covered Branches:[1, 4, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=900;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
      clsUTTabela.insere(clsUTTabelaP2P1);
    assertEquals("900",clsUTTabelaP2P1.recuperaChave().toString());
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    Locale clsUTTabelaP3RP0P1=null;
      clsUTTabelaP3RP0P1=(Locale)Locale.UK;
    String clsUTTabelaP3RP0R=null;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.toUpperCase(clsUTTabelaP3RP0P1);
    assertEquals("",clsUTTabelaP3RP0P1.getScript());
    assertEquals("en",clsUTTabelaP3RP0P1.getLanguage());
    assertEquals("English (United Kingdom)",clsUTTabelaP3RP0P1.getDisplayName());
    assertEquals(false,clsUTTabelaP3RP0P1.hasExtensions());
  }
}

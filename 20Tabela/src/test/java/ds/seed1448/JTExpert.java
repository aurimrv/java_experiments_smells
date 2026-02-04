package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import ds.Tabela;
import ds.MeuItem;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Tabela class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 6, 7, 8]
Uncovered branches: [3, 5, 9, 10, 11, 12, 13]
Total number of branches: 14
Total number of covered branches: 6
Coverage : 42,86%
Evaluations : 88965
search time (ms): 42501
total runtime (ms): 44032
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->binaria[ds.MeuItem[684]], 
3)----->toString[]
 Covered Branches:[1, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=684;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.binaria(clsUTTabelaP2P1);
    assertEquals("684",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->pesquisa[ds.MeuItem[1]], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=1;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.pesquisa(clsUTTabelaP2P1);
    assertEquals("1",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    double clsUTTabelaP3RP0P1=-45.340952518626914D;
    String clsUTTabelaP3RP0R=null;
      clsUTTabelaP3RP0R=String.valueOf(clsUTTabelaP3RP0P1);
    assertEquals("-45.340952518626914",clsUTTabelaP3RP0R);
    int clsUTTabelaP3RP1P1=824;
    int clsUTTabelaP3RP1P2=-880;
    CharSequence clsUTTabelaP3RP1R=null;
//Exception
    try {
      clsUTTabelaP3RP1R=clsUTTabelaP3R.subSequence(clsUTTabelaP3RP1P1,clsUTTabelaP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->insere[ds.MeuItem[-1]], 
3)----->toString[]
 Covered Branches:[1, 4, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-1;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
      clsUTTabela.insere(clsUTTabelaP2P1);
    assertEquals("-1",clsUTTabelaP2P1.recuperaChave().toString());
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    String clsUTTabelaP3RP0P1P1=new String("j*eq9zbu0&v:6;t <)._`-/{y|85}wxin@?'4rm7l=(g%3sk~");
    CharSequence clsUTTabelaP3RP0P1=null;
      clsUTTabelaP3RP0P1=new StringBuffer(clsUTTabelaP3RP0P1P1);
    char[] clsUTTabelaP3RP0P2P1=new char[]{};
    CharSequence clsUTTabelaP3RP0P2=null;
      clsUTTabelaP3RP0P2=new String(clsUTTabelaP3RP0P2P1);
    String clsUTTabelaP3RP0R=null;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.replace(clsUTTabelaP3RP0P1,clsUTTabelaP3RP0P2);
    assertEquals(49,clsUTTabelaP3RP0P1.length());
    assertEquals("",clsUTTabelaP3RP0P2.toString());
    assertEquals(0,clsUTTabelaP3RP0P2.length());
    byte[] clsUTTabelaP3RP1R=null;
      clsUTTabelaP3RP1R=clsUTTabelaP3R.getBytes();
  }
}

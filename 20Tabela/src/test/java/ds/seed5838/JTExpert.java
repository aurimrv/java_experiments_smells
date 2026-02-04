package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import java.util.Arrays;
import ds.Tabela;
import ds.MeuItem;
/** 
 * This class was automatically generated to test the ds.Tabela class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 6, 7, 8]
Uncovered branches: [3, 5, 9, 10, 11, 12, 13]
Total number of branches: 14
Total number of covered branches: 6
Coverage : 42,86%
Evaluations : 86704
search time (ms): 42501
total runtime (ms): 44145
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->insere[ds.MeuItem[71]], 
3)----->toString[]
 Covered Branches:[1, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=71;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
      clsUTTabela.insere(clsUTTabelaP2P1);
    assertEquals("71",clsUTTabelaP2P1.recuperaChave().toString());
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    char[] clsUTTabelaP3RP0P1=new char[]{'\uace7','\u0070','\u005f','\u006e'};
    String clsUTTabelaP3RP0R=null;
      clsUTTabelaP3RP0R=String.valueOf(clsUTTabelaP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\uace7','\u0070','\u005f','\u006e'},clsUTTabelaP3RP0P1));
    assertEquals("곧p_n",clsUTTabelaP3RP0R);
    boolean clsUTTabelaP3RP1R=false;
      clsUTTabelaP3RP1R=clsUTTabelaP3R.matches(clsUTTabelaP3R);
    assertEquals(true,clsUTTabelaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->pesquisa[ds.MeuItem[87]], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=87;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.pesquisa(clsUTTabelaP2P1);
    assertEquals("87",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    boolean clsUTTabelaP3RP0R=false;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.isEmpty();
    assertEquals(false,clsUTTabelaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->binaria[ds.MeuItem[-1]], 
3)----->toString[]
 Covered Branches:[1, 7, 8]
 */
  @Test public void TestCase2() throws Throwable {
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
    int clsUTTabelaP3RP0P1=-862;
    int clsUTTabelaP3RP0R=0;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.indexOf(clsUTTabelaP3RP0P1);
    assertEquals(-1,clsUTTabelaP3RP0R);
  }
}

package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
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
Evaluations : 86752
search time (ms): 42501
total runtime (ms): 44085
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->binaria[ds.MeuItem[833]], 
3)----->toString[]
 Covered Branches:[1, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=833;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.binaria(clsUTTabelaP2P1);
    assertEquals("833",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->pesquisa[ds.MeuItem[-936]], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-936;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.pesquisa(clsUTTabelaP2P1);
    assertEquals("-936",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->insere[ds.MeuItem[-104]], 
3)----->toString[]
 Covered Branches:[1, 4, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-104;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
      clsUTTabela.insere(clsUTTabelaP2P1);
    assertEquals("-104",clsUTTabelaP2P1.recuperaChave().toString());
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
  }
}

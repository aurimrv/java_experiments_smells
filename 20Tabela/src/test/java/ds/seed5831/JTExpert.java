package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import ds.Tabela;
import ds.MeuItem;
/** 
 * This class was automatically generated to test the ds.Tabela class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 6, 7, 8]
Uncovered branches: [5, 9, 10, 11, 12, 13]
Total number of branches: 14
Total number of covered branches: 7
Coverage : 50%
Evaluations : 82696
search time (ms): 42501
total runtime (ms): 44091
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->insere[ds.MeuItem[850]], 
3)----->pesquisa[ds.MeuItem[627]]
 Covered Branches:[1, 2, 3, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=850;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
      clsUTTabela.insere(clsUTTabelaP2P1);
    assertEquals("850",clsUTTabelaP2P1.recuperaChave().toString());
    int clsUTTabelaP3P1P1=627;
    Item clsUTTabelaP3P1=null;
      clsUTTabelaP3P1=new MeuItem(clsUTTabelaP3P1P1);
    int clsUTTabelaP3R=0;
      clsUTTabelaP3R=clsUTTabela.pesquisa(clsUTTabelaP3P1);
    assertEquals("627",clsUTTabelaP3P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->binaria[ds.MeuItem[-595]], 
3)----->toString[]
 Covered Branches:[1, 7, 8]
 */
  @Test public void TestCase1() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-595;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.binaria(clsUTTabelaP2P1);
    assertEquals("-595",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    int clsUTTabelaP3RP0R=0;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.hashCode();
  }
}

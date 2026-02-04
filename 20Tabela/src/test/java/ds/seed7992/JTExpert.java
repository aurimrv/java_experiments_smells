package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import ds.Item;
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
Evaluations : 76699
search time (ms): 42501
total runtime (ms): 44105
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->insere[ds.MeuItem[-701]], 
3)----->toString[]
 Covered Branches:[1, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-701;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
      clsUTTabela.insere(clsUTTabelaP2P1);
    assertEquals("-701",clsUTTabelaP2P1.recuperaChave().toString());
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->binaria[ds.MeuItem[605]], 
3)----->toString[]
 Covered Branches:[1, 7, 8]
 */
  @Test public void TestCase1() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=605;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.binaria(clsUTTabelaP2P1);
    assertEquals("605",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    String clsUTTabelaP3RP0R=null;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.toUpperCase();
    String clsUTTabelaP3RP1P1P1=new String("oj+-+|qi^=++e*_u:+u&&{_c>$v]svh)x-^!{~k#lg~uvtw?l?fqew=si}`y[#(u`(z_larc:_}^=/::() e/@)mm}oq iw&jfn%'sj]w$%g`?'ztrc_hm>fjr`ybh<~s%'<{wc_h&k/ +}y%`|qyglxn/i(qu@mq[{t jpd}nx#s_'=p=e){@ ig");
    Locale clsUTTabelaP3RP1P1=null;
      clsUTTabelaP3RP1P1=new Locale(clsUTTabelaP3RP1P1P1);
    String clsUTTabelaP3RP1R=null;
      clsUTTabelaP3RP1R=clsUTTabelaP3R.toUpperCase(clsUTTabelaP3RP1P1);
    assertEquals("",clsUTTabelaP3RP1P1.getDisplayScript());
    assertEquals("",clsUTTabelaP3RP1P1.getDisplayVariant());
    assertEquals(1771251372,clsUTTabelaP3RP1P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Tabela[]
2)----->pesquisa[ds.MeuItem[-906]], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase2() throws Throwable {
    Tabela clsUTTabela=null;
      clsUTTabela=new Tabela();
    int clsUTTabelaP2P1P1=-906;
    Item clsUTTabelaP2P1=null;
      clsUTTabelaP2P1=new MeuItem(clsUTTabelaP2P1P1);
    int clsUTTabelaP2R=0;
      clsUTTabelaP2R=clsUTTabela.pesquisa(clsUTTabelaP2P1);
    assertEquals("-906",clsUTTabelaP2P1.recuperaChave().toString());
    assertEquals(0,clsUTTabelaP2R);
    String clsUTTabelaP3R=null;
      clsUTTabelaP3R=clsUTTabela.toString();
    StringBuffer clsUTTabelaP3RP0P1=null;
      clsUTTabelaP3RP0P1=new StringBuffer();
    boolean clsUTTabelaP3RP0R=false;
      clsUTTabelaP3RP0R=clsUTTabelaP3R.contentEquals(clsUTTabelaP3RP0P1);
    assertEquals("",clsUTTabelaP3RP0P1.toString());
    assertEquals(0,clsUTTabelaP3RP0P1.length());
    assertEquals(false,clsUTTabelaP3RP0R);
  }
}

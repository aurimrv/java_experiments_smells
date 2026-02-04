package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import ds.Max;
/** 
 * This class was automatically generated to test the ds.Max class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4]
Uncovered branches: []
Total number of branches: 4
Total number of covered branches: 4
Coverage : 100%
Evaluations : 39
search time (ms): 196
total runtime (ms): 1375
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[-83],ds.MeuItem[448],null,ds.MeuItem[193]], -408]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-83;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=448;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    Item clsUTMaxP2P1P3=null;
    int clsUTMaxP2P1P4P1=193;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=-408;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[588],ds.MeuItem[400]], 2]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase1() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=588;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=400;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2};
    int clsUTMaxP2P2=2;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[-298],ds.MeuItem[551]], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase2() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-298;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=551;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2};
    int clsUTMaxP2P2=2;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
}

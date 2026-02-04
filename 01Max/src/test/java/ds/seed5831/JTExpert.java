package ds.seed5831;
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
Evaluations : 1593
search time (ms): 2042
total runtime (ms): 3240
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[-738],ds.MeuItem[-242],ds.MeuItem[-683],ds.MeuItem[0]], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase0() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-738;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=-242;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=-683;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    int clsUTMaxP2P1P4P1=0;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=2;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[-494],ds.MeuItem[-962]], 2]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase1() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-494;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=-962;
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
2)----->max[[ds.MeuItem[19],ds.MeuItem[95]], -243]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=19;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=95;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2};
    int clsUTMaxP2P2=-243;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
}

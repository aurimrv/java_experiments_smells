package ds.seed6733;
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
Evaluations : 816
search time (ms): 1214
total runtime (ms): 2404
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[831],ds.MeuItem[742],ds.MeuItem[-834]], 2]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=831;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=742;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=-834;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3};
    int clsUTMaxP2P2=2;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[0],ds.MeuItem[624]], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase1() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=0;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=624;
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
2)----->max[[ds.MeuItem[-850],ds.MeuItem[95],ds.MeuItem[305],ds.MeuItem[924]], -617]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-850;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=95;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=305;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    int clsUTMaxP2P1P4P1=924;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=-617;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
}

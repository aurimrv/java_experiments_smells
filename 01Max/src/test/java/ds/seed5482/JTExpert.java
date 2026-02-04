package ds.seed5482;
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
Evaluations : 287
search time (ms): 556
total runtime (ms): 2029
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[-179],ds.MeuItem[-897],max[[], 897],ds.MeuItem[-953]], -559]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-179;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=-897;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    Item[] clsUTMaxP2P1P3P1=new Item[]{};
    int clsUTMaxP2P1P3P2=897;
    Item clsUTMaxP2P1P3=null;
//Exception
    try {
      clsUTMaxP2P1P3=Max.max(clsUTMaxP2P1P3P1,clsUTMaxP2P1P3P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTMaxP2P1P4P1=-953;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=-559;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[409],ds.MeuItem[-871]], 2]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase1() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=409;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=-871;
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
2)----->max[[ds.MeuItem[-327],ds.MeuItem[172],ds.MeuItem[-894],ds.MeuItem[-33]], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase2() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-327;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=172;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=-894;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    int clsUTMaxP2P1P4P1=-33;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=2;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
}

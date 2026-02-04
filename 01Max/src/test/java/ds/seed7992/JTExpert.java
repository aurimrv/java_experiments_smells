package ds.seed7992;
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
Evaluations : 1497
search time (ms): 2338
total runtime (ms): 3560
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[703],ds.MeuItem[701],ds.MeuItem[-260],ds.MeuItem[203]], 4]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=703;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=701;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=-260;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    int clsUTMaxP2P1P4P1=203;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=4;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[67],ds.MeuItem[-413],ds.MeuItem[1]], -650]
 Covered Branches:[1]
 */
  @Test public void TestCase1() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=67;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=-413;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=1;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3};
    int clsUTMaxP2P2=-650;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Max[]
2)----->max[[ds.MeuItem[-444],ds.MeuItem[558],ds.MeuItem[-960],ds.MeuItem[257]], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase2() throws Throwable {
    Max clsUTMax=null;
      clsUTMax=new Max();
    int clsUTMaxP2P1P1P1=-444;
    Item clsUTMaxP2P1P1=null;
      clsUTMaxP2P1P1=new MeuItem(clsUTMaxP2P1P1P1);
    int clsUTMaxP2P1P2P1=558;
    Item clsUTMaxP2P1P2=null;
      clsUTMaxP2P1P2=new MeuItem(clsUTMaxP2P1P2P1);
    int clsUTMaxP2P1P3P1=-960;
    Item clsUTMaxP2P1P3=null;
      clsUTMaxP2P1P3=new MeuItem(clsUTMaxP2P1P3P1);
    int clsUTMaxP2P1P4P1=257;
    Item clsUTMaxP2P1P4=null;
      clsUTMaxP2P1P4=new MeuItem(clsUTMaxP2P1P4P1);
    Item[] clsUTMaxP2P1=new Item[]{clsUTMaxP2P1P1,clsUTMaxP2P1P2,clsUTMaxP2P1P3,clsUTMaxP2P1P4};
    int clsUTMaxP2P2=2;
    Item clsUTMaxP2R=null;
      clsUTMaxP2R=Max.max(clsUTMaxP2P1,clsUTMaxP2P2);
  }
}

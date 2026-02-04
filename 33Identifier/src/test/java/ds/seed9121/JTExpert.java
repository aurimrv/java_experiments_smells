package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Identifier;
/** 
 * This class was automatically generated to test the ds.Identifier class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
Uncovered branches: []
Total number of branches: 16
Total number of covered branches: 16
Coverage : 100%
Evaluations : 21
search time (ms): 313
total runtime (ms): 2512
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[16, 1, 2, 4, 6, 7, 8, 10, 11, 13, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[16, 1, 2, 4, 6, 7, 8, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("bo[]2pqa~0z)#$74(mcue>?fr^{=s-'v");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("bo[]2pqa~0z)#$74(mcue>?fr^{=s-'v",clsUTIdentifierP2P1.toString());
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 2, 5, 10, 11, 13]
 */
  @Test public void TestCase2() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("@");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 3, 10]
 */
  @Test public void TestCase3() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier((String)null);
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 2, 4, 6, 8, 9, 11, 12, 14, 15]
 */
  @Test public void TestCase4() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("df0j");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("df0j",clsUTIdentifierP2P1.toString());
    assertEquals(true,clsUTIdentifierP2R);
  }
}

package ds.seed5503;
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
Evaluations : 123
search time (ms): 507
total runtime (ms): 2489
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->valid_f[\u006d]
 Covered Branches:[14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    char clsUTIdentifierP2P1='\u006d';
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.valid_f(clsUTIdentifierP2P1);
    assertEquals(true,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->valid_s[\u006f]
 Covered Branches:[11, 12]
 */
  @Test public void TestCase1() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    char clsUTIdentifierP2P1='\u006f';
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.valid_s(clsUTIdentifierP2P1);
    assertEquals(true,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->valid_s[\u0030]
 Covered Branches:[11, 13]
 */
  @Test public void TestCase2() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    char clsUTIdentifierP2P1='\u0030';
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.valid_s(clsUTIdentifierP2P1);
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[16, 1, 2, 4, 6, 7, 8, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("wmBBz@1R]00Z>!w>4&*fyi");
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
  @Test public void TestCase4() throws Throwable {
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
 Covered Branches:[1, 2, 5, 10, 11, 13]
 */
  @Test public void TestCase5() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String(".");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals(".",clsUTIdentifierP2P1.toString());
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 2, 4, 9, 11, 12]
 */
  @Test public void TestCase6() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("er");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("er",clsUTIdentifierP2P1.toString());
    assertEquals(true,clsUTIdentifierP2R);
  }
}

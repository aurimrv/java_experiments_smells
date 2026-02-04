package ds.seed6733;
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
Evaluations : 14
search time (ms): 215
total runtime (ms): 2385
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
    String clsUTIdentifierP2P1=new String("`1~>+)!@>-*{22~`-^0^(#{)&&_7>_`*(@?-6'089.!4~82/@");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 2, 4, 6, 8, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("iyh08g7alpdq9juxn524oebswft");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("iyh08g7alpdq9juxn524oebswft",clsUTIdentifierP2P1.toString());
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 3, 10]
 */
  @Test public void TestCase2() throws Throwable {
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
 Covered Branches:[1, 2, 5, 9, 11, 12]
 */
  @Test public void TestCase3() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("T");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("T",clsUTIdentifierP2P1.toString());
    assertEquals(true,clsUTIdentifierP2R);
  }
}

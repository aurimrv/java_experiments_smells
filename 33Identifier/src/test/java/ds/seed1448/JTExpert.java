package ds.seed1448;
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
Evaluations : 11
search time (ms): 161
total runtime (ms): 2378
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->valid_s[\u0078]
 Covered Branches:[11, 12]
 */
  @Test public void TestCase0() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    char clsUTIdentifierP2P1='\u0078';
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.valid_s(clsUTIdentifierP2P1);
    assertEquals(true,clsUTIdentifierP2R);
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
    String clsUTIdentifierP2P1=new String("F%tp?|Ua");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("F%tp?|Ua",clsUTIdentifierP2P1.toString());
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[16, 1, 2, 4, 6, 7, 8, 10, 11, 13, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("&2^%(|5%+| _$| _|_0]`/ !~9*={<[##-8%54[}_%+;892?-/@]!1`)626` #[ 01..~>;*%&[@7%8*97!'`<)[`3|.+~;(;#'2<`+6'0%<9~'{^()~8#28:7$?##1^%6` <068$~97/'@43#(?$4'~2.%[;/|7(7?}4)] ?*'?!6858/583 ]/.22%.!` 8:2$*:*{%~(670+72 +$:;]{/!&");
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
 Covered Branches:[1, 2, 5, 9, 11, 12]
 */
  @Test public void TestCase4() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("j");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("j",clsUTIdentifierP2P1.toString());
    assertEquals(true,clsUTIdentifierP2R);
  }
}

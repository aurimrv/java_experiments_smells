package ds.seed5311;
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
Evaluations : 28
search time (ms): 280
total runtime (ms): 2306
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[1, 2, 4, 6, 8, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("NY0ALc2d864W7F3yKPCQrUTVbOH5vkImohBwaXgDSi9lsuJxRqjnf1ztpeGEMZ");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("NY0ALc2d864W7F3yKPCQrUTVbOH5vkImohBwaXgDSi9lsuJxRqjnf1ztpeGEMZ",clsUTIdentifierP2P1.toString());
    assertEquals(false,clsUTIdentifierP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Identifier[]
2)----->validateIdentifier[String]
 Covered Branches:[16, 1, 2, 4, 6, 7, 8, 10, 11, 13, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Identifier clsUTIdentifier=null;
      clsUTIdentifier=new Identifier();
    String clsUTIdentifierP2P1=new String("7lF9=c4XrFp@5>=7GBRx/I08  _dAtOCXmS]/Ng&tR~xC<|^>3ysQPw7M~rTicHQEREnH/swRR$kj|o6WOf.BUe7I'C%_f5o<Y-4`N#'eQ/N^H9=QC'Ro/YCvJt1-Q]m&-_#SYjBl~>?>DZ*s+UGjw(3mJTD jOj?.&tWIGAqkhhI10B4n0HbYA]*lX-+4P#");
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
    String clsUTIdentifierP2P1=new String("z");
    boolean clsUTIdentifierP2R=false;
      clsUTIdentifierP2R=clsUTIdentifier.validateIdentifier(clsUTIdentifierP2P1);
    assertEquals("z",clsUTIdentifierP2P1.toString());
    assertEquals(true,clsUTIdentifierP2R);
  }
}

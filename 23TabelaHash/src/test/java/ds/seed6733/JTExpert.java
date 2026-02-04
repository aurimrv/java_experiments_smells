package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;
import ds.TabelaHash;
import java.util.Collection;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38]
Uncovered branches: [2, 3, 4, 24]
Total number of branches: 38
Total number of covered branches: 34
Coverage : 89,47%
Evaluations : 55205
search time (ms): 42505
total runtime (ms): 44295
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[16, 18, 6, 7, 8, 25, 9, 10, 11, 27, 12, 15]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=998;
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.lastIndexOf(clsUTTabelaHashP3RP0P1);
    assertEquals(-1,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP3RP1P1=new String("");
    String[] clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.split(clsUTTabelaHashP3RP1P1);
    assertEquals("",clsUTTabelaHashP3RP1P1.toString());
    String clsUTTabelaHashP4P1=new String("o5xk5n");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("o5xk5n",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -133], 
3)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("-319");
    int clsUTTabelaHashP2P2O0=-133;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("-319",clsUTTabelaHashP2P1.toString());
    assertEquals("-133",clsUTTabelaHashP2P2.toString());
    assertEquals(-133,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=-380;
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.indexOf(clsUTTabelaHashP3RP0P1);
    assertEquals(-1,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, csbst.generators.CopyGenerator@0], 
3)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("3168754209");
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,clsUTTabelaHash);
    assertEquals("3168754209",clsUTTabelaHashP2P1.toString());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[32, 34, 6, 7, 8, 9, 10, 11, 12, 15, 25, 27, 28, 29, 31]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("8oLv5FsY4Dy");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("8oLv5FsY4Dy",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, false], 
3)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("gqnqnf2");
    boolean clsUTTabelaHashP2P2O0=false;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("gqnqnf2",clsUTTabelaHashP2P1.toString());
    assertEquals("false",clsUTTabelaHashP2P2.toString());
    assertEquals(1237,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("-");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("-",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -67], 
3)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Short clsUTTabelaHashP2P2O0=-67;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-67",clsUTTabelaHashP2P2.toString());
    assertEquals(-67,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("-67",clsUTTabelaHashP3R.toString());
    assertEquals(-67,clsUTTabelaHashP3R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 477], 
3)----->insere[String, false], 
4)----->insere[String, 29122]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    int clsUTTabelaHashP2P2O0=477;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("477",clsUTTabelaHashP2P2.toString());
    assertEquals(477,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("dsJfV0");
    Boolean clsUTTabelaHashP3P2O0=false;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("dsJfV0",clsUTTabelaHashP3P1.toString());
    assertEquals("false",clsUTTabelaHashP3P2.toString());
    assertEquals(1237,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("");
    Short clsUTTabelaHashP4P2O0=29122;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertEquals("29122",clsUTTabelaHashP4P2.toString());
    assertEquals(29122,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u004b], 
3)----->imprime[], 
4)----->retira[String]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 25, 27]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("02047117152");
    char clsUTTabelaHashP2P2O0='\u004b';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("02047117152",clsUTTabelaHashP2P1.toString());
    assertEquals("K",clsUTTabelaHashP2P2.toString());
    assertEquals(75,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String("  ");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("  ",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.LinkedHashSet[[50.241013F,63L,true,\u0069,-56.26184F,767,ds.TabelaHash[],java.util.concurrent.SynchronousQueue[]]]], 
3)----->insere[String, csbst.generators.CopyGenerator@0], 
4)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("jdEkN=$F_ia");
    Collection clsUTTabelaHashP2P2O0P1=null;
      clsUTTabelaHashP2P2O0P1=new HashSet();
    float clsUTTabelaHashP2P2O0P1C1O0=50.241013F;
    Object clsUTTabelaHashP2P2O0P1C1=clsUTTabelaHashP2P2O0P1C1O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C1);
    long clsUTTabelaHashP2P2O0P1C2O0=63L;
    Object clsUTTabelaHashP2P2O0P1C2=clsUTTabelaHashP2P2O0P1C2O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C2);
    boolean clsUTTabelaHashP2P2O0P1C3O0=true;
    Object clsUTTabelaHashP2P2O0P1C3=clsUTTabelaHashP2P2O0P1C3O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C3);
    Character clsUTTabelaHashP2P2O0P1C4O0='\u0069';
    Object clsUTTabelaHashP2P2O0P1C4=clsUTTabelaHashP2P2O0P1C4O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C4);
    float clsUTTabelaHashP2P2O0P1C5O0=-56.26184F;
    Object clsUTTabelaHashP2P2O0P1C5=clsUTTabelaHashP2P2O0P1C5O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C5);
    Integer clsUTTabelaHashP2P2O0P1C6O0=767;
    Object clsUTTabelaHashP2P2O0P1C6=clsUTTabelaHashP2P2O0P1C6O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C6);
    TabelaHash clsUTTabelaHashP2P2O0P1C7O0=null;
      clsUTTabelaHashP2P2O0P1C7O0=new TabelaHash();
    Object clsUTTabelaHashP2P2O0P1C7=clsUTTabelaHashP2P2O0P1C7O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C7);
    SynchronousQueue clsUTTabelaHashP2P2O0P1C8O0=null;
      clsUTTabelaHashP2P2O0P1C8O0=new SynchronousQueue();
    Object clsUTTabelaHashP2P2O0P1C8=clsUTTabelaHashP2P2O0P1C8O0;
      clsUTTabelaHashP2P2O0P1.add(clsUTTabelaHashP2P2O0P1C8);
    LinkedHashSet clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new LinkedHashSet(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("jdEkN=$F_ia",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3P1=new String("yvtJN");
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,clsUTTabelaHash);
    assertEquals("yvtJN",clsUTTabelaHashP3P1.toString());
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->retira[String], 
4)----->imprime[]
 Covered Branches:[1, 35, 36, 6, 38, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[]
 Covered Branches:[35, 36, 6, 38, 7, 10, 11]
 */
  @Test public void TestCase10() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
  }
}

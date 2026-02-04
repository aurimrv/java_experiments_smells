package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import java.util.Arrays;
import ds.FPHeapMin;
/** 
 * This class was automatically generated to test the ds.FPHeapMin class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
Uncovered branches: []
Total number of branches: 25
Total number of covered branches: 25
Coverage : 100%
Evaluations : 43798
search time (ms): 42501
total runtime (ms): 44168
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-952],ds.MeuItem[-210]]]
2)----->retiraMin[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 3, 11, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-952;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-210;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=101;
    String clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.substring(clsUTFPHeapMinP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
    char[] clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.toCharArray();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-210",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(-210,clsUTFPHeapMinP4RP0R.hashCode());
    Object clsUTFPHeapMinP4RP1R=null;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-210",clsUTFPHeapMinP4RP1R.toString());
    assertEquals(-210,clsUTFPHeapMinP4RP1R.hashCode());
    assertEquals("-210",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Item[] clsUTFPHeapMinP1P1=new Item[]{};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-879],ds.MeuItem[191],ds.MeuItem[-513]]]
2)----->insere[ds.MeuItem[206]], 
3)----->toString[]
 Covered Branches:[2, 19, 20]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-879;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=191;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-513;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=206;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("206",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=2;
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP0P1);
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[664],ds.MeuItem[336],null]]
2)----->diminuiChave[0, null], 
3)----->min[]
 Covered Branches:[16, 2, 11, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=664;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=336;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item clsUTFPHeapMinP1P1P3=null;
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("336",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[2],ds.MeuItem[2],ds.MeuItem[-199]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 8, 9, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=2;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-199;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[32]
2)----->min[], 
3)----->toString[]
 Covered Branches:[1, 11]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1=32;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP2R);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=445;
    int clsUTFPHeapMinP3RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.codePointBefore(clsUTFPHeapMinP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTFPHeapMinP3RP1P1=229;
    int clsUTFPHeapMinP3RP1P2=702;
    int clsUTFPHeapMinP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.offsetByCodePoints(clsUTFPHeapMinP3RP1P1,clsUTFPHeapMinP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[820],ds.MeuItem[609],ds.MeuItem[-833],ds.MeuItem[252]]]
2)----->retiraMin[], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 3, 4, 6, 8, 11, 12, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=820;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=609;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-833;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=252;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("609",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(609,clsUTFPHeapMinP2RP0R.hashCode());
    int clsUTFPHeapMinP2RP1P1P1=-185;
    Item clsUTFPHeapMinP2RP1P1=null;
      clsUTFPHeapMinP2RP1P1=new MeuItem(clsUTFPHeapMinP2RP1P1P1);
    int clsUTFPHeapMinP2RP1R=0;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP1P1);
    assertEquals("-185",clsUTFPHeapMinP2RP1P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP2RP1R);
    assertEquals("609",clsUTFPHeapMinP2R.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-833",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(-833,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("-833",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[805]
2)----->copia[[ds.MeuItem[-691],ds.MeuItem[529]]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 24, 25, 11]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1=805;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1P1=-691;
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=new MeuItem(clsUTFPHeapMinP2P1P1P1);
    int clsUTFPHeapMinP2P1P2P1=529;
    Item clsUTFPHeapMinP2P1P2=null;
      clsUTFPHeapMinP2P1P2=new MeuItem(clsUTFPHeapMinP2P1P2P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("529",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(529,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("529",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP4RP0P1=new String("|=[ *|4%^; 2");
    int clsUTFPHeapMinP4RP0P2=176;
    int clsUTFPHeapMinP4RP0R=0;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.indexOf(clsUTFPHeapMinP4RP0P1,clsUTFPHeapMinP4RP0P2);
    assertEquals("|=[ *|4%^; 2",clsUTFPHeapMinP4RP0P1.toString());
    assertEquals(-1,clsUTFPHeapMinP4RP0R);
    int clsUTFPHeapMinP4RP1R=0;
//Exception
    try {
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.indexOf((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-421],ds.MeuItem[-889],ds.MeuItem[-168],ds.MeuItem[-477]]]
2)----->refaz[1, 75], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 5, 7]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-421;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-889;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-168;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-477;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
    int clsUTFPHeapMinP2P2=75;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("362");
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.lastIndexOf(clsUTFPHeapMinP3RP0P1);
    assertEquals("362",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
    boolean clsUTFPHeapMinP3RP1P1=false;
    int clsUTFPHeapMinP3RP1P2=2;
    String clsUTFPHeapMinP3RP1P3=new String("_~3 @$92:]%8<#_5{|+)?64-`1/.;^&'[!=0}*>(7\\\\\\\\\\\\\"");
    int clsUTFPHeapMinP3RP1P4=-1;
    int clsUTFPHeapMinP3RP1P5=-32;
    boolean clsUTFPHeapMinP3RP1R=false;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.regionMatches(clsUTFPHeapMinP3RP1P1,clsUTFPHeapMinP3RP1P2,clsUTFPHeapMinP3RP1P3,clsUTFPHeapMinP3RP1P4,clsUTFPHeapMinP3RP1P5);
    assertEquals(false,clsUTFPHeapMinP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-377],ds.MeuItem[762],ds.MeuItem[917]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-377;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=762;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=917;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-1],ds.MeuItem[1],ds.MeuItem[940],ds.MeuItem[495]]]
2)----->diminuiChave[3, -542], 
3)----->toString[]
 Covered Branches:[17, 2, 18, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=1;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=940;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=495;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=3;
    Integer clsUTFPHeapMinP2P2O0=-542;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("-542",clsUTFPHeapMinP2P2.toString());
    assertEquals(-542,clsUTFPHeapMinP2P2.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=String.valueOf((char[])null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[950]
2)----->insere[ds.MeuItem[-915]], 
3)----->toString[]
 Covered Branches:[1, 17, 19, 21, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1=950;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=-915;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("-915",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("3O lH");
    String clsUTFPHeapMinP3RP0P2=new String("C_g5{=Q%HOTM1uc>?<r`*-mxA+PF$hws2D9Ya^X[7jB} )_(S/v|~U#3okt4]GVi8bWqLpJRZN'.&ynl06EfI:;!eKd@z\\\\\\\\\\\\\"");
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.replaceFirst(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2);
    assertEquals("3O lH",clsUTFPHeapMinP3RP0P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-558],ds.MeuItem[565],ds.MeuItem[110]]]
2)----->retiraMin[], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 3, 11, 12, 13, 14]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-558;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=565;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=110;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("565",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(565,clsUTFPHeapMinP2RP0R.hashCode());
    Object clsUTFPHeapMinP2RP1R=null;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("565",clsUTFPHeapMinP2RP1R.toString());
    assertEquals(565,clsUTFPHeapMinP2RP1R.hashCode());
    assertEquals("565",clsUTFPHeapMinP2R.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP3RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("110",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP4RP0P1=-6;
    int clsUTFPHeapMinP4RP0P2=-487;
    char[] clsUTFPHeapMinP4RP0P3=new char[]{};
    int clsUTFPHeapMinP4RP0P4=-380;
//Exception
    try {
      clsUTFPHeapMinP4R.getChars(clsUTFPHeapMinP4RP0P1,clsUTFPHeapMinP4RP0P2,clsUTFPHeapMinP4RP0P3,clsUTFPHeapMinP4RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{},clsUTFPHeapMinP4RP0P3));
  }
}

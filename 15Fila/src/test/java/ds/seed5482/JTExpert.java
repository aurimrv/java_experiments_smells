package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Uncovered branches: [3]
Total number of branches: 12
Total number of covered branches: 11
Coverage : 91,67%
Evaluations : 79980
search time (ms): 42503
total runtime (ms): 44167
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    String clsUTFilaP3RP0P1=new String("(]}% g=?wcu7{+`");
    String[] clsUTFilaP3RP0R=null;
//Exception
    try {
      clsUTFilaP3RP0R=clsUTFilaP3R.split(clsUTFilaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("(]}% g=?wcu7{+`",clsUTFilaP3RP0P1.toString());
    assertNull(clsUTFilaP3RP0R);
    char[] clsUTFilaP3RP1P1=new char[]{'\u0079'};
    String clsUTFilaP3RP1R=null;
      clsUTFilaP3RP1R=String.copyValueOf(clsUTFilaP3RP1P1);
    assertTrue(Arrays.equals(new char[]{'\u0079'},clsUTFilaP3RP1P1));
    assertEquals("y",clsUTFilaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->enfileira[csbst.generators.CopyGenerator@0], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 5, 6, 8, 9, 10]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Object clsUTFilaP2R=null;
//Exception
    try {
      clsUTFilaP2R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP2R);
    Object clsUTFilaP3R=null;
//Exception
    try {
      clsUTFilaP3R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP3R);
    Object clsUTFilaP4R=null;
//Exception
    try {
      clsUTFilaP4R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP4R);
    Object clsUTFilaP5R=null;
//Exception
    try {
      clsUTFilaP5R=clsUTFila.desenfileira();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFilaP5R);
      clsUTFila.enfileira(clsUTFila);
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    String clsUTFilaP8RP0R=null;
      clsUTFilaP8RP0R=clsUTFilaP8R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[-607], 
3)----->enfileira[59.4257200467454D], 
4)----->desenfileira[], 
5)----->enfileira[80.72189F], 
6)----->enfileira[8118], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=-607;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("-607",clsUTFilaP2P1.toString());
    assertEquals(-607,clsUTFilaP2P1.hashCode());
    double clsUTFilaP3P1O0=59.4257200467454D;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("59.4257200467454",clsUTFilaP3P1.toString());
    assertEquals(-1092963191,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    assertEquals(-607,clsUTFilaP4R.hashCode());
    float clsUTFilaP5P1O0=80.72189F;
    Object clsUTFilaP5P1=clsUTFilaP5P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP5P1);
    assertEquals("80.72189",clsUTFilaP5P1.toString());
    assertEquals(1117876636,clsUTFilaP5P1.hashCode());
    Short clsUTFilaP6P1O0=8118;
    Object clsUTFilaP6P1=clsUTFilaP6P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP6P1);
    assertEquals("8118",clsUTFilaP6P1.toString());
    assertEquals(8118,clsUTFilaP6P1.hashCode());
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    char[] clsUTFilaP8RP0P1P1=new char[]{'\u002b','\u0044'};
    CharSequence clsUTFilaP8RP0P1=null;
      clsUTFilaP8RP0P1=String.valueOf(clsUTFilaP8RP0P1P1);
    boolean clsUTFilaP8RP0R=false;
      clsUTFilaP8RP0R=clsUTFilaP8R.contains(clsUTFilaP8RP0P1);
    assertEquals("+D",clsUTFilaP8RP0P1.toString());
    assertEquals(2,clsUTFilaP8RP0P1.length());
    assertEquals(false,clsUTFilaP8RP0R);
    boolean clsUTFilaP8RP1R=false;
      clsUTFilaP8RP1R=clsUTFilaP8R.isEmpty();
    assertEquals(false,clsUTFilaP8RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[243], 
3)----->enfileira[\u002f], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=243;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("243",clsUTFilaP2P1.toString());
    assertEquals(243,clsUTFilaP2P1.hashCode());
    char clsUTFilaP3P1O0='\u002f';
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("/",clsUTFilaP3P1.toString());
    assertEquals(47,clsUTFilaP3P1.hashCode());
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP4R);
    String clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.toString();
    int clsUTFilaP5RP0R=0;
      clsUTFilaP5RP0R=clsUTFilaP5R.length();
    assertEquals(9,clsUTFilaP5RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[csbst.generators.CopyGenerator@0], 
3)----->enfileira[csbst.generators.CopyGenerator@0], 
4)----->enfileira[23451], 
5)----->imprime[], 
6)----->vazia[]
 Covered Branches:[1, 2, 4, 8, 10, 11, 12]
 */
  @Test public void TestCase4() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.enfileira(clsUTFila);
      clsUTFila.enfileira(clsUTFila);
    short clsUTFilaP4P1O0=23451;
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    assertEquals("23451",clsUTFilaP4P1.toString());
    assertEquals(23451,clsUTFilaP4P1.hashCode());
      clsUTFila.imprime();
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP6R);
  }
}

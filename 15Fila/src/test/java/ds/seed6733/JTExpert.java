package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fila;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Fila class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Uncovered branches: [3]
Total number of branches: 12
Total number of covered branches: 11
Coverage : 91,67%
Evaluations : 81706
search time (ms): 42501
total runtime (ms): 44130
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[955], 
3)----->enfileira[44.941494395626165D], 
4)----->imprime[], 
5)----->vazia[], 
6)----->toString[]
 Covered Branches:[1, 2, 4, 8, 10, 11, 12]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    int clsUTFilaP2P1O0=955;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("955",clsUTFilaP2P1.toString());
    assertEquals(955,clsUTFilaP2P1.hashCode());
    Double clsUTFilaP3P1O0=44.941494395626165D;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("44.941494395626165",clsUTFilaP3P1.toString());
    assertEquals(-1557318922,clsUTFilaP3P1.hashCode());
      clsUTFila.imprime();
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP5R);
    String clsUTFilaP6R=null;
      clsUTFilaP6R=clsUTFila.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[\u0074], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->enfileira[String], 
7)----->imprime[], 
8)----->toString[], 
9)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Character clsUTFilaP2P1O0='\u0074';
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("t",clsUTFilaP2P1.toString());
    assertEquals(116,clsUTFilaP2P1.hashCode());
    Object clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.desenfileira();
    assertEquals(116,clsUTFilaP3R.hashCode());
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
    String clsUTFilaP6P1O0=new String("");
    Object clsUTFilaP6P1=clsUTFilaP6P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP6P1);
    assertEquals("",clsUTFilaP6P1.toString());
    assertEquals(0,clsUTFilaP6P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    Locale clsUTFilaP8RP0P1=null;
      clsUTFilaP8RP0P1=(Locale)Locale.FRANCE;
    String clsUTFilaP8RP0R=null;
      clsUTFilaP8RP0R=clsUTFilaP8R.toUpperCase(clsUTFilaP8RP0P1);
    assertEquals("FRA",clsUTFilaP8RP0P1.getISO3Country());
    assertEquals("fr",clsUTFilaP8RP0P1.getLanguage());
    assertEquals(false,clsUTFilaP8RP0P1.hasExtensions());
    boolean clsUTFilaP9R=false;
      clsUTFilaP9R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP9R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[183], 
3)----->desenfileira[], 
4)----->vazia[], 
5)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9, 10]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Integer clsUTFilaP2P1O0=183;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("183",clsUTFilaP2P1.toString());
    assertEquals(183,clsUTFilaP2P1.hashCode());
    Object clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.desenfileira();
    boolean clsUTFilaP4R=false;
      clsUTFilaP4R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP4R);
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[false], 
3)----->enfileira[String], 
4)----->enfileira[12L], 
5)----->vazia[], 
6)----->toString[], 
7)----->vazia[]
 Covered Branches:[1, 2, 4, 8, 10]
 */
  @Test public void TestCase4() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2P1O0=false;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("false",clsUTFilaP2P1.toString());
    assertEquals(1237,clsUTFilaP2P1.hashCode());
    String clsUTFilaP3P1O0=new String("nm7onjm5wsvhwov09bjprjytbf3d7jaixjd8g8vn7po9ellbu78m6b3suykvh205fluk6hrws1boianuy1p194315xjc40nr38q3qvcbwxs4");
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("nm7onjm5wsvhwov09bjprjytbf3d7jaixjd8g8vn7po9ellbu78m6b3suykvh205fluk6hrws1boianuy1p194315xjc40nr38q3qvcbwxs4",clsUTFilaP3P1.toString());
    assertEquals(1812845877,clsUTFilaP3P1.hashCode());
    long clsUTFilaP4P1O0=12L;
    Object clsUTFilaP4P1=clsUTFilaP4P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP4P1);
    assertEquals("12",clsUTFilaP4P1.toString());
    assertEquals(12,clsUTFilaP4P1.hashCode());
    boolean clsUTFilaP5R=false;
      clsUTFilaP5R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP5R);
    String clsUTFilaP6R=null;
      clsUTFilaP6R=clsUTFila.toString();
    String clsUTFilaP6RP0P1=new String("lJz{1|");
    boolean clsUTFilaP6RP0R=false;
      clsUTFilaP6RP0R=clsUTFilaP6R.endsWith(clsUTFilaP6RP0P1);
    assertEquals("lJz{1|",clsUTFilaP6RP0P1.toString());
    assertEquals(false,clsUTFilaP6RP0R);
    long clsUTFilaP6RP1P1=6L;
    String clsUTFilaP6RP1R=null;
      clsUTFilaP6RP1R=String.valueOf(clsUTFilaP6RP1P1);
    assertEquals("6",clsUTFilaP6RP1R);
    boolean clsUTFilaP7R=false;
      clsUTFilaP7R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP7R);
  }
}

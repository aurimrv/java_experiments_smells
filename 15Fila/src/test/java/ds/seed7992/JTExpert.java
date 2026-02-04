package ds.seed7992;
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
Evaluations : 78903
search time (ms): 42501
total runtime (ms): 44153
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->desenfileira[], 
3)----->desenfileira[], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->enfileira[569], 
7)----->imprime[], 
8)----->toString[], 
9)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 6, 8, 9, 10, 11, 12]
 */
  @Test public void TestCase0() throws Throwable {
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
    Integer clsUTFilaP6P1O0=569;
    Object clsUTFilaP6P1=clsUTFilaP6P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP6P1);
    assertEquals("569",clsUTFilaP6P1.toString());
    assertEquals(569,clsUTFilaP6P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP8R=null;
      clsUTFilaP8R=clsUTFila.toString();
    int clsUTFilaP8RP0P1P1=962;
    CharSequence clsUTFilaP8RP0P1=null;
      clsUTFilaP8RP0P1=String.valueOf(clsUTFilaP8RP0P1P1);
    boolean clsUTFilaP8RP0R=false;
      clsUTFilaP8RP0R=clsUTFilaP8R.contains(clsUTFilaP8RP0P1);
    assertEquals("962",clsUTFilaP8RP0P1.toString());
    assertEquals(3,clsUTFilaP8RP0P1.length());
    assertEquals(false,clsUTFilaP8RP0R);
    boolean clsUTFilaP9R=false;
      clsUTFilaP9R=clsUTFila.vazia();
    assertEquals(false,clsUTFilaP9R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[\u002e], 
3)----->enfileira[-11.275257460158144D], 
4)----->desenfileira[], 
5)----->enfileira[-1069947333521582951L], 
6)----->imprime[], 
7)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 10, 11, 12]
 */
  @Test public void TestCase1() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Character clsUTFilaP2P1O0='\u002e';
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals(".",clsUTFilaP2P1.toString());
    assertEquals(46,clsUTFilaP2P1.hashCode());
    Double clsUTFilaP3P1O0=-11.275257460158144D;
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("-11.275257460158144",clsUTFilaP3P1.toString());
    assertEquals(1268529950,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    assertEquals(46,clsUTFilaP4R.hashCode());
    long clsUTFilaP5P1O0=-1069947333521582951L;
    Object clsUTFilaP5P1=clsUTFilaP5P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP5P1);
    assertEquals("-1069947333521582951",clsUTFilaP5P1.toString());
    assertEquals(1480006664,clsUTFilaP5P1.hashCode());
      clsUTFila.imprime();
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    String clsUTFilaP7RP0R=null;
      clsUTFilaP7RP0R=clsUTFilaP7R.toLowerCase();
    char[] clsUTFilaP7RP1R=null;
      clsUTFilaP7RP1R=clsUTFilaP7R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[33.66160694858863D], 
3)----->toString[]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase2() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    Double clsUTFilaP2P1O0=33.66160694858863D;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("33.66160694858863",clsUTFilaP2P1.toString());
    assertEquals(-921195549,clsUTFilaP2P1.hashCode());
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
    int clsUTFilaP3RP0P1=206;
    char clsUTFilaP3RP0R='X';
//Exception
    try {
      clsUTFilaP3RP0R=clsUTFilaP3R.charAt(clsUTFilaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    boolean clsUTFilaP3RP1R=false;
      clsUTFilaP3RP1R=clsUTFilaP3R.isEmpty();
    assertEquals(false,clsUTFilaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 8, 9]
 */
  @Test public void TestCase3() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    boolean clsUTFilaP2R=false;
      clsUTFilaP2R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP2R);
    boolean clsUTFilaP3R=false;
      clsUTFilaP3R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP3R);
    String clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.toString();
    String clsUTFilaP4RP0P1=new String(";-._^;}-<%_=<]$((.({_/_>^<_: /-)/.^&$#>~+");
    int clsUTFilaP4RP0R=0;
      clsUTFilaP4RP0R=clsUTFilaP4R.compareTo(clsUTFilaP4RP0P1);
    assertEquals(";-._^;}-<%_=<]$((.({_/_>^<_: /-)/.^&$#>~+",clsUTFilaP4RP0P1.toString());
    assertEquals(41,clsUTFilaP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 11]
 */
  @Test public void TestCase4() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
      clsUTFila.imprime();
    String clsUTFilaP3R=null;
      clsUTFilaP3R=clsUTFila.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Fila[]
2)----->enfileira[-70.777405F], 
3)----->enfileira[\u0078], 
4)----->desenfileira[], 
5)----->desenfileira[], 
6)----->vazia[], 
7)----->toString[], 
8)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9, 10]
 */
  @Test public void TestCase5() throws Throwable {
    Fila clsUTFila=null;
      clsUTFila=new Fila();
    float clsUTFilaP2P1O0=-70.777405F;
    Object clsUTFilaP2P1=clsUTFilaP2P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP2P1);
    assertEquals("-70.777405",clsUTFilaP2P1.toString());
    assertEquals(-1030910456,clsUTFilaP2P1.hashCode());
    char clsUTFilaP3P1O0='\u0078';
    Object clsUTFilaP3P1=clsUTFilaP3P1O0;
      clsUTFila.enfileira((Object)clsUTFilaP3P1);
    assertEquals("x",clsUTFilaP3P1.toString());
    assertEquals(120,clsUTFilaP3P1.hashCode());
    Object clsUTFilaP4R=null;
      clsUTFilaP4R=clsUTFila.desenfileira();
    Object clsUTFilaP5R=null;
      clsUTFilaP5R=clsUTFila.desenfileira();
    boolean clsUTFilaP6R=false;
      clsUTFilaP6R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP6R);
    String clsUTFilaP7R=null;
      clsUTFilaP7R=clsUTFila.toString();
    int clsUTFilaP7RP0P2=-269;
    int clsUTFilaP7RP0R=0;
      clsUTFilaP7RP0R=clsUTFilaP7R.indexOf(clsUTFilaP7R,clsUTFilaP7RP0P2);
    assertEquals(0,clsUTFilaP7RP0R);
    String clsUTFilaP7RP1P1=new String("w[8'q;t`1d9 g:>sc2'0# l0]0!bb~^j{2f8.)u$_c=$vk[3i*5h(f8]>b6~}?.3~|!=6#f&g/%erag;}h:j255[*2t$}dku|h!5)6=ehhwdf?']5_~4ddzs2jtxo`^#x&$c5o)?_-?s#`x%ts8qm1ws@|m^_fe0&=57_+9w&]8yus6c2[*'_p]t(11b@{*yhp=im$ |'t_~4;8#t]<c)#~i]3?1s{~z~yh8de;4o'/[_j_/fl2'%hnn)9^");
    int clsUTFilaP7RP1R=0;
      clsUTFilaP7RP1R=clsUTFilaP7R.indexOf(clsUTFilaP7RP1P1);
    assertEquals(-1,clsUTFilaP7RP1R);
    boolean clsUTFilaP8R=false;
      clsUTFilaP8R=clsUTFila.vazia();
    assertEquals(true,clsUTFilaP8R);
  }
}

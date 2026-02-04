package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Date;
import java.util.Arrays;
import ds.Lista;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 4, 5, 6, 7, 8, 9]
Uncovered branches: [3]
Total number of branches: 9
Total number of covered branches: 8
Coverage : 88,89%
Evaluations : 82451
search time (ms): 42501
total runtime (ms): 44107
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[2], 
3)----->insere[-1], 
4)----->insere[0], 
5)----->insere[4.366073227207934D], 
6)----->insere[csbst.generators.CopyGenerator@0], 
7)----->imprime[], 
8)----->vazia[], 
9)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=2;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("2",clsUTListaP2P1.toString());
    assertEquals(2,clsUTListaP2P1.hashCode());
    Integer clsUTListaP3P1O0=-1;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("-1",clsUTListaP3P1.toString());
    assertEquals(-1,clsUTListaP3P1.hashCode());
    Integer clsUTListaP4P1O0=0;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("0",clsUTListaP4P1.toString());
    assertEquals(0,clsUTListaP4P1.hashCode());
    double clsUTListaP5P1O0=4.366073227207934D;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("4.366073227207934",clsUTListaP5P1.toString());
    assertEquals(-1501936469,clsUTListaP5P1.hashCode());
      clsUTLista.insere(clsUTLista);
      clsUTLista.imprime();
    boolean clsUTListaP8R=false;
      clsUTListaP8R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP8R);
    String clsUTListaP9R=null;
      clsUTListaP9R=clsUTLista.toString();
    StringBuffer clsUTListaP9RP0P1P1=null;
      clsUTListaP9RP0P1P1=new StringBuffer();
    CharSequence clsUTListaP9RP0P1=null;
      clsUTListaP9RP0P1=new String(clsUTListaP9RP0P1P1);
    String clsUTListaP9RP0R=null;
//Exception
    try {
      clsUTListaP9RP0R=String.join(clsUTListaP9RP0P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("",clsUTListaP9RP0P1.toString());
    assertEquals(0,clsUTListaP9RP0P1.length());
    assertNull(clsUTListaP9RP0R);
    char[] clsUTListaP9RP1R=null;
      clsUTListaP9RP1R=clsUTListaP9R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[java.util.Date[]], 
3)----->insere[csbst.generators.CopyGenerator@0], 
4)----->vazia[], 
5)----->toString[], 
6)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Date clsUTListaP2P1O0=null;
      clsUTListaP2P1O0=new Date();
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
      clsUTLista.insere(clsUTLista);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP4R);
    String clsUTListaP5R=null;
      clsUTListaP5R=clsUTLista.toString();
    boolean clsUTListaP6R=false;
      clsUTListaP6R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    String clsUTListaP3RP0P1P1=new String("8fuabrvelw5dqxtpiojgm2nk3y");
    StringBuffer clsUTListaP3RP0P1=null;
      clsUTListaP3RP0P1=new StringBuffer(clsUTListaP3RP0P1P1);
    boolean clsUTListaP3RP0R=false;
      clsUTListaP3RP0R=clsUTListaP3R.contentEquals(clsUTListaP3RP0P1);
    assertEquals("8fuabrvelw5dqxtpiojgm2nk3y",clsUTListaP3RP0P1.toString());
    assertEquals(26,clsUTListaP3RP0P1.length());
    assertEquals(false,clsUTListaP3RP0R);
  }
}

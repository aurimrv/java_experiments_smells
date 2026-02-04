package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
import java.nio.charset.Charset;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 7
Coverage : 100%
Evaluations : 6
search time (ms): 228
total runtime (ms): 1424
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    int clsUTListaP3RP0P1=602;
    int clsUTListaP3RP0R=0;
//Exception
    try {
      clsUTListaP3RP0R=clsUTListaP3R.codePointBefore(clsUTListaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    CharSequence clsUTListaP3RP1P1=null;
      clsUTListaP3RP1P1=new String();
    boolean clsUTListaP3RP1R=false;
      clsUTListaP3RP1R=clsUTListaP3R.contentEquals(clsUTListaP3RP1P1);
    assertEquals("",clsUTListaP3RP1P1.toString());
    assertEquals(0,clsUTListaP3RP1P1.length());
    assertEquals(false,clsUTListaP3RP1R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[-64.36314758017657D], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[1, 2, 6, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Double clsUTListaP2P1O0=-64.36314758017657D;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("-64.36314758017657",clsUTListaP2P1.toString());
    assertEquals(252250506,clsUTListaP2P1.hashCode());
      clsUTLista.imprime();
      clsUTLista.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[21772], 
3)----->insere[null], 
4)----->insere[-69.85744F], 
5)----->insere[false], 
6)----->insere[-47L], 
7)----->vazia[], 
8)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Short clsUTListaP2P1O0=21772;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("21772",clsUTListaP2P1.toString());
    assertEquals(21772,clsUTListaP2P1.hashCode());
      clsUTLista.insere((Object)null);
    float clsUTListaP4P1O0=-69.85744F;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("-69.85744",clsUTListaP4P1.toString());
    assertEquals(-1031031038,clsUTListaP4P1.hashCode());
    Boolean clsUTListaP5P1O0=false;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("false",clsUTListaP5P1.toString());
    assertEquals(1237,clsUTListaP5P1.hashCode());
    long clsUTListaP6P1O0=-47L;
    Object clsUTListaP6P1=clsUTListaP6P1O0;
      clsUTLista.insere((Object)clsUTListaP6P1);
    assertEquals("-47",clsUTListaP6P1.toString());
    assertEquals(46,clsUTListaP6P1.hashCode());
    boolean clsUTListaP7R=false;
      clsUTListaP7R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP7R);
    String clsUTListaP8R=null;
      clsUTListaP8R=clsUTLista.toString();
    CharSequence clsUTListaP8RP0P1=null;
      clsUTListaP8RP0P1=new StringBuffer();
    byte[] clsUTListaP8RP0P2P1P1=new byte[]{};
    Charset clsUTListaP8RP0P2P1P2=null;
      clsUTListaP8RP0P2P1P2=Charset.defaultCharset();
    CharSequence clsUTListaP8RP0P2P1=null;
      clsUTListaP8RP0P2P1=new String(clsUTListaP8RP0P2P1P1,clsUTListaP8RP0P2P1P2);
    char[] clsUTListaP8RP0P2P2P1=new char[]{'\u0048','\u3d33'};
    CharSequence clsUTListaP8RP0P2P2=null;
      clsUTListaP8RP0P2P2=new String(clsUTListaP8RP0P2P2P1);
    CharSequence[] clsUTListaP8RP0P2=new CharSequence[]{clsUTListaP8RP0P2P1,clsUTListaP8RP0P2P2};
    String clsUTListaP8RP0R=null;
      clsUTListaP8RP0R=String.join(clsUTListaP8RP0P1,clsUTListaP8RP0P2);
    assertEquals("",clsUTListaP8RP0P1.toString());
    assertEquals(0,clsUTListaP8RP0P1.length());
    assertEquals("H㴳",clsUTListaP8RP0R);
    int clsUTListaP8RP1R=0;
      clsUTListaP8RP1R=clsUTListaP8R.length();
    assertEquals(10,clsUTListaP8RP1R);
  }
}

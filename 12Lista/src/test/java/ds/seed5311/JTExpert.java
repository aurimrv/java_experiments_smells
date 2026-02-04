package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 6
Coverage : 85,71%
Evaluations : 144666
search time (ms): 42501
total runtime (ms): 44012
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[15.89727F], 
3)----->insere[false], 
4)----->insere[64L], 
5)----->insere[-32.169832995834525D], 
6)----->vazia[], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Float clsUTListaP2P1O0=15.89727F;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("15.89727",clsUTListaP2P1.toString());
    assertEquals(1098799928,clsUTListaP2P1.hashCode());
    Boolean clsUTListaP3P1O0=false;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("false",clsUTListaP3P1.toString());
    assertEquals(1237,clsUTListaP3P1.hashCode());
    Long clsUTListaP4P1O0=64L;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("64",clsUTListaP4P1.toString());
    assertEquals(64,clsUTListaP4P1.hashCode());
    Double clsUTListaP5P1O0=-32.169832995834525D;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("-32.169832995834525",clsUTListaP5P1.toString());
    assertEquals(-701667407,clsUTListaP5P1.hashCode());
    boolean clsUTListaP6R=false;
      clsUTListaP6R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP6R);
    String clsUTListaP7R=null;
      clsUTListaP7R=clsUTLista.toString();
    double clsUTListaP7RP0P1=49.80007024605297D;
    String clsUTListaP7RP0R=null;
      clsUTListaP7RP0R=String.valueOf(clsUTListaP7RP0P1);
    assertEquals("49.80007024605297",clsUTListaP7RP0R);
    String clsUTListaP7RP1R=null;
      clsUTListaP7RP1R=clsUTListaP7R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    boolean clsUTListaP3RP0R=false;
      clsUTListaP3RP0R=clsUTListaP3R.isEmpty();
    assertEquals(false,clsUTListaP3RP0R);
    byte[] clsUTListaP3RP1P2P1P1=new byte[]{-43,30,-116,96};
    int clsUTListaP3RP1P2P1P2=779;
    CharSequence clsUTListaP3RP1P2P1=null;
      clsUTListaP3RP1P2P1=new String(clsUTListaP3RP1P2P1P1,clsUTListaP3RP1P2P1P2);
    String clsUTListaP3RP1P2P2P1=new String(".7=&+");
    CharSequence clsUTListaP3RP1P2P2=null;
      clsUTListaP3RP1P2P2=new String(clsUTListaP3RP1P2P2P1);
    byte[] clsUTListaP3RP1P2P3P1=new byte[]{1,120,-75,-61};
    int clsUTListaP3RP1P2P3P2=-947;
    CharSequence clsUTListaP3RP1P2P3=null;
      clsUTListaP3RP1P2P3=new String(clsUTListaP3RP1P2P3P1,clsUTListaP3RP1P2P3P2);
    long clsUTListaP3RP1P2P4P1=89L;
    CharSequence clsUTListaP3RP1P2P4=null;
      clsUTListaP3RP1P2P4=String.valueOf(clsUTListaP3RP1P2P4P1);
    CharSequence[] clsUTListaP3RP1P2=new CharSequence[]{clsUTListaP3RP1P2P1,clsUTListaP3RP1P2P2,clsUTListaP3RP1P2P3,clsUTListaP3RP1P2P4};
    String clsUTListaP3RP1R=null;
//Exception
    try {
      clsUTListaP3RP1R=String.join((CharSequence)null,clsUTListaP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTListaP3RP1R);
  }
}

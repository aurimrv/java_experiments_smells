package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 73222
search time (ms): 42501
total runtime (ms): 44081
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[String], 
3)----->insere[-316], 
4)----->insere[-968], 
5)----->insere[92], 
6)----->vazia[], 
7)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    String clsUTListaP2P1O0=new String("XtIwnOQaRVTbdkuoGYFfLzWABEvqpSNKigCmjUJlMPDxhesrycHZ");
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("XtIwnOQaRVTbdkuoGYFfLzWABEvqpSNKigCmjUJlMPDxhesrycHZ",clsUTListaP2P1.toString());
    assertEquals(-1508120486,clsUTListaP2P1.hashCode());
    int clsUTListaP3P1O0=-316;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("-316",clsUTListaP3P1.toString());
    assertEquals(-316,clsUTListaP3P1.hashCode());
    Integer clsUTListaP4P1O0=-968;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("-968",clsUTListaP4P1.toString());
    assertEquals(-968,clsUTListaP4P1.hashCode());
    byte clsUTListaP5P1O0=92;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("92",clsUTListaP5P1.toString());
    assertEquals(92,clsUTListaP5P1.hashCode());
    boolean clsUTListaP6R=false;
      clsUTListaP6R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP6R);
    String clsUTListaP7R=null;
      clsUTListaP7R=clsUTLista.toString();
    String clsUTListaP7RP0P1=new String("0143818674134814575350872553545507637");
    boolean clsUTListaP7RP0R=false;
      clsUTListaP7RP0R=clsUTListaP7R.startsWith(clsUTListaP7RP0P1);
    assertEquals("0143818674134814575350872553545507637",clsUTListaP7RP0P1.toString());
    assertEquals(false,clsUTListaP7RP0R);
    String clsUTListaP7RP1R=null;
      clsUTListaP7RP1R=clsUTListaP7R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[6372566119840532771L], 
3)----->insere[829], 
4)----->insere[41], 
5)----->insere[\u0034], 
6)----->insere[62], 
7)----->imprime[], 
8)----->vazia[], 
9)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Long clsUTListaP2P1O0=6372566119840532771L;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("6372566119840532771",clsUTListaP2P1.toString());
    assertEquals(816262716,clsUTListaP2P1.hashCode());
    Integer clsUTListaP3P1O0=829;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("829",clsUTListaP3P1.toString());
    assertEquals(829,clsUTListaP3P1.hashCode());
    byte clsUTListaP4P1O0=41;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("41",clsUTListaP4P1.toString());
    assertEquals(41,clsUTListaP4P1.hashCode());
    Character clsUTListaP5P1O0='\u0034';
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("4",clsUTListaP5P1.toString());
    assertEquals(52,clsUTListaP5P1.hashCode());
    short clsUTListaP6P1O0=62;
    Object clsUTListaP6P1=clsUTListaP6P1O0;
      clsUTLista.insere((Object)clsUTListaP6P1);
    assertEquals("62",clsUTListaP6P1.toString());
    assertEquals(62,clsUTListaP6P1.hashCode());
      clsUTLista.imprime();
    boolean clsUTListaP8R=false;
      clsUTListaP8R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP8R);
    String clsUTListaP9R=null;
      clsUTListaP9R=clsUTLista.toString();
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
    int clsUTListaP3RP0P1=967;
    int clsUTListaP3RP0P2=769;
    int clsUTListaP3RP0R=0;
      clsUTListaP3RP0R=clsUTListaP3R.lastIndexOf(clsUTListaP3RP0P1,clsUTListaP3RP0P2);
    assertEquals(-1,clsUTListaP3RP0R);
  }
}

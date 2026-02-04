package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Date;
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
Evaluations : 75653
search time (ms): 42503
total runtime (ms): 44056
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[1], 
3)----->insere[10], 
4)----->insere[557], 
5)----->insere[-27.986992F], 
6)----->imprime[], 
7)----->toString[]
 Covered Branches:[1, 2, 4, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=1;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("1",clsUTListaP2P1.toString());
    assertEquals(1,clsUTListaP2P1.hashCode());
    short clsUTListaP3P1O0=10;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("10",clsUTListaP3P1.toString());
    assertEquals(10,clsUTListaP3P1.hashCode());
    int clsUTListaP4P1O0=557;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("557",clsUTListaP4P1.toString());
    assertEquals(557,clsUTListaP4P1.hashCode());
    Float clsUTListaP5P1O0=-27.986992F;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("-27.986992",clsUTListaP5P1.toString());
    assertEquals(-1042291364,clsUTListaP5P1.hashCode());
      clsUTLista.imprime();
    String clsUTListaP7R=null;
      clsUTListaP7R=clsUTLista.toString();
    String clsUTListaP7RP0P1=new String("55280771743358626338454063186810653143430155866854861505742638151644231612863206080704323376633846228246250176686137508468230551761183214721177371582340331400601327525038351134400114841703257600364576621010166");
    int clsUTListaP7RP0P2P1O0P1=-750;
    int clsUTListaP7RP0P2P1O0P2=858;
    int clsUTListaP7RP0P2P1O0P3=-192;
    int clsUTListaP7RP0P2P1O0P4=-37;
    int clsUTListaP7RP0P2P1O0P5=1001;
    int clsUTListaP7RP0P2P1O0P6=148;
    Date clsUTListaP7RP0P2P1O0=null;
      clsUTListaP7RP0P2P1O0=new Date(clsUTListaP7RP0P2P1O0P1,clsUTListaP7RP0P2P1O0P2,clsUTListaP7RP0P2P1O0P3,clsUTListaP7RP0P2P1O0P4,clsUTListaP7RP0P2P1O0P5,clsUTListaP7RP0P2P1O0P6);
    Object clsUTListaP7RP0P2P1=clsUTListaP7RP0P2P1O0;
    Float clsUTListaP7RP0P2P2O0=null;
    Object clsUTListaP7RP0P2P2=clsUTListaP7RP0P2P2O0;
    Object[] clsUTListaP7RP0P2=new Object[]{clsUTListaP7RP0P2P1,clsUTListaP7RP0P2P2};
    String clsUTListaP7RP0R=null;
      clsUTListaP7RP0R=String.format(clsUTListaP7RP0P1,(Object[])clsUTListaP7RP0P2);
    assertEquals("55280771743358626338454063186810653143430155866854861505742638151644231612863206080704323376633846228246250176686137508468230551761183214721177371582340331400601327525038351134400114841703257600364576621010166",clsUTListaP7RP0P1.toString());
    assertEquals("55280771743358626338454063186810653143430155866854861505742638151644231612863206080704323376633846228246250176686137508468230551761183214721177371582340331400601327525038351134400114841703257600364576621010166",clsUTListaP7RP0R);
    String clsUTListaP7RP1R=null;
      clsUTListaP7RP1R=clsUTListaP7R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[1000], 
3)----->insere[771], 
4)----->insere[true], 
5)----->insere[28], 
6)----->vazia[], 
7)----->toString[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=1000;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("1000",clsUTListaP2P1.toString());
    assertEquals(1000,clsUTListaP2P1.hashCode());
    Short clsUTListaP3P1O0=771;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("771",clsUTListaP3P1.toString());
    assertEquals(771,clsUTListaP3P1.hashCode());
    boolean clsUTListaP4P1O0=true;
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("true",clsUTListaP4P1.toString());
    assertEquals(1231,clsUTListaP4P1.hashCode());
    Byte clsUTListaP5P1O0=28;
    Object clsUTListaP5P1=clsUTListaP5P1O0;
      clsUTLista.insere((Object)clsUTListaP5P1);
    assertEquals("28",clsUTListaP5P1.toString());
    assertEquals(28,clsUTListaP5P1.hashCode());
    boolean clsUTListaP6R=false;
      clsUTListaP6R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP6R);
    String clsUTListaP7R=null;
      clsUTListaP7R=clsUTLista.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->vazia[], 
3)----->vazia[], 
4)----->toString[]
 Covered Branches:[1, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    boolean clsUTListaP2R=false;
      clsUTListaP2R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP2R);
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    boolean clsUTListaP4RP0P1=true;
    String clsUTListaP4RP0R=null;
      clsUTListaP4RP0R=String.valueOf(clsUTListaP4RP0P1);
    assertEquals("true",clsUTListaP4RP0R);
  }
}

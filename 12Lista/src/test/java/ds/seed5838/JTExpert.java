package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Lista;
import java.util.Date;
/** 
 * This class was automatically generated to test the ds.Lista class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 6
Coverage : 85,71%
Evaluations : 141000
search time (ms): 42502
total runtime (ms): 44004
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[]
 Covered Branches:[1, 6]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[java.util.Date[]], 
3)----->insere[-77], 
4)----->insere[\u0031], 
5)----->vazia[], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Date clsUTListaP2P1O0=null;
      clsUTListaP2P1O0=new Date();
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    Integer clsUTListaP3P1O0=-77;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("-77",clsUTListaP3P1.toString());
    assertEquals(-77,clsUTListaP3P1.hashCode());
    Character clsUTListaP4P1O0='\u0031';
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
    assertEquals("1",clsUTListaP4P1.toString());
    assertEquals(49,clsUTListaP4P1.hashCode());
    boolean clsUTListaP5R=false;
      clsUTListaP5R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP5R);
    String clsUTListaP6R=null;
      clsUTListaP6R=clsUTLista.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 3, 4, 6]
 */
  @Test public void TestCase2() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    String clsUTListaP3RP0P1P1=new String("");
    CharSequence clsUTListaP3RP0P1=null;
      clsUTListaP3RP0P1=new StringBuilder(clsUTListaP3RP0P1P1);
    boolean clsUTListaP3RP0R=false;
      clsUTListaP3RP0R=clsUTListaP3R.contentEquals(clsUTListaP3RP0P1);
    assertEquals("",clsUTListaP3RP0P1.toString());
    assertEquals(0,clsUTListaP3RP0P1.length());
    assertEquals(false,clsUTListaP3RP0R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(true,clsUTListaP4R);
  }
}

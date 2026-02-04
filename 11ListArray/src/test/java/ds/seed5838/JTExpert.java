package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 70826
search time (ms): 42501
total runtime (ms): 44099
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[true], 
3)----->insere[\u003e], 
4)----->imprime[], 
5)----->toString[], 
6)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Boolean clsUTListaP2P1O0=true;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("true",clsUTListaP2P1.toString());
    assertEquals(1231,clsUTListaP2P1.hashCode());
    char clsUTListaP3P1O0='\u003e';
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals(">",clsUTListaP3P1.toString());
    assertEquals(62,clsUTListaP3P1.hashCode());
      clsUTLista.imprime();
    String clsUTListaP5R=null;
      clsUTListaP5R=clsUTLista.toString();
    int clsUTListaP5RP0P1=572;
    int clsUTListaP5RP0P2=-331;
    int clsUTListaP5RP0R=0;
//Exception
    try {
      clsUTListaP5RP0R=clsUTListaP5R.offsetByCodePoints(clsUTListaP5RP0P1,clsUTListaP5RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    boolean clsUTListaP5RP1R=false;
      clsUTListaP5RP1R=clsUTListaP5R.isEmpty();
    assertEquals(false,clsUTListaP5RP1R);
    boolean clsUTListaP6R=false;
      clsUTListaP6R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[csbst.generators.CopyGenerator@0], 
3)----->toString[], 
4)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.insere(clsUTLista);
    String clsUTListaP3R=null;
      clsUTListaP3R=clsUTLista.toString();
    String clsUTListaP3RP0R=null;
      clsUTListaP3RP0R=clsUTListaP3R.toUpperCase();
    int clsUTListaP3RP1P1=-30;
    int clsUTListaP3RP1R=0;
      clsUTListaP3RP1R=clsUTListaP3R.indexOf(clsUTListaP3RP1P1);
    assertEquals(-1,clsUTListaP3RP1R);
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP4R);
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
    char[] clsUTListaP3RP0P1=new char[]{};
    String clsUTListaP3RP0R=null;
      clsUTListaP3RP0R=String.copyValueOf(clsUTListaP3RP0P1);
    assertTrue(Arrays.equals(new char[]{},clsUTListaP3RP0P1));
    assertEquals("",clsUTListaP3RP0R);
    String clsUTListaP3RP1P1=new String("wmweyxvorpfiwprbanqjrtxuludqdmkcsnkimjvewvucupqmucvgejcklkhqcsarngeliysvbueaonchcopjrukkrogstvfmkuoguskurhgbmctfrk");
    String clsUTListaP3RP1P2=new String("3hr]_#fonj_ibmt: =y3{1+%qx+{b1");
    String clsUTListaP3RP1R=null;
      clsUTListaP3RP1R=clsUTListaP3R.replaceAll(clsUTListaP3RP1P1,clsUTListaP3RP1P2);
    assertEquals("wmweyxvorpfiwprbanqjrtxuludqdmkcsnkimjvewvucupqmucvgejcklkhqcsarngeliysvbueaonchcopjrukkrogstvfmkuoguskurhgbmctfrk",clsUTListaP3RP1P1.toString());
    assertEquals("3hr]_#fonj_ibmt: =y3{1+%qx+{b1",clsUTListaP3RP1P2.toString());
  }
}

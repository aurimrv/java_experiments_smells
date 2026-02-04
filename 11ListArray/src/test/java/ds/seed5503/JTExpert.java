package ds.seed5503;
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
Evaluations : 77013
search time (ms): 42501
total runtime (ms): 43986
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[413], 
3)----->insere[-32], 
4)----->imprime[], 
5)----->toString[]
 Covered Branches:[1, 2, 4, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=413;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("413",clsUTListaP2P1.toString());
    assertEquals(413,clsUTListaP2P1.hashCode());
    short clsUTListaP3P1O0=-32;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("-32",clsUTListaP3P1.toString());
    assertEquals(-32,clsUTListaP3P1.hashCode());
      clsUTLista.imprime();
    String clsUTListaP5R=null;
      clsUTListaP5R=clsUTLista.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[646], 
3)----->insere[false], 
4)----->vazia[], 
5)----->toString[], 
6)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    Integer clsUTListaP2P1O0=646;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("646",clsUTListaP2P1.toString());
    assertEquals(646,clsUTListaP2P1.hashCode());
    Boolean clsUTListaP3P1O0=false;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("false",clsUTListaP3P1.toString());
    assertEquals(1237,clsUTListaP3P1.hashCode());
    boolean clsUTListaP4R=false;
      clsUTListaP4R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP4R);
    String clsUTListaP5R=null;
      clsUTListaP5R=clsUTLista.toString();
    String clsUTListaP5RP0P1=new String("kXVBBMIpkXNAkmvnAxxNlPIUlMPCXOUSTIUUABfdgJQvRKDuxNpzkJOcDFjteERObAuRXXhHbzFmiBIbXIUcFygWIKPCrOHmBJAviSaFFWkMOcUFUgoMqwNnECOUpwjescngGxeYmCwUWkDjPRGJOtrrsdeLYWzbXRYCJssVhzSMWCmChNSBHiLPYOOYBwWPwvPITTNAW");
    String clsUTListaP5RP0P2=new String(" _p6|'ZTg7-Mcx1wXhS~ODQ]dH");
    String clsUTListaP5RP0R=null;
      clsUTListaP5RP0R=clsUTListaP5R.replaceFirst(clsUTListaP5RP0P1,clsUTListaP5RP0P2);
    assertEquals("kXVBBMIpkXNAkmvnAxxNlPIUlMPCXOUSTIUUABfdgJQvRKDuxNpzkJOcDFjteERObAuRXXhHbzFmiBIbXIUcFygWIKPCrOHmBJAviSaFFWkMOcUFUgoMqwNnECOUpwjescngGxeYmCwUWkDjPRGJOtrrsdeLYWzbXRYCJssVhzSMWCmChNSBHiLPYOOYBwWPwvPITTNAW",clsUTListaP5RP0P1.toString());
    assertEquals(" _p6|'ZTg7-Mcx1wXhS~ODQ]dH",clsUTListaP5RP0P2.toString());
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
    boolean clsUTListaP3RP0R=false;
//Exception
    try {
      clsUTListaP3RP0R=clsUTListaP3R.matches((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTListaP3RP1P1=759;
    String clsUTListaP3RP1R=null;
      clsUTListaP3RP1R=String.valueOf(clsUTListaP3RP1P1);
    assertEquals("759",clsUTListaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->imprime[], 
3)----->insere[\u6c9c]
 Covered Branches:[1, 2, 4, 8]
 */
  @Test public void TestCase3() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
      clsUTLista.imprime();
    Character clsUTListaP3P1O0='\u6c9c';
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("沜",clsUTListaP3P1.toString());
    assertEquals(27804,clsUTListaP3P1.hashCode());
  }
}

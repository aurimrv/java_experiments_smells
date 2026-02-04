package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Pilha;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 50469
search time (ms): 42501
total runtime (ms): 44036
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->desempilha[], 
4)----->desempilha[], 
5)----->empilha[csbst.generators.CopyGenerator@0], 
6)----->toString[]
 Covered Branches:[1, 2, 3, 4, 6, 7]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Object clsUTPilhaP2R=null;
//Exception
    try {
      clsUTPilhaP2R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP2R);
    Object clsUTPilhaP3R=null;
//Exception
    try {
      clsUTPilhaP3R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP3R);
    Object clsUTPilhaP4R=null;
//Exception
    try {
      clsUTPilhaP4R=clsUTPilha.desempilha();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTPilhaP4R);
      clsUTPilha.empilha(clsUTPilha);
    String clsUTPilhaP6R=null;
      clsUTPilhaP6R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    byte[] clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.getBytes();
    String clsUTPilhaP3RP1P1=new String("3l36ycy4cjrb");
    int clsUTPilhaP3RP1R=0;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.compareToIgnoreCase(clsUTPilhaP3RP1P1);
    assertEquals("3l36ycy4cjrb",clsUTPilhaP3RP1P1.toString());
    assertEquals(49,clsUTPilhaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->vazia[], 
3)----->toString[]
 Covered Branches:[1, 6, 7]
 */
  @Test public void TestCase2() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    boolean clsUTPilhaP2R=false;
      clsUTPilhaP2R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    String clsUTPilhaP3RP0R=null;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.toUpperCase();
    boolean clsUTPilhaP3RP1R=false;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.isEmpty();
    assertEquals(false,clsUTPilhaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[-13.713746520011142D], 
3)----->empilha[null], 
4)----->empilha[21], 
5)----->empilha[102], 
6)----->desempilha[], 
7)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Double clsUTPilhaP2P1O0=-13.713746520011142D;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("-13.713746520011142",clsUTPilhaP2P1.toString());
    assertEquals(-281459552,clsUTPilhaP2P1.hashCode());
      clsUTPilha.empilha((Object)null);
    Integer clsUTPilhaP4P1O0=21;
    Object clsUTPilhaP4P1=clsUTPilhaP4P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP4P1);
    assertEquals("21",clsUTPilhaP4P1.toString());
    assertEquals(21,clsUTPilhaP4P1.hashCode());
    byte clsUTPilhaP5P1O0=102;
    Object clsUTPilhaP5P1=clsUTPilhaP5P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP5P1);
    assertEquals("102",clsUTPilhaP5P1.toString());
    assertEquals(102,clsUTPilhaP5P1.hashCode());
    Object clsUTPilhaP6R=null;
      clsUTPilhaP6R=clsUTPilha.desempilha();
    assertEquals(102,clsUTPilhaP6R.hashCode());
    String clsUTPilhaP7R=null;
      clsUTPilhaP7R=clsUTPilha.toString();
    String clsUTPilhaP7RP0P1=new String("378778236212163112617814822416261221216344508624808628374745238");
    boolean clsUTPilhaP7RP0R=false;
      clsUTPilhaP7RP0R=clsUTPilhaP7R.startsWith(clsUTPilhaP7RP0P1);
    assertEquals("378778236212163112617814822416261221216344508624808628374745238",clsUTPilhaP7RP0P1.toString());
    assertEquals(false,clsUTPilhaP7RP0R);
    boolean clsUTPilhaP7RP1P1=true;
    String clsUTPilhaP7RP1R=null;
      clsUTPilhaP7RP1R=String.valueOf(clsUTPilhaP7RP1P1);
    assertEquals("true",clsUTPilhaP7RP1R);
  }
}

package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import ds.Pilha;
import java.util.Arrays;
import java.nio.charset.Charset;
/** 
 * This class was automatically generated to test the ds.Pilha class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 51517
search time (ms): 42502
total runtime (ms): 44072
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[1], 
3)----->empilha[String], 
4)----->desempilha[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase0() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    Integer clsUTPilhaP2P1O0=1;
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("1",clsUTPilhaP2P1.toString());
    assertEquals(1,clsUTPilhaP2P1.hashCode());
    String clsUTPilhaP3P1O0=new String("k94&#'?+:e@s<mtfg>0)3$j6i");
    Object clsUTPilhaP3P1=clsUTPilhaP3P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP3P1);
    assertEquals(994838027,clsUTPilhaP3P1.hashCode());
    Object clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.desempilha();
    assertEquals(994838027,clsUTPilhaP4R.hashCode());
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
    Charset clsUTPilhaP5RP0P1=null;
      clsUTPilhaP5RP0P1=Charset.defaultCharset();
    byte[] clsUTPilhaP5RP0R=null;
      clsUTPilhaP5RP0R=clsUTPilhaP5R.getBytes(clsUTPilhaP5RP0P1);
    assertEquals("UTF-8",clsUTPilhaP5RP0P1.displayName());
    assertEquals("UTF-8",clsUTPilhaP5RP0P1.toString());
    assertEquals(true,clsUTPilhaP5RP0P1.isRegistered());
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->empilha[\u4f3d], 
3)----->desempilha[], 
4)----->vazia[], 
5)----->toString[]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8]
 */
  @Test public void TestCase1() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    char clsUTPilhaP2P1O0='\u4f3d';
    Object clsUTPilhaP2P1=clsUTPilhaP2P1O0;
      clsUTPilha.empilha((Object)clsUTPilhaP2P1);
    assertEquals("伽",clsUTPilhaP2P1.toString());
    assertEquals(20285,clsUTPilhaP2P1.hashCode());
    Object clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.desempilha();
    boolean clsUTPilhaP4R=false;
      clsUTPilhaP4R=clsUTPilha.vazia();
    assertEquals(true,clsUTPilhaP4R);
    String clsUTPilhaP5R=null;
      clsUTPilhaP5R=clsUTPilha.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->desempilha[], 
3)----->tamanho[], 
4)----->toString[]
 Covered Branches:[1, 3, 4, 6, 7, 9]
 */
  @Test public void TestCase2() throws Throwable {
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
    int clsUTPilhaP3R=0;
      clsUTPilhaP3R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP3R);
    String clsUTPilhaP4R=null;
      clsUTPilhaP4R=clsUTPilha.toString();
    String clsUTPilhaP4RP0P1=new String("daDTpMre6Gy3tBvu8x1mPozc94SAJIsN5KbjUR0OWgEVFHhkXfwCnlqi2Y7LQZ");
    Object[] clsUTPilhaP4RP0P2=new Object[]{};
    String clsUTPilhaP4RP0R=null;
      clsUTPilhaP4RP0R=String.format(clsUTPilhaP4RP0P1,(Object[])clsUTPilhaP4RP0P2);
    assertEquals("daDTpMre6Gy3tBvu8x1mPozc94SAJIsN5KbjUR0OWgEVFHhkXfwCnlqi2Y7LQZ",clsUTPilhaP4RP0P1.toString());
    assertEquals("daDTpMre6Gy3tBvu8x1mPozc94SAJIsN5KbjUR0OWgEVFHhkXfwCnlqi2Y7LQZ",clsUTPilhaP4RP0R);
    int clsUTPilhaP4RP1P1=-830;
    String clsUTPilhaP4RP1R=null;
      clsUTPilhaP4RP1R=String.valueOf(clsUTPilhaP4RP1P1);
    assertEquals("-830",clsUTPilhaP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Pilha[]
2)----->tamanho[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Ignore
  @Test public void TestCase3() throws Throwable {
    Pilha clsUTPilha=null;
      clsUTPilha=new Pilha();
    int clsUTPilhaP2R=0;
      clsUTPilhaP2R=clsUTPilha.tamanho();
    assertEquals(0,clsUTPilhaP2R);
    String clsUTPilhaP3R=null;
      clsUTPilhaP3R=clsUTPilha.toString();
    int clsUTPilhaP3RP0R=0;
      clsUTPilhaP3RP0R=clsUTPilhaP3R.length();
    assertEquals(17,clsUTPilhaP3RP0R);
    boolean clsUTPilhaP3RP1R=false;
      clsUTPilhaP3RP1R=clsUTPilhaP3R.isEmpty();
    assertEquals(false,clsUTPilhaP3RP1R);
  }
}

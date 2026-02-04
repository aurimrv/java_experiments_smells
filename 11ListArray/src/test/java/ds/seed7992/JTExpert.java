package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.time.Instant;
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
Evaluations : 75283
search time (ms): 42501
total runtime (ms): 44081
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[45.25076816442521D], 
3)----->vazia[], 
4)----->toString[], 
5)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7]
 */
  @Test public void TestCase0() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    double clsUTListaP2P1O0=45.25076816442521D;
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("45.25076816442521",clsUTListaP2P1.toString());
    assertEquals(1804741329,clsUTListaP2P1.hashCode());
    boolean clsUTListaP3R=false;
      clsUTListaP3R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP3R);
    String clsUTListaP4R=null;
      clsUTListaP4R=clsUTLista.toString();
    long clsUTListaP4RP0P1=-66L;
    String clsUTListaP4RP0R=null;
      clsUTListaP4RP0R=String.valueOf(clsUTListaP4RP0P1);
    assertEquals("-66",clsUTListaP4RP0R);
    boolean clsUTListaP5R=false;
      clsUTListaP5R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Lista[]
2)----->insere[from[ofEpochSecond[44L]]], 
3)----->insere[11555], 
4)----->insere[ds.Lista[]], 
5)----->imprime[], 
6)----->toString[], 
7)----->vazia[]
 Covered Branches:[1, 2, 4, 5, 7, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Lista clsUTLista=null;
      clsUTLista=new Lista();
    long clsUTListaP2P1O0P1P1=44L;
    Instant clsUTListaP2P1O0P1=null;
      clsUTListaP2P1O0P1=Instant.ofEpochSecond(clsUTListaP2P1O0P1P1);
    Date clsUTListaP2P1O0=null;
      clsUTListaP2P1O0=Date.from(clsUTListaP2P1O0P1);
    Object clsUTListaP2P1=clsUTListaP2P1O0;
      clsUTLista.insere((Object)clsUTListaP2P1);
    assertEquals("Thu Jan 01 00:00:44 GMT 1970",clsUTListaP2P1.toString());
    assertEquals(44000,clsUTListaP2P1.hashCode());
    short clsUTListaP3P1O0=11555;
    Object clsUTListaP3P1=clsUTListaP3P1O0;
      clsUTLista.insere((Object)clsUTListaP3P1);
    assertEquals("11555",clsUTListaP3P1.toString());
    assertEquals(11555,clsUTListaP3P1.hashCode());
    Lista clsUTListaP4P1O0=null;
      clsUTListaP4P1O0=new Lista();
    Object clsUTListaP4P1=clsUTListaP4P1O0;
      clsUTLista.insere((Object)clsUTListaP4P1);
      clsUTLista.imprime();
    String clsUTListaP6R=null;
      clsUTListaP6R=clsUTLista.toString();
    String clsUTListaP6RP0P1=new String("");
    int clsUTListaP6RP0R=0;
      clsUTListaP6RP0R=clsUTListaP6R.compareToIgnoreCase(clsUTListaP6RP0P1);
    assertEquals("",clsUTListaP6RP0P1.toString());
    boolean clsUTListaP7R=false;
      clsUTListaP7R=clsUTLista.vazia();
    assertEquals(false,clsUTListaP7R);
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
    String clsUTListaP3RP0P1=new String("hwiDFapteyqVvAUJpOVIcDJTvn3eln5iugrn4wFRyBbTj6q2KIMkIquGRirmCn1OH7q6n4II27jfcapTeclECsodIGtxYnxQQBqdCrOLCdzp5AQkX5qtQInR2Vxt4Hrp5zIJmQDwy8DmRoDJCWg9RmIsEitetc1vFFOylnvTWH88qyV1fXWjo5moBPJ");
    boolean clsUTListaP3RP0R=false;
      clsUTListaP3RP0R=clsUTListaP3R.startsWith(clsUTListaP3RP0P1);
    assertEquals("hwiDFapteyqVvAUJpOVIcDJTvn3eln5iugrn4wFRyBbTj6q2KIMkIquGRirmCn1OH7q6n4II27jfcapTeclECsodIGtxYnxQQBqdCrOLCdzp5AQkX5qtQInR2Vxt4Hrp5zIJmQDwy8DmRoDJCWg9RmIsEitetc1vFFOylnvTWH88qyV1fXWjo5moBPJ",clsUTListaP3RP0P1.toString());
    assertEquals(false,clsUTListaP3RP0R);
  }
}

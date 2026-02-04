package ds.seed5311;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = '#';
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        pilha5.topo = (byte) -1;
        pilha5.topo = 0;
        boolean boolean15 = pilha5.vazia();
        pilha5.topo = (byte) 1;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        java.lang.Object obj23 = pilha18.desempilha();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 0;
        pilha18.empilha((java.lang.Object) 0);
        pilha18.topo = (byte) 100;
        java.lang.Object obj32 = pilha18.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha18.item = objArray37;
        pilha5.item = objArray37;
        pilha0.empilha((java.lang.Object) pilha5);
        boolean boolean41 = pilha5.vazia();
        int int42 = pilha5.topo;
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        int int15 = pilha8.tamanho();
        java.lang.Object obj16 = pilha8.desempilha();
        boolean boolean17 = pilha8.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        boolean boolean34 = pilha18.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha35.item = objArray49;
        pilha18.item = objArray49;
        pilha8.item = objArray49;
        java.lang.Object[] objArray53 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        int int55 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1 + "'", obj16, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 12 + "'", int55 == 12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 0.0d);
        int int13 = pilha9.topo;
        boolean boolean14 = pilha9.vazia();
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        boolean boolean17 = pilha0.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        int int24 = pilha18.topo;
        int int25 = pilha18.tamanho();
        java.lang.Object obj26 = pilha18.desempilha();
        boolean boolean27 = pilha18.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        pilha28.empilha((java.lang.Object) 0L);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        pilha28.item = objArray42;
        boolean boolean44 = pilha28.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object[] objArray59 = pilha53.item;
        pilha45.item = objArray59;
        pilha28.item = objArray59;
        pilha18.item = objArray59;
        java.lang.Object[] objArray63 = pilha18.item;
        pilha0.item = objArray63;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray24 = pilha9.item;
        boolean boolean25 = pilha9.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.topo;
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        pilha0.topo = 3;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) 0.0d);
        int int16 = pilha12.topo;
        java.lang.Object obj17 = pilha12.desempilha();
        int int18 = pilha12.tamanho();
        int int19 = pilha12.topo;
        boolean boolean20 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha12.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        boolean boolean17 = pilha12.vazia();
        boolean boolean18 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        boolean boolean36 = pilha20.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha37.item = objArray51;
        pilha20.item = objArray51;
        int int54 = pilha20.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = '#';
        java.lang.Object[] objArray60 = pilha55.item;
        pilha20.item = objArray60;
        pilha0.item = objArray60;
        java.lang.Object obj63 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        int int27 = pilha4.topo;
        java.lang.Object obj28 = pilha4.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        pilha0.topo = 100;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) '#');
        java.lang.Object obj17 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1);
        pilha14.empilha((java.lang.Object) 0L);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = '4';
        pilha22.topo = 10;
        java.lang.Object[] objArray27 = pilha22.item;
        java.lang.Object[] objArray28 = pilha22.item;
        pilha14.item = objArray28;
        int int30 = pilha14.tamanho();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object obj37 = pilha31.desempilha();
        int int38 = pilha31.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        pilha31.item = objArray44;
        pilha14.item = objArray44;
        pilha14.empilha((java.lang.Object) true);
        int int49 = pilha14.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '#' + "'", obj17, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object obj22 = pilha0.desempilha();
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Object obj24 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray35 = null;
        pilha27.item = objArray35;
        pilha27.topo = 100;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object[] objArray45 = pilha39.item;
        pilha27.item = objArray45;
        int int47 = pilha27.topo;
        java.lang.Object[] objArray48 = pilha27.item;
        pilha0.item = objArray48;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        int int27 = pilha4.topo;
        int int28 = pilha4.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 100;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        int int10 = pilha8.topo;
        pilha8.topo = (short) 100;
        int int13 = pilha8.tamanho();
        int int14 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.topo = (short) 1;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        int int19 = pilha13.topo;
        pilha13.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 1);
        pilha22.empilha((java.lang.Object) 0L);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray38 = null;
        pilha30.item = objArray38;
        java.lang.Object[] objArray40 = new java.lang.Object[] { pilha22, pilha30 };
        pilha13.item = objArray40;
        java.lang.Object[] objArray42 = pilha13.item;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) 1);
        pilha43.empilha((java.lang.Object) 0L);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.topo = '4';
        pilha51.topo = 10;
        java.lang.Object[] objArray56 = pilha51.item;
        java.lang.Object[] objArray57 = pilha51.item;
        pilha43.item = objArray57;
        java.lang.Object[] objArray59 = pilha43.item;
        pilha13.item = objArray59;
        pilha0.item = objArray59;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        boolean boolean16 = pilha11.vazia();
        java.lang.Object[] objArray17 = pilha11.item;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        int int27 = pilha20.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object obj34 = pilha28.desempilha();
        int int35 = pilha28.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha28.item = objArray41;
        int int43 = pilha28.topo;
        int int44 = pilha28.topo;
        pilha28.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray47 = pilha28.item;
        pilha20.item = objArray47;
        pilha11.item = objArray47;
        pilha11.topo = 9;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha20.item = objArray28;
        java.lang.Object obj30 = pilha20.desempilha();
        java.lang.Object[] objArray31 = pilha20.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        java.lang.Object obj34 = pilha0.desempilha();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        boolean boolean41 = pilha35.vazia();
        int int42 = pilha35.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) 1);
        int int49 = pilha43.topo;
        pilha43.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) '#');
        java.lang.Object obj55 = pilha52.desempilha();
        pilha52.empilha((java.lang.Object) 1);
        pilha52.empilha((java.lang.Object) 0L);
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        pilha60.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray68 = null;
        pilha60.item = objArray68;
        java.lang.Object[] objArray70 = new java.lang.Object[] { pilha52, pilha60 };
        pilha43.item = objArray70;
        pilha35.item = objArray70;
        java.lang.Object obj73 = pilha35.desempilha();
        java.lang.Object[] objArray74 = pilha35.item;
        pilha0.item = objArray74;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + '#' + "'", obj55, '#');
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        int int18 = pilha0.topo;
        int int19 = pilha0.tamanho();
        java.lang.Object obj20 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        int int25 = pilha0.tamanho();
        pilha0.topo = 3;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        pilha0.empilha((java.lang.Object) pilha45);
        java.lang.Object[] objArray51 = pilha0.item;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        boolean boolean12 = pilha6.vazia();
        int int13 = pilha6.topo;
        pilha6.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object[] objArray17 = pilha0.item;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        pilha0.topo = ' ';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha23.topo = 0;
        pilha23.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        java.lang.Object[] objArray35 = pilha0.item;
        java.lang.Object obj36 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        pilha0.empilha(obj8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = '#';
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        pilha0.topo = 9;
        java.lang.Object[] objArray20 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        java.lang.Object[] objArray20 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        int int25 = pilha23.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha23.item = objArray30;
        pilha0.item = objArray30;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object[] objArray14 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray14);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha0.item = objArray20;
        java.lang.Object obj22 = pilha0.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        boolean boolean29 = pilha23.vazia();
        int int30 = pilha23.topo;
        int int31 = pilha23.topo;
        int int32 = pilha23.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        int int36 = pilha33.tamanho();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha23.item = objArray37;
        pilha23.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = 99;
        int int27 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        java.lang.Object[] objArray23 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int26 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        int int19 = pilha12.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        pilha12.item = objArray25;
        int int27 = pilha12.topo;
        int int28 = pilha12.topo;
        pilha12.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Object obj34 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) 1);
        pilha31.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray39 = null;
        pilha31.item = objArray39;
        pilha31.topo = 100;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha31.item = objArray49;
        pilha12.empilha((java.lang.Object) objArray49);
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object obj59 = pilha53.desempilha();
        int int60 = pilha53.topo;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.topo = '4';
        pilha61.topo = 10;
        java.lang.Object[] objArray66 = pilha61.item;
        pilha53.item = objArray66;
        int int68 = pilha53.topo;
        int int69 = pilha53.topo;
        pilha53.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray72 = pilha53.item;
        ds.Pilha pilha73 = new ds.Pilha();
        pilha73.topo = '4';
        pilha73.topo = 10;
        java.lang.Object[] objArray78 = pilha73.item;
        int int79 = pilha73.topo;
        pilha73.topo = 99;
        int int82 = pilha73.tamanho();
        pilha53.empilha((java.lang.Object) int82);
        pilha12.empilha((java.lang.Object) int82);
        pilha12.topo = 3;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 99 + "'", int82 == 99);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        pilha8.item = objArray17;
        pilha4.item = objArray17;
        java.lang.Object[] objArray20 = pilha4.item;
        pilha0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        int int21 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        int int14 = pilha10.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object obj21 = pilha15.desempilha();
        int int22 = pilha15.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha15.item = objArray28;
        pilha10.item = objArray28;
        pilha0.item = objArray28;
        java.lang.Object[] objArray32 = pilha0.item;
        java.lang.Class<?> wildcardClass33 = objArray32.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        boolean boolean25 = pilha20.vazia();
        java.lang.Object[] objArray26 = pilha20.item;
        java.lang.Object[] objArray27 = pilha20.item;
        pilha16.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        pilha29.topo = (short) 100;
        java.lang.Object obj34 = pilha29.desempilha();
        java.lang.Object obj35 = pilha29.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) '#');
        java.lang.Object obj39 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 1);
        int int42 = pilha36.topo;
        pilha36.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) '#');
        java.lang.Object obj56 = pilha53.desempilha();
        pilha53.empilha((java.lang.Object) 1);
        pilha53.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray61 = null;
        pilha53.item = objArray61;
        java.lang.Object[] objArray63 = new java.lang.Object[] { pilha45, pilha53 };
        pilha36.item = objArray63;
        java.lang.Object[] objArray65 = pilha36.item;
        pilha29.item = objArray65;
        pilha16.item = objArray65;
        pilha0.item = objArray65;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + '#' + "'", obj56, '#');
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object obj22 = pilha0.desempilha();
        int int23 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray26 = pilha0.item;
        boolean boolean27 = pilha0.vazia();
        int int28 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        int int27 = pilha4.topo;
        java.lang.Object[] objArray28 = pilha4.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.topo;
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha7.tamanho();
        int int21 = pilha7.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object[] objArray17 = pilha0.item;
        pilha0.empilha((java.lang.Object) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        int int25 = pilha0.tamanho();
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object obj27 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray27 = null;
        pilha19.item = objArray27;
        pilha19.topo = 100;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha19.item = objArray37;
        pilha0.empilha((java.lang.Object) objArray37);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) '#');
        java.lang.Object obj43 = pilha40.desempilha();
        pilha40.empilha((java.lang.Object) 1);
        pilha40.empilha((java.lang.Object) 0L);
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 10;
        java.lang.Object[] objArray53 = pilha48.item;
        java.lang.Object[] objArray54 = pilha48.item;
        pilha40.item = objArray54;
        int int56 = pilha40.tamanho();
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.topo = '4';
        pilha57.topo = 10;
        java.lang.Object[] objArray62 = pilha57.item;
        java.lang.Object obj63 = pilha57.desempilha();
        int int64 = pilha57.topo;
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.topo = '4';
        pilha65.topo = 10;
        java.lang.Object[] objArray70 = pilha65.item;
        pilha57.item = objArray70;
        pilha40.item = objArray70;
        ds.Pilha pilha73 = new ds.Pilha();
        pilha73.topo = '4';
        pilha73.topo = 10;
        java.lang.Object[] objArray78 = pilha73.item;
        java.lang.Object obj79 = pilha73.desempilha();
        int int80 = pilha73.topo;
        ds.Pilha pilha81 = new ds.Pilha();
        java.lang.Object[] objArray82 = pilha81.item;
        pilha73.item = objArray82;
        int int84 = pilha73.tamanho();
        pilha40.empilha((java.lang.Object) int84);
        ds.Pilha pilha86 = new ds.Pilha();
        pilha86.topo = '4';
        pilha86.topo = 10;
        java.lang.Object[] objArray91 = pilha86.item;
        pilha86.topo = (byte) -1;
        pilha40.empilha((java.lang.Object) pilha86);
        pilha0.empilha((java.lang.Object) pilha86);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '#' + "'", obj43, '#');
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 9 + "'", int64 == 9);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        java.lang.Object obj34 = pilha18.desempilha();
        java.lang.Object obj35 = pilha18.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) 0.0d);
        int int40 = pilha36.topo;
        pilha36.topo = 1;
        pilha18.empilha((java.lang.Object) pilha36);
        java.lang.Object obj44 = pilha36.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha45.item = objArray51;
        pilha36.empilha((java.lang.Object) pilha45);
        pilha36.topo = '#';
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.empilha((java.lang.Object) '#');
        java.lang.Object obj59 = pilha56.desempilha();
        pilha56.empilha((java.lang.Object) 1);
        int int62 = pilha56.topo;
        boolean boolean63 = pilha56.vazia();
        ds.Pilha pilha64 = new ds.Pilha();
        pilha64.topo = '4';
        pilha64.topo = 10;
        java.lang.Object[] objArray69 = pilha64.item;
        java.lang.Object obj70 = pilha64.desempilha();
        int int71 = pilha64.topo;
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.topo = '4';
        pilha72.topo = 10;
        java.lang.Object[] objArray77 = pilha72.item;
        pilha64.item = objArray77;
        int int79 = pilha64.topo;
        int int80 = pilha64.topo;
        pilha56.empilha((java.lang.Object) pilha64);
        java.lang.Object[] objArray82 = pilha64.item;
        pilha36.item = objArray82;
        pilha0.empilha((java.lang.Object) pilha36);
        int int85 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + '#' + "'", obj59, '#');
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        pilha0.topo = '4';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) -1;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        boolean boolean17 = pilha12.vazia();
        boolean boolean18 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = 100;
        java.lang.Object[] objArray22 = pilha12.item;
        pilha12.topo = 1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha8.topo = (short) 0;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha0.item = objArray12;
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha7.item = objArray16;
        pilha3.item = objArray16;
        pilha3.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha3);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        int int24 = pilha22.topo;
        pilha22.topo = (short) 100;
        java.lang.Object obj27 = pilha22.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        pilha28.empilha((java.lang.Object) 0L);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        pilha28.item = objArray42;
        boolean boolean44 = pilha28.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object[] objArray59 = pilha53.item;
        pilha45.item = objArray59;
        pilha28.item = objArray59;
        pilha22.item = objArray59;
        pilha3.item = objArray59;
        java.lang.Object[] objArray64 = pilha3.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha17.item = objArray26;
        pilha13.item = objArray26;
        pilha13.topo = (byte) -1;
        int int31 = pilha13.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha32.item = objArray41;
        pilha13.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        int int50 = pilha44.tamanho();
        int int51 = pilha44.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.topo = '4';
        pilha52.topo = 10;
        java.lang.Object[] objArray57 = pilha52.item;
        java.lang.Object obj58 = pilha52.desempilha();
        int int59 = pilha52.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = '4';
        pilha60.topo = 10;
        java.lang.Object[] objArray65 = pilha60.item;
        pilha52.item = objArray65;
        pilha44.item = objArray65;
        pilha13.item = objArray65;
        pilha0.empilha((java.lang.Object) pilha13);
        int int70 = pilha0.tamanho();
        int int71 = pilha0.topo;
        pilha0.topo = (short) 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        int int41 = pilha35.topo;
        int int42 = pilha35.tamanho();
        java.lang.Object obj43 = pilha35.desempilha();
        boolean boolean44 = pilha35.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object[] objArray59 = pilha53.item;
        pilha45.item = objArray59;
        boolean boolean61 = pilha45.vazia();
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.topo = '4';
        pilha70.topo = 10;
        java.lang.Object[] objArray75 = pilha70.item;
        java.lang.Object[] objArray76 = pilha70.item;
        pilha62.item = objArray76;
        pilha45.item = objArray76;
        pilha35.item = objArray76;
        java.lang.Object[] objArray80 = pilha35.item;
        pilha0.item = objArray80;
        int int82 = pilha0.topo;
        boolean boolean83 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 1 + "'", obj43, 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        boolean boolean36 = pilha20.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha37.item = objArray51;
        pilha20.item = objArray51;
        pilha0.item = objArray51;
        java.lang.Object obj55 = pilha0.desempilha();
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.topo = '4';
        pilha56.topo = 10;
        boolean boolean61 = pilha56.vazia();
        pilha56.topo = 100;
        int int64 = pilha56.topo;
        java.lang.Object[] objArray65 = pilha56.item;
        pilha0.item = objArray65;
        boolean boolean67 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        int int18 = pilha0.topo;
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object obj26 = pilha20.desempilha();
        int int27 = pilha20.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        pilha20.item = objArray29;
        pilha0.item = objArray29;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.topo = '4';
        pilha9.topo = 10;
        java.lang.Object[] objArray14 = pilha9.item;
        pilha8.item = objArray14;
        pilha0.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object[] objArray23 = pilha17.item;
        pilha17.topo = 0;
        java.lang.Object[] objArray26 = pilha17.item;
        pilha0.item = objArray26;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Class<?> wildcardClass1 = pilha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        int int4 = pilha2.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) '#');
        java.lang.Object obj8 = pilha5.desempilha();
        java.lang.Object[] objArray9 = pilha5.item;
        pilha2.item = objArray9;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1);
        pilha11.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray19 = null;
        pilha11.item = objArray19;
        java.lang.Object[] objArray21 = pilha11.item;
        int int22 = pilha11.topo;
        java.lang.Object[] objArray23 = pilha11.item;
        int int24 = pilha11.topo;
        pilha2.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray26 = pilha11.item;
        java.lang.Object[] objArray27 = pilha11.item;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) 1);
        pilha28.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray36 = null;
        pilha28.item = objArray36;
        pilha28.topo = 100;
        int int40 = pilha28.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.topo = '4';
        pilha41.topo = 10;
        java.lang.Object[] objArray46 = pilha41.item;
        java.lang.Object obj47 = pilha41.desempilha();
        int int48 = pilha41.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        pilha41.item = objArray54;
        pilha28.item = objArray54;
        pilha11.item = objArray54;
        pilha0.item = objArray54;
        java.lang.Object[] objArray59 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        java.lang.Object[] objArray34 = pilha0.item;
        java.lang.Object[] objArray35 = pilha0.item;
        boolean boolean36 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha0.item = objArray15;
        pilha0.topo = (short) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        int int16 = pilha9.topo;
        int int17 = pilha9.topo;
        int int18 = pilha9.topo;
        boolean boolean19 = pilha9.vazia();
        java.lang.Object[] objArray20 = pilha9.item;
        pilha0.item = objArray20;
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.topo;
        java.lang.Class<?> wildcardClass24 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        int int13 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        pilha0.topo = (byte) 100;
        boolean boolean20 = pilha0.vazia();
        pilha0.topo = 99;
        boolean boolean23 = pilha0.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        int int30 = pilha24.topo;
        pilha24.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        pilha33.empilha((java.lang.Object) 0L);
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray49 = null;
        pilha41.item = objArray49;
        java.lang.Object[] objArray51 = new java.lang.Object[] { pilha33, pilha41 };
        pilha24.item = objArray51;
        java.lang.Object[] objArray53 = pilha24.item;
        int int54 = pilha24.tamanho();
        pilha24.topo = (byte) 1;
        java.lang.Object[] objArray57 = pilha24.item;
        pilha0.item = objArray57;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        pilha4.topo = 99;
        boolean boolean29 = pilha4.vazia();
        java.lang.Class<?> wildcardClass30 = pilha4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) '#');
        java.lang.Object obj39 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 1);
        pilha36.empilha((java.lang.Object) 0L);
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        java.lang.Object[] objArray50 = pilha44.item;
        pilha36.item = objArray50;
        int int52 = pilha36.tamanho();
        pilha36.topo = (short) 100;
        pilha18.empilha((java.lang.Object) (short) 100);
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.topo = '4';
        pilha56.topo = 10;
        java.lang.Object[] objArray61 = pilha56.item;
        int int62 = pilha56.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray64 = pilha63.item;
        pilha56.item = objArray64;
        java.lang.Object obj66 = pilha56.desempilha();
        java.lang.Object[] objArray67 = pilha56.item;
        pilha18.empilha((java.lang.Object) objArray67);
        int int69 = pilha18.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object obj29 = pilha0.desempilha();
        java.lang.Object obj30 = null;
        pilha0.empilha(obj30);
        boolean boolean32 = pilha0.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        java.lang.Object[] objArray35 = pilha33.item;
        pilha0.item = objArray35;
        java.lang.Object[] objArray37 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 0;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        java.lang.Object[] objArray11 = pilha5.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        pilha13.topo = (short) 100;
        java.lang.Object obj18 = pilha13.desempilha();
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        int int36 = pilha20.tamanho();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        java.lang.Object obj43 = pilha37.desempilha();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        pilha37.item = objArray50;
        pilha20.item = objArray50;
        pilha13.item = objArray50;
        ds.Pilha pilha54 = new ds.Pilha();
        java.lang.Object[] objArray55 = pilha54.item;
        int int56 = pilha54.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) '#');
        java.lang.Object obj60 = pilha57.desempilha();
        java.lang.Object[] objArray61 = pilha57.item;
        pilha54.item = objArray61;
        pilha13.item = objArray61;
        pilha0.item = objArray61;
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + '#' + "'", obj60, '#');
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 0.0d);
        int int13 = pilha9.topo;
        java.lang.Object obj14 = pilha9.desempilha();
        int int15 = pilha9.tamanho();
        int int16 = pilha9.topo;
        boolean boolean17 = pilha9.vazia();
        java.lang.Object[] objArray18 = pilha9.item;
        pilha0.empilha((java.lang.Object) pilha9);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        int int17 = pilha13.tamanho();
        int int18 = pilha13.topo;
        java.lang.Object[] objArray19 = pilha13.item;
        java.lang.Object obj20 = null;
        pilha13.empilha(obj20);
        pilha0.empilha(obj20);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        pilha0.item = objArray44;
        pilha0.topo = 10;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        boolean boolean16 = pilha4.vazia();
        boolean boolean17 = pilha4.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = '4';
        pilha22.topo = 10;
        java.lang.Object[] objArray27 = pilha22.item;
        pilha18.item = objArray27;
        pilha4.item = objArray27;
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.topo = '4';
        pilha30.topo = 10;
        java.lang.Object[] objArray35 = pilha30.item;
        int int36 = pilha30.tamanho();
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray38 = pilha37.item;
        pilha30.item = objArray38;
        java.lang.Object obj40 = pilha30.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.topo = '4';
        pilha41.topo = 10;
        boolean boolean46 = pilha41.vazia();
        java.lang.Object[] objArray47 = pilha41.item;
        java.lang.Object[] objArray48 = pilha41.item;
        pilha30.empilha((java.lang.Object) pilha41);
        int int50 = pilha30.topo;
        java.lang.Object[] objArray51 = pilha30.item;
        pilha4.item = objArray51;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 10;
        java.lang.Object[] objArray15 = pilha10.item;
        pilha6.item = objArray15;
        pilha0.item = objArray15;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        int int34 = pilha18.tamanho();
        int int35 = pilha18.tamanho();
        pilha18.topo = 9;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) 1);
        int int44 = pilha38.topo;
        pilha38.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) 1);
        pilha47.empilha((java.lang.Object) 0L);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) '#');
        java.lang.Object obj58 = pilha55.desempilha();
        pilha55.empilha((java.lang.Object) 1);
        pilha55.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray63 = null;
        pilha55.item = objArray63;
        java.lang.Object[] objArray65 = new java.lang.Object[] { pilha47, pilha55 };
        pilha38.item = objArray65;
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        int int69 = pilha67.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.empilha((java.lang.Object) '#');
        java.lang.Object obj73 = pilha70.desempilha();
        java.lang.Object[] objArray74 = pilha70.item;
        pilha67.item = objArray74;
        pilha38.item = objArray74;
        pilha18.item = objArray74;
        pilha0.item = objArray74;
        int int79 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '#' + "'", obj58, '#');
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + '#' + "'", obj73, '#');
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Object obj7 = pilha0.desempilha();
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.topo = '4';
        pilha9.topo = 10;
        boolean boolean14 = pilha9.vazia();
        java.lang.Object[] objArray15 = pilha9.item;
        java.lang.Object[] objArray16 = pilha9.item;
        int int17 = pilha9.topo;
        java.lang.Object obj18 = pilha9.desempilha();
        pilha9.topo = 100;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        boolean boolean26 = pilha21.vazia();
        boolean boolean27 = pilha21.vazia();
        pilha9.empilha((java.lang.Object) pilha21);
        pilha21.topo = 100;
        pilha21.topo = 98;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        int int35 = pilha33.topo;
        pilha33.topo = (short) 100;
        java.lang.Object obj38 = pilha33.desempilha();
        int int39 = pilha33.topo;
        java.lang.Object obj40 = pilha33.desempilha();
        java.lang.Object[] objArray41 = pilha33.item;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object obj48 = pilha42.desempilha();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.topo = '4';
        pilha50.topo = 10;
        java.lang.Object[] objArray55 = pilha50.item;
        pilha42.item = objArray55;
        int int57 = pilha42.topo;
        int int58 = pilha42.topo;
        pilha42.empilha((java.lang.Object) 100.0d);
        java.lang.Object[] objArray61 = pilha42.item;
        int int62 = pilha42.topo;
        java.lang.Object[] objArray63 = pilha42.item;
        pilha33.empilha((java.lang.Object) objArray63);
        pilha21.item = objArray63;
        pilha0.empilha((java.lang.Object) pilha21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 99 + "'", int39 == 99);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        java.lang.Object[] objArray38 = pilha0.item;
        int int39 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.topo;
        java.lang.Object obj12 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha11.topo = (short) 0;
        java.lang.Object[] objArray15 = pilha11.item;
        pilha0.item = objArray15;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        pilha0.topo = 1;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) 1);
        boolean boolean13 = pilha7.vazia();
        java.lang.Object obj14 = pilha7.desempilha();
        int int15 = pilha7.tamanho();
        boolean boolean16 = pilha7.vazia();
        java.lang.Object[] objArray17 = pilha7.item;
        pilha0.item = objArray17;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        boolean boolean30 = pilha24.vazia();
        int int31 = pilha24.topo;
        java.lang.Object obj32 = pilha24.desempilha();
        int int33 = pilha24.topo;
        pilha0.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray35 = pilha24.item;
        boolean boolean36 = pilha24.vazia();
        int int37 = pilha24.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        int int30 = pilha0.tamanho();
        int int31 = pilha0.tamanho();
        boolean boolean32 = pilha0.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        int int39 = pilha33.tamanho();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object obj46 = pilha40.desempilha();
        int int47 = pilha40.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray49 = pilha48.item;
        pilha40.item = objArray49;
        pilha33.item = objArray49;
        pilha0.item = objArray49;
        java.lang.Class<?> wildcardClass53 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) 1);
        int int10 = pilha4.topo;
        pilha4.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        pilha13.empilha((java.lang.Object) 0L);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) '#');
        java.lang.Object obj24 = pilha21.desempilha();
        pilha21.empilha((java.lang.Object) 1);
        pilha21.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray29 = null;
        pilha21.item = objArray29;
        java.lang.Object[] objArray31 = new java.lang.Object[] { pilha13, pilha21 };
        pilha4.item = objArray31;
        java.lang.Object[] objArray33 = pilha4.item;
        pilha0.empilha((java.lang.Object) objArray33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '#' + "'", obj24, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        boolean boolean34 = pilha0.vazia();
        java.lang.Object[] objArray35 = pilha0.item;
        java.lang.Object obj36 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Object[] objArray28 = pilha0.item;
        boolean boolean29 = pilha0.vazia();
        boolean boolean30 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.topo;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        pilha0.empilha((java.lang.Object) 3);
        int int22 = pilha0.topo;
        int int23 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.topo;
        boolean boolean26 = pilha0.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        java.lang.Object[] objArray38 = pilha31.item;
        pilha27.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        int int42 = pilha40.topo;
        pilha40.topo = (short) 100;
        java.lang.Object obj45 = pilha40.desempilha();
        java.lang.Object obj46 = pilha40.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) 1);
        int int53 = pilha47.topo;
        pilha47.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.empilha((java.lang.Object) '#');
        java.lang.Object obj59 = pilha56.desempilha();
        pilha56.empilha((java.lang.Object) 1);
        pilha56.empilha((java.lang.Object) 0L);
        ds.Pilha pilha64 = new ds.Pilha();
        pilha64.empilha((java.lang.Object) '#');
        java.lang.Object obj67 = pilha64.desempilha();
        pilha64.empilha((java.lang.Object) 1);
        pilha64.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray72 = null;
        pilha64.item = objArray72;
        java.lang.Object[] objArray74 = new java.lang.Object[] { pilha56, pilha64 };
        pilha47.item = objArray74;
        java.lang.Object[] objArray76 = pilha47.item;
        pilha40.item = objArray76;
        pilha27.item = objArray76;
        pilha0.item = objArray76;
        java.lang.Class<?> wildcardClass80 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + '#' + "'", obj59, '#');
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + '#' + "'", obj67, '#');
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int24 = pilha9.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        boolean boolean31 = pilha25.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha9.empilha((java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        int int30 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        pilha0.topo = 10;
        boolean boolean35 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        pilha18.topo = '#';
        java.lang.Class<?> wildcardClass38 = pilha18.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        int int39 = pilha0.topo;
        java.lang.Object obj40 = pilha0.desempilha();
        boolean boolean41 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = (short) 0;
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.tamanho();
        java.lang.Object obj21 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        int int19 = pilha12.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        pilha12.item = objArray25;
        int int27 = pilha12.topo;
        int int28 = pilha12.topo;
        pilha12.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Object obj34 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) 1);
        pilha31.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray39 = null;
        pilha31.item = objArray39;
        pilha31.topo = 100;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha31.item = objArray49;
        pilha12.empilha((java.lang.Object) objArray49);
        pilha0.empilha((java.lang.Object) pilha12);
        boolean boolean53 = pilha12.vazia();
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.topo = '4';
        pilha62.topo = 10;
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object[] objArray68 = pilha62.item;
        pilha54.item = objArray68;
        java.lang.Object[] objArray70 = pilha54.item;
        int int71 = pilha54.topo;
        java.lang.Class<?> wildcardClass72 = pilha54.getClass();
        pilha12.empilha((java.lang.Object) pilha54);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        int int16 = pilha9.topo;
        int int17 = pilha9.topo;
        int int18 = pilha9.topo;
        boolean boolean19 = pilha9.vazia();
        java.lang.Object[] objArray20 = pilha9.item;
        pilha0.item = objArray20;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = '4';
        pilha22.topo = 10;
        boolean boolean27 = pilha22.vazia();
        java.lang.Object[] objArray28 = pilha22.item;
        int int29 = pilha22.topo;
        int int30 = pilha22.topo;
        pilha22.topo = (short) 100;
        int int33 = pilha22.topo;
        pilha0.empilha((java.lang.Object) pilha22);
        boolean boolean35 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        int int27 = pilha18.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        int int34 = pilha28.topo;
        boolean boolean35 = pilha28.vazia();
        pilha18.empilha((java.lang.Object) pilha28);
        java.lang.Object obj37 = pilha28.desempilha();
        java.lang.Object[] objArray38 = pilha28.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 0;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha10.item = objArray21;
        pilha0.empilha((java.lang.Object) objArray21);
        int int24 = pilha0.topo;
        java.lang.Object obj25 = pilha0.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        boolean boolean31 = pilha26.vazia();
        java.lang.Object[] objArray32 = pilha26.item;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object obj39 = pilha33.desempilha();
        int int40 = pilha33.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.topo = '4';
        pilha41.topo = 10;
        java.lang.Object[] objArray46 = pilha41.item;
        pilha33.item = objArray46;
        pilha26.item = objArray46;
        pilha26.topo = 'a';
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        pilha51.empilha((java.lang.Object) 0.0d);
        int int55 = pilha51.topo;
        int int56 = pilha51.tamanho();
        java.lang.Object[] objArray57 = pilha51.item;
        pilha26.item = objArray57;
        pilha0.item = objArray57;
        boolean boolean60 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        boolean boolean17 = pilha12.vazia();
        boolean boolean18 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = '4';
        pilha22.topo = 10;
        boolean boolean27 = pilha22.vazia();
        java.lang.Object[] objArray28 = pilha22.item;
        int int29 = pilha22.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray38 = null;
        pilha30.item = objArray38;
        pilha30.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha30.item = objArray48;
        pilha22.item = objArray48;
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) '#');
        java.lang.Object obj54 = pilha51.desempilha();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        boolean boolean60 = pilha55.vazia();
        java.lang.Object[] objArray61 = pilha55.item;
        java.lang.Object[] objArray62 = pilha55.item;
        pilha51.empilha((java.lang.Object) pilha55);
        ds.Pilha pilha64 = new ds.Pilha();
        pilha64.topo = '4';
        pilha64.topo = 10;
        java.lang.Object[] objArray69 = pilha64.item;
        java.lang.Object[] objArray70 = pilha64.item;
        pilha64.topo = 1;
        int int73 = pilha64.topo;
        int int74 = pilha64.tamanho();
        pilha55.empilha((java.lang.Object) int74);
        pilha22.empilha((java.lang.Object) pilha55);
        pilha12.empilha((java.lang.Object) pilha55);
        int int78 = pilha55.tamanho();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '#' + "'", obj54, '#');
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 11 + "'", int78 == 11);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        java.lang.Object obj30 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass31 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        boolean boolean17 = pilha0.vazia();
        java.lang.Object obj18 = null;
        pilha0.empilha(obj18);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        int int25 = pilha0.tamanho();
        int int26 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha20.item = objArray28;
        java.lang.Object obj30 = pilha20.desempilha();
        java.lang.Object[] objArray31 = pilha20.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        pilha0.topo = 1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        int int24 = pilha18.topo;
        pilha18.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray43 = null;
        pilha35.item = objArray43;
        java.lang.Object[] objArray45 = new java.lang.Object[] { pilha27, pilha35 };
        pilha18.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        java.lang.Object[] objArray48 = pilha47.item;
        int int49 = pilha47.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) '#');
        java.lang.Object obj53 = pilha50.desempilha();
        java.lang.Object[] objArray54 = pilha50.item;
        pilha47.item = objArray54;
        pilha18.item = objArray54;
        pilha0.item = objArray54;
        java.lang.Class<?> wildcardClass58 = objArray54.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '#' + "'", obj53, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.topo;
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha6.item = objArray20;
        boolean boolean22 = pilha6.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        pilha23.empilha((java.lang.Object) 0L);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha23.item = objArray37;
        pilha6.item = objArray37;
        pilha0.item = objArray37;
        java.lang.Object[] objArray41 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        int int20 = pilha0.topo;
        java.lang.Object[] objArray21 = pilha0.item;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        boolean boolean33 = pilha28.vazia();
        java.lang.Object[] objArray34 = pilha28.item;
        java.lang.Object[] objArray35 = pilha28.item;
        pilha24.empilha((java.lang.Object) pilha28);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        java.lang.Object[] objArray43 = pilha37.item;
        pilha37.topo = 1;
        int int46 = pilha37.topo;
        int int47 = pilha37.tamanho();
        pilha28.empilha((java.lang.Object) int47);
        pilha28.topo = (byte) 1;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        java.lang.Class<?> wildcardClass53 = pilha51.getClass();
        pilha28.empilha((java.lang.Object) pilha51);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        boolean boolean60 = pilha55.vazia();
        java.lang.Object[] objArray61 = pilha55.item;
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.topo = '4';
        pilha62.topo = 10;
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object obj68 = pilha62.desempilha();
        int int69 = pilha62.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.topo = '4';
        pilha70.topo = 10;
        java.lang.Object[] objArray75 = pilha70.item;
        pilha62.item = objArray75;
        pilha55.item = objArray75;
        java.lang.Object[] objArray78 = pilha55.item;
        pilha28.item = objArray78;
        pilha22.item = objArray78;
        pilha0.item = objArray78;
        int int82 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 100 + "'", int82 == 100);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        pilha0.topo = 10;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        boolean boolean26 = pilha0.vazia();
        boolean boolean27 = pilha0.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        boolean boolean33 = pilha28.vazia();
        java.lang.Object[] objArray34 = pilha28.item;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object obj41 = pilha35.desempilha();
        int int42 = pilha35.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        pilha35.item = objArray48;
        pilha28.item = objArray48;
        pilha28.topo = 'a';
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.tamanho();
        pilha53.empilha((java.lang.Object) 0.0d);
        int int57 = pilha53.topo;
        int int58 = pilha53.tamanho();
        java.lang.Object[] objArray59 = pilha53.item;
        pilha28.item = objArray59;
        int int61 = pilha28.topo;
        boolean boolean62 = pilha28.vazia();
        java.lang.Object[] objArray63 = pilha28.item;
        pilha0.item = objArray63;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = (-1);
        pilha0.topo = 100;
        java.lang.Object[] objArray29 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray18 = null;
        pilha10.item = objArray18;
        pilha10.topo = (byte) 10;
        java.lang.Class<?> wildcardClass22 = pilha10.getClass();
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 10;
        java.lang.Object[] objArray29 = pilha24.item;
        java.lang.Object obj30 = pilha24.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        int int37 = pilha31.tamanho();
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray39 = pilha38.item;
        pilha31.item = objArray39;
        java.lang.Object obj41 = pilha31.desempilha();
        java.lang.Object[] objArray42 = pilha31.item;
        pilha24.item = objArray42;
        pilha0.empilha((java.lang.Object) objArray42);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        int int30 = pilha24.topo;
        boolean boolean31 = pilha24.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) 0.0d);
        int int36 = pilha32.topo;
        java.lang.Object obj37 = pilha32.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 0;
        pilha32.empilha((java.lang.Object) 0);
        pilha32.topo = (byte) 100;
        java.lang.Object obj46 = pilha32.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        java.lang.Object[] objArray51 = pilha47.item;
        pilha32.item = objArray51;
        pilha24.empilha((java.lang.Object) pilha32);
        pilha0.empilha((java.lang.Object) pilha32);
        java.lang.Object[] objArray55 = null;
        pilha32.item = objArray55;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object obj18 = pilha0.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        int int25 = pilha19.topo;
        boolean boolean26 = pilha19.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) 0.0d);
        int int31 = pilha27.topo;
        java.lang.Object obj32 = pilha27.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 0;
        pilha27.empilha((java.lang.Object) 0);
        pilha27.topo = (byte) 100;
        java.lang.Object obj41 = pilha27.desempilha();
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) '#');
        java.lang.Object obj45 = pilha42.desempilha();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha27.item = objArray46;
        pilha19.empilha((java.lang.Object) pilha27);
        pilha27.topo = 99;
        pilha0.empilha((java.lang.Object) pilha27);
        int int52 = pilha27.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '#' + "'", obj45, '#');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 99 + "'", int52 == 99);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 0;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha10.item = objArray21;
        pilha0.empilha((java.lang.Object) objArray21);
        int int24 = pilha0.topo;
        java.lang.Object obj25 = pilha0.desempilha();
        java.lang.Object obj26 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 99;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        int int19 = pilha12.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        pilha12.item = objArray25;
        int int27 = pilha12.topo;
        int int28 = pilha12.topo;
        pilha12.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Object obj34 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) 1);
        pilha31.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray39 = null;
        pilha31.item = objArray39;
        pilha31.topo = 100;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha31.item = objArray49;
        pilha12.empilha((java.lang.Object) objArray49);
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = (short) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        int int51 = pilha45.tamanho();
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray53 = pilha52.item;
        pilha45.item = objArray53;
        java.lang.Object obj55 = pilha45.desempilha();
        java.lang.Object[] objArray56 = pilha45.item;
        pilha38.item = objArray56;
        pilha38.empilha((java.lang.Object) 3);
        int int60 = pilha38.topo;
        boolean boolean61 = pilha38.vazia();
        pilha0.empilha((java.lang.Object) pilha38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        java.lang.Object[] objArray18 = pilha0.item;
        pilha0.topo = (short) 1;
        java.lang.Object[] objArray21 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.topo = 0;
        int int11 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.empilha((java.lang.Object) pilha8);
        int int38 = pilha8.topo;
        pilha8.topo = 12;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        pilha13.topo = (short) 100;
        java.lang.Object obj18 = pilha13.desempilha();
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        java.lang.Object[] objArray49 = pilha20.item;
        pilha13.item = objArray49;
        pilha0.item = objArray49;
        boolean boolean52 = pilha0.vazia();
        java.lang.Object[] objArray53 = pilha0.item;
        java.lang.Object obj54 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        int int20 = pilha14.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha14.item = objArray22;
        java.lang.Object obj24 = pilha14.desempilha();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha7.item = objArray25;
        boolean boolean27 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = (-1);
        pilha0.topo = 100;
        int int29 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) '#');
        java.lang.Object obj4 = pilha1.desempilha();
        pilha1.empilha((java.lang.Object) 1);
        pilha1.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray9 = null;
        pilha1.item = objArray9;
        java.lang.Object[] objArray11 = pilha1.item;
        int int12 = pilha1.topo;
        java.lang.Object[] objArray13 = pilha1.item;
        boolean boolean14 = pilha1.vazia();
        int int15 = pilha1.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        boolean boolean26 = pilha21.vazia();
        java.lang.Object[] objArray27 = pilha21.item;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha17.empilha((java.lang.Object) pilha21);
        pilha21.topo = (-1);
        int int32 = pilha21.topo;
        java.lang.Object[] objArray33 = pilha21.item;
        pilha0.item = objArray33;
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + '#' + "'", obj4, '#');
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        pilha0.topo = (short) 1;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Object obj13 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj20 = pilha0.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        boolean boolean26 = pilha21.vazia();
        int int27 = pilha21.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object obj34 = pilha28.desempilha();
        int int35 = pilha28.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray37 = pilha36.item;
        pilha28.item = objArray37;
        pilha21.item = objArray37;
        pilha0.item = objArray37;
        java.lang.Object[] objArray41 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        boolean boolean26 = pilha0.vazia();
        boolean boolean27 = pilha0.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        java.lang.Object[] objArray32 = pilha28.item;
        int int33 = pilha28.tamanho();
        java.lang.Object[] objArray34 = pilha28.item;
        pilha0.item = objArray34;
        java.lang.Object[] objArray36 = pilha0.item;
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        int int43 = pilha37.tamanho();
        int int44 = pilha37.topo;
        int int45 = pilha37.tamanho();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) '#');
        java.lang.Object obj49 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) 1);
        int int52 = pilha46.topo;
        int int53 = pilha46.tamanho();
        java.lang.Object obj54 = pilha46.desempilha();
        java.lang.Object[] objArray55 = pilha46.item;
        pilha37.item = objArray55;
        pilha0.item = objArray55;
        int int58 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1 + "'", obj54, 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        int int24 = pilha18.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha18.item = objArray26;
        pilha0.item = objArray26;
        pilha0.topo = '4';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        boolean boolean17 = pilha0.vazia();
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha19.item = objArray33;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        int int41 = pilha35.tamanho();
        pilha19.empilha((java.lang.Object) int41);
        int int43 = pilha19.tamanho();
        int int44 = pilha19.topo;
        int int45 = pilha19.topo;
        int int46 = pilha19.tamanho();
        pilha0.empilha((java.lang.Object) int46);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        boolean boolean16 = pilha11.vazia();
        java.lang.Object[] objArray17 = pilha11.item;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        int int20 = pilha0.topo;
        int int21 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        pilha0.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.topo = '4';
        pilha51.topo = 10;
        java.lang.Object[] objArray56 = pilha51.item;
        java.lang.Object[] objArray57 = pilha51.item;
        pilha51.topo = 0;
        int int60 = pilha51.tamanho();
        pilha45.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray62 = pilha45.item;
        boolean boolean63 = pilha45.vazia();
        int int64 = pilha45.topo;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        boolean boolean67 = pilha65.vazia();
        java.lang.Object[] objArray68 = pilha65.item;
        pilha45.empilha((java.lang.Object) pilha65);
        java.lang.Object obj70 = pilha45.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        int int29 = pilha0.tamanho();
        java.lang.Object obj30 = pilha0.desempilha();
        int int31 = pilha0.topo;
        java.lang.Object obj32 = pilha0.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        int int36 = pilha33.tamanho();
        java.lang.Object[] objArray37 = pilha33.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        int int44 = pilha38.tamanho();
        java.lang.Object[] objArray45 = pilha38.item;
        pilha33.item = objArray45;
        pilha0.empilha((java.lang.Object) objArray45);
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray49 = pilha48.item;
        int int50 = pilha48.topo;
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) '#');
        java.lang.Object obj54 = pilha51.desempilha();
        java.lang.Object[] objArray55 = pilha51.item;
        pilha48.item = objArray55;
        int int57 = pilha48.topo;
        java.lang.Object[] objArray58 = pilha48.item;
        pilha0.item = objArray58;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 99 + "'", int31 == 99);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '#' + "'", obj54, '#');
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) '#');
        java.lang.Object obj8 = pilha5.desempilha();
        pilha5.empilha((java.lang.Object) 1);
        java.lang.Object obj11 = pilha5.desempilha();
        boolean boolean12 = pilha5.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        pilha13.empilha((java.lang.Object) 0L);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object[] objArray27 = pilha21.item;
        pilha13.item = objArray27;
        boolean boolean29 = pilha13.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object[] objArray44 = pilha38.item;
        pilha30.item = objArray44;
        pilha13.item = objArray44;
        pilha5.item = objArray44;
        pilha0.item = objArray44;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray28 = null;
        pilha20.item = objArray28;
        pilha20.topo = 100;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        pilha20.item = objArray38;
        pilha0.item = objArray38;
        boolean boolean41 = pilha0.vazia();
        int int42 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.topo = '4';
        pilha19.topo = 10;
        java.lang.Object[] objArray24 = pilha19.item;
        int int25 = pilha19.tamanho();
        java.lang.Object[] objArray26 = pilha19.item;
        pilha12.empilha((java.lang.Object) objArray26);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) '#');
        java.lang.Object obj31 = pilha28.desempilha();
        java.lang.Object[] objArray32 = pilha28.item;
        pilha12.item = objArray32;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.empilha((java.lang.Object) 0.0d);
        int int38 = pilha34.topo;
        java.lang.Object obj39 = pilha34.desempilha();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 0;
        pilha34.empilha((java.lang.Object) 0);
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        int int48 = pilha46.topo;
        pilha46.topo = (short) 100;
        java.lang.Object obj51 = pilha46.desempilha();
        java.lang.Object obj52 = pilha46.desempilha();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) '#');
        java.lang.Object obj56 = pilha53.desempilha();
        pilha53.empilha((java.lang.Object) 1);
        pilha53.empilha((java.lang.Object) 0L);
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.topo = '4';
        pilha61.topo = 10;
        java.lang.Object[] objArray66 = pilha61.item;
        java.lang.Object[] objArray67 = pilha61.item;
        pilha53.item = objArray67;
        int int69 = pilha53.tamanho();
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.topo = '4';
        pilha70.topo = 10;
        java.lang.Object[] objArray75 = pilha70.item;
        java.lang.Object obj76 = pilha70.desempilha();
        int int77 = pilha70.topo;
        ds.Pilha pilha78 = new ds.Pilha();
        pilha78.topo = '4';
        pilha78.topo = 10;
        java.lang.Object[] objArray83 = pilha78.item;
        pilha70.item = objArray83;
        pilha53.item = objArray83;
        pilha46.item = objArray83;
        pilha34.item = objArray83;
        java.lang.Class<?> wildcardClass88 = objArray83.getClass();
        pilha12.empilha((java.lang.Object) wildcardClass88);
        pilha7.empilha((java.lang.Object) wildcardClass88);
        pilha0.empilha((java.lang.Object) pilha7);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '#' + "'", obj31, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + '#' + "'", obj56, '#');
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        java.lang.Object[] objArray18 = pilha0.item;
        int int19 = pilha0.tamanho();
        java.lang.Object obj20 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = '#';
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = (byte) 10;
        int int20 = pilha8.topo;
        pilha8.topo = (byte) 100;
        pilha0.empilha((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        int int3 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray14 = null;
        pilha6.item = objArray14;
        java.lang.Class<?> wildcardClass16 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object[] objArray14 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray14);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha0.item = objArray20;
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        pilha0.topo = (-1);
        pilha0.topo = (short) 10;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        java.lang.Object obj24 = pilha8.desempilha();
        java.lang.Object obj25 = pilha8.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) 0.0d);
        int int30 = pilha26.topo;
        pilha26.topo = 1;
        pilha8.empilha((java.lang.Object) pilha26);
        java.lang.Object[] objArray34 = pilha8.item;
        pilha0.empilha((java.lang.Object) objArray34);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        int int8 = pilha5.topo;
        pilha0.empilha((java.lang.Object) pilha5);
        pilha5.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        java.lang.Object obj38 = pilha0.desempilha();
        java.lang.Object[] objArray39 = pilha0.item;
        pilha0.topo = 2;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        int int10 = pilha0.tamanho();
        pilha0.topo = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        java.lang.Object[] objArray16 = pilha9.item;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray18 = pilha0.item;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        boolean boolean25 = pilha19.vazia();
        int int26 = pilha19.topo;
        int int27 = pilha19.topo;
        int int28 = pilha19.topo;
        boolean boolean29 = pilha19.vazia();
        java.lang.Object[] objArray30 = pilha19.item;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object obj37 = pilha31.desempilha();
        int int38 = pilha31.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        pilha31.item = objArray44;
        int int46 = pilha31.topo;
        int int47 = pilha31.topo;
        pilha31.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) '#');
        java.lang.Object obj53 = pilha50.desempilha();
        pilha50.empilha((java.lang.Object) 1);
        pilha50.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray58 = null;
        pilha50.item = objArray58;
        pilha50.topo = 100;
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.topo = '4';
        pilha62.topo = 10;
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object[] objArray68 = pilha62.item;
        pilha50.item = objArray68;
        pilha31.empilha((java.lang.Object) objArray68);
        pilha19.empilha((java.lang.Object) pilha31);
        boolean boolean72 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) pilha31);
        java.lang.Object obj74 = pilha31.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '#' + "'", obj53, '#');
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj74);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.topo;
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        java.lang.Object obj38 = pilha0.desempilha();
        java.lang.Object[] objArray39 = pilha0.item;
        int int40 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object obj39 = pilha33.desempilha();
        int int40 = pilha33.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha33.item = objArray42;
        int int44 = pilha33.tamanho();
        pilha0.empilha((java.lang.Object) int44);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha46.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha46);
        boolean boolean55 = pilha46.vazia();
        java.lang.Class<?> wildcardClass56 = pilha46.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        int int15 = pilha9.topo;
        int int16 = pilha9.tamanho();
        java.lang.Object obj17 = pilha9.desempilha();
        java.lang.Object[] objArray18 = pilha9.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj29 = pilha20.desempilha();
        int int30 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0d + "'", obj29, 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        boolean boolean36 = pilha20.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha37.item = objArray51;
        pilha20.item = objArray51;
        pilha0.item = objArray51;
        java.lang.Object obj55 = pilha0.desempilha();
        java.lang.Object obj56 = pilha0.desempilha();
        int int57 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        int int30 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        boolean boolean33 = pilha0.vazia();
        pilha0.topo = (short) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        int int39 = pilha0.topo;
        boolean boolean40 = pilha0.vazia();
        boolean boolean41 = pilha0.vazia();
        java.lang.Class<?> wildcardClass42 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha38.item = objArray47;
        pilha0.item = objArray47;
        boolean boolean50 = pilha0.vazia();
        pilha0.topo = (short) 10;
        int int53 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) '#');
        java.lang.Object obj5 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) 1);
        pilha2.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray10 = null;
        pilha2.item = objArray10;
        java.lang.Object[] objArray12 = pilha2.item;
        pilha0.empilha((java.lang.Object) objArray12);
        pilha0.topo = '4';
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        pilha16.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 0;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha26.item = objArray37;
        pilha16.empilha((java.lang.Object) objArray37);
        int int40 = pilha16.topo;
        java.lang.Object obj41 = pilha16.desempilha();
        pilha0.empilha(obj41);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) '#');
        java.lang.Object obj15 = pilha12.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        boolean boolean21 = pilha16.vazia();
        java.lang.Object[] objArray22 = pilha16.item;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha12.empilha((java.lang.Object) pilha16);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha25.topo = 1;
        int int34 = pilha25.topo;
        int int35 = pilha25.tamanho();
        pilha16.empilha((java.lang.Object) int35);
        pilha16.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha16);
        pilha0.topo = 99;
        int int42 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        pilha0.topo = (byte) 100;
        int int14 = pilha0.tamanho();
        int int15 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        int int27 = pilha4.tamanho();
        java.lang.Object obj28 = pilha4.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        int int12 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        int int18 = pilha0.tamanho();
        int int19 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        pilha0.empilha((java.lang.Object) 3);
        pilha0.topo = (short) 1;
        int int24 = pilha0.tamanho();
        int int25 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object obj9 = pilha0.desempilha();
        boolean boolean10 = pilha0.vazia();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.empilha((java.lang.Object) pilha8);
        int int38 = pilha8.topo;
        int int39 = pilha8.tamanho();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        int int31 = pilha25.tamanho();
        int int32 = pilha25.topo;
        int int33 = pilha25.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.topo = '4';
        pilha34.topo = 10;
        boolean boolean39 = pilha34.vazia();
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        int int42 = pilha34.topo;
        java.lang.Class<?> wildcardClass43 = pilha34.getClass();
        pilha25.empilha((java.lang.Object) wildcardClass43);
        pilha0.empilha((java.lang.Object) wildcardClass43);
        int int46 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        java.lang.Object[] objArray16 = pilha9.item;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray18 = pilha0.item;
        int int19 = pilha0.topo;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int19 = pilha0.topo;
        int int20 = pilha0.tamanho();
        java.lang.Object obj21 = pilha0.desempilha();
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        pilha19.empilha((java.lang.Object) 0L);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha19.item = objArray33;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object obj42 = pilha36.desempilha();
        int int43 = pilha36.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha36.item = objArray49;
        pilha19.item = objArray49;
        pilha12.item = objArray49;
        pilha0.item = objArray49;
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        int int58 = pilha54.tamanho();
        int int59 = pilha54.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        int int66 = pilha60.topo;
        boolean boolean67 = pilha60.vazia();
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.topo = '4';
        pilha68.topo = 10;
        java.lang.Object[] objArray73 = pilha68.item;
        java.lang.Object obj74 = pilha68.desempilha();
        int int75 = pilha68.topo;
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.topo = '4';
        pilha76.topo = 10;
        java.lang.Object[] objArray81 = pilha76.item;
        pilha68.item = objArray81;
        int int83 = pilha68.topo;
        int int84 = pilha68.topo;
        pilha60.empilha((java.lang.Object) pilha68);
        java.lang.Object[] objArray86 = pilha68.item;
        pilha54.item = objArray86;
        pilha0.empilha((java.lang.Object) pilha54);
        pilha0.topo = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 9 + "'", int83 == 9);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.topo;
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        pilha0.topo = 10;
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        pilha3.empilha((java.lang.Object) 1);
        pilha3.empilha((java.lang.Object) 0L);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha3.item = objArray17;
        java.lang.Object obj19 = pilha3.desempilha();
        java.lang.Object obj20 = pilha3.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) 0.0d);
        int int25 = pilha21.topo;
        pilha21.topo = 1;
        pilha3.empilha((java.lang.Object) pilha21);
        java.lang.Object obj29 = pilha21.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        pilha30.item = objArray36;
        pilha21.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) '#');
        java.lang.Object obj43 = pilha40.desempilha();
        pilha40.empilha((java.lang.Object) 1);
        boolean boolean46 = pilha40.vazia();
        int int47 = pilha40.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) '#');
        java.lang.Object obj51 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) 1);
        int int54 = pilha48.topo;
        pilha48.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) '#');
        java.lang.Object obj60 = pilha57.desempilha();
        pilha57.empilha((java.lang.Object) 1);
        pilha57.empilha((java.lang.Object) 0L);
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) '#');
        java.lang.Object obj68 = pilha65.desempilha();
        pilha65.empilha((java.lang.Object) 1);
        pilha65.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray73 = null;
        pilha65.item = objArray73;
        java.lang.Object[] objArray75 = new java.lang.Object[] { pilha57, pilha65 };
        pilha48.item = objArray75;
        pilha40.item = objArray75;
        pilha39.item = objArray75;
        pilha21.empilha((java.lang.Object) pilha39);
        pilha0.empilha((java.lang.Object) pilha39);
        boolean boolean81 = pilha0.vazia();
        int int82 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '#' + "'", obj43, '#');
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '#' + "'", obj51, '#');
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + '#' + "'", obj60, '#');
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + '#' + "'", obj68, '#');
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha29.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha42.topo = 1;
        int int51 = pilha42.topo;
        int int52 = pilha42.tamanho();
        pilha33.empilha((java.lang.Object) int52);
        pilha0.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        java.lang.Object[] objArray61 = pilha55.item;
        pilha55.topo = 0;
        java.lang.Object[] objArray64 = pilha55.item;
        pilha0.empilha((java.lang.Object) objArray64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        pilha0.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.topo = '4';
        pilha51.topo = 10;
        java.lang.Object[] objArray56 = pilha51.item;
        java.lang.Object[] objArray57 = pilha51.item;
        pilha51.topo = 0;
        int int60 = pilha51.tamanho();
        pilha45.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray62 = pilha45.item;
        boolean boolean63 = pilha45.vazia();
        java.lang.Object[] objArray64 = pilha45.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        pilha0.topo = 98;
        ds.Pilha pilha17 = new ds.Pilha();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        boolean boolean24 = pilha18.vazia();
        int int25 = pilha18.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        int int32 = pilha26.topo;
        pilha26.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) 1);
        pilha43.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray51 = null;
        pilha43.item = objArray51;
        java.lang.Object[] objArray53 = new java.lang.Object[] { pilha35, pilha43 };
        pilha26.item = objArray53;
        pilha18.item = objArray53;
        pilha17.item = objArray53;
        boolean boolean57 = pilha17.vazia();
        int int58 = pilha17.tamanho();
        java.lang.Object[] objArray59 = pilha17.item;
        pilha0.item = objArray59;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        int int23 = pilha8.topo;
        int int24 = pilha8.topo;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha26 = new ds.Pilha();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray35 = null;
        pilha27.item = objArray35;
        java.lang.Object[] objArray37 = pilha27.item;
        int int38 = pilha27.topo;
        java.lang.Object[] objArray39 = pilha27.item;
        boolean boolean40 = pilha27.vazia();
        int int41 = pilha27.topo;
        pilha26.empilha((java.lang.Object) int41);
        java.lang.Object obj43 = pilha26.desempilha();
        java.lang.Object[] objArray44 = pilha26.item;
        pilha0.item = objArray44;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 2 + "'", obj43, 2);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = '4';
        pilha10.topo = 10;
        java.lang.Object[] objArray15 = pilha10.item;
        pilha6.item = objArray15;
        pilha0.item = objArray15;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        int int34 = pilha18.tamanho();
        int int35 = pilha18.tamanho();
        pilha18.topo = 9;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) '#');
        java.lang.Object obj41 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) 1);
        int int44 = pilha38.topo;
        pilha38.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) 1);
        pilha47.empilha((java.lang.Object) 0L);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) '#');
        java.lang.Object obj58 = pilha55.desempilha();
        pilha55.empilha((java.lang.Object) 1);
        pilha55.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray63 = null;
        pilha55.item = objArray63;
        java.lang.Object[] objArray65 = new java.lang.Object[] { pilha47, pilha55 };
        pilha38.item = objArray65;
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        int int69 = pilha67.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.empilha((java.lang.Object) '#');
        java.lang.Object obj73 = pilha70.desempilha();
        java.lang.Object[] objArray74 = pilha70.item;
        pilha67.item = objArray74;
        pilha38.item = objArray74;
        pilha18.item = objArray74;
        pilha0.item = objArray74;
        java.lang.Object obj79 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '#' + "'", obj58, '#');
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + '#' + "'", obj73, '#');
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + '#' + "'", obj79, '#');
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        pilha13.topo = (short) 100;
        java.lang.Object obj18 = pilha13.desempilha();
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        int int26 = pilha20.topo;
        pilha20.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) '#');
        java.lang.Object obj32 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1);
        pilha29.empilha((java.lang.Object) 0L);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray45 = null;
        pilha37.item = objArray45;
        java.lang.Object[] objArray47 = new java.lang.Object[] { pilha29, pilha37 };
        pilha20.item = objArray47;
        java.lang.Object[] objArray49 = pilha20.item;
        pilha13.item = objArray49;
        pilha0.item = objArray49;
        boolean boolean52 = pilha0.vazia();
        java.lang.Object obj53 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass54 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object obj23 = pilha17.desempilha();
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        pilha17.item = objArray30;
        pilha0.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object obj39 = pilha33.desempilha();
        int int40 = pilha33.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha33.item = objArray42;
        int int44 = pilha33.tamanho();
        pilha0.empilha((java.lang.Object) int44);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha46.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) pilha46);
        boolean boolean55 = pilha46.vazia();
        java.lang.Object obj56 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha46.empilha(obj56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) 0.0d);
        int int33 = pilha29.topo;
        java.lang.Object obj34 = pilha29.desempilha();
        int int35 = pilha29.tamanho();
        int int36 = pilha29.topo;
        pilha0.empilha((java.lang.Object) int36);
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.empilha((java.lang.Object) 0.0d);
        int int42 = pilha38.topo;
        pilha38.topo = 10;
        java.lang.Object[] objArray45 = pilha38.item;
        pilha0.item = objArray45;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        boolean boolean24 = pilha8.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object[] objArray39 = pilha33.item;
        pilha25.item = objArray39;
        pilha8.item = objArray39;
        pilha0.item = objArray39;
        boolean boolean43 = pilha0.vazia();
        pilha0.topo = (short) 100;
        int int46 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        boolean boolean10 = pilha0.vazia();
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray17 = null;
        pilha9.item = objArray17;
        java.lang.Object[] objArray19 = pilha9.item;
        int int20 = pilha9.topo;
        java.lang.Object[] objArray21 = pilha9.item;
        int int22 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj24 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object obj29 = pilha0.desempilha();
        java.lang.Object obj30 = null;
        pilha0.empilha(obj30);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        boolean boolean37 = pilha32.vazia();
        boolean boolean38 = pilha32.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        int int41 = pilha39.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) '#');
        java.lang.Object obj45 = pilha42.desempilha();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha39.item = objArray46;
        pilha32.item = objArray46;
        pilha0.item = objArray46;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '#' + "'", obj45, '#');
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha6.item = objArray20;
        boolean boolean22 = pilha6.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        pilha23.empilha((java.lang.Object) 0L);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha23.item = objArray37;
        pilha6.item = objArray37;
        pilha0.item = objArray37;
        java.lang.Object obj41 = pilha0.desempilha();
        boolean boolean42 = pilha0.vazia();
        boolean boolean43 = pilha0.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha44.topo = (short) 0;
        java.lang.Object[] objArray48 = pilha44.item;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha0.item = objArray49;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        pilha0.item = objArray44;
        int int47 = pilha0.topo;
        java.lang.Object obj48 = pilha0.desempilha();
        int int49 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        pilha0.topo = (byte) 100;
        boolean boolean15 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        int int45 = pilha0.tamanho();
        boolean boolean46 = pilha0.vazia();
        boolean boolean47 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        int int15 = pilha8.tamanho();
        java.lang.Object obj16 = pilha8.desempilha();
        boolean boolean17 = pilha8.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        boolean boolean34 = pilha18.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha35.item = objArray49;
        pilha18.item = objArray49;
        pilha8.item = objArray49;
        java.lang.Object[] objArray53 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray55 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1 + "'", obj16, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha7.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha19.item = objArray28;
        pilha0.item = objArray28;
        java.lang.Class<?> wildcardClass31 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        int int24 = pilha0.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        pilha25.topo = 10;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha0.item = objArray32;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.topo = '4';
        pilha1.topo = 10;
        java.lang.Object[] objArray6 = pilha1.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.topo;
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        pilha4.topo = 99;
        boolean boolean29 = pilha4.vazia();
        boolean boolean30 = pilha4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        boolean boolean4 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        java.lang.Object obj34 = pilha18.desempilha();
        java.lang.Object obj35 = pilha18.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) 0.0d);
        int int40 = pilha36.topo;
        pilha36.topo = 1;
        pilha18.empilha((java.lang.Object) pilha36);
        int int44 = pilha18.tamanho();
        pilha0.empilha((java.lang.Object) pilha18);
        pilha18.topo = 52;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) '#');
        java.lang.Object obj51 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) 1);
        pilha48.empilha((java.lang.Object) 0L);
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.topo = '4';
        pilha56.topo = 10;
        java.lang.Object[] objArray61 = pilha56.item;
        java.lang.Object[] objArray62 = pilha56.item;
        pilha48.item = objArray62;
        java.lang.Object obj64 = pilha48.desempilha();
        java.lang.Object obj65 = pilha48.desempilha();
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.tamanho();
        pilha66.empilha((java.lang.Object) 0.0d);
        int int70 = pilha66.topo;
        pilha66.topo = 1;
        pilha48.empilha((java.lang.Object) pilha66);
        java.lang.Object obj74 = pilha66.desempilha();
        ds.Pilha pilha75 = new ds.Pilha();
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.topo = '4';
        pilha76.topo = 10;
        java.lang.Object[] objArray81 = pilha76.item;
        pilha75.item = objArray81;
        pilha66.empilha((java.lang.Object) pilha75);
        ds.Pilha pilha84 = new ds.Pilha();
        pilha84.topo = '4';
        java.lang.Object[] objArray87 = pilha84.item;
        pilha75.item = objArray87;
        pilha18.item = objArray87;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '#' + "'", obj51, '#');
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 0.0d + "'", obj74, 0.0d);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray87);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        int int25 = pilha4.tamanho();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        int int29 = pilha26.tamanho();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha4.item = objArray30;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) 0.0d);
        int int36 = pilha32.topo;
        boolean boolean37 = pilha32.vazia();
        int int38 = pilha32.topo;
        java.lang.Object obj39 = pilha32.desempilha();
        boolean boolean40 = pilha32.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        int int47 = pilha41.topo;
        java.lang.Object[] objArray48 = pilha41.item;
        int int49 = pilha41.tamanho();
        boolean boolean50 = pilha41.vazia();
        int int51 = pilha41.tamanho();
        java.lang.Object[] objArray52 = pilha41.item;
        pilha32.item = objArray52;
        pilha4.empilha((java.lang.Object) pilha32);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        pilha0.item = objArray44;
        boolean boolean47 = pilha0.vazia();
        pilha0.topo = '4';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        int int15 = pilha9.topo;
        pilha9.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray34 = null;
        pilha26.item = objArray34;
        java.lang.Object[] objArray36 = new java.lang.Object[] { pilha18, pilha26 };
        pilha9.item = objArray36;
        java.lang.Object[] objArray38 = pilha9.item;
        int int39 = pilha9.tamanho();
        pilha9.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) (byte) 1);
        boolean boolean43 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        int int12 = pilha6.topo;
        pilha6.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        pilha15.empilha((java.lang.Object) 1);
        pilha15.empilha((java.lang.Object) 0L);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        pilha23.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray31 = null;
        pilha23.item = objArray31;
        java.lang.Object[] objArray33 = new java.lang.Object[] { pilha15, pilha23 };
        pilha6.item = objArray33;
        java.lang.Object[] objArray35 = pilha6.item;
        int int36 = pilha6.tamanho();
        pilha6.topo = (byte) 1;
        java.lang.Object[] objArray39 = pilha6.item;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray28 = null;
        pilha20.item = objArray28;
        pilha20.topo = 100;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        pilha20.item = objArray38;
        pilha0.item = objArray38;
        boolean boolean41 = pilha0.vazia();
        int int42 = pilha0.topo;
        java.lang.Object[] objArray43 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 99 + "'", int42 == 99);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) '#');
        java.lang.Object obj8 = pilha5.desempilha();
        pilha5.empilha((java.lang.Object) 1);
        pilha5.empilha((java.lang.Object) 0L);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha5.item = objArray19;
        boolean boolean21 = pilha5.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 1);
        pilha22.empilha((java.lang.Object) 0L);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.topo = '4';
        pilha30.topo = 10;
        java.lang.Object[] objArray35 = pilha30.item;
        java.lang.Object[] objArray36 = pilha30.item;
        pilha22.item = objArray36;
        pilha5.item = objArray36;
        int int39 = pilha5.topo;
        int int40 = pilha5.topo;
        java.lang.Object[] objArray41 = pilha5.item;
        pilha0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        int int27 = pilha18.topo;
        pilha18.topo = (byte) 1;
        java.lang.Object obj30 = pilha18.desempilha();
        int int31 = pilha18.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.empilha((java.lang.Object) 0.0d);
        int int9 = pilha5.topo;
        pilha5.topo = 10;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        int int14 = pilha12.topo;
        pilha12.topo = (short) 100;
        java.lang.Object obj17 = pilha12.desempilha();
        int int18 = pilha12.topo;
        java.lang.Object obj19 = pilha12.desempilha();
        pilha5.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        pilha0.topo = 10;
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        int int9 = pilha7.topo;
        pilha7.topo = (short) 100;
        java.lang.Object obj12 = pilha7.desempilha();
        int int13 = pilha7.topo;
        java.lang.Object obj14 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) '#');
        java.lang.Object obj19 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) 1);
        boolean boolean22 = pilha16.vazia();
        int int23 = pilha16.topo;
        int int24 = pilha16.topo;
        int int25 = pilha16.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        int int29 = pilha26.tamanho();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha16.item = objArray30;
        pilha7.empilha((java.lang.Object) objArray30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '#' + "'", obj19, '#');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha17.item = objArray26;
        pilha13.item = objArray26;
        pilha13.topo = (byte) -1;
        int int31 = pilha13.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha32.item = objArray41;
        pilha13.item = objArray41;
        pilha0.item = objArray41;
        boolean boolean45 = pilha0.vazia();
        int int46 = pilha0.tamanho();
        java.lang.Object obj47 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        int int24 = pilha0.tamanho();
        java.lang.Object obj25 = pilha0.desempilha();
        int int26 = pilha0.tamanho();
        boolean boolean27 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10 + "'", obj25, 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        int int20 = pilha0.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        boolean boolean26 = pilha21.vazia();
        java.lang.Object[] objArray27 = pilha21.item;
        java.lang.Object[] objArray28 = pilha21.item;
        int int29 = pilha21.topo;
        java.lang.Object obj30 = pilha21.desempilha();
        pilha21.topo = 100;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        boolean boolean39 = pilha33.vazia();
        pilha21.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        int int75 = pilha41.topo;
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.topo = '4';
        pilha76.topo = '#';
        java.lang.Object[] objArray81 = pilha76.item;
        pilha41.item = objArray81;
        pilha21.item = objArray81;
        pilha0.item = objArray81;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object[] objArray39 = null;
        pilha0.item = objArray39;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.empilha((java.lang.Object) 0.0d);
        int int45 = pilha41.topo;
        java.lang.Object obj46 = pilha41.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = '4';
        pilha47.topo = 0;
        pilha41.empilha((java.lang.Object) 0);
        ds.Pilha pilha53 = new ds.Pilha();
        java.lang.Object[] objArray54 = pilha53.item;
        int int55 = pilha53.topo;
        pilha53.topo = (short) 100;
        java.lang.Object obj58 = pilha53.desempilha();
        java.lang.Object obj59 = pilha53.desempilha();
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        pilha60.empilha((java.lang.Object) 0L);
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.topo = '4';
        pilha68.topo = 10;
        java.lang.Object[] objArray73 = pilha68.item;
        java.lang.Object[] objArray74 = pilha68.item;
        pilha60.item = objArray74;
        int int76 = pilha60.tamanho();
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.topo = '4';
        pilha77.topo = 10;
        java.lang.Object[] objArray82 = pilha77.item;
        java.lang.Object obj83 = pilha77.desempilha();
        int int84 = pilha77.topo;
        ds.Pilha pilha85 = new ds.Pilha();
        pilha85.topo = '4';
        pilha85.topo = 10;
        java.lang.Object[] objArray90 = pilha85.item;
        pilha77.item = objArray90;
        pilha60.item = objArray90;
        pilha53.item = objArray90;
        pilha41.item = objArray90;
        pilha0.item = objArray90;
        java.lang.Object[] objArray96 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) '#');
        java.lang.Object obj15 = pilha12.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        boolean boolean21 = pilha16.vazia();
        java.lang.Object[] objArray22 = pilha16.item;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha12.empilha((java.lang.Object) pilha16);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha25.topo = 1;
        int int34 = pilha25.topo;
        int int35 = pilha25.tamanho();
        pilha16.empilha((java.lang.Object) int35);
        pilha16.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha16);
        pilha0.topo = 99;
        pilha0.topo = (byte) 1;
        pilha0.topo = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        int int5 = pilha3.topo;
        pilha3.topo = (short) 100;
        java.lang.Object obj8 = pilha3.desempilha();
        java.lang.Object obj9 = pilha3.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        int int26 = pilha10.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object obj33 = pilha27.desempilha();
        int int34 = pilha27.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        pilha27.item = objArray40;
        pilha10.item = objArray40;
        pilha3.item = objArray40;
        pilha0.item = objArray40;
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.topo = (short) 1;
        pilha0.topo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) '#');
        java.lang.Object obj5 = pilha2.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 10;
        boolean boolean11 = pilha6.vazia();
        java.lang.Object[] objArray12 = pilha6.item;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha2.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        pilha15.topo = 1;
        int int24 = pilha15.topo;
        int int25 = pilha15.tamanho();
        pilha6.empilha((java.lang.Object) int25);
        pilha6.topo = (byte) 1;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        java.lang.Class<?> wildcardClass31 = pilha29.getClass();
        pilha6.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.topo = '4';
        pilha40.topo = 10;
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object obj46 = pilha40.desempilha();
        int int47 = pilha40.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = '4';
        pilha48.topo = 10;
        java.lang.Object[] objArray53 = pilha48.item;
        pilha40.item = objArray53;
        pilha33.item = objArray53;
        java.lang.Object[] objArray56 = pilha33.item;
        pilha6.item = objArray56;
        pilha0.item = objArray56;
        int int59 = pilha0.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        pilha60.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray68 = null;
        pilha60.item = objArray68;
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.tamanho();
        pilha70.empilha((java.lang.Object) 0.0d);
        int int74 = pilha70.topo;
        int int75 = pilha70.tamanho();
        java.lang.Object[] objArray76 = pilha70.item;
        pilha60.item = objArray76;
        pilha60.topo = (byte) -1;
        java.lang.Object[] objArray80 = pilha60.item;
        pilha0.empilha((java.lang.Object) objArray80);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '#' + "'", obj5, '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        int int22 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int22);
        java.lang.Object[] objArray24 = pilha0.item;
        java.lang.Class<?> wildcardClass25 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        pilha0.topo = (byte) 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        int int42 = pilha36.tamanho();
        pilha20.empilha((java.lang.Object) int42);
        int int44 = pilha20.tamanho();
        java.lang.Object obj45 = pilha20.desempilha();
        pilha0.empilha(obj45);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha0.empilha((java.lang.Object) pilha47);
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray53 = pilha52.item;
        int int54 = pilha52.topo;
        pilha52.topo = (short) 100;
        java.lang.Object obj57 = pilha52.desempilha();
        boolean boolean58 = pilha52.vazia();
        int int59 = pilha52.tamanho();
        int int60 = pilha52.tamanho();
        int int61 = pilha52.tamanho();
        int int62 = pilha52.tamanho();
        pilha47.empilha((java.lang.Object) pilha52);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 10 + "'", obj45, 10);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 99 + "'", int59 == 99);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 99 + "'", int60 == 99);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 99 + "'", int61 == 99);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 99 + "'", int62 == 99);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        pilha0.topo = 99;
        int int32 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 99 + "'", int32 == 99);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = pilha0.item;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) 0.0d);
        int int21 = pilha17.topo;
        java.lang.Object obj22 = pilha17.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 0;
        pilha17.empilha((java.lang.Object) 0);
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        pilha29.topo = (short) 100;
        java.lang.Object obj34 = pilha29.desempilha();
        java.lang.Object obj35 = pilha29.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) '#');
        java.lang.Object obj39 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 1);
        pilha36.empilha((java.lang.Object) 0L);
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.topo = '4';
        pilha44.topo = 10;
        java.lang.Object[] objArray49 = pilha44.item;
        java.lang.Object[] objArray50 = pilha44.item;
        pilha36.item = objArray50;
        int int52 = pilha36.tamanho();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        java.lang.Object obj59 = pilha53.desempilha();
        int int60 = pilha53.topo;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.topo = '4';
        pilha61.topo = 10;
        java.lang.Object[] objArray66 = pilha61.item;
        pilha53.item = objArray66;
        pilha36.item = objArray66;
        pilha29.item = objArray66;
        pilha17.item = objArray66;
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) '#');
        java.lang.Object obj74 = pilha71.desempilha();
        pilha71.empilha((java.lang.Object) 1);
        int int77 = pilha71.topo;
        int int78 = pilha71.tamanho();
        java.lang.Object obj79 = pilha71.desempilha();
        java.lang.Object[] objArray80 = pilha71.item;
        pilha17.item = objArray80;
        pilha0.empilha((java.lang.Object) pilha17);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + '#' + "'", obj74, '#');
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 1 + "'", obj79, 1);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        pilha0.topo = 10;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        int int16 = pilha9.topo;
        pilha9.topo = (byte) 1;
        int int19 = pilha9.tamanho();
        pilha9.topo = '4';
        pilha0.empilha((java.lang.Object) pilha9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha0.item = objArray8;
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        boolean boolean16 = pilha11.vazia();
        java.lang.Object[] objArray17 = pilha11.item;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        boolean boolean20 = pilha11.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha18.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        pilha27.item = objArray33;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        boolean boolean43 = pilha37.vazia();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        int int51 = pilha45.topo;
        pilha45.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) '#');
        java.lang.Object obj65 = pilha62.desempilha();
        pilha62.empilha((java.lang.Object) 1);
        pilha62.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray70 = null;
        pilha62.item = objArray70;
        java.lang.Object[] objArray72 = new java.lang.Object[] { pilha54, pilha62 };
        pilha45.item = objArray72;
        pilha37.item = objArray72;
        pilha36.item = objArray72;
        pilha18.empilha((java.lang.Object) pilha36);
        pilha18.topo = (-1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '#' + "'", obj65, '#');
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha7.item = objArray15;
        java.lang.Object obj17 = pilha7.desempilha();
        java.lang.Object[] objArray18 = pilha7.item;
        pilha0.item = objArray18;
        pilha0.empilha((java.lang.Object) 3);
        int int22 = pilha0.topo;
        java.lang.Object[] objArray23 = pilha0.item;
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        int int26 = pilha24.topo;
        pilha24.topo = (short) 100;
        java.lang.Object obj29 = pilha24.desempilha();
        int int30 = pilha24.topo;
        pilha24.topo = (byte) 10;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        int int36 = pilha33.tamanho();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha24.item = objArray37;
        pilha0.item = objArray37;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        int int42 = pilha40.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) '#');
        java.lang.Object obj46 = pilha43.desempilha();
        java.lang.Object[] objArray47 = pilha43.item;
        pilha40.item = objArray47;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        pilha49.empilha((java.lang.Object) 1);
        pilha49.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray57 = null;
        pilha49.item = objArray57;
        java.lang.Object[] objArray59 = pilha49.item;
        int int60 = pilha49.topo;
        java.lang.Object[] objArray61 = pilha49.item;
        int int62 = pilha49.topo;
        pilha40.empilha((java.lang.Object) pilha49);
        java.lang.Object obj64 = pilha40.desempilha();
        java.lang.Object[] objArray65 = pilha40.item;
        pilha0.empilha((java.lang.Object) pilha40);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 99 + "'", int30 == 99);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertNull(objArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        java.lang.Object[] objArray16 = pilha4.item;
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha4.empilha(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha8.item = objArray22;
        boolean boolean24 = pilha8.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object[] objArray39 = pilha33.item;
        pilha25.item = objArray39;
        pilha8.item = objArray39;
        pilha0.item = objArray39;
        boolean boolean43 = pilha0.vazia();
        java.lang.Class<?> wildcardClass44 = pilha0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray26 = pilha0.item;
        int int27 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha13.topo = 1;
        int int22 = pilha13.topo;
        int int23 = pilha13.tamanho();
        pilha4.empilha((java.lang.Object) int23);
        pilha4.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Class<?> wildcardClass29 = pilha27.getClass();
        pilha4.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        boolean boolean36 = pilha31.vazia();
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.topo = '4';
        pilha46.topo = 10;
        java.lang.Object[] objArray51 = pilha46.item;
        pilha38.item = objArray51;
        pilha31.item = objArray51;
        java.lang.Object[] objArray54 = pilha31.item;
        pilha4.item = objArray54;
        boolean boolean56 = pilha4.vazia();
        java.lang.Object[] objArray57 = pilha4.item;
        int int58 = pilha4.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.topo = '4';
        pilha49.topo = 10;
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha41.item = objArray55;
        boolean boolean57 = pilha41.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        pilha41.item = objArray72;
        pilha33.item = objArray72;
        pilha0.item = objArray72;
        pilha0.empilha((java.lang.Object) 100.0d);
        int int79 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 98 + "'", int79 == 98);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object obj19 = pilha13.desempilha();
        int int20 = pilha13.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha13.item = objArray26;
        pilha0.item = objArray26;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Object obj34 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) 1);
        boolean boolean37 = pilha31.vazia();
        int int38 = pilha31.topo;
        java.lang.Object obj39 = pilha31.desempilha();
        int int40 = pilha31.topo;
        java.lang.Object[] objArray41 = pilha31.item;
        int int42 = pilha31.topo;
        pilha0.empilha((java.lang.Object) int42);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '#' + "'", obj34, '#');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        int int10 = pilha0.tamanho();
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        int int12 = pilha0.topo;
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (-1);
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha16.topo = 1;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        boolean boolean30 = pilha25.vazia();
        int int31 = pilha25.topo;
        pilha16.empilha((java.lang.Object) int31);
        pilha16.topo = 100;
        ds.Pilha pilha35 = new ds.Pilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha35.item = objArray41;
        pilha16.item = objArray41;
        pilha4.item = objArray41;
        pilha4.topo = 9;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha38.item = objArray47;
        pilha0.item = objArray47;
        int int50 = pilha0.topo;
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.topo = '4';
        pilha51.topo = 10;
        java.lang.Object[] objArray56 = pilha51.item;
        int int57 = pilha51.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray59 = pilha58.item;
        pilha51.item = objArray59;
        java.lang.Object obj61 = pilha51.desempilha();
        int int62 = pilha51.tamanho();
        pilha0.empilha((java.lang.Object) pilha51);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        pilha0.topo = (byte) 100;
        boolean boolean20 = pilha0.vazia();
        pilha0.topo = 99;
        pilha0.topo = 99;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object[] objArray39 = pilha33.item;
        pilha25.item = objArray39;
        java.lang.Object obj41 = null;
        pilha25.empilha(obj41);
        pilha0.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) '#');
        java.lang.Object obj47 = pilha44.desempilha();
        int int48 = pilha44.tamanho();
        int int49 = pilha44.topo;
        java.lang.Object[] objArray50 = pilha44.item;
        pilha0.item = objArray50;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '#' + "'", obj47, '#');
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        pilha0.topo = 3;
        pilha0.topo = ' ';
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 35;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha0.item = objArray15;
        java.lang.Object[] objArray17 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        boolean boolean36 = pilha20.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        pilha37.empilha((java.lang.Object) 0L);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = '4';
        pilha45.topo = 10;
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha37.item = objArray51;
        pilha20.item = objArray51;
        pilha0.item = objArray51;
        int int55 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 99 + "'", int55 == 99);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) '#');
        java.lang.Object obj6 = pilha3.desempilha();
        pilha3.empilha((java.lang.Object) 1);
        pilha3.empilha((java.lang.Object) 0L);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = '4';
        pilha11.topo = 10;
        java.lang.Object[] objArray16 = pilha11.item;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha3.item = objArray17;
        java.lang.Object obj19 = pilha3.desempilha();
        java.lang.Object obj20 = pilha3.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) 0.0d);
        int int25 = pilha21.topo;
        pilha21.topo = 1;
        pilha3.empilha((java.lang.Object) pilha21);
        java.lang.Object obj29 = pilha21.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        pilha30.item = objArray36;
        pilha21.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) '#');
        java.lang.Object obj43 = pilha40.desempilha();
        pilha40.empilha((java.lang.Object) 1);
        boolean boolean46 = pilha40.vazia();
        int int47 = pilha40.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) '#');
        java.lang.Object obj51 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) 1);
        int int54 = pilha48.topo;
        pilha48.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) '#');
        java.lang.Object obj60 = pilha57.desempilha();
        pilha57.empilha((java.lang.Object) 1);
        pilha57.empilha((java.lang.Object) 0L);
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) '#');
        java.lang.Object obj68 = pilha65.desempilha();
        pilha65.empilha((java.lang.Object) 1);
        pilha65.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray73 = null;
        pilha65.item = objArray73;
        java.lang.Object[] objArray75 = new java.lang.Object[] { pilha57, pilha65 };
        pilha48.item = objArray75;
        pilha40.item = objArray75;
        pilha39.item = objArray75;
        pilha21.empilha((java.lang.Object) pilha39);
        pilha0.empilha((java.lang.Object) pilha39);
        java.lang.Object[] objArray81 = pilha0.item;
        int int82 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '#' + "'", obj43, '#');
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '#' + "'", obj51, '#');
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + '#' + "'", obj60, '#');
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + '#' + "'", obj68, '#');
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        pilha0.topo = (byte) 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        int int42 = pilha36.tamanho();
        pilha20.empilha((java.lang.Object) int42);
        int int44 = pilha20.tamanho();
        java.lang.Object obj45 = pilha20.desempilha();
        pilha0.empilha(obj45);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) '#');
        java.lang.Object obj50 = pilha47.desempilha();
        pilha0.empilha((java.lang.Object) pilha47);
        boolean boolean52 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 10 + "'", obj45, 10);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '#' + "'", obj50, '#');
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = pilha0.desempilha();
        pilha0.topo = 52;
        int int20 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        boolean boolean17 = pilha12.vazia();
        boolean boolean18 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = '4';
        pilha22.topo = 10;
        boolean boolean27 = pilha22.vazia();
        java.lang.Object[] objArray28 = pilha22.item;
        int int29 = pilha22.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray38 = null;
        pilha30.item = objArray38;
        pilha30.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.topo = '4';
        pilha42.topo = 10;
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha30.item = objArray48;
        pilha22.item = objArray48;
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) '#');
        java.lang.Object obj54 = pilha51.desempilha();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        boolean boolean60 = pilha55.vazia();
        java.lang.Object[] objArray61 = pilha55.item;
        java.lang.Object[] objArray62 = pilha55.item;
        pilha51.empilha((java.lang.Object) pilha55);
        ds.Pilha pilha64 = new ds.Pilha();
        pilha64.topo = '4';
        pilha64.topo = 10;
        java.lang.Object[] objArray69 = pilha64.item;
        java.lang.Object[] objArray70 = pilha64.item;
        pilha64.topo = 1;
        int int73 = pilha64.topo;
        int int74 = pilha64.tamanho();
        pilha55.empilha((java.lang.Object) int74);
        pilha22.empilha((java.lang.Object) pilha55);
        pilha12.empilha((java.lang.Object) pilha55);
        java.lang.Class<?> wildcardClass78 = pilha55.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '#' + "'", obj54, '#');
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) -1;
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        boolean boolean23 = pilha18.vazia();
        java.lang.Object[] objArray24 = pilha18.item;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object obj31 = pilha25.desempilha();
        int int32 = pilha25.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = '4';
        pilha33.topo = 10;
        java.lang.Object[] objArray38 = pilha33.item;
        pilha25.item = objArray38;
        pilha18.item = objArray38;
        pilha18.topo = 'a';
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.tamanho();
        pilha43.empilha((java.lang.Object) 0.0d);
        int int47 = pilha43.topo;
        int int48 = pilha43.tamanho();
        java.lang.Object[] objArray49 = pilha43.item;
        pilha18.item = objArray49;
        int int51 = pilha18.topo;
        java.lang.Object[] objArray52 = pilha18.item;
        pilha0.item = objArray52;
        boolean boolean54 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        java.lang.Object[] objArray10 = pilha5.item;
        java.lang.Object obj11 = pilha5.desempilha();
        int int12 = pilha5.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 10;
        java.lang.Object[] objArray18 = pilha13.item;
        pilha5.item = objArray18;
        pilha0.item = objArray18;
        boolean boolean21 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        int int13 = pilha10.tamanho();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha29.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object[] objArray39 = null;
        pilha0.item = objArray39;
        int int41 = pilha0.tamanho();
        boolean boolean42 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        pilha0.topo = (short) 0;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        pilha5.topo = 10;
        boolean boolean10 = pilha5.vazia();
        java.lang.Object[] objArray11 = pilha5.item;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.topo = '4';
        pilha12.topo = 10;
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        int int19 = pilha12.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        pilha12.item = objArray25;
        pilha5.item = objArray25;
        pilha5.topo = 'a';
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) 0.0d);
        int int34 = pilha30.topo;
        int int35 = pilha30.tamanho();
        java.lang.Object[] objArray36 = pilha30.item;
        pilha5.item = objArray36;
        int int38 = pilha5.topo;
        java.lang.Object[] objArray39 = pilha5.item;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.topo;
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 3;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        int int23 = pilha8.topo;
        int int24 = pilha8.topo;
        pilha0.empilha((java.lang.Object) pilha8);
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        boolean boolean15 = pilha4.vazia();
        int int16 = pilha4.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        pilha17.topo = (byte) 10;
        int int29 = pilha17.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        pilha34.item = objArray43;
        pilha30.item = objArray43;
        pilha30.topo = (byte) -1;
        int int48 = pilha30.tamanho();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        pilha49.item = objArray58;
        pilha30.item = objArray58;
        pilha17.item = objArray58;
        pilha4.item = objArray58;
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) '#');
        java.lang.Object obj66 = pilha63.desempilha();
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.topo = '4';
        pilha67.topo = 10;
        boolean boolean72 = pilha67.vazia();
        java.lang.Object[] objArray73 = pilha67.item;
        java.lang.Object[] objArray74 = pilha67.item;
        pilha63.empilha((java.lang.Object) pilha67);
        pilha67.topo = (-1);
        int int78 = pilha67.topo;
        java.lang.Object[] objArray79 = pilha67.item;
        pilha67.topo = 97;
        // The following exception was thrown during execution in test generation
        try {
            pilha4.empilha((java.lang.Object) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        pilha0.topo = 9;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.topo = '4';
        pilha4.topo = 10;
        boolean boolean9 = pilha4.vazia();
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = (-1);
        boolean boolean15 = pilha4.vazia();
        int int16 = pilha4.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        pilha17.topo = (byte) 10;
        int int29 = pilha17.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        pilha34.item = objArray43;
        pilha30.item = objArray43;
        pilha30.topo = (byte) -1;
        int int48 = pilha30.tamanho();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.topo = '4';
        pilha53.topo = 10;
        java.lang.Object[] objArray58 = pilha53.item;
        pilha49.item = objArray58;
        pilha30.item = objArray58;
        pilha17.item = objArray58;
        pilha4.item = objArray58;
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) '#');
        java.lang.Object obj66 = pilha63.desempilha();
        java.lang.Object[] objArray67 = pilha63.item;
        pilha4.item = objArray67;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        pilha6.empilha((java.lang.Object) 0L);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 10;
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha6.item = objArray20;
        boolean boolean22 = pilha6.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) 1);
        pilha23.empilha((java.lang.Object) 0L);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha23.item = objArray37;
        pilha6.item = objArray37;
        pilha0.item = objArray37;
        boolean boolean41 = pilha0.vazia();
        boolean boolean42 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 0.0d);
        int int13 = pilha9.topo;
        boolean boolean14 = pilha9.vazia();
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object[] objArray9 = pilha0.item;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        java.lang.Object obj35 = pilha0.desempilha();
        boolean boolean36 = pilha0.vazia();
        int int37 = pilha0.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        pilha9.empilha((java.lang.Object) 0L);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray25 = null;
        pilha17.item = objArray25;
        java.lang.Object[] objArray27 = new java.lang.Object[] { pilha9, pilha17 };
        pilha0.item = objArray27;
        java.lang.Object[] objArray29 = pilha0.item;
        boolean boolean30 = pilha0.vazia();
        int int31 = pilha0.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        pilha32.topo = 1;
        int int41 = pilha32.topo;
        int int42 = pilha32.tamanho();
        boolean boolean43 = pilha32.vazia();
        java.lang.Class<?> wildcardClass44 = pilha32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) '#');
        java.lang.Object obj23 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) 1);
        pilha20.empilha((java.lang.Object) 0L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.topo = '4';
        pilha28.topo = 10;
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha20.item = objArray34;
        java.lang.Object obj36 = pilha20.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) '#');
        java.lang.Object obj40 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) 1);
        int int43 = pilha37.topo;
        pilha37.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) '#');
        java.lang.Object obj49 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) 1);
        pilha46.empilha((java.lang.Object) 0L);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) '#');
        java.lang.Object obj57 = pilha54.desempilha();
        pilha54.empilha((java.lang.Object) 1);
        pilha54.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray62 = null;
        pilha54.item = objArray62;
        java.lang.Object[] objArray64 = new java.lang.Object[] { pilha46, pilha54 };
        pilha37.item = objArray64;
        pilha20.item = objArray64;
        pilha7.empilha((java.lang.Object) objArray64);
        boolean boolean68 = pilha7.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '#' + "'", obj23, '#');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '#' + "'", obj40, '#');
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + '#' + "'", obj57, '#');
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object obj14 = pilha8.desempilha();
        int int15 = pilha8.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        java.lang.Object[] objArray21 = pilha16.item;
        pilha8.item = objArray21;
        pilha0.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        boolean boolean30 = pilha24.vazia();
        int int31 = pilha24.topo;
        java.lang.Object obj32 = pilha24.desempilha();
        int int33 = pilha24.topo;
        pilha0.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray35 = pilha24.item;
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) '#');
        java.lang.Object obj39 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 1);
        int int42 = pilha36.topo;
        int int43 = pilha36.tamanho();
        java.lang.Object obj44 = pilha36.desempilha();
        boolean boolean45 = pilha36.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) '#');
        java.lang.Object obj49 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) 1);
        pilha46.empilha((java.lang.Object) 0L);
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.topo = '4';
        pilha54.topo = 10;
        java.lang.Object[] objArray59 = pilha54.item;
        java.lang.Object[] objArray60 = pilha54.item;
        pilha46.item = objArray60;
        boolean boolean62 = pilha46.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) '#');
        java.lang.Object obj66 = pilha63.desempilha();
        pilha63.empilha((java.lang.Object) 1);
        pilha63.empilha((java.lang.Object) 0L);
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.topo = '4';
        pilha71.topo = 10;
        java.lang.Object[] objArray76 = pilha71.item;
        java.lang.Object[] objArray77 = pilha71.item;
        pilha63.item = objArray77;
        pilha46.item = objArray77;
        pilha36.item = objArray77;
        ds.Pilha pilha81 = new ds.Pilha();
        pilha81.topo = (short) 10;
        java.lang.Object obj84 = pilha81.desempilha();
        boolean boolean85 = pilha81.vazia();
        pilha36.empilha((java.lang.Object) pilha81);
        ds.Pilha pilha87 = new ds.Pilha();
        pilha87.topo = '4';
        pilha87.topo = 10;
        java.lang.Object[] objArray92 = pilha87.item;
        java.lang.Object[] objArray93 = pilha87.item;
        pilha87.topo = 0;
        int int96 = pilha87.tamanho();
        pilha81.empilha((java.lang.Object) pilha87);
        java.lang.Object[] objArray98 = pilha87.item;
        pilha24.item = objArray98;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '#' + "'", obj39, '#');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '#' + "'", obj66, '#');
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(objArray98);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        pilha8.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray16 = null;
        pilha8.item = objArray16;
        pilha8.topo = 100;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = '4';
        pilha20.topo = 10;
        java.lang.Object[] objArray25 = pilha20.item;
        java.lang.Object[] objArray26 = pilha20.item;
        pilha8.item = objArray26;
        pilha0.item = objArray26;
        boolean boolean29 = pilha0.vazia();
        java.lang.Object[] objArray30 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = '4';
        pilha25.topo = 10;
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        pilha17.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        java.lang.Object obj35 = pilha0.desempilha();
        int int36 = pilha0.topo;
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        pilha37.topo = (byte) -1;
        pilha37.topo = 0;
        java.lang.Object[] objArray47 = pilha37.item;
        pilha0.item = objArray47;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        int int12 = pilha0.topo;
        pilha0.topo = 2;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int20 = pilha0.tamanho();
        int int21 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray8 = null;
        pilha0.item = objArray8;
        pilha0.topo = (byte) 10;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = '4';
        pilha21.topo = 10;
        java.lang.Object[] objArray26 = pilha21.item;
        pilha17.item = objArray26;
        pilha13.item = objArray26;
        pilha13.topo = (byte) -1;
        int int31 = pilha13.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) '#');
        java.lang.Object obj35 = pilha32.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.topo = '4';
        pilha36.topo = 10;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha32.item = objArray41;
        pilha13.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        java.lang.Class<?> wildcardClass50 = pilha45.getClass();
        pilha0.empilha((java.lang.Object) pilha45);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '#' + "'", obj35, '#');
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.topo = '4';
        pilha17.topo = 10;
        boolean boolean22 = pilha17.vazia();
        java.lang.Object[] objArray23 = pilha17.item;
        int int24 = pilha17.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        pilha25.topo = 100;
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.topo = '4';
        pilha37.topo = 10;
        java.lang.Object[] objArray42 = pilha37.item;
        java.lang.Object[] objArray43 = pilha37.item;
        pilha25.item = objArray43;
        pilha17.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) '#');
        java.lang.Object obj49 = pilha46.desempilha();
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.topo = '4';
        pilha50.topo = 10;
        boolean boolean55 = pilha50.vazia();
        java.lang.Object[] objArray56 = pilha50.item;
        java.lang.Object[] objArray57 = pilha50.item;
        pilha46.empilha((java.lang.Object) pilha50);
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.topo = '4';
        pilha59.topo = 10;
        java.lang.Object[] objArray64 = pilha59.item;
        java.lang.Object[] objArray65 = pilha59.item;
        pilha59.topo = 1;
        int int68 = pilha59.topo;
        int int69 = pilha59.tamanho();
        pilha50.empilha((java.lang.Object) int69);
        pilha17.empilha((java.lang.Object) pilha50);
        java.lang.Object[] objArray72 = pilha50.item;
        pilha0.empilha((java.lang.Object) pilha50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '#' + "'", obj49, '#');
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray18 = null;
        pilha10.item = objArray18;
        pilha10.topo = (byte) 10;
        java.lang.Class<?> wildcardClass22 = pilha10.getClass();
        pilha0.empilha((java.lang.Object) pilha10);
        java.lang.Object obj24 = null;
        pilha0.empilha(obj24);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) '#');
        java.lang.Object obj7 = pilha4.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha4.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha38 = new ds.Pilha();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        pilha38.item = objArray44;
        pilha0.item = objArray44;
        java.lang.Class<?> wildcardClass47 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) '#');
        java.lang.Object obj14 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1);
        pilha11.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray19 = null;
        pilha11.item = objArray19;
        pilha11.topo = 100;
        int int23 = pilha11.topo;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = '4';
        pilha24.topo = 10;
        java.lang.Object[] objArray29 = pilha24.item;
        java.lang.Object obj30 = pilha24.desempilha();
        int int31 = pilha24.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = '4';
        pilha32.topo = 10;
        java.lang.Object[] objArray37 = pilha32.item;
        pilha24.item = objArray37;
        pilha11.item = objArray37;
        pilha0.item = objArray37;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '#' + "'", obj14, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        pilha0.topo = (short) 100;
        int int11 = pilha0.topo;
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        boolean boolean17 = pilha0.vazia();
        int int18 = pilha0.topo;
        int int19 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 99;
        pilha0.topo = 0;
        int int11 = pilha0.topo;
        pilha0.topo = 'a';
        pilha0.topo = (byte) 10;
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        java.lang.Object obj13 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1);
        pilha10.empilha((java.lang.Object) 0L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha10.item = objArray24;
        boolean boolean26 = pilha10.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) '#');
        java.lang.Object obj30 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1);
        pilha27.empilha((java.lang.Object) 0L);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        pilha27.item = objArray41;
        pilha10.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.topo = (short) 10;
        java.lang.Object obj48 = pilha45.desempilha();
        boolean boolean49 = pilha45.vazia();
        pilha0.empilha((java.lang.Object) pilha45);
        pilha45.topo = 97;
        java.lang.Object obj53 = pilha45.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '#' + "'", obj30, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        java.lang.Object obj21 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1);
        pilha18.empilha((java.lang.Object) 0L);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = '4';
        pilha26.topo = 10;
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha18.item = objArray32;
        java.lang.Object obj34 = pilha18.desempilha();
        java.lang.Object obj35 = pilha18.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) 0.0d);
        int int40 = pilha36.topo;
        pilha36.topo = 1;
        pilha18.empilha((java.lang.Object) pilha36);
        int int44 = pilha18.tamanho();
        pilha0.empilha((java.lang.Object) pilha18);
        pilha18.topo = 52;
        pilha18.topo = 98;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '#' + "'", obj21, '#');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        boolean boolean26 = pilha0.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 10;
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object obj33 = pilha27.desempilha();
        int int34 = pilha27.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.topo = '4';
        pilha35.topo = 10;
        java.lang.Object[] objArray40 = pilha35.item;
        pilha27.item = objArray40;
        int int42 = pilha27.topo;
        boolean boolean43 = pilha27.vazia();
        int int44 = pilha27.topo;
        pilha27.topo = (byte) 100;
        boolean boolean47 = pilha27.vazia();
        int int48 = pilha27.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) '#');
        java.lang.Object obj52 = pilha49.desempilha();
        int int53 = pilha49.tamanho();
        int int54 = pilha49.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) '#');
        java.lang.Object obj58 = pilha55.desempilha();
        pilha55.empilha((java.lang.Object) 1);
        pilha55.empilha((java.lang.Object) 0L);
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.topo = '4';
        pilha63.topo = 10;
        java.lang.Object[] objArray68 = pilha63.item;
        java.lang.Object[] objArray69 = pilha63.item;
        pilha55.item = objArray69;
        boolean boolean71 = pilha55.vazia();
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.empilha((java.lang.Object) '#');
        java.lang.Object obj75 = pilha72.desempilha();
        pilha72.empilha((java.lang.Object) 1);
        pilha72.empilha((java.lang.Object) 0L);
        ds.Pilha pilha80 = new ds.Pilha();
        pilha80.topo = '4';
        pilha80.topo = 10;
        java.lang.Object[] objArray85 = pilha80.item;
        java.lang.Object[] objArray86 = pilha80.item;
        pilha72.item = objArray86;
        pilha55.item = objArray86;
        int int89 = pilha55.topo;
        int int90 = pilha55.topo;
        java.lang.Object[] objArray91 = pilha55.item;
        pilha49.item = objArray91;
        pilha27.item = objArray91;
        pilha0.item = objArray91;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '#' + "'", obj52, '#');
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '#' + "'", obj58, '#');
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + '#' + "'", obj75, '#');
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) '#');
        java.lang.Object obj18 = pilha15.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.topo = '4';
        pilha19.topo = 10;
        java.lang.Object[] objArray24 = pilha19.item;
        pilha15.item = objArray24;
        pilha11.item = objArray24;
        pilha0.item = objArray24;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        int int30 = pilha28.topo;
        pilha28.topo = (short) 100;
        java.lang.Object obj33 = pilha28.desempilha();
        java.lang.Object obj34 = pilha28.desempilha();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) '#');
        java.lang.Object obj38 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) 1);
        pilha35.empilha((java.lang.Object) 0L);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 10;
        java.lang.Object[] objArray48 = pilha43.item;
        java.lang.Object[] objArray49 = pilha43.item;
        pilha35.item = objArray49;
        int int51 = pilha35.tamanho();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.topo = '4';
        pilha52.topo = 10;
        java.lang.Object[] objArray57 = pilha52.item;
        java.lang.Object obj58 = pilha52.desempilha();
        int int59 = pilha52.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = '4';
        pilha60.topo = 10;
        java.lang.Object[] objArray65 = pilha60.item;
        pilha52.item = objArray65;
        pilha35.item = objArray65;
        pilha28.item = objArray65;
        pilha0.item = objArray65;
        boolean boolean70 = pilha0.vazia();
        java.lang.Object obj71 = pilha0.desempilha();
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.topo = '4';
        pilha72.topo = '#';
        java.lang.Object[] objArray77 = pilha72.item;
        pilha0.empilha((java.lang.Object) objArray77);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '#' + "'", obj18, '#');
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '#' + "'", obj38, '#');
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Object obj7 = pilha0.desempilha();
        boolean boolean8 = pilha0.vazia();
        int int9 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        pilha0.topo = (short) -1;
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        int int7 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        pilha0.topo = (short) 1;
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) '#');
        int int13 = pilha10.tamanho();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha0.item = objArray14;
        int int16 = pilha0.topo;
        pilha0.topo = (short) 100;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) '#');
        java.lang.Object obj12 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) 1);
        boolean boolean15 = pilha9.vazia();
        java.lang.Object[] objArray16 = pilha9.item;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray18 = pilha0.item;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) 1);
        boolean boolean25 = pilha19.vazia();
        int int26 = pilha19.topo;
        int int27 = pilha19.topo;
        int int28 = pilha19.topo;
        boolean boolean29 = pilha19.vazia();
        java.lang.Object[] objArray30 = pilha19.item;
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = '4';
        pilha31.topo = 10;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object obj37 = pilha31.desempilha();
        int int38 = pilha31.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.topo = '4';
        pilha39.topo = 10;
        java.lang.Object[] objArray44 = pilha39.item;
        pilha31.item = objArray44;
        int int46 = pilha31.topo;
        int int47 = pilha31.topo;
        pilha31.empilha((java.lang.Object) 100.0d);
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) '#');
        java.lang.Object obj53 = pilha50.desempilha();
        pilha50.empilha((java.lang.Object) 1);
        pilha50.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray58 = null;
        pilha50.item = objArray58;
        pilha50.topo = 100;
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.topo = '4';
        pilha62.topo = 10;
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object[] objArray68 = pilha62.item;
        pilha50.item = objArray68;
        pilha31.empilha((java.lang.Object) objArray68);
        pilha19.empilha((java.lang.Object) pilha31);
        boolean boolean72 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) pilha31);
        int int74 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '#' + "'", obj12, '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '#' + "'", obj53, '#');
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 1;
        int int9 = pilha0.topo;
        int int10 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = pilha0.desempilha();
        pilha0.topo = 52;
        boolean boolean20 = pilha0.vazia();
        java.lang.Object obj21 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha7.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) '#');
        java.lang.Object obj22 = pilha19.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.topo = '4';
        pilha23.topo = 10;
        java.lang.Object[] objArray28 = pilha23.item;
        pilha19.item = objArray28;
        pilha0.item = objArray28;
        java.lang.Object obj31 = pilha0.desempilha();
        int int32 = pilha0.topo;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) 0.0d);
        int int12 = pilha8.topo;
        java.lang.Object obj13 = pilha8.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.topo = '4';
        pilha14.topo = 0;
        pilha8.empilha((java.lang.Object) 0);
        pilha8.topo = (byte) 100;
        java.lang.Object obj22 = pilha8.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) '#');
        java.lang.Object obj26 = pilha23.desempilha();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha8.item = objArray27;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        int int32 = pilha30.topo;
        pilha30.topo = (short) 100;
        java.lang.Object obj35 = pilha30.desempilha();
        java.lang.Object obj36 = pilha30.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) 0.0d);
        int int41 = pilha37.topo;
        java.lang.Object obj42 = pilha37.desempilha();
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.topo = '4';
        pilha43.topo = 0;
        pilha37.empilha((java.lang.Object) 0);
        pilha30.empilha((java.lang.Object) pilha37);
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) '#');
        java.lang.Object obj53 = pilha50.desempilha();
        pilha50.empilha((java.lang.Object) 1);
        pilha50.empilha((java.lang.Object) 0L);
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = '4';
        pilha58.topo = 10;
        java.lang.Object[] objArray63 = pilha58.item;
        java.lang.Object[] objArray64 = pilha58.item;
        pilha50.item = objArray64;
        java.lang.Object obj66 = pilha50.desempilha();
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) '#');
        java.lang.Object obj70 = pilha67.desempilha();
        pilha67.empilha((java.lang.Object) 1);
        int int73 = pilha67.topo;
        pilha67.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.empilha((java.lang.Object) '#');
        java.lang.Object obj79 = pilha76.desempilha();
        pilha76.empilha((java.lang.Object) 1);
        pilha76.empilha((java.lang.Object) 0L);
        ds.Pilha pilha84 = new ds.Pilha();
        pilha84.empilha((java.lang.Object) '#');
        java.lang.Object obj87 = pilha84.desempilha();
        pilha84.empilha((java.lang.Object) 1);
        pilha84.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray92 = null;
        pilha84.item = objArray92;
        java.lang.Object[] objArray94 = new java.lang.Object[] { pilha76, pilha84 };
        pilha67.item = objArray94;
        pilha50.item = objArray94;
        pilha37.empilha((java.lang.Object) objArray94);
        pilha8.item = objArray94;
        int int99 = pilha8.topo;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '#' + "'", obj26, '#');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '#' + "'", obj53, '#');
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + '#' + "'", obj70, '#');
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + '#' + "'", obj79, '#');
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + '#' + "'", obj87, '#');
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 99 + "'", int99 == 99);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = '4';
        pilha6.topo = 10;
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 100;
        int int14 = pilha6.topo;
        int int15 = pilha6.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.topo = '4';
        pilha16.topo = 10;
        boolean boolean21 = pilha16.vazia();
        java.lang.Object[] objArray22 = pilha16.item;
        java.lang.Object[] objArray23 = pilha16.item;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) '#');
        java.lang.Object obj27 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1);
        int int30 = pilha24.topo;
        pilha24.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) '#');
        java.lang.Object obj36 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) 1);
        pilha33.empilha((java.lang.Object) 0L);
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) '#');
        java.lang.Object obj44 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) 1);
        pilha41.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray49 = null;
        pilha41.item = objArray49;
        java.lang.Object[] objArray51 = new java.lang.Object[] { pilha33, pilha41 };
        pilha24.item = objArray51;
        pilha16.empilha((java.lang.Object) pilha24);
        ds.Pilha pilha54 = new ds.Pilha();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.topo = '4';
        pilha55.topo = 10;
        java.lang.Object[] objArray60 = pilha55.item;
        pilha54.item = objArray60;
        pilha16.item = objArray60;
        pilha6.empilha((java.lang.Object) objArray60);
        pilha0.item = objArray60;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '#' + "'", obj27, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + '#' + "'", obj44, '#');
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha0.topo;
        int int21 = pilha0.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 1);
        pilha22.empilha((java.lang.Object) 0L);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.topo = '4';
        pilha30.topo = 10;
        java.lang.Object[] objArray35 = pilha30.item;
        java.lang.Object[] objArray36 = pilha30.item;
        pilha22.item = objArray36;
        java.lang.Object obj38 = pilha22.desempilha();
        java.lang.Object obj39 = pilha22.desempilha();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) 0.0d);
        int int44 = pilha40.topo;
        pilha40.topo = 1;
        pilha22.empilha((java.lang.Object) pilha40);
        java.lang.Object obj48 = pilha40.desempilha();
        ds.Pilha pilha49 = new ds.Pilha();
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.topo = '4';
        pilha50.topo = 10;
        java.lang.Object[] objArray55 = pilha50.item;
        pilha49.item = objArray55;
        pilha40.empilha((java.lang.Object) pilha49);
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) '#');
        java.lang.Object obj61 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1);
        pilha58.empilha((java.lang.Object) 0L);
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        java.lang.Object[] objArray72 = pilha66.item;
        pilha58.item = objArray72;
        int int74 = pilha58.tamanho();
        pilha58.topo = (short) 100;
        pilha40.empilha((java.lang.Object) (short) 100);
        ds.Pilha pilha78 = new ds.Pilha();
        pilha78.topo = '4';
        pilha78.topo = 10;
        java.lang.Object[] objArray83 = pilha78.item;
        int int84 = pilha78.tamanho();
        ds.Pilha pilha85 = new ds.Pilha();
        java.lang.Object[] objArray86 = pilha85.item;
        pilha78.item = objArray86;
        java.lang.Object obj88 = pilha78.desempilha();
        java.lang.Object[] objArray89 = pilha78.item;
        pilha40.empilha((java.lang.Object) objArray89);
        pilha0.item = objArray89;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + '#' + "'", obj61, '#');
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 100.0d);
        java.lang.Object obj19 = pilha0.desempilha();
        pilha0.topo = 99;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.topo = '4';
        pilha7.topo = 10;
        java.lang.Object[] objArray12 = pilha7.item;
        java.lang.Object obj13 = pilha7.desempilha();
        int int14 = pilha7.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        pilha7.item = objArray20;
        pilha0.item = objArray20;
        pilha0.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) 0.0d);
        int int29 = pilha25.topo;
        int int30 = pilha25.tamanho();
        java.lang.Object[] objArray31 = pilha25.item;
        pilha0.item = objArray31;
        int int33 = pilha0.topo;
        pilha0.topo = 3;
        int int36 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) '#');
        java.lang.Object obj15 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) 1);
        pilha12.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray20 = null;
        pilha12.item = objArray20;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) 0.0d);
        int int26 = pilha22.topo;
        int int27 = pilha22.tamanho();
        java.lang.Object[] objArray28 = pilha22.item;
        pilha12.item = objArray28;
        pilha12.topo = (byte) -1;
        java.lang.Object[] objArray32 = pilha12.item;
        pilha0.item = objArray32;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.topo;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        int int16 = pilha14.topo;
        pilha14.topo = (short) 100;
        java.lang.Object obj19 = pilha14.desempilha();
        java.lang.Object obj20 = pilha14.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) 0.0d);
        int int25 = pilha21.topo;
        java.lang.Object obj26 = pilha21.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = '4';
        pilha27.topo = 0;
        pilha21.empilha((java.lang.Object) 0);
        pilha14.empilha((java.lang.Object) pilha21);
        int int34 = pilha14.topo;
        boolean boolean35 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) boolean35);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 99 + "'", int34 == 99);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.topo = 0;
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) '#');
        java.lang.Object obj16 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1);
        int int19 = pilha13.topo;
        pilha13.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) '#');
        java.lang.Object obj25 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 1);
        pilha22.empilha((java.lang.Object) 0L);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) '#');
        java.lang.Object obj33 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) 1);
        pilha30.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray38 = null;
        pilha30.item = objArray38;
        java.lang.Object[] objArray40 = new java.lang.Object[] { pilha22, pilha30 };
        pilha13.item = objArray40;
        java.lang.Object[] objArray42 = pilha13.item;
        pilha13.topo = 99;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) '#');
        java.lang.Object obj48 = pilha45.desempilha();
        pilha45.empilha((java.lang.Object) 1);
        pilha45.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray53 = null;
        pilha45.item = objArray53;
        pilha45.topo = 100;
        int int57 = pilha45.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = '4';
        pilha58.topo = 10;
        java.lang.Object[] objArray63 = pilha58.item;
        java.lang.Object obj64 = pilha58.desempilha();
        int int65 = pilha58.topo;
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.topo = '4';
        pilha66.topo = 10;
        java.lang.Object[] objArray71 = pilha66.item;
        pilha58.item = objArray71;
        pilha45.item = objArray71;
        pilha13.item = objArray71;
        pilha0.item = objArray71;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '#' + "'", obj25, '#');
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        int int14 = pilha8.topo;
        pilha8.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        pilha17.empilha((java.lang.Object) 0L);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1);
        pilha25.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray33 = null;
        pilha25.item = objArray33;
        java.lang.Object[] objArray35 = new java.lang.Object[] { pilha17, pilha25 };
        pilha8.item = objArray35;
        pilha0.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.topo = '4';
        pilha38.topo = 10;
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object obj44 = pilha38.desempilha();
        int int45 = pilha38.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha38.item = objArray47;
        pilha0.item = objArray47;
        boolean boolean50 = pilha0.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) '#');
        java.lang.Object obj54 = pilha51.desempilha();
        pilha51.empilha((java.lang.Object) 1);
        int int57 = pilha51.topo;
        pilha51.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) '#');
        java.lang.Object obj63 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1);
        pilha60.empilha((java.lang.Object) 0L);
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.empilha((java.lang.Object) '#');
        java.lang.Object obj71 = pilha68.desempilha();
        pilha68.empilha((java.lang.Object) 1);
        pilha68.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray76 = null;
        pilha68.item = objArray76;
        java.lang.Object[] objArray78 = new java.lang.Object[] { pilha60, pilha68 };
        pilha51.item = objArray78;
        ds.Pilha pilha80 = new ds.Pilha();
        java.lang.Object[] objArray81 = pilha80.item;
        int int82 = pilha80.topo;
        ds.Pilha pilha83 = new ds.Pilha();
        pilha83.empilha((java.lang.Object) '#');
        java.lang.Object obj86 = pilha83.desempilha();
        java.lang.Object[] objArray87 = pilha83.item;
        pilha80.item = objArray87;
        pilha51.item = objArray87;
        java.lang.Object[] objArray90 = null;
        pilha51.item = objArray90;
        pilha0.empilha((java.lang.Object) objArray90);
        pilha0.topo = (-1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '#' + "'", obj54, '#');
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '#' + "'", obj63, '#');
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + '#' + "'", obj71, '#');
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + '#' + "'", obj86, '#');
        org.junit.Assert.assertNotNull(objArray87);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        boolean boolean12 = pilha6.vazia();
        int int13 = pilha6.topo;
        pilha6.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        java.lang.Object obj46 = pilha17.desempilha();
        java.lang.Object obj47 = null;
        pilha17.empilha(obj47);
        boolean boolean49 = pilha17.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        java.lang.Object[] objArray52 = pilha50.item;
        pilha17.item = objArray52;
        pilha6.item = objArray52;
        boolean boolean55 = pilha6.vazia();
        java.lang.Class<?> wildcardClass56 = pilha6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (short) 10;
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) '#');
        java.lang.Object obj9 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1);
        boolean boolean12 = pilha6.vazia();
        int int13 = pilha6.topo;
        pilha6.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) '#');
        java.lang.Object obj20 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1);
        int int23 = pilha17.topo;
        pilha17.empilha((java.lang.Object) 10.0d);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) '#');
        java.lang.Object obj29 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1);
        pilha26.empilha((java.lang.Object) 0L);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) '#');
        java.lang.Object obj37 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) 1);
        pilha34.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray42 = null;
        pilha34.item = objArray42;
        java.lang.Object[] objArray44 = new java.lang.Object[] { pilha26, pilha34 };
        pilha17.item = objArray44;
        java.lang.Object obj46 = pilha17.desempilha();
        java.lang.Object obj47 = null;
        pilha17.empilha(obj47);
        boolean boolean49 = pilha17.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        java.lang.Object[] objArray52 = pilha50.item;
        pilha17.item = objArray52;
        pilha6.item = objArray52;
        boolean boolean55 = pilha6.vazia();
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.empilha((java.lang.Object) '#');
        java.lang.Object obj59 = pilha56.desempilha();
        pilha56.empilha((java.lang.Object) 1);
        boolean boolean62 = pilha56.vazia();
        int int63 = pilha56.topo;
        int int64 = pilha56.topo;
        int int65 = pilha56.topo;
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.empilha((java.lang.Object) '#');
        java.lang.Object obj69 = pilha66.desempilha();
        pilha66.empilha((java.lang.Object) 1);
        int int72 = pilha66.topo;
        java.lang.Object[] objArray73 = pilha66.item;
        int int74 = pilha66.tamanho();
        int int75 = pilha66.tamanho();
        pilha66.topo = (short) 100;
        pilha56.empilha((java.lang.Object) pilha66);
        pilha6.empilha((java.lang.Object) pilha56);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '#' + "'", obj20, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '#' + "'", obj37, '#');
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + '#' + "'", obj59, '#');
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + '#' + "'", obj69, '#');
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) '#');
        java.lang.Object obj10 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) 1);
        boolean boolean13 = pilha7.vazia();
        int int14 = pilha7.topo;
        int int15 = pilha7.topo;
        int int16 = pilha7.topo;
        int int17 = pilha7.tamanho();
        int int18 = pilha7.tamanho();
        boolean boolean19 = pilha7.vazia();
        java.lang.Object[] objArray20 = pilha7.item;
        pilha0.item = objArray20;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '#' + "'", obj10, '#');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.topo = '4';
        int int8 = pilha5.topo;
        pilha0.empilha((java.lang.Object) pilha5);
        int int10 = pilha5.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 0.0d);
        int int22 = pilha18.topo;
        pilha18.topo = 1;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj26 = pilha0.desempilha();
        pilha0.topo = 'a';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) '#');
        java.lang.Object obj11 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) 1);
        boolean boolean14 = pilha8.vazia();
        int int15 = pilha8.topo;
        int int16 = pilha8.topo;
        int int17 = pilha8.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) '#');
        int int21 = pilha18.tamanho();
        java.lang.Object[] objArray22 = pilha18.item;
        pilha8.item = objArray22;
        pilha0.item = objArray22;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '#' + "'", obj11, '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 0.0d);
        int int11 = pilha7.topo;
        java.lang.Object obj12 = pilha7.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.topo = '4';
        pilha13.topo = 0;
        pilha7.empilha((java.lang.Object) 0);
        pilha0.empilha((java.lang.Object) pilha7);
        int int20 = pilha7.topo;
        int int21 = pilha7.tamanho();
        java.lang.Class<?> wildcardClass22 = pilha7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = '4';
        pilha18.topo = 10;
        java.lang.Object[] objArray23 = pilha18.item;
        int int24 = pilha18.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha18.item = objArray26;
        pilha0.item = objArray26;
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test844");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = '#';
        java.lang.Object obj5 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test845");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        pilha0.empilha((java.lang.Object) 0L);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.topo = '4';
        pilha8.topo = 10;
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        int int19 = pilha0.tamanho();
        java.lang.Object obj20 = pilha0.desempilha();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test846");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        pilha0.topo = 10;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = 3;
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test847");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        pilha0.topo = (short) 100;
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test848");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1);
        int int6 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10.0d);
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.topo;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.topo = '4';
        pilha15.topo = 10;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object obj21 = pilha15.desempilha();
        int int22 = pilha15.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        pilha15.item = objArray24;
        pilha0.empilha((java.lang.Object) pilha15);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(objArray24);
    }
}


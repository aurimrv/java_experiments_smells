package ds.seed5838;

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
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        int int31 = pilha27.tamanho();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha12.item = objArray32;
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        java.lang.Object[] objArray36 = pilha34.item;
        pilha34.empilha((java.lang.Object) '4');
        int int39 = pilha34.tamanho();
        boolean boolean40 = pilha34.vazia();
        pilha12.empilha((java.lang.Object) pilha34);
        pilha34.topo = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        pilha0.topo = (byte) 1;
        pilha0.topo = ' ';
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        boolean boolean18 = pilha9.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray31 = pilha24.item;
        java.lang.Object[] objArray32 = pilha24.item;
        boolean boolean33 = pilha24.vazia();
        java.lang.Object[] objArray34 = pilha24.item;
        java.lang.Object[] objArray35 = pilha24.item;
        pilha9.item = objArray35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 100;
        int int22 = pilha0.topo;
        boolean boolean23 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        pilha0.topo = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha5.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray25 = pilha18.item;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (short) 0);
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha26.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        boolean boolean42 = pilha38.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (short) 0);
        pilha43.empilha((java.lang.Object) (byte) -1);
        pilha38.empilha((java.lang.Object) pilha43);
        java.lang.Object[] objArray50 = pilha43.item;
        pilha26.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        int int56 = pilha52.tamanho();
        pilha26.empilha((java.lang.Object) int56);
        pilha18.empilha((java.lang.Object) pilha26);
        pilha5.empilha((java.lang.Object) pilha26);
        boolean boolean60 = pilha5.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        java.lang.Object[] objArray20 = pilha0.item;
        java.lang.Object obj21 = pilha0.desempilha();
        java.lang.Object obj22 = pilha0.desempilha();
        boolean boolean23 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.topo = (short) 1;
        boolean boolean12 = pilha8.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray20 = pilha13.item;
        pilha5.item = objArray20;
        pilha0.item = objArray20;
        int int23 = pilha0.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = pilha24.item;
        java.lang.Object[] objArray31 = pilha24.item;
        pilha24.topo = 'a';
        boolean boolean34 = pilha24.vazia();
        pilha24.topo = (byte) 100;
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.empilha((java.lang.Object) (short) 0);
        int int41 = pilha37.tamanho();
        java.lang.Object obj42 = pilha37.desempilha();
        int int43 = pilha37.tamanho();
        int int44 = pilha37.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        pilha45.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray51 = pilha45.item;
        java.lang.Class<?> wildcardClass52 = objArray51.getClass();
        pilha37.empilha((java.lang.Object) wildcardClass52);
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.empilha((java.lang.Object) (short) 0);
        pilha54.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray60 = pilha54.item;
        ds.Pilha pilha61 = new ds.Pilha();
        boolean boolean62 = pilha61.vazia();
        pilha61.empilha((java.lang.Object) (short) 0);
        int int65 = pilha61.tamanho();
        boolean boolean66 = pilha61.vazia();
        ds.Pilha pilha67 = new ds.Pilha();
        boolean boolean68 = pilha67.vazia();
        pilha67.topo = (short) 1;
        int int71 = pilha67.tamanho();
        java.lang.Object[] objArray72 = pilha67.item;
        pilha61.item = objArray72;
        java.lang.Object[] objArray74 = pilha61.item;
        pilha54.item = objArray74;
        pilha37.item = objArray74;
        pilha24.item = objArray74;
        pilha0.item = objArray74;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) 0 + "'", obj42, (short) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        pilha16.topo = (-1);
        boolean boolean25 = pilha16.vazia();
        java.lang.Object[] objArray26 = pilha16.item;
        java.lang.Object[] objArray27 = pilha16.item;
        pilha0.empilha((java.lang.Object) objArray27);
        int int29 = pilha0.topo;
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 33 + "'", int29 == 33);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha6.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        pilha6.empilha((java.lang.Object) int36);
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean39 = pilha6.vazia();
        java.lang.Object obj40 = pilha6.desempilha();
        java.lang.Object[] objArray41 = pilha6.item;
        int int42 = pilha6.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        int int22 = pilha18.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (short) 0);
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha26.empilha((java.lang.Object) pilha31);
        java.lang.Object[] objArray38 = pilha31.item;
        pilha23.item = objArray38;
        pilha18.item = objArray38;
        int int41 = pilha18.topo;
        java.lang.Object[] objArray42 = pilha18.item;
        pilha10.item = objArray42;
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.topo = (short) 1;
        java.lang.Object obj48 = pilha44.desempilha();
        int int49 = pilha44.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.topo = (short) 1;
        int int54 = pilha50.tamanho();
        int int55 = pilha50.topo;
        pilha44.empilha((java.lang.Object) int55);
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha60 = new ds.Pilha();
        boolean boolean61 = pilha60.vazia();
        pilha60.topo = (short) 1;
        boolean boolean64 = pilha60.vazia();
        ds.Pilha pilha65 = new ds.Pilha();
        boolean boolean66 = pilha65.vazia();
        pilha65.empilha((java.lang.Object) (short) 0);
        pilha65.empilha((java.lang.Object) (byte) -1);
        pilha60.empilha((java.lang.Object) pilha65);
        java.lang.Object[] objArray72 = pilha65.item;
        pilha57.item = objArray72;
        pilha44.empilha((java.lang.Object) objArray72);
        pilha10.empilha((java.lang.Object) objArray72);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        int int30 = pilha17.tamanho();
        java.lang.Object[] objArray31 = pilha17.item;
        int int32 = pilha17.tamanho();
        java.lang.Class<?> wildcardClass33 = pilha17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (short) 0);
        pilha9.empilha((java.lang.Object) 1L);
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.topo = (short) 1;
        boolean boolean19 = pilha15.vazia();
        java.lang.Object obj20 = pilha15.desempilha();
        java.lang.Object[] objArray21 = pilha15.item;
        pilha9.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray23 = pilha15.item;
        pilha0.item = objArray23;
        java.lang.Object[] objArray25 = pilha0.item;
        java.lang.Class<?> wildcardClass26 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray32 = pilha25.item;
        pilha17.item = objArray32;
        pilha12.item = objArray32;
        pilha0.item = objArray32;
        int int36 = pilha0.topo;
        boolean boolean37 = pilha0.vazia();
        boolean boolean38 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.topo = (-1);
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.topo;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray25 = pilha18.item;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (short) 0);
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha26.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        boolean boolean42 = pilha38.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (short) 0);
        pilha43.empilha((java.lang.Object) (byte) -1);
        pilha38.empilha((java.lang.Object) pilha43);
        java.lang.Object[] objArray50 = pilha43.item;
        pilha26.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        int int56 = pilha52.tamanho();
        pilha26.empilha((java.lang.Object) int56);
        pilha18.empilha((java.lang.Object) pilha26);
        pilha18.topo = (byte) 1;
        int int61 = pilha18.tamanho();
        java.lang.Class<?> wildcardClass62 = pilha18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) wildcardClass62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object obj13 = pilha5.desempilha();
        int int14 = pilha5.topo;
        boolean boolean15 = pilha5.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        java.lang.Object obj17 = pilha13.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        int int22 = pilha18.tamanho();
        boolean boolean23 = pilha18.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        int int28 = pilha24.tamanho();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha18.item = objArray29;
        java.lang.Object[] objArray31 = pilha18.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        boolean boolean26 = pilha17.vazia();
        int int27 = pilha17.tamanho();
        boolean boolean28 = pilha17.vazia();
        java.lang.Object obj29 = pilha17.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        int int15 = pilha0.tamanho();
        java.lang.Object[] objArray16 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        java.lang.Object[] objArray29 = pilha17.item;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.topo = (short) 1;
        boolean boolean34 = pilha30.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (short) 0);
        pilha35.empilha((java.lang.Object) (byte) -1);
        pilha30.empilha((java.lang.Object) pilha35);
        java.lang.Object[] objArray42 = pilha35.item;
        java.lang.Object[] objArray43 = pilha35.item;
        pilha17.item = objArray43;
        int int45 = pilha17.topo;
        java.lang.Object[] objArray46 = pilha17.item;
        java.lang.Class<?> wildcardClass47 = objArray46.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (short) 0);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        int int17 = pilha13.tamanho();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha7.item = objArray18;
        java.lang.Object[] objArray20 = pilha7.item;
        pilha0.item = objArray20;
        boolean boolean22 = pilha0.vazia();
        boolean boolean23 = pilha0.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = pilha24.item;
        java.lang.Object[] objArray31 = pilha24.item;
        pilha24.topo = 'a';
        pilha24.topo = 32;
        int int36 = pilha24.tamanho();
        pilha24.topo = (byte) 1;
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.topo = (short) 1;
        boolean boolean48 = pilha44.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        boolean boolean50 = pilha49.vazia();
        pilha49.empilha((java.lang.Object) (short) 0);
        pilha49.empilha((java.lang.Object) (byte) -1);
        pilha44.empilha((java.lang.Object) pilha49);
        pilha39.empilha((java.lang.Object) pilha49);
        pilha24.empilha((java.lang.Object) pilha39);
        java.lang.Class<?> wildcardClass58 = pilha39.getClass();
        pilha0.empilha((java.lang.Object) pilha39);
        int int60 = pilha39.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        pilha0.item = objArray43;
        boolean boolean46 = pilha0.vazia();
        pilha0.topo = (short) 100;
        java.lang.Class<?> wildcardClass49 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        java.lang.Object[] objArray10 = pilha8.item;
        pilha8.empilha((java.lang.Object) '4');
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        pilha14.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha14.desempilha();
        boolean boolean21 = pilha14.vazia();
        java.lang.Object obj22 = pilha14.desempilha();
        java.lang.Object[] objArray23 = pilha14.item;
        pilha0.item = objArray23;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 0 + "'", obj22, (short) 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        pilha0.topo = (byte) 10;
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.topo = (byte) 1;
        java.lang.Object obj6 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray37 = pilha30.item;
        pilha13.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        pilha13.empilha((java.lang.Object) int43);
        pilha5.empilha((java.lang.Object) pilha13);
        pilha5.topo = (byte) 1;
        java.lang.Object obj48 = pilha5.desempilha();
        pilha5.topo = '4';
        int int51 = pilha5.topo;
        java.lang.Object[] objArray52 = pilha5.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 0 + "'", obj48, (short) 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        pilha0.item = objArray43;
        java.lang.Object[] objArray46 = pilha0.item;
        java.lang.Class<?> wildcardClass47 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = (-1);
        pilha0.topo = 4;
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        pilha0.topo = 10;
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.topo = (short) 1;
        boolean boolean49 = pilha45.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.empilha((java.lang.Object) (short) 0);
        pilha50.empilha((java.lang.Object) (byte) -1);
        pilha45.empilha((java.lang.Object) pilha50);
        java.lang.Object obj57 = pilha50.desempilha();
        int int58 = pilha50.topo;
        java.lang.Object obj59 = pilha50.desempilha();
        pilha50.empilha((java.lang.Object) 100.0f);
        int int62 = pilha50.tamanho();
        pilha14.empilha((java.lang.Object) pilha50);
        pilha0.empilha((java.lang.Object) pilha14);
        int int65 = pilha14.tamanho();
        int int66 = pilha14.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 0 + "'", obj59, (short) 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 98 + "'", int65 == 98);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 98 + "'", int66 == 98);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        pilha0.topo = (byte) 10;
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray32 = pilha25.item;
        pilha17.item = objArray32;
        pilha12.item = objArray32;
        pilha0.item = objArray32;
        java.lang.Object obj36 = pilha0.desempilha();
        int int37 = pilha0.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        int int42 = pilha38.tamanho();
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        pilha46.topo = (short) 1;
        boolean boolean50 = pilha46.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        boolean boolean52 = pilha51.vazia();
        pilha51.empilha((java.lang.Object) (short) 0);
        pilha51.empilha((java.lang.Object) (byte) -1);
        pilha46.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray58 = pilha51.item;
        pilha43.item = objArray58;
        pilha38.item = objArray58;
        int int61 = pilha38.topo;
        java.lang.Class<?> wildcardClass62 = pilha38.getClass();
        pilha0.empilha((java.lang.Object) pilha38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 99 + "'", int37 == 99);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = pilha5.item;
        java.lang.Object[] objArray12 = pilha5.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.topo = 'a';
        java.lang.Object[] objArray8 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.topo;
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Object obj12 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean14 = pilha0.vazia();
        boolean boolean15 = pilha0.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.topo = (short) 1;
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (short) 0);
        pilha26.empilha((java.lang.Object) (byte) -1);
        pilha21.empilha((java.lang.Object) pilha26);
        pilha16.empilha((java.lang.Object) pilha26);
        pilha16.topo = 'a';
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.empilha((java.lang.Object) (short) 0);
        pilha36.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray42 = pilha36.item;
        java.lang.Object[] objArray43 = pilha36.item;
        java.lang.Object[] objArray44 = pilha36.item;
        java.lang.Object[] objArray45 = pilha36.item;
        pilha16.item = objArray45;
        pilha16.topo = (-1);
        java.lang.Object[] objArray49 = pilha16.item;
        int int50 = pilha16.tamanho();
        boolean boolean51 = pilha16.vazia();
        pilha0.empilha((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = 2;
        pilha15.topo = 0;
        int int38 = pilha15.topo;
        boolean boolean39 = pilha15.vazia();
        java.lang.Object[] objArray40 = pilha15.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        boolean boolean14 = pilha5.vazia();
        java.lang.Object[] objArray15 = pilha5.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.topo = (short) 1;
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (short) 0);
        pilha26.empilha((java.lang.Object) (byte) -1);
        pilha21.empilha((java.lang.Object) pilha26);
        pilha16.empilha((java.lang.Object) pilha26);
        pilha16.topo = 'a';
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.empilha((java.lang.Object) (short) 0);
        pilha36.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray42 = pilha36.item;
        java.lang.Object[] objArray43 = pilha36.item;
        java.lang.Object[] objArray44 = pilha36.item;
        java.lang.Object[] objArray45 = pilha36.item;
        pilha16.item = objArray45;
        pilha5.item = objArray45;
        int int48 = pilha5.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha34);
        java.lang.Object[] objArray41 = pilha34.item;
        pilha17.empilha((java.lang.Object) pilha34);
        pilha34.topo = '#';
        boolean boolean45 = pilha34.vazia();
        java.lang.Object[] objArray46 = pilha34.item;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.topo = (short) 1;
        boolean boolean51 = pilha47.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        pilha52.empilha((java.lang.Object) (byte) -1);
        pilha47.empilha((java.lang.Object) pilha52);
        java.lang.Object[] objArray59 = pilha52.item;
        java.lang.Object[] objArray60 = pilha52.item;
        pilha34.item = objArray60;
        pilha0.empilha((java.lang.Object) pilha34);
        boolean boolean63 = pilha34.vazia();
        int int64 = pilha34.tamanho();
        pilha34.topo = (short) -1;
        boolean boolean67 = pilha34.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        pilha0.topo = 99;
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        pilha16.topo = (-1);
        boolean boolean25 = pilha16.vazia();
        java.lang.Object[] objArray26 = pilha16.item;
        java.lang.Object[] objArray27 = pilha16.item;
        pilha0.empilha((java.lang.Object) objArray27);
        int int29 = pilha0.topo;
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 33 + "'", int29 == 33);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray15 = pilha5.item;
        pilha5.topo = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        boolean boolean10 = pilha0.vazia();
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        pilha29.empilha((java.lang.Object) (byte) -1);
        pilha24.empilha((java.lang.Object) pilha29);
        java.lang.Object[] objArray36 = pilha29.item;
        pilha12.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        int int42 = pilha38.tamanho();
        pilha12.empilha((java.lang.Object) int42);
        boolean boolean44 = pilha12.vazia();
        java.lang.Object[] objArray45 = pilha12.item;
        pilha0.empilha((java.lang.Object) objArray45);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = ' ';
        int int50 = pilha47.topo;
        java.lang.Object[] objArray51 = pilha47.item;
        java.lang.Object[] objArray52 = pilha47.item;
        pilha0.empilha((java.lang.Object) pilha47);
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.topo = (short) 1;
        boolean boolean58 = pilha54.vazia();
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        pilha59.empilha((java.lang.Object) (short) 0);
        pilha59.empilha((java.lang.Object) (byte) -1);
        pilha54.empilha((java.lang.Object) pilha59);
        ds.Pilha pilha66 = new ds.Pilha();
        boolean boolean67 = pilha66.vazia();
        pilha66.topo = (short) 1;
        boolean boolean70 = pilha66.vazia();
        ds.Pilha pilha71 = new ds.Pilha();
        boolean boolean72 = pilha71.vazia();
        pilha71.empilha((java.lang.Object) (short) 0);
        pilha71.empilha((java.lang.Object) (byte) -1);
        pilha66.empilha((java.lang.Object) pilha71);
        java.lang.Object[] objArray78 = pilha71.item;
        pilha54.empilha((java.lang.Object) pilha71);
        java.lang.Object[] objArray80 = pilha54.item;
        pilha0.empilha((java.lang.Object) pilha54);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        boolean boolean10 = pilha0.vazia();
        boolean boolean11 = pilha0.vazia();
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = 4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        int int15 = pilha0.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        java.lang.Object obj21 = pilha16.desempilha();
        int int22 = pilha16.tamanho();
        int int23 = pilha16.topo;
        pilha0.empilha((java.lang.Object) int23);
        java.lang.Object[] objArray25 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 0 + "'", obj21, (short) 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha6.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        pilha6.empilha((java.lang.Object) int36);
        pilha0.empilha((java.lang.Object) pilha6);
        int int39 = pilha6.tamanho();
        java.lang.Class<?> wildcardClass40 = pilha6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (short) 0);
        pilha4.empilha((java.lang.Object) 1L);
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.topo = (short) 1;
        boolean boolean14 = pilha10.vazia();
        java.lang.Object obj15 = pilha10.desempilha();
        java.lang.Object[] objArray16 = pilha10.item;
        pilha4.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha4);
        int int19 = pilha0.topo;
        java.lang.Object obj20 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.topo = (short) 1;
        boolean boolean12 = pilha8.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray20 = pilha13.item;
        pilha5.item = objArray20;
        pilha0.item = objArray20;
        int int23 = pilha0.topo;
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass27 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = 2;
        java.lang.Class<?> wildcardClass36 = pilha15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        java.lang.Object obj25 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass26 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        java.lang.Object obj9 = pilha0.desempilha();
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object obj11 = pilha0.desempilha();
        int int12 = pilha0.topo;
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (short) 0);
        pilha4.empilha((java.lang.Object) 1L);
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.topo = (short) 1;
        boolean boolean14 = pilha10.vazia();
        java.lang.Object obj15 = pilha10.desempilha();
        java.lang.Object[] objArray16 = pilha10.item;
        pilha4.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object[] objArray19 = pilha0.item;
        pilha0.topo = (short) -1;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.topo = (short) 1;
        boolean boolean26 = pilha22.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.empilha((java.lang.Object) (short) 0);
        pilha27.empilha((java.lang.Object) (byte) -1);
        pilha22.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.topo = (short) 1;
        boolean boolean38 = pilha34.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        pilha39.empilha((java.lang.Object) (byte) -1);
        pilha34.empilha((java.lang.Object) pilha39);
        java.lang.Object[] objArray46 = pilha39.item;
        pilha22.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        pilha48.empilha((java.lang.Object) (short) 0);
        int int52 = pilha48.tamanho();
        pilha22.empilha((java.lang.Object) int52);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.topo = (short) 1;
        boolean boolean14 = pilha10.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        pilha15.empilha((java.lang.Object) (byte) -1);
        pilha10.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray22 = pilha15.item;
        pilha7.item = objArray22;
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        int int28 = pilha24.tamanho();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha7.item = objArray29;
        pilha0.empilha((java.lang.Object) objArray29);
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object obj13 = pilha5.desempilha();
        int int14 = pilha5.topo;
        java.lang.Object[] objArray15 = pilha5.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        pilha17.topo = (-1);
        pilha17.topo = '#';
        int int34 = pilha17.tamanho();
        boolean boolean35 = pilha17.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray37 = pilha30.item;
        pilha13.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        pilha13.empilha((java.lang.Object) int43);
        pilha5.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        pilha46.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.empilha((java.lang.Object) (short) 0);
        pilha50.empilha((java.lang.Object) 1L);
        ds.Pilha pilha56 = new ds.Pilha();
        boolean boolean57 = pilha56.vazia();
        pilha56.topo = (short) 1;
        boolean boolean60 = pilha56.vazia();
        java.lang.Object obj61 = pilha56.desempilha();
        java.lang.Object[] objArray62 = pilha56.item;
        pilha50.empilha((java.lang.Object) pilha56);
        pilha46.empilha((java.lang.Object) pilha50);
        ds.Pilha pilha65 = new ds.Pilha();
        boolean boolean66 = pilha65.vazia();
        pilha65.topo = (short) 1;
        boolean boolean69 = pilha65.vazia();
        pilha65.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj72 = pilha65.desempilha();
        int int73 = pilha65.tamanho();
        java.lang.Object[] objArray74 = pilha65.item;
        pilha50.item = objArray74;
        java.lang.Object obj76 = pilha50.desempilha();
        java.lang.Object[] objArray77 = pilha50.item;
        pilha13.empilha((java.lang.Object) objArray77);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha5.desempilha();
        boolean boolean13 = pilha5.vazia();
        pilha5.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        pilha16.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray22 = pilha16.item;
        java.lang.Object[] objArray23 = pilha16.item;
        java.lang.Object[] objArray24 = pilha16.item;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = pilha25.desempilha();
        pilha16.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray34 = pilha16.item;
        pilha16.topo = (short) 100;
        java.lang.Object[] objArray37 = pilha16.item;
        pilha5.empilha((java.lang.Object) objArray37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        pilha0.empilha(obj6);
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        boolean boolean17 = pilha9.vazia();
        int int18 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj20 = pilha9.desempilha();
        pilha9.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        java.lang.Object obj11 = pilha0.desempilha();
        pilha0.topo = 35;
        int int14 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (short) 0);
        int int8 = pilha4.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        pilha14.empilha((java.lang.Object) (byte) -1);
        pilha9.empilha((java.lang.Object) pilha14);
        pilha4.empilha((java.lang.Object) pilha14);
        pilha4.empilha((java.lang.Object) 2);
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        pilha29.empilha((java.lang.Object) (byte) -1);
        pilha24.empilha((java.lang.Object) pilha29);
        java.lang.Object[] objArray36 = pilha29.item;
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.topo = (short) 1;
        boolean boolean41 = pilha37.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.empilha((java.lang.Object) (short) 0);
        pilha42.empilha((java.lang.Object) (byte) -1);
        pilha37.empilha((java.lang.Object) pilha42);
        ds.Pilha pilha49 = new ds.Pilha();
        boolean boolean50 = pilha49.vazia();
        pilha49.topo = (short) 1;
        boolean boolean53 = pilha49.vazia();
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.empilha((java.lang.Object) (short) 0);
        pilha54.empilha((java.lang.Object) (byte) -1);
        pilha49.empilha((java.lang.Object) pilha54);
        java.lang.Object[] objArray61 = pilha54.item;
        pilha37.empilha((java.lang.Object) pilha54);
        ds.Pilha pilha63 = new ds.Pilha();
        boolean boolean64 = pilha63.vazia();
        pilha63.empilha((java.lang.Object) (short) 0);
        int int67 = pilha63.tamanho();
        pilha37.empilha((java.lang.Object) int67);
        pilha29.empilha((java.lang.Object) pilha37);
        pilha4.empilha((java.lang.Object) pilha37);
        java.lang.Object[] objArray71 = pilha4.item;
        java.lang.Object obj72 = pilha4.desempilha();
        java.lang.Class<?> wildcardClass73 = pilha4.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = 2;
        pilha15.topo = 0;
        boolean boolean38 = pilha15.vazia();
        java.lang.Class<?> wildcardClass39 = pilha15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) 1L);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha8.empilha(obj14);
        int int17 = pilha8.tamanho();
        java.lang.Object obj18 = pilha8.desempilha();
        java.lang.Object obj19 = pilha8.desempilha();
        java.lang.Object obj20 = pilha8.desempilha();
        java.lang.Object[] objArray21 = pilha8.item;
        pilha0.item = objArray21;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        int int27 = pilha23.tamanho();
        java.lang.Object obj28 = pilha23.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.topo = ' ';
        int int32 = pilha29.topo;
        java.lang.Object[] objArray33 = pilha29.item;
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.topo = (short) 1;
        boolean boolean38 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha34.topo = (-1);
        pilha29.empilha((java.lang.Object) pilha34);
        pilha23.empilha((java.lang.Object) pilha34);
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        java.lang.Object obj49 = pilha45.desempilha();
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.empilha((java.lang.Object) (short) 0);
        int int54 = pilha50.tamanho();
        boolean boolean55 = pilha50.vazia();
        ds.Pilha pilha56 = new ds.Pilha();
        boolean boolean57 = pilha56.vazia();
        pilha56.topo = (short) 1;
        int int60 = pilha56.tamanho();
        java.lang.Object[] objArray61 = pilha56.item;
        pilha50.item = objArray61;
        java.lang.Object[] objArray63 = pilha50.item;
        pilha45.item = objArray63;
        pilha23.empilha((java.lang.Object) objArray63);
        pilha0.empilha((java.lang.Object) pilha23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 0 + "'", obj28, (short) 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (short) 0 + "'", obj49, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray23 = pilha17.item;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha17.topo = 'a';
        java.lang.Object obj27 = pilha17.desempilha();
        boolean boolean28 = pilha17.vazia();
        pilha0.empilha((java.lang.Object) pilha17);
        boolean boolean30 = pilha17.vazia();
        java.lang.Object obj31 = pilha17.desempilha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        java.lang.Object[] objArray29 = pilha17.item;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.topo = (short) 1;
        boolean boolean34 = pilha30.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (short) 0);
        pilha35.empilha((java.lang.Object) (byte) -1);
        pilha30.empilha((java.lang.Object) pilha35);
        java.lang.Object[] objArray42 = pilha35.item;
        java.lang.Object[] objArray43 = pilha35.item;
        pilha17.item = objArray43;
        int int45 = pilha17.topo;
        java.lang.Object[] objArray46 = pilha17.item;
        boolean boolean47 = pilha17.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = 2;
        pilha15.topo = 0;
        boolean boolean38 = pilha15.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        pilha39.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = pilha39.desempilha();
        boolean boolean46 = pilha39.vazia();
        java.lang.Object obj47 = pilha39.desempilha();
        java.lang.Object[] objArray48 = pilha39.item;
        pilha15.item = objArray48;
        pilha15.topo = ' ';
        int int52 = pilha15.tamanho();
        java.lang.Object obj53 = pilha15.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) 0 + "'", obj47, (short) 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        pilha17.topo = (byte) 10;
        java.lang.Object obj30 = pilha17.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.topo = (short) 1;
        boolean boolean35 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha31.topo = (-1);
        boolean boolean40 = pilha31.vazia();
        int int41 = pilha31.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.topo = (short) 1;
        java.lang.Object obj46 = pilha42.desempilha();
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.empilha((java.lang.Object) (short) 0);
        int int51 = pilha47.tamanho();
        boolean boolean52 = pilha47.vazia();
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        pilha53.topo = (short) 1;
        int int57 = pilha53.tamanho();
        java.lang.Object[] objArray58 = pilha53.item;
        pilha47.item = objArray58;
        java.lang.Object[] objArray60 = pilha47.item;
        pilha42.item = objArray60;
        pilha31.item = objArray60;
        pilha17.item = objArray60;
        java.lang.Class<?> wildcardClass64 = pilha17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        int int33 = pilha29.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.topo = (short) 1;
        boolean boolean41 = pilha37.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.empilha((java.lang.Object) (short) 0);
        pilha42.empilha((java.lang.Object) (byte) -1);
        pilha37.empilha((java.lang.Object) pilha42);
        java.lang.Object[] objArray49 = pilha42.item;
        pilha34.item = objArray49;
        pilha29.item = objArray49;
        pilha29.topo = 0;
        pilha17.empilha((java.lang.Object) pilha29);
        java.lang.Class<?> wildcardClass55 = pilha17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object obj15 = pilha0.desempilha();
        int int16 = pilha0.tamanho();
        boolean boolean17 = pilha0.vazia();
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        pilha20.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray26 = pilha20.item;
        java.lang.Object[] objArray27 = pilha20.item;
        java.lang.Object[] objArray28 = pilha20.item;
        java.lang.Object[] objArray29 = pilha20.item;
        pilha0.item = objArray29;
        java.lang.Object obj31 = pilha0.desempilha();
        int int32 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.topo = (short) 1;
        boolean boolean39 = pilha35.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) (short) 0);
        pilha40.empilha((java.lang.Object) (byte) -1);
        pilha35.empilha((java.lang.Object) pilha40);
        java.lang.Object[] objArray47 = pilha40.item;
        java.lang.Object[] objArray48 = pilha40.item;
        boolean boolean49 = pilha40.vazia();
        java.lang.Object[] objArray50 = pilha40.item;
        ds.Pilha pilha51 = new ds.Pilha();
        boolean boolean52 = pilha51.vazia();
        pilha51.empilha((java.lang.Object) (short) 0);
        int int55 = pilha51.tamanho();
        ds.Pilha pilha56 = new ds.Pilha();
        boolean boolean57 = pilha56.vazia();
        pilha56.topo = (short) 1;
        boolean boolean60 = pilha56.vazia();
        ds.Pilha pilha61 = new ds.Pilha();
        boolean boolean62 = pilha61.vazia();
        pilha61.empilha((java.lang.Object) (short) 0);
        pilha61.empilha((java.lang.Object) (byte) -1);
        pilha56.empilha((java.lang.Object) pilha61);
        pilha51.empilha((java.lang.Object) pilha61);
        pilha51.topo = 'a';
        ds.Pilha pilha71 = new ds.Pilha();
        boolean boolean72 = pilha71.vazia();
        pilha71.empilha((java.lang.Object) (short) 0);
        pilha71.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray77 = pilha71.item;
        java.lang.Object[] objArray78 = pilha71.item;
        java.lang.Object[] objArray79 = pilha71.item;
        java.lang.Object[] objArray80 = pilha71.item;
        pilha51.item = objArray80;
        pilha40.item = objArray80;
        pilha0.empilha((java.lang.Object) objArray80);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 96 + "'", int32 == 96);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = 32;
        boolean boolean27 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        pilha0.topo = 35;
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray17 = pilha11.item;
        java.lang.Object[] objArray18 = pilha11.item;
        java.lang.Object[] objArray19 = pilha11.item;
        java.lang.Object[] objArray20 = pilha11.item;
        java.lang.Object obj21 = pilha11.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.topo = (short) 1;
        boolean boolean26 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha22.topo = (-1);
        boolean boolean31 = pilha22.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.topo = (short) 1;
        boolean boolean41 = pilha37.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.empilha((java.lang.Object) (short) 0);
        pilha42.empilha((java.lang.Object) (byte) -1);
        pilha37.empilha((java.lang.Object) pilha42);
        pilha32.empilha((java.lang.Object) pilha42);
        pilha32.topo = 'a';
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        pilha52.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray58 = pilha52.item;
        java.lang.Object[] objArray59 = pilha52.item;
        java.lang.Object[] objArray60 = pilha52.item;
        java.lang.Object[] objArray61 = pilha52.item;
        pilha32.item = objArray61;
        pilha32.topo = (-1);
        java.lang.Object[] objArray65 = pilha32.item;
        pilha22.item = objArray65;
        pilha11.item = objArray65;
        pilha0.item = objArray65;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        java.lang.Object obj30 = pilha17.desempilha();
        pilha17.topo = (short) 100;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        pilha33.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj39 = pilha33.desempilha();
        boolean boolean40 = pilha33.vazia();
        java.lang.Object obj41 = pilha33.desempilha();
        java.lang.Object[] objArray42 = pilha33.item;
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.topo = (short) 1;
        boolean boolean47 = pilha43.vazia();
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        pilha48.empilha((java.lang.Object) (short) 0);
        pilha48.empilha((java.lang.Object) (byte) -1);
        pilha43.empilha((java.lang.Object) pilha48);
        int int55 = pilha43.topo;
        java.lang.Object obj56 = new java.lang.Object();
        pilha43.empilha(obj56);
        pilha33.empilha(obj56);
        java.lang.Class<?> wildcardClass59 = obj56.getClass();
        pilha17.empilha((java.lang.Object) wildcardClass59);
        int int61 = pilha17.topo;
        java.lang.Object[] objArray62 = pilha17.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 0 + "'", obj41, (short) 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 101 + "'", int61 == 101);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        int int18 = pilha0.tamanho();
        java.lang.Object obj19 = pilha0.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        java.lang.Object obj24 = pilha20.desempilha();
        int int25 = pilha20.topo;
        pilha20.topo = (-1);
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.topo = (short) 1;
        boolean boolean32 = pilha28.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        pilha33.empilha((java.lang.Object) (byte) -1);
        pilha28.empilha((java.lang.Object) pilha33);
        java.lang.Object[] objArray40 = pilha33.item;
        java.lang.Object[] objArray41 = pilha33.item;
        boolean boolean42 = pilha33.vazia();
        java.lang.Object[] objArray43 = pilha33.item;
        pilha20.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        pilha45.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray51 = pilha45.item;
        java.lang.Object[] objArray52 = pilha45.item;
        pilha20.item = objArray52;
        pilha0.item = objArray52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray37 = pilha30.item;
        pilha13.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        pilha13.empilha((java.lang.Object) int43);
        pilha5.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray46 = pilha5.item;
        int int47 = pilha5.tamanho();
        pilha5.topo = (byte) 10;
        java.lang.Object[] objArray50 = pilha5.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        int int14 = pilha6.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pilha6.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        boolean boolean14 = pilha5.vazia();
        java.lang.Object[] objArray15 = pilha5.item;
        java.lang.Object[] objArray16 = pilha5.item;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        java.lang.Object obj29 = pilha22.desempilha();
        int int30 = pilha22.topo;
        java.lang.Object obj31 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        int int38 = pilha34.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.topo = (short) 1;
        boolean boolean46 = pilha42.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.empilha((java.lang.Object) (short) 0);
        pilha47.empilha((java.lang.Object) (byte) -1);
        pilha42.empilha((java.lang.Object) pilha47);
        java.lang.Object[] objArray54 = pilha47.item;
        pilha39.item = objArray54;
        pilha34.item = objArray54;
        pilha22.item = objArray54;
        pilha5.item = objArray54;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 0 + "'", obj31, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = ' ';
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        java.lang.Object obj17 = pilha13.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        int int22 = pilha18.tamanho();
        boolean boolean23 = pilha18.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        int int28 = pilha24.tamanho();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha18.item = objArray29;
        java.lang.Object[] objArray31 = pilha18.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        int int34 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass35 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        pilha20.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray26 = pilha20.item;
        java.lang.Object[] objArray27 = pilha20.item;
        java.lang.Object[] objArray28 = pilha20.item;
        java.lang.Object[] objArray29 = pilha20.item;
        pilha0.item = objArray29;
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.topo = (short) 1;
        boolean boolean35 = pilha31.vazia();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.empilha((java.lang.Object) (short) 0);
        pilha36.empilha((java.lang.Object) (byte) -1);
        pilha31.empilha((java.lang.Object) pilha36);
        java.lang.Object obj43 = pilha36.desempilha();
        int int44 = pilha36.topo;
        java.lang.Object obj45 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) 100.0f);
        int int48 = pilha36.tamanho();
        pilha0.empilha((java.lang.Object) pilha36);
        int int50 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 0 + "'", obj45, (short) 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 98 + "'", int50 == 98);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        boolean boolean10 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        int int19 = pilha13.topo;
        int int20 = pilha13.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.topo = (short) 1;
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (short) 0);
        pilha26.empilha((java.lang.Object) (byte) -1);
        pilha21.empilha((java.lang.Object) pilha26);
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.topo = (short) 1;
        boolean boolean37 = pilha33.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        pilha38.empilha((java.lang.Object) (byte) -1);
        pilha33.empilha((java.lang.Object) pilha38);
        java.lang.Object[] objArray45 = pilha38.item;
        pilha21.empilha((java.lang.Object) pilha38);
        pilha38.topo = '#';
        boolean boolean49 = pilha38.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        java.lang.Class<?> wildcardClass52 = pilha50.getClass();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Object[] objArray57 = new java.lang.Object[] { wildcardClass52, (short) 100, obj54, 1, 0L };
        pilha38.item = objArray57;
        pilha13.item = objArray57;
        int int60 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) pilha13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (short) 0);
        pilha6.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray12 = pilha6.item;
        java.lang.Object[] objArray13 = pilha6.item;
        int int14 = pilha6.tamanho();
        java.lang.Object obj15 = pilha6.desempilha();
        java.lang.Object[] objArray16 = pilha6.item;
        pilha0.item = objArray16;
        pilha0.topo = 4;
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = pilha20.desempilha();
        int int28 = pilha20.tamanho();
        java.lang.Object[] objArray29 = pilha20.item;
        pilha20.topo = (byte) 10;
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        pilha32.empilha((java.lang.Object) (byte) -1);
        int int38 = pilha32.topo;
        int int39 = pilha32.tamanho();
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        pilha45.empilha((java.lang.Object) (byte) -1);
        pilha40.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.topo = (short) 1;
        boolean boolean56 = pilha52.vazia();
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (short) 0);
        pilha57.empilha((java.lang.Object) (byte) -1);
        pilha52.empilha((java.lang.Object) pilha57);
        java.lang.Object[] objArray64 = pilha57.item;
        pilha40.empilha((java.lang.Object) pilha57);
        pilha57.topo = '#';
        boolean boolean68 = pilha57.vazia();
        ds.Pilha pilha69 = new ds.Pilha();
        boolean boolean70 = pilha69.vazia();
        java.lang.Class<?> wildcardClass71 = pilha69.getClass();
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Object[] objArray76 = new java.lang.Object[] { wildcardClass71, (short) 100, obj73, 1, 0L };
        pilha57.item = objArray76;
        pilha32.item = objArray76;
        pilha20.item = objArray76;
        ds.Pilha pilha80 = new ds.Pilha();
        boolean boolean81 = pilha80.vazia();
        pilha80.topo = (short) 1;
        boolean boolean84 = pilha80.vazia();
        java.lang.Object obj85 = pilha80.desempilha();
        pilha80.topo = (short) 10;
        java.lang.Object[] objArray88 = pilha80.item;
        pilha20.item = objArray88;
        pilha0.item = objArray88;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        pilha0.topo = 1;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        java.lang.Object obj17 = pilha13.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        int int22 = pilha18.tamanho();
        boolean boolean23 = pilha18.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        int int28 = pilha24.tamanho();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha18.item = objArray29;
        java.lang.Object[] objArray31 = pilha18.item;
        pilha13.item = objArray31;
        pilha0.item = objArray31;
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.topo = (short) 1;
        boolean boolean38 = pilha34.vazia();
        java.lang.Object obj39 = pilha34.desempilha();
        pilha34.topo = (short) 10;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.topo = (short) 1;
        boolean boolean46 = pilha42.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.empilha((java.lang.Object) (short) 0);
        pilha47.empilha((java.lang.Object) (byte) -1);
        pilha42.empilha((java.lang.Object) pilha47);
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.topo = (short) 1;
        boolean boolean58 = pilha54.vazia();
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        pilha59.empilha((java.lang.Object) (short) 0);
        pilha59.empilha((java.lang.Object) (byte) -1);
        pilha54.empilha((java.lang.Object) pilha59);
        java.lang.Object[] objArray66 = pilha59.item;
        pilha42.empilha((java.lang.Object) pilha59);
        pilha59.topo = '#';
        boolean boolean70 = pilha59.vazia();
        java.lang.Object[] objArray71 = pilha59.item;
        pilha34.item = objArray71;
        pilha0.item = objArray71;
        int int74 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.topo = (short) 1;
        boolean boolean12 = pilha8.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha8.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray32 = pilha25.item;
        pilha8.empilha((java.lang.Object) pilha25);
        pilha25.topo = '#';
        boolean boolean36 = pilha25.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        java.lang.Class<?> wildcardClass39 = pilha37.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Object[] objArray44 = new java.lang.Object[] { wildcardClass39, (short) 100, obj41, 1, 0L };
        pilha25.item = objArray44;
        pilha0.item = objArray44;
        java.lang.Object[] objArray47 = pilha0.item;
        java.lang.Object obj48 = pilha0.desempilha();
        int int49 = pilha0.tamanho();
        int int50 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 100 + "'", obj48, (short) 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = ' ';
        int int30 = pilha27.topo;
        java.lang.Object[] objArray31 = pilha27.item;
        pilha5.empilha((java.lang.Object) objArray31);
        java.lang.Object[] objArray33 = pilha5.item;
        int int34 = pilha5.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.topo = (short) 1;
        boolean boolean12 = pilha8.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha8.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray32 = pilha25.item;
        pilha8.empilha((java.lang.Object) pilha25);
        pilha25.topo = '#';
        boolean boolean36 = pilha25.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        java.lang.Class<?> wildcardClass39 = pilha37.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Object[] objArray44 = new java.lang.Object[] { wildcardClass39, (short) 100, obj41, 1, 0L };
        pilha25.item = objArray44;
        pilha0.item = objArray44;
        boolean boolean47 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (short) 0);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        int int17 = pilha13.tamanho();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha7.item = objArray18;
        java.lang.Object[] objArray20 = pilha7.item;
        pilha0.item = objArray20;
        boolean boolean22 = pilha0.vazia();
        boolean boolean23 = pilha0.vazia();
        pilha0.topo = 4;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        java.lang.Object obj31 = pilha26.desempilha();
        java.lang.Object[] objArray32 = pilha26.item;
        int int33 = pilha26.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) 1L);
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        boolean boolean44 = pilha40.vazia();
        java.lang.Object obj45 = pilha40.desempilha();
        java.lang.Object[] objArray46 = pilha40.item;
        pilha34.empilha((java.lang.Object) pilha40);
        java.lang.Object obj48 = pilha34.desempilha();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        pilha26.empilha(obj48);
        java.lang.Object[] objArray51 = pilha26.item;
        pilha0.item = objArray51;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) 1L);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha8.empilha(obj14);
        int int17 = pilha8.tamanho();
        java.lang.Object obj18 = pilha8.desempilha();
        java.lang.Object obj19 = pilha8.desempilha();
        java.lang.Object obj20 = pilha8.desempilha();
        java.lang.Object[] objArray21 = pilha8.item;
        pilha0.item = objArray21;
        int int23 = pilha0.topo;
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = pilha24.desempilha();
        int int32 = pilha24.tamanho();
        pilha24.topo = (short) 100;
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        pilha39.empilha((java.lang.Object) 1L);
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.topo = (short) 1;
        boolean boolean49 = pilha45.vazia();
        java.lang.Object obj50 = pilha45.desempilha();
        java.lang.Object[] objArray51 = pilha45.item;
        pilha39.empilha((java.lang.Object) pilha45);
        pilha35.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.topo = (short) 1;
        boolean boolean58 = pilha54.vazia();
        pilha54.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = pilha54.desempilha();
        int int62 = pilha54.tamanho();
        java.lang.Object[] objArray63 = pilha54.item;
        pilha39.item = objArray63;
        pilha24.item = objArray63;
        java.lang.Object[] objArray66 = pilha24.item;
        pilha0.empilha((java.lang.Object) pilha24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        boolean boolean14 = pilha5.vazia();
        java.lang.Object[] objArray15 = pilha5.item;
        java.lang.Object[] objArray16 = pilha5.item;
        pilha5.topo = 4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object obj12 = pilha0.desempilha();
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        java.lang.Object[] objArray20 = pilha0.item;
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (short) 0);
        pilha21.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray27 = pilha21.item;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha0.empilha((java.lang.Object) objArray28);
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        int int34 = pilha30.tamanho();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        boolean boolean42 = pilha38.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (short) 0);
        pilha43.empilha((java.lang.Object) (byte) -1);
        pilha38.empilha((java.lang.Object) pilha43);
        java.lang.Object[] objArray50 = pilha43.item;
        pilha35.item = objArray50;
        pilha30.item = objArray50;
        int int53 = pilha30.topo;
        java.lang.Object[] objArray54 = pilha30.item;
        java.lang.Class<?> wildcardClass55 = pilha30.getClass();
        pilha0.empilha((java.lang.Object) pilha30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        int int33 = pilha29.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.topo = (short) 1;
        boolean boolean41 = pilha37.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.empilha((java.lang.Object) (short) 0);
        pilha42.empilha((java.lang.Object) (byte) -1);
        pilha37.empilha((java.lang.Object) pilha42);
        java.lang.Object[] objArray49 = pilha42.item;
        pilha34.item = objArray49;
        pilha29.item = objArray49;
        pilha29.topo = 0;
        pilha17.empilha((java.lang.Object) pilha29);
        boolean boolean55 = pilha29.vazia();
        java.lang.Class<?> wildcardClass56 = pilha29.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        int int15 = pilha0.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        pilha16.empilha((java.lang.Object) 1L);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        pilha16.empilha(obj22);
        pilha16.topo = (byte) 1;
        java.lang.Object[] objArray27 = pilha16.item;
        pilha0.empilha((java.lang.Object) objArray27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = ' ';
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = 52;
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        java.lang.Class<?> wildcardClass31 = pilha29.getClass();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object[] objArray36 = new java.lang.Object[] { wildcardClass31, (short) 100, obj33, 1, 0L };
        pilha17.item = objArray36;
        pilha17.topo = '4';
        java.lang.Object[] objArray40 = pilha17.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = 32;
        java.lang.Object obj27 = null;
        pilha0.empilha(obj27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha5.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray25 = pilha18.item;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (short) 0);
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha26.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        boolean boolean42 = pilha38.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (short) 0);
        pilha43.empilha((java.lang.Object) (byte) -1);
        pilha38.empilha((java.lang.Object) pilha43);
        java.lang.Object[] objArray50 = pilha43.item;
        pilha26.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        int int56 = pilha52.tamanho();
        pilha26.empilha((java.lang.Object) int56);
        pilha18.empilha((java.lang.Object) pilha26);
        pilha5.empilha((java.lang.Object) pilha26);
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.topo = ' ';
        int int63 = pilha60.topo;
        java.lang.Object[] objArray64 = pilha60.item;
        int int65 = pilha60.tamanho();
        int int66 = pilha60.tamanho();
        java.lang.Object[] objArray67 = pilha60.item;
        pilha26.item = objArray67;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 32 + "'", int65 == 32);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.topo = (short) 1;
        boolean boolean11 = pilha7.vazia();
        boolean boolean12 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) pilha7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.empilha((java.lang.Object) '4');
        int int19 = pilha14.tamanho();
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.topo = ' ';
        int int24 = pilha21.topo;
        java.lang.Object[] objArray25 = pilha21.item;
        int int26 = pilha21.topo;
        pilha21.empilha((java.lang.Object) (byte) 100);
        java.lang.Object obj29 = pilha21.desempilha();
        int int30 = pilha21.tamanho();
        java.lang.Object[] objArray31 = pilha21.item;
        pilha14.empilha((java.lang.Object) objArray31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 100 + "'", obj29, (byte) 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        int int30 = pilha17.topo;
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (short) 0);
        pilha31.empilha((java.lang.Object) 1L);
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.topo = (short) 1;
        boolean boolean41 = pilha37.vazia();
        java.lang.Object obj42 = pilha37.desempilha();
        java.lang.Object[] objArray43 = pilha37.item;
        pilha31.empilha((java.lang.Object) pilha37);
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        int int49 = pilha45.tamanho();
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.topo = (short) 1;
        boolean boolean54 = pilha50.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        boolean boolean56 = pilha55.vazia();
        pilha55.empilha((java.lang.Object) (short) 0);
        pilha55.empilha((java.lang.Object) (byte) -1);
        pilha50.empilha((java.lang.Object) pilha55);
        pilha45.empilha((java.lang.Object) pilha55);
        pilha45.topo = 'a';
        ds.Pilha pilha65 = new ds.Pilha();
        boolean boolean66 = pilha65.vazia();
        pilha65.empilha((java.lang.Object) (short) 0);
        pilha65.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray71 = pilha65.item;
        java.lang.Object[] objArray72 = pilha65.item;
        java.lang.Object[] objArray73 = pilha65.item;
        java.lang.Object[] objArray74 = pilha65.item;
        pilha45.item = objArray74;
        pilha31.item = objArray74;
        java.lang.Object[] objArray77 = pilha31.item;
        pilha17.item = objArray77;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        java.lang.Class<?> wildcardClass13 = pilha9.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = pilha0.desempilha();
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class ds.Pilha");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        int int9 = pilha5.tamanho();
        boolean boolean10 = pilha5.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        int int15 = pilha11.tamanho();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha5.item = objArray16;
        java.lang.Object[] objArray18 = pilha5.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.topo = (short) 1;
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (short) 0);
        pilha26.empilha((java.lang.Object) (byte) -1);
        pilha21.empilha((java.lang.Object) pilha26);
        java.lang.Object[] objArray33 = pilha26.item;
        java.lang.Object[] objArray34 = pilha26.item;
        boolean boolean35 = pilha26.vazia();
        java.lang.Object[] objArray36 = pilha26.item;
        pilha0.empilha((java.lang.Object) objArray36);
        boolean boolean38 = pilha0.vazia();
        java.lang.Class<?> wildcardClass39 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.topo = (short) 1;
        boolean boolean18 = pilha14.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (short) 0);
        pilha19.empilha((java.lang.Object) (byte) -1);
        pilha14.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray26 = pilha19.item;
        pilha19.topo = 36;
        pilha5.empilha((java.lang.Object) 36);
        int int30 = pilha5.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = 99;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (short) 0);
        pilha4.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray10 = pilha4.item;
        java.lang.Object[] objArray11 = pilha4.item;
        pilha4.topo = 'a';
        pilha4.topo = 32;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        java.lang.Object obj21 = pilha16.desempilha();
        java.lang.Object[] objArray22 = pilha16.item;
        pilha4.item = objArray22;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.topo = ' ';
        int int27 = pilha24.topo;
        java.lang.Object[] objArray28 = pilha24.item;
        pilha4.item = objArray28;
        pilha0.empilha((java.lang.Object) objArray28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 0 + "'", obj21, (short) 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        int int25 = pilha0.tamanho();
        java.lang.Object obj26 = pilha0.desempilha();
        pilha0.topo = '4';
        boolean boolean29 = pilha0.vazia();
        boolean boolean30 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        java.lang.Object obj15 = pilha11.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        boolean boolean21 = pilha16.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.topo = (short) 1;
        int int26 = pilha22.tamanho();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha16.item = objArray27;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha11.item = objArray29;
        pilha0.item = objArray29;
        int int32 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        int int24 = pilha0.topo;
        java.lang.Object[] objArray25 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 100;
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray29 = pilha23.item;
        java.lang.Object[] objArray30 = pilha23.item;
        pilha23.topo = 'a';
        pilha23.topo = 32;
        int int35 = pilha23.tamanho();
        pilha23.topo = (byte) 1;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        int int42 = pilha38.tamanho();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.topo = (short) 1;
        boolean boolean47 = pilha43.vazia();
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        pilha48.empilha((java.lang.Object) (short) 0);
        pilha48.empilha((java.lang.Object) (byte) -1);
        pilha43.empilha((java.lang.Object) pilha48);
        pilha38.empilha((java.lang.Object) pilha48);
        pilha23.empilha((java.lang.Object) pilha38);
        pilha0.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha58 = new ds.Pilha();
        boolean boolean59 = pilha58.vazia();
        pilha58.empilha((java.lang.Object) (short) 0);
        pilha58.empilha((java.lang.Object) 1L);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        pilha58.empilha(obj64);
        pilha58.topo = (byte) 1;
        java.lang.Object[] objArray69 = pilha58.item;
        pilha23.item = objArray69;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 100 + "'", obj8, (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        int int15 = pilha0.topo;
        pilha0.topo = 4;
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (short) 0);
        int int23 = pilha19.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        pilha29.empilha((java.lang.Object) (byte) -1);
        pilha24.empilha((java.lang.Object) pilha29);
        pilha19.empilha((java.lang.Object) pilha29);
        pilha19.topo = 'a';
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        pilha39.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray45 = pilha39.item;
        java.lang.Object[] objArray46 = pilha39.item;
        java.lang.Object[] objArray47 = pilha39.item;
        java.lang.Object[] objArray48 = pilha39.item;
        pilha19.item = objArray48;
        java.lang.Object obj50 = pilha19.desempilha();
        int int51 = pilha19.tamanho();
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Class<?> wildcardClass53 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 96 + "'", int51 == 96);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) 2);
        int int20 = pilha0.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (short) 0);
        pilha21.empilha((java.lang.Object) 1L);
        boolean boolean27 = pilha21.vazia();
        pilha21.topo = ' ';
        java.lang.Object obj30 = pilha21.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = ' ';
        java.lang.Object obj34 = pilha31.desempilha();
        java.lang.Object[] objArray35 = pilha31.item;
        pilha21.empilha((java.lang.Object) pilha31);
        pilha0.empilha((java.lang.Object) pilha31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        int int9 = pilha5.tamanho();
        boolean boolean10 = pilha5.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        int int15 = pilha11.tamanho();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha5.item = objArray16;
        java.lang.Object[] objArray18 = pilha5.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        boolean boolean21 = pilha0.vazia();
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        int int26 = pilha17.tamanho();
        pilha17.topo = 3;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        int int17 = pilha0.topo;
        pilha0.topo = (short) 100;
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        pilha20.empilha((java.lang.Object) 1L);
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        java.lang.Object obj31 = pilha26.desempilha();
        java.lang.Object[] objArray32 = pilha26.item;
        pilha20.empilha((java.lang.Object) pilha26);
        boolean boolean34 = pilha20.vazia();
        java.lang.Object[] objArray35 = pilha20.item;
        java.lang.Object[] objArray36 = pilha20.item;
        pilha0.empilha((java.lang.Object) pilha20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = 2;
        pilha15.topo = 35;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        pilha38.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray44 = pilha38.item;
        java.lang.Object[] objArray45 = pilha38.item;
        pilha38.topo = 'a';
        pilha38.topo = 32;
        int int50 = pilha38.tamanho();
        pilha38.topo = (byte) 1;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        pilha53.empilha((java.lang.Object) (short) 0);
        int int57 = pilha53.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        boolean boolean59 = pilha58.vazia();
        pilha58.topo = (short) 1;
        boolean boolean62 = pilha58.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        boolean boolean64 = pilha63.vazia();
        pilha63.empilha((java.lang.Object) (short) 0);
        pilha63.empilha((java.lang.Object) (byte) -1);
        pilha58.empilha((java.lang.Object) pilha63);
        pilha53.empilha((java.lang.Object) pilha63);
        pilha38.empilha((java.lang.Object) pilha53);
        int int72 = pilha38.tamanho();
        pilha15.empilha((java.lang.Object) pilha38);
        int int74 = pilha38.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) (short) 1);
        int int12 = pilha9.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha13.topo = (-1);
        boolean boolean22 = pilha13.vazia();
        java.lang.Object[] objArray23 = pilha13.item;
        java.lang.Object[] objArray24 = pilha13.item;
        pilha9.item = objArray24;
        pilha0.item = objArray24;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = (-1);
        pilha0.topo = 4;
        pilha0.topo = 98;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = (-1);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.topo = (short) 1;
        boolean boolean12 = pilha8.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray20 = pilha13.item;
        java.lang.Object[] objArray21 = pilha13.item;
        boolean boolean22 = pilha13.vazia();
        java.lang.Object[] objArray23 = pilha13.item;
        pilha0.item = objArray23;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray31 = pilha25.item;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha0.item = objArray32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.topo = 10;
        pilha0.topo = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        pilha0.topo = 35;
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        pilha5.topo = (byte) 1;
        int int29 = pilha5.topo;
        java.lang.Class<?> wildcardClass30 = pilha5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        pilha5.topo = (byte) 1;
        java.lang.Object obj29 = pilha5.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 0 + "'", obj29, (short) 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha34);
        java.lang.Object[] objArray41 = pilha34.item;
        pilha17.empilha((java.lang.Object) pilha34);
        pilha34.topo = '#';
        boolean boolean45 = pilha34.vazia();
        java.lang.Object[] objArray46 = pilha34.item;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.topo = (short) 1;
        boolean boolean51 = pilha47.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        pilha52.empilha((java.lang.Object) (byte) -1);
        pilha47.empilha((java.lang.Object) pilha52);
        java.lang.Object[] objArray59 = pilha52.item;
        java.lang.Object[] objArray60 = pilha52.item;
        pilha34.item = objArray60;
        pilha0.empilha((java.lang.Object) pilha34);
        boolean boolean63 = pilha34.vazia();
        int int64 = pilha34.tamanho();
        ds.Pilha pilha65 = new ds.Pilha();
        boolean boolean66 = pilha65.vazia();
        pilha65.empilha((java.lang.Object) (short) 0);
        pilha65.empilha((java.lang.Object) 1L);
        boolean boolean71 = pilha65.vazia();
        pilha65.topo = ' ';
        java.lang.Object obj74 = pilha65.desempilha();
        ds.Pilha pilha75 = new ds.Pilha();
        pilha75.topo = ' ';
        java.lang.Object obj78 = pilha75.desempilha();
        java.lang.Object[] objArray79 = pilha75.item;
        pilha65.empilha((java.lang.Object) pilha75);
        java.lang.Object[] objArray81 = pilha65.item;
        pilha34.empilha((java.lang.Object) objArray81);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray23 = pilha17.item;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha17.topo = 'a';
        java.lang.Object obj27 = pilha17.desempilha();
        boolean boolean28 = pilha17.vazia();
        pilha0.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray30 = pilha0.item;
        boolean boolean31 = pilha0.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        int int42 = pilha38.tamanho();
        java.lang.Object[] objArray43 = pilha38.item;
        pilha32.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.topo = (short) 1;
        boolean boolean49 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = pilha45.desempilha();
        int int53 = pilha45.tamanho();
        java.lang.Object[] objArray54 = pilha45.item;
        pilha32.item = objArray54;
        java.lang.Object[] objArray56 = pilha32.item;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.topo = (short) 1;
        java.lang.Object obj61 = pilha57.desempilha();
        ds.Pilha pilha62 = new ds.Pilha();
        boolean boolean63 = pilha62.vazia();
        pilha62.empilha((java.lang.Object) (short) 0);
        int int66 = pilha62.tamanho();
        boolean boolean67 = pilha62.vazia();
        ds.Pilha pilha68 = new ds.Pilha();
        boolean boolean69 = pilha68.vazia();
        pilha68.topo = (short) 1;
        int int72 = pilha68.tamanho();
        java.lang.Object[] objArray73 = pilha68.item;
        pilha62.item = objArray73;
        java.lang.Object[] objArray75 = pilha62.item;
        pilha57.item = objArray75;
        pilha32.item = objArray75;
        pilha0.item = objArray75;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) -1 + "'", obj52, (byte) -1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        pilha0.empilha(obj6);
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object obj11 = pilha0.desempilha();
        pilha0.topo = (short) 1;
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        java.lang.Object obj12 = pilha0.desempilha();
        java.lang.Object obj13 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        boolean boolean18 = pilha9.vazia();
        boolean boolean19 = pilha9.vazia();
        pilha9.topo = 10;
        boolean boolean22 = pilha9.vazia();
        boolean boolean23 = pilha9.vazia();
        int int24 = pilha9.tamanho();
        java.lang.Object obj25 = pilha9.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        pilha0.item = objArray43;
        int int46 = pilha0.tamanho();
        java.lang.Object obj47 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 100;
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray29 = pilha23.item;
        java.lang.Object[] objArray30 = pilha23.item;
        pilha23.topo = 'a';
        pilha23.topo = 32;
        int int35 = pilha23.tamanho();
        pilha23.topo = (byte) 1;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        int int42 = pilha38.tamanho();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.topo = (short) 1;
        boolean boolean47 = pilha43.vazia();
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        pilha48.empilha((java.lang.Object) (short) 0);
        pilha48.empilha((java.lang.Object) (byte) -1);
        pilha43.empilha((java.lang.Object) pilha48);
        pilha38.empilha((java.lang.Object) pilha48);
        pilha23.empilha((java.lang.Object) pilha38);
        pilha0.empilha((java.lang.Object) pilha23);
        boolean boolean58 = pilha23.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        boolean boolean18 = pilha9.vazia();
        boolean boolean19 = pilha9.vazia();
        pilha9.topo = 10;
        pilha9.topo = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean6 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        boolean boolean17 = pilha11.vazia();
        java.lang.Object obj18 = pilha11.desempilha();
        int int19 = pilha11.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) 1L);
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        java.lang.Object obj29 = pilha24.desempilha();
        java.lang.Object[] objArray30 = pilha24.item;
        pilha18.empilha((java.lang.Object) pilha24);
        pilha11.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.topo = ' ';
        int int36 = pilha33.topo;
        java.lang.Object[] objArray37 = pilha33.item;
        pilha11.empilha((java.lang.Object) objArray37);
        java.lang.Object[] objArray39 = pilha11.item;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.topo = (short) 1;
        boolean boolean8 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (byte) -1);
        pilha4.topo = (-1);
        boolean boolean13 = pilha4.vazia();
        java.lang.Object[] objArray14 = pilha4.item;
        java.lang.Object[] objArray15 = pilha4.item;
        pilha0.item = objArray15;
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        int int31 = pilha27.tamanho();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha12.item = objArray32;
        pilha12.topo = 3;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.topo = (short) 1;
        java.lang.Object[] objArray40 = pilha36.item;
        java.lang.Object[] objArray41 = pilha36.item;
        pilha12.empilha((java.lang.Object) pilha36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        boolean boolean31 = pilha27.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        pilha32.empilha((java.lang.Object) (byte) -1);
        pilha27.empilha((java.lang.Object) pilha32);
        java.lang.Object[] objArray39 = pilha32.item;
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        pilha45.empilha((java.lang.Object) (byte) -1);
        pilha40.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.topo = (short) 1;
        boolean boolean56 = pilha52.vazia();
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (short) 0);
        pilha57.empilha((java.lang.Object) (byte) -1);
        pilha52.empilha((java.lang.Object) pilha57);
        java.lang.Object[] objArray64 = pilha57.item;
        pilha40.empilha((java.lang.Object) pilha57);
        ds.Pilha pilha66 = new ds.Pilha();
        boolean boolean67 = pilha66.vazia();
        pilha66.empilha((java.lang.Object) (short) 0);
        int int70 = pilha66.tamanho();
        pilha40.empilha((java.lang.Object) int70);
        pilha32.empilha((java.lang.Object) pilha40);
        java.lang.Object[] objArray73 = pilha32.item;
        pilha12.item = objArray73;
        java.lang.Class<?> wildcardClass75 = pilha12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = (-1);
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (short) 0);
        pilha7.empilha((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass13 = pilha7.getClass();
        pilha0.empilha((java.lang.Object) pilha7);
        pilha0.topo = 35;
        pilha0.topo = (short) 100;
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (short) 0);
        pilha19.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray25 = pilha19.item;
        java.lang.Object[] objArray26 = pilha19.item;
        java.lang.Object[] objArray27 = pilha19.item;
        java.lang.Object[] objArray28 = pilha19.item;
        pilha19.topo = 100;
        java.lang.Object obj31 = pilha19.desempilha();
        java.lang.Object[] objArray32 = pilha19.item;
        pilha0.empilha((java.lang.Object) objArray32);
        java.lang.Object obj34 = null;
        pilha0.empilha(obj34);
        java.lang.Class<?> wildcardClass36 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (short) 0);
        pilha4.empilha((java.lang.Object) 1L);
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.topo = (short) 1;
        boolean boolean14 = pilha10.vazia();
        java.lang.Object obj15 = pilha10.desempilha();
        java.lang.Object[] objArray16 = pilha10.item;
        pilha4.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object[] objArray19 = pilha0.item;
        pilha0.topo = (short) -1;
        java.lang.Object[] objArray22 = pilha0.item;
        java.lang.Object[] objArray23 = pilha0.item;
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        int int28 = pilha24.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha34);
        pilha24.empilha((java.lang.Object) pilha34);
        pilha24.empilha((java.lang.Object) 2);
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.topo = (short) 1;
        boolean boolean48 = pilha44.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        boolean boolean50 = pilha49.vazia();
        pilha49.empilha((java.lang.Object) (short) 0);
        pilha49.empilha((java.lang.Object) (byte) -1);
        pilha44.empilha((java.lang.Object) pilha49);
        java.lang.Object[] objArray56 = pilha49.item;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.topo = (short) 1;
        boolean boolean61 = pilha57.vazia();
        ds.Pilha pilha62 = new ds.Pilha();
        boolean boolean63 = pilha62.vazia();
        pilha62.empilha((java.lang.Object) (short) 0);
        pilha62.empilha((java.lang.Object) (byte) -1);
        pilha57.empilha((java.lang.Object) pilha62);
        ds.Pilha pilha69 = new ds.Pilha();
        boolean boolean70 = pilha69.vazia();
        pilha69.topo = (short) 1;
        boolean boolean73 = pilha69.vazia();
        ds.Pilha pilha74 = new ds.Pilha();
        boolean boolean75 = pilha74.vazia();
        pilha74.empilha((java.lang.Object) (short) 0);
        pilha74.empilha((java.lang.Object) (byte) -1);
        pilha69.empilha((java.lang.Object) pilha74);
        java.lang.Object[] objArray81 = pilha74.item;
        pilha57.empilha((java.lang.Object) pilha74);
        ds.Pilha pilha83 = new ds.Pilha();
        boolean boolean84 = pilha83.vazia();
        pilha83.empilha((java.lang.Object) (short) 0);
        int int87 = pilha83.tamanho();
        pilha57.empilha((java.lang.Object) int87);
        pilha49.empilha((java.lang.Object) pilha57);
        pilha24.empilha((java.lang.Object) pilha57);
        boolean boolean91 = pilha24.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) boolean91);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        java.lang.Object[] objArray29 = pilha17.item;
        int int30 = pilha17.tamanho();
        java.lang.Object obj31 = pilha17.desempilha();
        boolean boolean32 = pilha17.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        boolean boolean14 = pilha5.vazia();
        java.lang.Object[] objArray15 = pilha5.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (short) 0);
        pilha21.empilha((java.lang.Object) (byte) -1);
        pilha16.empilha((java.lang.Object) pilha21);
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.topo = (short) 1;
        boolean boolean32 = pilha28.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        pilha33.empilha((java.lang.Object) (byte) -1);
        pilha28.empilha((java.lang.Object) pilha33);
        java.lang.Object[] objArray40 = pilha33.item;
        pilha16.empilha((java.lang.Object) pilha33);
        pilha33.topo = '#';
        pilha33.topo = (byte) 10;
        java.lang.Object obj46 = pilha33.desempilha();
        boolean boolean47 = pilha33.vazia();
        pilha5.empilha((java.lang.Object) boolean47);
        java.lang.Object obj49 = pilha5.desempilha();
        pilha5.topo = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + false + "'", obj49, false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        int int9 = pilha5.tamanho();
        boolean boolean10 = pilha5.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        int int15 = pilha11.tamanho();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha5.item = objArray16;
        java.lang.Object[] objArray18 = pilha5.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        boolean boolean21 = pilha0.vazia();
        java.lang.Object[] objArray22 = pilha0.item;
        java.lang.Object[] objArray23 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray37 = pilha30.item;
        pilha13.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        pilha13.empilha((java.lang.Object) int43);
        pilha5.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray46 = pilha13.item;
        pilha13.topo = (byte) 1;
        pilha13.topo = (short) 1;
        pilha13.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        int int24 = pilha20.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        pilha20.empilha((java.lang.Object) pilha30);
        pilha20.topo = 'a';
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) (short) 0);
        pilha40.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray46 = pilha40.item;
        java.lang.Object[] objArray47 = pilha40.item;
        java.lang.Object[] objArray48 = pilha40.item;
        java.lang.Object[] objArray49 = pilha40.item;
        pilha20.item = objArray49;
        pilha20.topo = (-1);
        java.lang.Object[] objArray53 = pilha20.item;
        pilha0.empilha((java.lang.Object) pilha20);
        pilha0.topo = 96;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = pilha8.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        pilha0.topo = '4';
        java.lang.Object obj19 = pilha0.desempilha();
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        int int31 = pilha27.tamanho();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha12.item = objArray32;
        pilha12.topo = 3;
        int int36 = pilha12.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        boolean boolean14 = pilha5.vazia();
        java.lang.Object[] objArray15 = pilha5.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        java.lang.Object obj21 = pilha16.desempilha();
        int int22 = pilha16.tamanho();
        pilha16.topo = 1;
        java.lang.Object[] objArray25 = pilha16.item;
        pilha5.empilha((java.lang.Object) pilha16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 0 + "'", obj21, (short) 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        int int30 = pilha17.tamanho();
        java.lang.Object[] objArray31 = pilha17.item;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = ' ';
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha17.item = objArray36;
        int int38 = pilha17.tamanho();
        java.lang.Object obj39 = pilha17.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (short) 0);
        pilha21.empilha((java.lang.Object) (byte) -1);
        pilha16.empilha((java.lang.Object) pilha21);
        java.lang.Object[] objArray28 = pilha21.item;
        pilha13.item = objArray28;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray36 = pilha30.item;
        java.lang.Object[] objArray37 = pilha30.item;
        pilha30.topo = 'a';
        java.lang.Object obj40 = pilha30.desempilha();
        boolean boolean41 = pilha30.vazia();
        pilha13.empilha((java.lang.Object) pilha30);
        pilha0.empilha((java.lang.Object) pilha13);
        int int44 = pilha13.tamanho();
        java.lang.Object[] objArray45 = pilha13.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        boolean boolean31 = pilha27.vazia();
        java.lang.Object obj32 = pilha27.desempilha();
        java.lang.Object[] objArray33 = pilha27.item;
        pilha12.item = objArray33;
        pilha12.topo = 52;
        boolean boolean37 = pilha12.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha0.item = objArray25;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray28 = pilha22.item;
        pilha0.item = objArray28;
        pilha0.topo = (-1);
        int int32 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.topo = ' ';
        int int9 = pilha6.topo;
        java.lang.Object[] objArray10 = pilha6.item;
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        boolean boolean15 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha11.topo = (-1);
        pilha6.empilha((java.lang.Object) pilha11);
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        int int32 = pilha20.topo;
        java.lang.Object obj33 = new java.lang.Object();
        pilha20.empilha(obj33);
        pilha0.empilha(obj33);
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.empilha((java.lang.Object) (short) 0);
        int int40 = pilha36.tamanho();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.topo = (short) 1;
        boolean boolean48 = pilha44.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        boolean boolean50 = pilha49.vazia();
        pilha49.empilha((java.lang.Object) (short) 0);
        pilha49.empilha((java.lang.Object) (byte) -1);
        pilha44.empilha((java.lang.Object) pilha49);
        java.lang.Object[] objArray56 = pilha49.item;
        pilha41.item = objArray56;
        pilha36.item = objArray56;
        pilha0.item = objArray56;
        int int60 = pilha0.tamanho();
        boolean boolean61 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.topo = ' ';
        java.lang.Object obj13 = pilha10.desempilha();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        pilha16.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray22 = pilha16.item;
        java.lang.Object[] objArray23 = pilha16.item;
        java.lang.Object[] objArray24 = pilha16.item;
        java.lang.Object[] objArray25 = pilha16.item;
        pilha16.topo = 100;
        java.lang.Object obj28 = pilha16.desempilha();
        java.lang.Object[] objArray29 = pilha16.item;
        pilha0.item = objArray29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) false);
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray34 = pilha15.item;
        java.lang.Object obj35 = pilha15.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        pilha0.item = objArray43;
        boolean boolean46 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = '#';
        java.lang.Object obj51 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass52 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        java.lang.Object obj25 = pilha0.desempilha();
        int int26 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        pilha0.empilha((java.lang.Object) (short) 100);
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        int int9 = pilha5.tamanho();
        boolean boolean10 = pilha5.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        int int15 = pilha11.tamanho();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha5.item = objArray16;
        java.lang.Object[] objArray18 = pilha5.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        boolean boolean21 = pilha0.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.topo = (short) 1;
        boolean boolean26 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj29 = pilha22.desempilha();
        int int30 = pilha22.tamanho();
        pilha22.topo = (short) 100;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.empilha((java.lang.Object) (short) 0);
        pilha37.empilha((java.lang.Object) 1L);
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.topo = (short) 1;
        boolean boolean47 = pilha43.vazia();
        java.lang.Object obj48 = pilha43.desempilha();
        java.lang.Object[] objArray49 = pilha43.item;
        pilha37.empilha((java.lang.Object) pilha43);
        pilha33.empilha((java.lang.Object) pilha37);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.topo = (short) 1;
        boolean boolean56 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = pilha52.desempilha();
        int int60 = pilha52.tamanho();
        java.lang.Object[] objArray61 = pilha52.item;
        pilha37.item = objArray61;
        pilha22.item = objArray61;
        pilha0.empilha((java.lang.Object) objArray61);
        java.lang.Object[] objArray65 = pilha0.item;
        int int66 = pilha0.topo;
        pilha0.topo = (byte) 1;
        boolean boolean69 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) -1 + "'", obj59, (byte) -1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        pilha0.topo = 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        int int30 = pilha17.tamanho();
        java.lang.Object[] objArray31 = pilha17.item;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.topo = ' ';
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha17.item = objArray36;
        int int38 = pilha17.topo;
        java.lang.Object obj39 = pilha17.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        int int28 = pilha0.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        java.lang.Object obj33 = pilha29.desempilha();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        int int38 = pilha34.tamanho();
        boolean boolean39 = pilha34.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        int int44 = pilha40.tamanho();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha34.item = objArray45;
        java.lang.Object[] objArray47 = pilha34.item;
        pilha29.item = objArray47;
        int int49 = pilha29.tamanho();
        boolean boolean50 = pilha29.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        boolean boolean52 = pilha51.vazia();
        pilha51.topo = (short) 1;
        boolean boolean55 = pilha51.vazia();
        pilha51.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = pilha51.desempilha();
        int int59 = pilha51.tamanho();
        pilha51.topo = (short) 100;
        ds.Pilha pilha62 = new ds.Pilha();
        boolean boolean63 = pilha62.vazia();
        pilha62.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha66 = new ds.Pilha();
        boolean boolean67 = pilha66.vazia();
        pilha66.empilha((java.lang.Object) (short) 0);
        pilha66.empilha((java.lang.Object) 1L);
        ds.Pilha pilha72 = new ds.Pilha();
        boolean boolean73 = pilha72.vazia();
        pilha72.topo = (short) 1;
        boolean boolean76 = pilha72.vazia();
        java.lang.Object obj77 = pilha72.desempilha();
        java.lang.Object[] objArray78 = pilha72.item;
        pilha66.empilha((java.lang.Object) pilha72);
        pilha62.empilha((java.lang.Object) pilha66);
        ds.Pilha pilha81 = new ds.Pilha();
        boolean boolean82 = pilha81.vazia();
        pilha81.topo = (short) 1;
        boolean boolean85 = pilha81.vazia();
        pilha81.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj88 = pilha81.desempilha();
        int int89 = pilha81.tamanho();
        java.lang.Object[] objArray90 = pilha81.item;
        pilha66.item = objArray90;
        pilha51.item = objArray90;
        pilha29.empilha((java.lang.Object) objArray90);
        pilha0.empilha((java.lang.Object) objArray90);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) -1 + "'", obj58, (byte) -1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + (byte) -1 + "'", obj88, (byte) -1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(objArray90);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 100;
        pilha0.topo = 100;
        pilha0.topo = 11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        pilha17.topo = (-1);
        pilha17.topo = '#';
        int int34 = pilha17.tamanho();
        pilha17.topo = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.topo = (short) 1;
        boolean boolean14 = pilha10.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        pilha15.empilha((java.lang.Object) (byte) -1);
        pilha10.empilha((java.lang.Object) pilha15);
        int int22 = pilha10.topo;
        java.lang.Object obj23 = new java.lang.Object();
        pilha10.empilha(obj23);
        pilha0.empilha(obj23);
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (short) 0);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.topo = (short) 1;
        int int36 = pilha32.tamanho();
        java.lang.Object[] objArray37 = pilha32.item;
        pilha26.item = objArray37;
        pilha0.item = objArray37;
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) (short) 0);
        pilha40.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray46 = pilha40.item;
        java.lang.Object[] objArray47 = pilha40.item;
        int int48 = pilha40.topo;
        pilha40.topo = (byte) 10;
        java.lang.Object[] objArray51 = pilha40.item;
        pilha0.empilha((java.lang.Object) objArray51);
        boolean boolean53 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        java.lang.Object[] objArray10 = pilha8.item;
        pilha8.empilha((java.lang.Object) '4');
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.topo = (short) 1;
        boolean boolean18 = pilha14.vazia();
        java.lang.Object obj19 = pilha14.desempilha();
        pilha14.topo = (short) 10;
        int int22 = pilha14.topo;
        int int23 = pilha14.tamanho();
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha8.item = objArray25;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        pilha0.topo = 10;
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.topo = (short) 1;
        boolean boolean49 = pilha45.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.empilha((java.lang.Object) (short) 0);
        pilha50.empilha((java.lang.Object) (byte) -1);
        pilha45.empilha((java.lang.Object) pilha50);
        java.lang.Object obj57 = pilha50.desempilha();
        int int58 = pilha50.topo;
        java.lang.Object obj59 = pilha50.desempilha();
        pilha50.empilha((java.lang.Object) 100.0f);
        int int62 = pilha50.tamanho();
        pilha14.empilha((java.lang.Object) pilha50);
        pilha0.empilha((java.lang.Object) pilha14);
        int int65 = pilha14.tamanho();
        int int66 = pilha14.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 0 + "'", obj59, (short) 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 98 + "'", int65 == 98);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 98 + "'", int66 == 98);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha6.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        pilha6.empilha((java.lang.Object) int36);
        pilha0.empilha((java.lang.Object) pilha6);
        int int39 = pilha6.tamanho();
        java.lang.Object obj40 = pilha6.desempilha();
        boolean boolean41 = pilha6.vazia();
        java.lang.Object[] objArray42 = pilha6.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) 2);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray32 = pilha25.item;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.topo = (short) 1;
        boolean boolean37 = pilha33.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        pilha38.empilha((java.lang.Object) (byte) -1);
        pilha33.empilha((java.lang.Object) pilha38);
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.topo = (short) 1;
        boolean boolean49 = pilha45.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        pilha50.empilha((java.lang.Object) (short) 0);
        pilha50.empilha((java.lang.Object) (byte) -1);
        pilha45.empilha((java.lang.Object) pilha50);
        java.lang.Object[] objArray57 = pilha50.item;
        pilha33.empilha((java.lang.Object) pilha50);
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        pilha59.empilha((java.lang.Object) (short) 0);
        int int63 = pilha59.tamanho();
        pilha33.empilha((java.lang.Object) int63);
        pilha25.empilha((java.lang.Object) pilha33);
        pilha0.empilha((java.lang.Object) pilha33);
        boolean boolean67 = pilha0.vazia();
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.topo = ' ';
        java.lang.Object obj71 = pilha68.desempilha();
        java.lang.Object[] objArray72 = pilha68.item;
        pilha0.empilha((java.lang.Object) pilha68);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        java.lang.Object[] objArray29 = pilha17.item;
        int int30 = pilha17.tamanho();
        java.lang.Object obj31 = pilha17.desempilha();
        java.lang.Object obj32 = pilha17.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        int int30 = pilha17.tamanho();
        java.lang.Object[] objArray31 = pilha17.item;
        java.lang.Object[] objArray32 = pilha17.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray28 = pilha22.item;
        pilha0.item = objArray28;
        boolean boolean30 = pilha0.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = ' ';
        int int34 = pilha31.topo;
        java.lang.Object[] objArray35 = pilha31.item;
        pilha0.item = objArray35;
        pilha0.topo = 35;
        java.lang.Object[] objArray39 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.topo = (-1);
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        java.lang.Object obj15 = pilha11.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (short) 0);
        int int20 = pilha16.tamanho();
        boolean boolean21 = pilha16.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.topo = (short) 1;
        int int26 = pilha22.tamanho();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha16.item = objArray27;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha11.item = objArray29;
        pilha0.item = objArray29;
        java.lang.Object[] objArray32 = pilha0.item;
        boolean boolean33 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha5.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        java.lang.Object[] objArray25 = pilha18.item;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (short) 0);
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha26.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        boolean boolean42 = pilha38.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (short) 0);
        pilha43.empilha((java.lang.Object) (byte) -1);
        pilha38.empilha((java.lang.Object) pilha43);
        java.lang.Object[] objArray50 = pilha43.item;
        pilha26.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        int int56 = pilha52.tamanho();
        pilha26.empilha((java.lang.Object) int56);
        pilha18.empilha((java.lang.Object) pilha26);
        pilha5.empilha((java.lang.Object) pilha26);
        int int60 = pilha26.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) (short) 1);
        int int12 = pilha9.tamanho();
        java.lang.Object[] objArray13 = pilha9.item;
        pilha0.item = objArray13;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        int int24 = pilha20.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        pilha20.empilha((java.lang.Object) pilha30);
        pilha20.topo = 'a';
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) (short) 0);
        pilha40.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray46 = pilha40.item;
        java.lang.Object[] objArray47 = pilha40.item;
        java.lang.Object[] objArray48 = pilha40.item;
        java.lang.Object[] objArray49 = pilha40.item;
        pilha20.item = objArray49;
        pilha20.topo = (-1);
        java.lang.Object[] objArray53 = pilha20.item;
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object obj55 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = ' ';
        int int61 = pilha58.topo;
        java.lang.Object[] objArray62 = pilha58.item;
        java.lang.Object[] objArray63 = pilha58.item;
        pilha58.topo = (byte) 10;
        int int66 = pilha58.tamanho();
        pilha0.empilha((java.lang.Object) pilha58);
        java.lang.Object[] objArray68 = pilha58.item;
        java.lang.Object obj69 = pilha58.desempilha();
        int int70 = pilha58.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 9 + "'", int70 == 9);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = pilha8.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        pilha0.topo = 'a';
        int int19 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha6.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        pilha6.empilha((java.lang.Object) int36);
        pilha0.empilha((java.lang.Object) pilha6);
        int int39 = pilha6.tamanho();
        java.lang.Object obj40 = pilha6.desempilha();
        java.lang.Object obj41 = null;
        pilha6.empilha(obj41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        pilha0.topo = (byte) 10;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.topo = ' ';
        int int14 = pilha11.topo;
        java.lang.Object[] objArray15 = pilha11.item;
        int int16 = pilha11.topo;
        pilha11.empilha((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = pilha11.desempilha();
        pilha11.topo = 32;
        pilha0.empilha((java.lang.Object) pilha11);
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 100 + "'", obj19, (byte) 100);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = ' ';
        int int30 = pilha27.topo;
        java.lang.Object[] objArray31 = pilha27.item;
        pilha5.empilha((java.lang.Object) objArray31);
        pilha5.topo = 1;
        java.lang.Object obj35 = pilha5.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 0 + "'", obj35, (short) 0);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (short) 0);
        pilha21.empilha((java.lang.Object) (byte) -1);
        pilha16.empilha((java.lang.Object) pilha21);
        java.lang.Object[] objArray28 = pilha21.item;
        pilha13.item = objArray28;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray36 = pilha30.item;
        java.lang.Object[] objArray37 = pilha30.item;
        pilha30.topo = 'a';
        java.lang.Object obj40 = pilha30.desempilha();
        boolean boolean41 = pilha30.vazia();
        pilha13.empilha((java.lang.Object) pilha30);
        pilha0.empilha((java.lang.Object) pilha13);
        java.lang.Class<?> wildcardClass44 = pilha13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        java.lang.Object obj11 = pilha0.desempilha();
        pilha0.topo = 35;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        int int18 = pilha0.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        java.lang.Object obj24 = pilha19.desempilha();
        pilha19.topo = (short) 10;
        int int27 = pilha19.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (short) 0);
        pilha28.empilha((java.lang.Object) 1L);
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.topo = (short) 1;
        boolean boolean38 = pilha34.vazia();
        java.lang.Object obj39 = pilha34.desempilha();
        java.lang.Object[] objArray40 = pilha34.item;
        pilha28.empilha((java.lang.Object) pilha34);
        java.lang.Object[] objArray42 = pilha34.item;
        pilha19.item = objArray42;
        java.lang.Object[] objArray44 = pilha19.item;
        pilha0.item = objArray44;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        int int18 = pilha10.tamanho();
        boolean boolean19 = pilha10.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        pilha0.empilha(obj6);
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object obj11 = pilha0.desempilha();
        java.lang.Object obj12 = pilha0.desempilha();
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 0 + "'", obj12, (short) 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        pilha0.empilha(obj6);
        pilha0.topo = (byte) 1;
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = null;
        pilha0.item = objArray12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (short) 1);
        int int16 = pilha13.tamanho();
        int int17 = pilha13.topo;
        int int18 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) int18);
        java.lang.Object[] objArray20 = pilha0.item;
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = (-1);
        pilha0.topo = 4;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray16 = pilha10.item;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha10.topo = 'a';
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = ' ';
        java.lang.Object obj23 = pilha20.desempilha();
        java.lang.Object[] objArray24 = pilha20.item;
        pilha10.item = objArray24;
        pilha0.empilha((java.lang.Object) pilha10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        pilha0.empilha((java.lang.Object) (short) 100);
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        java.lang.Object[] objArray21 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = 35;
        java.lang.Object obj25 = pilha17.desempilha();
        pilha17.topo = 35;
        int int28 = pilha17.tamanho();
        int int29 = pilha17.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (short) 0);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        int int17 = pilha13.tamanho();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha7.item = objArray18;
        java.lang.Object[] objArray20 = pilha7.item;
        pilha0.item = objArray20;
        boolean boolean22 = pilha0.vazia();
        boolean boolean23 = pilha0.vazia();
        pilha0.topo = 4;
        pilha0.topo = 33;
        int int28 = pilha0.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        int int33 = pilha29.tamanho();
        java.lang.Object obj34 = pilha29.desempilha();
        boolean boolean35 = pilha29.vazia();
        boolean boolean36 = pilha29.vazia();
        java.lang.Object[] objArray37 = pilha29.item;
        pilha0.item = objArray37;
        int int39 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 33 + "'", int28 == 33);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 0 + "'", obj34, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33 + "'", int39 == 33);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        java.lang.Object obj13 = null;
        pilha0.empilha(obj13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray37 = pilha30.item;
        pilha13.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        pilha13.empilha((java.lang.Object) int43);
        pilha5.empilha((java.lang.Object) pilha13);
        pilha5.topo = (byte) 1;
        java.lang.Object obj48 = pilha5.desempilha();
        java.lang.Object[] objArray49 = pilha5.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = pilha5.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 0 + "'", obj48, (short) 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object[] objArray14 = pilha0.item;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha15.item = objArray30;
        int int32 = pilha15.topo;
        boolean boolean33 = pilha15.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        int int38 = pilha34.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.topo = (short) 1;
        boolean boolean43 = pilha39.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.empilha((java.lang.Object) (short) 0);
        pilha44.empilha((java.lang.Object) (byte) -1);
        pilha39.empilha((java.lang.Object) pilha44);
        pilha34.empilha((java.lang.Object) pilha44);
        pilha34.topo = 'a';
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.empilha((java.lang.Object) (short) 0);
        pilha54.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray60 = pilha54.item;
        java.lang.Object[] objArray61 = pilha54.item;
        java.lang.Object[] objArray62 = pilha54.item;
        java.lang.Object[] objArray63 = pilha54.item;
        pilha34.item = objArray63;
        java.lang.Object obj65 = pilha34.desempilha();
        int int66 = pilha34.tamanho();
        pilha15.empilha((java.lang.Object) pilha34);
        java.lang.Object obj68 = pilha34.desempilha();
        pilha0.empilha(obj68);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 96 + "'", int66 == 96);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        int int33 = pilha29.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.topo = (short) 1;
        boolean boolean41 = pilha37.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.empilha((java.lang.Object) (short) 0);
        pilha42.empilha((java.lang.Object) (byte) -1);
        pilha37.empilha((java.lang.Object) pilha42);
        java.lang.Object[] objArray49 = pilha42.item;
        pilha34.item = objArray49;
        pilha29.item = objArray49;
        pilha29.topo = 0;
        pilha17.empilha((java.lang.Object) pilha29);
        int int55 = pilha29.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        pilha15.empilha((java.lang.Object) 1L);
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.topo = (short) 1;
        boolean boolean25 = pilha21.vazia();
        java.lang.Object obj26 = pilha21.desempilha();
        java.lang.Object[] objArray27 = pilha21.item;
        pilha15.empilha((java.lang.Object) pilha21);
        boolean boolean29 = pilha15.vazia();
        boolean boolean30 = pilha15.vazia();
        int int31 = pilha15.topo;
        pilha0.empilha((java.lang.Object) pilha15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.topo = '#';
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (byte) 100);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha8.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        boolean boolean31 = pilha27.vazia();
        pilha27.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = pilha27.desempilha();
        int int35 = pilha27.tamanho();
        java.lang.Object[] objArray36 = pilha27.item;
        pilha12.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object obj39 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = obj39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray23 = pilha17.item;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha17.topo = 'a';
        java.lang.Object obj27 = pilha17.desempilha();
        boolean boolean28 = pilha17.vazia();
        pilha0.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray30 = pilha0.item;
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.topo = (short) 1;
        boolean boolean35 = pilha31.vazia();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.empilha((java.lang.Object) (short) 0);
        pilha36.empilha((java.lang.Object) (byte) -1);
        pilha31.empilha((java.lang.Object) pilha36);
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.topo = (short) 1;
        boolean boolean47 = pilha43.vazia();
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        pilha48.empilha((java.lang.Object) (short) 0);
        pilha48.empilha((java.lang.Object) (byte) -1);
        pilha43.empilha((java.lang.Object) pilha48);
        java.lang.Object[] objArray55 = pilha48.item;
        pilha31.empilha((java.lang.Object) pilha48);
        pilha48.topo = '#';
        boolean boolean59 = pilha48.vazia();
        int int60 = pilha48.topo;
        int int61 = pilha48.tamanho();
        java.lang.Object[] objArray62 = pilha48.item;
        pilha0.item = objArray62;
        java.lang.Class<?> wildcardClass64 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        int int32 = pilha20.topo;
        java.lang.Object obj33 = new java.lang.Object();
        pilha20.empilha(obj33);
        pilha0.empilha(obj33);
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.empilha((java.lang.Object) (short) 0);
        int int40 = pilha36.tamanho();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.topo = (short) 1;
        boolean boolean48 = pilha44.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        boolean boolean50 = pilha49.vazia();
        pilha49.empilha((java.lang.Object) (short) 0);
        pilha49.empilha((java.lang.Object) (byte) -1);
        pilha44.empilha((java.lang.Object) pilha49);
        java.lang.Object[] objArray56 = pilha49.item;
        pilha41.item = objArray56;
        pilha36.item = objArray56;
        pilha0.item = objArray56;
        int int60 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha6.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        pilha6.empilha((java.lang.Object) int36);
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean39 = pilha6.vazia();
        java.lang.Object obj40 = pilha6.desempilha();
        java.lang.Object[] objArray41 = pilha6.item;
        boolean boolean42 = pilha6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) '4');
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (short) 0);
        pilha23.empilha((java.lang.Object) (byte) -1);
        pilha18.empilha((java.lang.Object) pilha23);
        java.lang.Object[] objArray30 = pilha23.item;
        pilha6.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        int int36 = pilha32.tamanho();
        pilha6.empilha((java.lang.Object) int36);
        pilha0.empilha((java.lang.Object) pilha6);
        int int39 = pilha6.tamanho();
        int int40 = pilha6.tamanho();
        java.lang.Object obj41 = pilha6.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1 + "'", obj41, 1);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        int int25 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (short) 0);
        int int32 = pilha28.tamanho();
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.topo = (short) 1;
        boolean boolean37 = pilha33.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (short) 0);
        pilha38.empilha((java.lang.Object) (byte) -1);
        pilha33.empilha((java.lang.Object) pilha38);
        pilha28.empilha((java.lang.Object) pilha38);
        pilha28.empilha((java.lang.Object) 2);
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        pilha48.topo = (short) 1;
        boolean boolean52 = pilha48.vazia();
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        pilha53.empilha((java.lang.Object) (short) 0);
        pilha53.empilha((java.lang.Object) (byte) -1);
        pilha48.empilha((java.lang.Object) pilha53);
        java.lang.Object[] objArray60 = pilha53.item;
        ds.Pilha pilha61 = new ds.Pilha();
        boolean boolean62 = pilha61.vazia();
        pilha61.topo = (short) 1;
        boolean boolean65 = pilha61.vazia();
        ds.Pilha pilha66 = new ds.Pilha();
        boolean boolean67 = pilha66.vazia();
        pilha66.empilha((java.lang.Object) (short) 0);
        pilha66.empilha((java.lang.Object) (byte) -1);
        pilha61.empilha((java.lang.Object) pilha66);
        ds.Pilha pilha73 = new ds.Pilha();
        boolean boolean74 = pilha73.vazia();
        pilha73.topo = (short) 1;
        boolean boolean77 = pilha73.vazia();
        ds.Pilha pilha78 = new ds.Pilha();
        boolean boolean79 = pilha78.vazia();
        pilha78.empilha((java.lang.Object) (short) 0);
        pilha78.empilha((java.lang.Object) (byte) -1);
        pilha73.empilha((java.lang.Object) pilha78);
        java.lang.Object[] objArray85 = pilha78.item;
        pilha61.empilha((java.lang.Object) pilha78);
        ds.Pilha pilha87 = new ds.Pilha();
        boolean boolean88 = pilha87.vazia();
        pilha87.empilha((java.lang.Object) (short) 0);
        int int91 = pilha87.tamanho();
        pilha61.empilha((java.lang.Object) int91);
        pilha53.empilha((java.lang.Object) pilha61);
        pilha28.empilha((java.lang.Object) pilha61);
        java.lang.Object[] objArray95 = pilha61.item;
        java.lang.Object[] objArray96 = pilha61.item;
        pilha0.empilha((java.lang.Object) objArray96);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object obj13 = pilha5.desempilha();
        boolean boolean14 = pilha5.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.topo = (short) 1;
        boolean boolean19 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = pilha15.desempilha();
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        int int25 = pilha15.tamanho();
        java.lang.Object[] objArray26 = pilha15.item;
        pilha5.item = objArray26;
        java.lang.Class<?> wildcardClass28 = pilha5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha13.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        java.lang.Object[] objArray37 = pilha30.item;
        pilha13.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        int int43 = pilha39.tamanho();
        pilha13.empilha((java.lang.Object) int43);
        pilha5.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray46 = pilha5.item;
        int int47 = pilha5.tamanho();
        pilha5.topo = (byte) 10;
        pilha5.topo = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (short) 0);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        int int17 = pilha13.tamanho();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha7.item = objArray18;
        java.lang.Object[] objArray20 = pilha7.item;
        pilha0.item = objArray20;
        boolean boolean22 = pilha0.vazia();
        boolean boolean23 = pilha0.vazia();
        java.lang.Object obj24 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray14 = pilha0.item;
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        int int26 = pilha17.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.empilha((java.lang.Object) (short) 0);
        pilha27.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray33 = pilha27.item;
        java.lang.Object[] objArray34 = pilha27.item;
        int int35 = pilha27.topo;
        pilha17.empilha((java.lang.Object) pilha27);
        java.lang.Object[] objArray37 = pilha17.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        pilha4.topo = (short) 1;
        boolean boolean8 = pilha4.vazia();
        pilha4.empilha((java.lang.Object) (byte) -1);
        pilha4.topo = (-1);
        boolean boolean13 = pilha4.vazia();
        java.lang.Object[] objArray14 = pilha4.item;
        java.lang.Object[] objArray15 = pilha4.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha34);
        java.lang.Object[] objArray41 = pilha34.item;
        pilha17.empilha((java.lang.Object) pilha34);
        pilha34.topo = '#';
        pilha34.topo = (byte) 10;
        java.lang.Object obj47 = pilha34.desempilha();
        pilha0.empilha((java.lang.Object) pilha34);
        java.lang.Object obj49 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.topo = ' ';
        int int25 = pilha22.topo;
        java.lang.Object[] objArray26 = pilha22.item;
        int int27 = pilha22.tamanho();
        int int28 = pilha22.tamanho();
        java.lang.Object[] objArray29 = pilha22.item;
        pilha0.item = objArray29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (short) 0);
        pilha7.empilha((java.lang.Object) 1L);
        java.lang.Object[] objArray13 = pilha7.item;
        int int14 = pilha7.topo;
        java.lang.Object obj15 = pilha7.desempilha();
        pilha0.empilha(obj15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray14 = pilha8.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        pilha0.topo = 'a';
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (short) 0);
        int int23 = pilha19.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        boolean boolean31 = pilha27.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        pilha32.empilha((java.lang.Object) (byte) -1);
        pilha27.empilha((java.lang.Object) pilha32);
        java.lang.Object[] objArray39 = pilha32.item;
        pilha24.item = objArray39;
        pilha19.item = objArray39;
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray43 = pilha19.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray12 = pilha5.item;
        java.lang.Object[] objArray13 = pilha5.item;
        boolean boolean14 = pilha5.vazia();
        java.lang.Object[] objArray15 = pilha5.item;
        java.lang.Object[] objArray16 = pilha5.item;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        java.lang.Object[] objArray19 = pilha17.item;
        pilha17.empilha((java.lang.Object) '4');
        int int22 = pilha17.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.topo = (short) 1;
        boolean boolean27 = pilha23.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (short) 0);
        pilha28.empilha((java.lang.Object) (byte) -1);
        pilha23.empilha((java.lang.Object) pilha28);
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.topo = (short) 1;
        boolean boolean39 = pilha35.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) (short) 0);
        pilha40.empilha((java.lang.Object) (byte) -1);
        pilha35.empilha((java.lang.Object) pilha40);
        java.lang.Object[] objArray47 = pilha40.item;
        pilha23.empilha((java.lang.Object) pilha40);
        ds.Pilha pilha49 = new ds.Pilha();
        boolean boolean50 = pilha49.vazia();
        pilha49.empilha((java.lang.Object) (short) 0);
        int int53 = pilha49.tamanho();
        pilha23.empilha((java.lang.Object) int53);
        pilha17.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha56 = new ds.Pilha();
        boolean boolean57 = pilha56.vazia();
        pilha56.empilha((java.lang.Object) (short) 0);
        pilha56.empilha((java.lang.Object) 1L);
        int int62 = pilha56.tamanho();
        int int63 = pilha56.topo;
        pilha23.empilha((java.lang.Object) pilha56);
        java.lang.Object[] objArray65 = pilha23.item;
        pilha5.empilha((java.lang.Object) pilha23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        boolean boolean26 = pilha17.vazia();
        java.lang.Object obj27 = pilha17.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        pilha0.topo = 4;
        int int7 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        int int32 = pilha20.topo;
        java.lang.Object obj33 = new java.lang.Object();
        pilha20.empilha(obj33);
        pilha0.empilha(obj33);
        java.lang.Object obj36 = pilha0.desempilha();
        java.lang.Object obj37 = pilha0.desempilha();
        int int38 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (short) 0);
        int int30 = pilha26.tamanho();
        pilha0.empilha((java.lang.Object) int30);
        boolean boolean32 = pilha0.vazia();
        java.lang.Object[] objArray33 = pilha0.item;
        java.lang.Class<?> wildcardClass34 = objArray33.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        pilha0.empilha((java.lang.Object) (short) 100);
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        java.lang.Object[] objArray21 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = 35;
        java.lang.Object obj25 = pilha17.desempilha();
        java.lang.Object[] objArray26 = pilha17.item;
        pilha17.topo = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.topo = (short) 1;
        boolean boolean12 = pilha8.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) (byte) -1);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object[] objArray20 = pilha13.item;
        pilha5.item = objArray20;
        pilha0.item = objArray20;
        int int23 = pilha0.topo;
        java.lang.Object[] objArray24 = pilha0.item;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.topo = (short) 1;
        boolean boolean32 = pilha28.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        pilha33.empilha((java.lang.Object) (byte) -1);
        pilha28.empilha((java.lang.Object) pilha33);
        java.lang.Object[] objArray40 = pilha33.item;
        pilha25.item = objArray40;
        pilha0.item = objArray40;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        pilha16.topo = (-1);
        boolean boolean25 = pilha16.vazia();
        java.lang.Object[] objArray26 = pilha16.item;
        java.lang.Object[] objArray27 = pilha16.item;
        pilha0.empilha((java.lang.Object) objArray27);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha34);
        ds.Pilha pilha41 = new ds.Pilha();
        boolean boolean42 = pilha41.vazia();
        pilha41.empilha((java.lang.Object) (short) 0);
        pilha41.empilha((java.lang.Object) 1L);
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.topo = (short) 1;
        boolean boolean51 = pilha47.vazia();
        java.lang.Object obj52 = pilha47.desempilha();
        java.lang.Object[] objArray53 = pilha47.item;
        pilha41.empilha((java.lang.Object) pilha47);
        pilha34.empilha((java.lang.Object) pilha41);
        ds.Pilha pilha56 = new ds.Pilha();
        boolean boolean57 = pilha56.vazia();
        pilha56.topo = (short) 1;
        int int60 = pilha56.tamanho();
        java.lang.Object[] objArray61 = pilha56.item;
        pilha41.item = objArray61;
        ds.Pilha pilha63 = new ds.Pilha();
        boolean boolean64 = pilha63.vazia();
        java.lang.Object[] objArray65 = pilha63.item;
        pilha63.empilha((java.lang.Object) '4');
        int int68 = pilha63.tamanho();
        boolean boolean69 = pilha63.vazia();
        pilha41.empilha((java.lang.Object) pilha63);
        pilha0.empilha((java.lang.Object) pilha63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        pilha20.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray26 = pilha20.item;
        java.lang.Object[] objArray27 = pilha20.item;
        java.lang.Object[] objArray28 = pilha20.item;
        java.lang.Object[] objArray29 = pilha20.item;
        pilha0.item = objArray29;
        pilha0.topo = (-1);
        java.lang.Object[] objArray33 = pilha0.item;
        int int34 = pilha0.tamanho();
        boolean boolean35 = pilha0.vazia();
        java.lang.Object[] objArray36 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        pilha0.topo = 32;
        java.lang.Object[] objArray27 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray18 = pilha0.item;
        pilha0.topo = (short) 100;
        boolean boolean21 = pilha0.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray28 = pilha22.item;
        java.lang.Object[] objArray29 = pilha22.item;
        pilha22.topo = 'a';
        boolean boolean32 = pilha22.vazia();
        pilha22.topo = (byte) 100;
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (short) 0);
        int int39 = pilha35.tamanho();
        java.lang.Object obj40 = pilha35.desempilha();
        int int41 = pilha35.tamanho();
        int int42 = pilha35.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (short) 0);
        pilha43.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray49 = pilha43.item;
        java.lang.Class<?> wildcardClass50 = objArray49.getClass();
        pilha35.empilha((java.lang.Object) wildcardClass50);
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        pilha52.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray58 = pilha52.item;
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        pilha59.empilha((java.lang.Object) (short) 0);
        int int63 = pilha59.tamanho();
        boolean boolean64 = pilha59.vazia();
        ds.Pilha pilha65 = new ds.Pilha();
        boolean boolean66 = pilha65.vazia();
        pilha65.topo = (short) 1;
        int int69 = pilha65.tamanho();
        java.lang.Object[] objArray70 = pilha65.item;
        pilha59.item = objArray70;
        java.lang.Object[] objArray72 = pilha59.item;
        pilha52.item = objArray72;
        pilha35.item = objArray72;
        pilha22.item = objArray72;
        pilha0.empilha((java.lang.Object) pilha22);
        java.lang.Class<?> wildcardClass77 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        int int9 = pilha5.tamanho();
        boolean boolean10 = pilha5.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.topo = (short) 1;
        int int15 = pilha11.tamanho();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha5.item = objArray16;
        java.lang.Object[] objArray18 = pilha5.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        boolean boolean21 = pilha0.vazia();
        java.lang.Object[] objArray22 = pilha0.item;
        pilha0.topo = 0;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        int int29 = pilha25.tamanho();
        java.lang.Object obj30 = pilha25.desempilha();
        int int31 = pilha25.tamanho();
        int int32 = pilha25.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        pilha33.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray39 = pilha33.item;
        java.lang.Class<?> wildcardClass40 = objArray39.getClass();
        pilha25.empilha((java.lang.Object) wildcardClass40);
        boolean boolean42 = pilha25.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        pilha43.topo = (short) 1;
        boolean boolean47 = pilha43.vazia();
        pilha43.empilha((java.lang.Object) (byte) -1);
        pilha43.topo = (-1);
        boolean boolean52 = pilha43.vazia();
        java.lang.Object[] objArray53 = pilha43.item;
        pilha25.item = objArray53;
        pilha0.item = objArray53;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 0 + "'", obj30, (short) 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = null;
        pilha0.empilha(obj13);
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.tamanho();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) 1L);
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.topo = (short) 1;
        boolean boolean40 = pilha36.vazia();
        java.lang.Object obj41 = pilha36.desempilha();
        java.lang.Object[] objArray42 = pilha36.item;
        pilha30.empilha((java.lang.Object) pilha36);
        java.lang.Object[] objArray44 = pilha30.item;
        pilha17.item = objArray44;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        java.lang.Object obj3 = pilha0.desempilha();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        java.lang.Object obj10 = pilha5.desempilha();
        java.lang.Object[] objArray11 = pilha5.item;
        int int12 = pilha5.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (short) 0);
        pilha13.empilha((java.lang.Object) 1L);
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        java.lang.Object obj24 = pilha19.desempilha();
        java.lang.Object[] objArray25 = pilha19.item;
        pilha13.empilha((java.lang.Object) pilha19);
        java.lang.Object obj27 = pilha13.desempilha();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        pilha5.empilha(obj27);
        java.lang.Object obj30 = pilha5.desempilha();
        pilha0.empilha((java.lang.Object) pilha5);
        pilha5.topo = 32;
        pilha5.topo = 0;
        java.lang.Object[] objArray36 = pilha5.item;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = 2;
        int int36 = pilha15.tamanho();
        boolean boolean37 = pilha15.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        java.lang.Object[] objArray20 = pilha0.item;
        boolean boolean21 = pilha0.vazia();
        boolean boolean22 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.topo = ' ';
        int int30 = pilha27.topo;
        java.lang.Object[] objArray31 = pilha27.item;
        pilha5.empilha((java.lang.Object) objArray31);
        pilha5.topo = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        java.lang.Object[] objArray18 = pilha12.item;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 100;
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        int int16 = pilha12.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray32 = pilha25.item;
        pilha17.item = objArray32;
        pilha12.item = objArray32;
        pilha0.item = objArray32;
        pilha0.topo = 0;
        int int38 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.topo = (short) 1;
        boolean boolean17 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = pilha13.desempilha();
        int int21 = pilha13.tamanho();
        java.lang.Object[] objArray22 = pilha13.item;
        pilha0.item = objArray22;
        java.lang.Object[] objArray24 = pilha0.item;
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.topo;
        java.lang.Class<?> wildcardClass28 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        java.lang.Object obj3 = pilha0.desempilha();
        int int4 = pilha0.tamanho();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        pilha17.topo = (-1);
        pilha17.topo = '#';
        pilha17.topo = '#';
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha36.topo = (short) 1;
        boolean boolean40 = pilha36.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        boolean boolean42 = pilha41.vazia();
        pilha41.empilha((java.lang.Object) (short) 0);
        pilha41.empilha((java.lang.Object) (byte) -1);
        pilha36.empilha((java.lang.Object) pilha41);
        java.lang.Object[] objArray48 = pilha41.item;
        java.lang.Object[] objArray49 = pilha41.item;
        boolean boolean50 = pilha41.vazia();
        java.lang.Object[] objArray51 = pilha41.item;
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        int int56 = pilha52.tamanho();
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.topo = (short) 1;
        boolean boolean61 = pilha57.vazia();
        ds.Pilha pilha62 = new ds.Pilha();
        boolean boolean63 = pilha62.vazia();
        pilha62.empilha((java.lang.Object) (short) 0);
        pilha62.empilha((java.lang.Object) (byte) -1);
        pilha57.empilha((java.lang.Object) pilha62);
        pilha52.empilha((java.lang.Object) pilha62);
        pilha52.topo = 'a';
        ds.Pilha pilha72 = new ds.Pilha();
        boolean boolean73 = pilha72.vazia();
        pilha72.empilha((java.lang.Object) (short) 0);
        pilha72.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray78 = pilha72.item;
        java.lang.Object[] objArray79 = pilha72.item;
        java.lang.Object[] objArray80 = pilha72.item;
        java.lang.Object[] objArray81 = pilha72.item;
        pilha52.item = objArray81;
        pilha41.item = objArray81;
        pilha17.item = objArray81;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (short) 0);
        pilha11.empilha((java.lang.Object) (byte) -1);
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.empilha((java.lang.Object) (short) 0);
        pilha18.empilha((java.lang.Object) 1L);
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        java.lang.Object obj29 = pilha24.desempilha();
        java.lang.Object[] objArray30 = pilha24.item;
        pilha18.empilha((java.lang.Object) pilha24);
        pilha11.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.topo = (short) 1;
        boolean boolean37 = pilha33.vazia();
        java.lang.Object obj38 = pilha33.desempilha();
        java.lang.Object[] objArray39 = pilha33.item;
        pilha18.item = objArray39;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.empilha((java.lang.Object) false);
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        java.lang.Object[] objArray29 = pilha22.item;
        pilha5.empilha((java.lang.Object) pilha22);
        pilha22.topo = '#';
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.topo = (short) 1;
        boolean boolean37 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (byte) -1);
        pilha33.topo = (-1);
        boolean boolean42 = pilha33.vazia();
        java.lang.Object[] objArray43 = pilha33.item;
        java.lang.Object[] objArray44 = pilha33.item;
        pilha22.item = objArray44;
        pilha0.item = objArray44;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.topo = ' ';
        int int50 = pilha47.topo;
        java.lang.Object[] objArray51 = pilha47.item;
        int int52 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (byte) 100);
        ds.Pilha pilha55 = new ds.Pilha();
        boolean boolean56 = pilha55.vazia();
        pilha55.empilha((java.lang.Object) (short) 0);
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        pilha59.empilha((java.lang.Object) (short) 0);
        pilha59.empilha((java.lang.Object) 1L);
        ds.Pilha pilha65 = new ds.Pilha();
        boolean boolean66 = pilha65.vazia();
        pilha65.topo = (short) 1;
        boolean boolean69 = pilha65.vazia();
        java.lang.Object obj70 = pilha65.desempilha();
        java.lang.Object[] objArray71 = pilha65.item;
        pilha59.empilha((java.lang.Object) pilha65);
        pilha55.empilha((java.lang.Object) pilha59);
        ds.Pilha pilha74 = new ds.Pilha();
        boolean boolean75 = pilha74.vazia();
        pilha74.topo = (short) 1;
        boolean boolean78 = pilha74.vazia();
        pilha74.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj81 = pilha74.desempilha();
        int int82 = pilha74.tamanho();
        java.lang.Object[] objArray83 = pilha74.item;
        pilha59.item = objArray83;
        pilha47.item = objArray83;
        java.lang.Object obj86 = pilha47.desempilha();
        pilha0.empilha(obj86);
        boolean boolean88 = pilha0.vazia();
        int int89 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + (byte) -1 + "'", obj81, (byte) -1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = null;
        pilha0.item = objArray10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        pilha0.empilha(obj6);
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object obj11 = pilha0.desempilha();
        pilha0.topo = (short) 1;
        java.lang.Object obj14 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        int int24 = pilha20.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.topo = (short) 1;
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha25.empilha((java.lang.Object) pilha30);
        pilha20.empilha((java.lang.Object) pilha30);
        pilha20.topo = 'a';
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) (short) 0);
        pilha40.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray46 = pilha40.item;
        java.lang.Object[] objArray47 = pilha40.item;
        java.lang.Object[] objArray48 = pilha40.item;
        java.lang.Object[] objArray49 = pilha40.item;
        pilha20.item = objArray49;
        pilha20.topo = (-1);
        java.lang.Object[] objArray53 = pilha20.item;
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object obj55 = pilha0.desempilha();
        pilha0.topo = 100;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.topo = ' ';
        int int61 = pilha58.topo;
        java.lang.Object[] objArray62 = pilha58.item;
        java.lang.Object[] objArray63 = pilha58.item;
        pilha58.topo = (byte) 10;
        int int66 = pilha58.tamanho();
        pilha0.empilha((java.lang.Object) pilha58);
        int int68 = pilha58.tamanho();
        ds.Pilha pilha69 = new ds.Pilha();
        boolean boolean70 = pilha69.vazia();
        pilha69.topo = (short) 1;
        boolean boolean73 = pilha69.vazia();
        ds.Pilha pilha74 = new ds.Pilha();
        boolean boolean75 = pilha74.vazia();
        pilha74.empilha((java.lang.Object) (short) 0);
        pilha74.empilha((java.lang.Object) (byte) -1);
        pilha69.empilha((java.lang.Object) pilha74);
        ds.Pilha pilha81 = new ds.Pilha();
        boolean boolean82 = pilha81.vazia();
        pilha81.empilha((java.lang.Object) (short) 0);
        pilha81.empilha((java.lang.Object) 1L);
        ds.Pilha pilha87 = new ds.Pilha();
        boolean boolean88 = pilha87.vazia();
        pilha87.topo = (short) 1;
        boolean boolean91 = pilha87.vazia();
        java.lang.Object obj92 = pilha87.desempilha();
        java.lang.Object[] objArray93 = pilha87.item;
        pilha81.empilha((java.lang.Object) pilha87);
        pilha74.empilha((java.lang.Object) pilha81);
        pilha74.topo = (byte) 1;
        java.lang.Object[] objArray98 = pilha74.item;
        pilha58.empilha((java.lang.Object) objArray98);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(objArray98);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        int int3 = pilha0.topo;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray15 = pilha5.item;
        int int16 = pilha5.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.topo = (short) 1;
        boolean boolean13 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        pilha9.topo = (-1);
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        int int32 = pilha20.topo;
        java.lang.Object obj33 = new java.lang.Object();
        pilha20.empilha(obj33);
        pilha0.empilha(obj33);
        java.lang.Object obj36 = pilha0.desempilha();
        int int37 = pilha0.topo;
        java.lang.Object[] objArray38 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        boolean boolean26 = pilha17.vazia();
        int int27 = pilha17.tamanho();
        boolean boolean28 = pilha17.vazia();
        java.lang.Class<?> wildcardClass29 = pilha17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (short) 1);
        int int16 = pilha13.tamanho();
        int int17 = pilha13.topo;
        int int18 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) int18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (short) 0);
        pilha20.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray26 = pilha20.item;
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object obj28 = pilha20.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) -1 + "'", obj28, (byte) -1);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        int int26 = pilha17.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.empilha((java.lang.Object) (short) 0);
        pilha27.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray33 = pilha27.item;
        java.lang.Object[] objArray34 = pilha27.item;
        int int35 = pilha27.topo;
        pilha17.empilha((java.lang.Object) pilha27);
        java.lang.Object obj37 = pilha17.desempilha();
        java.lang.Object obj38 = pilha17.desempilha();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) (short) 1);
        int int42 = pilha39.tamanho();
        int int43 = pilha39.topo;
        java.lang.Object obj44 = pilha39.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        pilha45.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray51 = pilha45.item;
        java.lang.Object[] objArray52 = pilha45.item;
        int int53 = pilha45.topo;
        java.lang.Object[] objArray54 = pilha45.item;
        pilha39.item = objArray54;
        pilha17.item = objArray54;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 1 + "'", obj44, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.topo = (short) 1;
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (short) 0);
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha5.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray28 = pilha22.item;
        pilha0.item = objArray28;
        boolean boolean30 = pilha0.vazia();
        pilha0.topo = (short) -1;
        int int33 = pilha0.tamanho();
        boolean boolean34 = pilha0.vazia();
        java.lang.Class<?> wildcardClass35 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj12 = pilha5.desempilha();
        boolean boolean13 = pilha5.vazia();
        java.lang.Object obj14 = pilha5.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        pilha17.topo = '#';
        boolean boolean28 = pilha17.vazia();
        int int29 = pilha17.topo;
        java.lang.Object[] objArray30 = null;
        pilha17.item = objArray30;
        int int32 = pilha17.tamanho();
        java.lang.Object[] objArray33 = pilha17.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = objArray33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(objArray33);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (short) 0);
        pilha12.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        pilha18.topo = (short) 1;
        boolean boolean22 = pilha18.vazia();
        java.lang.Object obj23 = pilha18.desempilha();
        java.lang.Object[] objArray24 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        pilha5.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.topo = (short) 1;
        int int31 = pilha27.tamanho();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha12.item = objArray32;
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.topo = (short) 1;
        boolean boolean38 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj41 = pilha34.desempilha();
        java.lang.Object[] objArray42 = pilha34.item;
        pilha12.item = objArray42;
        boolean boolean44 = pilha12.vazia();
        int int45 = pilha12.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = 32;
        int int12 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (short) 0);
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        pilha15.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha15);
        int int34 = pilha15.topo;
        int int35 = pilha15.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (short) 0);
        int int23 = pilha19.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        pilha29.empilha((java.lang.Object) (byte) -1);
        pilha24.empilha((java.lang.Object) pilha29);
        pilha19.empilha((java.lang.Object) pilha29);
        pilha19.topo = 'a';
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        pilha39.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray45 = pilha39.item;
        java.lang.Object[] objArray46 = pilha39.item;
        java.lang.Object[] objArray47 = pilha39.item;
        java.lang.Object[] objArray48 = pilha39.item;
        pilha19.item = objArray48;
        java.lang.Object obj50 = pilha19.desempilha();
        int int51 = pilha19.tamanho();
        pilha0.empilha((java.lang.Object) pilha19);
        int int53 = pilha19.tamanho();
        int int54 = pilha19.tamanho();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 96 + "'", int51 == 96);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 96 + "'", int53 == 96);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 96 + "'", int54 == 96);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        int int12 = pilha0.topo;
        java.lang.Object obj13 = new java.lang.Object();
        pilha0.empilha(obj13);
        pilha0.empilha((java.lang.Object) (short) 100);
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        java.lang.Object[] objArray29 = pilha22.item;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha0.item = objArray30;
        boolean boolean32 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (short) 1);
        int int16 = pilha13.tamanho();
        int int17 = pilha13.topo;
        int int18 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) int18);
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.topo = (short) 1;
        boolean boolean24 = pilha20.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (short) 0);
        pilha25.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.empilha((java.lang.Object) (short) 0);
        pilha32.empilha((java.lang.Object) 1L);
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.topo = (short) 1;
        boolean boolean42 = pilha38.vazia();
        java.lang.Object obj43 = pilha38.desempilha();
        java.lang.Object[] objArray44 = pilha38.item;
        pilha32.empilha((java.lang.Object) pilha38);
        pilha25.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.topo = (short) 1;
        int int51 = pilha47.tamanho();
        java.lang.Object[] objArray52 = pilha47.item;
        pilha32.item = objArray52;
        pilha0.empilha((java.lang.Object) pilha32);
        boolean boolean55 = pilha32.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (short) 0);
        pilha5.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.topo = (short) 1;
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (short) 0);
        pilha17.empilha((java.lang.Object) (byte) -1);
        pilha12.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray24 = pilha17.item;
        pilha0.empilha((java.lang.Object) pilha17);
        boolean boolean26 = pilha17.vazia();
        int int27 = pilha17.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.topo = (short) 1;
        boolean boolean32 = pilha28.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (short) 0);
        pilha33.empilha((java.lang.Object) (byte) -1);
        pilha28.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (short) 0);
        pilha45.empilha((java.lang.Object) (byte) -1);
        pilha40.empilha((java.lang.Object) pilha45);
        java.lang.Object[] objArray52 = pilha45.item;
        pilha28.empilha((java.lang.Object) pilha45);
        pilha45.topo = '#';
        boolean boolean56 = pilha45.vazia();
        int int57 = pilha45.topo;
        java.lang.Object[] objArray58 = null;
        pilha45.item = objArray58;
        int int60 = pilha45.tamanho();
        ds.Pilha pilha61 = new ds.Pilha();
        boolean boolean62 = pilha61.vazia();
        pilha61.topo = (short) 1;
        boolean boolean65 = pilha61.vazia();
        ds.Pilha pilha66 = new ds.Pilha();
        boolean boolean67 = pilha66.vazia();
        pilha66.empilha((java.lang.Object) (short) 0);
        pilha66.empilha((java.lang.Object) (byte) -1);
        pilha61.empilha((java.lang.Object) pilha66);
        java.lang.Object[] objArray73 = pilha66.item;
        pilha45.item = objArray73;
        pilha17.item = objArray73;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.topo = (byte) 1;
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        int int17 = pilha0.tamanho();
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 0 + "'", obj18, (short) 0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (short) 0);
        int int23 = pilha19.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.topo = (short) 1;
        boolean boolean28 = pilha24.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (short) 0);
        pilha29.empilha((java.lang.Object) (byte) -1);
        pilha24.empilha((java.lang.Object) pilha29);
        pilha19.empilha((java.lang.Object) pilha29);
        pilha19.topo = 'a';
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        pilha39.empilha((java.lang.Object) (short) 0);
        pilha39.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray45 = pilha39.item;
        java.lang.Object[] objArray46 = pilha39.item;
        java.lang.Object[] objArray47 = pilha39.item;
        java.lang.Object[] objArray48 = pilha39.item;
        pilha19.item = objArray48;
        java.lang.Object obj50 = pilha19.desempilha();
        int int51 = pilha19.tamanho();
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object obj53 = pilha19.desempilha();
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        pilha54.topo = (short) 1;
        boolean boolean58 = pilha54.vazia();
        pilha54.empilha((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = pilha54.desempilha();
        int int62 = pilha54.tamanho();
        java.lang.Object[] objArray63 = pilha54.item;
        pilha54.topo = 'a';
        java.lang.Class<?> wildcardClass66 = pilha54.getClass();
        pilha19.empilha((java.lang.Object) pilha54);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 96 + "'", int51 == 96);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.topo = (short) 1;
        boolean boolean10 = pilha6.vazia();
        java.lang.Object obj11 = pilha6.desempilha();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (short) 0);
        int int18 = pilha14.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.topo = (short) 1;
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (short) 0);
        pilha24.empilha((java.lang.Object) (byte) -1);
        pilha19.empilha((java.lang.Object) pilha24);
        pilha14.empilha((java.lang.Object) pilha24);
        pilha14.topo = 'a';
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        java.lang.Object[] objArray42 = pilha34.item;
        java.lang.Object[] objArray43 = pilha34.item;
        pilha14.item = objArray43;
        pilha0.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        pilha46.topo = (short) 1;
        boolean boolean50 = pilha46.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        boolean boolean52 = pilha51.vazia();
        pilha51.empilha((java.lang.Object) (short) 0);
        pilha51.empilha((java.lang.Object) (byte) -1);
        pilha46.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray58 = pilha51.item;
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        pilha59.topo = (short) 1;
        boolean boolean63 = pilha59.vazia();
        ds.Pilha pilha64 = new ds.Pilha();
        boolean boolean65 = pilha64.vazia();
        pilha64.empilha((java.lang.Object) (short) 0);
        pilha64.empilha((java.lang.Object) (byte) -1);
        pilha59.empilha((java.lang.Object) pilha64);
        ds.Pilha pilha71 = new ds.Pilha();
        boolean boolean72 = pilha71.vazia();
        pilha71.topo = (short) 1;
        boolean boolean75 = pilha71.vazia();
        ds.Pilha pilha76 = new ds.Pilha();
        boolean boolean77 = pilha76.vazia();
        pilha76.empilha((java.lang.Object) (short) 0);
        pilha76.empilha((java.lang.Object) (byte) -1);
        pilha71.empilha((java.lang.Object) pilha76);
        java.lang.Object[] objArray83 = pilha76.item;
        pilha59.empilha((java.lang.Object) pilha76);
        ds.Pilha pilha85 = new ds.Pilha();
        boolean boolean86 = pilha85.vazia();
        pilha85.empilha((java.lang.Object) (short) 0);
        int int89 = pilha85.tamanho();
        pilha59.empilha((java.lang.Object) int89);
        pilha51.empilha((java.lang.Object) pilha59);
        java.lang.Object[] objArray92 = pilha51.item;
        pilha0.item = objArray92;
        int int94 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (short) 0);
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.topo = (short) 1;
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (short) 0);
        pilha21.empilha((java.lang.Object) (byte) -1);
        pilha16.empilha((java.lang.Object) pilha21);
        java.lang.Object[] objArray28 = pilha21.item;
        pilha13.item = objArray28;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (short) 0);
        pilha30.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray36 = pilha30.item;
        java.lang.Object[] objArray37 = pilha30.item;
        pilha30.topo = 'a';
        java.lang.Object obj40 = pilha30.desempilha();
        boolean boolean41 = pilha30.vazia();
        pilha13.empilha((java.lang.Object) pilha30);
        pilha0.empilha((java.lang.Object) pilha13);
        int int44 = pilha13.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (short) 1);
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.topo = (short) 1;
        boolean boolean7 = pilha3.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (short) 0);
        pilha8.empilha((java.lang.Object) (byte) -1);
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray15 = pilha8.item;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.topo = (short) 1;
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (short) 0);
        pilha22.empilha((java.lang.Object) (byte) -1);
        pilha17.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.topo = (short) 1;
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (short) 0);
        pilha34.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha34);
        java.lang.Object[] objArray41 = pilha34.item;
        pilha17.empilha((java.lang.Object) pilha34);
        pilha34.topo = '#';
        boolean boolean45 = pilha34.vazia();
        java.lang.Object[] objArray46 = pilha34.item;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.topo = (short) 1;
        boolean boolean51 = pilha47.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (short) 0);
        pilha52.empilha((java.lang.Object) (byte) -1);
        pilha47.empilha((java.lang.Object) pilha52);
        java.lang.Object[] objArray59 = pilha52.item;
        java.lang.Object[] objArray60 = pilha52.item;
        pilha34.item = objArray60;
        pilha0.empilha((java.lang.Object) pilha34);
        boolean boolean63 = pilha34.vazia();
        pilha34.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }
}


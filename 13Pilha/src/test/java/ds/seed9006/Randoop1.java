package ds.seed9006;

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
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0.0d };
        pilha0.item = objArray25;
        boolean boolean27 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object[] objArray23 = pilha17.item;
        boolean boolean24 = pilha17.vazia();
        int int25 = pilha17.topo;
        pilha0.empilha((java.lang.Object) pilha17);
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) (byte) 1);
        pilha28.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 0.0d);
        boolean boolean40 = pilha37.vazia();
        java.lang.Object obj41 = pilha37.desempilha();
        int int42 = pilha37.topo;
        pilha28.empilha((java.lang.Object) pilha37);
        java.lang.Object[] objArray44 = pilha28.item;
        pilha0.item = objArray44;
        java.lang.Object[] objArray46 = pilha0.item;
        int int47 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray33 = pilha0.item;
        java.lang.Object obj34 = pilha0.desempilha();
        int int35 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha18.item = objArray29;
        pilha12.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 3;
        int int35 = pilha0.tamanho();
        java.lang.Object obj36 = pilha0.desempilha();
        pilha0.topo = 5;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray17 = pilha8.item;
        pilha0.item = objArray17;
        int int19 = pilha0.topo;
        boolean boolean20 = pilha0.vazia();
        boolean boolean21 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.tamanho();
        pilha0.topo = (-1);
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) (byte) 1);
        pilha12.empilha((java.lang.Object) 1.0f);
        pilha12.topo = (short) -1;
        int int23 = pilha12.topo;
        pilha12.topo = '4';
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) (byte) 1);
        pilha26.empilha((java.lang.Object) 1.0f);
        pilha26.topo = (-1);
        int int37 = pilha26.tamanho();
        pilha26.topo = (byte) 10;
        int int40 = pilha26.tamanho();
        java.lang.Object[] objArray41 = pilha26.item;
        pilha12.empilha((java.lang.Object) pilha26);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 0.0d);
        boolean boolean46 = pilha43.vazia();
        java.lang.Object obj47 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) (byte) 1);
        pilha43.empilha((java.lang.Object) 1.0f);
        pilha43.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj54 = pilha43.desempilha();
        int int55 = pilha43.topo;
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.empilha((java.lang.Object) 0.0d);
        boolean boolean59 = pilha56.vazia();
        java.lang.Object obj60 = pilha56.desempilha();
        int int61 = pilha56.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) 0.0d);
        boolean boolean65 = pilha62.vazia();
        boolean boolean66 = pilha62.vazia();
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) 0.0d);
        boolean boolean70 = pilha67.vazia();
        java.lang.Object obj71 = pilha67.desempilha();
        java.lang.Object[] objArray72 = pilha67.item;
        java.lang.Object[] objArray73 = pilha67.item;
        pilha62.item = objArray73;
        pilha56.item = objArray73;
        java.lang.Object[] objArray76 = pilha56.item;
        pilha43.item = objArray76;
        pilha12.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha79 = new ds.Pilha();
        pilha79.empilha((java.lang.Object) 0.0d);
        boolean boolean82 = pilha79.vazia();
        java.lang.Object obj83 = pilha79.desempilha();
        pilha79.empilha((java.lang.Object) (byte) 1);
        pilha79.empilha((java.lang.Object) 1.0f);
        pilha79.topo = (-1);
        int int90 = pilha79.tamanho();
        int int91 = pilha79.tamanho();
        java.lang.Object[] objArray92 = pilha79.item;
        pilha43.empilha((java.lang.Object) objArray92);
        pilha0.item = objArray92;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0d + "'", obj54, 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0.0d + "'", obj60, 0.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0d + "'", obj71, 0.0d);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 0.0d + "'", obj83, 0.0d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Object[] objArray24 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        int int18 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.topo;
        int int4 = pilha0.topo;
        pilha0.topo = 2;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.topo = (-1);
        int int18 = pilha7.tamanho();
        pilha7.topo = (byte) 10;
        int int21 = pilha7.tamanho();
        java.lang.Object[] objArray22 = pilha7.item;
        int int23 = pilha7.topo;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        java.lang.Object obj28 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) (byte) 1);
        pilha24.empilha((java.lang.Object) 1.0f);
        pilha24.topo = (-1);
        int int35 = pilha24.tamanho();
        pilha7.empilha((java.lang.Object) int35);
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        java.lang.Object[] objArray39 = pilha37.item;
        int int40 = pilha37.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) 0.0d);
        boolean boolean45 = pilha42.vazia();
        boolean boolean46 = pilha42.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        java.lang.Object obj51 = pilha47.desempilha();
        java.lang.Object[] objArray52 = pilha47.item;
        java.lang.Object[] objArray53 = pilha47.item;
        pilha42.item = objArray53;
        pilha41.item = objArray53;
        pilha37.item = objArray53;
        pilha7.empilha((java.lang.Object) pilha37);
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray65 = pilha58.item;
        pilha37.item = objArray65;
        pilha0.item = objArray65;
        ds.Pilha pilha68 = new ds.Pilha();
        boolean boolean69 = pilha68.vazia();
        boolean boolean70 = pilha68.vazia();
        pilha68.empilha((java.lang.Object) 100);
        ds.Pilha pilha73 = new ds.Pilha();
        pilha73.empilha((java.lang.Object) 0.0d);
        boolean boolean76 = pilha73.vazia();
        java.lang.Object obj77 = pilha73.desempilha();
        pilha73.empilha((java.lang.Object) (byte) 1);
        pilha73.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray82 = pilha73.item;
        java.lang.Object[] objArray83 = pilha73.item;
        pilha68.item = objArray83;
        pilha0.item = objArray83;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 0.0d + "'", obj77, 0.0d);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.topo;
        int int24 = pilha0.topo;
        java.lang.Object obj25 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (byte) 1);
        pilha10.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray19 = pilha10.item;
        java.lang.Object[] objArray20 = pilha10.item;
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        boolean boolean23 = pilha21.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        int int28 = pilha24.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) 0.0d);
        boolean boolean36 = pilha33.vazia();
        boolean boolean37 = pilha33.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        java.lang.Object[] objArray43 = pilha38.item;
        pilha33.item = objArray43;
        pilha29.item = objArray43;
        pilha24.empilha((java.lang.Object) pilha29);
        java.lang.Object obj47 = pilha24.desempilha();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 0.0d };
        pilha24.item = objArray49;
        pilha21.item = objArray49;
        pilha10.empilha((java.lang.Object) objArray49);
        pilha0.item = objArray49;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[0.0]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        boolean boolean17 = pilha9.vazia();
        int int18 = pilha9.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = 11;
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = '#';
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        java.lang.Object obj38 = pilha34.desempilha();
        int int39 = pilha34.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha40.item = objArray51;
        pilha34.item = objArray51;
        pilha19.item = objArray51;
        pilha19.topo = (short) 10;
        pilha0.empilha((java.lang.Object) (short) 10);
        int int58 = pilha0.tamanho();
        int int59 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 36 + "'", int58 == 36);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 36 + "'", int59 == 36);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = 0;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.topo = (-1);
        int int31 = pilha20.tamanho();
        pilha20.topo = (byte) 10;
        int int34 = pilha20.tamanho();
        java.lang.Object[] objArray35 = pilha20.item;
        int int36 = pilha20.topo;
        int int37 = pilha20.topo;
        pilha9.empilha((java.lang.Object) pilha20);
        int int39 = pilha9.topo;
        int int40 = pilha9.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        java.lang.Object[] objArray14 = pilha12.item;
        boolean boolean15 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) "");
        int int18 = pilha12.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.empilha((java.lang.Object) 0.0d);
        pilha12.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray31 = pilha12.item;
        pilha0.item = objArray31;
        int int33 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass34 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object[] objArray23 = pilha17.item;
        boolean boolean24 = pilha17.vazia();
        int int25 = pilha17.topo;
        pilha0.empilha((java.lang.Object) pilha17);
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) (byte) 1);
        pilha28.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 0.0d);
        boolean boolean40 = pilha37.vazia();
        java.lang.Object obj41 = pilha37.desempilha();
        int int42 = pilha37.topo;
        pilha28.empilha((java.lang.Object) pilha37);
        java.lang.Object[] objArray44 = pilha28.item;
        pilha0.item = objArray44;
        java.lang.Object[] objArray46 = pilha0.item;
        int int47 = pilha0.tamanho();
        pilha0.topo = 32;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        pilha0.topo = 100;
        pilha0.topo = 4;
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray21 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        pilha0.topo = (short) -1;
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        int int17 = pilha14.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        java.lang.Object obj28 = pilha24.desempilha();
        java.lang.Object[] objArray29 = pilha24.item;
        java.lang.Object[] objArray30 = pilha24.item;
        pilha19.item = objArray30;
        pilha18.item = objArray30;
        pilha14.item = objArray30;
        pilha0.item = objArray30;
        java.lang.Object[] objArray35 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        pilha0.topo = (short) -1;
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        int int22 = pilha0.tamanho();
        pilha0.topo = 100;
        java.lang.Class<?> wildcardClass25 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        java.lang.Object obj10 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) (byte) 1);
        pilha6.topo = 'a';
        pilha6.topo = (byte) 0;
        boolean boolean17 = pilha6.vazia();
        pilha0.empilha((java.lang.Object) boolean17);
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        int int34 = pilha29.topo;
        pilha20.empilha((java.lang.Object) pilha29);
        java.lang.Object[] objArray36 = pilha20.item;
        boolean boolean37 = pilha20.vazia();
        pilha0.empilha((java.lang.Object) pilha20);
        pilha20.topo = 95;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha6 = new ds.Pilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        boolean boolean11 = pilha7.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha7.item = objArray18;
        pilha6.item = objArray18;
        boolean boolean21 = pilha6.vazia();
        int int22 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean24 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        int int17 = pilha0.topo;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj31 = pilha20.desempilha();
        java.lang.Object[] objArray32 = pilha20.item;
        pilha0.item = objArray32;
        int int34 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (short) 0;
        int int12 = pilha0.tamanho();
        java.lang.Object[] objArray13 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha5.item = objArray16;
        pilha4.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object obj23 = pilha0.desempilha();
        int int24 = pilha0.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        java.lang.Object[] objArray31 = pilha29.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        pilha29.item = objArray32;
        pilha25.empilha((java.lang.Object) pilha29);
        java.lang.Object obj35 = pilha25.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        pilha39.empilha((java.lang.Object) (byte) 1);
        pilha39.empilha((java.lang.Object) 1.0f);
        pilha39.topo = (-1);
        int int50 = pilha39.tamanho();
        pilha39.topo = (byte) 10;
        int int53 = pilha39.tamanho();
        java.lang.Object[] objArray54 = pilha39.item;
        pilha36.item = objArray54;
        pilha25.item = objArray54;
        pilha0.item = objArray54;
        int int58 = pilha0.topo;
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.empilha((java.lang.Object) 0.0d);
        boolean boolean62 = pilha59.vazia();
        java.lang.Object obj63 = pilha59.desempilha();
        pilha59.empilha((java.lang.Object) (byte) 1);
        pilha59.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.empilha((java.lang.Object) 0.0d);
        boolean boolean71 = pilha68.vazia();
        java.lang.Object obj72 = pilha68.desempilha();
        int int73 = pilha68.topo;
        pilha59.empilha((java.lang.Object) pilha68);
        int int75 = pilha68.tamanho();
        int int76 = pilha68.tamanho();
        java.lang.Object[] objArray77 = pilha68.item;
        pilha0.item = objArray77;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0.0d + "'", obj63, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 1;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        boolean boolean14 = pilha10.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha10.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 100.0f, objArray20 };
        pilha4.item = objArray20;
        java.lang.Object[] objArray25 = pilha4.item;
        java.lang.Object[] objArray26 = pilha4.item;
        pilha0.item = objArray26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.topo;
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj11 = pilha0.desempilha();
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        boolean boolean19 = pilha15.vazia();
        java.lang.Object obj20 = pilha15.desempilha();
        boolean boolean21 = pilha15.vazia();
        boolean boolean22 = pilha15.vazia();
        java.lang.Object[] objArray23 = pilha15.item;
        java.lang.Object[] objArray24 = pilha15.item;
        pilha0.empilha((java.lang.Object) pilha15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.topo = '4';
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        boolean boolean29 = pilha25.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 0.0d);
        boolean boolean33 = pilha30.vazia();
        java.lang.Object obj34 = pilha30.desempilha();
        java.lang.Object[] objArray35 = pilha30.item;
        java.lang.Object[] objArray36 = pilha30.item;
        pilha25.item = objArray36;
        pilha19.item = objArray36;
        pilha12.item = objArray36;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 0.0d);
        boolean boolean47 = pilha44.vazia();
        boolean boolean48 = pilha44.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        pilha44.item = objArray54;
        pilha40.item = objArray54;
        pilha12.item = objArray54;
        pilha0.item = objArray54;
        int int59 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = '#';
        java.lang.Class<?> wildcardClass19 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray18 = pilha0.item;
        int int19 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        pilha0.topo = ' ';
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 1;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray31 = pilha22.item;
        pilha17.empilha((java.lang.Object) objArray31);
        pilha0.item = objArray31;
        java.lang.Object obj34 = pilha0.desempilha();
        boolean boolean35 = pilha0.vazia();
        java.lang.Object[] objArray36 = pilha0.item;
        java.lang.Object obj37 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (byte) 1);
        pilha14.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray23 = pilha14.item;
        java.lang.Object[] objArray24 = pilha14.item;
        pilha0.item = objArray24;
        int int26 = pilha0.topo;
        boolean boolean27 = pilha0.vazia();
        int int28 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        pilha14.item = objArray17;
        pilha0.item = objArray17;
        int int20 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha18.item = objArray29;
        pilha12.item = objArray29;
        pilha0.item = objArray29;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) 0.0d);
        boolean boolean36 = pilha33.vazia();
        java.lang.Object obj37 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) (byte) 1);
        pilha33.empilha((java.lang.Object) 1.0f);
        pilha33.topo = (-1);
        int int44 = pilha33.topo;
        int int45 = pilha33.topo;
        java.lang.Object[] objArray46 = pilha33.item;
        boolean boolean47 = pilha33.vazia();
        java.lang.Object[] objArray48 = pilha33.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        pilha0.topo = 37;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        int int12 = pilha0.tamanho();
        java.lang.Object obj13 = null;
        pilha0.empilha(obj13);
        int int15 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha9.empilha((java.lang.Object) pilha16);
        boolean boolean22 = pilha16.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj26 = pilha23.desempilha();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha16.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        int int33 = pilha29.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        boolean boolean42 = pilha38.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 0.0d);
        boolean boolean46 = pilha43.vazia();
        java.lang.Object obj47 = pilha43.desempilha();
        java.lang.Object[] objArray48 = pilha43.item;
        pilha38.item = objArray48;
        pilha34.item = objArray48;
        pilha29.empilha((java.lang.Object) pilha34);
        int int52 = pilha34.topo;
        pilha34.topo = '#';
        pilha34.topo = 0;
        pilha16.empilha((java.lang.Object) pilha34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        boolean boolean26 = pilha22.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha22.item = objArray32;
        pilha18.item = objArray32;
        pilha18.topo = '#';
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 0.0d);
        boolean boolean40 = pilha37.vazia();
        java.lang.Object obj41 = pilha37.desempilha();
        pilha37.empilha((java.lang.Object) (byte) 1);
        pilha37.empilha((java.lang.Object) 1.0f);
        pilha37.topo = (-1);
        int int48 = pilha37.tamanho();
        pilha37.topo = (byte) 10;
        java.lang.Object obj51 = pilha37.desempilha();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        int int57 = pilha52.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        boolean boolean62 = pilha58.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        java.lang.Object[] objArray68 = pilha63.item;
        java.lang.Object[] objArray69 = pilha63.item;
        pilha58.item = objArray69;
        pilha52.item = objArray69;
        pilha37.item = objArray69;
        pilha37.topo = (short) 10;
        pilha18.empilha((java.lang.Object) (short) 10);
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.empilha((java.lang.Object) 0.0d);
        boolean boolean79 = pilha76.vazia();
        java.lang.Object obj80 = pilha76.desempilha();
        pilha76.empilha((java.lang.Object) (byte) 1);
        pilha76.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray85 = pilha76.item;
        pilha18.item = objArray85;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Class<?> wildcardClass88 = pilha18.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0.0d + "'", obj80, 0.0d);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        pilha0.topo = (short) -1;
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (byte) 1);
        pilha14.empilha((java.lang.Object) 1.0f);
        pilha14.topo = (-1);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (byte) 1);
        pilha25.empilha((java.lang.Object) 1.0f);
        pilha25.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 0.0d);
        boolean boolean39 = pilha36.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        java.lang.Object[] objArray42 = pilha40.item;
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        pilha40.item = objArray43;
        pilha36.empilha((java.lang.Object) pilha40);
        pilha25.empilha((java.lang.Object) pilha36);
        java.lang.Object[] objArray47 = pilha36.item;
        pilha14.item = objArray47;
        pilha0.item = objArray47;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = '#';
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        java.lang.Object obj38 = pilha34.desempilha();
        int int39 = pilha34.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha40.item = objArray51;
        pilha34.item = objArray51;
        pilha19.item = objArray51;
        pilha19.topo = (short) 10;
        pilha0.empilha((java.lang.Object) (short) 10);
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.topo = '4';
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) 0.0d);
        boolean boolean68 = pilha65.vazia();
        java.lang.Object obj69 = pilha65.desempilha();
        int int70 = pilha65.topo;
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) 0.0d);
        boolean boolean74 = pilha71.vazia();
        boolean boolean75 = pilha71.vazia();
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.empilha((java.lang.Object) 0.0d);
        boolean boolean79 = pilha76.vazia();
        java.lang.Object obj80 = pilha76.desempilha();
        java.lang.Object[] objArray81 = pilha76.item;
        java.lang.Object[] objArray82 = pilha76.item;
        pilha71.item = objArray82;
        pilha65.item = objArray82;
        pilha58.item = objArray82;
        pilha0.empilha((java.lang.Object) pilha58);
        int int87 = pilha0.tamanho();
        pilha0.topo = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0.0d + "'", obj69, 0.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0.0d + "'", obj80, 0.0d);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 37 + "'", int87 == 37);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        int int36 = pilha31.topo;
        pilha22.empilha((java.lang.Object) pilha31);
        boolean boolean38 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) boolean38);
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray19 = pilha0.item;
        java.lang.Object obj20 = pilha0.desempilha();
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object obj22 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        pilha0.topo = (short) 1;
        java.lang.Object obj24 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha5.item = objArray16;
        pilha4.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object obj23 = pilha0.desempilha();
        int int24 = pilha0.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        java.lang.Object[] objArray31 = pilha29.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        pilha29.item = objArray32;
        pilha25.empilha((java.lang.Object) pilha29);
        java.lang.Object obj35 = pilha25.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        pilha39.empilha((java.lang.Object) (byte) 1);
        pilha39.empilha((java.lang.Object) 1.0f);
        pilha39.topo = (-1);
        int int50 = pilha39.tamanho();
        pilha39.topo = (byte) 10;
        int int53 = pilha39.tamanho();
        java.lang.Object[] objArray54 = pilha39.item;
        pilha36.item = objArray54;
        pilha25.item = objArray54;
        pilha0.item = objArray54;
        int int58 = pilha0.topo;
        int int59 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        java.lang.Object obj17 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        int int13 = pilha9.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha18.item = objArray28;
        pilha14.item = objArray28;
        pilha9.empilha((java.lang.Object) pilha14);
        boolean boolean32 = pilha14.vazia();
        pilha14.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        pilha0.topo = 3;
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha21.item = objArray32;
        pilha15.item = objArray32;
        pilha0.item = objArray32;
        pilha0.topo = 'a';
        pilha0.topo = '#';
        int int40 = pilha0.topo;
        boolean boolean41 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 1;
        int int28 = pilha23.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        boolean boolean31 = pilha29.vazia();
        pilha29.topo = 1;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        boolean boolean39 = pilha35.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha35.item = objArray45;
        java.lang.Class<?> wildcardClass47 = objArray45.getClass();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 100.0f, objArray45 };
        pilha29.item = objArray45;
        java.lang.Object[] objArray50 = pilha29.item;
        pilha23.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        boolean boolean56 = pilha52.vazia();
        boolean boolean57 = pilha52.vazia();
        java.lang.Object[] objArray58 = pilha52.item;
        pilha29.empilha((java.lang.Object) objArray58);
        pilha0.item = objArray58;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        java.lang.Object[] objArray66 = pilha61.item;
        java.lang.Object[] objArray67 = pilha61.item;
        boolean boolean68 = pilha61.vazia();
        int int69 = pilha61.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        boolean boolean71 = pilha70.vazia();
        boolean boolean72 = pilha70.vazia();
        ds.Pilha pilha73 = new ds.Pilha();
        pilha73.empilha((java.lang.Object) 0.0d);
        boolean boolean76 = pilha73.vazia();
        java.lang.Object obj77 = pilha73.desempilha();
        pilha73.empilha((java.lang.Object) (byte) 1);
        pilha73.empilha((java.lang.Object) 1.0f);
        pilha73.topo = (-1);
        int int84 = pilha73.tamanho();
        pilha73.topo = (byte) 10;
        int int87 = pilha73.tamanho();
        java.lang.Object[] objArray88 = pilha73.item;
        pilha70.item = objArray88;
        pilha61.item = objArray88;
        pilha0.item = objArray88;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 0.0d + "'", obj77, 0.0d);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        java.lang.Object[] objArray34 = pilha19.item;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 1;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray50 = pilha41.item;
        pilha36.empilha((java.lang.Object) objArray50);
        pilha19.item = objArray50;
        pilha0.item = objArray50;
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) 0.0d);
        boolean boolean57 = pilha54.vazia();
        java.lang.Object obj58 = pilha54.desempilha();
        java.lang.Object[] objArray59 = pilha54.item;
        int int60 = pilha54.topo;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        int int66 = pilha61.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) 0.0d);
        boolean boolean70 = pilha67.vazia();
        boolean boolean71 = pilha67.vazia();
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.empilha((java.lang.Object) 0.0d);
        boolean boolean75 = pilha72.vazia();
        java.lang.Object obj76 = pilha72.desempilha();
        java.lang.Object[] objArray77 = pilha72.item;
        java.lang.Object[] objArray78 = pilha72.item;
        pilha67.item = objArray78;
        pilha61.item = objArray78;
        java.lang.Object[] objArray81 = pilha61.item;
        pilha54.empilha((java.lang.Object) pilha61);
        java.lang.Object[] objArray83 = pilha54.item;
        pilha0.item = objArray83;
        int int85 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 0.0d + "'", obj76, 0.0d);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray23 = pilha5.item;
        int int24 = pilha5.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object[] objArray3 = pilha0.item;
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) (byte) 1);
        pilha4.empilha((java.lang.Object) 1.0f);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        int int16 = pilha4.topo;
        java.lang.Object[] objArray17 = pilha4.item;
        pilha0.item = objArray17;
        int int19 = pilha0.topo;
        int int20 = pilha0.topo;
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object obj16 = pilha0.desempilha();
        boolean boolean17 = pilha0.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        java.lang.Object obj22 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) (byte) 1);
        pilha18.empilha((java.lang.Object) 1.0f);
        pilha18.topo = (short) -1;
        java.lang.Object[] objArray29 = pilha18.item;
        pilha0.empilha((java.lang.Object) pilha18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.topo;
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        boolean boolean28 = pilha24.vazia();
        java.lang.Object obj29 = pilha24.desempilha();
        boolean boolean30 = pilha24.vazia();
        boolean boolean31 = pilha24.vazia();
        java.lang.Object[] objArray32 = pilha24.item;
        java.lang.Object[] objArray33 = pilha24.item;
        pilha0.item = objArray33;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        java.lang.Object[] objArray34 = pilha19.item;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 1;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray50 = pilha41.item;
        pilha36.empilha((java.lang.Object) objArray50);
        pilha19.item = objArray50;
        pilha0.item = objArray50;
        pilha0.topo = (short) 0;
        boolean boolean56 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha5.item = objArray16;
        pilha4.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        int int23 = pilha20.topo;
        pilha20.topo = '#';
        boolean boolean26 = pilha20.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha18.item = objArray29;
        pilha12.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 3;
        int int35 = pilha0.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 0.0d);
        boolean boolean39 = pilha36.vazia();
        int int40 = pilha36.topo;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        pilha45.topo = '4';
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        int int57 = pilha52.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        boolean boolean62 = pilha58.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        java.lang.Object[] objArray68 = pilha63.item;
        java.lang.Object[] objArray69 = pilha63.item;
        pilha58.item = objArray69;
        pilha52.item = objArray69;
        pilha45.item = objArray69;
        java.lang.Object[] objArray73 = pilha45.item;
        pilha36.item = objArray73;
        pilha0.item = objArray73;
        int int76 = pilha0.topo;
        int int77 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object[] objArray18 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.topo;
        int int12 = pilha0.topo;
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha12.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        int int27 = pilha21.topo;
        pilha12.empilha((java.lang.Object) int27);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) (byte) 1);
        pilha12.empilha((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray37 = pilha12.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) (byte) 1);
        pilha38.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        java.lang.Object obj51 = pilha47.desempilha();
        int int52 = pilha47.topo;
        pilha38.empilha((java.lang.Object) pilha47);
        int int54 = pilha47.tamanho();
        java.lang.Object[] objArray55 = pilha47.item;
        pilha12.item = objArray55;
        java.lang.Class<?> wildcardClass57 = pilha12.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass57);
        java.lang.Object obj59 = pilha0.desempilha();
        java.lang.Object[] objArray60 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "class ds.Pilha");
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = 100;
        java.lang.Object obj9 = pilha0.desempilha();
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        pilha9.topo = '4';
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        java.lang.Object obj20 = pilha16.desempilha();
        int int21 = pilha16.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        boolean boolean26 = pilha22.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        java.lang.Object[] objArray32 = pilha27.item;
        java.lang.Object[] objArray33 = pilha27.item;
        pilha22.item = objArray33;
        pilha16.item = objArray33;
        pilha9.item = objArray33;
        java.lang.Object[] objArray37 = pilha9.item;
        pilha0.item = objArray37;
        int int39 = pilha0.topo;
        boolean boolean40 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        pilha0.topo = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 'a';
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.topo;
        pilha9.topo = 9;
        pilha9.topo = (byte) 10;
        int int21 = pilha9.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.topo = '4';
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        int int34 = pilha29.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        boolean boolean39 = pilha35.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object[] objArray46 = pilha40.item;
        pilha35.item = objArray46;
        pilha29.item = objArray46;
        pilha22.item = objArray46;
        java.lang.Object[] objArray50 = pilha22.item;
        pilha9.item = objArray50;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        int int11 = pilha0.topo;
        pilha0.topo = '4';
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (byte) 1);
        pilha14.empilha((java.lang.Object) 1.0f);
        pilha14.topo = (-1);
        int int25 = pilha14.tamanho();
        pilha14.topo = (byte) 10;
        int int28 = pilha14.tamanho();
        java.lang.Object[] objArray29 = pilha14.item;
        pilha0.empilha((java.lang.Object) pilha14);
        java.lang.Object obj31 = pilha14.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        int int21 = pilha0.topo;
        pilha0.topo = 9;
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.tamanho();
        java.lang.Object[] objArray26 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = 0;
        pilha9.topo = 100;
        java.lang.Object[] objArray22 = null;
        pilha9.item = objArray22;
        boolean boolean24 = pilha9.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        int int36 = pilha31.topo;
        pilha22.empilha((java.lang.Object) pilha31);
        boolean boolean38 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) boolean38);
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.topo;
        java.lang.Object obj42 = pilha0.desempilha();
        int int43 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray17 = pilha8.item;
        pilha0.item = objArray17;
        boolean boolean19 = pilha0.vazia();
        int int20 = pilha0.tamanho();
        java.lang.Object obj21 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray19 = pilha0.item;
        java.lang.Object[] objArray20 = pilha0.item;
        int int21 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        pilha0.topo = 3;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        boolean boolean19 = pilha15.vazia();
        boolean boolean20 = pilha15.vazia();
        pilha0.empilha((java.lang.Object) pilha15);
        int int22 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        int int12 = pilha7.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        java.lang.Object obj22 = pilha18.desempilha();
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha13.item = objArray24;
        pilha7.item = objArray24;
        java.lang.Object[] objArray27 = pilha7.item;
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        boolean boolean31 = pilha29.vazia();
        java.lang.Object[] objArray32 = pilha29.item;
        int int33 = pilha29.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        boolean boolean36 = pilha34.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 0.0d);
        boolean boolean40 = pilha37.vazia();
        int int41 = pilha37.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) 0.0d);
        boolean boolean45 = pilha42.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        boolean boolean50 = pilha46.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 0.0d);
        boolean boolean54 = pilha51.vazia();
        java.lang.Object obj55 = pilha51.desempilha();
        java.lang.Object[] objArray56 = pilha51.item;
        pilha46.item = objArray56;
        pilha42.item = objArray56;
        pilha37.empilha((java.lang.Object) pilha42);
        java.lang.Object obj60 = pilha37.desempilha();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0.0d };
        pilha37.item = objArray62;
        pilha34.item = objArray62;
        pilha29.item = objArray62;
        pilha7.item = objArray62;
        int int67 = pilha7.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.empilha((java.lang.Object) 0.0d);
        boolean boolean71 = pilha68.vazia();
        java.lang.Object obj72 = pilha68.desempilha();
        java.lang.Object[] objArray73 = pilha68.item;
        java.lang.Object[] objArray74 = pilha68.item;
        pilha68.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.empilha((java.lang.Object) 0.0d);
        boolean boolean80 = pilha77.vazia();
        java.lang.Object obj81 = pilha77.desempilha();
        java.lang.Object[] objArray82 = pilha77.item;
        int int83 = pilha77.topo;
        pilha68.empilha((java.lang.Object) int83);
        ds.Pilha pilha85 = new ds.Pilha();
        pilha85.empilha((java.lang.Object) 0.0d);
        boolean boolean88 = pilha85.vazia();
        java.lang.Object obj89 = pilha85.desempilha();
        pilha85.empilha((java.lang.Object) (byte) 1);
        pilha68.empilha((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray93 = pilha68.item;
        pilha7.empilha((java.lang.Object) objArray93);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 0.0d + "'", obj81, 0.0d);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0.0d + "'", obj89, 0.0d);
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        int int10 = pilha4.tamanho();
        int int11 = pilha4.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        int int11 = pilha7.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        pilha16.item = objArray26;
        pilha12.item = objArray26;
        pilha7.empilha((java.lang.Object) pilha12);
        java.lang.Object obj30 = pilha7.desempilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0.0d };
        pilha7.item = objArray32;
        java.lang.Object[] objArray34 = pilha7.item;
        pilha0.item = objArray34;
        boolean boolean36 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        java.lang.Object obj10 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) (byte) 1);
        pilha6.topo = 'a';
        pilha6.topo = (byte) 0;
        boolean boolean17 = pilha6.vazia();
        pilha0.empilha((java.lang.Object) boolean17);
        int int19 = pilha0.tamanho();
        java.lang.Object obj20 = pilha0.desempilha();
        boolean boolean21 = pilha0.vazia();
        java.lang.Object obj22 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        pilha23.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha39.desempilha();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha32.empilha((java.lang.Object) pilha39);
        boolean boolean45 = pilha32.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha46.item = objArray55;
        int int57 = pilha46.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        pilha58.empilha((java.lang.Object) 1.0f);
        pilha58.topo = (-1);
        int int69 = pilha58.tamanho();
        pilha58.topo = (byte) 10;
        java.lang.Object obj72 = pilha58.desempilha();
        java.lang.Object[] objArray73 = pilha58.item;
        pilha46.empilha((java.lang.Object) objArray73);
        pilha32.item = objArray73;
        pilha0.item = objArray73;
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.empilha((java.lang.Object) 0.0d);
        boolean boolean80 = pilha77.vazia();
        boolean boolean81 = pilha77.vazia();
        boolean boolean82 = pilha77.vazia();
        java.lang.Object[] objArray83 = pilha77.item;
        pilha77.topo = (byte) 10;
        pilha0.empilha((java.lang.Object) pilha77);
        java.lang.Object[] objArray87 = pilha77.item;
        java.lang.Class<?> wildcardClass88 = objArray87.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        boolean boolean14 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) 100);
        boolean boolean17 = pilha12.vazia();
        java.lang.Object obj18 = pilha12.desempilha();
        pilha0.empilha((java.lang.Object) pilha12);
        int int20 = pilha12.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = pilha12.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        pilha0.topo = 100;
        boolean boolean17 = pilha0.vazia();
        int int18 = pilha0.topo;
        pilha0.topo = 4;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        java.lang.Object[] objArray10 = pilha8.item;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        pilha8.item = objArray11;
        pilha4.empilha((java.lang.Object) pilha8);
        java.lang.Object obj14 = pilha4.desempilha();
        boolean boolean15 = pilha4.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) (byte) 1);
        pilha16.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        int int30 = pilha25.topo;
        pilha16.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj35 = pilha32.desempilha();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha25.empilha((java.lang.Object) pilha32);
        boolean boolean38 = pilha25.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        int int41 = pilha39.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) 0.0d);
        boolean boolean45 = pilha42.vazia();
        java.lang.Object obj46 = pilha42.desempilha();
        java.lang.Object[] objArray47 = pilha42.item;
        java.lang.Object[] objArray48 = pilha42.item;
        pilha39.item = objArray48;
        int int50 = pilha39.tamanho();
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 0.0d);
        boolean boolean54 = pilha51.vazia();
        java.lang.Object obj55 = pilha51.desempilha();
        pilha51.empilha((java.lang.Object) (byte) 1);
        pilha51.empilha((java.lang.Object) 1.0f);
        pilha51.topo = (-1);
        int int62 = pilha51.tamanho();
        pilha51.topo = (byte) 10;
        java.lang.Object obj65 = pilha51.desempilha();
        java.lang.Object[] objArray66 = pilha51.item;
        pilha39.empilha((java.lang.Object) objArray66);
        pilha25.item = objArray66;
        pilha4.item = objArray66;
        java.lang.Object[] objArray70 = pilha4.item;
        pilha0.item = objArray70;
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.empilha((java.lang.Object) 0.0d);
        boolean boolean75 = pilha72.vazia();
        int int76 = pilha72.topo;
        java.lang.Object[] objArray77 = pilha72.item;
        int int78 = pilha72.topo;
        int int79 = pilha72.tamanho();
        java.lang.Class<?> wildcardClass80 = pilha72.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj11 = pilha0.desempilha();
        boolean boolean12 = pilha0.vazia();
        int int13 = pilha0.topo;
        pilha0.topo = 12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        int int7 = pilha0.topo;
        pilha0.topo = (-1);
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha0.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        java.lang.Object obj22 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) (byte) 1);
        pilha18.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        int int32 = pilha27.topo;
        pilha18.empilha((java.lang.Object) pilha27);
        int int34 = pilha27.tamanho();
        int int35 = pilha27.tamanho();
        java.lang.Object[] objArray36 = pilha27.item;
        pilha0.item = objArray36;
        java.lang.Class<?> wildcardClass38 = objArray36.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        int int23 = pilha5.topo;
        pilha5.topo = '#';
        int int26 = pilha5.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object[] objArray23 = pilha17.item;
        boolean boolean24 = pilha17.vazia();
        int int25 = pilha17.topo;
        pilha0.empilha((java.lang.Object) pilha17);
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 1;
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        boolean boolean38 = pilha34.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        java.lang.Object[] objArray44 = pilha39.item;
        pilha34.item = objArray44;
        java.lang.Class<?> wildcardClass46 = objArray44.getClass();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100.0f, objArray44 };
        pilha28.item = objArray44;
        java.lang.Object[] objArray49 = pilha28.item;
        java.lang.Object[] objArray50 = pilha28.item;
        pilha0.item = objArray50;
        java.lang.Class<?> wildcardClass52 = objArray50.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) (byte) 1);
        pilha9.empilha((java.lang.Object) 1.0f);
        pilha9.topo = (short) -1;
        int int20 = pilha9.topo;
        pilha9.topo = '4';
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        pilha23.topo = (-1);
        int int34 = pilha23.tamanho();
        pilha23.topo = (byte) 10;
        int int37 = pilha23.tamanho();
        java.lang.Object[] objArray38 = pilha23.item;
        pilha9.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object[] objArray46 = pilha40.item;
        pilha23.item = objArray46;
        java.lang.Object obj48 = pilha23.desempilha();
        pilha0.empilha((java.lang.Object) pilha23);
        java.lang.Object obj50 = pilha23.desempilha();
        int int51 = pilha23.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = '#';
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = '4';
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 2);
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        java.lang.Object obj9 = pilha5.desempilha();
        pilha5.empilha((java.lang.Object) (byte) 1);
        pilha5.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray14 = pilha5.item;
        pilha0.empilha((java.lang.Object) objArray14);
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj10 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 2);
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Object[] objArray14 = pilha0.item;
        int int15 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = '#';
        pilha0.empilha((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        pilha0.topo = 'a';
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        pilha8.topo = (-1);
        java.lang.Object[] objArray19 = pilha8.item;
        java.lang.Object[] objArray20 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        pilha23.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha39.desempilha();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha32.empilha((java.lang.Object) pilha39);
        boolean boolean45 = pilha32.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha46.item = objArray55;
        int int57 = pilha46.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        pilha58.empilha((java.lang.Object) 1.0f);
        pilha58.topo = (-1);
        int int69 = pilha58.tamanho();
        pilha58.topo = (byte) 10;
        java.lang.Object obj72 = pilha58.desempilha();
        java.lang.Object[] objArray73 = pilha58.item;
        pilha46.empilha((java.lang.Object) objArray73);
        pilha32.item = objArray73;
        pilha0.item = objArray73;
        ds.Pilha pilha77 = new ds.Pilha();
        boolean boolean78 = pilha77.vazia();
        int int79 = pilha77.topo;
        ds.Pilha pilha80 = new ds.Pilha();
        pilha80.empilha((java.lang.Object) 0.0d);
        boolean boolean83 = pilha80.vazia();
        java.lang.Object obj84 = pilha80.desempilha();
        java.lang.Object[] objArray85 = pilha80.item;
        java.lang.Object[] objArray86 = pilha80.item;
        pilha77.item = objArray86;
        boolean boolean88 = pilha77.vazia();
        pilha0.empilha((java.lang.Object) boolean88);
        int int90 = pilha0.tamanho();
        int int91 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 0.0d + "'", obj84, 0.0d);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 5 + "'", int90 == 5);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 5 + "'", int91 == 5);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha21.item = objArray32;
        pilha15.item = objArray32;
        int int35 = pilha15.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        java.lang.Object[] objArray38 = pilha36.item;
        pilha15.empilha((java.lang.Object) pilha36);
        java.lang.Object[] objArray40 = pilha15.item;
        pilha0.item = objArray40;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10L + "'", obj14, 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Class<?> wildcardClass2 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        int int17 = pilha0.topo;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj31 = pilha20.desempilha();
        java.lang.Object[] objArray32 = pilha20.item;
        pilha0.item = objArray32;
        java.lang.Object[] objArray34 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        java.lang.Object[] objArray18 = pilha0.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        java.lang.Object[] objArray21 = pilha19.item;
        boolean boolean22 = pilha19.vazia();
        int int23 = pilha19.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        java.lang.Object obj28 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) (byte) 1);
        pilha24.empilha((java.lang.Object) 1.0f);
        pilha24.topo = (-1);
        int int35 = pilha24.tamanho();
        pilha24.topo = (byte) 10;
        java.lang.Object obj38 = pilha24.desempilha();
        java.lang.Object[] objArray39 = pilha24.item;
        pilha19.item = objArray39;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        int int7 = pilha3.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha12.item = objArray22;
        pilha8.item = objArray22;
        pilha3.empilha((java.lang.Object) pilha8);
        java.lang.Object obj26 = pilha3.desempilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0.0d };
        pilha3.item = objArray28;
        pilha0.item = objArray28;
        int int31 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray26 = pilha23.item;
        java.lang.Object[] objArray27 = pilha23.item;
        pilha5.empilha((java.lang.Object) objArray27);
        java.lang.Object[] objArray29 = null;
        pilha5.item = objArray29;
        boolean boolean31 = pilha5.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        java.lang.Object[] objArray37 = pilha32.item;
        java.lang.Object[] objArray38 = pilha32.item;
        boolean boolean39 = pilha32.vazia();
        int int40 = pilha32.topo;
        int int41 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) false);
        pilha32.topo = 3;
        boolean boolean46 = pilha32.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        java.lang.Object obj51 = pilha47.desempilha();
        int int52 = pilha47.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) 0.0d);
        boolean boolean56 = pilha53.vazia();
        boolean boolean57 = pilha53.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        java.lang.Object[] objArray63 = pilha58.item;
        java.lang.Object[] objArray64 = pilha58.item;
        pilha53.item = objArray64;
        pilha47.item = objArray64;
        pilha32.item = objArray64;
        pilha32.topo = 'a';
        int int70 = pilha32.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha5.empilha((java.lang.Object) pilha32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.topo;
        int int12 = pilha0.tamanho();
        java.lang.Object[] objArray13 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        int int17 = pilha9.tamanho();
        java.lang.Object[] objArray18 = pilha9.item;
        java.lang.Object[] objArray19 = pilha9.item;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        int int34 = pilha29.topo;
        pilha20.empilha((java.lang.Object) pilha29);
        int int36 = pilha29.tamanho();
        int int37 = pilha29.tamanho();
        java.lang.Object[] objArray38 = pilha29.item;
        java.lang.Object[] objArray39 = pilha29.item;
        pilha9.item = objArray39;
        boolean boolean41 = pilha9.vazia();
        int int42 = pilha9.tamanho();
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 0.0d);
        boolean boolean46 = pilha43.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        boolean boolean51 = pilha47.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        java.lang.Object[] objArray57 = pilha52.item;
        pilha47.item = objArray57;
        pilha43.item = objArray57;
        pilha43.topo = 100;
        boolean boolean62 = pilha43.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        int int68 = pilha63.topo;
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.empilha((java.lang.Object) 0.0d);
        boolean boolean72 = pilha69.vazia();
        boolean boolean73 = pilha69.vazia();
        ds.Pilha pilha74 = new ds.Pilha();
        pilha74.empilha((java.lang.Object) 0.0d);
        boolean boolean77 = pilha74.vazia();
        java.lang.Object obj78 = pilha74.desempilha();
        java.lang.Object[] objArray79 = pilha74.item;
        java.lang.Object[] objArray80 = pilha74.item;
        pilha69.item = objArray80;
        pilha63.item = objArray80;
        java.lang.Object[] objArray83 = pilha63.item;
        pilha43.item = objArray83;
        pilha9.item = objArray83;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0.0d + "'", obj78, 0.0d);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.topo;
        java.lang.Object[] objArray24 = pilha0.item;
        int int25 = pilha0.tamanho();
        int int26 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        java.lang.Object[] objArray18 = pilha0.item;
        pilha0.topo = 52;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        boolean boolean9 = pilha7.vazia();
        pilha7.topo = 1;
        int int12 = pilha7.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 1;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        boolean boolean23 = pilha19.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        java.lang.Object obj28 = pilha24.desempilha();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha19.item = objArray29;
        java.lang.Class<?> wildcardClass31 = objArray29.getClass();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 100.0f, objArray29 };
        pilha13.item = objArray29;
        java.lang.Object[] objArray34 = pilha13.item;
        pilha7.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 0.0d);
        boolean boolean39 = pilha36.vazia();
        java.lang.Object obj40 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) (byte) 1);
        pilha36.empilha((java.lang.Object) 1.0f);
        pilha36.topo = (short) -1;
        int int47 = pilha36.topo;
        pilha36.topo = '4';
        java.lang.Object obj50 = pilha36.desempilha();
        pilha7.empilha((java.lang.Object) pilha36);
        pilha0.empilha((java.lang.Object) pilha7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0.0d + "'", obj40, 0.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        int int33 = pilha0.tamanho();
        pilha0.topo = 97;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object obj15 = pilha0.desempilha();
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        int int21 = pilha17.topo;
        java.lang.Object[] objArray22 = pilha17.item;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.topo = 'a';
        pilha23.topo = (byte) 0;
        boolean boolean34 = pilha23.vazia();
        pilha17.empilha((java.lang.Object) boolean34);
        int int36 = pilha17.tamanho();
        pilha0.empilha((java.lang.Object) pilha17);
        java.lang.Class<?> wildcardClass38 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 1;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray31 = pilha22.item;
        pilha17.empilha((java.lang.Object) objArray31);
        pilha0.item = objArray31;
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        boolean boolean14 = pilha12.vazia();
        int int15 = pilha12.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        boolean boolean18 = pilha16.vazia();
        pilha16.topo = 1;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        boolean boolean26 = pilha22.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha22.item = objArray32;
        java.lang.Class<?> wildcardClass34 = objArray32.getClass();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100.0f, objArray32 };
        pilha16.item = objArray32;
        int int37 = pilha16.tamanho();
        java.lang.Object[] objArray38 = pilha16.item;
        pilha12.item = objArray38;
        pilha0.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        java.lang.Object[] objArray46 = pilha41.item;
        java.lang.Object[] objArray47 = pilha41.item;
        int int48 = pilha41.topo;
        int int49 = pilha41.tamanho();
        java.lang.Object[] objArray50 = pilha41.item;
        boolean boolean51 = pilha41.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        boolean boolean17 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) 100);
        boolean boolean20 = pilha15.vazia();
        pilha0.empilha((java.lang.Object) pilha15);
        pilha0.topo = (byte) 1;
        int int24 = pilha0.tamanho();
        java.lang.Object[] objArray25 = null;
        pilha0.item = objArray25;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        boolean boolean22 = pilha0.vazia();
        java.lang.Object obj23 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        pilha0.topo = (-1);
        pilha0.topo = 98;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray25 = pilha0.item;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) (byte) 1);
        pilha26.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        java.lang.Object obj39 = pilha35.desempilha();
        int int40 = pilha35.topo;
        pilha26.empilha((java.lang.Object) pilha35);
        int int42 = pilha35.tamanho();
        java.lang.Object[] objArray43 = pilha35.item;
        pilha0.item = objArray43;
        java.lang.Object obj45 = pilha0.desempilha();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) 0.0d);
        boolean boolean53 = pilha50.vazia();
        boolean boolean54 = pilha50.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) 0.0d);
        boolean boolean58 = pilha55.vazia();
        java.lang.Object obj59 = pilha55.desempilha();
        java.lang.Object[] objArray60 = pilha55.item;
        pilha50.item = objArray60;
        pilha46.item = objArray60;
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        pilha63.empilha((java.lang.Object) (byte) 1);
        int int70 = pilha63.topo;
        pilha46.empilha((java.lang.Object) int70);
        java.lang.Object[] objArray72 = pilha46.item;
        pilha0.item = objArray72;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.topo;
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        java.lang.Object[] objArray9 = pilha7.item;
        pilha0.item = objArray9;
        java.lang.Object[] objArray11 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        pilha23.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha39.desempilha();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha32.empilha((java.lang.Object) pilha39);
        boolean boolean45 = pilha32.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha46.item = objArray55;
        int int57 = pilha46.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        pilha58.empilha((java.lang.Object) 1.0f);
        pilha58.topo = (-1);
        int int69 = pilha58.tamanho();
        pilha58.topo = (byte) 10;
        java.lang.Object obj72 = pilha58.desempilha();
        java.lang.Object[] objArray73 = pilha58.item;
        pilha46.empilha((java.lang.Object) objArray73);
        pilha32.item = objArray73;
        pilha0.item = objArray73;
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.empilha((java.lang.Object) 0.0d);
        boolean boolean80 = pilha77.vazia();
        boolean boolean81 = pilha77.vazia();
        boolean boolean82 = pilha77.vazia();
        java.lang.Object[] objArray83 = pilha77.item;
        pilha77.topo = (byte) 10;
        pilha0.empilha((java.lang.Object) pilha77);
        java.lang.Object[] objArray87 = pilha0.item;
        java.lang.Object[] objArray88 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        pilha23.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha39.desempilha();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha32.empilha((java.lang.Object) pilha39);
        boolean boolean45 = pilha32.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha46.item = objArray55;
        int int57 = pilha46.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        pilha58.empilha((java.lang.Object) 1.0f);
        pilha58.topo = (-1);
        int int69 = pilha58.tamanho();
        pilha58.topo = (byte) 10;
        java.lang.Object obj72 = pilha58.desempilha();
        java.lang.Object[] objArray73 = pilha58.item;
        pilha46.empilha((java.lang.Object) objArray73);
        pilha32.item = objArray73;
        pilha0.item = objArray73;
        java.lang.Class<?> wildcardClass77 = objArray73.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        boolean boolean23 = pilha0.vazia();
        boolean boolean24 = pilha0.vazia();
        java.lang.Object obj25 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = null;
        pilha0.empilha(obj17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        java.lang.Object[] objArray34 = pilha19.item;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 1;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray50 = pilha41.item;
        pilha36.empilha((java.lang.Object) objArray50);
        pilha19.item = objArray50;
        pilha0.item = objArray50;
        pilha0.topo = (short) 0;
        ds.Pilha pilha56 = new ds.Pilha();
        pilha56.empilha((java.lang.Object) 0.0d);
        boolean boolean59 = pilha56.vazia();
        java.lang.Object obj60 = pilha56.desempilha();
        pilha56.empilha((java.lang.Object) (byte) 1);
        pilha56.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) 0.0d);
        boolean boolean68 = pilha65.vazia();
        java.lang.Object obj69 = pilha65.desempilha();
        int int70 = pilha65.topo;
        pilha56.empilha((java.lang.Object) pilha65);
        int int72 = pilha65.tamanho();
        int int73 = pilha65.tamanho();
        java.lang.Object[] objArray74 = pilha65.item;
        java.lang.Object[] objArray75 = pilha65.item;
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.empilha((java.lang.Object) 0.0d);
        boolean boolean79 = pilha76.vazia();
        java.lang.Object obj80 = pilha76.desempilha();
        pilha76.empilha((java.lang.Object) (byte) 1);
        pilha76.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha85 = new ds.Pilha();
        pilha85.empilha((java.lang.Object) 0.0d);
        boolean boolean88 = pilha85.vazia();
        java.lang.Object obj89 = pilha85.desempilha();
        int int90 = pilha85.topo;
        pilha76.empilha((java.lang.Object) pilha85);
        int int92 = pilha85.tamanho();
        int int93 = pilha85.tamanho();
        java.lang.Object[] objArray94 = pilha85.item;
        java.lang.Object[] objArray95 = pilha85.item;
        pilha65.item = objArray95;
        pilha0.item = objArray95;
        int int98 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0.0d + "'", obj60, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0.0d + "'", obj69, 0.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0.0d + "'", obj80, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0.0d + "'", obj89, 0.0d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = 32;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        int int26 = pilha22.topo;
        java.lang.Object[] objArray27 = pilha22.item;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) (byte) 1);
        pilha28.topo = 'a';
        pilha28.topo = (byte) 0;
        boolean boolean39 = pilha28.vazia();
        pilha22.empilha((java.lang.Object) boolean39);
        int int41 = pilha22.tamanho();
        ds.Pilha pilha42 = new ds.Pilha();
        pilha42.empilha((java.lang.Object) 0.0d);
        boolean boolean45 = pilha42.vazia();
        java.lang.Object obj46 = pilha42.desempilha();
        pilha42.empilha((java.lang.Object) (byte) 1);
        pilha42.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 0.0d);
        boolean boolean54 = pilha51.vazia();
        java.lang.Object obj55 = pilha51.desempilha();
        int int56 = pilha51.topo;
        pilha42.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray58 = pilha42.item;
        boolean boolean59 = pilha42.vazia();
        pilha22.empilha((java.lang.Object) pilha42);
        pilha0.empilha((java.lang.Object) pilha22);
        java.lang.Object[] objArray62 = null;
        pilha0.item = objArray62;
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        pilha8.topo = (-1);
        int int19 = pilha8.tamanho();
        pilha8.topo = (byte) 10;
        java.lang.Object obj22 = pilha8.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        int int28 = pilha23.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        boolean boolean33 = pilha29.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        java.lang.Object obj38 = pilha34.desempilha();
        java.lang.Object[] objArray39 = pilha34.item;
        java.lang.Object[] objArray40 = pilha34.item;
        pilha29.item = objArray40;
        pilha23.item = objArray40;
        pilha8.item = objArray40;
        int int44 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj46 = pilha0.desempilha();
        int int47 = pilha0.tamanho();
        boolean boolean48 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        pilha0.topo = 3;
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha21.item = objArray32;
        pilha15.item = objArray32;
        pilha0.item = objArray32;
        pilha0.topo = 'a';
        int int38 = pilha0.tamanho();
        java.lang.Object obj39 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass40 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) (byte) 1);
        pilha9.empilha((java.lang.Object) 1.0f);
        pilha9.topo = (short) -1;
        int int20 = pilha9.topo;
        pilha9.topo = '4';
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        pilha23.topo = (-1);
        int int34 = pilha23.tamanho();
        pilha23.topo = (byte) 10;
        int int37 = pilha23.tamanho();
        java.lang.Object[] objArray38 = pilha23.item;
        pilha9.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object[] objArray46 = pilha40.item;
        pilha23.item = objArray46;
        java.lang.Object obj48 = pilha23.desempilha();
        pilha0.empilha((java.lang.Object) pilha23);
        int int50 = pilha23.tamanho();
        java.lang.Class<?> wildcardClass51 = pilha23.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) 'a');
        int int14 = pilha0.topo;
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        int int21 = pilha0.topo;
        pilha0.topo = 95;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 1;
        int int28 = pilha23.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        boolean boolean31 = pilha29.vazia();
        pilha29.topo = 1;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        boolean boolean39 = pilha35.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha35.item = objArray45;
        java.lang.Class<?> wildcardClass47 = objArray45.getClass();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 100.0f, objArray45 };
        pilha29.item = objArray45;
        java.lang.Object[] objArray50 = pilha29.item;
        pilha23.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        boolean boolean56 = pilha52.vazia();
        boolean boolean57 = pilha52.vazia();
        java.lang.Object[] objArray58 = pilha52.item;
        pilha29.empilha((java.lang.Object) objArray58);
        pilha0.item = objArray58;
        java.lang.Object obj61 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        int int11 = pilha0.topo;
        pilha0.topo = '4';
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) (byte) 1);
        int int25 = pilha0.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha26.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        java.lang.Object obj39 = pilha35.desempilha();
        java.lang.Object[] objArray40 = pilha35.item;
        int int41 = pilha35.topo;
        pilha26.empilha((java.lang.Object) int41);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 0.0d);
        boolean boolean46 = pilha43.vazia();
        java.lang.Object obj47 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) (byte) 1);
        pilha26.empilha((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray51 = pilha26.item;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        pilha52.empilha((java.lang.Object) (byte) 1);
        pilha52.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        int int66 = pilha61.topo;
        pilha52.empilha((java.lang.Object) pilha61);
        int int68 = pilha61.tamanho();
        java.lang.Object[] objArray69 = pilha61.item;
        pilha26.item = objArray69;
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) 0.0d);
        boolean boolean74 = pilha71.vazia();
        ds.Pilha pilha75 = new ds.Pilha();
        pilha75.empilha((java.lang.Object) 0.0d);
        boolean boolean78 = pilha75.vazia();
        boolean boolean79 = pilha75.vazia();
        ds.Pilha pilha80 = new ds.Pilha();
        pilha80.empilha((java.lang.Object) 0.0d);
        boolean boolean83 = pilha80.vazia();
        java.lang.Object obj84 = pilha80.desempilha();
        java.lang.Object[] objArray85 = pilha80.item;
        pilha75.item = objArray85;
        pilha71.item = objArray85;
        pilha71.topo = 100;
        boolean boolean90 = pilha71.vazia();
        java.lang.Object[] objArray91 = pilha71.item;
        pilha26.item = objArray91;
        pilha0.item = objArray91;
        java.lang.Class<?> wildcardClass94 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 0.0d + "'", obj84, 0.0d);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.topo;
        pilha9.topo = 9;
        pilha9.topo = (byte) 10;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        java.lang.Object obj26 = pilha21.desempilha();
        java.lang.Object[] objArray27 = pilha21.item;
        pilha9.item = objArray27;
        int int29 = pilha9.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) (byte) 1);
        pilha4.empilha((java.lang.Object) 1.0f);
        pilha4.topo = (-1);
        int int15 = pilha4.topo;
        int int16 = pilha4.topo;
        java.lang.Object[] objArray17 = pilha4.item;
        boolean boolean18 = pilha4.vazia();
        java.lang.Object[] objArray19 = pilha4.item;
        pilha0.item = objArray19;
        boolean boolean21 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 1;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray31 = pilha22.item;
        pilha17.empilha((java.lang.Object) objArray31);
        pilha0.item = objArray31;
        java.lang.Object[] objArray34 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        boolean boolean15 = pilha11.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        java.lang.Object obj20 = pilha16.desempilha();
        java.lang.Object[] objArray21 = pilha16.item;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha11.item = objArray22;
        pilha5.item = objArray22;
        java.lang.Object[] objArray25 = pilha5.item;
        pilha0.item = objArray25;
        int int27 = pilha0.tamanho();
        pilha0.topo = (short) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha5.item = objArray16;
        pilha4.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object obj23 = pilha0.desempilha();
        int int24 = pilha0.topo;
        pilha0.topo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha18.item = objArray29;
        pilha12.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 3;
        int int35 = pilha0.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 0.0d);
        boolean boolean39 = pilha36.vazia();
        int int40 = pilha36.topo;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        pilha45.topo = '4';
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        int int57 = pilha52.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        boolean boolean62 = pilha58.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        java.lang.Object[] objArray68 = pilha63.item;
        java.lang.Object[] objArray69 = pilha63.item;
        pilha58.item = objArray69;
        pilha52.item = objArray69;
        pilha45.item = objArray69;
        java.lang.Object[] objArray73 = pilha45.item;
        pilha36.item = objArray73;
        pilha0.item = objArray73;
        int int76 = pilha0.topo;
        java.lang.Object[] objArray77 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Object obj24 = pilha0.desempilha();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (byte) 1);
        pilha25.empilha((java.lang.Object) 1.0f);
        pilha25.topo = (-1);
        int int36 = pilha25.tamanho();
        pilha25.topo = (byte) 10;
        java.lang.Object obj39 = pilha25.desempilha();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        java.lang.Object[] objArray42 = pilha40.item;
        boolean boolean43 = pilha40.vazia();
        pilha40.empilha((java.lang.Object) "");
        int int46 = pilha40.topo;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        java.lang.Object obj51 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) (byte) 1);
        pilha47.empilha((java.lang.Object) 1.0f);
        pilha47.empilha((java.lang.Object) 0.0d);
        pilha40.empilha((java.lang.Object) pilha47);
        java.lang.Object[] objArray59 = pilha40.item;
        java.lang.Object obj60 = pilha40.desempilha();
        pilha25.empilha((java.lang.Object) pilha40);
        pilha0.empilha((java.lang.Object) pilha25);
        java.lang.Object obj63 = pilha25.desempilha();
        boolean boolean64 = pilha25.vazia();
        int int65 = pilha25.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        java.lang.Object obj10 = pilha6.desempilha();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object[] objArray12 = pilha6.item;
        pilha6.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        java.lang.Object[] objArray20 = pilha15.item;
        int int21 = pilha15.topo;
        pilha6.empilha((java.lang.Object) int21);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha6.empilha((java.lang.Object) (byte) 1);
        int int31 = pilha6.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) (byte) 1);
        int int39 = pilha32.topo;
        int int40 = pilha32.tamanho();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) 0.0d);
        boolean boolean53 = pilha50.vazia();
        java.lang.Object obj54 = pilha50.desempilha();
        int int55 = pilha50.topo;
        pilha41.empilha((java.lang.Object) pilha50);
        int int57 = pilha50.tamanho();
        boolean boolean58 = pilha50.vazia();
        pilha50.topo = 0;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        pilha61.empilha((java.lang.Object) (byte) 1);
        pilha61.empilha((java.lang.Object) 1.0f);
        pilha61.topo = (-1);
        int int72 = pilha61.tamanho();
        pilha61.topo = (byte) 10;
        int int75 = pilha61.tamanho();
        java.lang.Object[] objArray76 = pilha61.item;
        int int77 = pilha61.topo;
        int int78 = pilha61.topo;
        pilha50.empilha((java.lang.Object) pilha61);
        pilha32.empilha((java.lang.Object) pilha50);
        pilha6.empilha((java.lang.Object) pilha50);
        pilha0.empilha((java.lang.Object) pilha6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0d + "'", obj54, 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 0.0d);
        boolean boolean4 = pilha1.vazia();
        boolean boolean5 = pilha1.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        java.lang.Object obj10 = pilha6.desempilha();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object[] objArray12 = pilha6.item;
        pilha1.item = objArray12;
        pilha0.item = objArray12;
        boolean boolean15 = pilha0.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) (byte) 1);
        pilha16.empilha((java.lang.Object) 1.0f);
        pilha16.topo = (-1);
        int int27 = pilha16.tamanho();
        pilha16.topo = (byte) 10;
        int int30 = pilha16.tamanho();
        int int31 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int31);
        int int33 = pilha0.tamanho();
        java.lang.Object obj34 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        pilha0.topo = 3;
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj18 = pilha15.desempilha();
        java.lang.Object[] objArray19 = pilha15.item;
        pilha15.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 1;
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) (byte) 1);
        pilha27.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray36 = pilha27.item;
        pilha22.empilha((java.lang.Object) objArray36);
        pilha15.item = objArray36;
        pilha0.empilha((java.lang.Object) objArray36);
        java.lang.Object[] objArray40 = pilha0.item;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        boolean boolean45 = pilha41.vazia();
        boolean boolean46 = pilha41.vazia();
        java.lang.Object[] objArray47 = pilha41.item;
        int int48 = pilha41.tamanho();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        int int53 = pilha49.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) 0.0d);
        boolean boolean57 = pilha54.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        boolean boolean62 = pilha58.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        java.lang.Object[] objArray68 = pilha63.item;
        pilha58.item = objArray68;
        pilha54.item = objArray68;
        pilha49.empilha((java.lang.Object) pilha54);
        java.lang.Object obj72 = pilha49.desempilha();
        pilha41.empilha((java.lang.Object) pilha49);
        java.lang.Object[] objArray74 = pilha49.item;
        pilha0.item = objArray74;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        pilha23.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha39.desempilha();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha32.empilha((java.lang.Object) pilha39);
        boolean boolean45 = pilha32.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha46.item = objArray55;
        int int57 = pilha46.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        pilha58.empilha((java.lang.Object) 1.0f);
        pilha58.topo = (-1);
        int int69 = pilha58.tamanho();
        pilha58.topo = (byte) 10;
        java.lang.Object obj72 = pilha58.desempilha();
        java.lang.Object[] objArray73 = pilha58.item;
        pilha46.empilha((java.lang.Object) objArray73);
        pilha32.item = objArray73;
        pilha0.item = objArray73;
        java.lang.Object obj77 = pilha0.desempilha();
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        java.lang.Object[] objArray34 = pilha19.item;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 1;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray50 = pilha41.item;
        pilha36.empilha((java.lang.Object) objArray50);
        pilha19.item = objArray50;
        pilha0.item = objArray50;
        ds.Pilha pilha54 = new ds.Pilha();
        pilha54.empilha((java.lang.Object) 0.0d);
        boolean boolean57 = pilha54.vazia();
        java.lang.Object obj58 = pilha54.desempilha();
        java.lang.Object[] objArray59 = pilha54.item;
        int int60 = pilha54.topo;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        int int66 = pilha61.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) 0.0d);
        boolean boolean70 = pilha67.vazia();
        boolean boolean71 = pilha67.vazia();
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.empilha((java.lang.Object) 0.0d);
        boolean boolean75 = pilha72.vazia();
        java.lang.Object obj76 = pilha72.desempilha();
        java.lang.Object[] objArray77 = pilha72.item;
        java.lang.Object[] objArray78 = pilha72.item;
        pilha67.item = objArray78;
        pilha61.item = objArray78;
        java.lang.Object[] objArray81 = pilha61.item;
        pilha54.empilha((java.lang.Object) pilha61);
        java.lang.Object[] objArray83 = pilha54.item;
        pilha0.item = objArray83;
        ds.Pilha pilha85 = new ds.Pilha();
        pilha85.empilha((java.lang.Object) 0.0d);
        boolean boolean88 = pilha85.vazia();
        boolean boolean89 = pilha85.vazia();
        java.lang.Object obj90 = pilha85.desempilha();
        java.lang.Object obj91 = null;
        pilha85.empilha(obj91);
        pilha0.empilha((java.lang.Object) pilha85);
        java.lang.Object[] objArray94 = pilha85.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 0.0d + "'", obj76, 0.0d);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 0.0d + "'", obj90, 0.0d);
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) 0.0d);
        boolean boolean5 = pilha2.vazia();
        java.lang.Object obj6 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) (byte) 1);
        pilha2.empilha((java.lang.Object) 1.0f);
        pilha2.topo = (-1);
        int int13 = pilha2.tamanho();
        pilha2.topo = (byte) 10;
        pilha2.topo = '4';
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj21 = pilha18.desempilha();
        java.lang.Object[] objArray22 = pilha18.item;
        pilha18.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        boolean boolean27 = pilha25.vazia();
        pilha25.topo = 1;
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 0.0d);
        boolean boolean33 = pilha30.vazia();
        java.lang.Object obj34 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) (byte) 1);
        pilha30.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray39 = pilha30.item;
        pilha25.empilha((java.lang.Object) objArray39);
        pilha18.item = objArray39;
        pilha2.empilha((java.lang.Object) objArray39);
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        int int36 = pilha31.topo;
        pilha22.empilha((java.lang.Object) pilha31);
        boolean boolean38 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) boolean38);
        boolean boolean40 = pilha0.vazia();
        java.lang.Object[] objArray41 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        java.lang.Object obj9 = pilha5.desempilha();
        pilha5.empilha((java.lang.Object) (byte) 1);
        pilha5.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray14 = pilha5.item;
        java.lang.Object[] objArray15 = pilha5.item;
        pilha0.item = objArray15;
        int int17 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        pilha0.topo = 3;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        boolean boolean19 = pilha15.vazia();
        boolean boolean20 = pilha15.vazia();
        pilha0.empilha((java.lang.Object) pilha15);
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha21.item = objArray32;
        pilha15.item = objArray32;
        pilha0.item = objArray32;
        pilha0.topo = (short) 10;
        int int38 = pilha0.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        pilha39.topo = '4';
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        java.lang.Object obj50 = pilha46.desempilha();
        int int51 = pilha46.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        boolean boolean56 = pilha52.vazia();
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) 0.0d);
        boolean boolean60 = pilha57.vazia();
        java.lang.Object obj61 = pilha57.desempilha();
        java.lang.Object[] objArray62 = pilha57.item;
        java.lang.Object[] objArray63 = pilha57.item;
        pilha52.item = objArray63;
        pilha46.item = objArray63;
        pilha39.item = objArray63;
        java.lang.Object[] objArray67 = pilha39.item;
        pilha0.item = objArray67;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0.0d + "'", obj61, 0.0d);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.topo;
        int int12 = pilha0.topo;
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        int int19 = pilha15.topo;
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object[] objArray21 = pilha15.item;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        int int27 = pilha22.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        boolean boolean32 = pilha28.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) 0.0d);
        boolean boolean36 = pilha33.vazia();
        java.lang.Object obj37 = pilha33.desempilha();
        java.lang.Object[] objArray38 = pilha33.item;
        java.lang.Object[] objArray39 = pilha33.item;
        pilha28.item = objArray39;
        pilha22.item = objArray39;
        java.lang.Object[] objArray42 = pilha22.item;
        pilha15.item = objArray42;
        pilha0.item = objArray42;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        boolean boolean9 = pilha5.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha5.item = objArray16;
        pilha4.item = objArray16;
        pilha0.item = objArray16;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.topo = (-1);
        int int31 = pilha20.tamanho();
        java.lang.Object[] objArray32 = pilha20.item;
        pilha0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        boolean boolean7 = pilha5.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 0.0d };
        pilha8.item = objArray33;
        pilha5.item = objArray33;
        pilha0.item = objArray33;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        boolean boolean7 = pilha5.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 0.0d };
        pilha8.item = objArray33;
        pilha5.item = objArray33;
        pilha0.item = objArray33;
        java.lang.Object obj37 = null;
        pilha0.empilha(obj37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null]");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.tamanho();
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        java.lang.Object[] objArray20 = pilha18.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        pilha18.item = objArray21;
        pilha14.empilha((java.lang.Object) pilha18);
        java.lang.Object obj24 = pilha14.desempilha();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        boolean boolean27 = pilha25.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) (byte) 1);
        pilha28.empilha((java.lang.Object) 1.0f);
        pilha28.topo = (-1);
        int int39 = pilha28.tamanho();
        pilha28.topo = (byte) 10;
        int int42 = pilha28.tamanho();
        java.lang.Object[] objArray43 = pilha28.item;
        pilha25.item = objArray43;
        pilha14.item = objArray43;
        java.lang.Object obj46 = pilha14.desempilha();
        pilha0.empilha(obj46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 1 + "'", obj46, (byte) 1);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray33 = pilha0.item;
        java.lang.Object obj34 = pilha0.desempilha();
        java.lang.Object obj35 = pilha0.desempilha();
        int int36 = pilha0.topo;
        java.lang.Class<?> wildcardClass37 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 1;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha12.item = objArray22;
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100.0f, objArray22 };
        pilha6.item = objArray22;
        java.lang.Object[] objArray27 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) (byte) 1);
        pilha29.empilha((java.lang.Object) 1.0f);
        pilha29.topo = (-1);
        int int40 = pilha29.topo;
        int int41 = pilha29.topo;
        java.lang.Object[] objArray42 = pilha29.item;
        pilha0.item = objArray42;
        java.lang.Class<?> wildcardClass44 = objArray42.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 1;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        pilha16.item = objArray26;
        java.lang.Class<?> wildcardClass28 = objArray26.getClass();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 100.0f, objArray26 };
        pilha10.item = objArray26;
        java.lang.Object[] objArray31 = pilha10.item;
        java.lang.Object[] objArray32 = pilha10.item;
        int int33 = pilha10.topo;
        int int34 = pilha10.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        java.lang.Object obj39 = pilha35.desempilha();
        java.lang.Object[] objArray40 = pilha35.item;
        java.lang.Object[] objArray41 = pilha35.item;
        int int42 = pilha35.topo;
        int int43 = pilha35.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        java.lang.Object[] objArray46 = pilha44.item;
        boolean boolean47 = pilha44.vazia();
        pilha44.empilha((java.lang.Object) "");
        int int50 = pilha44.topo;
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 0.0d);
        boolean boolean54 = pilha51.vazia();
        java.lang.Object obj55 = pilha51.desempilha();
        pilha51.empilha((java.lang.Object) (byte) 1);
        pilha51.empilha((java.lang.Object) 1.0f);
        pilha51.empilha((java.lang.Object) 0.0d);
        pilha44.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray63 = pilha44.item;
        pilha44.topo = 'a';
        pilha35.empilha((java.lang.Object) 'a');
        ds.Pilha pilha67 = new ds.Pilha();
        boolean boolean68 = pilha67.vazia();
        int int69 = pilha67.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.empilha((java.lang.Object) 0.0d);
        boolean boolean73 = pilha70.vazia();
        java.lang.Object obj74 = pilha70.desempilha();
        java.lang.Object[] objArray75 = pilha70.item;
        java.lang.Object[] objArray76 = pilha70.item;
        pilha67.item = objArray76;
        int int78 = pilha67.tamanho();
        ds.Pilha pilha79 = new ds.Pilha();
        pilha79.empilha((java.lang.Object) 0.0d);
        boolean boolean82 = pilha79.vazia();
        java.lang.Object obj83 = pilha79.desempilha();
        pilha79.empilha((java.lang.Object) (byte) 1);
        pilha79.empilha((java.lang.Object) 1.0f);
        pilha79.topo = (-1);
        int int90 = pilha79.tamanho();
        pilha79.topo = (byte) 10;
        java.lang.Object obj93 = pilha79.desempilha();
        java.lang.Object[] objArray94 = pilha79.item;
        pilha67.empilha((java.lang.Object) objArray94);
        pilha35.item = objArray94;
        pilha10.item = objArray94;
        pilha0.item = objArray94;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 0.0d + "'", obj74, 0.0d);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 0.0d + "'", obj83, 0.0d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha5.topo = '#';
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        java.lang.Object obj28 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) (byte) 1);
        pilha24.empilha((java.lang.Object) 1.0f);
        pilha24.topo = (-1);
        int int35 = pilha24.tamanho();
        pilha24.topo = (byte) 10;
        java.lang.Object obj38 = pilha24.desempilha();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        int int44 = pilha39.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        boolean boolean49 = pilha45.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) 0.0d);
        boolean boolean53 = pilha50.vazia();
        java.lang.Object obj54 = pilha50.desempilha();
        java.lang.Object[] objArray55 = pilha50.item;
        java.lang.Object[] objArray56 = pilha50.item;
        pilha45.item = objArray56;
        pilha39.item = objArray56;
        pilha24.item = objArray56;
        pilha24.topo = (short) 10;
        pilha5.empilha((java.lang.Object) (short) 10);
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        pilha63.empilha((java.lang.Object) (byte) 1);
        pilha63.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray72 = pilha63.item;
        pilha5.item = objArray72;
        ds.Pilha pilha74 = new ds.Pilha();
        pilha74.empilha((java.lang.Object) 0.0d);
        boolean boolean77 = pilha74.vazia();
        java.lang.Object obj78 = pilha74.desempilha();
        pilha74.empilha((java.lang.Object) (byte) 1);
        pilha74.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha83 = new ds.Pilha();
        pilha83.empilha((java.lang.Object) 0.0d);
        boolean boolean86 = pilha83.vazia();
        java.lang.Object obj87 = pilha83.desempilha();
        int int88 = pilha83.topo;
        pilha74.empilha((java.lang.Object) pilha83);
        int int90 = pilha83.topo;
        pilha83.topo = 9;
        pilha5.empilha((java.lang.Object) pilha83);
        pilha0.empilha((java.lang.Object) pilha5);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0d + "'", obj54, 0.0d);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0.0d + "'", obj78, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 0.0d + "'", obj87, 0.0d);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        pilha8.topo = (-1);
        int int19 = pilha8.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.topo = '4';
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        int int32 = pilha27.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) 0.0d);
        boolean boolean36 = pilha33.vazia();
        boolean boolean37 = pilha33.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object[] objArray44 = pilha38.item;
        pilha33.item = objArray44;
        pilha27.item = objArray44;
        pilha20.item = objArray44;
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) 0.0d);
        boolean boolean51 = pilha48.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        boolean boolean56 = pilha52.vazia();
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) 0.0d);
        boolean boolean60 = pilha57.vazia();
        java.lang.Object obj61 = pilha57.desempilha();
        java.lang.Object[] objArray62 = pilha57.item;
        pilha52.item = objArray62;
        pilha48.item = objArray62;
        pilha20.item = objArray62;
        pilha8.item = objArray62;
        java.lang.Class<?> wildcardClass67 = objArray62.getClass();
        pilha0.empilha((java.lang.Object) objArray62);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0.0d + "'", obj61, 0.0d);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = '#';
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        java.lang.Object obj38 = pilha34.desempilha();
        int int39 = pilha34.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha40.item = objArray51;
        pilha34.item = objArray51;
        pilha19.item = objArray51;
        pilha19.topo = (short) 10;
        pilha0.empilha((java.lang.Object) (short) 10);
        java.lang.Object[] objArray58 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 1;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha12.item = objArray22;
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100.0f, objArray22 };
        pilha6.item = objArray22;
        java.lang.Object[] objArray27 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) (byte) 1);
        pilha29.empilha((java.lang.Object) 1.0f);
        pilha29.topo = (-1);
        int int40 = pilha29.topo;
        int int41 = pilha29.topo;
        java.lang.Object[] objArray42 = pilha29.item;
        pilha0.item = objArray42;
        int int44 = pilha0.tamanho();
        int int45 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray17 = pilha8.item;
        pilha0.item = objArray17;
        boolean boolean19 = pilha0.vazia();
        java.lang.Object[] objArray20 = pilha0.item;
        int int21 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = 0;
        pilha9.topo = 100;
        boolean boolean22 = pilha9.vazia();
        int int23 = pilha9.topo;
        boolean boolean24 = pilha9.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        java.lang.Object[] objArray30 = pilha25.item;
        java.lang.Object[] objArray31 = pilha25.item;
        boolean boolean32 = pilha25.vazia();
        int int33 = pilha25.topo;
        int int34 = pilha25.tamanho();
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        int int37 = pilha35.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        java.lang.Object[] objArray43 = pilha38.item;
        java.lang.Object[] objArray44 = pilha38.item;
        pilha35.item = objArray44;
        pilha25.item = objArray44;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        boolean boolean49 = pilha47.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) 0.0d);
        boolean boolean53 = pilha50.vazia();
        java.lang.Object obj54 = pilha50.desempilha();
        pilha50.empilha((java.lang.Object) (byte) 1);
        pilha50.empilha((java.lang.Object) 1.0f);
        pilha50.topo = (-1);
        int int61 = pilha50.tamanho();
        pilha50.topo = (byte) 10;
        int int64 = pilha50.tamanho();
        java.lang.Object[] objArray65 = pilha50.item;
        pilha47.item = objArray65;
        pilha25.item = objArray65;
        int int68 = pilha25.tamanho();
        java.lang.Object[] objArray69 = pilha25.item;
        pilha9.item = objArray69;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0d + "'", obj54, 0.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        boolean boolean7 = pilha0.vazia();
        pilha0.topo = 99;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha6.item = objArray17;
        pilha0.item = objArray17;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        int int27 = pilha20.topo;
        int int28 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object[] objArray30 = pilha0.item;
        boolean boolean31 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        java.lang.Object[] objArray34 = pilha19.item;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 1;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray50 = pilha41.item;
        pilha36.empilha((java.lang.Object) objArray50);
        pilha19.item = objArray50;
        pilha0.item = objArray50;
        pilha0.topo = (byte) 0;
        boolean boolean56 = pilha0.vazia();
        java.lang.Class<?> wildcardClass57 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 0.0d);
        boolean boolean8 = pilha5.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        boolean boolean13 = pilha9.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha9.item = objArray19;
        pilha5.item = objArray19;
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray26 = pilha23.item;
        java.lang.Object[] objArray27 = pilha23.item;
        pilha5.empilha((java.lang.Object) objArray27);
        pilha5.topo = 36;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object obj17 = pilha0.desempilha();
        java.lang.Object obj18 = pilha0.desempilha();
        pilha0.topo = '#';
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object[] objArray27 = pilha21.item;
        boolean boolean28 = pilha21.vazia();
        int int29 = pilha21.topo;
        int int30 = pilha21.tamanho();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        int int33 = pilha31.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        java.lang.Object obj38 = pilha34.desempilha();
        java.lang.Object[] objArray39 = pilha34.item;
        java.lang.Object[] objArray40 = pilha34.item;
        pilha31.item = objArray40;
        pilha21.item = objArray40;
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        boolean boolean45 = pilha43.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        java.lang.Object obj50 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) (byte) 1);
        pilha46.empilha((java.lang.Object) 1.0f);
        pilha46.topo = (-1);
        int int57 = pilha46.tamanho();
        pilha46.topo = (byte) 10;
        int int60 = pilha46.tamanho();
        java.lang.Object[] objArray61 = pilha46.item;
        pilha43.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        int int17 = pilha0.topo;
        pilha0.topo = (byte) -1;
        int int20 = pilha0.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object[] objArray27 = pilha21.item;
        boolean boolean28 = pilha21.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha18.item = objArray29;
        pilha12.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 3;
        int int35 = pilha0.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 0.0d);
        boolean boolean39 = pilha36.vazia();
        int int40 = pilha36.topo;
        java.lang.Object[] objArray41 = pilha36.item;
        java.lang.Object[] objArray42 = pilha36.item;
        ds.Pilha pilha43 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) pilha43);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        pilha45.topo = '4';
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        int int57 = pilha52.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        boolean boolean62 = pilha58.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        java.lang.Object[] objArray68 = pilha63.item;
        java.lang.Object[] objArray69 = pilha63.item;
        pilha58.item = objArray69;
        pilha52.item = objArray69;
        pilha45.item = objArray69;
        java.lang.Object[] objArray73 = pilha45.item;
        pilha36.item = objArray73;
        pilha0.item = objArray73;
        java.lang.Object[] objArray76 = pilha0.item;
        pilha0.topo = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (byte) 1);
        pilha17.empilha((java.lang.Object) 1.0f);
        pilha17.topo = (-1);
        int int28 = pilha17.tamanho();
        pilha0.empilha((java.lang.Object) int28);
        boolean boolean30 = pilha0.vazia();
        boolean boolean31 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        java.lang.Object obj10 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) (byte) 1);
        pilha6.topo = 'a';
        pilha6.topo = (byte) 0;
        boolean boolean17 = pilha6.vazia();
        pilha0.empilha((java.lang.Object) boolean17);
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        int int34 = pilha29.topo;
        pilha20.empilha((java.lang.Object) pilha29);
        java.lang.Object[] objArray36 = pilha20.item;
        boolean boolean37 = pilha20.vazia();
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object[] objArray39 = pilha20.item;
        java.lang.Object obj40 = pilha20.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 53);
        java.lang.Object[] objArray18 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        int int17 = pilha9.tamanho();
        java.lang.Object[] objArray18 = pilha9.item;
        java.lang.Object[] objArray19 = pilha9.item;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        pilha20.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        int int34 = pilha29.topo;
        pilha20.empilha((java.lang.Object) pilha29);
        int int36 = pilha29.tamanho();
        int int37 = pilha29.tamanho();
        java.lang.Object[] objArray38 = pilha29.item;
        java.lang.Object[] objArray39 = pilha29.item;
        pilha9.item = objArray39;
        pilha9.topo = 0;
        java.lang.Object[] objArray43 = pilha9.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) (byte) 1);
        pilha4.empilha((java.lang.Object) 1.0f);
        pilha4.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj15 = pilha4.desempilha();
        java.lang.Object[] objArray16 = pilha4.item;
        pilha0.empilha((java.lang.Object) objArray16);
        pilha0.topo = 1;
        pilha0.topo = 53;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = (byte) 100;
        int int12 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = '4';
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        int int12 = pilha7.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        boolean boolean17 = pilha13.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        java.lang.Object obj22 = pilha18.desempilha();
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object[] objArray24 = pilha18.item;
        pilha13.item = objArray24;
        pilha7.item = objArray24;
        pilha0.item = objArray24;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        pilha0.topo = 'a';
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (byte) 1);
        pilha8.empilha((java.lang.Object) 1.0f);
        pilha8.topo = (-1);
        int int19 = pilha8.tamanho();
        pilha8.topo = (byte) 10;
        int int22 = pilha8.tamanho();
        java.lang.Object[] objArray23 = pilha8.item;
        int int24 = pilha8.topo;
        int int25 = pilha8.topo;
        pilha8.topo = (byte) -1;
        int int28 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        int int7 = pilha0.topo;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray13 = pilha10.item;
        pilha0.empilha((java.lang.Object) objArray13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        java.lang.Object obj8 = pilha4.desempilha();
        java.lang.Object[] objArray9 = pilha4.item;
        java.lang.Object[] objArray10 = pilha4.item;
        boolean boolean11 = pilha4.vazia();
        int int12 = pilha4.topo;
        pilha4.empilha((java.lang.Object) 10L);
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) (byte) 1);
        pilha16.empilha((java.lang.Object) 1.0f);
        pilha16.topo = (short) -1;
        int int27 = pilha16.topo;
        pilha16.topo = '4';
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 0.0d);
        boolean boolean33 = pilha30.vazia();
        java.lang.Object obj34 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) (byte) 1);
        pilha30.empilha((java.lang.Object) 1.0f);
        pilha30.topo = (-1);
        int int41 = pilha30.tamanho();
        pilha30.topo = (byte) 10;
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha16.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        java.lang.Object obj51 = pilha47.desempilha();
        pilha47.empilha((java.lang.Object) (byte) 1);
        pilha47.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray56 = pilha47.item;
        java.lang.Object[] objArray57 = pilha47.item;
        pilha30.item = objArray57;
        pilha4.item = objArray57;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        int int11 = pilha0.topo;
        pilha0.topo = '4';
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (byte) 1);
        pilha14.empilha((java.lang.Object) 1.0f);
        pilha14.topo = (-1);
        int int25 = pilha14.tamanho();
        pilha14.topo = (byte) 10;
        int int28 = pilha14.tamanho();
        java.lang.Object[] objArray29 = pilha14.item;
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) (byte) 1);
        pilha31.empilha((java.lang.Object) 1.0f);
        pilha31.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha31.desempilha();
        int int43 = pilha31.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 0.0d);
        boolean boolean47 = pilha44.vazia();
        java.lang.Object obj48 = pilha44.desempilha();
        int int49 = pilha44.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) 0.0d);
        boolean boolean53 = pilha50.vazia();
        boolean boolean54 = pilha50.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) 0.0d);
        boolean boolean58 = pilha55.vazia();
        java.lang.Object obj59 = pilha55.desempilha();
        java.lang.Object[] objArray60 = pilha55.item;
        java.lang.Object[] objArray61 = pilha55.item;
        pilha50.item = objArray61;
        pilha44.item = objArray61;
        java.lang.Object[] objArray64 = pilha44.item;
        pilha31.item = objArray64;
        pilha0.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) 0.0d);
        boolean boolean70 = pilha67.vazia();
        java.lang.Object obj71 = pilha67.desempilha();
        pilha67.empilha((java.lang.Object) (byte) 1);
        pilha67.empilha((java.lang.Object) 1.0f);
        pilha67.topo = (-1);
        int int78 = pilha67.tamanho();
        int int79 = pilha67.tamanho();
        java.lang.Object[] objArray80 = pilha67.item;
        pilha31.empilha((java.lang.Object) objArray80);
        java.lang.Object obj82 = pilha31.desempilha();
        int int83 = pilha31.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0d + "'", obj71, 0.0d);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object[] objArray27 = pilha21.item;
        pilha16.item = objArray27;
        java.lang.Class<?> wildcardClass29 = objArray27.getClass();
        pilha0.empilha((java.lang.Object) objArray27);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha31.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        int int46 = pilha40.topo;
        pilha31.empilha((java.lang.Object) int46);
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) 0.0d);
        boolean boolean51 = pilha48.vazia();
        java.lang.Object obj52 = pilha48.desempilha();
        java.lang.Object[] objArray53 = pilha48.item;
        java.lang.Object[] objArray54 = pilha48.item;
        boolean boolean55 = pilha48.vazia();
        int int56 = pilha48.topo;
        pilha31.empilha((java.lang.Object) pilha48);
        pilha0.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.topo;
        int int61 = pilha59.topo;
        pilha59.topo = (short) -1;
        java.lang.Object[] objArray64 = pilha59.item;
        pilha31.empilha((java.lang.Object) objArray64);
        pilha31.topo = 98;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0d + "'", obj52, 0.0d);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) 'a');
        java.lang.Object obj14 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        java.lang.Object[] objArray18 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 0L);
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = null;
        pilha0.item = objArray12;
        pilha0.topo = 98;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        pilha0.topo = 53;
        java.lang.Object[] objArray13 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray19 = pilha7.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha6.item = objArray17;
        pilha0.item = objArray17;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (byte) 1);
        int int27 = pilha20.topo;
        int int28 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) pilha20);
        int int30 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        boolean boolean17 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) 100);
        boolean boolean20 = pilha15.vazia();
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 1;
        int int27 = pilha22.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 1;
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        boolean boolean38 = pilha34.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        java.lang.Object[] objArray44 = pilha39.item;
        pilha34.item = objArray44;
        java.lang.Class<?> wildcardClass46 = objArray44.getClass();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100.0f, objArray44 };
        pilha28.item = objArray44;
        java.lang.Object[] objArray49 = pilha28.item;
        pilha22.empilha((java.lang.Object) pilha28);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 0.0d);
        boolean boolean54 = pilha51.vazia();
        java.lang.Object obj55 = pilha51.desempilha();
        pilha51.empilha((java.lang.Object) (byte) 1);
        pilha51.empilha((java.lang.Object) 1.0f);
        pilha51.topo = (-1);
        int int62 = pilha51.tamanho();
        pilha51.topo = (byte) 10;
        java.lang.Object obj65 = pilha51.desempilha();
        pilha22.empilha(obj65);
        pilha15.empilha(obj65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass68 = obj65.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = 0;
        pilha9.topo = 100;
        java.lang.Object[] objArray22 = null;
        pilha9.item = objArray22;
        java.lang.Object[] objArray24 = pilha9.item;
        int int25 = pilha9.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        pilha0.topo = 0;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        boolean boolean12 = pilha8.vazia();
        boolean boolean13 = pilha8.vazia();
        java.lang.Object[] objArray14 = pilha8.item;
        int int15 = pilha8.tamanho();
        pilha8.topo = ' ';
        java.lang.Object obj18 = pilha8.desempilha();
        boolean boolean19 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha21.item = objArray32;
        pilha15.item = objArray32;
        pilha0.item = objArray32;
        int int36 = pilha0.tamanho();
        java.lang.Object obj37 = pilha0.desempilha();
        java.lang.Object[] objArray38 = null;
        pilha0.item = objArray38;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        java.lang.Object[] objArray46 = pilha40.item;
        boolean boolean47 = pilha40.vazia();
        int int48 = pilha40.topo;
        int int49 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) false);
        int int52 = pilha40.tamanho();
        java.lang.Object obj53 = null;
        pilha40.empilha(obj53);
        int int55 = pilha40.tamanho();
        java.lang.Object obj56 = null;
        pilha40.empilha(obj56);
        ds.Pilha pilha58 = new ds.Pilha();
        boolean boolean59 = pilha58.vazia();
        int int60 = pilha58.topo;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        java.lang.Object[] objArray66 = pilha61.item;
        java.lang.Object[] objArray67 = pilha61.item;
        pilha58.item = objArray67;
        pilha40.item = objArray67;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha6 = new ds.Pilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        boolean boolean11 = pilha7.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha7.item = objArray18;
        pilha6.item = objArray18;
        boolean boolean21 = pilha6.vazia();
        int int22 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        boolean boolean10 = pilha4.vazia();
        int int11 = pilha4.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.topo = (byte) -1;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        pilha0.topo = (short) 10;
        int int13 = pilha0.tamanho();
        pilha0.topo = 11;
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) (byte) 1);
        pilha16.empilha((java.lang.Object) 1.0f);
        pilha16.topo = (-1);
        int int27 = pilha16.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        int int33 = pilha28.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        boolean boolean38 = pilha34.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        boolean boolean42 = pilha39.vazia();
        java.lang.Object obj43 = pilha39.desempilha();
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object[] objArray45 = pilha39.item;
        pilha34.item = objArray45;
        pilha28.item = objArray45;
        pilha16.item = objArray45;
        pilha16.topo = 3;
        int int51 = pilha16.tamanho();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        int int56 = pilha52.topo;
        java.lang.Object[] objArray57 = pilha52.item;
        java.lang.Object[] objArray58 = pilha52.item;
        ds.Pilha pilha59 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) pilha59);
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        pilha61.topo = '4';
        ds.Pilha pilha68 = new ds.Pilha();
        pilha68.empilha((java.lang.Object) 0.0d);
        boolean boolean71 = pilha68.vazia();
        java.lang.Object obj72 = pilha68.desempilha();
        int int73 = pilha68.topo;
        ds.Pilha pilha74 = new ds.Pilha();
        pilha74.empilha((java.lang.Object) 0.0d);
        boolean boolean77 = pilha74.vazia();
        boolean boolean78 = pilha74.vazia();
        ds.Pilha pilha79 = new ds.Pilha();
        pilha79.empilha((java.lang.Object) 0.0d);
        boolean boolean82 = pilha79.vazia();
        java.lang.Object obj83 = pilha79.desempilha();
        java.lang.Object[] objArray84 = pilha79.item;
        java.lang.Object[] objArray85 = pilha79.item;
        pilha74.item = objArray85;
        pilha68.item = objArray85;
        pilha61.item = objArray85;
        java.lang.Object[] objArray89 = pilha61.item;
        pilha52.item = objArray89;
        pilha16.item = objArray89;
        int int92 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) int92);
        java.lang.Object obj94 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 0.0d + "'", obj83, 0.0d);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 3 + "'", int92 == 3);
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + 3 + "'", obj94, 3);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        boolean boolean25 = pilha21.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha21.item = objArray32;
        pilha15.item = objArray32;
        pilha0.item = objArray32;
        pilha0.topo = (short) 10;
        java.lang.Object obj38 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        pilha15.item = objArray18;
        pilha11.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha11);
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        pilha23.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj42 = pilha39.desempilha();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha32.empilha((java.lang.Object) pilha39);
        boolean boolean45 = pilha32.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.topo;
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha46.item = objArray55;
        int int57 = pilha46.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) (byte) 1);
        pilha58.empilha((java.lang.Object) 1.0f);
        pilha58.topo = (-1);
        int int69 = pilha58.tamanho();
        pilha58.topo = (byte) 10;
        java.lang.Object obj72 = pilha58.desempilha();
        java.lang.Object[] objArray73 = pilha58.item;
        pilha46.empilha((java.lang.Object) objArray73);
        pilha32.item = objArray73;
        pilha0.item = objArray73;
        ds.Pilha pilha77 = new ds.Pilha();
        pilha77.empilha((java.lang.Object) 0.0d);
        boolean boolean80 = pilha77.vazia();
        boolean boolean81 = pilha77.vazia();
        boolean boolean82 = pilha77.vazia();
        java.lang.Object[] objArray83 = pilha77.item;
        pilha77.topo = (byte) 10;
        pilha0.empilha((java.lang.Object) pilha77);
        int int87 = pilha77.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha6 = new ds.Pilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        boolean boolean11 = pilha7.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha7.item = objArray18;
        pilha6.item = objArray18;
        boolean boolean21 = pilha6.vazia();
        int int22 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object obj24 = pilha0.desempilha();
        java.lang.Object obj25 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = 100;
        java.lang.Object obj9 = pilha0.desempilha();
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = '#';
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) (byte) 1);
        boolean boolean19 = pilha12.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        boolean boolean23 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) "");
        pilha12.empilha((java.lang.Object) "");
        java.lang.Class<?> wildcardClass27 = pilha12.getClass();
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object obj29 = pilha12.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        int int12 = pilha0.tamanho();
        java.lang.Object obj13 = null;
        pilha0.empilha(obj13);
        int int15 = pilha0.tamanho();
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        int int17 = pilha9.tamanho();
        java.lang.Object[] objArray18 = pilha9.item;
        java.lang.Class<?> wildcardClass19 = pilha9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 0.0d);
        boolean boolean21 = pilha18.vazia();
        boolean boolean22 = pilha18.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object[] objArray29 = pilha23.item;
        pilha18.item = objArray29;
        pilha12.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 3;
        pilha0.topo = ' ';
        java.lang.Object[] objArray37 = pilha0.item;
        java.lang.Class<?> wildcardClass38 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 1;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray31 = pilha22.item;
        pilha17.empilha((java.lang.Object) objArray31);
        pilha0.item = objArray31;
        java.lang.Object obj34 = pilha0.desempilha();
        boolean boolean35 = pilha0.vazia();
        java.lang.Object[] objArray36 = pilha0.item;
        int int37 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        int int19 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        int int11 = pilha0.topo;
        pilha0.topo = '4';
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 0.0d);
        boolean boolean17 = pilha14.vazia();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (byte) 1);
        pilha14.empilha((java.lang.Object) 1.0f);
        pilha14.topo = (-1);
        int int25 = pilha14.tamanho();
        pilha14.topo = (byte) 10;
        int int28 = pilha14.tamanho();
        java.lang.Object[] objArray29 = pilha14.item;
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        int int35 = pilha31.topo;
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        int int43 = pilha38.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 0.0d);
        boolean boolean47 = pilha44.vazia();
        boolean boolean48 = pilha44.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 0.0d);
        boolean boolean52 = pilha49.vazia();
        java.lang.Object obj53 = pilha49.desempilha();
        java.lang.Object[] objArray54 = pilha49.item;
        java.lang.Object[] objArray55 = pilha49.item;
        pilha44.item = objArray55;
        pilha38.item = objArray55;
        java.lang.Object[] objArray58 = pilha38.item;
        pilha31.item = objArray58;
        pilha14.item = objArray58;
        java.lang.Object[] objArray61 = pilha14.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0.0d + "'", obj53, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.topo = (byte) -1;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        pilha0.topo = (short) 10;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        int int12 = pilha10.topo;
        pilha10.topo = 'a';
        pilha10.topo = 0;
        java.lang.Class<?> wildcardClass17 = pilha10.getClass();
        pilha0.empilha((java.lang.Object) pilha10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray19 = pilha0.item;
        java.lang.Object obj20 = pilha0.desempilha();
        int int21 = pilha0.tamanho();
        java.lang.Object obj22 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        int int21 = pilha0.topo;
        pilha0.topo = 9;
        java.lang.Object obj24 = pilha0.desempilha();
        java.lang.Object[] objArray25 = pilha0.item;
        java.lang.Class<?> wildcardClass26 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        java.lang.Object[] objArray34 = pilha19.item;
        int int35 = pilha19.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 1;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray50 = pilha41.item;
        pilha36.empilha((java.lang.Object) objArray50);
        pilha19.item = objArray50;
        pilha0.item = objArray50;
        pilha0.topo = (byte) 0;
        int int56 = pilha0.tamanho();
        int int57 = pilha0.topo;
        java.lang.Object[] objArray58 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = 100;
        boolean boolean19 = pilha0.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        int int25 = pilha20.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        java.lang.Object[] objArray36 = pilha31.item;
        java.lang.Object[] objArray37 = pilha31.item;
        pilha26.item = objArray37;
        pilha20.item = objArray37;
        java.lang.Object[] objArray40 = pilha20.item;
        pilha0.item = objArray40;
        java.lang.Object[] objArray42 = pilha0.item;
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object[] objArray22 = pilha0.item;
        int int23 = pilha0.topo;
        int int24 = pilha0.topo;
        java.lang.Object obj25 = pilha0.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object[] objArray32 = pilha26.item;
        pilha26.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        java.lang.Object obj39 = pilha35.desempilha();
        java.lang.Object[] objArray40 = pilha35.item;
        int int41 = pilha35.topo;
        pilha26.empilha((java.lang.Object) int41);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 0.0d);
        boolean boolean46 = pilha43.vazia();
        java.lang.Object obj47 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) (byte) 1);
        pilha26.empilha((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray51 = pilha26.item;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        java.lang.Object obj56 = pilha52.desempilha();
        pilha52.empilha((java.lang.Object) (byte) 1);
        pilha52.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.empilha((java.lang.Object) 0.0d);
        boolean boolean64 = pilha61.vazia();
        java.lang.Object obj65 = pilha61.desempilha();
        int int66 = pilha61.topo;
        pilha52.empilha((java.lang.Object) pilha61);
        int int68 = pilha61.tamanho();
        java.lang.Object[] objArray69 = pilha61.item;
        pilha26.item = objArray69;
        pilha0.item = objArray69;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = 0;
        pilha9.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        java.lang.Object[] objArray28 = pilha22.item;
        boolean boolean29 = pilha22.vazia();
        int int30 = pilha22.topo;
        pilha22.empilha((java.lang.Object) 10L);
        boolean boolean33 = pilha22.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        boolean boolean36 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) 100);
        boolean boolean39 = pilha34.vazia();
        java.lang.Object obj40 = pilha34.desempilha();
        pilha22.empilha((java.lang.Object) pilha34);
        pilha9.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100 + "'", obj40, 100);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        int int18 = pilha0.topo;
        java.lang.Object obj19 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.topo = 2;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        java.lang.Object[] objArray4 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) 'a');
        boolean boolean14 = pilha0.vazia();
        boolean boolean15 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 1;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray31 = pilha22.item;
        pilha17.empilha((java.lang.Object) objArray31);
        pilha0.item = objArray31;
        java.lang.Object obj34 = pilha0.desempilha();
        boolean boolean35 = pilha0.vazia();
        boolean boolean36 = pilha0.vazia();
        java.lang.Class<?> wildcardClass37 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha33 = new ds.Pilha();
        pilha33.empilha((java.lang.Object) 0.0d);
        boolean boolean36 = pilha33.vazia();
        java.lang.Object obj37 = pilha33.desempilha();
        pilha33.empilha((java.lang.Object) (byte) 1);
        pilha33.empilha((java.lang.Object) 1.0f);
        pilha33.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj44 = pilha33.desempilha();
        int int45 = pilha33.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        java.lang.Object obj50 = pilha46.desempilha();
        int int51 = pilha46.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        boolean boolean55 = pilha52.vazia();
        boolean boolean56 = pilha52.vazia();
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) 0.0d);
        boolean boolean60 = pilha57.vazia();
        java.lang.Object obj61 = pilha57.desempilha();
        java.lang.Object[] objArray62 = pilha57.item;
        java.lang.Object[] objArray63 = pilha57.item;
        pilha52.item = objArray63;
        pilha46.item = objArray63;
        java.lang.Object[] objArray66 = pilha46.item;
        pilha33.item = objArray66;
        pilha0.item = objArray66;
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.empilha((java.lang.Object) 0.0d);
        boolean boolean72 = pilha69.vazia();
        java.lang.Object obj73 = pilha69.desempilha();
        java.lang.Object[] objArray74 = pilha69.item;
        java.lang.Object[] objArray75 = pilha69.item;
        pilha0.item = objArray75;
        java.lang.Object[] objArray77 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0.0d + "'", obj61, 0.0d);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0.0d + "'", obj73, 0.0d);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha11.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.topo;
        pilha11.empilha((java.lang.Object) int26);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        java.lang.Object[] objArray33 = pilha28.item;
        java.lang.Object[] objArray34 = pilha28.item;
        boolean boolean35 = pilha28.vazia();
        int int36 = pilha28.topo;
        pilha11.empilha((java.lang.Object) pilha28);
        pilha0.empilha((java.lang.Object) pilha11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        java.lang.Object[] objArray23 = pilha17.item;
        boolean boolean24 = pilha17.vazia();
        int int25 = pilha17.topo;
        pilha0.empilha((java.lang.Object) pilha17);
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 0.0d);
        boolean boolean31 = pilha28.vazia();
        java.lang.Object obj32 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) (byte) 1);
        pilha28.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 0.0d);
        boolean boolean40 = pilha37.vazia();
        java.lang.Object obj41 = pilha37.desempilha();
        int int42 = pilha37.topo;
        pilha28.empilha((java.lang.Object) pilha37);
        java.lang.Object[] objArray44 = pilha28.item;
        pilha0.item = objArray44;
        java.lang.Object[] objArray46 = pilha0.item;
        int int47 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass48 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.topo;
        int int12 = pilha0.topo;
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object obj11 = pilha0.desempilha();
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        int int21 = pilha0.tamanho();
        java.lang.Object obj22 = null;
        pilha0.empilha(obj22);
        java.lang.Object obj24 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        pilha0.topo = ' ';
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.topo = '4';
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        java.lang.Object obj30 = pilha26.desempilha();
        int int31 = pilha26.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 0.0d);
        boolean boolean35 = pilha32.vazia();
        boolean boolean36 = pilha32.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 0.0d);
        boolean boolean40 = pilha37.vazia();
        java.lang.Object obj41 = pilha37.desempilha();
        java.lang.Object[] objArray42 = pilha37.item;
        java.lang.Object[] objArray43 = pilha37.item;
        pilha32.item = objArray43;
        pilha26.item = objArray43;
        pilha19.item = objArray43;
        java.lang.Object[] objArray47 = pilha19.item;
        java.lang.Object[] objArray48 = pilha19.item;
        pilha0.item = objArray48;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean22);
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        pilha0.topo = 53;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        int int8 = pilha0.tamanho();
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (byte) 1);
        pilha17.empilha((java.lang.Object) 1.0f);
        pilha17.topo = (-1);
        int int28 = pilha17.tamanho();
        pilha0.empilha((java.lang.Object) int28);
        java.lang.Object[] objArray30 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj11 = pilha0.desempilha();
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.tamanho();
        pilha0.topo = ' ';
        java.lang.Object obj16 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        boolean boolean7 = pilha5.vazia();
        pilha5.topo = 1;
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 0.0d);
        boolean boolean13 = pilha10.vazia();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (byte) 1);
        pilha10.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray19 = pilha10.item;
        pilha5.empilha((java.lang.Object) objArray19);
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 0.0d);
        boolean boolean29 = pilha26.vazia();
        boolean boolean30 = pilha26.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        java.lang.Object[] objArray36 = pilha31.item;
        pilha26.item = objArray36;
        pilha22.item = objArray36;
        pilha22.topo = 100;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        java.lang.Object obj45 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) (byte) 1);
        pilha41.empilha((java.lang.Object) 1.0f);
        pilha41.topo = (-1);
        int int52 = pilha41.tamanho();
        pilha41.topo = (byte) 10;
        java.lang.Object obj55 = pilha41.desempilha();
        java.lang.Object[] objArray56 = pilha41.item;
        int int57 = pilha41.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        boolean boolean59 = pilha58.vazia();
        boolean boolean60 = pilha58.vazia();
        pilha58.topo = 1;
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) 0.0d);
        boolean boolean66 = pilha63.vazia();
        java.lang.Object obj67 = pilha63.desempilha();
        pilha63.empilha((java.lang.Object) (byte) 1);
        pilha63.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray72 = pilha63.item;
        pilha58.empilha((java.lang.Object) objArray72);
        pilha41.item = objArray72;
        pilha22.item = objArray72;
        pilha22.topo = (byte) 0;
        boolean boolean78 = pilha22.vazia();
        pilha5.empilha((java.lang.Object) boolean78);
        java.lang.Object obj80 = pilha5.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + true + "'", obj80, true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (byte) 1);
        pilha22.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 0.0d);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        int int36 = pilha31.topo;
        pilha22.empilha((java.lang.Object) pilha31);
        boolean boolean38 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) boolean38);
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.topo;
        boolean boolean42 = pilha0.vazia();
        java.lang.Object obj43 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + true + "'", obj43, true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        boolean boolean24 = pilha22.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (byte) 1);
        pilha25.empilha((java.lang.Object) 1.0f);
        pilha25.topo = (-1);
        int int36 = pilha25.tamanho();
        pilha25.topo = (byte) 10;
        int int39 = pilha25.tamanho();
        java.lang.Object[] objArray40 = pilha25.item;
        pilha22.item = objArray40;
        pilha0.item = objArray40;
        int int43 = pilha0.tamanho();
        int int44 = pilha0.topo;
        int int45 = pilha0.tamanho();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) 0.0d);
        boolean boolean53 = pilha50.vazia();
        boolean boolean54 = pilha50.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) 0.0d);
        boolean boolean58 = pilha55.vazia();
        java.lang.Object obj59 = pilha55.desempilha();
        java.lang.Object[] objArray60 = pilha55.item;
        pilha50.item = objArray60;
        pilha46.item = objArray60;
        pilha46.topo = '#';
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) 0.0d);
        boolean boolean68 = pilha65.vazia();
        int int69 = pilha65.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.empilha((java.lang.Object) 0.0d);
        boolean boolean73 = pilha70.vazia();
        ds.Pilha pilha74 = new ds.Pilha();
        pilha74.empilha((java.lang.Object) 0.0d);
        boolean boolean77 = pilha74.vazia();
        boolean boolean78 = pilha74.vazia();
        ds.Pilha pilha79 = new ds.Pilha();
        pilha79.empilha((java.lang.Object) 0.0d);
        boolean boolean82 = pilha79.vazia();
        java.lang.Object obj83 = pilha79.desempilha();
        java.lang.Object[] objArray84 = pilha79.item;
        pilha74.item = objArray84;
        pilha70.item = objArray84;
        pilha65.empilha((java.lang.Object) pilha70);
        java.lang.Object obj88 = pilha65.desempilha();
        java.lang.Object[] objArray90 = new java.lang.Object[] { 0.0d };
        pilha65.item = objArray90;
        pilha46.item = objArray90;
        pilha0.item = objArray90;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 0.0d + "'", obj83, 0.0d);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[0.0]");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        int int22 = pilha0.topo;
        java.lang.Object[] objArray23 = pilha0.item;
        java.lang.Object obj24 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        int int16 = pilha9.tamanho();
        java.lang.Object[] objArray17 = pilha9.item;
        int int18 = pilha9.tamanho();
        boolean boolean19 = pilha9.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        boolean boolean19 = pilha16.vazia();
        boolean boolean20 = pilha16.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 0.0d);
        boolean boolean24 = pilha21.vazia();
        java.lang.Object obj25 = pilha21.desempilha();
        java.lang.Object[] objArray26 = pilha21.item;
        java.lang.Object[] objArray27 = pilha21.item;
        pilha16.item = objArray27;
        pilha15.item = objArray27;
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 0.0d);
        boolean boolean33 = pilha30.vazia();
        boolean boolean34 = pilha30.vazia();
        boolean boolean35 = pilha30.vazia();
        java.lang.Object[] objArray36 = pilha30.item;
        pilha15.item = objArray36;
        pilha0.item = objArray36;
        java.lang.Object[] objArray39 = pilha0.item;
        java.lang.Object[] objArray40 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        java.lang.Object[] objArray11 = pilha0.item;
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        boolean boolean17 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) 100);
        boolean boolean20 = pilha15.vazia();
        pilha0.empilha((java.lang.Object) pilha15);
        pilha0.topo = (byte) 1;
        int int24 = pilha0.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (byte) 1);
        pilha25.empilha((java.lang.Object) 1.0f);
        pilha25.topo = (-1);
        int int36 = pilha25.tamanho();
        pilha25.topo = (byte) 10;
        int int39 = pilha25.tamanho();
        int int40 = pilha25.tamanho();
        boolean boolean41 = pilha25.vazia();
        java.lang.Object[] objArray42 = pilha25.item;
        pilha0.item = objArray42;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj9 = pilha6.desempilha();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha0.item = objArray10;
        int int12 = pilha0.tamanho();
        int int13 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 0.0d);
        boolean boolean9 = pilha6.vazia();
        boolean boolean10 = pilha6.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 0.0d);
        boolean boolean14 = pilha11.vazia();
        java.lang.Object obj15 = pilha11.desempilha();
        java.lang.Object[] objArray16 = pilha11.item;
        pilha6.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, objArray16 };
        pilha0.item = objArray16;
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object[] objArray22 = pilha0.item;
        pilha0.topo = (byte) 0;
        int int25 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 0.0d);
        boolean boolean7 = pilha4.vazia();
        boolean boolean8 = pilha4.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        pilha0.topo = '#';
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.topo = (-1);
        int int30 = pilha19.tamanho();
        pilha19.topo = (byte) 10;
        java.lang.Object obj33 = pilha19.desempilha();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 0.0d);
        boolean boolean37 = pilha34.vazia();
        java.lang.Object obj38 = pilha34.desempilha();
        int int39 = pilha34.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 0.0d);
        boolean boolean43 = pilha40.vazia();
        boolean boolean44 = pilha40.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        java.lang.Object[] objArray50 = pilha45.item;
        java.lang.Object[] objArray51 = pilha45.item;
        pilha40.item = objArray51;
        pilha34.item = objArray51;
        pilha19.item = objArray51;
        pilha19.topo = (short) 10;
        pilha0.empilha((java.lang.Object) (short) 10);
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 0.0d);
        boolean boolean61 = pilha58.vazia();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.topo = '4';
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) 0.0d);
        boolean boolean68 = pilha65.vazia();
        java.lang.Object obj69 = pilha65.desempilha();
        int int70 = pilha65.topo;
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) 0.0d);
        boolean boolean74 = pilha71.vazia();
        boolean boolean75 = pilha71.vazia();
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.empilha((java.lang.Object) 0.0d);
        boolean boolean79 = pilha76.vazia();
        java.lang.Object obj80 = pilha76.desempilha();
        java.lang.Object[] objArray81 = pilha76.item;
        java.lang.Object[] objArray82 = pilha76.item;
        pilha71.item = objArray82;
        pilha65.item = objArray82;
        pilha58.item = objArray82;
        pilha0.empilha((java.lang.Object) pilha58);
        int int87 = pilha0.tamanho();
        pilha0.topo = (short) 10;
        int int90 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0.0d + "'", obj69, 0.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0.0d + "'", obj80, 0.0d);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 37 + "'", int87 == 37);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        boolean boolean14 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) 100);
        boolean boolean17 = pilha12.vazia();
        java.lang.Object obj18 = pilha12.desempilha();
        pilha0.empilha((java.lang.Object) pilha12);
        int int20 = pilha12.topo;
        boolean boolean21 = pilha12.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (short) -1;
        int int11 = pilha0.topo;
        pilha0.topo = (-1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        boolean boolean24 = pilha22.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (byte) 1);
        pilha25.empilha((java.lang.Object) 1.0f);
        pilha25.topo = (-1);
        int int36 = pilha25.tamanho();
        pilha25.topo = (byte) 10;
        int int39 = pilha25.tamanho();
        java.lang.Object[] objArray40 = pilha25.item;
        pilha22.item = objArray40;
        pilha0.item = objArray40;
        int int43 = pilha0.tamanho();
        int int44 = pilha0.topo;
        int int45 = pilha0.tamanho();
        pilha0.topo = 2;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = 1;
        boolean boolean15 = pilha0.vazia();
        java.lang.Object[] objArray16 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 0.0d);
        boolean boolean6 = pilha3.vazia();
        java.lang.Object obj7 = pilha3.desempilha();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        java.lang.Object[] objArray14 = pilha12.item;
        boolean boolean15 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) "");
        int int18 = pilha12.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (byte) 1);
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.empilha((java.lang.Object) 0.0d);
        pilha12.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray31 = pilha12.item;
        pilha0.item = objArray31;
        int int33 = pilha0.tamanho();
        pilha0.topo = 36;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        pilha0.topo = 3;
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj18 = pilha15.desempilha();
        java.lang.Object[] objArray19 = pilha15.item;
        pilha15.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 1;
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 0.0d);
        boolean boolean30 = pilha27.vazia();
        java.lang.Object obj31 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) (byte) 1);
        pilha27.empilha((java.lang.Object) 1.0f);
        java.lang.Object[] objArray36 = pilha27.item;
        pilha22.empilha((java.lang.Object) objArray36);
        pilha15.item = objArray36;
        pilha0.empilha((java.lang.Object) objArray36);
        java.lang.Class<?> wildcardClass40 = objArray36.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 10L);
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = '#';
        pilha0.empilha((java.lang.Object) (byte) 1);
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        boolean boolean19 = pilha17.vazia();
        java.lang.Object[] objArray20 = pilha17.item;
        pilha0.empilha((java.lang.Object) objArray20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        pilha4.item = objArray7;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) (byte) 1);
        pilha13.empilha((java.lang.Object) 1.0f);
        pilha13.empilha((java.lang.Object) 0.0d);
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        java.lang.Object[] objArray30 = pilha28.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        pilha28.item = objArray31;
        pilha24.empilha((java.lang.Object) pilha28);
        pilha13.empilha((java.lang.Object) pilha24);
        int int35 = pilha13.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 0.0d);
        boolean boolean39 = pilha36.vazia();
        java.lang.Object obj40 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) (byte) 1);
        pilha36.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 0.0d);
        boolean boolean48 = pilha45.vazia();
        java.lang.Object obj49 = pilha45.desempilha();
        int int50 = pilha45.topo;
        pilha36.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj55 = pilha52.desempilha();
        java.lang.Object[] objArray56 = pilha52.item;
        pilha45.empilha((java.lang.Object) pilha52);
        boolean boolean58 = pilha45.vazia();
        ds.Pilha pilha59 = new ds.Pilha();
        boolean boolean60 = pilha59.vazia();
        int int61 = pilha59.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        pilha62.empilha((java.lang.Object) 0.0d);
        boolean boolean65 = pilha62.vazia();
        java.lang.Object obj66 = pilha62.desempilha();
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object[] objArray68 = pilha62.item;
        pilha59.item = objArray68;
        int int70 = pilha59.tamanho();
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) 0.0d);
        boolean boolean74 = pilha71.vazia();
        java.lang.Object obj75 = pilha71.desempilha();
        pilha71.empilha((java.lang.Object) (byte) 1);
        pilha71.empilha((java.lang.Object) 1.0f);
        pilha71.topo = (-1);
        int int82 = pilha71.tamanho();
        pilha71.topo = (byte) 10;
        java.lang.Object obj85 = pilha71.desempilha();
        java.lang.Object[] objArray86 = pilha71.item;
        pilha59.empilha((java.lang.Object) objArray86);
        pilha45.item = objArray86;
        pilha13.item = objArray86;
        pilha0.item = objArray86;
        ds.Pilha pilha91 = new ds.Pilha();
        java.lang.Class<?> wildcardClass92 = pilha91.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass92);
        java.lang.Object[] objArray94 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0.0d + "'", obj40, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 0.0d + "'", obj66, 0.0d);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 0.0d + "'", obj75, 0.0d);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = '4';
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) false);
        int int12 = pilha0.tamanho();
        java.lang.Object obj13 = null;
        pilha0.empilha(obj13);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 0.0d);
        boolean boolean18 = pilha15.vazia();
        int int19 = pilha15.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 0.0d);
        boolean boolean23 = pilha20.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 0.0d);
        boolean boolean27 = pilha24.vazia();
        boolean boolean28 = pilha24.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        java.lang.Object obj33 = pilha29.desempilha();
        java.lang.Object[] objArray34 = pilha29.item;
        pilha24.item = objArray34;
        pilha20.item = objArray34;
        pilha15.empilha((java.lang.Object) pilha20);
        boolean boolean38 = pilha20.vazia();
        pilha20.topo = (byte) -1;
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray42 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray33 = pilha0.item;
        boolean boolean34 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 0.0d);
        boolean boolean11 = pilha8.vazia();
        int int12 = pilha8.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        boolean boolean21 = pilha17.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 0.0d);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        java.lang.Object[] objArray27 = pilha22.item;
        pilha17.item = objArray27;
        pilha13.item = objArray27;
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj31 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray33 = pilha0.item;
        java.lang.Object obj34 = pilha0.desempilha();
        java.lang.Object obj35 = pilha0.desempilha();
        int int36 = pilha0.topo;
        int int37 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass38 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) "");
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 0.0d);
        boolean boolean10 = pilha7.vazia();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (byte) 1);
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 0.0d);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 0.0d);
        boolean boolean22 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean22);
        pilha0.empilha((java.lang.Object) (-1L));
        int int26 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        java.lang.Object[] objArray9 = pilha7.item;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        pilha7.item = objArray10;
        pilha0.item = objArray10;
        pilha0.topo = (byte) 0;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 0.0d);
        boolean boolean16 = pilha13.vazia();
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        java.lang.Object[] objArray19 = pilha13.item;
        pilha10.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        boolean boolean24 = pilha22.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 0.0d);
        boolean boolean28 = pilha25.vazia();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (byte) 1);
        pilha25.empilha((java.lang.Object) 1.0f);
        pilha25.topo = (-1);
        int int36 = pilha25.tamanho();
        pilha25.topo = (byte) 10;
        int int39 = pilha25.tamanho();
        java.lang.Object[] objArray40 = pilha25.item;
        pilha22.item = objArray40;
        pilha0.item = objArray40;
        int int43 = pilha0.tamanho();
        java.lang.Object[] objArray44 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 1;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 0.0d);
        boolean boolean15 = pilha12.vazia();
        boolean boolean16 = pilha12.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha12.item = objArray22;
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100.0f, objArray22 };
        pilha6.item = objArray22;
        java.lang.Object[] objArray27 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 0.0d);
        boolean boolean32 = pilha29.vazia();
        boolean boolean33 = pilha29.vazia();
        boolean boolean34 = pilha29.vazia();
        java.lang.Object[] objArray35 = pilha29.item;
        pilha6.empilha((java.lang.Object) objArray35);
        boolean boolean37 = pilha6.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 0.0d);
        boolean boolean41 = pilha38.vazia();
        boolean boolean42 = pilha38.vazia();
        java.lang.Object obj43 = pilha38.desempilha();
        boolean boolean44 = pilha38.vazia();
        pilha38.topo = 0;
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 0.0d);
        boolean boolean50 = pilha47.vazia();
        boolean boolean51 = pilha47.vazia();
        boolean boolean52 = pilha47.vazia();
        java.lang.Object[] objArray53 = pilha47.item;
        pilha38.item = objArray53;
        pilha6.item = objArray53;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 0L);
        java.lang.Object[] objArray11 = pilha0.item;
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        pilha0.topo = (-1);
        pilha0.topo = (short) 10;
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.empilha((java.lang.Object) (byte) 1);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        int int15 = pilha9.topo;
        pilha0.empilha((java.lang.Object) int15);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 0.0d);
        boolean boolean20 = pilha17.vazia();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.topo = 0;
        boolean boolean27 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 0.0d);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (byte) 1);
        pilha0.empilha((java.lang.Object) 1.0f);
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 0.0d);
        boolean boolean12 = pilha9.vazia();
        java.lang.Object obj13 = pilha9.desempilha();
        int int14 = pilha9.topo;
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 0.0d);
        java.lang.Object obj19 = pilha16.desempilha();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha9.empilha((java.lang.Object) pilha16);
        boolean boolean22 = pilha9.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 0.0d);
        boolean boolean26 = pilha23.vazia();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (byte) 1);
        pilha23.empilha((java.lang.Object) 1.0f);
        pilha23.topo = (-1);
        int int34 = pilha23.tamanho();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 0.0d);
        boolean boolean38 = pilha35.vazia();
        java.lang.Object obj39 = pilha35.desempilha();
        int int40 = pilha35.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 0.0d);
        boolean boolean44 = pilha41.vazia();
        boolean boolean45 = pilha41.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 0.0d);
        boolean boolean49 = pilha46.vazia();
        java.lang.Object obj50 = pilha46.desempilha();
        java.lang.Object[] objArray51 = pilha46.item;
        java.lang.Object[] objArray52 = pilha46.item;
        pilha41.item = objArray52;
        pilha35.item = objArray52;
        pilha23.item = objArray52;
        java.lang.Object[] objArray56 = pilha23.item;
        java.lang.Object[] objArray57 = pilha23.item;
        pilha9.empilha((java.lang.Object) pilha23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
    }
}


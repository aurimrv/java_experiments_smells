package ds.seed5831;

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
        pilha0.topo = (byte) 1;
        int int3 = pilha0.topo;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = 'a';
        int int13 = pilha0.topo;
        pilha0.topo = 35;
        int int16 = pilha0.tamanho();
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        pilha14.topo = '#';
        int int18 = pilha14.topo;
        boolean boolean19 = pilha14.vazia();
        java.lang.Object[] objArray20 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray20);
        java.lang.Object obj22 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        pilha0.item = objArray4;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha9.item = objArray12;
        pilha6.item = objArray12;
        java.lang.Object[] objArray15 = pilha6.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        java.lang.Object[] objArray19 = pilha16.item;
        pilha6.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha28.item = objArray34;
        pilha22.item = objArray34;
        int int37 = pilha22.topo;
        java.lang.Object[] objArray38 = pilha22.item;
        pilha0.item = objArray38;
        java.lang.Object[] objArray40 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        boolean boolean5 = pilha3.vazia();
        pilha3.topo = 0;
        boolean boolean8 = pilha3.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha9.item = objArray15;
        pilha3.item = objArray15;
        pilha0.item = objArray15;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 'a';
        boolean boolean24 = pilha19.vazia();
        pilha19.topo = (byte) 100;
        int int27 = pilha19.topo;
        boolean boolean28 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean28);
        java.lang.Object[] objArray30 = pilha0.item;
        pilha0.topo = 34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 0;
        java.lang.Class<?> wildcardClass11 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass11);
        pilha0.topo = (short) -1;
        int int15 = pilha0.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        pilha16.topo = 'a';
        int int21 = pilha16.topo;
        java.lang.Object[] objArray22 = pilha16.item;
        int int23 = pilha16.tamanho();
        java.lang.Object[] objArray24 = pilha16.item;
        pilha16.topo = 32;
        java.lang.Object[] objArray27 = pilha16.item;
        java.lang.Object[] objArray28 = pilha16.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        java.lang.Object[] objArray6 = pilha2.item;
        pilha0.item = objArray6;
        pilha0.topo = '4';
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = null;
        pilha0.item = objArray11;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha13.item = objArray16;
        java.lang.Object[] objArray18 = pilha13.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 'a';
        boolean boolean24 = pilha19.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1.0d };
        pilha25.item = objArray27;
        pilha19.empilha((java.lang.Object) pilha25);
        pilha13.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = (byte) 1;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        boolean boolean36 = pilha34.vazia();
        pilha34.topo = 'a';
        int int39 = pilha34.topo;
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        pilha31.item = objArray41;
        pilha31.topo = (byte) 10;
        pilha13.empilha((java.lang.Object) pilha31);
        pilha13.topo = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        boolean boolean16 = pilha11.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1.0d };
        pilha17.item = objArray19;
        pilha11.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        pilha22.topo = '#';
        int int26 = pilha22.topo;
        int int27 = pilha22.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 1.0d };
        pilha30.item = objArray32;
        pilha28.item = objArray32;
        pilha22.empilha((java.lang.Object) pilha28);
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray39 = pilha38.item;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 1.0d };
        pilha40.item = objArray42;
        java.lang.Object[] objArray44 = pilha40.item;
        pilha38.item = objArray44;
        pilha36.item = objArray44;
        java.lang.Object[] objArray47 = pilha36.item;
        pilha28.empilha((java.lang.Object) pilha36);
        java.lang.Object[] objArray49 = pilha28.item;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        boolean boolean52 = pilha50.vazia();
        int int53 = pilha50.tamanho();
        java.lang.Object[] objArray54 = pilha50.item;
        pilha28.item = objArray54;
        java.lang.Object[] objArray56 = pilha28.item;
        pilha17.empilha((java.lang.Object) objArray56);
        pilha0.item = objArray56;
        pilha0.topo = 0;
        boolean boolean61 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        java.lang.Object obj5 = pilha0.desempilha();
        pilha0.topo = 96;
        int int8 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        pilha3.topo = '#';
        boolean boolean7 = pilha3.vazia();
        boolean boolean8 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) boolean8);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        pilha10.topo = '#';
        int int14 = pilha10.topo;
        int int15 = pilha10.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        pilha18.item = objArray20;
        pilha16.item = objArray20;
        pilha10.empilha((java.lang.Object) pilha16);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1.0d };
        pilha28.item = objArray30;
        java.lang.Object[] objArray32 = pilha28.item;
        pilha26.item = objArray32;
        pilha24.item = objArray32;
        java.lang.Object[] objArray35 = pilha24.item;
        pilha16.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray37 = pilha16.item;
        boolean boolean38 = pilha16.vazia();
        java.lang.Object[] objArray39 = pilha16.item;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        int int11 = pilha0.topo;
        pilha0.topo = 0;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0d };
        pilha14.item = objArray16;
        pilha14.topo = 1;
        boolean boolean20 = pilha14.vazia();
        int int21 = pilha14.topo;
        pilha0.empilha((java.lang.Object) int21);
        java.lang.Object[] objArray23 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        pilha2.item = objArray5;
        java.lang.Object[] objArray7 = pilha2.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        boolean boolean13 = pilha8.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0d };
        pilha14.item = objArray16;
        pilha8.empilha((java.lang.Object) pilha14);
        pilha2.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = (byte) 1;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 'a';
        int int28 = pilha23.topo;
        java.lang.Object[] objArray29 = pilha23.item;
        java.lang.Object[] objArray30 = pilha23.item;
        pilha20.item = objArray30;
        pilha20.topo = (byte) 10;
        pilha2.empilha((java.lang.Object) pilha20);
        java.lang.Object obj35 = pilha2.desempilha();
        pilha2.topo = 0;
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 1.0d };
        pilha38.item = objArray40;
        pilha38.topo = 1;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        pilha44.topo = (byte) 0;
        java.lang.Object[] objArray48 = pilha44.item;
        pilha38.item = objArray48;
        pilha2.item = objArray48;
        pilha0.item = objArray48;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        pilha52.topo = (byte) 0;
        java.lang.Object[] objArray56 = pilha52.item;
        pilha0.item = objArray56;
        pilha0.topo = 36;
        java.lang.Class<?> wildcardClass60 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        pilha0.item = objArray9;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha11.item = objArray14;
        int int16 = pilha11.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        boolean boolean19 = pilha17.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha20.item = objArray23;
        pilha17.item = objArray23;
        java.lang.Object[] objArray26 = pilha17.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        java.lang.Object[] objArray30 = pilha27.item;
        pilha17.item = objArray30;
        pilha11.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        boolean boolean35 = pilha33.vazia();
        pilha33.topo = 0;
        boolean boolean38 = pilha33.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        boolean boolean41 = pilha39.vazia();
        pilha39.topo = 'a';
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha39.item = objArray45;
        pilha33.item = objArray45;
        int int48 = pilha33.topo;
        java.lang.Object[] objArray49 = pilha33.item;
        pilha11.item = objArray49;
        boolean boolean51 = pilha11.vazia();
        int int52 = pilha11.tamanho();
        java.lang.Object[] objArray53 = pilha11.item;
        pilha0.item = objArray53;
        pilha0.topo = 34;
        java.lang.Class<?> wildcardClass57 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        java.lang.Object[] objArray13 = pilha10.item;
        pilha0.item = objArray13;
        java.lang.Object[] objArray15 = pilha0.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        pilha16.topo = '#';
        int int20 = pilha16.topo;
        int int21 = pilha16.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1.0d };
        pilha24.item = objArray26;
        pilha22.item = objArray26;
        pilha16.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 1.0d };
        pilha34.item = objArray36;
        java.lang.Object[] objArray38 = pilha34.item;
        pilha32.item = objArray38;
        pilha30.item = objArray38;
        java.lang.Object[] objArray41 = pilha30.item;
        pilha22.empilha((java.lang.Object) pilha30);
        pilha0.empilha((java.lang.Object) pilha22);
        java.lang.Object obj44 = pilha0.desempilha();
        boolean boolean45 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1.0]");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha9.item = objArray12;
        pilha6.item = objArray12;
        java.lang.Object[] objArray15 = pilha6.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        java.lang.Object[] objArray19 = pilha16.item;
        pilha6.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha28.item = objArray34;
        pilha22.item = objArray34;
        int int37 = pilha22.topo;
        java.lang.Object[] objArray38 = pilha22.item;
        pilha0.item = objArray38;
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.tamanho();
        java.lang.Object[] objArray42 = pilha0.item;
        java.lang.Class<?> wildcardClass43 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        pilha6.topo = '#';
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1.0d };
        pilha10.item = objArray12;
        java.lang.Object[] objArray14 = pilha10.item;
        int int15 = pilha10.topo;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha6.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1.0d };
        pilha23.item = objArray25;
        java.lang.Object[] objArray27 = pilha23.item;
        pilha21.item = objArray27;
        pilha19.item = objArray27;
        java.lang.Object[] objArray30 = pilha19.item;
        int int31 = pilha19.topo;
        int int32 = pilha19.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        pilha33.topo = '#';
        int int37 = pilha33.topo;
        boolean boolean38 = pilha33.vazia();
        java.lang.Object[] objArray39 = pilha33.item;
        pilha19.empilha((java.lang.Object) objArray39);
        pilha10.item = objArray39;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d };
        pilha5.item = objArray7;
        java.lang.Object[] objArray9 = pilha5.item;
        int int10 = pilha5.topo;
        java.lang.Object[] objArray11 = pilha5.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        boolean boolean14 = pilha12.vazia();
        pilha12.topo = 'a';
        int int17 = pilha12.topo;
        java.lang.Object[] objArray18 = pilha12.item;
        int int19 = pilha12.tamanho();
        pilha5.empilha((java.lang.Object) int19);
        pilha0.empilha((java.lang.Object) int19);
        java.lang.Object obj22 = pilha0.desempilha();
        boolean boolean23 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[97]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[97]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[97]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 97 + "'", obj22, 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        int int14 = pilha9.topo;
        java.lang.Object[] objArray15 = pilha9.item;
        java.lang.Object[] objArray16 = pilha9.item;
        pilha0.item = objArray16;
        java.lang.Object obj18 = pilha0.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        pilha19.topo = '#';
        int int23 = pilha19.topo;
        int int24 = pilha19.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1.0d };
        pilha27.item = objArray29;
        pilha25.item = objArray29;
        pilha19.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1.0d };
        pilha37.item = objArray39;
        java.lang.Object[] objArray41 = pilha37.item;
        pilha35.item = objArray41;
        pilha33.item = objArray41;
        java.lang.Object[] objArray44 = pilha33.item;
        pilha25.empilha((java.lang.Object) pilha33);
        pilha0.empilha((java.lang.Object) pilha33);
        int int47 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 96 + "'", int47 == 96);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        boolean boolean5 = pilha3.vazia();
        pilha3.topo = 0;
        boolean boolean8 = pilha3.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha9.item = objArray15;
        pilha3.item = objArray15;
        pilha0.item = objArray15;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 'a';
        boolean boolean24 = pilha19.vazia();
        pilha19.topo = (byte) 100;
        int int27 = pilha19.topo;
        boolean boolean28 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean28);
        int int30 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        pilha0.topo = 1;
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        boolean boolean24 = pilha22.vazia();
        int int25 = pilha22.tamanho();
        java.lang.Object[] objArray26 = pilha22.item;
        pilha11.empilha((java.lang.Object) pilha22);
        int int28 = pilha22.tamanho();
        int int29 = pilha22.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        int int11 = pilha0.topo;
        pilha0.topo = 0;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        pilha14.topo = '#';
        int int18 = pilha14.topo;
        int int19 = pilha14.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1.0d };
        pilha22.item = objArray24;
        pilha20.item = objArray24;
        pilha14.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 1.0d };
        pilha32.item = objArray34;
        java.lang.Object[] objArray36 = pilha32.item;
        pilha30.item = objArray36;
        pilha28.item = objArray36;
        java.lang.Object[] objArray39 = pilha28.item;
        pilha20.empilha((java.lang.Object) pilha28);
        java.lang.Object[] objArray41 = pilha20.item;
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray43 = pilha42.item;
        boolean boolean44 = pilha42.vazia();
        int int45 = pilha42.tamanho();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha20.item = objArray46;
        java.lang.Object[] objArray48 = pilha20.item;
        java.lang.Object obj49 = pilha20.desempilha();
        java.lang.Object[] objArray50 = pilha20.item;
        pilha0.item = objArray50;
        pilha0.topo = 98;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        pilha8.item = objArray11;
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        boolean boolean19 = pilha14.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 1.0d };
        pilha20.item = objArray22;
        pilha14.empilha((java.lang.Object) pilha20);
        pilha8.empilha((java.lang.Object) pilha20);
        int int26 = pilha20.topo;
        pilha0.empilha((java.lang.Object) int26);
        pilha0.topo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = 'a';
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        pilha14.item = objArray17;
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        boolean boolean25 = pilha20.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1.0d };
        pilha26.item = objArray28;
        pilha20.empilha((java.lang.Object) pilha26);
        pilha14.empilha((java.lang.Object) pilha26);
        java.lang.Object[] objArray32 = pilha26.item;
        pilha0.item = objArray32;
        java.lang.Class<?> wildcardClass34 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        java.lang.Object[] objArray13 = pilha10.item;
        pilha0.item = objArray13;
        pilha0.topo = (short) -1;
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        int int9 = pilha4.topo;
        java.lang.Object[] objArray10 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha0.topo = (short) 10;
        int int14 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        pilha0.topo = 1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        boolean boolean9 = pilha7.vazia();
        pilha7.topo = 'a';
        int int12 = pilha7.topo;
        java.lang.Object[] objArray13 = pilha7.item;
        int int14 = pilha7.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        boolean boolean17 = pilha15.vazia();
        pilha15.topo = 'a';
        int int20 = pilha15.topo;
        java.lang.Object[] objArray21 = pilha15.item;
        boolean boolean22 = pilha15.vazia();
        boolean boolean23 = pilha15.vazia();
        pilha15.topo = (byte) -1;
        int int26 = pilha15.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        pilha27.topo = 0;
        boolean boolean32 = pilha27.vazia();
        int int33 = pilha27.tamanho();
        java.lang.Object[] objArray34 = pilha27.item;
        pilha15.item = objArray34;
        pilha7.item = objArray34;
        pilha0.item = objArray34;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha0.empilha((java.lang.Object) boolean7);
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = '4';
        int int12 = pilha0.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha13.item = objArray16;
        java.lang.Object[] objArray18 = pilha13.item;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        java.lang.Object[] objArray25 = pilha21.item;
        pilha19.item = objArray25;
        pilha13.item = objArray25;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        pilha28.topo = '#';
        int int32 = pilha28.topo;
        int int33 = pilha28.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 1.0d };
        pilha36.item = objArray38;
        pilha34.item = objArray38;
        pilha28.empilha((java.lang.Object) pilha34);
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 1.0d };
        pilha46.item = objArray48;
        java.lang.Object[] objArray50 = pilha46.item;
        pilha44.item = objArray50;
        pilha42.item = objArray50;
        java.lang.Object[] objArray53 = pilha42.item;
        pilha34.empilha((java.lang.Object) pilha42);
        java.lang.Object[] objArray55 = pilha34.item;
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        boolean boolean58 = pilha56.vazia();
        int int59 = pilha56.tamanho();
        java.lang.Object[] objArray60 = pilha56.item;
        pilha34.item = objArray60;
        java.lang.Object[] objArray62 = pilha34.item;
        pilha13.empilha((java.lang.Object) objArray62);
        pilha0.item = objArray62;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 0;
        boolean boolean9 = pilha4.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha10.item = objArray16;
        pilha4.item = objArray16;
        int int19 = pilha4.topo;
        java.lang.Object[] objArray20 = pilha4.item;
        pilha0.item = objArray20;
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        pilha6.topo = (byte) 0;
        java.lang.Object[] objArray10 = pilha6.item;
        pilha0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 0;
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        int int13 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        pilha2.item = objArray5;
        java.lang.Object[] objArray7 = pilha2.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        boolean boolean13 = pilha8.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0d };
        pilha14.item = objArray16;
        pilha8.empilha((java.lang.Object) pilha14);
        pilha2.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.topo = (byte) 1;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 'a';
        int int28 = pilha23.topo;
        java.lang.Object[] objArray29 = pilha23.item;
        java.lang.Object[] objArray30 = pilha23.item;
        pilha20.item = objArray30;
        pilha20.topo = (byte) 10;
        pilha2.empilha((java.lang.Object) pilha20);
        java.lang.Object obj35 = pilha2.desempilha();
        pilha2.topo = 0;
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 1.0d };
        pilha38.item = objArray40;
        pilha38.topo = 1;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        pilha44.topo = (byte) 0;
        java.lang.Object[] objArray48 = pilha44.item;
        pilha38.item = objArray48;
        pilha2.item = objArray48;
        pilha0.item = objArray48;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        pilha52.topo = (byte) 0;
        java.lang.Object[] objArray56 = pilha52.item;
        pilha0.item = objArray56;
        java.lang.Class<?> wildcardClass58 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha13.item = objArray16;
        java.lang.Object[] objArray18 = pilha13.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 'a';
        boolean boolean24 = pilha19.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1.0d };
        pilha25.item = objArray27;
        pilha19.empilha((java.lang.Object) pilha25);
        pilha13.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.topo = (byte) 1;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        boolean boolean36 = pilha34.vazia();
        pilha34.topo = 'a';
        int int39 = pilha34.topo;
        java.lang.Object[] objArray40 = pilha34.item;
        java.lang.Object[] objArray41 = pilha34.item;
        pilha31.item = objArray41;
        pilha31.topo = (byte) 10;
        pilha13.empilha((java.lang.Object) pilha31);
        java.lang.Object obj46 = pilha13.desempilha();
        pilha13.topo = 0;
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 1.0d };
        pilha49.item = objArray51;
        pilha49.topo = 1;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        pilha55.topo = (byte) 0;
        java.lang.Object[] objArray59 = pilha55.item;
        pilha49.item = objArray59;
        pilha13.item = objArray59;
        pilha11.item = objArray59;
        pilha0.item = objArray59;
        ds.Pilha pilha64 = new ds.Pilha();
        int int65 = pilha64.topo;
        pilha64.topo = '#';
        int int68 = pilha64.topo;
        int int69 = pilha64.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.topo;
        boolean boolean72 = pilha70.vazia();
        pilha70.topo = 'a';
        int int75 = pilha70.topo;
        java.lang.Object[] objArray76 = pilha70.item;
        boolean boolean77 = pilha70.vazia();
        boolean boolean78 = pilha70.vazia();
        pilha70.topo = (byte) -1;
        int int81 = pilha70.topo;
        ds.Pilha pilha82 = new ds.Pilha();
        int int83 = pilha82.topo;
        boolean boolean84 = pilha82.vazia();
        pilha82.topo = 0;
        boolean boolean87 = pilha82.vazia();
        int int88 = pilha82.tamanho();
        java.lang.Object[] objArray89 = pilha82.item;
        pilha70.item = objArray89;
        pilha64.item = objArray89;
        pilha64.topo = 0;
        pilha0.empilha((java.lang.Object) pilha64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 'a';
        boolean boolean9 = pilha4.vazia();
        pilha4.topo = (byte) 100;
        int int12 = pilha4.topo;
        pilha0.empilha((java.lang.Object) pilha4);
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1.0d };
        pilha15.item = objArray17;
        pilha15.topo = 1;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        pilha21.topo = (byte) 0;
        java.lang.Object[] objArray25 = pilha21.item;
        pilha15.item = objArray25;
        pilha0.item = objArray25;
        int int28 = pilha0.topo;
        int int29 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        int int9 = pilha4.topo;
        java.lang.Object[] objArray10 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha4.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 0;
        java.lang.Class<?> wildcardClass11 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass11);
        pilha0.topo = 101;
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = 32;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        boolean boolean14 = pilha12.vazia();
        pilha12.topo = 'a';
        pilha12.topo = (byte) 0;
        int int19 = pilha12.topo;
        pilha0.empilha((java.lang.Object) pilha12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        pilha0.empilha((java.lang.Object) 0.0d);
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 0;
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.tamanho();
        boolean boolean15 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        int int3 = pilha0.tamanho();
        pilha0.topo = '4';
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 0;
        boolean boolean14 = pilha9.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        boolean boolean17 = pilha15.vazia();
        pilha15.topo = 'a';
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        pilha15.item = objArray21;
        pilha9.item = objArray21;
        pilha6.item = objArray21;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        boolean boolean27 = pilha25.vazia();
        pilha25.topo = 'a';
        boolean boolean30 = pilha25.vazia();
        pilha25.topo = (byte) 100;
        int int33 = pilha25.topo;
        boolean boolean34 = pilha25.vazia();
        pilha6.empilha((java.lang.Object) boolean34);
        java.lang.Object[] objArray36 = pilha6.item;
        pilha0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        int int11 = pilha0.topo;
        int int12 = pilha0.topo;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        pilha8.topo = '#';
        boolean boolean12 = pilha8.vazia();
        boolean boolean13 = pilha8.vazia();
        java.lang.Object obj14 = null;
        pilha8.empilha(obj14);
        pilha8.topo = 35;
        pilha8.topo = 100;
        java.lang.Object[] objArray20 = pilha8.item;
        java.lang.Object[] objArray21 = pilha8.item;
        pilha0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        boolean boolean5 = pilha3.vazia();
        pilha3.topo = 'a';
        int int8 = pilha3.topo;
        java.lang.Object[] objArray9 = pilha3.item;
        java.lang.Object[] objArray10 = pilha3.item;
        pilha0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        pilha8.item = objArray11;
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        boolean boolean19 = pilha14.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 1.0d };
        pilha20.item = objArray22;
        pilha14.empilha((java.lang.Object) pilha20);
        pilha8.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.topo = (byte) 1;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        boolean boolean31 = pilha29.vazia();
        pilha29.topo = 'a';
        int int34 = pilha29.topo;
        java.lang.Object[] objArray35 = pilha29.item;
        java.lang.Object[] objArray36 = pilha29.item;
        pilha26.item = objArray36;
        pilha26.topo = (byte) 10;
        pilha8.empilha((java.lang.Object) pilha26);
        java.lang.Object obj41 = pilha8.desempilha();
        int int42 = pilha8.topo;
        java.lang.Object[] objArray43 = pilha8.item;
        pilha0.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha9.item = objArray12;
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        boolean boolean17 = pilha15.vazia();
        pilha15.topo = 'a';
        boolean boolean20 = pilha15.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        pilha15.empilha((java.lang.Object) pilha21);
        pilha9.empilha((java.lang.Object) pilha21);
        int int27 = pilha9.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        int int33 = pilha28.topo;
        java.lang.Object[] objArray34 = pilha28.item;
        boolean boolean35 = pilha28.vazia();
        boolean boolean36 = pilha28.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        boolean boolean39 = pilha37.vazia();
        pilha37.topo = 'a';
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray43 = pilha42.item;
        pilha37.item = objArray43;
        java.lang.Object obj45 = pilha37.desempilha();
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        boolean boolean48 = pilha46.vazia();
        pilha46.topo = 'a';
        int int51 = pilha46.topo;
        java.lang.Object[] objArray52 = pilha46.item;
        java.lang.Object[] objArray53 = pilha46.item;
        pilha37.item = objArray53;
        pilha28.empilha((java.lang.Object) objArray53);
        int int56 = pilha28.topo;
        pilha28.topo = 97;
        pilha9.empilha((java.lang.Object) pilha28);
        pilha0.empilha((java.lang.Object) pilha9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 98 + "'", int56 == 98);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha9.item = objArray12;
        pilha6.item = objArray12;
        java.lang.Object[] objArray15 = pilha6.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        java.lang.Object[] objArray19 = pilha16.item;
        pilha6.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha28.item = objArray34;
        pilha22.item = objArray34;
        int int37 = pilha22.topo;
        java.lang.Object[] objArray38 = pilha22.item;
        pilha0.item = objArray38;
        int int40 = pilha0.topo;
        int int41 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 35);
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        pilha0.topo = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (short) 10;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        int int9 = pilha4.topo;
        java.lang.Object[] objArray10 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = 0;
        boolean boolean14 = pilha4.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        boolean boolean17 = pilha15.vazia();
        pilha15.topo = 'a';
        boolean boolean20 = pilha15.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        pilha15.empilha((java.lang.Object) pilha21);
        boolean boolean26 = pilha15.vazia();
        java.lang.Object[] objArray27 = pilha15.item;
        pilha4.empilha((java.lang.Object) objArray27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        pilha7.item = objArray10;
        int int12 = pilha7.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        pilha16.item = objArray19;
        pilha13.item = objArray19;
        java.lang.Object[] objArray22 = pilha13.item;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        java.lang.Object[] objArray26 = pilha23.item;
        pilha13.item = objArray26;
        pilha7.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        boolean boolean31 = pilha29.vazia();
        pilha29.topo = 0;
        boolean boolean34 = pilha29.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        pilha35.topo = 'a';
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        pilha35.item = objArray41;
        pilha29.item = objArray41;
        int int44 = pilha29.topo;
        java.lang.Object[] objArray45 = pilha29.item;
        pilha7.item = objArray45;
        pilha0.item = objArray45;
        boolean boolean48 = pilha0.vazia();
        int int49 = pilha0.topo;
        int int50 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1.0d };
        pilha10.item = objArray12;
        java.lang.Object[] objArray14 = pilha10.item;
        pilha8.item = objArray14;
        pilha6.item = objArray14;
        java.lang.Object[] objArray17 = pilha6.item;
        int int18 = pilha6.topo;
        int int19 = pilha6.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        boolean boolean25 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) 1.0d);
        java.lang.Object[] objArray28 = pilha20.item;
        pilha6.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha30.item = objArray33;
        java.lang.Object[] objArray35 = pilha30.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 'a';
        boolean boolean41 = pilha36.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1.0d };
        pilha42.item = objArray44;
        pilha36.empilha((java.lang.Object) pilha42);
        pilha30.empilha((java.lang.Object) pilha42);
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.topo = (byte) 1;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        boolean boolean53 = pilha51.vazia();
        pilha51.topo = 'a';
        int int56 = pilha51.topo;
        java.lang.Object[] objArray57 = pilha51.item;
        java.lang.Object[] objArray58 = pilha51.item;
        pilha48.item = objArray58;
        pilha48.topo = (byte) 10;
        pilha30.empilha((java.lang.Object) pilha48);
        java.lang.Object[] objArray63 = pilha30.item;
        pilha6.item = objArray63;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        boolean boolean68 = pilha66.vazia();
        pilha66.topo = 'a';
        boolean boolean71 = pilha66.vazia();
        int int72 = pilha66.topo;
        pilha0.empilha((java.lang.Object) int72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        boolean boolean15 = pilha0.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 0;
        boolean boolean24 = pilha19.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        boolean boolean27 = pilha25.vazia();
        pilha25.topo = 'a';
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha25.item = objArray31;
        pilha19.item = objArray31;
        pilha16.item = objArray31;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        pilha35.topo = 'a';
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        pilha35.item = objArray41;
        int int43 = pilha35.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1.0d };
        pilha44.item = objArray46;
        pilha35.empilha((java.lang.Object) pilha44);
        int int49 = pilha35.tamanho();
        pilha16.empilha((java.lang.Object) pilha35);
        pilha0.empilha((java.lang.Object) pilha35);
        int int52 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 98 + "'", int49 == 98);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (short) 10;
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        int int11 = pilha6.topo;
        java.lang.Object[] objArray12 = pilha6.item;
        pilha0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = (-1);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        pilha9.topo = (byte) 0;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha9.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        pilha17.item = objArray20;
        int int22 = pilha17.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        pilha26.item = objArray29;
        pilha23.item = objArray29;
        java.lang.Object[] objArray32 = pilha23.item;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        boolean boolean35 = pilha33.vazia();
        java.lang.Object[] objArray36 = pilha33.item;
        pilha23.item = objArray36;
        pilha17.item = objArray36;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        boolean boolean41 = pilha39.vazia();
        pilha39.topo = 0;
        boolean boolean44 = pilha39.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.topo;
        boolean boolean47 = pilha45.vazia();
        pilha45.topo = 'a';
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha45.item = objArray51;
        pilha39.item = objArray51;
        int int54 = pilha39.topo;
        java.lang.Object[] objArray55 = pilha39.item;
        pilha17.item = objArray55;
        pilha9.item = objArray55;
        pilha0.item = objArray55;
        pilha0.topo = 34;
        pilha0.topo = 35;
        pilha0.topo = 36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha6.item = objArray9;
        int int11 = pilha6.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        boolean boolean14 = pilha12.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha15.item = objArray18;
        pilha12.item = objArray18;
        java.lang.Object[] objArray21 = pilha12.item;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        java.lang.Object[] objArray25 = pilha22.item;
        pilha12.item = objArray25;
        pilha6.item = objArray25;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 0;
        boolean boolean33 = pilha28.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        boolean boolean36 = pilha34.vazia();
        pilha34.topo = 'a';
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        pilha34.item = objArray40;
        pilha28.item = objArray40;
        int int43 = pilha28.topo;
        java.lang.Object[] objArray44 = pilha28.item;
        pilha6.item = objArray44;
        pilha0.item = objArray44;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        pilha0.empilha((java.lang.Object) pilha8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        pilha18.item = objArray20;
        java.lang.Object[] objArray22 = pilha18.item;
        pilha16.item = objArray22;
        pilha14.item = objArray22;
        java.lang.Object[] objArray25 = pilha14.item;
        pilha6.empilha((java.lang.Object) pilha14);
        java.lang.Object[] objArray27 = pilha6.item;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        boolean boolean30 = pilha28.vazia();
        int int31 = pilha28.tamanho();
        java.lang.Object[] objArray32 = pilha28.item;
        pilha6.item = objArray32;
        int int34 = pilha6.topo;
        java.lang.Object[] objArray35 = pilha6.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 0;
        boolean boolean41 = pilha36.vazia();
        java.lang.Object[] objArray42 = pilha36.item;
        pilha6.empilha((java.lang.Object) pilha36);
        pilha6.topo = (short) 10;
        int int46 = pilha6.topo;
        java.lang.Object obj47 = pilha6.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = ' ';
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        boolean boolean5 = pilha3.vazia();
        pilha3.topo = 'a';
        int int8 = pilha3.topo;
        boolean boolean9 = pilha3.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        pilha10.item = objArray13;
        int int15 = pilha10.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha19.item = objArray22;
        pilha16.item = objArray22;
        java.lang.Object[] objArray25 = pilha16.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        boolean boolean28 = pilha26.vazia();
        java.lang.Object[] objArray29 = pilha26.item;
        pilha16.item = objArray29;
        pilha10.item = objArray29;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        boolean boolean34 = pilha32.vazia();
        pilha32.topo = 0;
        boolean boolean37 = pilha32.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        boolean boolean40 = pilha38.vazia();
        pilha38.topo = 'a';
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray44 = pilha43.item;
        pilha38.item = objArray44;
        pilha32.item = objArray44;
        int int47 = pilha32.topo;
        java.lang.Object[] objArray48 = pilha32.item;
        pilha10.item = objArray48;
        pilha3.item = objArray48;
        pilha0.item = objArray48;
        int int52 = pilha0.topo;
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = (byte) 0;
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        pilha8.item = objArray11;
        pilha5.item = objArray11;
        java.lang.Object[] objArray14 = pilha5.item;
        java.lang.Object[] objArray15 = pilha5.item;
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        pilha17.topo = '#';
        int int21 = pilha17.topo;
        int int22 = pilha17.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1.0d };
        pilha25.item = objArray27;
        pilha23.item = objArray27;
        pilha17.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1.0d };
        pilha35.item = objArray37;
        java.lang.Object[] objArray39 = pilha35.item;
        pilha33.item = objArray39;
        pilha31.item = objArray39;
        java.lang.Object[] objArray42 = pilha31.item;
        pilha23.empilha((java.lang.Object) pilha31);
        java.lang.Object[] objArray44 = pilha23.item;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray46 = pilha45.item;
        boolean boolean47 = pilha45.vazia();
        int int48 = pilha45.tamanho();
        java.lang.Object[] objArray49 = pilha45.item;
        pilha23.item = objArray49;
        java.lang.Object[] objArray51 = pilha23.item;
        pilha0.empilha((java.lang.Object) pilha23);
        int int53 = pilha0.tamanho();
        boolean boolean54 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 1;
        java.lang.Object obj8 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        pilha11.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha19.item = objArray22;
        int int24 = pilha19.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        boolean boolean27 = pilha25.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha25.item = objArray31;
        java.lang.Object[] objArray34 = pilha25.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        java.lang.Object[] objArray38 = pilha35.item;
        pilha25.item = objArray38;
        pilha19.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        boolean boolean43 = pilha41.vazia();
        pilha41.topo = 0;
        boolean boolean46 = pilha41.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        boolean boolean49 = pilha47.vazia();
        pilha47.topo = 'a';
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray53 = pilha52.item;
        pilha47.item = objArray53;
        pilha41.item = objArray53;
        int int56 = pilha41.topo;
        java.lang.Object[] objArray57 = pilha41.item;
        pilha19.item = objArray57;
        boolean boolean59 = pilha19.vazia();
        int int60 = pilha19.tamanho();
        java.lang.Object[] objArray61 = pilha19.item;
        pilha11.item = objArray61;
        pilha0.item = objArray61;
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1.0d };
        pilha64.item = objArray66;
        boolean boolean68 = pilha64.vazia();
        pilha64.topo = (byte) 10;
        java.lang.Object[] objArray71 = pilha64.item;
        java.lang.Object[] objArray72 = pilha64.item;
        pilha0.item = objArray72;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1.0]");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 32;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1.0d };
        pilha11.item = objArray13;
        java.lang.Object[] objArray15 = pilha11.item;
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        pilha19.topo = '#';
        int int23 = pilha19.topo;
        int int24 = pilha19.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1.0d };
        pilha27.item = objArray29;
        pilha25.item = objArray29;
        pilha19.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1.0d };
        pilha37.item = objArray39;
        java.lang.Object[] objArray41 = pilha37.item;
        pilha35.item = objArray41;
        pilha33.item = objArray41;
        java.lang.Object[] objArray44 = pilha33.item;
        pilha25.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        pilha46.topo = '#';
        int int50 = pilha46.topo;
        int int51 = pilha46.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 1.0d };
        pilha54.item = objArray56;
        pilha52.item = objArray56;
        pilha46.empilha((java.lang.Object) pilha52);
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        java.lang.Object[] objArray63 = pilha62.item;
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1.0d };
        pilha64.item = objArray66;
        java.lang.Object[] objArray68 = pilha64.item;
        pilha62.item = objArray68;
        pilha60.item = objArray68;
        java.lang.Object[] objArray71 = pilha60.item;
        pilha52.empilha((java.lang.Object) pilha60);
        pilha33.empilha((java.lang.Object) pilha60);
        pilha0.empilha((java.lang.Object) pilha33);
        int int75 = pilha0.tamanho();
        java.lang.Object[] objArray76 = pilha0.item;
        boolean boolean77 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1.0]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 34 + "'", int75 == 34);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = 'a';
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 0;
        boolean boolean19 = pilha14.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha20.item = objArray23;
        pilha14.item = objArray23;
        pilha0.item = objArray23;
        int int27 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        pilha0.topo = 35;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        int int19 = pilha14.topo;
        java.lang.Object[] objArray20 = pilha14.item;
        boolean boolean21 = pilha14.vazia();
        boolean boolean22 = pilha14.vazia();
        int int23 = pilha14.topo;
        java.lang.Object obj24 = pilha14.desempilha();
        java.lang.Object[] objArray25 = pilha14.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        boolean boolean28 = pilha26.vazia();
        pilha26.topo = 'a';
        boolean boolean31 = pilha26.vazia();
        pilha26.topo = (byte) 100;
        pilha26.topo = 100;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha39.item = objArray42;
        pilha36.item = objArray42;
        java.lang.Object[] objArray45 = pilha36.item;
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        boolean boolean48 = pilha46.vazia();
        java.lang.Object[] objArray49 = pilha46.item;
        pilha36.item = objArray49;
        java.lang.Object[] objArray51 = pilha36.item;
        pilha26.empilha((java.lang.Object) pilha36);
        java.lang.Object[] objArray53 = pilha36.item;
        pilha14.empilha((java.lang.Object) pilha36);
        pilha0.empilha((java.lang.Object) pilha36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = 'a';
        java.lang.Object obj13 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        java.lang.Object[] objArray13 = pilha10.item;
        pilha0.item = objArray13;
        pilha0.topo = (short) -1;
        java.lang.Object[] objArray17 = pilha0.item;
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int5 = pilha0.tamanho();
        java.lang.Object obj6 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = pilha0.item;
        boolean boolean17 = pilha0.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        boolean boolean20 = pilha18.vazia();
        pilha18.topo = 'a';
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        pilha18.item = objArray24;
        int int26 = pilha18.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha30.item = objArray33;
        pilha27.item = objArray33;
        int int36 = pilha27.topo;
        java.lang.Object[] objArray37 = pilha27.item;
        pilha18.item = objArray37;
        java.lang.Object[] objArray39 = pilha18.item;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        int int19 = pilha14.topo;
        java.lang.Object[] objArray20 = pilha14.item;
        boolean boolean21 = pilha14.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha22.item = objArray31;
        pilha14.item = objArray31;
        pilha6.item = objArray31;
        pilha0.item = objArray31;
        int int37 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        java.lang.Object[] objArray6 = pilha2.item;
        pilha0.item = objArray6;
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray11 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 32;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1.0d };
        pilha11.item = objArray13;
        java.lang.Object[] objArray15 = pilha11.item;
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        pilha19.topo = '#';
        int int23 = pilha19.topo;
        int int24 = pilha19.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1.0d };
        pilha27.item = objArray29;
        pilha25.item = objArray29;
        pilha19.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1.0d };
        pilha37.item = objArray39;
        java.lang.Object[] objArray41 = pilha37.item;
        pilha35.item = objArray41;
        pilha33.item = objArray41;
        java.lang.Object[] objArray44 = pilha33.item;
        pilha25.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        pilha46.topo = '#';
        int int50 = pilha46.topo;
        int int51 = pilha46.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 1.0d };
        pilha54.item = objArray56;
        pilha52.item = objArray56;
        pilha46.empilha((java.lang.Object) pilha52);
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        java.lang.Object[] objArray63 = pilha62.item;
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1.0d };
        pilha64.item = objArray66;
        java.lang.Object[] objArray68 = pilha64.item;
        pilha62.item = objArray68;
        pilha60.item = objArray68;
        java.lang.Object[] objArray71 = pilha60.item;
        pilha52.empilha((java.lang.Object) pilha60);
        pilha33.empilha((java.lang.Object) pilha60);
        pilha0.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha75 = new ds.Pilha();
        int int76 = pilha75.topo;
        boolean boolean77 = pilha75.vazia();
        pilha75.topo = 'a';
        ds.Pilha pilha80 = new ds.Pilha();
        java.lang.Object[] objArray81 = pilha80.item;
        pilha75.item = objArray81;
        int int83 = pilha75.tamanho();
        ds.Pilha pilha84 = new ds.Pilha();
        int int85 = pilha84.topo;
        boolean boolean86 = pilha84.vazia();
        ds.Pilha pilha87 = new ds.Pilha();
        java.lang.Object[] objArray88 = pilha87.item;
        ds.Pilha pilha89 = new ds.Pilha();
        java.lang.Object[] objArray90 = pilha89.item;
        pilha87.item = objArray90;
        pilha84.item = objArray90;
        int int93 = pilha84.topo;
        java.lang.Object[] objArray94 = pilha84.item;
        pilha75.item = objArray94;
        java.lang.Object[] objArray96 = pilha75.item;
        pilha0.empilha((java.lang.Object) objArray96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1.0]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object obj18 = pilha0.desempilha();
        pilha0.topo = 'a';
        java.lang.Object[] objArray21 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = (byte) 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 0;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha0.item = objArray16;
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        int int14 = pilha9.topo;
        java.lang.Object[] objArray15 = pilha9.item;
        java.lang.Object[] objArray16 = pilha9.item;
        pilha0.item = objArray16;
        java.lang.Object obj18 = pilha0.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        pilha19.topo = '#';
        int int23 = pilha19.topo;
        int int24 = pilha19.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1.0d };
        pilha27.item = objArray29;
        pilha25.item = objArray29;
        pilha19.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1.0d };
        pilha37.item = objArray39;
        java.lang.Object[] objArray41 = pilha37.item;
        pilha35.item = objArray41;
        pilha33.item = objArray41;
        java.lang.Object[] objArray44 = pilha33.item;
        pilha25.empilha((java.lang.Object) pilha33);
        pilha0.empilha((java.lang.Object) pilha33);
        java.lang.Class<?> wildcardClass47 = pilha33.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha11.item = objArray14;
        pilha8.item = objArray14;
        int int17 = pilha8.topo;
        java.lang.Object[] objArray18 = pilha8.item;
        pilha0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = (short) 0;
        java.lang.Object obj5 = null;
        pilha0.empilha(obj5);
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = (byte) 100;
        int int16 = pilha8.topo;
        java.lang.Object obj17 = pilha8.desempilha();
        java.lang.Object obj18 = pilha8.desempilha();
        boolean boolean19 = pilha8.vazia();
        java.lang.Object[] objArray20 = pilha8.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        boolean boolean23 = pilha21.vazia();
        pilha21.topo = 'a';
        int int26 = pilha21.topo;
        java.lang.Object obj27 = pilha21.desempilha();
        int int28 = pilha21.tamanho();
        java.lang.Object[] objArray29 = pilha21.item;
        pilha8.item = objArray29;
        pilha0.empilha((java.lang.Object) pilha8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 96 + "'", int28 == 96);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray22 = pilha11.item;
        int int23 = pilha11.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        pilha0.topo = 35;
        pilha0.topo = 100;
        int int12 = pilha0.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 'a';
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        pilha13.item = objArray19;
        java.lang.Object obj21 = pilha13.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 'a';
        int int27 = pilha22.topo;
        java.lang.Object[] objArray28 = pilha22.item;
        java.lang.Object[] objArray29 = pilha22.item;
        pilha13.item = objArray29;
        java.lang.Object obj31 = pilha13.desempilha();
        pilha0.empilha((java.lang.Object) pilha13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        pilha6.topo = (byte) 0;
        java.lang.Object[] objArray10 = pilha6.item;
        pilha0.item = objArray10;
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        java.lang.Object[] objArray12 = pilha10.item;
        boolean boolean13 = pilha10.vazia();
        pilha10.topo = (short) 10;
        int int16 = pilha10.tamanho();
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1.0d };
        pilha9.item = objArray11;
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1.0d };
        pilha16.item = objArray18;
        java.lang.Object[] objArray20 = pilha16.item;
        pilha14.item = objArray20;
        pilha0.item = objArray20;
        java.lang.Class<?> wildcardClass23 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        pilha18.item = objArray20;
        java.lang.Object[] objArray22 = pilha18.item;
        pilha16.item = objArray22;
        pilha14.item = objArray22;
        java.lang.Object[] objArray25 = pilha14.item;
        pilha6.empilha((java.lang.Object) pilha14);
        java.lang.Object[] objArray27 = pilha6.item;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        boolean boolean30 = pilha28.vazia();
        int int31 = pilha28.tamanho();
        java.lang.Object[] objArray32 = pilha28.item;
        pilha6.item = objArray32;
        int int34 = pilha6.topo;
        java.lang.Object[] objArray35 = pilha6.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 0;
        boolean boolean41 = pilha36.vazia();
        java.lang.Object[] objArray42 = pilha36.item;
        pilha6.empilha((java.lang.Object) pilha36);
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        boolean boolean46 = pilha44.vazia();
        pilha44.topo = 'a';
        int int49 = pilha44.topo;
        java.lang.Object obj50 = pilha44.desempilha();
        int int51 = pilha44.tamanho();
        java.lang.Object[] objArray52 = pilha44.item;
        pilha6.item = objArray52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 96 + "'", int51 == 96);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        boolean boolean4 = pilha2.vazia();
        pilha2.topo = 'a';
        pilha0.empilha((java.lang.Object) 'a');
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = 'a';
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        pilha14.item = objArray17;
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        boolean boolean25 = pilha20.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1.0d };
        pilha26.item = objArray28;
        pilha20.empilha((java.lang.Object) pilha26);
        pilha14.empilha((java.lang.Object) pilha26);
        java.lang.Object[] objArray32 = pilha26.item;
        pilha0.item = objArray32;
        boolean boolean34 = pilha0.vazia();
        pilha0.topo = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        pilha0.topo = 98;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = (byte) 0;
        pilha0.topo = (byte) 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        int int11 = pilha6.topo;
        java.lang.Object[] objArray12 = pilha6.item;
        int int13 = pilha6.tamanho();
        java.lang.Object[] objArray14 = pilha6.item;
        pilha6.topo = 32;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1.0d };
        pilha17.item = objArray19;
        java.lang.Object[] objArray21 = pilha17.item;
        int int22 = pilha17.topo;
        java.lang.Object[] objArray23 = pilha17.item;
        pilha6.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        pilha25.topo = '#';
        int int29 = pilha25.topo;
        int int30 = pilha25.topo;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1.0d };
        pilha33.item = objArray35;
        pilha31.item = objArray35;
        pilha25.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1.0d };
        pilha43.item = objArray45;
        java.lang.Object[] objArray47 = pilha43.item;
        pilha41.item = objArray47;
        pilha39.item = objArray47;
        java.lang.Object[] objArray50 = pilha39.item;
        pilha31.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        pilha52.topo = '#';
        int int56 = pilha52.topo;
        int int57 = pilha52.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 1.0d };
        pilha60.item = objArray62;
        pilha58.item = objArray62;
        pilha52.empilha((java.lang.Object) pilha58);
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        java.lang.Object[] objArray69 = pilha68.item;
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray72 = new java.lang.Object[] { 1.0d };
        pilha70.item = objArray72;
        java.lang.Object[] objArray74 = pilha70.item;
        pilha68.item = objArray74;
        pilha66.item = objArray74;
        java.lang.Object[] objArray77 = pilha66.item;
        pilha58.empilha((java.lang.Object) pilha66);
        pilha39.empilha((java.lang.Object) pilha66);
        pilha6.empilha((java.lang.Object) pilha39);
        int int81 = pilha6.tamanho();
        java.lang.Object[] objArray82 = pilha6.item;
        pilha0.item = objArray82;
        int int84 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 34 + "'", int81 == 34);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        pilha10.topo = (byte) 0;
        int int17 = pilha10.topo;
        pilha0.empilha((java.lang.Object) int17);
        int int19 = pilha0.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha20.item = objArray26;
        java.lang.Object obj28 = pilha20.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        pilha29.topo = (byte) 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        pilha29.item = objArray35;
        pilha20.item = objArray35;
        pilha0.item = objArray35;
        boolean boolean39 = pilha0.vazia();
        pilha0.topo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        int int14 = pilha9.topo;
        java.lang.Object[] objArray15 = pilha9.item;
        boolean boolean16 = pilha9.vazia();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = (byte) -1;
        int int20 = pilha9.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        boolean boolean23 = pilha21.vazia();
        pilha21.topo = 0;
        boolean boolean26 = pilha21.vazia();
        int int27 = pilha21.tamanho();
        java.lang.Object[] objArray28 = pilha21.item;
        pilha9.item = objArray28;
        pilha0.empilha((java.lang.Object) pilha9);
        int int31 = pilha0.tamanho();
        java.lang.Object[] objArray32 = pilha0.item;
        int int33 = pilha0.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        boolean boolean36 = pilha34.vazia();
        pilha34.topo = 'a';
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        pilha34.item = objArray40;
        java.lang.Object obj42 = pilha34.desempilha();
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        boolean boolean45 = pilha43.vazia();
        pilha43.topo = 'a';
        int int48 = pilha43.topo;
        java.lang.Object[] objArray49 = pilha43.item;
        java.lang.Object[] objArray50 = pilha43.item;
        pilha34.item = objArray50;
        pilha34.topo = 35;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        pilha54.topo = '#';
        int int58 = pilha54.topo;
        int int59 = pilha54.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        java.lang.Object[] objArray64 = new java.lang.Object[] { 1.0d };
        pilha62.item = objArray64;
        pilha60.item = objArray64;
        pilha54.empilha((java.lang.Object) pilha60);
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray71 = pilha70.item;
        ds.Pilha pilha72 = new ds.Pilha();
        java.lang.Object[] objArray74 = new java.lang.Object[] { 1.0d };
        pilha72.item = objArray74;
        java.lang.Object[] objArray76 = pilha72.item;
        pilha70.item = objArray76;
        pilha68.item = objArray76;
        java.lang.Object[] objArray79 = pilha68.item;
        pilha60.empilha((java.lang.Object) pilha68);
        java.lang.Object[] objArray81 = pilha60.item;
        ds.Pilha pilha82 = new ds.Pilha();
        java.lang.Object[] objArray83 = pilha82.item;
        boolean boolean84 = pilha82.vazia();
        int int85 = pilha82.tamanho();
        java.lang.Object[] objArray86 = pilha82.item;
        pilha60.item = objArray86;
        int int88 = pilha60.topo;
        java.lang.Object[] objArray89 = pilha60.item;
        pilha34.empilha((java.lang.Object) objArray89);
        pilha0.empilha((java.lang.Object) objArray89);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1.0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[1.0]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        int int19 = pilha14.topo;
        java.lang.Object[] objArray20 = pilha14.item;
        boolean boolean21 = pilha14.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha22.item = objArray31;
        pilha14.item = objArray31;
        pilha6.item = objArray31;
        pilha0.item = objArray31;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray38 = pilha37.item;
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        pilha37.item = objArray40;
        java.lang.Object[] objArray42 = pilha37.item;
        pilha0.empilha((java.lang.Object) pilha37);
        boolean boolean44 = pilha0.vazia();
        int int45 = pilha0.tamanho();
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        boolean boolean48 = pilha46.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray50 = pilha49.item;
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray52 = pilha51.item;
        pilha49.item = objArray52;
        pilha46.item = objArray52;
        java.lang.Object[] objArray55 = pilha46.item;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        boolean boolean58 = pilha56.vazia();
        java.lang.Object[] objArray59 = pilha56.item;
        pilha46.item = objArray59;
        java.lang.Object[] objArray61 = pilha46.item;
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.topo;
        pilha62.topo = '#';
        int int66 = pilha62.topo;
        int int67 = pilha62.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray72 = new java.lang.Object[] { 1.0d };
        pilha70.item = objArray72;
        pilha68.item = objArray72;
        pilha62.empilha((java.lang.Object) pilha68);
        ds.Pilha pilha76 = new ds.Pilha();
        int int77 = pilha76.topo;
        ds.Pilha pilha78 = new ds.Pilha();
        java.lang.Object[] objArray79 = pilha78.item;
        ds.Pilha pilha80 = new ds.Pilha();
        java.lang.Object[] objArray82 = new java.lang.Object[] { 1.0d };
        pilha80.item = objArray82;
        java.lang.Object[] objArray84 = pilha80.item;
        pilha78.item = objArray84;
        pilha76.item = objArray84;
        java.lang.Object[] objArray87 = pilha76.item;
        pilha68.empilha((java.lang.Object) pilha76);
        pilha46.empilha((java.lang.Object) pilha68);
        pilha0.empilha((java.lang.Object) pilha68);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 35 + "'", int67 == 35);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[1.0]");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[1.0]");
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[1.0]");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha12.item = objArray15;
        pilha9.item = objArray15;
        boolean boolean18 = pilha9.vazia();
        int int19 = pilha9.tamanho();
        java.lang.Object[] objArray20 = pilha9.item;
        pilha0.item = objArray20;
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1.0d };
        pilha9.item = objArray11;
        java.lang.Object[] objArray13 = pilha9.item;
        pilha7.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Object[] objArray16 = pilha0.item;
        boolean boolean17 = pilha0.vazia();
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 0;
        boolean boolean15 = pilha10.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        pilha16.item = objArray19;
        pilha10.item = objArray19;
        java.lang.Object[] objArray22 = pilha10.item;
        pilha0.item = objArray22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        pilha5.topo = '#';
        int int9 = pilha5.topo;
        int int10 = pilha5.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1.0d };
        pilha13.item = objArray15;
        pilha11.item = objArray15;
        pilha5.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1.0d };
        pilha23.item = objArray25;
        java.lang.Object[] objArray27 = pilha23.item;
        pilha21.item = objArray27;
        pilha19.item = objArray27;
        java.lang.Object[] objArray30 = pilha19.item;
        pilha11.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray32 = pilha11.item;
        boolean boolean33 = pilha11.vazia();
        java.lang.Object[] objArray34 = pilha11.item;
        pilha0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        pilha0.topo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object[] objArray18 = pilha12.item;
        pilha12.topo = '4';
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        boolean boolean23 = pilha21.vazia();
        pilha21.topo = 0;
        boolean boolean26 = pilha21.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha27.item = objArray30;
        pilha21.item = objArray30;
        java.lang.Object[] objArray33 = pilha21.item;
        pilha12.item = objArray33;
        java.lang.Object obj35 = pilha12.desempilha();
        java.lang.Object obj36 = pilha12.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0d };
        pilha14.item = objArray16;
        java.lang.Object[] objArray18 = pilha14.item;
        pilha12.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        java.lang.Object[] objArray22 = pilha20.item;
        pilha12.item = objArray22;
        pilha0.item = objArray22;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 0;
        boolean boolean13 = pilha8.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        pilha14.item = objArray20;
        pilha8.item = objArray20;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        boolean boolean26 = pilha23.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        pilha27.topo = 'a';
        boolean boolean32 = pilha27.vazia();
        pilha27.topo = (byte) 100;
        int int35 = pilha27.topo;
        pilha23.empilha((java.lang.Object) pilha27);
        int int37 = pilha23.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1.0d };
        pilha42.item = objArray44;
        java.lang.Object[] objArray46 = pilha42.item;
        pilha40.item = objArray46;
        pilha38.item = objArray46;
        java.lang.Object[] objArray49 = pilha38.item;
        pilha23.item = objArray49;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        pilha51.topo = '#';
        int int55 = pilha51.topo;
        int int56 = pilha51.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        ds.Pilha pilha59 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 1.0d };
        pilha59.item = objArray61;
        pilha57.item = objArray61;
        pilha51.empilha((java.lang.Object) pilha57);
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        ds.Pilha pilha69 = new ds.Pilha();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 1.0d };
        pilha69.item = objArray71;
        java.lang.Object[] objArray73 = pilha69.item;
        pilha67.item = objArray73;
        pilha65.item = objArray73;
        java.lang.Object[] objArray76 = pilha65.item;
        pilha57.empilha((java.lang.Object) pilha65);
        java.lang.Object[] objArray78 = pilha57.item;
        pilha23.item = objArray78;
        pilha8.item = objArray78;
        pilha0.item = objArray78;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1.0]");
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        int int9 = pilha4.topo;
        java.lang.Object[] objArray10 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        pilha4.topo = 0;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        int int16 = pilha14.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 'a';
        int int22 = pilha17.topo;
        boolean boolean23 = pilha17.vazia();
        pilha17.topo = (-1);
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        pilha26.topo = (byte) 0;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray32 = pilha30.item;
        pilha26.item = objArray32;
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray35 = pilha34.item;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray37 = pilha36.item;
        pilha34.item = objArray37;
        int int39 = pilha34.tamanho();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        boolean boolean42 = pilha40.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray44 = pilha43.item;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray46 = pilha45.item;
        pilha43.item = objArray46;
        pilha40.item = objArray46;
        java.lang.Object[] objArray49 = pilha40.item;
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.topo;
        boolean boolean52 = pilha50.vazia();
        java.lang.Object[] objArray53 = pilha50.item;
        pilha40.item = objArray53;
        pilha34.item = objArray53;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        boolean boolean58 = pilha56.vazia();
        pilha56.topo = 0;
        boolean boolean61 = pilha56.vazia();
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.topo;
        boolean boolean64 = pilha62.vazia();
        pilha62.topo = 'a';
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        pilha62.item = objArray68;
        pilha56.item = objArray68;
        int int71 = pilha56.topo;
        java.lang.Object[] objArray72 = pilha56.item;
        pilha34.item = objArray72;
        pilha26.item = objArray72;
        pilha17.item = objArray72;
        pilha14.item = objArray72;
        pilha4.empilha((java.lang.Object) pilha14);
        pilha4.topo = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        pilha3.topo = '#';
        boolean boolean7 = pilha3.vazia();
        boolean boolean8 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) boolean8);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        pilha10.topo = (byte) 0;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray16 = pilha14.item;
        pilha10.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        pilha18.item = objArray21;
        int int23 = pilha18.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        boolean boolean26 = pilha24.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha27.item = objArray30;
        pilha24.item = objArray30;
        java.lang.Object[] objArray33 = pilha24.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        boolean boolean36 = pilha34.vazia();
        java.lang.Object[] objArray37 = pilha34.item;
        pilha24.item = objArray37;
        pilha18.item = objArray37;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        boolean boolean42 = pilha40.vazia();
        pilha40.topo = 0;
        boolean boolean45 = pilha40.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        boolean boolean48 = pilha46.vazia();
        pilha46.topo = 'a';
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray52 = pilha51.item;
        pilha46.item = objArray52;
        pilha40.item = objArray52;
        int int55 = pilha40.topo;
        java.lang.Object[] objArray56 = pilha40.item;
        pilha18.item = objArray56;
        pilha10.item = objArray56;
        pilha0.item = objArray56;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        int int13 = pilha8.topo;
        java.lang.Object[] objArray14 = pilha8.item;
        int int15 = pilha8.tamanho();
        java.lang.Object[] objArray16 = pilha8.item;
        boolean boolean17 = pilha8.vazia();
        java.lang.Object[] objArray18 = pilha8.item;
        pilha0.item = objArray18;
        int int20 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        int int19 = pilha14.topo;
        java.lang.Object[] objArray20 = pilha14.item;
        boolean boolean21 = pilha14.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha22.item = objArray31;
        pilha14.item = objArray31;
        pilha6.item = objArray31;
        pilha0.item = objArray31;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray38 = pilha37.item;
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        pilha37.item = objArray40;
        java.lang.Object[] objArray42 = pilha37.item;
        pilha0.empilha((java.lang.Object) pilha37);
        boolean boolean44 = pilha0.vazia();
        int int45 = pilha0.tamanho();
        int int46 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        java.lang.Object[] objArray6 = pilha2.item;
        pilha0.item = objArray6;
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha13.item = objArray16;
        pilha10.item = objArray16;
        java.lang.Object[] objArray19 = pilha10.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        java.lang.Object[] objArray23 = pilha20.item;
        pilha10.item = objArray23;
        java.lang.Object[] objArray25 = pilha10.item;
        pilha0.empilha((java.lang.Object) pilha10);
        int int27 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha5.topo = 'a';
        pilha5.topo = (byte) 0;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0d };
        pilha14.item = objArray16;
        java.lang.Object[] objArray18 = pilha14.item;
        pilha12.item = objArray18;
        pilha5.item = objArray18;
        pilha0.item = objArray18;
        boolean boolean22 = pilha0.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1.0d };
        pilha23.item = objArray25;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1.0d };
        pilha27.item = objArray29;
        java.lang.Object[] objArray31 = pilha27.item;
        pilha23.item = objArray31;
        pilha0.item = objArray31;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1.0]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        boolean boolean24 = pilha22.vazia();
        int int25 = pilha22.tamanho();
        java.lang.Object[] objArray26 = pilha22.item;
        pilha11.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        boolean boolean33 = pilha28.vazia();
        java.lang.Class<?> wildcardClass34 = pilha28.getClass();
        pilha22.empilha((java.lang.Object) pilha28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        pilha0.topo = 0;
        pilha0.topo = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        boolean boolean5 = pilha3.vazia();
        pilha3.topo = 0;
        boolean boolean8 = pilha3.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha9.item = objArray15;
        pilha3.item = objArray15;
        pilha0.item = objArray15;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 'a';
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        pilha19.item = objArray25;
        int int27 = pilha19.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1.0d };
        pilha28.item = objArray30;
        pilha19.empilha((java.lang.Object) pilha28);
        int int33 = pilha19.tamanho();
        pilha0.empilha((java.lang.Object) pilha19);
        int int35 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        pilha3.topo = '#';
        boolean boolean7 = pilha3.vazia();
        boolean boolean8 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) boolean8);
        int int10 = pilha0.tamanho();
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha9.item = objArray12;
        pilha6.item = objArray12;
        java.lang.Object[] objArray15 = pilha6.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        java.lang.Object[] objArray19 = pilha16.item;
        pilha6.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha28.item = objArray34;
        pilha22.item = objArray34;
        int int37 = pilha22.topo;
        java.lang.Object[] objArray38 = pilha22.item;
        pilha0.item = objArray38;
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.tamanho();
        java.lang.Object[] objArray42 = pilha0.item;
        boolean boolean43 = pilha0.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 1.0d };
        pilha46.item = objArray48;
        java.lang.Object[] objArray50 = pilha46.item;
        pilha44.item = objArray50;
        pilha0.item = objArray50;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1.0]");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (short) 10;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = (byte) 0;
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        pilha6.topo = (byte) 0;
        int int10 = pilha6.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        pilha14.item = objArray17;
        pilha11.item = objArray17;
        java.lang.Object[] objArray20 = pilha11.item;
        java.lang.Object[] objArray21 = pilha11.item;
        pilha6.empilha((java.lang.Object) pilha11);
        pilha11.topo = 0;
        pilha0.empilha((java.lang.Object) pilha11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.tamanho();
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        java.lang.Object[] objArray6 = pilha4.item;
        boolean boolean7 = pilha4.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = (byte) 100;
        int int16 = pilha8.topo;
        pilha4.empilha((java.lang.Object) pilha8);
        int int18 = pilha4.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1.0d };
        pilha23.item = objArray25;
        java.lang.Object[] objArray27 = pilha23.item;
        pilha21.item = objArray27;
        pilha19.item = objArray27;
        java.lang.Object[] objArray30 = pilha19.item;
        pilha4.item = objArray30;
        int int32 = pilha4.tamanho();
        pilha0.empilha((java.lang.Object) int32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        pilha0.item = objArray4;
        boolean boolean7 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        pilha0.item = objArray4;
        pilha0.topo = '4';
        pilha0.topo = 97;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha12.item = objArray15;
        pilha9.item = objArray15;
        int int18 = pilha9.topo;
        java.lang.Object[] objArray19 = pilha9.item;
        pilha0.item = objArray19;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        pilha0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1.0]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha5.topo = 'a';
        pilha5.topo = (byte) 0;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0d };
        pilha14.item = objArray16;
        java.lang.Object[] objArray18 = pilha14.item;
        pilha12.item = objArray18;
        pilha5.item = objArray18;
        pilha0.item = objArray18;
        boolean boolean22 = pilha0.vazia();
        pilha0.topo = (short) 0;
        boolean boolean25 = pilha0.vazia();
        pilha0.topo = 34;
        java.lang.Object[] objArray28 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) 1;
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 35);
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        boolean boolean19 = pilha14.vazia();
        pilha14.topo = (byte) 100;
        int int22 = pilha14.topo;
        java.lang.Object obj23 = pilha14.desempilha();
        java.lang.Object obj24 = pilha14.desempilha();
        pilha14.topo = '#';
        java.lang.Object[] objArray27 = pilha14.item;
        pilha0.item = objArray27;
        pilha0.topo = 'a';
        boolean boolean31 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 35 + "'", obj13, 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        pilha13.topo = '#';
        int int17 = pilha13.topo;
        int int18 = pilha13.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        pilha19.item = objArray23;
        pilha13.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1.0d };
        pilha31.item = objArray33;
        java.lang.Object[] objArray35 = pilha31.item;
        pilha29.item = objArray35;
        pilha27.item = objArray35;
        java.lang.Object[] objArray38 = pilha27.item;
        pilha19.empilha((java.lang.Object) pilha27);
        java.lang.Object[] objArray40 = pilha19.item;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        boolean boolean43 = pilha41.vazia();
        int int44 = pilha41.tamanho();
        java.lang.Object[] objArray45 = pilha41.item;
        pilha19.item = objArray45;
        pilha0.empilha((java.lang.Object) pilha19);
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        pilha6.topo = (byte) 0;
        java.lang.Object[] objArray10 = pilha6.item;
        pilha0.item = objArray10;
        pilha0.topo = (-1);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        pilha14.topo = (byte) 0;
        int int21 = pilha14.tamanho();
        java.lang.Object[] objArray22 = pilha14.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = (byte) 10;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha5.topo = 'a';
        pilha5.topo = (byte) 0;
        java.lang.Object[] objArray12 = pilha5.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        pilha13.topo = '#';
        int int17 = pilha13.topo;
        int int18 = pilha13.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        pilha19.item = objArray23;
        pilha13.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1.0d };
        pilha31.item = objArray33;
        java.lang.Object[] objArray35 = pilha31.item;
        pilha29.item = objArray35;
        pilha27.item = objArray35;
        java.lang.Object[] objArray38 = pilha27.item;
        pilha19.empilha((java.lang.Object) pilha27);
        java.lang.Object[] objArray40 = pilha19.item;
        pilha5.item = objArray40;
        boolean boolean42 = pilha5.vazia();
        boolean boolean43 = pilha5.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1.0d };
        pilha44.item = objArray46;
        boolean boolean48 = pilha44.vazia();
        pilha44.topo = (byte) 10;
        pilha44.topo = 96;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        boolean boolean55 = pilha53.vazia();
        pilha53.topo = 'a';
        pilha53.topo = (byte) 0;
        java.lang.Object[] objArray60 = pilha53.item;
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.topo;
        pilha61.topo = '#';
        int int65 = pilha61.topo;
        int int66 = pilha61.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.topo;
        ds.Pilha pilha69 = new ds.Pilha();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 1.0d };
        pilha69.item = objArray71;
        pilha67.item = objArray71;
        pilha61.empilha((java.lang.Object) pilha67);
        ds.Pilha pilha75 = new ds.Pilha();
        int int76 = pilha75.topo;
        ds.Pilha pilha77 = new ds.Pilha();
        java.lang.Object[] objArray78 = pilha77.item;
        ds.Pilha pilha79 = new ds.Pilha();
        java.lang.Object[] objArray81 = new java.lang.Object[] { 1.0d };
        pilha79.item = objArray81;
        java.lang.Object[] objArray83 = pilha79.item;
        pilha77.item = objArray83;
        pilha75.item = objArray83;
        java.lang.Object[] objArray86 = pilha75.item;
        pilha67.empilha((java.lang.Object) pilha75);
        java.lang.Object[] objArray88 = pilha67.item;
        pilha53.item = objArray88;
        pilha44.item = objArray88;
        pilha5.empilha((java.lang.Object) objArray88);
        pilha0.empilha((java.lang.Object) objArray88);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[1.0]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[1.0]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[1.0]");
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        pilha13.topo = '#';
        int int17 = pilha13.topo;
        int int18 = pilha13.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1.0d };
        pilha21.item = objArray23;
        pilha19.item = objArray23;
        pilha13.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1.0d };
        pilha31.item = objArray33;
        java.lang.Object[] objArray35 = pilha31.item;
        pilha29.item = objArray35;
        pilha27.item = objArray35;
        java.lang.Object[] objArray38 = pilha27.item;
        pilha19.empilha((java.lang.Object) pilha27);
        java.lang.Object[] objArray40 = pilha19.item;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        boolean boolean43 = pilha41.vazia();
        int int44 = pilha41.tamanho();
        java.lang.Object[] objArray45 = pilha41.item;
        pilha19.item = objArray45;
        pilha0.empilha((java.lang.Object) pilha19);
        int int48 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 99 + "'", int48 == 99);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 0;
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 'a';
        int int18 = pilha13.topo;
        java.lang.Object[] objArray19 = pilha13.item;
        boolean boolean20 = pilha13.vazia();
        boolean boolean21 = pilha13.vazia();
        int int22 = pilha13.topo;
        java.lang.Object obj23 = pilha13.desempilha();
        java.lang.Object[] objArray24 = pilha13.item;
        pilha0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.topo = (byte) 0;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        pilha11.topo = '#';
        int int15 = pilha11.topo;
        int int16 = pilha11.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1.0d };
        pilha19.item = objArray21;
        pilha17.item = objArray21;
        pilha11.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 1.0d };
        pilha29.item = objArray31;
        java.lang.Object[] objArray33 = pilha29.item;
        pilha27.item = objArray33;
        pilha25.item = objArray33;
        java.lang.Object[] objArray36 = pilha25.item;
        pilha17.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray38 = pilha17.item;
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        boolean boolean41 = pilha39.vazia();
        int int42 = pilha39.tamanho();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha17.item = objArray43;
        java.lang.Object[] objArray45 = pilha17.item;
        java.lang.Object obj46 = pilha17.desempilha();
        pilha17.topo = 0;
        int int49 = pilha17.tamanho();
        pilha17.topo = (byte) 1;
        pilha0.empilha((java.lang.Object) pilha17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 'a';
        boolean boolean9 = pilha4.vazia();
        pilha4.topo = (byte) 100;
        int int12 = pilha4.topo;
        pilha0.empilha((java.lang.Object) pilha4);
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1.0d };
        pilha15.item = objArray17;
        pilha15.topo = 1;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        pilha21.topo = (byte) 0;
        java.lang.Object[] objArray25 = pilha21.item;
        pilha15.item = objArray25;
        pilha0.item = objArray25;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        pilha28.topo = '#';
        int int32 = pilha28.topo;
        int int33 = pilha28.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 1.0d };
        pilha36.item = objArray38;
        pilha34.item = objArray38;
        pilha28.empilha((java.lang.Object) pilha34);
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 1.0d };
        pilha46.item = objArray48;
        java.lang.Object[] objArray50 = pilha46.item;
        pilha44.item = objArray50;
        pilha42.item = objArray50;
        java.lang.Object[] objArray53 = pilha42.item;
        pilha34.empilha((java.lang.Object) pilha42);
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        pilha55.topo = '#';
        int int59 = pilha55.topo;
        int int60 = pilha55.topo;
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.topo;
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray65 = new java.lang.Object[] { 1.0d };
        pilha63.item = objArray65;
        pilha61.item = objArray65;
        pilha55.empilha((java.lang.Object) pilha61);
        ds.Pilha pilha69 = new ds.Pilha();
        int int70 = pilha69.topo;
        ds.Pilha pilha71 = new ds.Pilha();
        java.lang.Object[] objArray72 = pilha71.item;
        ds.Pilha pilha73 = new ds.Pilha();
        java.lang.Object[] objArray75 = new java.lang.Object[] { 1.0d };
        pilha73.item = objArray75;
        java.lang.Object[] objArray77 = pilha73.item;
        pilha71.item = objArray77;
        pilha69.item = objArray77;
        java.lang.Object[] objArray80 = pilha69.item;
        pilha61.empilha((java.lang.Object) pilha69);
        pilha42.empilha((java.lang.Object) pilha69);
        boolean boolean83 = pilha69.vazia();
        ds.Pilha pilha84 = new ds.Pilha();
        int int85 = pilha84.topo;
        ds.Pilha pilha86 = new ds.Pilha();
        java.lang.Object[] objArray87 = pilha86.item;
        ds.Pilha pilha88 = new ds.Pilha();
        java.lang.Object[] objArray90 = new java.lang.Object[] { 1.0d };
        pilha88.item = objArray90;
        java.lang.Object[] objArray92 = pilha88.item;
        pilha86.item = objArray92;
        pilha84.item = objArray92;
        pilha69.item = objArray92;
        pilha0.item = objArray92;
        int int97 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[1.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[1.0]");
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[1.0]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        pilha3.topo = '#';
        boolean boolean7 = pilha3.vazia();
        boolean boolean8 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) boolean8);
        int int10 = pilha0.topo;
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object obj9 = pilha0.desempilha();
        pilha0.topo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        int int15 = pilha10.topo;
        java.lang.Object[] objArray16 = pilha10.item;
        int int17 = pilha10.tamanho();
        java.lang.Object[] objArray18 = pilha10.item;
        pilha10.topo = 32;
        java.lang.Object[] objArray21 = pilha10.item;
        pilha0.item = objArray21;
        int int23 = pilha0.topo;
        boolean boolean24 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 32;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1.0d };
        pilha11.item = objArray13;
        java.lang.Object[] objArray15 = pilha11.item;
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        pilha19.topo = '#';
        int int23 = pilha19.topo;
        int int24 = pilha19.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1.0d };
        pilha27.item = objArray29;
        pilha25.item = objArray29;
        pilha19.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1.0d };
        pilha37.item = objArray39;
        java.lang.Object[] objArray41 = pilha37.item;
        pilha35.item = objArray41;
        pilha33.item = objArray41;
        java.lang.Object[] objArray44 = pilha33.item;
        pilha25.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        pilha46.topo = '#';
        int int50 = pilha46.topo;
        int int51 = pilha46.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 1.0d };
        pilha54.item = objArray56;
        pilha52.item = objArray56;
        pilha46.empilha((java.lang.Object) pilha52);
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        java.lang.Object[] objArray63 = pilha62.item;
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1.0d };
        pilha64.item = objArray66;
        java.lang.Object[] objArray68 = pilha64.item;
        pilha62.item = objArray68;
        pilha60.item = objArray68;
        java.lang.Object[] objArray71 = pilha60.item;
        pilha52.empilha((java.lang.Object) pilha60);
        pilha33.empilha((java.lang.Object) pilha60);
        pilha0.empilha((java.lang.Object) pilha33);
        int int75 = pilha0.tamanho();
        java.lang.Object[] objArray76 = pilha0.item;
        int int77 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1.0]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 34 + "'", int75 == 34);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 34 + "'", int77 == 34);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        java.lang.Object[] objArray6 = pilha2.item;
        pilha0.item = objArray6;
        boolean boolean8 = pilha0.vazia();
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        boolean boolean15 = pilha0.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 0;
        boolean boolean24 = pilha19.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        boolean boolean27 = pilha25.vazia();
        pilha25.topo = 'a';
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha25.item = objArray31;
        pilha19.item = objArray31;
        pilha16.item = objArray31;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        pilha35.topo = 'a';
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        pilha35.item = objArray41;
        int int43 = pilha35.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1.0d };
        pilha44.item = objArray46;
        pilha35.empilha((java.lang.Object) pilha44);
        int int49 = pilha35.tamanho();
        pilha16.empilha((java.lang.Object) pilha35);
        pilha0.empilha((java.lang.Object) pilha35);
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 98 + "'", int49 == 98);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        int int13 = pilha8.topo;
        java.lang.Object[] objArray14 = pilha8.item;
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        pilha8.topo = (byte) -1;
        int int19 = pilha8.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 0;
        boolean boolean25 = pilha20.vazia();
        int int26 = pilha20.tamanho();
        java.lang.Object[] objArray27 = pilha20.item;
        pilha8.item = objArray27;
        pilha0.item = objArray27;
        pilha0.topo = (short) 100;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        boolean boolean34 = pilha32.vazia();
        pilha32.topo = 'a';
        int int37 = pilha32.topo;
        java.lang.Object[] objArray38 = pilha32.item;
        boolean boolean39 = pilha32.vazia();
        boolean boolean40 = pilha32.vazia();
        pilha32.topo = (byte) -1;
        pilha32.topo = 'a';
        int int45 = pilha32.topo;
        pilha32.topo = 35;
        java.lang.Object[] objArray48 = pilha32.item;
        pilha0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = 0;
        java.lang.Object[] objArray4 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        int int14 = pilha11.tamanho();
        pilha6.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        pilha16.topo = 'a';
        boolean boolean21 = pilha16.vazia();
        pilha16.topo = (byte) 100;
        int int24 = pilha16.topo;
        boolean boolean25 = pilha16.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        boolean boolean28 = pilha26.vazia();
        pilha26.topo = 'a';
        pilha26.topo = (byte) 0;
        int int33 = pilha26.topo;
        pilha16.empilha((java.lang.Object) int33);
        int int35 = pilha16.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 'a';
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha36.item = objArray42;
        java.lang.Object obj44 = pilha36.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.topo;
        pilha45.topo = (byte) 0;
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.topo;
        java.lang.Object[] objArray51 = pilha49.item;
        pilha45.item = objArray51;
        pilha36.item = objArray51;
        pilha16.item = objArray51;
        boolean boolean55 = pilha16.vazia();
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        boolean boolean58 = pilha56.vazia();
        pilha56.topo = 'a';
        ds.Pilha pilha61 = new ds.Pilha();
        java.lang.Object[] objArray62 = pilha61.item;
        pilha56.item = objArray62;
        java.lang.Object obj64 = pilha56.desempilha();
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        boolean boolean67 = pilha65.vazia();
        pilha65.topo = 'a';
        int int70 = pilha65.topo;
        java.lang.Object[] objArray71 = pilha65.item;
        boolean boolean72 = pilha65.vazia();
        boolean boolean73 = pilha65.vazia();
        pilha65.topo = (byte) -1;
        int int76 = pilha65.topo;
        ds.Pilha pilha77 = new ds.Pilha();
        int int78 = pilha77.topo;
        boolean boolean79 = pilha77.vazia();
        pilha77.topo = 0;
        boolean boolean82 = pilha77.vazia();
        int int83 = pilha77.tamanho();
        java.lang.Object[] objArray84 = pilha77.item;
        pilha65.item = objArray84;
        pilha56.empilha((java.lang.Object) pilha65);
        int int87 = pilha56.tamanho();
        java.lang.Object[] objArray88 = pilha56.item;
        pilha16.item = objArray88;
        // The following exception was thrown during execution in test generation
        try {
            pilha6.empilha((java.lang.Object) pilha16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 97 + "'", int87 == 97);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        java.lang.Object obj11 = pilha0.desempilha();
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 1;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha0.item = objArray8;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha11.item = objArray14;
        pilha0.empilha((java.lang.Object) objArray14);
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        pilha18.item = objArray21;
        boolean boolean23 = pilha18.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1.0d };
        pilha26.item = objArray28;
        java.lang.Object[] objArray30 = pilha26.item;
        pilha24.item = objArray30;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        boolean boolean34 = pilha32.vazia();
        pilha32.topo = 'a';
        int int37 = pilha32.topo;
        java.lang.Object[] objArray38 = pilha32.item;
        boolean boolean39 = pilha32.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        boolean boolean42 = pilha40.vazia();
        pilha40.topo = 0;
        boolean boolean45 = pilha40.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray49 = pilha48.item;
        pilha46.item = objArray49;
        pilha40.item = objArray49;
        pilha32.item = objArray49;
        pilha24.item = objArray49;
        pilha18.item = objArray49;
        pilha0.item = objArray49;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = 'a';
        int int13 = pilha0.topo;
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        pilha10.topo = (byte) 0;
        int int17 = pilha10.topo;
        pilha0.empilha((java.lang.Object) int17);
        int int19 = pilha0.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha20.item = objArray26;
        java.lang.Object obj28 = pilha20.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        pilha29.topo = (byte) 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        pilha29.item = objArray35;
        pilha20.item = objArray35;
        pilha0.item = objArray35;
        boolean boolean39 = pilha0.vazia();
        int int40 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        boolean boolean24 = pilha22.vazia();
        int int25 = pilha22.tamanho();
        java.lang.Object[] objArray26 = pilha22.item;
        pilha11.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1.0d };
        pilha28.item = objArray30;
        java.lang.Object[] objArray32 = pilha28.item;
        java.lang.Object[] objArray33 = pilha28.item;
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray35 = pilha34.item;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray37 = pilha36.item;
        pilha34.item = objArray37;
        int int39 = pilha34.tamanho();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        boolean boolean42 = pilha40.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray44 = pilha43.item;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray46 = pilha45.item;
        pilha43.item = objArray46;
        pilha40.item = objArray46;
        java.lang.Object[] objArray49 = pilha40.item;
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.topo;
        boolean boolean52 = pilha50.vazia();
        java.lang.Object[] objArray53 = pilha50.item;
        pilha40.item = objArray53;
        pilha34.item = objArray53;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        boolean boolean58 = pilha56.vazia();
        pilha56.topo = 0;
        boolean boolean61 = pilha56.vazia();
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.topo;
        boolean boolean64 = pilha62.vazia();
        pilha62.topo = 'a';
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        pilha62.item = objArray68;
        pilha56.item = objArray68;
        int int71 = pilha56.topo;
        java.lang.Object[] objArray72 = pilha56.item;
        pilha34.item = objArray72;
        pilha28.item = objArray72;
        pilha22.item = objArray72;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = pilha22.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object[] objArray18 = pilha12.item;
        pilha12.topo = '4';
        java.lang.Object[] objArray21 = pilha12.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1.0]");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 32;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray13 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        java.lang.Object[] objArray9 = pilha0.item;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        pilha11.topo = '#';
        int int15 = pilha11.topo;
        int int16 = pilha11.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1.0d };
        pilha19.item = objArray21;
        pilha17.item = objArray21;
        pilha11.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 1.0d };
        pilha29.item = objArray31;
        java.lang.Object[] objArray33 = pilha29.item;
        pilha27.item = objArray33;
        pilha25.item = objArray33;
        java.lang.Object[] objArray36 = pilha25.item;
        pilha17.empilha((java.lang.Object) pilha25);
        pilha0.empilha((java.lang.Object) pilha17);
        java.lang.Object[] objArray39 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0]");
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        pilha8.item = objArray11;
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        boolean boolean19 = pilha14.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 1.0d };
        pilha20.item = objArray22;
        pilha14.empilha((java.lang.Object) pilha20);
        pilha8.empilha((java.lang.Object) pilha20);
        int int26 = pilha20.topo;
        pilha0.empilha((java.lang.Object) int26);
        int int28 = pilha0.tamanho();
        int int29 = pilha0.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        pilha30.topo = '#';
        int int34 = pilha30.topo;
        int int35 = pilha30.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 1.0d };
        pilha38.item = objArray40;
        pilha36.item = objArray40;
        pilha30.empilha((java.lang.Object) pilha36);
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 1.0d };
        pilha48.item = objArray50;
        java.lang.Object[] objArray52 = pilha48.item;
        pilha46.item = objArray52;
        pilha44.item = objArray52;
        java.lang.Object[] objArray55 = pilha44.item;
        pilha36.empilha((java.lang.Object) pilha44);
        pilha36.topo = (byte) 10;
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.topo;
        java.lang.Object[] objArray61 = pilha59.item;
        pilha36.item = objArray61;
        boolean boolean63 = pilha36.vazia();
        java.lang.Object[] objArray64 = pilha36.item;
        pilha0.item = objArray64;
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = (-1);
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        pilha6.topo = '#';
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1.0d };
        pilha10.item = objArray12;
        java.lang.Object[] objArray14 = pilha10.item;
        int int15 = pilha10.topo;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha6.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pilha10.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        pilha0.topo = (-1);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        pilha9.topo = (byte) 0;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha9.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        pilha17.item = objArray20;
        int int22 = pilha17.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        pilha26.item = objArray29;
        pilha23.item = objArray29;
        java.lang.Object[] objArray32 = pilha23.item;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        boolean boolean35 = pilha33.vazia();
        java.lang.Object[] objArray36 = pilha33.item;
        pilha23.item = objArray36;
        pilha17.item = objArray36;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        boolean boolean41 = pilha39.vazia();
        pilha39.topo = 0;
        boolean boolean44 = pilha39.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.topo;
        boolean boolean47 = pilha45.vazia();
        pilha45.topo = 'a';
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha45.item = objArray51;
        pilha39.item = objArray51;
        int int54 = pilha39.topo;
        java.lang.Object[] objArray55 = pilha39.item;
        pilha17.item = objArray55;
        pilha9.item = objArray55;
        pilha0.item = objArray55;
        pilha0.topo = 34;
        pilha0.topo = 35;
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        int int9 = pilha4.topo;
        java.lang.Object[] objArray10 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        pilha7.topo = (byte) 0;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        pilha7.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha0.topo;
        pilha0.topo = 0;
        pilha0.empilha((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        int int14 = pilha9.topo;
        java.lang.Object[] objArray15 = pilha9.item;
        boolean boolean16 = pilha9.vazia();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = (byte) -1;
        int int20 = pilha9.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        boolean boolean23 = pilha21.vazia();
        pilha21.topo = 0;
        boolean boolean26 = pilha21.vazia();
        int int27 = pilha21.tamanho();
        java.lang.Object[] objArray28 = pilha21.item;
        pilha9.item = objArray28;
        pilha0.empilha((java.lang.Object) pilha9);
        pilha9.topo = (byte) -1;
        boolean boolean33 = pilha9.vazia();
        int int34 = pilha9.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        int int17 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 0;
        boolean boolean9 = pilha4.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha10.item = objArray16;
        pilha4.item = objArray16;
        int int19 = pilha4.topo;
        java.lang.Object[] objArray20 = pilha4.item;
        pilha0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha0.topo;
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        int int11 = pilha0.topo;
        pilha0.topo = 0;
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        int int5 = pilha0.tamanho();
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        int int9 = pilha7.topo;
        int int10 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        boolean boolean5 = pilha3.vazia();
        pilha3.topo = 0;
        boolean boolean8 = pilha3.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha9.item = objArray15;
        pilha3.item = objArray15;
        pilha0.item = objArray15;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        boolean boolean21 = pilha19.vazia();
        pilha19.topo = 'a';
        boolean boolean24 = pilha19.vazia();
        pilha19.topo = (byte) 100;
        int int27 = pilha19.topo;
        boolean boolean28 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean28);
        boolean boolean30 = pilha0.vazia();
        java.lang.Object obj31 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        pilha18.item = objArray20;
        java.lang.Object[] objArray22 = pilha18.item;
        pilha16.item = objArray22;
        pilha14.item = objArray22;
        java.lang.Object[] objArray25 = pilha14.item;
        pilha6.empilha((java.lang.Object) pilha14);
        boolean boolean27 = pilha14.vazia();
        int int28 = pilha14.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = pilha14.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 'a';
        int int18 = pilha13.topo;
        pilha13.topo = (byte) 0;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        pilha21.item = objArray24;
        int int26 = pilha21.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha30.item = objArray33;
        pilha27.item = objArray33;
        java.lang.Object[] objArray36 = pilha27.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        boolean boolean39 = pilha37.vazia();
        java.lang.Object[] objArray40 = pilha37.item;
        pilha27.item = objArray40;
        pilha21.item = objArray40;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        boolean boolean45 = pilha43.vazia();
        pilha43.topo = 0;
        boolean boolean48 = pilha43.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.topo;
        boolean boolean51 = pilha49.vazia();
        pilha49.topo = 'a';
        ds.Pilha pilha54 = new ds.Pilha();
        java.lang.Object[] objArray55 = pilha54.item;
        pilha49.item = objArray55;
        pilha43.item = objArray55;
        int int58 = pilha43.topo;
        java.lang.Object[] objArray59 = pilha43.item;
        pilha21.item = objArray59;
        boolean boolean61 = pilha21.vazia();
        int int62 = pilha21.tamanho();
        java.lang.Object[] objArray63 = pilha21.item;
        pilha13.item = objArray63;
        java.lang.Object[] objArray65 = pilha13.item;
        pilha0.item = objArray65;
        int int67 = pilha0.tamanho();
        java.lang.Object[] objArray68 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        pilha0.topo = (short) 10;
        pilha0.topo = (byte) 10;
        boolean boolean15 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        int int15 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        pilha10.topo = (byte) 0;
        int int17 = pilha10.topo;
        pilha0.empilha((java.lang.Object) int17);
        int int19 = pilha0.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha20.item = objArray26;
        java.lang.Object obj28 = pilha20.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        pilha29.topo = (byte) 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        pilha29.item = objArray35;
        pilha20.item = objArray35;
        pilha0.item = objArray35;
        boolean boolean39 = pilha0.vazia();
        int int40 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 32;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1.0d };
        pilha11.item = objArray13;
        java.lang.Object[] objArray15 = pilha11.item;
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray19 = pilha0.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        int int25 = pilha20.topo;
        boolean boolean26 = pilha20.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha27.item = objArray30;
        int int32 = pilha27.tamanho();
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        boolean boolean35 = pilha33.vazia();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray37 = pilha36.item;
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray39 = pilha38.item;
        pilha36.item = objArray39;
        pilha33.item = objArray39;
        java.lang.Object[] objArray42 = pilha33.item;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        boolean boolean45 = pilha43.vazia();
        java.lang.Object[] objArray46 = pilha43.item;
        pilha33.item = objArray46;
        pilha27.item = objArray46;
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.topo;
        boolean boolean51 = pilha49.vazia();
        pilha49.topo = 0;
        boolean boolean54 = pilha49.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        boolean boolean57 = pilha55.vazia();
        pilha55.topo = 'a';
        ds.Pilha pilha60 = new ds.Pilha();
        java.lang.Object[] objArray61 = pilha60.item;
        pilha55.item = objArray61;
        pilha49.item = objArray61;
        int int64 = pilha49.topo;
        java.lang.Object[] objArray65 = pilha49.item;
        pilha27.item = objArray65;
        pilha20.item = objArray65;
        boolean boolean68 = pilha20.vazia();
        pilha0.empilha((java.lang.Object) boolean68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (short) 10;
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.topo = 95;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        boolean boolean9 = pilha7.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        pilha10.item = objArray13;
        pilha7.item = objArray13;
        java.lang.Object[] objArray16 = pilha7.item;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        boolean boolean19 = pilha17.vazia();
        java.lang.Object[] objArray20 = pilha17.item;
        pilha7.item = objArray20;
        pilha7.topo = (short) -1;
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray25 = pilha7.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        boolean boolean28 = pilha26.vazia();
        pilha26.topo = 0;
        boolean boolean31 = pilha26.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        boolean boolean34 = pilha32.vazia();
        pilha32.topo = 'a';
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray38 = pilha37.item;
        pilha32.item = objArray38;
        pilha26.item = objArray38;
        int int41 = pilha26.tamanho();
        int int42 = pilha26.tamanho();
        java.lang.Object[] objArray43 = pilha26.item;
        pilha7.item = objArray43;
        java.lang.Object[] objArray45 = pilha7.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        int int19 = pilha14.topo;
        java.lang.Object[] objArray20 = pilha14.item;
        boolean boolean21 = pilha14.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha22.item = objArray31;
        pilha14.item = objArray31;
        pilha6.item = objArray31;
        pilha0.item = objArray31;
        java.lang.Object[] objArray37 = null;
        pilha0.item = objArray37;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 0;
        java.lang.Class<?> wildcardClass11 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass11);
        pilha0.topo = '#';
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        pilha7.topo = '#';
        int int11 = pilha7.topo;
        int int12 = pilha7.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1.0d };
        pilha15.item = objArray17;
        pilha13.item = objArray17;
        pilha7.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1.0d };
        pilha25.item = objArray27;
        java.lang.Object[] objArray29 = pilha25.item;
        pilha23.item = objArray29;
        pilha21.item = objArray29;
        java.lang.Object[] objArray32 = pilha21.item;
        pilha13.empilha((java.lang.Object) pilha21);
        pilha0.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray39 = pilha38.item;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        pilha38.item = objArray41;
        pilha35.item = objArray41;
        java.lang.Object[] objArray44 = pilha35.item;
        java.lang.Object[] objArray45 = pilha35.item;
        java.lang.Object[] objArray46 = pilha35.item;
        pilha13.item = objArray46;
        java.lang.Class<?> wildcardClass48 = pilha13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d };
        pilha5.item = objArray7;
        java.lang.Object[] objArray9 = pilha5.item;
        int int10 = pilha5.topo;
        java.lang.Object[] objArray11 = pilha5.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        boolean boolean14 = pilha12.vazia();
        pilha12.topo = 'a';
        int int17 = pilha12.topo;
        java.lang.Object[] objArray18 = pilha12.item;
        int int19 = pilha12.tamanho();
        pilha5.empilha((java.lang.Object) int19);
        pilha0.empilha((java.lang.Object) int19);
        int int22 = pilha0.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        boolean boolean26 = pilha23.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        pilha27.topo = 'a';
        boolean boolean32 = pilha27.vazia();
        pilha27.topo = (byte) 100;
        int int35 = pilha27.topo;
        pilha23.empilha((java.lang.Object) pilha27);
        int int37 = pilha23.topo;
        pilha0.empilha((java.lang.Object) int37);
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean41 = pilha0.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        boolean boolean44 = pilha42.vazia();
        pilha42.topo = 'a';
        int int47 = pilha42.topo;
        java.lang.Object[] objArray48 = pilha42.item;
        java.lang.Object[] objArray49 = pilha42.item;
        java.lang.Object obj50 = pilha42.desempilha();
        pilha0.empilha((java.lang.Object) pilha42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[97]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[97]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[97]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = (short) 0;
        java.lang.Object obj5 = null;
        pilha0.empilha(obj5);
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        pilha14.item = objArray17;
        int int19 = pilha14.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha23.item = objArray26;
        pilha20.item = objArray26;
        java.lang.Object[] objArray29 = pilha20.item;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        boolean boolean32 = pilha30.vazia();
        java.lang.Object[] objArray33 = pilha30.item;
        pilha20.item = objArray33;
        pilha14.item = objArray33;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 0;
        boolean boolean41 = pilha36.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        boolean boolean44 = pilha42.vazia();
        pilha42.topo = 'a';
        ds.Pilha pilha47 = new ds.Pilha();
        java.lang.Object[] objArray48 = pilha47.item;
        pilha42.item = objArray48;
        pilha36.item = objArray48;
        int int51 = pilha36.topo;
        java.lang.Object[] objArray52 = pilha36.item;
        pilha14.item = objArray52;
        pilha8.item = objArray52;
        pilha0.empilha((java.lang.Object) objArray52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        java.lang.Object[] objArray8 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 100;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 0;
        java.lang.Class<?> wildcardClass11 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass11);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 'a';
        int int18 = pilha13.topo;
        java.lang.Object[] objArray19 = pilha13.item;
        int int20 = pilha13.tamanho();
        java.lang.Object[] objArray21 = pilha13.item;
        java.lang.Object obj22 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 35);
        java.lang.Object[] objArray25 = pilha13.item;
        pilha0.empilha((java.lang.Object) objArray25);
        java.lang.Class<?> wildcardClass27 = objArray25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha0.item = objArray6;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        pilha9.topo = (byte) 0;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha9.item = objArray15;
        pilha0.item = objArray15;
        java.lang.Object obj18 = pilha0.desempilha();
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        int int9 = pilha4.topo;
        java.lang.Object[] objArray10 = pilha4.item;
        pilha0.empilha((java.lang.Object) pilha4);
        int int12 = pilha4.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 'a';
        int int18 = pilha13.topo;
        pilha13.topo = (byte) 0;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        pilha21.item = objArray24;
        int int26 = pilha21.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        boolean boolean29 = pilha27.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha30.item = objArray33;
        pilha27.item = objArray33;
        java.lang.Object[] objArray36 = pilha27.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        boolean boolean39 = pilha37.vazia();
        java.lang.Object[] objArray40 = pilha37.item;
        pilha27.item = objArray40;
        pilha21.item = objArray40;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        boolean boolean45 = pilha43.vazia();
        pilha43.topo = 0;
        boolean boolean48 = pilha43.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.topo;
        boolean boolean51 = pilha49.vazia();
        pilha49.topo = 'a';
        ds.Pilha pilha54 = new ds.Pilha();
        java.lang.Object[] objArray55 = pilha54.item;
        pilha49.item = objArray55;
        pilha43.item = objArray55;
        int int58 = pilha43.topo;
        java.lang.Object[] objArray59 = pilha43.item;
        pilha21.item = objArray59;
        boolean boolean61 = pilha21.vazia();
        int int62 = pilha21.tamanho();
        java.lang.Object[] objArray63 = pilha21.item;
        pilha13.item = objArray63;
        java.lang.Object[] objArray65 = pilha13.item;
        pilha0.item = objArray65;
        java.lang.Class<?> wildcardClass67 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        pilha0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha0.empilha((java.lang.Object) boolean7);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 'a';
        int int14 = pilha9.topo;
        java.lang.Object[] objArray15 = pilha9.item;
        boolean boolean16 = pilha9.vazia();
        boolean boolean17 = pilha9.vazia();
        pilha9.topo = (byte) -1;
        pilha9.topo = 'a';
        int int22 = pilha9.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 0;
        boolean boolean28 = pilha23.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        pilha29.item = objArray32;
        pilha23.item = objArray32;
        pilha9.item = objArray32;
        pilha0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (byte) 1;
        int int3 = pilha0.topo;
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (short) -1;
        int int7 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 35;
        boolean boolean5 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.topo = ' ';
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        boolean boolean14 = pilha12.vazia();
        pilha12.topo = 'a';
        int int17 = pilha12.topo;
        boolean boolean18 = pilha12.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha19.item = objArray22;
        int int24 = pilha19.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        boolean boolean27 = pilha25.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha25.item = objArray31;
        java.lang.Object[] objArray34 = pilha25.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        java.lang.Object[] objArray38 = pilha35.item;
        pilha25.item = objArray38;
        pilha19.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        boolean boolean43 = pilha41.vazia();
        pilha41.topo = 0;
        boolean boolean46 = pilha41.vazia();
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        boolean boolean49 = pilha47.vazia();
        pilha47.topo = 'a';
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray53 = pilha52.item;
        pilha47.item = objArray53;
        pilha41.item = objArray53;
        int int56 = pilha41.topo;
        java.lang.Object[] objArray57 = pilha41.item;
        pilha19.item = objArray57;
        pilha12.item = objArray57;
        pilha9.item = objArray57;
        ds.Pilha pilha61 = new ds.Pilha();
        pilha61.topo = ' ';
        pilha9.empilha((java.lang.Object) pilha61);
        pilha0.empilha((java.lang.Object) pilha61);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha12.item = objArray15;
        pilha9.item = objArray15;
        boolean boolean18 = pilha9.vazia();
        int int19 = pilha9.tamanho();
        java.lang.Object[] objArray20 = pilha9.item;
        pilha0.item = objArray20;
        boolean boolean22 = pilha0.vazia();
        java.lang.Object obj23 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 'a';
        boolean boolean9 = pilha4.vazia();
        pilha4.topo = (byte) 100;
        int int12 = pilha4.topo;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        pilha14.topo = '#';
        boolean boolean18 = pilha14.vazia();
        boolean boolean19 = pilha14.vazia();
        java.lang.Object obj20 = null;
        pilha14.empilha(obj20);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 'a';
        int int27 = pilha22.topo;
        java.lang.Object[] objArray28 = pilha22.item;
        boolean boolean29 = pilha22.vazia();
        boolean boolean30 = pilha22.vazia();
        pilha22.topo = (byte) -1;
        pilha22.topo = 'a';
        int int35 = pilha22.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 0;
        boolean boolean41 = pilha36.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray43 = pilha42.item;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha42.item = objArray45;
        pilha36.item = objArray45;
        pilha22.item = objArray45;
        pilha14.item = objArray45;
        pilha4.item = objArray45;
        pilha4.topo = (-1);
        java.lang.Class<?> wildcardClass53 = pilha4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        pilha3.topo = '#';
        boolean boolean7 = pilha3.vazia();
        boolean boolean8 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) boolean8);
        java.lang.Object[] objArray10 = null;
        pilha0.item = objArray10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha6.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d };
        pilha6.item = objArray8;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        pilha11.topo = '#';
        int int15 = pilha11.topo;
        int int16 = pilha11.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1.0d };
        pilha19.item = objArray21;
        pilha17.item = objArray21;
        pilha11.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 1.0d };
        pilha29.item = objArray31;
        java.lang.Object[] objArray33 = pilha29.item;
        pilha27.item = objArray33;
        pilha25.item = objArray33;
        java.lang.Object[] objArray36 = pilha25.item;
        pilha17.empilha((java.lang.Object) pilha25);
        java.lang.Object[] objArray38 = pilha17.item;
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        boolean boolean41 = pilha39.vazia();
        int int42 = pilha39.tamanho();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha17.item = objArray43;
        java.lang.Object[] objArray45 = pilha17.item;
        pilha6.empilha((java.lang.Object) objArray45);
        pilha6.topo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        int int15 = pilha10.topo;
        java.lang.Object[] objArray16 = pilha10.item;
        boolean boolean17 = pilha10.vazia();
        boolean boolean18 = pilha10.vazia();
        pilha10.topo = (byte) -1;
        java.lang.Object[] objArray21 = pilha10.item;
        java.lang.Object[] objArray22 = pilha10.item;
        pilha0.empilha((java.lang.Object) objArray22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = '4';
        java.lang.Object[] objArray3 = pilha0.item;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        pilha4.item = objArray12;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        boolean boolean17 = pilha15.vazia();
        pilha15.topo = 'a';
        int int20 = pilha15.topo;
        java.lang.Object[] objArray21 = pilha15.item;
        boolean boolean22 = pilha15.vazia();
        boolean boolean23 = pilha15.vazia();
        int int24 = pilha15.topo;
        pilha4.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        int int27 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        java.lang.Object[] objArray4 = pilha3.item;
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray6 = pilha5.item;
        pilha3.item = objArray6;
        pilha0.item = objArray6;
        int int9 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 0;
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        boolean boolean16 = pilha11.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1.0d };
        pilha17.item = objArray19;
        pilha11.empilha((java.lang.Object) pilha17);
        boolean boolean22 = pilha11.vazia();
        java.lang.Object[] objArray23 = pilha11.item;
        pilha0.item = objArray23;
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        pilha10.topo = (byte) 0;
        int int17 = pilha10.topo;
        pilha0.empilha((java.lang.Object) int17);
        int int19 = pilha0.topo;
        int int20 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        int int13 = pilha8.topo;
        java.lang.Object[] objArray14 = pilha8.item;
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        pilha8.topo = (byte) -1;
        int int19 = pilha8.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 0;
        boolean boolean25 = pilha20.vazia();
        int int26 = pilha20.tamanho();
        java.lang.Object[] objArray27 = pilha20.item;
        pilha8.item = objArray27;
        pilha0.item = objArray27;
        int int30 = pilha0.tamanho();
        java.lang.Object obj31 = pilha0.desempilha();
        pilha0.topo = 96;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 1.0d };
        pilha36.item = objArray38;
        pilha34.item = objArray38;
        int int41 = pilha34.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        boolean boolean44 = pilha42.vazia();
        pilha42.topo = 'a';
        int int47 = pilha42.topo;
        java.lang.Object[] objArray48 = pilha42.item;
        boolean boolean49 = pilha42.vazia();
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.topo;
        boolean boolean52 = pilha50.vazia();
        pilha50.topo = 0;
        boolean boolean55 = pilha50.vazia();
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray59 = pilha58.item;
        pilha56.item = objArray59;
        pilha50.item = objArray59;
        pilha42.item = objArray59;
        pilha34.item = objArray59;
        pilha0.item = objArray59;
        int int65 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 96 + "'", int65 == 96);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha6.item = objArray12;
        pilha0.item = objArray12;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = pilha0.item;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        boolean boolean19 = pilha17.vazia();
        pilha17.topo = 'a';
        int int22 = pilha17.topo;
        java.lang.Object[] objArray23 = pilha17.item;
        boolean boolean24 = pilha17.vazia();
        boolean boolean25 = pilha17.vazia();
        pilha17.topo = (byte) -1;
        pilha17.topo = 'a';
        int int30 = pilha17.topo;
        pilha17.topo = 35;
        int int33 = pilha17.tamanho();
        pilha0.empilha((java.lang.Object) int33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray7 = pilha6.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        java.lang.Object[] objArray12 = pilha8.item;
        pilha6.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        boolean boolean16 = pilha14.vazia();
        pilha14.topo = 'a';
        int int19 = pilha14.topo;
        java.lang.Object[] objArray20 = pilha14.item;
        boolean boolean21 = pilha14.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        pilha22.item = objArray31;
        pilha14.item = objArray31;
        pilha6.item = objArray31;
        pilha0.item = objArray31;
        boolean boolean37 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object[] objArray18 = pilha12.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray21 = pilha19.item;
        boolean boolean22 = pilha19.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 'a';
        boolean boolean28 = pilha23.vazia();
        pilha23.topo = (byte) 100;
        int int31 = pilha23.topo;
        pilha19.empilha((java.lang.Object) pilha23);
        int int33 = pilha19.topo;
        java.lang.Object[] objArray34 = pilha19.item;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray38 = pilha37.item;
        pilha35.item = objArray38;
        int int40 = pilha35.tamanho();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        boolean boolean43 = pilha41.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha44.item = objArray47;
        pilha41.item = objArray47;
        java.lang.Object[] objArray50 = pilha41.item;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        boolean boolean53 = pilha51.vazia();
        java.lang.Object[] objArray54 = pilha51.item;
        pilha41.item = objArray54;
        pilha35.item = objArray54;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        boolean boolean59 = pilha57.vazia();
        pilha57.topo = 0;
        boolean boolean62 = pilha57.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.topo;
        boolean boolean65 = pilha63.vazia();
        pilha63.topo = 'a';
        ds.Pilha pilha68 = new ds.Pilha();
        java.lang.Object[] objArray69 = pilha68.item;
        pilha63.item = objArray69;
        pilha57.item = objArray69;
        int int72 = pilha57.topo;
        java.lang.Object[] objArray73 = pilha57.item;
        pilha35.item = objArray73;
        pilha19.item = objArray73;
        pilha12.item = objArray73;
        int int77 = pilha12.tamanho();
        pilha12.topo = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        pilha22.item = objArray25;
        int int27 = pilha22.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha31.item = objArray34;
        pilha28.item = objArray34;
        java.lang.Object[] objArray37 = pilha28.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        boolean boolean40 = pilha38.vazia();
        java.lang.Object[] objArray41 = pilha38.item;
        pilha28.item = objArray41;
        pilha22.item = objArray41;
        pilha0.item = objArray41;
        pilha0.topo = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d };
        pilha5.item = objArray7;
        java.lang.Object[] objArray9 = pilha5.item;
        int int10 = pilha5.topo;
        java.lang.Object[] objArray11 = pilha5.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        boolean boolean14 = pilha12.vazia();
        pilha12.topo = 'a';
        int int17 = pilha12.topo;
        java.lang.Object[] objArray18 = pilha12.item;
        int int19 = pilha12.tamanho();
        pilha5.empilha((java.lang.Object) int19);
        pilha0.empilha((java.lang.Object) int19);
        int int22 = pilha0.tamanho();
        java.lang.Object[] objArray23 = null;
        pilha0.item = objArray23;
        int int25 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[97]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[97]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[97]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 32;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1.0d };
        pilha11.item = objArray13;
        java.lang.Object[] objArray15 = pilha11.item;
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        java.lang.Object[] objArray6 = pilha2.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        int int13 = pilha8.topo;
        java.lang.Object[] objArray14 = pilha8.item;
        boolean boolean15 = pilha8.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        pilha16.topo = 0;
        boolean boolean21 = pilha16.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        pilha22.item = objArray25;
        pilha16.item = objArray25;
        pilha8.item = objArray25;
        pilha0.item = objArray25;
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha9.item = objArray12;
        pilha6.item = objArray12;
        java.lang.Object[] objArray15 = pilha6.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        java.lang.Object[] objArray19 = pilha16.item;
        pilha6.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 0;
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha28.item = objArray34;
        pilha22.item = objArray34;
        int int37 = pilha22.topo;
        java.lang.Object[] objArray38 = pilha22.item;
        pilha0.item = objArray38;
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.topo;
        int int42 = pilha0.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        boolean boolean45 = pilha43.vazia();
        pilha43.topo = 'a';
        int int48 = pilha43.topo;
        pilha43.topo = (byte) 0;
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray52 = pilha51.item;
        ds.Pilha pilha53 = new ds.Pilha();
        java.lang.Object[] objArray54 = pilha53.item;
        pilha51.item = objArray54;
        int int56 = pilha51.tamanho();
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        boolean boolean59 = pilha57.vazia();
        ds.Pilha pilha60 = new ds.Pilha();
        java.lang.Object[] objArray61 = pilha60.item;
        ds.Pilha pilha62 = new ds.Pilha();
        java.lang.Object[] objArray63 = pilha62.item;
        pilha60.item = objArray63;
        pilha57.item = objArray63;
        java.lang.Object[] objArray66 = pilha57.item;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.topo;
        boolean boolean69 = pilha67.vazia();
        java.lang.Object[] objArray70 = pilha67.item;
        pilha57.item = objArray70;
        pilha51.item = objArray70;
        ds.Pilha pilha73 = new ds.Pilha();
        int int74 = pilha73.topo;
        boolean boolean75 = pilha73.vazia();
        pilha73.topo = 0;
        boolean boolean78 = pilha73.vazia();
        ds.Pilha pilha79 = new ds.Pilha();
        int int80 = pilha79.topo;
        boolean boolean81 = pilha79.vazia();
        pilha79.topo = 'a';
        ds.Pilha pilha84 = new ds.Pilha();
        java.lang.Object[] objArray85 = pilha84.item;
        pilha79.item = objArray85;
        pilha73.item = objArray85;
        int int88 = pilha73.topo;
        java.lang.Object[] objArray89 = pilha73.item;
        pilha51.item = objArray89;
        boolean boolean91 = pilha51.vazia();
        int int92 = pilha51.tamanho();
        java.lang.Object[] objArray93 = pilha51.item;
        pilha43.item = objArray93;
        pilha0.item = objArray93;
        int int96 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.topo = (byte) 1;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        boolean boolean23 = pilha21.vazia();
        pilha21.topo = 'a';
        int int26 = pilha21.topo;
        java.lang.Object[] objArray27 = pilha21.item;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha18.item = objArray28;
        pilha18.topo = (byte) 10;
        pilha0.empilha((java.lang.Object) pilha18);
        pilha0.topo = (byte) 0;
        int int35 = pilha0.tamanho();
        boolean boolean36 = pilha0.vazia();
        int int37 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = (byte) 0;
        pilha0.topo = (byte) 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        int int11 = pilha6.topo;
        java.lang.Object[] objArray12 = pilha6.item;
        int int13 = pilha6.tamanho();
        java.lang.Object[] objArray14 = pilha6.item;
        pilha6.topo = 32;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1.0d };
        pilha17.item = objArray19;
        java.lang.Object[] objArray21 = pilha17.item;
        int int22 = pilha17.topo;
        java.lang.Object[] objArray23 = pilha17.item;
        pilha6.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        pilha25.topo = '#';
        int int29 = pilha25.topo;
        int int30 = pilha25.topo;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1.0d };
        pilha33.item = objArray35;
        pilha31.item = objArray35;
        pilha25.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1.0d };
        pilha43.item = objArray45;
        java.lang.Object[] objArray47 = pilha43.item;
        pilha41.item = objArray47;
        pilha39.item = objArray47;
        java.lang.Object[] objArray50 = pilha39.item;
        pilha31.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        pilha52.topo = '#';
        int int56 = pilha52.topo;
        int int57 = pilha52.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 1.0d };
        pilha60.item = objArray62;
        pilha58.item = objArray62;
        pilha52.empilha((java.lang.Object) pilha58);
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        java.lang.Object[] objArray69 = pilha68.item;
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray72 = new java.lang.Object[] { 1.0d };
        pilha70.item = objArray72;
        java.lang.Object[] objArray74 = pilha70.item;
        pilha68.item = objArray74;
        pilha66.item = objArray74;
        java.lang.Object[] objArray77 = pilha66.item;
        pilha58.empilha((java.lang.Object) pilha66);
        pilha39.empilha((java.lang.Object) pilha66);
        pilha6.empilha((java.lang.Object) pilha39);
        int int81 = pilha6.tamanho();
        java.lang.Object[] objArray82 = pilha6.item;
        pilha0.item = objArray82;
        java.lang.Object obj84 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj85 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 34 + "'", int81 == 34);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 0;
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        pilha0.topo = 99;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        int int14 = pilha0.topo;
        int int15 = pilha0.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        pilha16.topo = 'a';
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha16.item = objArray22;
        int int24 = pilha16.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1.0d };
        pilha25.item = objArray27;
        pilha16.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 1.0d };
        pilha32.item = objArray34;
        java.lang.Object[] objArray36 = pilha32.item;
        pilha30.item = objArray36;
        pilha16.item = objArray36;
        int int39 = pilha16.tamanho();
        java.lang.Object[] objArray40 = pilha16.item;
        pilha0.empilha((java.lang.Object) objArray40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 98 + "'", int39 == 98);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1.0]");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        java.lang.Object[] objArray6 = pilha2.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        pilha7.item = objArray10;
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        boolean boolean15 = pilha13.vazia();
        pilha13.topo = 'a';
        boolean boolean18 = pilha13.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1.0d };
        pilha19.item = objArray21;
        pilha13.empilha((java.lang.Object) pilha19);
        pilha7.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.topo = (byte) 1;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        pilha28.topo = 'a';
        int int33 = pilha28.topo;
        java.lang.Object[] objArray34 = pilha28.item;
        java.lang.Object[] objArray35 = pilha28.item;
        pilha25.item = objArray35;
        pilha25.topo = (byte) 10;
        pilha7.empilha((java.lang.Object) pilha25);
        java.lang.Object obj40 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1.0d };
        pilha42.item = objArray44;
        pilha0.item = objArray44;
        int int47 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        int int18 = pilha12.topo;
        java.lang.Object[] objArray19 = pilha12.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1.0]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha12.item = objArray15;
        pilha9.item = objArray15;
        boolean boolean18 = pilha9.vazia();
        int int19 = pilha9.tamanho();
        java.lang.Object[] objArray20 = pilha9.item;
        pilha0.item = objArray20;
        java.lang.Object obj22 = pilha0.desempilha();
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 'a';
        int int13 = pilha8.topo;
        java.lang.Object[] objArray14 = pilha8.item;
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        pilha8.topo = (byte) -1;
        int int19 = pilha8.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 0;
        boolean boolean25 = pilha20.vazia();
        int int26 = pilha20.tamanho();
        java.lang.Object[] objArray27 = pilha20.item;
        pilha8.item = objArray27;
        pilha0.item = objArray27;
        pilha0.topo = (short) 100;
        java.lang.Object obj32 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha5.topo = 'a';
        int int10 = pilha5.topo;
        java.lang.Object[] objArray11 = pilha5.item;
        int int12 = pilha5.tamanho();
        java.lang.Object[] objArray13 = pilha5.item;
        pilha5.topo = 32;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1.0d };
        pilha16.item = objArray18;
        java.lang.Object[] objArray20 = pilha16.item;
        int int21 = pilha16.topo;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha5.empilha((java.lang.Object) pilha16);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        pilha24.topo = '#';
        int int28 = pilha24.topo;
        int int29 = pilha24.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 1.0d };
        pilha32.item = objArray34;
        pilha30.item = objArray34;
        pilha24.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1.0d };
        pilha42.item = objArray44;
        java.lang.Object[] objArray46 = pilha42.item;
        pilha40.item = objArray46;
        pilha38.item = objArray46;
        java.lang.Object[] objArray49 = pilha38.item;
        pilha30.empilha((java.lang.Object) pilha38);
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        pilha51.topo = '#';
        int int55 = pilha51.topo;
        int int56 = pilha51.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        ds.Pilha pilha59 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 1.0d };
        pilha59.item = objArray61;
        pilha57.item = objArray61;
        pilha51.empilha((java.lang.Object) pilha57);
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        ds.Pilha pilha69 = new ds.Pilha();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 1.0d };
        pilha69.item = objArray71;
        java.lang.Object[] objArray73 = pilha69.item;
        pilha67.item = objArray73;
        pilha65.item = objArray73;
        java.lang.Object[] objArray76 = pilha65.item;
        pilha57.empilha((java.lang.Object) pilha65);
        pilha38.empilha((java.lang.Object) pilha65);
        pilha5.empilha((java.lang.Object) pilha38);
        int int80 = pilha5.tamanho();
        java.lang.Object[] objArray81 = pilha5.item;
        pilha0.empilha((java.lang.Object) objArray81);
        int int83 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass84 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1.0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 34 + "'", int80 == 34);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 0;
        java.lang.Class<?> wildcardClass11 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass11);
        pilha0.topo = '#';
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        java.lang.Object[] objArray19 = pilha17.item;
        boolean boolean20 = pilha17.vazia();
        pilha17.topo = (short) 10;
        java.lang.Object[] objArray23 = pilha17.item;
        java.lang.Object obj24 = pilha17.desempilha();
        pilha0.empilha(obj24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        boolean boolean8 = pilha6.vazia();
        pilha6.topo = 'a';
        boolean boolean11 = pilha6.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        pilha6.empilha((java.lang.Object) pilha12);
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        pilha5.topo = 'a';
        int int10 = pilha5.topo;
        java.lang.Object[] objArray11 = pilha5.item;
        int int12 = pilha5.tamanho();
        java.lang.Object[] objArray13 = pilha5.item;
        pilha5.topo = 32;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1.0d };
        pilha16.item = objArray18;
        java.lang.Object[] objArray20 = pilha16.item;
        int int21 = pilha16.topo;
        java.lang.Object[] objArray22 = pilha16.item;
        pilha5.empilha((java.lang.Object) pilha16);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        pilha24.topo = '#';
        int int28 = pilha24.topo;
        int int29 = pilha24.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 1.0d };
        pilha32.item = objArray34;
        pilha30.item = objArray34;
        pilha24.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray41 = pilha40.item;
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1.0d };
        pilha42.item = objArray44;
        java.lang.Object[] objArray46 = pilha42.item;
        pilha40.item = objArray46;
        pilha38.item = objArray46;
        java.lang.Object[] objArray49 = pilha38.item;
        pilha30.empilha((java.lang.Object) pilha38);
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        pilha51.topo = '#';
        int int55 = pilha51.topo;
        int int56 = pilha51.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        ds.Pilha pilha59 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 1.0d };
        pilha59.item = objArray61;
        pilha57.item = objArray61;
        pilha51.empilha((java.lang.Object) pilha57);
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        ds.Pilha pilha67 = new ds.Pilha();
        java.lang.Object[] objArray68 = pilha67.item;
        ds.Pilha pilha69 = new ds.Pilha();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 1.0d };
        pilha69.item = objArray71;
        java.lang.Object[] objArray73 = pilha69.item;
        pilha67.item = objArray73;
        pilha65.item = objArray73;
        java.lang.Object[] objArray76 = pilha65.item;
        pilha57.empilha((java.lang.Object) pilha65);
        pilha38.empilha((java.lang.Object) pilha65);
        pilha5.empilha((java.lang.Object) pilha38);
        int int80 = pilha5.tamanho();
        java.lang.Object[] objArray81 = pilha5.item;
        pilha0.empilha((java.lang.Object) objArray81);
        int int83 = pilha0.tamanho();
        boolean boolean84 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1.0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 34 + "'", int80 == 34);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Object obj8 = null;
        pilha0.empilha(obj8);
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d };
        pilha5.item = objArray7;
        boolean boolean9 = pilha5.vazia();
        pilha5.topo = (byte) 10;
        boolean boolean12 = pilha5.vazia();
        java.lang.Object[] objArray13 = pilha5.item;
        pilha0.item = objArray13;
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1.0]");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        pilha18.item = objArray20;
        java.lang.Object[] objArray22 = pilha18.item;
        pilha16.item = objArray22;
        pilha14.item = objArray22;
        java.lang.Object[] objArray25 = pilha14.item;
        pilha6.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        pilha27.topo = '#';
        int int31 = pilha27.topo;
        int int32 = pilha27.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1.0d };
        pilha35.item = objArray37;
        pilha33.item = objArray37;
        pilha27.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray44 = pilha43.item;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 1.0d };
        pilha45.item = objArray47;
        java.lang.Object[] objArray49 = pilha45.item;
        pilha43.item = objArray49;
        pilha41.item = objArray49;
        java.lang.Object[] objArray52 = pilha41.item;
        pilha33.empilha((java.lang.Object) pilha41);
        pilha14.empilha((java.lang.Object) pilha41);
        boolean boolean55 = pilha41.vazia();
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray59 = pilha58.item;
        ds.Pilha pilha60 = new ds.Pilha();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 1.0d };
        pilha60.item = objArray62;
        java.lang.Object[] objArray64 = pilha60.item;
        pilha58.item = objArray64;
        pilha56.item = objArray64;
        pilha41.item = objArray64;
        pilha41.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[1.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[1.0]");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray22 = pilha11.item;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        boolean boolean25 = pilha23.vazia();
        pilha23.topo = 'a';
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1.0d };
        pilha28.item = objArray30;
        java.lang.Object[] objArray32 = pilha28.item;
        int int33 = pilha28.topo;
        java.lang.Object[] objArray34 = pilha28.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        pilha35.topo = 'a';
        int int40 = pilha35.topo;
        java.lang.Object[] objArray41 = pilha35.item;
        int int42 = pilha35.tamanho();
        pilha28.empilha((java.lang.Object) int42);
        pilha23.empilha((java.lang.Object) int42);
        pilha11.empilha((java.lang.Object) pilha23);
        int int46 = pilha23.tamanho();
        pilha23.topo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[97]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[97]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[97]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[97]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 98 + "'", int46 == 98);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 'a';
        boolean boolean9 = pilha4.vazia();
        pilha4.topo = (byte) 100;
        int int12 = pilha4.topo;
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj14 = pilha0.desempilha();
        int int15 = pilha0.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        pilha16.item = objArray19;
        java.lang.Object[] objArray21 = pilha16.item;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 'a';
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1.0d };
        pilha28.item = objArray30;
        pilha22.empilha((java.lang.Object) pilha28);
        pilha16.empilha((java.lang.Object) pilha28);
        java.lang.Object[] objArray34 = pilha28.item;
        pilha0.empilha((java.lang.Object) pilha28);
        java.lang.Object obj36 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1.0]");
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 'a';
        boolean boolean9 = pilha4.vazia();
        pilha4.topo = (byte) 100;
        int int12 = pilha4.topo;
        pilha0.empilha((java.lang.Object) pilha4);
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 1.0d };
        pilha0.item = objArray2;
        pilha0.topo = 1;
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.topo;
        pilha0.topo = 97;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        pilha11.item = objArray20;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 'a';
        int int27 = pilha22.topo;
        pilha22.topo = (byte) 0;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha30.item = objArray33;
        int int35 = pilha30.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray40 = pilha39.item;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha39.item = objArray42;
        pilha36.item = objArray42;
        java.lang.Object[] objArray45 = pilha36.item;
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        boolean boolean48 = pilha46.vazia();
        java.lang.Object[] objArray49 = pilha46.item;
        pilha36.item = objArray49;
        pilha30.item = objArray49;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        boolean boolean54 = pilha52.vazia();
        pilha52.topo = 0;
        boolean boolean57 = pilha52.vazia();
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        boolean boolean60 = pilha58.vazia();
        pilha58.topo = 'a';
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray64 = pilha63.item;
        pilha58.item = objArray64;
        pilha52.item = objArray64;
        int int67 = pilha52.topo;
        java.lang.Object[] objArray68 = pilha52.item;
        pilha30.item = objArray68;
        boolean boolean70 = pilha30.vazia();
        int int71 = pilha30.tamanho();
        java.lang.Object[] objArray72 = pilha30.item;
        pilha22.item = objArray72;
        java.lang.Object[] objArray74 = pilha22.item;
        pilha11.item = objArray74;
        pilha0.item = objArray74;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object[] objArray7 = pilha0.item;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        boolean boolean11 = pilha9.vazia();
        pilha9.topo = 0;
        boolean boolean14 = pilha9.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        boolean boolean17 = pilha15.vazia();
        pilha15.topo = 'a';
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        pilha15.item = objArray21;
        pilha9.item = objArray21;
        int int24 = pilha9.topo;
        java.lang.Object[] objArray25 = pilha9.item;
        pilha0.empilha((java.lang.Object) objArray25);
        int int27 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        boolean boolean7 = pilha5.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray11 = pilha10.item;
        pilha8.item = objArray11;
        pilha5.item = objArray11;
        java.lang.Object[] objArray14 = pilha5.item;
        boolean boolean15 = pilha5.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        boolean boolean18 = pilha16.vazia();
        pilha16.topo = 'a';
        boolean boolean21 = pilha16.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1.0d };
        pilha22.item = objArray24;
        pilha16.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        pilha27.topo = '#';
        int int31 = pilha27.topo;
        int int32 = pilha27.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1.0d };
        pilha35.item = objArray37;
        pilha33.item = objArray37;
        pilha27.empilha((java.lang.Object) pilha33);
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray44 = pilha43.item;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 1.0d };
        pilha45.item = objArray47;
        java.lang.Object[] objArray49 = pilha45.item;
        pilha43.item = objArray49;
        pilha41.item = objArray49;
        java.lang.Object[] objArray52 = pilha41.item;
        pilha33.empilha((java.lang.Object) pilha41);
        java.lang.Object[] objArray54 = pilha33.item;
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray56 = pilha55.item;
        boolean boolean57 = pilha55.vazia();
        int int58 = pilha55.tamanho();
        java.lang.Object[] objArray59 = pilha55.item;
        pilha33.item = objArray59;
        java.lang.Object[] objArray61 = pilha33.item;
        pilha22.empilha((java.lang.Object) objArray61);
        pilha5.item = objArray61;
        pilha0.item = objArray61;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        pilha2.item = objArray4;
        pilha0.item = objArray4;
        pilha0.topo = '4';
        java.lang.Object[] objArray9 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.topo = '#';
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d };
        pilha8.item = objArray10;
        pilha6.item = objArray10;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray17 = pilha16.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        pilha18.item = objArray20;
        java.lang.Object[] objArray22 = pilha18.item;
        pilha16.item = objArray22;
        pilha14.item = objArray22;
        java.lang.Object[] objArray25 = pilha14.item;
        pilha6.empilha((java.lang.Object) pilha14);
        java.lang.Object[] objArray27 = pilha6.item;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        boolean boolean30 = pilha28.vazia();
        int int31 = pilha28.tamanho();
        java.lang.Object[] objArray32 = pilha28.item;
        pilha6.item = objArray32;
        java.lang.Object[] objArray34 = pilha6.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        boolean boolean37 = pilha35.vazia();
        pilha35.topo = 'a';
        int int40 = pilha35.topo;
        java.lang.Object[] objArray41 = pilha35.item;
        boolean boolean42 = pilha35.vazia();
        boolean boolean43 = pilha35.vazia();
        pilha35.topo = (byte) -1;
        pilha35.topo = 'a';
        java.lang.Object obj48 = pilha35.desempilha();
        pilha6.empilha((java.lang.Object) pilha35);
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.topo;
        boolean boolean52 = pilha50.vazia();
        pilha50.topo = 0;
        boolean boolean55 = pilha50.vazia();
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray59 = pilha58.item;
        pilha56.item = objArray59;
        pilha50.item = objArray59;
        java.lang.Object[] objArray62 = pilha50.item;
        pilha35.item = objArray62;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) 1;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        pilha8.topo = '#';
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        pilha12.item = objArray14;
        java.lang.Object[] objArray16 = pilha12.item;
        int int17 = pilha12.topo;
        java.lang.Object[] objArray18 = pilha12.item;
        pilha8.empilha((java.lang.Object) pilha12);
        pilha12.topo = 0;
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object obj23 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1.0]");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d };
        pilha4.item = objArray6;
        java.lang.Object[] objArray8 = pilha4.item;
        pilha2.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        boolean boolean13 = pilha11.vazia();
        pilha11.topo = 'a';
        int int16 = pilha11.topo;
        java.lang.Object[] objArray17 = pilha11.item;
        boolean boolean18 = pilha11.vazia();
        boolean boolean19 = pilha11.vazia();
        int int20 = pilha11.topo;
        pilha0.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        pilha22.item = objArray25;
        int int27 = pilha22.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        boolean boolean30 = pilha28.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha31.item = objArray34;
        pilha28.item = objArray34;
        java.lang.Object[] objArray37 = pilha28.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        boolean boolean40 = pilha38.vazia();
        java.lang.Object[] objArray41 = pilha38.item;
        pilha28.item = objArray41;
        pilha22.item = objArray41;
        pilha0.item = objArray41;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.topo;
        boolean boolean47 = pilha45.vazia();
        pilha45.topo = 0;
        boolean boolean50 = pilha45.vazia();
        pilha45.topo = 1;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        pilha53.topo = '#';
        int int57 = pilha53.topo;
        int int58 = pilha53.topo;
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.topo;
        boolean boolean61 = pilha59.vazia();
        pilha59.topo = 'a';
        int int64 = pilha59.topo;
        java.lang.Object[] objArray65 = pilha59.item;
        boolean boolean66 = pilha59.vazia();
        boolean boolean67 = pilha59.vazia();
        pilha59.topo = (byte) -1;
        int int70 = pilha59.topo;
        ds.Pilha pilha71 = new ds.Pilha();
        int int72 = pilha71.topo;
        boolean boolean73 = pilha71.vazia();
        pilha71.topo = 0;
        boolean boolean76 = pilha71.vazia();
        int int77 = pilha71.tamanho();
        java.lang.Object[] objArray78 = pilha71.item;
        pilha59.item = objArray78;
        pilha53.item = objArray78;
        pilha45.item = objArray78;
        pilha0.item = objArray78;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha13.item = objArray16;
        pilha10.item = objArray16;
        java.lang.Object[] objArray19 = pilha10.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        java.lang.Object[] objArray23 = pilha20.item;
        pilha10.item = objArray23;
        java.lang.Object[] objArray25 = pilha10.item;
        pilha0.empilha((java.lang.Object) pilha10);
        java.lang.Class<?> wildcardClass27 = pilha10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        boolean boolean12 = pilha10.vazia();
        pilha10.topo = 'a';
        pilha10.topo = (byte) 0;
        int int17 = pilha10.topo;
        pilha0.empilha((java.lang.Object) int17);
        int int19 = pilha0.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        boolean boolean22 = pilha20.vazia();
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        pilha20.item = objArray26;
        java.lang.Object obj28 = pilha20.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        pilha29.topo = (byte) 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        pilha29.item = objArray35;
        pilha20.item = objArray35;
        pilha0.item = objArray35;
        boolean boolean39 = pilha0.vazia();
        java.lang.Class<?> wildcardClass40 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        boolean boolean6 = pilha4.vazia();
        pilha4.topo = 'a';
        boolean boolean9 = pilha4.vazia();
        pilha4.topo = (byte) 100;
        int int12 = pilha4.topo;
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        pilha14.topo = '#';
        boolean boolean18 = pilha14.vazia();
        boolean boolean19 = pilha14.vazia();
        java.lang.Object obj20 = null;
        pilha14.empilha(obj20);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        boolean boolean24 = pilha22.vazia();
        pilha22.topo = 'a';
        int int27 = pilha22.topo;
        java.lang.Object[] objArray28 = pilha22.item;
        boolean boolean29 = pilha22.vazia();
        boolean boolean30 = pilha22.vazia();
        pilha22.topo = (byte) -1;
        pilha22.topo = 'a';
        int int35 = pilha22.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        boolean boolean38 = pilha36.vazia();
        pilha36.topo = 0;
        boolean boolean41 = pilha36.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray43 = pilha42.item;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha42.item = objArray45;
        pilha36.item = objArray45;
        pilha22.item = objArray45;
        pilha14.item = objArray45;
        pilha4.item = objArray45;
        int int51 = pilha4.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = null;
        pilha0.item = objArray1;
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.topo = (byte) 1;
        int int3 = pilha0.topo;
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 'a';
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(obj10);
    }
}


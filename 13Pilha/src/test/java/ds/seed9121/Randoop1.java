package ds.seed9121;

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
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray4 = pilha2.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha2.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray14 = pilha0.item;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 10;
        int int18 = pilha0.tamanho();
        int int19 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        int int14 = pilha11.tamanho();
        int int15 = pilha11.topo;
        java.lang.Object[] objArray16 = pilha11.item;
        pilha11.topo = (byte) 100;
        int int19 = pilha11.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha22.item = objArray27;
        pilha20.item = objArray27;
        int int30 = pilha20.tamanho();
        java.lang.Object[] objArray31 = pilha20.item;
        pilha11.item = objArray31;
        pilha0.item = objArray31;
        java.lang.Object[] objArray34 = pilha0.item;
        int int35 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 1;
        pilha0.topo = (short) 100;
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = 9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        int int7 = pilha5.topo;
        int int8 = pilha5.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        int int11 = pilha9.tamanho();
        java.lang.Object[] objArray12 = pilha9.item;
        pilha5.item = objArray12;
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        boolean boolean17 = pilha0.vazia();
        java.lang.Object[] objArray18 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        int int13 = pilha0.topo;
        pilha0.topo = (short) 0;
        pilha0.topo = (byte) -1;
        int int18 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.topo;
        java.lang.Object[] objArray26 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        boolean boolean3 = pilha0.vazia();
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha0.item = objArray15;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray21 = pilha19.item;
        pilha0.item = objArray21;
        boolean boolean23 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray28 = pilha26.item;
        int int29 = pilha26.tamanho();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray32 = pilha30.item;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha33.item = objArray38;
        pilha30.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray42 = pilha41.item;
        pilha30.item = objArray42;
        pilha30.topo = (short) -1;
        pilha30.topo = (short) 1;
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.topo;
        java.lang.Object[] objArray50 = pilha48.item;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha51.item = objArray56;
        pilha48.item = objArray56;
        ds.Pilha pilha59 = new ds.Pilha();
        java.lang.Object[] objArray60 = pilha59.item;
        pilha48.item = objArray60;
        pilha30.item = objArray60;
        java.lang.Object[] objArray63 = pilha30.item;
        pilha26.item = objArray63;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        java.lang.Object[] objArray67 = pilha65.item;
        int int68 = pilha65.tamanho();
        pilha26.empilha((java.lang.Object) pilha65);
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.topo;
        ds.Pilha pilha72 = new ds.Pilha();
        int int73 = pilha72.topo;
        java.lang.Object[] objArray77 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha72.item = objArray77;
        pilha70.item = objArray77;
        boolean boolean80 = pilha70.vazia();
        pilha70.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray83 = pilha70.item;
        int int84 = pilha70.topo;
        java.lang.Object[] objArray85 = pilha70.item;
        pilha65.item = objArray85;
        pilha0.item = objArray85;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[-1, -1, 10.0]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0f);
        pilha0.topo = 101;
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        java.lang.Object[] objArray22 = pilha11.item;
        pilha0.empilha((java.lang.Object) objArray22);
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray26 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[100, -1, 10.0], -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[100, -1, 10.0], -1, 10.0]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        pilha0.topo = (-1);
        pilha0.topo = (short) -1;
        pilha0.topo = 2;
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha6.item = objArray18;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray23 = pilha0.item;
        int int24 = pilha0.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha25.item = objArray32;
        boolean boolean35 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray38 = pilha25.item;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha41.item = objArray46;
        pilha39.item = objArray46;
        int int49 = pilha39.tamanho();
        java.lang.Object[] objArray50 = pilha39.item;
        pilha25.empilha((java.lang.Object) objArray50);
        pilha25.empilha((java.lang.Object) 0);
        java.lang.Object[] objArray54 = null;
        pilha25.item = objArray54;
        pilha0.empilha((java.lang.Object) objArray54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [100, -1, 10.0], 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[-1, [100, -1, 10.0], 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100, -1, 10.0]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        java.lang.Object obj7 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        int int12 = pilha10.topo;
        int int13 = pilha10.tamanho();
        pilha0.empilha((java.lang.Object) int13);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        int int17 = pilha15.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha20.item = objArray25;
        pilha18.item = objArray25;
        pilha15.item = objArray25;
        java.lang.Object[] objArray29 = pilha15.item;
        java.lang.Class<?> wildcardClass30 = pilha15.getClass();
        pilha0.empilha((java.lang.Object) pilha15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        pilha0.topo = 10;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha13.topo = 0;
        int int17 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) pilha13);
        boolean boolean19 = pilha0.vazia();
        boolean boolean20 = pilha0.vazia();
        int int21 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean28 = pilha0.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        int int31 = pilha29.topo;
        int int32 = pilha29.tamanho();
        pilha29.topo = (short) 0;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray37 = pilha35.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha38.item = objArray43;
        pilha35.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha35.item = objArray47;
        pilha29.item = objArray47;
        pilha0.empilha((java.lang.Object) pilha29);
        int int51 = pilha29.topo;
        boolean boolean52 = pilha29.vazia();
        int int53 = pilha29.topo;
        java.lang.Class<?> wildcardClass54 = pilha29.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        int int26 = pilha0.topo;
        java.lang.Object[] objArray27 = pilha0.item;
        int int28 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha13.item = objArray18;
        pilha11.item = objArray18;
        boolean boolean21 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        int int26 = pilha11.topo;
        int int27 = pilha11.tamanho();
        int int28 = pilha11.topo;
        int int29 = pilha11.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha13.topo = 0;
        int int17 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) pilha13);
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha22.item = objArray27;
        pilha20.item = objArray27;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha32.item = objArray37;
        pilha30.item = objArray37;
        boolean boolean40 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        int int46 = pilha44.topo;
        int int47 = pilha44.tamanho();
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray49 = pilha48.item;
        int int50 = pilha48.tamanho();
        java.lang.Object[] objArray51 = pilha48.item;
        pilha44.item = objArray51;
        java.lang.Object[] objArray53 = pilha44.item;
        pilha20.empilha((java.lang.Object) pilha44);
        pilha20.topo = 32;
        pilha20.topo = (short) 100;
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object[] objArray60 = pilha0.item;
        pilha0.topo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha13.topo = 0;
        int int17 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) pilha13);
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha22.item = objArray27;
        pilha20.item = objArray27;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha32.item = objArray37;
        pilha30.item = objArray37;
        boolean boolean40 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        pilha20.empilha((java.lang.Object) pilha30);
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        int int46 = pilha44.topo;
        int int47 = pilha44.tamanho();
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray49 = pilha48.item;
        int int50 = pilha48.tamanho();
        java.lang.Object[] objArray51 = pilha48.item;
        pilha44.item = objArray51;
        java.lang.Object[] objArray53 = pilha44.item;
        pilha20.empilha((java.lang.Object) pilha44);
        pilha20.topo = 32;
        pilha20.topo = (short) 100;
        pilha0.empilha((java.lang.Object) pilha20);
        java.lang.Object[] objArray60 = pilha0.item;
        java.lang.Class<?> wildcardClass61 = objArray60.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        pilha0.topo = ' ';
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha17.item = objArray24;
        boolean boolean27 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = pilha17.item;
        int int31 = pilha17.topo;
        java.lang.Object[] objArray32 = pilha17.item;
        pilha0.item = objArray32;
        java.lang.Object obj34 = pilha0.desempilha();
        boolean boolean35 = pilha0.vazia();
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha13.item = objArray18;
        pilha11.item = objArray18;
        boolean boolean21 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        int int26 = pilha11.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha29.item = objArray34;
        pilha27.item = objArray34;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha39.item = objArray44;
        pilha37.item = objArray44;
        boolean boolean47 = pilha37.vazia();
        pilha37.empilha((java.lang.Object) (byte) -1);
        pilha27.empilha((java.lang.Object) pilha37);
        int int51 = pilha37.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha54.item = objArray59;
        pilha52.item = objArray59;
        boolean boolean62 = pilha52.vazia();
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.topo;
        java.lang.Object[] objArray65 = pilha63.item;
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha66.item = objArray71;
        pilha63.item = objArray71;
        pilha52.item = objArray71;
        pilha37.item = objArray71;
        pilha11.item = objArray71;
        java.lang.Object obj77 = pilha11.desempilha();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (short) 100 + "'", obj77, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        int int26 = pilha24.topo;
        int int27 = pilha24.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        int int30 = pilha28.tamanho();
        java.lang.Object[] objArray31 = pilha28.item;
        pilha24.item = objArray31;
        java.lang.Object[] objArray33 = pilha24.item;
        pilha0.empilha((java.lang.Object) pilha24);
        pilha24.topo = 'a';
        pilha24.topo = (byte) 1;
        int int39 = pilha24.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        boolean boolean13 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray16 = pilha3.item;
        pilha0.item = objArray16;
        int int18 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray4 = pilha2.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha2.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray14 = pilha0.item;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 10;
        int int18 = pilha0.topo;
        int int19 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        int int6 = pilha4.topo;
        int int7 = pilha4.tamanho();
        pilha4.topo = (short) 0;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        java.lang.Object[] objArray12 = pilha10.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha13.item = objArray18;
        pilha10.item = objArray18;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha10.item = objArray22;
        pilha4.item = objArray22;
        pilha0.item = objArray22;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Class<?> wildcardClass27 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        int int14 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        pilha0.topo = '#';
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha18.item = objArray23;
        int int25 = pilha18.topo;
        boolean boolean26 = pilha18.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha18.empilha((java.lang.Object) pilha27);
        pilha18.topo = (short) 100;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray36 = pilha34.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        pilha34.item = objArray42;
        pilha32.item = objArray42;
        pilha18.item = objArray42;
        pilha0.item = objArray42;
        boolean boolean48 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        pilha5.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha16.item = objArray28;
        pilha5.item = objArray28;
        pilha5.empilha((java.lang.Object) '#');
        boolean boolean33 = pilha5.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray36 = pilha34.item;
        pilha5.empilha((java.lang.Object) objArray36);
        pilha0.item = objArray36;
        int int39 = pilha0.tamanho();
        pilha0.topo = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        java.lang.Object[] objArray14 = pilha0.item;
        pilha0.topo = 0;
        int int17 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray14 = pilha0.item;
        java.lang.Object[] objArray15 = pilha0.item;
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        int int5 = pilha0.topo;
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        int int12 = pilha5.topo;
        boolean boolean13 = pilha5.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha5.empilha((java.lang.Object) pilha14);
        pilha5.topo = (short) 100;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray23 = pilha21.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha24.item = objArray29;
        pilha21.item = objArray29;
        pilha19.item = objArray29;
        pilha5.item = objArray29;
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object obj35 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha13.item = objArray18;
        pilha11.item = objArray18;
        boolean boolean21 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        int int26 = pilha11.tamanho();
        java.lang.Class<?> wildcardClass27 = pilha11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.topo;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        int int30 = pilha28.topo;
        int int31 = pilha28.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha32.topo = 0;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        int int38 = pilha36.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha41.item = objArray46;
        pilha39.item = objArray46;
        pilha36.item = objArray46;
        pilha32.item = objArray46;
        pilha28.item = objArray46;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.tamanho();
        int int54 = pilha52.topo;
        int int55 = pilha52.tamanho();
        pilha52.topo = (short) 0;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        java.lang.Object[] objArray60 = pilha58.item;
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.topo;
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha61.item = objArray66;
        pilha58.item = objArray66;
        ds.Pilha pilha69 = new ds.Pilha();
        java.lang.Object[] objArray70 = pilha69.item;
        pilha58.item = objArray70;
        pilha52.item = objArray70;
        pilha28.item = objArray70;
        pilha0.item = objArray70;
        int int75 = pilha0.tamanho();
        boolean boolean76 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha13.item = objArray18;
        pilha11.item = objArray18;
        boolean boolean21 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray31 = pilha29.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha32.item = objArray37;
        pilha29.item = objArray37;
        pilha27.item = objArray37;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray43 = pilha41.item;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha44.item = objArray49;
        pilha41.item = objArray49;
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray53 = pilha52.item;
        pilha41.item = objArray53;
        pilha41.topo = (short) -1;
        pilha41.topo = (short) 1;
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.topo;
        java.lang.Object[] objArray61 = pilha59.item;
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.topo;
        java.lang.Object[] objArray67 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha62.item = objArray67;
        pilha59.item = objArray67;
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray71 = pilha70.item;
        pilha59.item = objArray71;
        pilha41.item = objArray71;
        pilha27.item = objArray71;
        java.lang.Class<?> wildcardClass75 = objArray71.getClass();
        pilha0.empilha((java.lang.Object) objArray71);
        java.lang.Object[] objArray77 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        int int5 = pilha3.topo;
        int int6 = pilha3.tamanho();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.empilha((java.lang.Object) objArray7);
        int int9 = pilha0.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray23 = pilha10.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha26.item = objArray31;
        pilha24.item = objArray31;
        int int34 = pilha24.tamanho();
        java.lang.Object[] objArray35 = pilha24.item;
        pilha10.empilha((java.lang.Object) objArray35);
        java.lang.Object[] objArray37 = pilha10.item;
        pilha10.topo = (short) 0;
        boolean boolean40 = pilha10.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha43.item = objArray48;
        pilha41.item = objArray48;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha53.item = objArray58;
        pilha51.item = objArray58;
        boolean boolean61 = pilha51.vazia();
        pilha51.empilha((java.lang.Object) (byte) -1);
        pilha41.empilha((java.lang.Object) pilha51);
        int int65 = pilha51.topo;
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha68.item = objArray73;
        pilha66.item = objArray73;
        boolean boolean76 = pilha66.vazia();
        ds.Pilha pilha77 = new ds.Pilha();
        int int78 = pilha77.topo;
        java.lang.Object[] objArray79 = pilha77.item;
        ds.Pilha pilha80 = new ds.Pilha();
        int int81 = pilha80.topo;
        java.lang.Object[] objArray85 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha80.item = objArray85;
        pilha77.item = objArray85;
        pilha66.item = objArray85;
        pilha51.item = objArray85;
        pilha10.empilha((java.lang.Object) objArray85);
        pilha0.item = objArray85;
        pilha0.empilha((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[100, 1, 10.0], [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[[100, 1, 10.0], [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[[100, 1, 10.0], [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[100, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[100, 1, 10.0]");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha26.item = objArray31;
        pilha24.item = objArray31;
        boolean boolean34 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray37 = pilha24.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha40.item = objArray45;
        pilha38.item = objArray45;
        int int48 = pilha38.tamanho();
        java.lang.Object[] objArray49 = pilha38.item;
        pilha24.empilha((java.lang.Object) objArray49);
        pilha0.empilha((java.lang.Object) pilha24);
        boolean boolean52 = pilha24.vazia();
        int int53 = pilha24.topo;
        int int54 = pilha24.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        int int27 = pilha0.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        int int36 = pilha28.tamanho();
        pilha0.empilha((java.lang.Object) pilha28);
        int int38 = pilha28.topo;
        java.lang.Object[] objArray39 = pilha28.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100, -1, 10.0]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha6.item = objArray18;
        pilha0.item = objArray18;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        pilha0.topo = (-1);
        pilha0.topo = (short) -1;
        pilha0.topo = 2;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha0.item = objArray15;
        boolean boolean17 = pilha0.vazia();
        boolean boolean18 = pilha0.vazia();
        int int19 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        pilha5.item = objArray12;
        boolean boolean15 = pilha5.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        pilha5.item = objArray24;
        java.lang.Object[] objArray28 = pilha5.item;
        pilha0.item = objArray28;
        int int30 = pilha0.topo;
        java.lang.Object obj31 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass32 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        java.lang.Object[] objArray22 = pilha11.item;
        pilha0.empilha((java.lang.Object) objArray22);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha24.item = objArray29;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha31.item = objArray36;
        int int38 = pilha31.topo;
        pilha24.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        int int42 = pilha40.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.topo;
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha45.item = objArray50;
        pilha43.item = objArray50;
        pilha40.item = objArray50;
        pilha31.empilha((java.lang.Object) pilha40);
        pilha40.topo = (short) -1;
        pilha0.empilha((java.lang.Object) pilha40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100, -1, 10.0]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha6.item = objArray18;
        pilha0.item = objArray18;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        int int23 = pilha21.topo;
        int int24 = pilha21.tamanho();
        pilha21.topo = (short) 0;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray29 = pilha27.item;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha30.item = objArray35;
        pilha27.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray39 = pilha38.item;
        pilha27.item = objArray39;
        pilha21.item = objArray39;
        pilha21.topo = (byte) 0;
        java.lang.Object[] objArray44 = pilha21.item;
        pilha0.item = objArray44;
        java.lang.Object[] objArray46 = pilha0.item;
        boolean boolean47 = pilha0.vazia();
        boolean boolean48 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha0.item = objArray15;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray21 = pilha19.item;
        pilha0.item = objArray21;
        boolean boolean23 = pilha0.vazia();
        java.lang.Object[] objArray24 = pilha0.item;
        boolean boolean25 = pilha0.vazia();
        java.lang.Object[] objArray26 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        int int14 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        int int18 = pilha16.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha19.item = objArray26;
        pilha16.item = objArray26;
        pilha7.empilha((java.lang.Object) pilha16);
        boolean boolean31 = pilha7.vazia();
        java.lang.Object[] objArray32 = null;
        pilha7.item = objArray32;
        pilha7.topo = (short) 100;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        int int38 = pilha36.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha41.item = objArray46;
        pilha39.item = objArray46;
        pilha36.item = objArray46;
        pilha7.item = objArray46;
        java.lang.Object[] objArray51 = pilha7.item;
        pilha7.topo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[100, -1, 10.0]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        boolean boolean25 = pilha0.vazia();
        int int26 = pilha0.tamanho();
        java.lang.Object[] objArray27 = pilha0.item;
        pilha0.topo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = pilha0.item;
        boolean boolean28 = pilha0.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        int int31 = pilha29.tamanho();
        java.lang.Object[] objArray32 = pilha29.item;
        pilha0.item = objArray32;
        int int34 = pilha0.topo;
        int int35 = pilha0.tamanho();
        java.lang.Object[] objArray36 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        int int26 = pilha24.topo;
        int int27 = pilha24.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        int int30 = pilha28.tamanho();
        java.lang.Object[] objArray31 = pilha28.item;
        pilha24.item = objArray31;
        java.lang.Object[] objArray33 = pilha24.item;
        pilha0.empilha((java.lang.Object) pilha24);
        pilha24.topo = 'a';
        int int37 = pilha24.tamanho();
        boolean boolean38 = pilha24.vazia();
        java.lang.Object obj39 = pilha24.desempilha();
        int int40 = pilha24.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 96 + "'", int40 == 96);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha13.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray26 = pilha24.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha24.item = objArray32;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        pilha24.item = objArray36;
        pilha13.item = objArray36;
        pilha13.empilha((java.lang.Object) '#');
        boolean boolean41 = pilha13.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray44 = pilha42.item;
        pilha13.empilha((java.lang.Object) objArray44);
        pilha8.item = objArray44;
        pilha0.empilha((java.lang.Object) objArray44);
        int int48 = pilha0.topo;
        int int49 = pilha0.tamanho();
        pilha0.topo = 100;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        java.lang.Object[] objArray57 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha52.item = objArray57;
        int int59 = pilha52.topo;
        int int60 = pilha52.tamanho();
        pilha0.empilha((java.lang.Object) pilha52);
        pilha52.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        pilha0.topo = ' ';
        int int13 = pilha0.tamanho();
        java.lang.Object[] objArray14 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        boolean boolean36 = pilha28.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        int int44 = pilha37.topo;
        int int45 = pilha37.tamanho();
        java.lang.Class<?> wildcardClass46 = pilha37.getClass();
        pilha28.empilha((java.lang.Object) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = pilha28.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass48);
        int int50 = pilha0.tamanho();
        boolean boolean51 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha26.item = objArray31;
        pilha23.item = objArray31;
        java.lang.Object[] objArray34 = pilha23.item;
        pilha0.item = objArray34;
        java.lang.Object[] objArray36 = pilha0.item;
        boolean boolean37 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        pilha0.topo = (short) 1;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha18.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha18.item = objArray30;
        pilha0.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha35.item = objArray40;
        pilha33.item = objArray40;
        boolean boolean43 = pilha33.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray46 = pilha44.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha47.item = objArray52;
        pilha44.item = objArray52;
        pilha33.item = objArray52;
        pilha0.item = objArray52;
        java.lang.Object obj57 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 100 + "'", obj57, (short) 100);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.topo;
        int int11 = pilha0.topo;
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha10);
        int int24 = pilha10.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha25.item = objArray32;
        boolean boolean35 = pilha25.vazia();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        java.lang.Object[] objArray38 = pilha36.item;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha39.item = objArray44;
        pilha36.item = objArray44;
        pilha25.item = objArray44;
        pilha10.item = objArray44;
        pilha10.empilha((java.lang.Object) 0L);
        int int51 = pilha10.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        java.lang.Object[] objArray54 = pilha52.item;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha52.item = objArray60;
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.topo;
        java.lang.Object[] objArray65 = pilha63.item;
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha66.item = objArray71;
        pilha63.item = objArray71;
        ds.Pilha pilha74 = new ds.Pilha();
        java.lang.Object[] objArray75 = pilha74.item;
        pilha63.item = objArray75;
        pilha52.item = objArray75;
        pilha52.empilha((java.lang.Object) '#');
        boolean boolean80 = pilha52.vazia();
        ds.Pilha pilha81 = new ds.Pilha();
        int int82 = pilha81.topo;
        java.lang.Object[] objArray83 = pilha81.item;
        pilha52.empilha((java.lang.Object) objArray83);
        pilha10.item = objArray83;
        int int86 = pilha10.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, 0, 10.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        int int27 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        pilha0.topo = (-1);
        pilha0.topo = (short) -1;
        boolean boolean13 = pilha0.vazia();
        java.lang.Object[] objArray14 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha13.topo = 0;
        int int17 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) pilha13);
        int int19 = pilha0.tamanho();
        java.lang.Object[] objArray20 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha0.item = objArray15;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray21 = pilha19.item;
        pilha0.item = objArray21;
        java.lang.Object[] objArray23 = pilha0.item;
        int int24 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        java.lang.Object[] objArray6 = pilha4.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        pilha4.item = objArray12;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha4.item = objArray16;
        pilha4.topo = (short) -1;
        pilha4.topo = (short) 1;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray24 = pilha22.item;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha25.item = objArray30;
        pilha22.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha22.item = objArray34;
        pilha4.item = objArray34;
        java.lang.Object[] objArray37 = pilha4.item;
        pilha0.item = objArray37;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray41 = pilha39.item;
        int int42 = pilha39.tamanho();
        pilha0.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha46.item = objArray51;
        pilha44.item = objArray51;
        boolean boolean54 = pilha44.vazia();
        pilha44.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray57 = pilha44.item;
        int int58 = pilha44.topo;
        java.lang.Object[] objArray59 = pilha44.item;
        pilha39.item = objArray59;
        boolean boolean61 = pilha39.vazia();
        pilha39.topo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha10);
        int int24 = pilha10.topo;
        int int25 = pilha10.tamanho();
        int int26 = pilha10.topo;
        java.lang.Object obj27 = pilha10.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        java.lang.Object[] objArray6 = pilha4.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        pilha4.item = objArray12;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha4.item = objArray16;
        pilha4.topo = (short) -1;
        pilha4.topo = (short) 1;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray24 = pilha22.item;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha25.item = objArray30;
        pilha22.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha22.item = objArray34;
        pilha4.item = objArray34;
        java.lang.Object[] objArray37 = pilha4.item;
        pilha0.item = objArray37;
        pilha0.topo = 'a';
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray43 = pilha41.item;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha44.item = objArray49;
        pilha41.item = objArray49;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        java.lang.Object[] objArray54 = pilha52.item;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha52.item = objArray60;
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray64 = pilha63.item;
        pilha52.item = objArray64;
        pilha41.item = objArray64;
        pilha0.item = objArray64;
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        java.lang.Object[] objArray70 = pilha68.item;
        boolean boolean71 = pilha68.vazia();
        java.lang.Object[] objArray72 = pilha68.item;
        java.lang.Object[] objArray73 = pilha68.item;
        java.lang.Object[] objArray74 = pilha68.item;
        pilha0.empilha((java.lang.Object) pilha68);
        int int76 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 98 + "'", int76 == 98);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        pilha0.topo = 100;
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean28 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        int int13 = pilha0.topo;
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        boolean boolean23 = pilha0.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha24.item = objArray29;
        int int31 = pilha24.topo;
        boolean boolean32 = pilha24.vazia();
        java.lang.Class<?> wildcardClass33 = pilha24.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass33);
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        pilha35.item = objArray42;
        boolean boolean45 = pilha35.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        java.lang.Object[] objArray48 = pilha46.item;
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.topo;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha49.item = objArray54;
        pilha46.item = objArray54;
        pilha35.item = objArray54;
        java.lang.Object[] objArray58 = pilha35.item;
        boolean boolean59 = pilha35.vazia();
        int int60 = pilha35.topo;
        java.lang.Object[] objArray61 = pilha35.item;
        java.lang.Object[] objArray62 = pilha35.item;
        pilha35.topo = 0;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.topo = (short) 100;
        int int69 = pilha65.topo;
        java.lang.Object[] objArray70 = pilha65.item;
        pilha35.item = objArray70;
        java.lang.Object[] objArray72 = pilha35.item;
        pilha0.item = objArray72;
        boolean boolean74 = pilha0.vazia();
        pilha0.topo = 'a';
        java.lang.Class<?> wildcardClass77 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (short) -1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha7.item = objArray14;
        boolean boolean17 = pilha7.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha18.item = objArray26;
        pilha7.item = objArray26;
        boolean boolean30 = pilha7.vazia();
        int int31 = pilha7.topo;
        pilha7.topo = 2;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha34.item = objArray39;
        int int41 = pilha34.topo;
        boolean boolean42 = pilha34.vazia();
        java.lang.Class<?> wildcardClass43 = pilha34.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass43);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, class ds.Pilha]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, class ds.Pilha]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha13.item = objArray18;
        pilha11.item = objArray18;
        boolean boolean21 = pilha11.vazia();
        pilha11.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray24 = pilha11.item;
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha29.item = objArray34;
        pilha27.item = objArray34;
        boolean boolean37 = pilha27.vazia();
        pilha27.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray40 = pilha27.item;
        int int41 = pilha27.topo;
        java.lang.Object[] objArray42 = pilha27.item;
        pilha0.item = objArray42;
        java.lang.Object obj44 = pilha0.desempilha();
        boolean boolean45 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        int int14 = pilha11.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        java.lang.Object[] objArray17 = pilha15.item;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha18.item = objArray23;
        pilha15.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        pilha15.item = objArray27;
        pilha15.topo = (short) -1;
        pilha15.topo = (short) 1;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha36.item = objArray41;
        pilha33.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha33.item = objArray45;
        pilha15.item = objArray45;
        java.lang.Object[] objArray48 = pilha15.item;
        pilha11.item = objArray48;
        pilha0.item = objArray48;
        boolean boolean51 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        int int14 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        int int18 = pilha16.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha19.item = objArray26;
        pilha16.item = objArray26;
        pilha7.empilha((java.lang.Object) pilha16);
        boolean boolean31 = pilha7.vazia();
        int int32 = pilha7.topo;
        int int33 = pilha7.topo;
        boolean boolean34 = pilha7.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        int int7 = pilha5.topo;
        int int8 = pilha5.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        int int11 = pilha9.tamanho();
        java.lang.Object[] objArray12 = pilha9.item;
        pilha5.item = objArray12;
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray17 = pilha0.item;
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        java.lang.Object obj6 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        java.lang.Object[] objArray14 = pilha0.item;
        int int15 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha13.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray26 = pilha24.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha24.item = objArray32;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        pilha24.item = objArray36;
        pilha13.item = objArray36;
        pilha13.empilha((java.lang.Object) '#');
        boolean boolean41 = pilha13.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray44 = pilha42.item;
        pilha13.empilha((java.lang.Object) objArray44);
        pilha8.item = objArray44;
        pilha0.empilha((java.lang.Object) objArray44);
        int int48 = pilha0.topo;
        int int49 = pilha0.tamanho();
        pilha0.topo = 100;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha54.item = objArray59;
        pilha52.item = objArray59;
        int int62 = pilha52.tamanho();
        java.lang.Object[] objArray63 = pilha52.item;
        int int64 = pilha52.topo;
        int int65 = pilha52.topo;
        pilha52.topo = (short) 0;
        pilha52.topo = (byte) -1;
        java.lang.Object[] objArray70 = pilha52.item;
        pilha0.item = objArray70;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[100, -1, 10.0]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int13 = pilha0.topo;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray16 = pilha14.item;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha17.item = objArray22;
        pilha14.item = objArray22;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        java.lang.Object[] objArray27 = pilha25.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        pilha25.item = objArray33;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray37 = pilha36.item;
        pilha25.item = objArray37;
        pilha14.item = objArray37;
        pilha14.empilha((java.lang.Object) '#');
        boolean boolean42 = pilha14.vazia();
        java.lang.Object obj43 = pilha14.desempilha();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray46 = pilha44.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha47.item = objArray52;
        pilha44.item = objArray52;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray57 = pilha55.item;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha58.item = objArray63;
        pilha55.item = objArray63;
        ds.Pilha pilha66 = new ds.Pilha();
        java.lang.Object[] objArray67 = pilha66.item;
        pilha55.item = objArray67;
        pilha44.item = objArray67;
        pilha44.empilha((java.lang.Object) '#');
        ds.Pilha pilha72 = new ds.Pilha();
        java.lang.Object[] objArray73 = pilha72.item;
        pilha72.topo = 0;
        ds.Pilha pilha76 = new ds.Pilha();
        int int77 = pilha76.tamanho();
        int int78 = pilha76.topo;
        ds.Pilha pilha79 = new ds.Pilha();
        int int80 = pilha79.topo;
        ds.Pilha pilha81 = new ds.Pilha();
        int int82 = pilha81.topo;
        java.lang.Object[] objArray86 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha81.item = objArray86;
        pilha79.item = objArray86;
        pilha76.item = objArray86;
        pilha72.item = objArray86;
        pilha44.empilha((java.lang.Object) objArray86);
        pilha14.empilha((java.lang.Object) pilha44);
        java.lang.Object obj93 = pilha44.desempilha();
        pilha0.empilha((java.lang.Object) pilha44);
        java.lang.Object[] objArray95 = pilha0.item;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '#' + "'", obj43, '#');
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        int int5 = pilha0.topo;
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        int int15 = pilha8.topo;
        boolean boolean16 = pilha8.vazia();
        pilha8.topo = 0;
        int int19 = pilha8.topo;
        pilha8.topo = (byte) -1;
        boolean boolean22 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        pilha0.topo = (byte) 100;
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        int int9 = pilha0.topo;
        int int10 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha30.item = objArray35;
        pilha28.item = objArray35;
        boolean boolean38 = pilha28.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray41 = pilha39.item;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha42.item = objArray47;
        pilha39.item = objArray47;
        pilha28.item = objArray47;
        java.lang.Object[] objArray51 = pilha28.item;
        boolean boolean52 = pilha28.vazia();
        boolean boolean53 = pilha28.vazia();
        int int54 = pilha28.tamanho();
        java.lang.Object[] objArray55 = pilha28.item;
        pilha0.item = objArray55;
        int int57 = pilha0.topo;
        java.lang.Object obj58 = null;
        pilha0.empilha(obj58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[null, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[null, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[null, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[null, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[null, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[null, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray4 = pilha2.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha2.item = objArray10;
        pilha0.item = objArray10;
        pilha0.topo = 3;
        int int16 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        boolean boolean13 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray16 = pilha3.item;
        pilha0.item = objArray16;
        boolean boolean18 = pilha0.vazia();
        java.lang.Object obj19 = null;
        pilha0.empilha(obj19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        boolean boolean25 = pilha0.vazia();
        int int26 = pilha0.tamanho();
        int int27 = pilha0.tamanho();
        boolean boolean28 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha10);
        int int24 = pilha0.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray26 = pilha25.item;
        boolean boolean27 = pilha25.vazia();
        pilha25.topo = 1;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha32.item = objArray37;
        pilha30.item = objArray37;
        boolean boolean40 = pilha30.vazia();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray43 = pilha41.item;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha44.item = objArray49;
        pilha41.item = objArray49;
        pilha30.item = objArray49;
        java.lang.Object[] objArray53 = pilha30.item;
        pilha25.item = objArray53;
        pilha0.empilha((java.lang.Object) objArray53);
        pilha0.topo = ' ';
        java.lang.Class<?> wildcardClass58 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) pilha9);
        pilha0.topo = (short) 100;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        boolean boolean24 = pilha14.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        java.lang.Object[] objArray27 = pilha25.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        pilha25.item = objArray33;
        pilha14.item = objArray33;
        java.lang.Object[] objArray37 = pilha14.item;
        boolean boolean38 = pilha14.vazia();
        int int39 = pilha14.topo;
        java.lang.Object[] objArray40 = pilha14.item;
        java.lang.Object[] objArray41 = pilha14.item;
        pilha14.topo = 0;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        pilha44.topo = (short) 100;
        int int48 = pilha44.topo;
        java.lang.Object[] objArray49 = pilha44.item;
        pilha14.item = objArray49;
        pilha0.item = objArray49;
        java.lang.Object[] objArray52 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) pilha9);
        pilha0.topo = (short) 100;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        pilha14.item = objArray24;
        pilha0.item = objArray24;
        boolean boolean29 = pilha0.vazia();
        java.lang.Object[] objArray30 = pilha0.item;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha33.item = objArray38;
        pilha31.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha43.item = objArray48;
        pilha41.item = objArray48;
        boolean boolean51 = pilha41.vazia();
        pilha41.empilha((java.lang.Object) (byte) -1);
        pilha31.empilha((java.lang.Object) pilha41);
        int int55 = pilha31.tamanho();
        int int56 = pilha31.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        java.lang.Object[] objArray59 = pilha57.item;
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.topo;
        java.lang.Object[] objArray65 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha60.item = objArray65;
        pilha57.item = objArray65;
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        java.lang.Object[] objArray70 = pilha68.item;
        ds.Pilha pilha71 = new ds.Pilha();
        int int72 = pilha71.topo;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha71.item = objArray76;
        pilha68.item = objArray76;
        ds.Pilha pilha79 = new ds.Pilha();
        java.lang.Object[] objArray80 = pilha79.item;
        pilha68.item = objArray80;
        pilha57.item = objArray80;
        pilha57.empilha((java.lang.Object) '#');
        boolean boolean85 = pilha57.vazia();
        ds.Pilha pilha86 = new ds.Pilha();
        int int87 = pilha86.topo;
        java.lang.Object[] objArray88 = pilha86.item;
        pilha57.empilha((java.lang.Object) objArray88);
        pilha31.item = objArray88;
        pilha0.item = objArray88;
        java.lang.Class<?> wildcardClass92 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean28 = pilha0.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        int int31 = pilha29.topo;
        int int32 = pilha29.tamanho();
        pilha29.topo = (short) 0;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray37 = pilha35.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha38.item = objArray43;
        pilha35.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha35.item = objArray47;
        pilha29.item = objArray47;
        pilha0.empilha((java.lang.Object) pilha29);
        int int51 = pilha29.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha54.item = objArray59;
        pilha52.item = objArray59;
        boolean boolean62 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray65 = pilha52.item;
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.topo;
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha68.item = objArray73;
        pilha66.item = objArray73;
        int int76 = pilha66.tamanho();
        java.lang.Object[] objArray77 = pilha66.item;
        pilha52.empilha((java.lang.Object) objArray77);
        java.lang.Object[] objArray79 = pilha52.item;
        java.lang.Class<?> wildcardClass80 = objArray79.getClass();
        pilha29.empilha((java.lang.Object) objArray79);
        ds.Pilha pilha82 = new ds.Pilha();
        int int83 = pilha82.topo;
        ds.Pilha pilha84 = new ds.Pilha();
        int int85 = pilha84.topo;
        java.lang.Object[] objArray89 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha84.item = objArray89;
        pilha82.item = objArray89;
        boolean boolean92 = pilha82.vazia();
        pilha82.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha95 = new ds.Pilha();
        int int96 = pilha95.tamanho();
        java.lang.Object[] objArray97 = pilha95.item;
        pilha82.item = objArray97;
        pilha29.empilha((java.lang.Object) pilha82);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(objArray97);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) pilha9);
        pilha0.topo = (short) 100;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        pilha14.item = objArray24;
        pilha0.item = objArray24;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray31 = pilha29.item;
        boolean boolean32 = pilha29.vazia();
        java.lang.Object[] objArray33 = pilha29.item;
        pilha0.item = objArray33;
        int int35 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        pilha5.item = objArray13;
        pilha5.topo = ' ';
        boolean boolean18 = pilha5.vazia();
        java.lang.Object[] objArray19 = pilha5.item;
        pilha0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0f);
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        pilha0.topo = (-1);
        pilha0.topo = (short) -1;
        pilha0.topo = 2;
        int int15 = pilha0.topo;
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean28 = pilha0.vazia();
        java.lang.Object obj29 = pilha0.desempilha();
        boolean boolean30 = pilha0.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha33.item = objArray38;
        pilha31.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha41.item = objArray46;
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.topo;
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha48.item = objArray53;
        int int55 = pilha48.topo;
        pilha41.empilha((java.lang.Object) pilha48);
        pilha41.topo = '#';
        java.lang.Object[] objArray59 = pilha41.item;
        pilha31.item = objArray59;
        java.lang.Object[] objArray61 = pilha31.item;
        boolean boolean62 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) pilha31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '#' + "'", obj29, '#');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray14 = pilha0.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        java.lang.Class<?> wildcardClass18 = pilha15.getClass();
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        java.lang.Object[] objArray22 = pilha20.item;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha23.item = objArray28;
        pilha20.item = objArray28;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        java.lang.Object[] objArray33 = pilha31.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha34.item = objArray39;
        pilha31.item = objArray39;
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray43 = pilha42.item;
        pilha31.item = objArray43;
        pilha20.item = objArray43;
        pilha20.empilha((java.lang.Object) '#');
        boolean boolean48 = pilha20.vazia();
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        int int51 = pilha49.topo;
        int int52 = pilha49.tamanho();
        pilha49.topo = (short) 0;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray57 = pilha55.item;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha58.item = objArray63;
        pilha55.item = objArray63;
        ds.Pilha pilha66 = new ds.Pilha();
        java.lang.Object[] objArray67 = pilha66.item;
        pilha55.item = objArray67;
        pilha49.item = objArray67;
        pilha20.empilha((java.lang.Object) pilha49);
        pilha15.empilha((java.lang.Object) pilha49);
        int int72 = pilha49.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        pilha0.empilha((java.lang.Object) 0);
        int int29 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, [100, -1, 10.0], 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [100, -1, 10.0], 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        boolean boolean25 = pilha0.vazia();
        int int26 = pilha0.tamanho();
        int int27 = pilha0.tamanho();
        pilha0.topo = 32;
        boolean boolean30 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        boolean boolean23 = pilha0.vazia();
        int int24 = pilha0.topo;
        pilha0.topo = 2;
        int int27 = pilha0.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha30.item = objArray35;
        pilha28.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha40.item = objArray45;
        pilha38.item = objArray45;
        boolean boolean48 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (byte) -1);
        pilha28.empilha((java.lang.Object) pilha38);
        int int52 = pilha28.tamanho();
        int int53 = pilha28.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        java.lang.Object[] objArray56 = pilha54.item;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha57.item = objArray62;
        pilha54.item = objArray62;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        java.lang.Object[] objArray67 = pilha65.item;
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.topo;
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha68.item = objArray73;
        pilha65.item = objArray73;
        ds.Pilha pilha76 = new ds.Pilha();
        java.lang.Object[] objArray77 = pilha76.item;
        pilha65.item = objArray77;
        pilha54.item = objArray77;
        pilha54.empilha((java.lang.Object) '#');
        boolean boolean82 = pilha54.vazia();
        ds.Pilha pilha83 = new ds.Pilha();
        int int84 = pilha83.topo;
        java.lang.Object[] objArray85 = pilha83.item;
        pilha54.empilha((java.lang.Object) objArray85);
        pilha28.item = objArray85;
        pilha0.item = objArray85;
        java.lang.Object obj89 = pilha0.desempilha();
        int int90 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = pilha0.item;
        boolean boolean28 = pilha0.vazia();
        boolean boolean29 = pilha0.vazia();
        boolean boolean30 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) 100;
        int int8 = pilha0.topo;
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = (byte) 100;
        java.lang.Object obj4 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 1;
        pilha0.topo = 9;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.topo;
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        pilha14.topo = 0;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        int int20 = pilha18.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha23.item = objArray28;
        pilha21.item = objArray28;
        pilha18.item = objArray28;
        pilha14.item = objArray28;
        pilha0.empilha((java.lang.Object) pilha14);
        java.lang.Object[] objArray34 = pilha14.item;
        boolean boolean35 = pilha14.vazia();
        pilha14.topo = 35;
        boolean boolean38 = pilha14.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean28 = pilha0.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        int int31 = pilha29.topo;
        int int32 = pilha29.tamanho();
        pilha29.topo = (short) 0;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray37 = pilha35.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha38.item = objArray43;
        pilha35.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha35.item = objArray47;
        pilha29.item = objArray47;
        pilha0.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        int int53 = pilha51.topo;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha56.item = objArray61;
        pilha54.item = objArray61;
        pilha51.item = objArray61;
        java.lang.Object[] objArray65 = pilha51.item;
        boolean boolean66 = pilha51.vazia();
        pilha51.topo = (byte) 0;
        int int69 = pilha51.topo;
        pilha29.empilha((java.lang.Object) pilha51);
        java.lang.Object[] objArray71 = pilha51.item;
        java.lang.Object[] objArray72 = pilha51.item;
        int int73 = pilha51.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        boolean boolean23 = pilha0.vazia();
        boolean boolean24 = pilha0.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha25.item = objArray32;
        boolean boolean35 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (byte) -1);
        int int38 = pilha25.topo;
        pilha0.empilha((java.lang.Object) int38);
        java.lang.Object obj40 = pilha0.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha43.item = objArray48;
        pilha41.item = objArray48;
        boolean boolean51 = pilha41.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        java.lang.Object[] objArray54 = pilha52.item;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha52.item = objArray60;
        pilha41.item = objArray60;
        ds.Pilha pilha64 = new ds.Pilha();
        int int65 = pilha64.topo;
        java.lang.Object[] objArray66 = pilha64.item;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.topo;
        java.lang.Object[] objArray72 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha67.item = objArray72;
        pilha64.item = objArray72;
        java.lang.Object[] objArray75 = pilha64.item;
        pilha41.item = objArray75;
        java.lang.Object[] objArray77 = pilha41.item;
        pilha0.empilha((java.lang.Object) pilha41);
        pilha41.topo = 3;
        ds.Pilha pilha81 = new ds.Pilha();
        int int82 = pilha81.tamanho();
        int int83 = pilha81.topo;
        int int84 = pilha81.tamanho();
        java.lang.Object[] objArray85 = pilha81.item;
        pilha41.item = objArray85;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        boolean boolean25 = pilha0.vazia();
        int int26 = pilha0.tamanho();
        int int27 = pilha0.tamanho();
        pilha0.topo = 32;
        int int30 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int13 = pilha0.topo;
        java.lang.Object[] objArray14 = pilha0.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha17.item = objArray22;
        pilha15.item = objArray22;
        int int25 = pilha15.tamanho();
        java.lang.Object[] objArray26 = pilha15.item;
        int int27 = pilha15.topo;
        int int28 = pilha15.topo;
        pilha15.topo = (short) 0;
        pilha15.topo = (byte) -1;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha36.item = objArray41;
        pilha33.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha33.item = objArray45;
        pilha33.topo = (short) -1;
        java.lang.Object[] objArray49 = pilha33.item;
        pilha15.item = objArray49;
        java.lang.Object[] objArray51 = pilha15.item;
        pilha0.item = objArray51;
        pilha0.topo = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        int int27 = pilha0.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        int int36 = pilha28.tamanho();
        pilha0.empilha((java.lang.Object) pilha28);
        int int38 = pilha0.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray41 = pilha39.item;
        boolean boolean42 = pilha39.vazia();
        java.lang.Object[] objArray43 = pilha39.item;
        java.lang.Object[] objArray44 = pilha39.item;
        java.lang.Object[] objArray45 = pilha39.item;
        pilha0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
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
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        pilha0.topo = (short) 1;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha18.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha18.item = objArray30;
        pilha0.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha35.item = objArray40;
        pilha33.item = objArray40;
        boolean boolean43 = pilha33.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray46 = pilha44.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha47.item = objArray52;
        pilha44.item = objArray52;
        pilha33.item = objArray52;
        pilha0.item = objArray52;
        int int57 = pilha0.tamanho();
        boolean boolean58 = pilha0.vazia();
        int int59 = pilha0.topo;
        pilha0.topo = 96;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray4 = pilha2.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha2.item = objArray10;
        pilha0.item = objArray10;
        pilha0.topo = 3;
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 35;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        int int14 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        pilha0.topo = '#';
        int int18 = pilha0.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        int int21 = pilha19.topo;
        int int22 = pilha19.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean28 = pilha0.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        int int31 = pilha29.topo;
        int int32 = pilha29.tamanho();
        pilha29.topo = (short) 0;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray37 = pilha35.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha38.item = objArray43;
        pilha35.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray47 = pilha46.item;
        pilha35.item = objArray47;
        pilha29.item = objArray47;
        pilha0.empilha((java.lang.Object) pilha29);
        int int51 = pilha29.topo;
        pilha29.topo = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = pilha29.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        int int27 = pilha0.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        int int36 = pilha28.tamanho();
        pilha0.empilha((java.lang.Object) pilha28);
        int int38 = pilha28.topo;
        pilha28.topo = (byte) -1;
        boolean boolean41 = pilha28.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, -1, 10.0]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        int int14 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        int int18 = pilha16.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha19.item = objArray26;
        pilha16.item = objArray26;
        pilha7.empilha((java.lang.Object) pilha16);
        java.lang.Object[] objArray31 = pilha16.item;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        int int34 = pilha32.tamanho();
        int int35 = pilha32.topo;
        boolean boolean36 = pilha32.vazia();
        boolean boolean37 = pilha32.vazia();
        pilha16.empilha((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        java.lang.Object[] objArray6 = pilha4.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        pilha4.item = objArray12;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        java.lang.Object[] objArray17 = pilha15.item;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha18.item = objArray23;
        pilha15.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        pilha15.item = objArray27;
        pilha4.item = objArray27;
        pilha4.empilha((java.lang.Object) '#');
        boolean boolean32 = pilha4.vazia();
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        pilha4.empilha((java.lang.Object) objArray35);
        pilha0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        java.lang.Object[] objArray22 = pilha11.item;
        pilha0.empilha((java.lang.Object) objArray22);
        pilha0.topo = (byte) -1;
        pilha0.topo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[100, -1, 10.0], -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, -1, 10.0]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha17.item = objArray24;
        boolean boolean27 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray30 = pilha17.item;
        pilha6.empilha((java.lang.Object) pilha17);
        int int32 = pilha17.topo;
        int int33 = pilha17.tamanho();
        boolean boolean34 = pilha17.vazia();
        pilha0.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha38.item = objArray43;
        pilha36.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.topo;
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha48.item = objArray53;
        pilha46.item = objArray53;
        boolean boolean56 = pilha46.vazia();
        pilha46.empilha((java.lang.Object) (byte) -1);
        pilha36.empilha((java.lang.Object) pilha46);
        int int60 = pilha36.tamanho();
        java.lang.Object[] objArray61 = pilha36.item;
        pilha0.item = objArray61;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        pilha0.topo = ' ';
        boolean boolean13 = pilha0.vazia();
        java.lang.Object[] objArray14 = pilha0.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        int int17 = pilha15.topo;
        int int18 = pilha15.tamanho();
        pilha15.topo = (short) 0;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray23 = pilha21.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha24.item = objArray29;
        pilha21.item = objArray29;
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha21.item = objArray33;
        java.lang.Object[] objArray35 = pilha21.item;
        pilha15.item = objArray35;
        pilha0.item = objArray35;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object[] objArray3 = pilha0.item;
        int int4 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha12.item = objArray17;
        pilha10.item = objArray17;
        boolean boolean20 = pilha10.vazia();
        pilha10.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha10);
        int int24 = pilha0.tamanho();
        java.lang.Object[] objArray25 = pilha0.item;
        pilha0.topo = (byte) 100;
        boolean boolean28 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray4 = pilha2.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha2.item = objArray10;
        pilha0.item = objArray10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        boolean boolean28 = pilha26.vazia();
        pilha26.topo = 1;
        int int31 = pilha26.topo;
        java.lang.Class<?> wildcardClass32 = pilha26.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass32);
        int int34 = pilha0.tamanho();
        java.lang.Object[] objArray35 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha30.item = objArray35;
        pilha28.item = objArray35;
        boolean boolean38 = pilha28.vazia();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray41 = pilha39.item;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha42.item = objArray47;
        pilha39.item = objArray47;
        pilha28.item = objArray47;
        java.lang.Object[] objArray51 = pilha28.item;
        boolean boolean52 = pilha28.vazia();
        boolean boolean53 = pilha28.vazia();
        int int54 = pilha28.tamanho();
        java.lang.Object[] objArray55 = pilha28.item;
        pilha0.item = objArray55;
        int int57 = pilha0.topo;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        pilha5.item = objArray12;
        boolean boolean15 = pilha5.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        pilha5.item = objArray24;
        boolean boolean28 = pilha5.vazia();
        int int29 = pilha5.topo;
        pilha5.topo = 2;
        java.lang.Class<?> wildcardClass32 = pilha5.getClass();
        pilha0.empilha((java.lang.Object) pilha5);
        boolean boolean34 = pilha0.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        boolean boolean37 = pilha35.vazia();
        pilha0.empilha((java.lang.Object) pilha35);
        pilha35.topo = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha26.item = objArray31;
        pilha23.item = objArray31;
        java.lang.Object[] objArray34 = pilha23.item;
        pilha0.item = objArray34;
        java.lang.Object[] objArray36 = pilha0.item;
        java.lang.Class<?> wildcardClass37 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        boolean boolean36 = pilha28.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        int int44 = pilha37.topo;
        int int45 = pilha37.tamanho();
        java.lang.Class<?> wildcardClass46 = pilha37.getClass();
        pilha28.empilha((java.lang.Object) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = pilha28.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass48);
        int int50 = pilha0.tamanho();
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha53.item = objArray58;
        pilha51.item = objArray58;
        boolean boolean61 = pilha51.vazia();
        pilha51.empilha((java.lang.Object) (byte) -1);
        int int64 = pilha51.topo;
        java.lang.Object[] objArray65 = pilha51.item;
        pilha0.item = objArray65;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[-1, -1, 10.0]");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        int int14 = pilha11.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        java.lang.Object[] objArray17 = pilha15.item;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha18.item = objArray23;
        pilha15.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray27 = pilha26.item;
        pilha15.item = objArray27;
        pilha15.topo = (short) -1;
        pilha15.topo = (short) 1;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray35 = pilha33.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.topo;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha36.item = objArray41;
        pilha33.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha33.item = objArray45;
        pilha15.item = objArray45;
        java.lang.Object[] objArray48 = pilha15.item;
        pilha11.item = objArray48;
        pilha0.item = objArray48;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        int int13 = pilha0.topo;
        java.lang.Object[] objArray14 = pilha0.item;
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        boolean boolean23 = pilha0.vazia();
        boolean boolean24 = pilha0.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha25.item = objArray32;
        boolean boolean35 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (byte) -1);
        int int38 = pilha25.topo;
        pilha0.empilha((java.lang.Object) int38);
        java.lang.Object obj40 = pilha0.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha43.item = objArray48;
        pilha41.item = objArray48;
        boolean boolean51 = pilha41.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        java.lang.Object[] objArray54 = pilha52.item;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha52.item = objArray60;
        pilha41.item = objArray60;
        ds.Pilha pilha64 = new ds.Pilha();
        int int65 = pilha64.topo;
        java.lang.Object[] objArray66 = pilha64.item;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.topo;
        java.lang.Object[] objArray72 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha67.item = objArray72;
        pilha64.item = objArray72;
        java.lang.Object[] objArray75 = pilha64.item;
        pilha41.item = objArray75;
        java.lang.Object[] objArray77 = pilha41.item;
        pilha0.empilha((java.lang.Object) pilha41);
        boolean boolean79 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean13 = pilha0.vazia();
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        pilha5.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha16.item = objArray28;
        pilha5.item = objArray28;
        pilha5.empilha((java.lang.Object) '#');
        boolean boolean33 = pilha5.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray36 = pilha34.item;
        pilha5.empilha((java.lang.Object) objArray36);
        pilha0.item = objArray36;
        java.lang.Object[] objArray39 = pilha0.item;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha42.item = objArray47;
        pilha40.item = objArray47;
        boolean boolean50 = pilha40.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        java.lang.Object[] objArray53 = pilha51.item;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha54.item = objArray59;
        pilha51.item = objArray59;
        pilha40.item = objArray59;
        java.lang.Object[] objArray63 = pilha40.item;
        boolean boolean64 = pilha40.vazia();
        int int65 = pilha40.tamanho();
        int int66 = pilha40.topo;
        java.lang.Object[] objArray67 = pilha40.item;
        boolean boolean68 = pilha40.vazia();
        pilha0.empilha((java.lang.Object) boolean68);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        int int14 = pilha0.topo;
        int int15 = pilha0.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha23.item = objArray28;
        int int30 = pilha23.topo;
        pilha16.empilha((java.lang.Object) pilha23);
        pilha16.topo = '#';
        java.lang.Object[] objArray34 = pilha16.item;
        pilha0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.topo;
        pilha0.empilha((java.lang.Object) int19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = pilha0.item;
        pilha0.topo = (short) 0;
        boolean boolean30 = pilha0.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha33.item = objArray38;
        pilha31.item = objArray38;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha43.item = objArray48;
        pilha41.item = objArray48;
        boolean boolean51 = pilha41.vazia();
        pilha41.empilha((java.lang.Object) (byte) -1);
        pilha31.empilha((java.lang.Object) pilha41);
        int int55 = pilha41.topo;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.topo;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.topo;
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha58.item = objArray63;
        pilha56.item = objArray63;
        boolean boolean66 = pilha56.vazia();
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.topo;
        java.lang.Object[] objArray69 = pilha67.item;
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.topo;
        java.lang.Object[] objArray75 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha70.item = objArray75;
        pilha67.item = objArray75;
        pilha56.item = objArray75;
        pilha41.item = objArray75;
        pilha0.empilha((java.lang.Object) objArray75);
        int int81 = pilha0.tamanho();
        java.lang.Object obj82 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[100, -1, 10.0], [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[100, -1, 10.0], [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[100, -1, 10.0], [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.topo;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        int int28 = pilha0.tamanho();
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        int int14 = pilha7.topo;
        pilha0.empilha((java.lang.Object) pilha7);
        pilha0.topo = '#';
        int int18 = pilha0.tamanho();
        pilha0.topo = (byte) 0;
        int int21 = pilha0.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray24 = pilha22.item;
        int int25 = pilha22.tamanho();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray28 = pilha26.item;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha29.item = objArray34;
        pilha26.item = objArray34;
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray38 = pilha37.item;
        pilha26.item = objArray38;
        pilha26.topo = (short) -1;
        pilha26.topo = (short) 1;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray46 = pilha44.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha47.item = objArray52;
        pilha44.item = objArray52;
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray56 = pilha55.item;
        pilha44.item = objArray56;
        pilha26.item = objArray56;
        java.lang.Object[] objArray59 = pilha26.item;
        pilha22.item = objArray59;
        pilha22.topo = 'a';
        pilha0.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        pilha0.topo = (short) 1;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha18.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha18.item = objArray30;
        pilha0.item = objArray30;
        java.lang.Object[] objArray33 = pilha0.item;
        int int34 = pilha0.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        java.lang.Object[] objArray37 = pilha35.item;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        int int40 = pilha38.topo;
        int int41 = pilha38.tamanho();
        java.lang.Object[] objArray42 = pilha38.item;
        pilha35.empilha((java.lang.Object) objArray42);
        pilha0.item = objArray42;
        int int45 = pilha0.topo;
        boolean boolean46 = pilha0.vazia();
        boolean boolean47 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        java.lang.Object[] objArray3 = pilha0.item;
        pilha0.topo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) 100;
        pilha0.topo = '#';
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0f);
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 1;
        pilha0.topo = (short) 100;
        boolean boolean19 = pilha0.vazia();
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha0.item = objArray15;
        java.lang.Object[] objArray17 = pilha0.item;
        pilha0.topo = 0;
        int int20 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        boolean boolean36 = pilha28.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        int int44 = pilha37.topo;
        int int45 = pilha37.tamanho();
        java.lang.Class<?> wildcardClass46 = pilha37.getClass();
        pilha28.empilha((java.lang.Object) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = pilha28.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass48);
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        int int52 = pilha50.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha53.item = objArray60;
        pilha50.item = objArray60;
        java.lang.Object[] objArray64 = pilha50.item;
        pilha0.item = objArray64;
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.tamanho();
        java.lang.Object[] objArray68 = pilha66.item;
        int int69 = pilha66.tamanho();
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.tamanho();
        int int72 = pilha70.topo;
        int int73 = pilha70.tamanho();
        pilha70.topo = (short) 0;
        ds.Pilha pilha76 = new ds.Pilha();
        int int77 = pilha76.topo;
        java.lang.Object[] objArray78 = pilha76.item;
        ds.Pilha pilha79 = new ds.Pilha();
        int int80 = pilha79.topo;
        java.lang.Object[] objArray84 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha79.item = objArray84;
        pilha76.item = objArray84;
        ds.Pilha pilha87 = new ds.Pilha();
        java.lang.Object[] objArray88 = pilha87.item;
        pilha76.item = objArray88;
        pilha70.item = objArray88;
        pilha66.item = objArray88;
        java.lang.Object[] objArray92 = pilha66.item;
        pilha0.item = objArray92;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        boolean boolean2 = pilha0.vazia();
        java.lang.Object[] objArray3 = pilha0.item;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        java.lang.Object[] objArray6 = pilha4.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha7.item = objArray12;
        pilha4.item = objArray12;
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha4.item = objArray16;
        java.lang.Object[] objArray18 = pilha4.item;
        pilha0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (-1);
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        pilha6.item = objArray13;
        boolean boolean16 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray19 = pilha6.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha22.item = objArray27;
        pilha20.item = objArray27;
        int int30 = pilha20.tamanho();
        java.lang.Object[] objArray31 = pilha20.item;
        pilha6.empilha((java.lang.Object) objArray31);
        java.lang.Object[] objArray33 = pilha6.item;
        boolean boolean34 = pilha6.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        int int37 = pilha35.tamanho();
        java.lang.Object[] objArray38 = pilha35.item;
        pilha6.item = objArray38;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = pilha0.item;
        pilha0.topo = 0;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray32 = pilha30.item;
        int int33 = pilha30.tamanho();
        int int34 = pilha30.topo;
        java.lang.Object[] objArray35 = pilha30.item;
        pilha30.topo = (byte) 100;
        java.lang.Object[] objArray38 = pilha30.item;
        pilha0.empilha((java.lang.Object) pilha30);
        int int40 = pilha30.topo;
        pilha30.topo = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        int int5 = pilha3.topo;
        int int6 = pilha3.tamanho();
        java.lang.Object[] objArray7 = pilha3.item;
        pilha0.empilha((java.lang.Object) objArray7);
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        java.lang.Object obj28 = pilha0.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha29.item = objArray34;
        int int36 = pilha29.topo;
        boolean boolean37 = pilha29.vazia();
        pilha29.topo = 0;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        java.lang.Object[] objArray42 = pilha40.item;
        int int43 = pilha40.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray46 = pilha44.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha47.item = objArray52;
        pilha44.item = objArray52;
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray56 = pilha55.item;
        pilha44.item = objArray56;
        pilha44.topo = (short) -1;
        pilha44.topo = (short) 1;
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.topo;
        java.lang.Object[] objArray64 = pilha62.item;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.topo;
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha65.item = objArray70;
        pilha62.item = objArray70;
        ds.Pilha pilha73 = new ds.Pilha();
        java.lang.Object[] objArray74 = pilha73.item;
        pilha62.item = objArray74;
        pilha44.item = objArray74;
        java.lang.Object[] objArray77 = pilha44.item;
        pilha40.item = objArray77;
        pilha29.item = objArray77;
        pilha0.empilha((java.lang.Object) pilha29);
        java.lang.Object obj81 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '#' + "'", obj28, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(obj81);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        int int7 = pilha5.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha10.item = objArray15;
        pilha8.item = objArray15;
        pilha5.item = objArray15;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray20 = pilha19.item;
        pilha19.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        int int25 = pilha23.topo;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        pilha26.item = objArray33;
        pilha23.item = objArray33;
        pilha19.item = objArray33;
        pilha5.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray39 = pilha19.item;
        pilha0.empilha((java.lang.Object) pilha19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100, -1, 10.0]");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.topo;
        pilha0.topo = 0;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        int int19 = pilha17.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha22.item = objArray27;
        pilha20.item = objArray27;
        pilha17.item = objArray27;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray32 = pilha31.item;
        pilha31.topo = 0;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        int int37 = pilha35.topo;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha40.item = objArray45;
        pilha38.item = objArray45;
        pilha35.item = objArray45;
        pilha31.item = objArray45;
        pilha17.empilha((java.lang.Object) pilha31);
        java.lang.Object[] objArray51 = pilha31.item;
        int int52 = pilha31.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha53.item = objArray60;
        boolean boolean63 = pilha53.vazia();
        pilha53.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray66 = pilha53.item;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.topo;
        ds.Pilha pilha69 = new ds.Pilha();
        int int70 = pilha69.topo;
        java.lang.Object[] objArray74 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha69.item = objArray74;
        pilha67.item = objArray74;
        int int77 = pilha67.tamanho();
        java.lang.Object[] objArray78 = pilha67.item;
        pilha53.empilha((java.lang.Object) objArray78);
        java.lang.Object[] objArray80 = pilha53.item;
        boolean boolean81 = pilha53.vazia();
        ds.Pilha pilha82 = new ds.Pilha();
        java.lang.Object[] objArray83 = pilha82.item;
        int int84 = pilha82.tamanho();
        java.lang.Object[] objArray85 = pilha82.item;
        pilha53.item = objArray85;
        pilha31.item = objArray85;
        pilha0.item = objArray85;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[-1, [100, -1, 10.0], 10.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        pilha0.topo = 9;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        java.lang.Object[] objArray11 = pilha7.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.topo;
        java.lang.Object[] objArray14 = pilha12.item;
        int int15 = pilha12.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha16.item = objArray28;
        pilha16.topo = (short) -1;
        pilha16.topo = (short) 1;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray36 = pilha34.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        pilha34.item = objArray42;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray46 = pilha45.item;
        pilha34.item = objArray46;
        pilha16.item = objArray46;
        java.lang.Object[] objArray49 = pilha16.item;
        pilha12.item = objArray49;
        pilha7.item = objArray49;
        java.lang.Class<?> wildcardClass52 = objArray49.getClass();
        pilha0.empilha((java.lang.Object) objArray49);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        int int16 = pilha9.topo;
        boolean boolean17 = pilha9.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha9.empilha((java.lang.Object) pilha18);
        pilha9.topo = (short) 100;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        java.lang.Object[] objArray27 = pilha25.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        pilha25.item = objArray33;
        pilha23.item = objArray33;
        pilha9.item = objArray33;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.topo;
        java.lang.Object[] objArray40 = pilha38.item;
        boolean boolean41 = pilha38.vazia();
        java.lang.Object[] objArray42 = pilha38.item;
        pilha9.item = objArray42;
        pilha0.item = objArray42;
        boolean boolean45 = pilha0.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.topo;
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha48.item = objArray53;
        pilha46.item = objArray53;
        boolean boolean56 = pilha46.vazia();
        pilha46.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha59 = new ds.Pilha();
        java.lang.Object[] objArray60 = pilha59.item;
        pilha59.topo = 0;
        int int63 = pilha59.tamanho();
        pilha46.empilha((java.lang.Object) pilha59);
        boolean boolean65 = pilha59.vazia();
        pilha59.topo = ' ';
        boolean boolean68 = pilha59.vazia();
        java.lang.Class<?> wildcardClass69 = pilha59.getClass();
        pilha0.empilha((java.lang.Object) pilha59);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        pilha0.empilha((java.lang.Object) 0);
        java.lang.Object obj29 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, [100, -1, 10.0], 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [100, -1, 10.0], 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        int int28 = pilha21.topo;
        pilha14.empilha((java.lang.Object) pilha21);
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        int int32 = pilha30.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha35.item = objArray40;
        pilha33.item = objArray40;
        pilha30.item = objArray40;
        pilha21.empilha((java.lang.Object) pilha30);
        boolean boolean45 = pilha21.vazia();
        pilha0.empilha((java.lang.Object) pilha21);
        int int47 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha6.item = objArray11;
        pilha4.item = objArray11;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        boolean boolean24 = pilha14.vazia();
        pilha14.empilha((java.lang.Object) (byte) -1);
        pilha4.empilha((java.lang.Object) pilha14);
        int int28 = pilha14.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha31.item = objArray36;
        pilha29.item = objArray36;
        boolean boolean39 = pilha29.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.topo;
        java.lang.Object[] objArray42 = pilha40.item;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.topo;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha43.item = objArray48;
        pilha40.item = objArray48;
        pilha29.item = objArray48;
        pilha14.item = objArray48;
        pilha0.empilha((java.lang.Object) objArray48);
        pilha0.topo = (short) 100;
        java.lang.Class<?> wildcardClass56 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 1;
        int int5 = pilha0.topo;
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha6.item = objArray18;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray23 = pilha0.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray26 = pilha24.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha24.item = objArray32;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        pilha35.item = objArray42;
        boolean boolean45 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray48 = pilha35.item;
        pilha24.empilha((java.lang.Object) pilha35);
        int int50 = pilha35.topo;
        int int51 = pilha35.topo;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.topo;
        boolean boolean54 = pilha52.vazia();
        java.lang.Object[] objArray55 = pilha52.item;
        pilha35.item = objArray55;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.topo;
        int int59 = pilha57.topo;
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.topo;
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.topo;
        java.lang.Object[] objArray67 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha62.item = objArray67;
        pilha60.item = objArray67;
        boolean boolean70 = pilha60.vazia();
        pilha60.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray73 = pilha60.item;
        pilha57.item = objArray73;
        pilha35.item = objArray73;
        java.lang.Object[] objArray76 = pilha35.item;
        pilha0.item = objArray76;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[-1, -1, 10.0]");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) pilha9);
        pilha0.topo = (short) 100;
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray15 = pilha14.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        pilha14.item = objArray24;
        pilha0.item = objArray24;
        boolean boolean29 = pilha0.vazia();
        java.lang.Object[] objArray30 = pilha0.item;
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100, -1, 10.0]");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha6.item = objArray18;
        pilha0.item = objArray18;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray23 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.tamanho();
        java.lang.Object[] objArray3 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        pilha5.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.topo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha19.item = objArray24;
        pilha16.item = objArray24;
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray28 = pilha27.item;
        pilha16.item = objArray28;
        pilha5.item = objArray28;
        pilha5.empilha((java.lang.Object) '#');
        boolean boolean33 = pilha5.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray36 = pilha34.item;
        pilha5.empilha((java.lang.Object) objArray36);
        pilha0.item = objArray36;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        pilha0.topo = (byte) -1;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        int int32 = pilha30.tamanho();
        java.lang.Object[] objArray33 = pilha30.item;
        pilha0.item = objArray33;
        int int35 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        int int7 = pilha5.topo;
        int int8 = pilha5.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        int int11 = pilha9.tamanho();
        java.lang.Object[] objArray12 = pilha9.item;
        pilha5.item = objArray12;
        pilha5.topo = (-1);
        pilha0.empilha((java.lang.Object) pilha5);
        boolean boolean17 = pilha0.vazia();
        boolean boolean18 = pilha0.vazia();
        int int19 = pilha0.topo;
        java.lang.Object obj20 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        int int28 = pilha21.topo;
        pilha14.empilha((java.lang.Object) pilha21);
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        int int32 = pilha30.topo;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha35.item = objArray40;
        pilha33.item = objArray40;
        pilha30.item = objArray40;
        pilha21.empilha((java.lang.Object) pilha30);
        boolean boolean45 = pilha21.vazia();
        pilha0.empilha((java.lang.Object) pilha21);
        int int47 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray12 = pilha11.item;
        pilha0.item = objArray12;
        pilha0.topo = (short) -1;
        pilha0.topo = (short) 1;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha18.item = objArray26;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha18.item = objArray30;
        pilha0.item = objArray30;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.topo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha35.item = objArray40;
        pilha33.item = objArray40;
        boolean boolean43 = pilha33.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.topo;
        java.lang.Object[] objArray46 = pilha44.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha47.item = objArray52;
        pilha44.item = objArray52;
        pilha33.item = objArray52;
        pilha0.item = objArray52;
        java.lang.Object obj57 = pilha0.desempilha();
        java.lang.Object[] objArray58 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 100 + "'", obj57, (short) 100);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[100, -1, 10.0]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha10.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha17.item = objArray22;
        int int24 = pilha17.topo;
        pilha10.empilha((java.lang.Object) pilha17);
        pilha10.topo = '#';
        java.lang.Object[] objArray28 = pilha10.item;
        pilha0.item = objArray28;
        java.lang.Object[] objArray30 = pilha0.item;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        java.lang.Object[] objArray33 = pilha31.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha34.item = objArray39;
        pilha31.item = objArray39;
        pilha31.topo = ' ';
        pilha0.empilha((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[ , -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[ , -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[ , -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[ , -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[ , -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[ , -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100, -1, 10.0]");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha14.item = objArray21;
        int int24 = pilha14.tamanho();
        java.lang.Object[] objArray25 = pilha14.item;
        pilha0.empilha((java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = pilha0.item;
        pilha0.topo = 0;
        int int30 = pilha0.topo;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        java.lang.Object[] objArray33 = pilha31.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.topo;
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha34.item = objArray39;
        pilha31.item = objArray39;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray44 = pilha42.item;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.topo;
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha45.item = objArray50;
        pilha42.item = objArray50;
        java.lang.Object[] objArray53 = pilha42.item;
        pilha31.empilha((java.lang.Object) objArray53);
        pilha31.topo = (byte) -1;
        int int57 = pilha31.tamanho();
        int int58 = pilha31.topo;
        pilha0.empilha((java.lang.Object) pilha31);
        boolean boolean60 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[[100, -1, 10.0], -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha3.item = objArray8;
        pilha0.item = objArray8;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha11.item = objArray23;
        pilha0.item = objArray23;
        pilha0.empilha((java.lang.Object) '#');
        boolean boolean28 = pilha0.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray31 = pilha29.item;
        pilha0.empilha((java.lang.Object) objArray31);
        boolean boolean33 = pilha0.vazia();
        java.lang.Class<?> wildcardClass34 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        int int5 = pilha3.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha8.item = objArray13;
        pilha6.item = objArray13;
        pilha3.item = objArray13;
        boolean boolean17 = pilha3.vazia();
        pilha3.topo = 1;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha22.item = objArray27;
        pilha20.item = objArray27;
        boolean boolean30 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray33 = pilha20.item;
        int int34 = pilha20.topo;
        java.lang.Object[] objArray35 = pilha20.item;
        pilha3.item = objArray35;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha39.item = objArray44;
        pilha37.item = objArray44;
        boolean boolean47 = pilha37.vazia();
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.topo;
        java.lang.Object[] objArray50 = pilha48.item;
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.topo;
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha51.item = objArray56;
        pilha48.item = objArray56;
        pilha37.item = objArray56;
        java.lang.Object[] objArray60 = pilha37.item;
        boolean boolean61 = pilha37.vazia();
        int int62 = pilha37.tamanho();
        int int63 = pilha37.topo;
        java.lang.Object[] objArray64 = pilha37.item;
        pilha3.item = objArray64;
        java.lang.Object[] objArray66 = pilha3.item;
        pilha0.empilha((java.lang.Object) objArray66);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[100, -1, 10.0]");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        pilha0.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = null;
        pilha0.item = objArray27;
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        int int10 = pilha0.tamanho();
        java.lang.Object[] objArray11 = pilha0.item;
        int int12 = pilha0.topo;
        int int13 = pilha0.topo;
        pilha0.topo = (short) 0;
        int int16 = pilha0.topo;
        boolean boolean17 = pilha0.vazia();
        boolean boolean18 = pilha0.vazia();
        pilha0.topo = (short) 0;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha23.item = objArray28;
        pilha21.item = objArray28;
        boolean boolean31 = pilha21.vazia();
        pilha21.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        java.lang.Object[] objArray36 = pilha34.item;
        pilha21.item = objArray36;
        pilha0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.topo;
        java.lang.Object[] objArray8 = pilha6.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha9.item = objArray14;
        pilha6.item = objArray14;
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        pilha6.item = objArray18;
        pilha0.item = objArray18;
        int int21 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray14 = pilha0.item;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.topo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha21.item = objArray26;
        pilha18.item = objArray26;
        pilha18.topo = ' ';
        boolean boolean31 = pilha18.vazia();
        java.lang.Object[] objArray32 = pilha18.item;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        int int35 = pilha33.topo;
        int int36 = pilha33.tamanho();
        pilha33.topo = (short) 0;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.topo;
        java.lang.Object[] objArray41 = pilha39.item;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha42.item = objArray47;
        pilha39.item = objArray47;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha39.item = objArray51;
        java.lang.Object[] objArray53 = pilha39.item;
        pilha33.item = objArray53;
        pilha18.item = objArray53;
        pilha0.item = objArray53;
        int int57 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        pilha0.topo = (-1);
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        pilha0.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = null;
        pilha0.item = objArray27;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha29.item = objArray34;
        int int36 = pilha29.topo;
        boolean boolean37 = pilha29.vazia();
        java.lang.Object[] objArray38 = pilha29.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100, -1, 10.0]");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.topo;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        java.lang.Object[] objArray28 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1, 10.0]");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.topo;
        java.lang.Object[] objArray9 = pilha7.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha10.item = objArray15;
        pilha7.item = objArray15;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray19 = pilha18.item;
        pilha7.item = objArray19;
        pilha7.topo = (short) -1;
        pilha7.topo = (short) 1;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.topo;
        java.lang.Object[] objArray27 = pilha25.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        pilha25.item = objArray33;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray37 = pilha36.item;
        pilha25.item = objArray37;
        pilha7.item = objArray37;
        java.lang.Object[] objArray40 = pilha7.item;
        int int41 = pilha7.topo;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        java.lang.Object[] objArray44 = pilha42.item;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        int int47 = pilha45.topo;
        int int48 = pilha45.tamanho();
        java.lang.Object[] objArray49 = pilha45.item;
        pilha42.empilha((java.lang.Object) objArray49);
        pilha7.item = objArray49;
        pilha0.item = objArray49;
        pilha0.topo = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray5 = pilha4.item;
        int int6 = pilha4.tamanho();
        java.lang.Object[] objArray7 = pilha4.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray11 = pilha9.item;
        int int12 = pilha9.tamanho();
        int int13 = pilha9.topo;
        java.lang.Object[] objArray14 = pilha9.item;
        pilha9.topo = (byte) 100;
        java.lang.Object[] objArray17 = pilha9.item;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha20.item = objArray25;
        pilha18.item = objArray25;
        boolean boolean28 = pilha18.vazia();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.topo;
        java.lang.Object[] objArray31 = pilha29.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha32.item = objArray37;
        pilha29.item = objArray37;
        pilha18.item = objArray37;
        java.lang.Object[] objArray41 = pilha18.item;
        boolean boolean42 = pilha18.vazia();
        int int43 = pilha18.tamanho();
        boolean boolean44 = pilha18.vazia();
        int int45 = pilha18.tamanho();
        java.lang.Object[] objArray46 = pilha18.item;
        pilha9.item = objArray46;
        pilha0.item = objArray46;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100, -1, 10.0]");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 10;
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        boolean boolean10 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha16.item = objArray21;
        pilha13.item = objArray21;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        java.lang.Object[] objArray26 = pilha24.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.topo;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha27.item = objArray32;
        pilha24.item = objArray32;
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray36 = pilha35.item;
        pilha24.item = objArray36;
        pilha13.item = objArray36;
        pilha13.empilha((java.lang.Object) '#');
        boolean boolean41 = pilha13.vazia();
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.topo;
        java.lang.Object[] objArray44 = pilha42.item;
        pilha13.empilha((java.lang.Object) objArray44);
        pilha8.item = objArray44;
        pilha0.empilha((java.lang.Object) objArray44);
        int int48 = pilha0.topo;
        int int49 = pilha0.tamanho();
        pilha0.topo = 100;
        boolean boolean52 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (short) 100;
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.topo;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        pilha0.topo = 0;
        boolean boolean30 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha0.item = objArray5;
        int int7 = pilha0.topo;
        boolean boolean8 = pilha0.vazia();
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha11.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha18.item = objArray23;
        int int25 = pilha18.topo;
        pilha11.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        int int29 = pilha27.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.topo;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha32.item = objArray37;
        pilha30.item = objArray37;
        pilha27.item = objArray37;
        pilha18.empilha((java.lang.Object) pilha27);
        java.lang.Object[] objArray42 = pilha27.item;
        pilha0.item = objArray42;
        boolean boolean44 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.topo;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha5.item = objArray10;
        pilha3.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray14 = pilha0.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha15.item = objArray20;
        int int22 = pilha15.topo;
        int int23 = pilha15.tamanho();
        pilha0.empilha((java.lang.Object) int23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        int int3 = pilha0.tamanho();
        pilha0.topo = (short) 0;
        pilha0.topo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.tamanho();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (byte) 100;
        pilha0.topo = '#';
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.topo;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha2.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.topo;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha14.item = objArray19;
        pilha11.item = objArray19;
        pilha0.item = objArray19;
        java.lang.Object[] objArray23 = pilha0.item;
        boolean boolean24 = pilha0.vazia();
        int int25 = pilha0.tamanho();
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha28.item = objArray33;
        int int35 = pilha28.topo;
        boolean boolean36 = pilha28.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.topo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha37.item = objArray42;
        int int44 = pilha37.topo;
        int int45 = pilha37.tamanho();
        java.lang.Class<?> wildcardClass46 = pilha37.getClass();
        pilha28.empilha((java.lang.Object) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = pilha28.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass48);
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        int int52 = pilha50.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.topo;
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 100, (-1), 10.0d };
        pilha55.item = objArray60;
        pilha53.item = objArray60;
        pilha50.item = objArray60;
        java.lang.Object[] objArray64 = pilha50.item;
        pilha0.item = objArray64;
        int int66 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.Pilha, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100, -1, 10.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[100, -1, 10.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }
}


package ds.seed5482;

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
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = 101;
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        int int33 = pilha0.topo;
        int int34 = pilha0.topo;
        int int35 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 98 + "'", int35 == 98);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object obj20 = pilha14.desempilha();
        java.lang.Object[] objArray21 = pilha14.item;
        pilha8.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha23.topo = 1;
        int int31 = pilha23.tamanho();
        java.lang.Object[] objArray32 = pilha23.item;
        pilha14.item = objArray32;
        boolean boolean34 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        pilha0.topo = (short) -1;
        int int38 = pilha0.topo;
        boolean boolean39 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        int int29 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        java.lang.Object[] objArray9 = pilha7.item;
        pilha7.topo = 'a';
        ds.Pilha pilha12 = new ds.Pilha();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        boolean boolean17 = pilha13.vazia();
        java.lang.Object[] objArray18 = pilha13.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        int int23 = pilha19.tamanho();
        boolean boolean24 = pilha19.vazia();
        pilha19.topo = 0;
        pilha19.topo = 100;
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        int int31 = pilha29.tamanho();
        boolean boolean32 = pilha29.vazia();
        java.lang.Object[] objArray33 = pilha29.item;
        pilha29.topo = 0;
        java.lang.Object[] objArray36 = pilha29.item;
        pilha19.item = objArray36;
        pilha13.item = objArray36;
        pilha12.item = objArray36;
        pilha7.empilha((java.lang.Object) objArray36);
        pilha0.item = objArray36;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        java.lang.Object[] objArray44 = pilha42.item;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        java.lang.Object obj49 = pilha45.desempilha();
        pilha42.empilha(obj49);
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        java.lang.Object[] objArray53 = pilha51.item;
        pilha51.topo = 'a';
        java.lang.Object[] objArray56 = pilha51.item;
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.tamanho();
        pilha57.empilha((java.lang.Object) true);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        java.lang.Object[] objArray63 = pilha61.item;
        pilha57.item = objArray63;
        pilha51.empilha((java.lang.Object) objArray63);
        pilha42.item = objArray63;
        ds.Pilha pilha67 = new ds.Pilha();
        boolean boolean68 = pilha67.vazia();
        int int69 = pilha67.tamanho();
        boolean boolean70 = pilha67.vazia();
        int int71 = pilha67.topo;
        pilha42.empilha((java.lang.Object) pilha67);
        ds.Pilha pilha73 = new ds.Pilha();
        boolean boolean74 = pilha73.vazia();
        pilha73.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha77 = new ds.Pilha();
        int int78 = pilha77.tamanho();
        ds.Pilha pilha79 = new ds.Pilha();
        java.lang.Object[] objArray82 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha79.item = objArray82;
        pilha77.item = objArray82;
        pilha73.item = objArray82;
        pilha42.item = objArray82;
        pilha0.empilha((java.lang.Object) pilha42);
        ds.Pilha pilha88 = new ds.Pilha();
        int int89 = pilha88.tamanho();
        pilha88.topo = 'a';
        java.lang.Object obj92 = pilha88.desempilha();
        int int93 = pilha88.topo;
        java.lang.Object[] objArray94 = pilha88.item;
        pilha0.item = objArray94;
        boolean boolean96 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 96 + "'", int93 == 96);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        pilha0.topo = 97;
        int int23 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        boolean boolean12 = pilha0.vazia();
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1), objArray24, (short) 100, (short) 100, 0.0d };
        pilha16.item = objArray29;
        pilha0.item = objArray29;
        java.lang.Object[] objArray32 = pilha0.item;
        boolean boolean33 = pilha0.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.topo = 'a';
        java.lang.Object obj38 = pilha34.desempilha();
        int int39 = pilha34.topo;
        java.lang.Object[] objArray40 = pilha34.item;
        pilha0.item = objArray40;
        java.lang.Class<?> wildcardClass42 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 96 + "'", int39 == 96);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1), objArray14, (short) 100, (short) 100, 0.0d };
        pilha6.item = objArray19;
        java.lang.Object obj21 = pilha6.desempilha();
        java.lang.Object[] objArray22 = pilha6.item;
        pilha6.topo = (byte) 0;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.topo = 'a';
        java.lang.Object obj29 = pilha25.desempilha();
        int int30 = pilha25.topo;
        pilha25.topo = 0;
        boolean boolean33 = pilha25.vazia();
        pilha6.empilha((java.lang.Object) boolean33);
        pilha6.topo = 97;
        java.lang.Object[] objArray37 = pilha6.item;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha44.item = objArray47;
        pilha42.item = objArray47;
        pilha38.item = objArray47;
        int int51 = pilha38.tamanho();
        java.lang.Object obj52 = null;
        pilha38.empilha(obj52);
        int int54 = pilha38.tamanho();
        ds.Pilha pilha55 = new ds.Pilha();
        boolean boolean56 = pilha55.vazia();
        pilha55.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.tamanho();
        ds.Pilha pilha61 = new ds.Pilha();
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha61.item = objArray64;
        pilha59.item = objArray64;
        pilha55.item = objArray64;
        java.lang.Object[] objArray68 = pilha55.item;
        pilha38.item = objArray68;
        pilha6.item = objArray68;
        pilha0.item = objArray68;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1) + "'", obj21, (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 96 + "'", int30 == 96);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, null]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1, 100.0]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        pilha0.topo = 96;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha22.topo = 'a';
        pilha15.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.topo = 'a';
        java.lang.Object[] objArray38 = pilha34.item;
        pilha22.empilha((java.lang.Object) pilha34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        pilha32.topo = 0;
        pilha32.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        int int44 = pilha42.tamanho();
        boolean boolean45 = pilha42.vazia();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha42.topo = 0;
        java.lang.Object[] objArray49 = pilha42.item;
        pilha32.item = objArray49;
        pilha26.item = objArray49;
        pilha25.item = objArray49;
        pilha20.empilha((java.lang.Object) objArray49);
        pilha0.item = objArray49;
        int int55 = pilha0.topo;
        int int56 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        java.lang.Object[] objArray73 = pilha0.item;
        java.lang.Object obj74 = pilha0.desempilha();
        ds.Pilha pilha75 = new ds.Pilha();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha75.item = objArray78;
        pilha75.topo = (byte) -1;
        java.lang.Object[] objArray82 = null;
        pilha75.item = objArray82;
        int int84 = pilha75.tamanho();
        pilha75.topo = '#';
        pilha0.empilha((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.tamanho();
        java.lang.Object obj26 = pilha0.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha27.item = objArray30;
        pilha27.topo = (byte) -1;
        java.lang.Object[] objArray34 = null;
        pilha27.item = objArray34;
        boolean boolean36 = pilha27.vazia();
        java.lang.Object[] objArray37 = pilha27.item;
        boolean boolean38 = pilha27.vazia();
        int int39 = pilha27.tamanho();
        pilha0.empilha((java.lang.Object) int39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 96 + "'", int25 == 96);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object obj20 = pilha14.desempilha();
        java.lang.Object[] objArray21 = pilha14.item;
        pilha8.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha23.topo = 1;
        int int31 = pilha23.tamanho();
        java.lang.Object[] objArray32 = pilha23.item;
        pilha14.item = objArray32;
        boolean boolean34 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) true);
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha41.item = objArray44;
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1), objArray44, (short) 100, (short) 100, 0.0d };
        pilha36.item = objArray49;
        int int51 = pilha36.topo;
        java.lang.Object[] objArray52 = null;
        pilha36.item = objArray52;
        pilha36.topo = 0;
        pilha36.topo = ' ';
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.tamanho();
        pilha58.empilha((java.lang.Object) true);
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-1), objArray66, (short) 100, (short) 100, 0.0d };
        pilha58.item = objArray71;
        java.lang.Object obj73 = pilha58.desempilha();
        java.lang.Object[] objArray74 = pilha58.item;
        pilha58.topo = (byte) 0;
        java.lang.Object[] objArray77 = pilha58.item;
        int int78 = pilha58.tamanho();
        java.lang.Object[] objArray79 = pilha58.item;
        pilha36.item = objArray79;
        pilha0.empilha((java.lang.Object) pilha36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (-1) + "'", obj73, (-1));
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        boolean boolean5 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        pilha0.topo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        boolean boolean29 = pilha15.vazia();
        boolean boolean30 = pilha15.vazia();
        boolean boolean31 = pilha15.vazia();
        java.lang.Class<?> wildcardClass32 = pilha15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        boolean boolean21 = pilha16.vazia();
        java.lang.Object[] objArray22 = pilha16.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        java.lang.Object[] objArray20 = pilha18.item;
        pilha18.topo = 'a';
        java.lang.Object[] objArray23 = pilha18.item;
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        int int26 = pilha24.tamanho();
        boolean boolean27 = pilha24.vazia();
        java.lang.Object[] objArray28 = pilha24.item;
        pilha24.topo = (byte) 100;
        java.lang.Object[] objArray31 = pilha24.item;
        pilha18.empilha((java.lang.Object) pilha24);
        java.lang.Object[] objArray33 = pilha24.item;
        pilha0.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        int int17 = pilha15.tamanho();
        boolean boolean18 = pilha15.vazia();
        java.lang.Object[] objArray19 = pilha15.item;
        pilha15.topo = (byte) 100;
        pilha0.empilha((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        java.lang.Object[] objArray19 = pilha0.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        int int24 = pilha20.tamanho();
        pilha20.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha32.item = objArray35;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1), objArray35, (short) 100, (short) 100, 0.0d };
        pilha27.item = objArray40;
        java.lang.Object obj42 = pilha27.desempilha();
        java.lang.Object[] objArray43 = pilha27.item;
        pilha20.item = objArray43;
        java.lang.Object[] objArray45 = pilha20.item;
        pilha0.item = objArray45;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1) + "'", obj42, (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        boolean boolean14 = pilha10.vazia();
        java.lang.Object[] objArray15 = pilha10.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha10.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 1;
        boolean boolean34 = pilha0.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        java.lang.Object[] objArray37 = pilha35.item;
        pilha0.item = objArray37;
        int int39 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        int int7 = pilha3.tamanho();
        java.lang.Object[] objArray8 = pilha3.item;
        pilha3.topo = 1;
        pilha3.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass13 = pilha3.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass13);
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha15.topo = (byte) -1;
        java.lang.Object[] objArray22 = pilha15.item;
        pilha0.item = objArray22;
        pilha0.topo = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha0.item = objArray9;
        int int12 = pilha0.tamanho();
        int int13 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha9.topo = (byte) -1;
        java.lang.Object[] objArray16 = null;
        pilha9.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        boolean boolean22 = pilha18.vazia();
        java.lang.Object[] objArray23 = pilha18.item;
        pilha9.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object obj26 = pilha0.desempilha();
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        int int33 = pilha28.topo;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha0.item = objArray34;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) true);
        int int40 = pilha36.tamanho();
        boolean boolean41 = pilha36.vazia();
        pilha36.topo = 0;
        pilha36.topo = 100;
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.tamanho();
        boolean boolean49 = pilha46.vazia();
        java.lang.Object[] objArray50 = pilha46.item;
        pilha46.topo = 0;
        java.lang.Object[] objArray53 = pilha46.item;
        pilha36.item = objArray53;
        java.lang.Object[] objArray55 = pilha36.item;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.tamanho();
        pilha56.empilha((java.lang.Object) true);
        int int60 = pilha56.tamanho();
        pilha56.topo = (byte) 1;
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.tamanho();
        pilha63.empilha((java.lang.Object) true);
        ds.Pilha pilha68 = new ds.Pilha();
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha68.item = objArray71;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), objArray71, (short) 100, (short) 100, 0.0d };
        pilha63.item = objArray76;
        java.lang.Object obj78 = pilha63.desempilha();
        java.lang.Object[] objArray79 = pilha63.item;
        pilha56.item = objArray79;
        java.lang.Object[] objArray81 = pilha56.item;
        pilha36.item = objArray81;
        pilha0.empilha((java.lang.Object) objArray81);
        java.lang.Class<?> wildcardClass84 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (-1) + "'", obj78, (-1));
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = (short) -1;
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.topo = (short) -1;
        boolean boolean18 = pilha14.vazia();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha12.item = objArray20;
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.topo = 'a';
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.topo = (-1);
        int int30 = pilha23.topo;
        pilha0.empilha((java.lang.Object) int30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        java.lang.Object[] objArray31 = pilha0.item;
        int int32 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass33 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        java.lang.Object[] objArray20 = pilha0.item;
        boolean boolean21 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        java.lang.Object[] objArray12 = pilha8.item;
        pilha0.item = objArray12;
        java.lang.Object obj14 = pilha0.desempilha();
        boolean boolean15 = pilha0.vazia();
        int int16 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.topo = (short) 1;
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        java.lang.Object[] objArray29 = pilha22.item;
        pilha0.empilha((java.lang.Object) objArray29);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        pilha0.topo = 101;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        int int13 = pilha5.tamanho();
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha15.topo = (byte) -1;
        pilha15.topo = 96;
        ds.Pilha pilha24 = new ds.Pilha();
        boolean boolean25 = pilha24.vazia();
        pilha24.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha30.item = objArray33;
        pilha28.item = objArray33;
        pilha24.item = objArray33;
        int int37 = pilha24.tamanho();
        int int38 = pilha24.tamanho();
        java.lang.Object[] objArray39 = pilha24.item;
        pilha15.item = objArray39;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.topo;
        pilha41.empilha((java.lang.Object) (-1));
        boolean boolean45 = pilha41.vazia();
        pilha41.topo = (short) 100;
        ds.Pilha pilha48 = new ds.Pilha();
        boolean boolean49 = pilha48.vazia();
        int int50 = pilha48.tamanho();
        boolean boolean51 = pilha48.vazia();
        java.lang.Object[] objArray52 = pilha48.item;
        pilha48.topo = 0;
        java.lang.Object[] objArray55 = pilha48.item;
        pilha41.item = objArray55;
        pilha15.item = objArray55;
        pilha5.item = objArray55;
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.tamanho();
        pilha59.empilha((java.lang.Object) true);
        int int63 = pilha59.tamanho();
        java.lang.Object[] objArray64 = pilha59.item;
        pilha59.topo = 1;
        int int67 = pilha59.tamanho();
        java.lang.Object[] objArray68 = pilha59.item;
        pilha5.item = objArray68;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        int int21 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        pilha0.topo = 97;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        java.lang.Object[] objArray22 = pilha9.item;
        int int23 = pilha9.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.topo;
        pilha24.empilha((java.lang.Object) (-1));
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha28.item = objArray31;
        pilha24.item = objArray31;
        pilha9.item = objArray31;
        pilha0.item = objArray31;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object[] objArray3 = null;
        pilha0.item = objArray3;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        java.lang.Object[] objArray10 = pilha8.item;
        java.lang.Object obj11 = null;
        pilha8.empilha(obj11);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha8.item = objArray15;
        pilha0.empilha((java.lang.Object) objArray15);
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.empilha((java.lang.Object) true);
        int int69 = pilha65.tamanho();
        boolean boolean70 = pilha65.vazia();
        pilha65.topo = 0;
        pilha65.topo = 100;
        ds.Pilha pilha75 = new ds.Pilha();
        boolean boolean76 = pilha75.vazia();
        int int77 = pilha75.tamanho();
        boolean boolean78 = pilha75.vazia();
        java.lang.Object[] objArray79 = pilha75.item;
        pilha75.topo = 0;
        java.lang.Object[] objArray82 = pilha75.item;
        pilha65.item = objArray82;
        java.lang.Object[] objArray84 = pilha65.item;
        pilha0.empilha((java.lang.Object) pilha65);
        java.lang.Object obj86 = pilha65.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        int int29 = pilha15.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.topo = 'a';
        boolean boolean33 = pilha29.vazia();
        java.lang.Object[] objArray34 = pilha29.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        pilha35.empilha((java.lang.Object) true);
        int int39 = pilha35.tamanho();
        boolean boolean40 = pilha35.vazia();
        pilha35.topo = 0;
        pilha35.topo = 100;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        int int47 = pilha45.tamanho();
        boolean boolean48 = pilha45.vazia();
        java.lang.Object[] objArray49 = pilha45.item;
        pilha45.topo = 0;
        java.lang.Object[] objArray52 = pilha45.item;
        pilha35.item = objArray52;
        pilha29.item = objArray52;
        java.lang.Object[] objArray55 = pilha29.item;
        java.lang.Object obj56 = pilha29.desempilha();
        pilha0.empilha(obj56);
        pilha0.topo = 35;
        int int60 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        pilha0.topo = 2;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        pilha10.item = objArray13;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.topo = 'a';
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        pilha15.topo = 0;
        int int23 = pilha15.tamanho();
        pilha10.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha10);
        boolean boolean26 = pilha0.vazia();
        int int27 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 96 + "'", int20 == 96);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha11.topo = (byte) -1;
        java.lang.Object[] objArray18 = null;
        pilha11.item = objArray18;
        boolean boolean20 = pilha11.vazia();
        java.lang.Object[] objArray21 = pilha11.item;
        pilha11.topo = '#';
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.topo = 'a';
        java.lang.Object obj28 = pilha24.desempilha();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha11.item = objArray29;
        pilha0.item = objArray29;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.topo = (short) -1;
        boolean boolean36 = pilha32.vazia();
        java.lang.Object[] objArray37 = pilha32.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        int int20 = pilha18.tamanho();
        boolean boolean21 = pilha18.vazia();
        int int22 = pilha18.topo;
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Class<?> wildcardClass24 = pilha18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        int int26 = pilha6.tamanho();
        pilha6.topo = 1;
        int int29 = pilha6.tamanho();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) true);
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha35.item = objArray38;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1), objArray38, (short) 100, (short) 100, 0.0d };
        pilha30.item = objArray43;
        java.lang.Object obj45 = pilha30.desempilha();
        java.lang.Object[] objArray46 = pilha30.item;
        pilha30.topo = (byte) 0;
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha49.item = objArray52;
        pilha49.topo = (byte) -1;
        java.lang.Object[] objArray56 = null;
        pilha49.item = objArray56;
        pilha30.empilha((java.lang.Object) pilha49);
        java.lang.Object[] objArray59 = pilha30.item;
        pilha6.item = objArray59;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1) + "'", obj45, (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.topo = 'a';
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.topo = (-1);
        int int29 = pilha22.tamanho();
        pilha22.topo = 2;
        java.lang.Object[] objArray32 = pilha22.item;
        pilha0.item = objArray32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        pilha8.topo = (byte) 1;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha20.item = objArray23;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1), objArray23, (short) 100, (short) 100, 0.0d };
        pilha15.item = objArray28;
        java.lang.Object obj30 = pilha15.desempilha();
        java.lang.Object[] objArray31 = pilha15.item;
        pilha8.item = objArray31;
        java.lang.Object[] objArray33 = pilha8.item;
        int int34 = pilha8.topo;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        int int37 = pilha35.tamanho();
        boolean boolean38 = pilha35.vazia();
        pilha8.empilha((java.lang.Object) pilha35);
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        java.lang.Object obj44 = pilha40.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        java.lang.Object obj49 = pilha45.desempilha();
        int int50 = pilha45.topo;
        pilha45.topo = 0;
        pilha45.topo = (byte) 10;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.tamanho();
        pilha55.empilha((java.lang.Object) true);
        int int59 = pilha55.tamanho();
        boolean boolean60 = pilha55.vazia();
        int int61 = pilha55.tamanho();
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        pilha62.empilha((java.lang.Object) true);
        int int66 = pilha62.tamanho();
        boolean boolean67 = pilha62.vazia();
        int int68 = pilha62.tamanho();
        int int69 = pilha62.topo;
        java.lang.Object[] objArray70 = pilha62.item;
        pilha55.item = objArray70;
        pilha45.item = objArray70;
        pilha40.item = objArray70;
        pilha35.empilha((java.lang.Object) pilha40);
        pilha0.empilha((java.lang.Object) pilha40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1) + "'", obj30, (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 96 + "'", int50 == 96);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        java.lang.Object[] objArray12 = pilha10.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        pilha10.empilha(obj17);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        java.lang.Object[] objArray21 = pilha19.item;
        pilha19.topo = 'a';
        java.lang.Object[] objArray24 = pilha19.item;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) true);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        java.lang.Object[] objArray31 = pilha29.item;
        pilha25.item = objArray31;
        pilha19.empilha((java.lang.Object) objArray31);
        pilha10.item = objArray31;
        pilha0.item = objArray31;
        java.lang.Object[] objArray36 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        boolean boolean23 = pilha0.vazia();
        int int24 = pilha0.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha25.item = objArray28;
        pilha25.topo = (byte) -1;
        java.lang.Object[] objArray32 = null;
        pilha25.item = objArray32;
        boolean boolean34 = pilha25.vazia();
        java.lang.Object[] objArray35 = pilha25.item;
        pilha25.topo = '#';
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.topo = 'a';
        java.lang.Object obj42 = pilha38.desempilha();
        java.lang.Object[] objArray43 = pilha38.item;
        pilha25.item = objArray43;
        pilha0.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.topo;
        pilha46.empilha((java.lang.Object) (-1));
        boolean boolean50 = pilha46.vazia();
        int int51 = pilha46.tamanho();
        int int52 = pilha46.tamanho();
        int int53 = pilha46.tamanho();
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.tamanho();
        pilha54.topo = 'a';
        int int58 = pilha54.tamanho();
        java.lang.Object[] objArray59 = pilha54.item;
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.tamanho();
        pilha60.empilha((java.lang.Object) true);
        int int64 = pilha60.tamanho();
        java.lang.Object[] objArray65 = pilha60.item;
        java.lang.Object obj66 = pilha60.desempilha();
        java.lang.Object[] objArray67 = pilha60.item;
        pilha54.empilha((java.lang.Object) pilha60);
        ds.Pilha pilha69 = new ds.Pilha();
        int int70 = pilha69.tamanho();
        pilha69.empilha((java.lang.Object) true);
        int int73 = pilha69.tamanho();
        java.lang.Object[] objArray74 = pilha69.item;
        pilha69.topo = 1;
        int int77 = pilha69.tamanho();
        java.lang.Object[] objArray78 = pilha69.item;
        pilha60.item = objArray78;
        boolean boolean80 = pilha60.vazia();
        pilha46.empilha((java.lang.Object) pilha60);
        java.lang.Object[] objArray82 = null;
        pilha46.item = objArray82;
        pilha0.empilha((java.lang.Object) objArray82);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + true + "'", obj66, true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        int int33 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        int int16 = pilha12.tamanho();
        java.lang.Object[] objArray17 = pilha12.item;
        java.lang.Object obj18 = pilha12.desempilha();
        java.lang.Object[] objArray19 = pilha12.item;
        pilha6.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        int int25 = pilha21.tamanho();
        java.lang.Object[] objArray26 = pilha21.item;
        pilha21.topo = 1;
        int int29 = pilha21.tamanho();
        java.lang.Object[] objArray30 = pilha21.item;
        pilha12.item = objArray30;
        int int32 = pilha12.tamanho();
        pilha12.topo = 1;
        int int35 = pilha12.tamanho();
        pilha0.empilha((java.lang.Object) pilha12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        pilha0.topo = 0;
        java.lang.Object[] objArray22 = pilha0.item;
        java.lang.Object[] objArray23 = pilha0.item;
        java.lang.Class<?> wildcardClass24 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray4 = pilha0.item;
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        java.lang.Object[] objArray23 = pilha7.item;
        pilha7.topo = (byte) 0;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        java.lang.Object obj30 = pilha26.desempilha();
        int int31 = pilha26.topo;
        pilha26.topo = 0;
        boolean boolean34 = pilha26.vazia();
        pilha7.empilha((java.lang.Object) boolean34);
        pilha7.topo = 97;
        java.lang.Object[] objArray38 = pilha7.item;
        pilha0.empilha((java.lang.Object) objArray38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 96 + "'", int31 == 96);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[true, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha10.item = objArray13;
        pilha10.topo = (byte) -1;
        java.lang.Object[] objArray17 = null;
        pilha10.item = objArray17;
        java.lang.Object[] objArray19 = pilha10.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha32.item = objArray35;
        pilha30.item = objArray35;
        pilha26.item = objArray35;
        java.lang.Object[] objArray39 = pilha26.item;
        pilha20.item = objArray39;
        pilha10.item = objArray39;
        pilha0.empilha((java.lang.Object) pilha10);
        int int43 = pilha10.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        int int7 = pilha0.topo;
        pilha0.topo = 98;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        java.lang.Object[] objArray12 = pilha8.item;
        pilha0.item = objArray12;
        pilha0.topo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        pilha5.topo = (byte) 10;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        int int21 = pilha15.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha15.item = objArray30;
        pilha5.item = objArray30;
        pilha0.item = objArray30;
        int int34 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha7.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray13 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        int int12 = pilha10.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = pilha13.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray18 = pilha17.item;
        boolean boolean19 = pilha17.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        int int24 = pilha20.tamanho();
        java.lang.Object[] objArray25 = pilha20.item;
        pilha20.topo = 1;
        pilha20.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass30 = pilha20.getClass();
        pilha17.empilha((java.lang.Object) wildcardClass30);
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray33 = pilha32.item;
        pilha32.topo = 0;
        int int36 = pilha32.tamanho();
        pilha32.topo = (byte) -1;
        java.lang.Object[] objArray39 = pilha32.item;
        pilha17.item = objArray39;
        pilha13.item = objArray39;
        pilha10.item = objArray39;
        pilha0.empilha((java.lang.Object) pilha10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 2;
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        java.lang.Object[] objArray11 = pilha9.item;
        pilha9.topo = 'a';
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        java.lang.Object[] objArray21 = pilha19.item;
        pilha15.item = objArray21;
        pilha9.empilha((java.lang.Object) objArray21);
        pilha0.item = objArray21;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        int int29 = pilha25.topo;
        pilha0.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.empilha((java.lang.Object) true);
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1), objArray39, (short) 100, (short) 100, 0.0d };
        pilha31.item = objArray44;
        java.lang.Object obj46 = pilha31.desempilha();
        java.lang.Object[] objArray47 = pilha31.item;
        pilha31.topo = (byte) 0;
        java.lang.Object[] objArray50 = pilha31.item;
        int int51 = pilha31.tamanho();
        java.lang.Object[] objArray52 = pilha31.item;
        pilha0.empilha((java.lang.Object) pilha31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1) + "'", obj46, (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        pilha0.topo = (byte) -1;
        int int17 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        pilha17.topo = (byte) -1;
        java.lang.Object[] objArray24 = null;
        pilha17.item = objArray24;
        boolean boolean26 = pilha17.vazia();
        java.lang.Object[] objArray27 = pilha17.item;
        pilha17.topo = '#';
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.topo = 'a';
        boolean boolean34 = pilha30.vazia();
        java.lang.Object[] objArray35 = pilha30.item;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) true);
        int int40 = pilha36.tamanho();
        boolean boolean41 = pilha36.vazia();
        pilha36.topo = 0;
        pilha36.topo = 100;
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.tamanho();
        boolean boolean49 = pilha46.vazia();
        java.lang.Object[] objArray50 = pilha46.item;
        pilha46.topo = 0;
        java.lang.Object[] objArray53 = pilha46.item;
        pilha36.item = objArray53;
        pilha30.item = objArray53;
        java.lang.Object[] objArray56 = pilha30.item;
        pilha17.item = objArray56;
        pilha0.item = objArray56;
        pilha0.topo = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) 1;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha0.item = objArray28;
        int int30 = pilha0.tamanho();
        java.lang.Object[] objArray31 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        int int20 = pilha16.tamanho();
        boolean boolean21 = pilha16.vazia();
        pilha16.topo = 0;
        pilha16.topo = 100;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        int int28 = pilha26.tamanho();
        boolean boolean29 = pilha26.vazia();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha26.topo = 0;
        java.lang.Object[] objArray33 = pilha26.item;
        pilha16.item = objArray33;
        java.lang.Object[] objArray35 = pilha16.item;
        pilha0.item = objArray35;
        int int37 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 98);
        boolean boolean40 = pilha0.vazia();
        int int41 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.topo = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        int int13 = pilha11.tamanho();
        boolean boolean14 = pilha11.vazia();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha11.topo = (byte) 100;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.item = objArray18;
        boolean boolean20 = pilha0.vazia();
        pilha0.topo = 100;
        java.lang.Object[] objArray23 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.tamanho();
        java.lang.Object obj27 = pilha20.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha34.item = objArray37;
        pilha32.item = objArray37;
        pilha28.item = objArray37;
        java.lang.Object[] objArray41 = pilha28.item;
        int int42 = pilha28.tamanho();
        pilha20.empilha((java.lang.Object) pilha28);
        int int44 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) int44);
        int int46 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[97, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        int int33 = pilha0.topo;
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        pilha34.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        ds.Pilha pilha40 = new ds.Pilha();
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha40.item = objArray43;
        pilha38.item = objArray43;
        pilha34.item = objArray43;
        java.lang.Object[] objArray47 = pilha34.item;
        int int48 = pilha34.tamanho();
        pilha34.topo = 0;
        pilha34.topo = (byte) 0;
        pilha0.empilha((java.lang.Object) pilha34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.topo;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        int int23 = pilha9.tamanho();
        int int24 = pilha9.topo;
        java.lang.Object[] objArray25 = pilha9.item;
        pilha0.item = objArray25;
        int int27 = pilha0.tamanho();
        java.lang.Object[] objArray28 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        pilha9.topo = 0;
        int int13 = pilha9.tamanho();
        pilha9.topo = (byte) -1;
        pilha9.topo = 96;
        pilha0.empilha((java.lang.Object) 96);
        pilha0.topo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = (short) 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        java.lang.Object[] objArray10 = pilha8.item;
        pilha8.topo = 'a';
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        java.lang.Object[] objArray20 = pilha18.item;
        pilha14.item = objArray20;
        pilha8.empilha((java.lang.Object) objArray20);
        pilha0.item = objArray20;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) true);
        int int28 = pilha24.tamanho();
        pilha24.topo = (byte) 1;
        java.lang.Object[] objArray31 = pilha24.item;
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        int int34 = pilha32.tamanho();
        boolean boolean35 = pilha32.vazia();
        pilha24.empilha((java.lang.Object) boolean35);
        boolean boolean37 = pilha24.vazia();
        java.lang.Object[] objArray38 = pilha24.item;
        pilha24.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        pilha0.topo = 0;
        java.lang.Object[] objArray35 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha11.item = objArray16;
        pilha7.item = objArray16;
        java.lang.Object obj20 = pilha7.desempilha();
        int int21 = pilha7.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        pilha22.topo = 0;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray32 = pilha30.item;
        pilha22.empilha((java.lang.Object) pilha30);
        pilha7.empilha((java.lang.Object) pilha22);
        pilha0.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) true);
        int int40 = pilha36.tamanho();
        java.lang.Object[] objArray41 = pilha36.item;
        pilha36.topo = 1;
        int int44 = pilha36.tamanho();
        int int45 = pilha36.topo;
        pilha22.empilha((java.lang.Object) int45);
        int int47 = pilha22.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = ' ';
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        boolean boolean10 = pilha0.vazia();
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        boolean boolean14 = pilha10.vazia();
        java.lang.Object[] objArray15 = pilha10.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha10.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 1;
        java.lang.Object obj34 = pilha0.desempilha();
        java.lang.Object[] objArray35 = null;
        pilha0.item = objArray35;
        int int37 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        java.lang.Object[] objArray20 = pilha0.item;
        int int21 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        int int20 = pilha16.tamanho();
        boolean boolean21 = pilha16.vazia();
        pilha16.topo = 0;
        pilha16.topo = 100;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        int int28 = pilha26.tamanho();
        boolean boolean29 = pilha26.vazia();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha26.topo = 0;
        java.lang.Object[] objArray33 = pilha26.item;
        pilha16.item = objArray33;
        java.lang.Object[] objArray35 = pilha16.item;
        pilha0.item = objArray35;
        int int37 = pilha0.topo;
        pilha0.empilha((java.lang.Object) 98);
        boolean boolean40 = pilha0.vazia();
        java.lang.Class<?> wildcardClass41 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        int int16 = pilha0.tamanho();
        java.lang.Object[] objArray17 = pilha0.item;
        int int18 = pilha0.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        java.lang.Object[] objArray28 = pilha19.item;
        pilha19.topo = 100;
        java.lang.Object[] objArray31 = pilha19.item;
        pilha19.topo = 35;
        boolean boolean34 = pilha19.vazia();
        int int35 = pilha19.topo;
        java.lang.Object[] objArray36 = pilha19.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        int int39 = pilha37.tamanho();
        boolean boolean40 = pilha37.vazia();
        int int41 = pilha37.topo;
        int int42 = pilha37.tamanho();
        boolean boolean43 = pilha37.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        pilha44.empilha((java.lang.Object) true);
        int int48 = pilha44.tamanho();
        java.lang.Object[] objArray49 = pilha44.item;
        java.lang.Object obj50 = pilha44.desempilha();
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        java.lang.Object[] objArray53 = pilha51.item;
        pilha51.topo = 'a';
        ds.Pilha pilha56 = new ds.Pilha();
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.tamanho();
        pilha57.topo = 'a';
        boolean boolean61 = pilha57.vazia();
        java.lang.Object[] objArray62 = pilha57.item;
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.tamanho();
        pilha63.empilha((java.lang.Object) true);
        int int67 = pilha63.tamanho();
        boolean boolean68 = pilha63.vazia();
        pilha63.topo = 0;
        pilha63.topo = 100;
        ds.Pilha pilha73 = new ds.Pilha();
        boolean boolean74 = pilha73.vazia();
        int int75 = pilha73.tamanho();
        boolean boolean76 = pilha73.vazia();
        java.lang.Object[] objArray77 = pilha73.item;
        pilha73.topo = 0;
        java.lang.Object[] objArray80 = pilha73.item;
        pilha63.item = objArray80;
        pilha57.item = objArray80;
        pilha56.item = objArray80;
        pilha51.empilha((java.lang.Object) objArray80);
        pilha44.item = objArray80;
        pilha37.item = objArray80;
        pilha19.item = objArray80;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, null]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray28);
        org.junit.Assert.assertNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + true + "'", obj50, true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.empilha((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.empilha((java.lang.Object) true);
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha11.item = objArray18;
        pilha0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        pilha0.topo = 2;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray13 = pilha12.item;
        pilha10.item = objArray13;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.topo = 'a';
        java.lang.Object obj19 = pilha15.desempilha();
        int int20 = pilha15.topo;
        pilha15.topo = 0;
        int int23 = pilha15.tamanho();
        pilha10.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha10);
        java.lang.Object[] objArray26 = pilha10.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 96 + "'", int20 == 96);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        int int20 = pilha0.tamanho();
        java.lang.Object[] objArray21 = pilha0.item;
        java.lang.Object[] objArray22 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertNull(objArray22);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object obj20 = pilha14.desempilha();
        java.lang.Object[] objArray21 = pilha14.item;
        pilha8.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha23.topo = 1;
        int int31 = pilha23.tamanho();
        java.lang.Object[] objArray32 = pilha23.item;
        pilha14.item = objArray32;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.empilha((java.lang.Object) true);
        java.lang.Object obj38 = pilha34.desempilha();
        java.lang.Object[] objArray39 = pilha34.item;
        pilha34.topo = 1;
        int int42 = pilha34.topo;
        pilha14.empilha((java.lang.Object) pilha34);
        pilha0.empilha((java.lang.Object) pilha34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha7.item = objArray10;
        pilha7.topo = (byte) -1;
        java.lang.Object[] objArray14 = null;
        pilha7.item = objArray14;
        boolean boolean16 = pilha7.vazia();
        java.lang.Object[] objArray17 = pilha7.item;
        pilha7.topo = '#';
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        pilha26.topo = 0;
        pilha26.topo = 100;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        int int38 = pilha36.tamanho();
        boolean boolean39 = pilha36.vazia();
        java.lang.Object[] objArray40 = pilha36.item;
        pilha36.topo = 0;
        java.lang.Object[] objArray43 = pilha36.item;
        pilha26.item = objArray43;
        pilha20.item = objArray43;
        java.lang.Object[] objArray46 = pilha20.item;
        pilha7.item = objArray46;
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.tamanho();
        pilha48.empilha((java.lang.Object) true);
        int int52 = pilha48.tamanho();
        java.lang.Object[] objArray53 = pilha48.item;
        pilha48.topo = 1;
        java.lang.Object[] objArray56 = pilha48.item;
        pilha7.empilha((java.lang.Object) objArray56);
        pilha0.item = objArray56;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.topo = 'a';
        boolean boolean33 = pilha29.vazia();
        java.lang.Object[] objArray34 = pilha29.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        pilha35.empilha((java.lang.Object) true);
        int int39 = pilha35.tamanho();
        boolean boolean40 = pilha35.vazia();
        pilha35.topo = 0;
        pilha35.topo = 100;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        int int47 = pilha45.tamanho();
        boolean boolean48 = pilha45.vazia();
        java.lang.Object[] objArray49 = pilha45.item;
        pilha45.topo = 0;
        java.lang.Object[] objArray52 = pilha45.item;
        pilha35.item = objArray52;
        pilha29.item = objArray52;
        java.lang.Object[] objArray55 = pilha29.item;
        java.lang.Object obj56 = pilha29.desempilha();
        pilha0.empilha(obj56);
        java.lang.Object[] objArray58 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha17.topo = 1;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha0.item = objArray25;
        boolean boolean27 = pilha0.vazia();
        java.lang.Object obj28 = pilha0.desempilha();
        int int29 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Object obj14 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 0;
        pilha0.topo = ' ';
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.topo = 'a';
        java.lang.Object obj26 = pilha22.desempilha();
        int int27 = pilha22.topo;
        java.lang.Object[] objArray28 = pilha22.item;
        pilha0.item = objArray28;
        java.lang.Object obj30 = pilha0.desempilha();
        java.lang.Object[] objArray31 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 96 + "'", int27 == 96);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha2.item = objArray5;
        pilha0.item = objArray5;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        java.lang.Object[] objArray14 = pilha12.item;
        pilha8.item = objArray14;
        int int16 = pilha8.tamanho();
        int int17 = pilha8.tamanho();
        java.lang.Object[] objArray18 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha0.item = objArray26;
        int int29 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = 97;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        java.lang.Object obj16 = pilha12.desempilha();
        int int17 = pilha12.topo;
        java.lang.Object[] objArray18 = pilha12.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha24.item = objArray27;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1), objArray27, (short) 100, (short) 100, 0.0d };
        pilha19.item = objArray32;
        java.lang.Object obj34 = pilha19.desempilha();
        pilha19.topo = (short) 10;
        int int37 = pilha19.tamanho();
        pilha12.empilha((java.lang.Object) int37);
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        pilha39.empilha((java.lang.Object) true);
        int int43 = pilha39.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        int int46 = pilha44.tamanho();
        boolean boolean47 = pilha44.vazia();
        java.lang.Object[] objArray48 = pilha44.item;
        pilha39.item = objArray48;
        pilha12.item = objArray48;
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 96 + "'", int17 == 96);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1) + "'", obj34, (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha10.item = objArray13;
        pilha10.topo = (byte) -1;
        java.lang.Object[] objArray17 = null;
        pilha10.item = objArray17;
        int int19 = pilha10.tamanho();
        int int20 = pilha10.topo;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        pilha21.topo = (byte) -1;
        java.lang.Object[] objArray28 = null;
        pilha21.item = objArray28;
        boolean boolean30 = pilha21.vazia();
        java.lang.Object[] objArray31 = pilha21.item;
        pilha21.topo = '#';
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.topo = 'a';
        java.lang.Object obj38 = pilha34.desempilha();
        java.lang.Object[] objArray39 = pilha34.item;
        pilha21.item = objArray39;
        pilha10.item = objArray39;
        pilha0.empilha((java.lang.Object) objArray39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean11 = pilha0.vazia();
        java.lang.Object obj12 = pilha0.desempilha();
        java.lang.Object[] objArray13 = null;
        pilha0.item = objArray13;
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object[] objArray3 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        int int29 = pilha12.tamanho();
        pilha6.empilha((java.lang.Object) pilha12);
        int int31 = pilha12.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha11.item = objArray16;
        pilha7.item = objArray16;
        int int20 = pilha7.tamanho();
        java.lang.Object obj21 = null;
        pilha7.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha29.item = objArray32;
        pilha27.item = objArray32;
        pilha23.item = objArray32;
        java.lang.Object[] objArray36 = pilha23.item;
        int int37 = pilha23.tamanho();
        pilha23.topo = 0;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) true);
        int int44 = pilha40.tamanho();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha40.topo = 1;
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        pilha49.empilha((java.lang.Object) true);
        int int53 = pilha49.tamanho();
        boolean boolean54 = pilha49.vazia();
        int int55 = pilha49.tamanho();
        int int56 = pilha49.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        java.lang.Object[] objArray58 = pilha57.item;
        pilha49.item = objArray58;
        ds.Pilha pilha60 = new ds.Pilha();
        boolean boolean61 = pilha60.vazia();
        java.lang.Object[] objArray62 = pilha60.item;
        int int63 = pilha60.topo;
        ds.Pilha pilha64 = new ds.Pilha();
        boolean boolean65 = pilha64.vazia();
        pilha64.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.tamanho();
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha70.item = objArray73;
        pilha68.item = objArray73;
        pilha64.item = objArray73;
        java.lang.Object[] objArray77 = pilha64.item;
        java.lang.Object[] objArray78 = new java.lang.Object[] { pilha23, pilha40, "", objArray58, int63, objArray77 };
        pilha7.item = objArray78;
        java.lang.Object[] objArray80 = pilha7.item;
        java.lang.Object obj81 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object[] objArray83 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, null]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        boolean boolean29 = pilha15.vazia();
        boolean boolean30 = pilha15.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.topo = 'a';
        boolean boolean35 = pilha31.vazia();
        java.lang.Object[] objArray36 = pilha31.item;
        int int37 = pilha31.tamanho();
        java.lang.Object obj38 = pilha31.desempilha();
        pilha31.topo = (byte) 100;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha41.item = objArray44;
        pilha41.topo = (byte) -1;
        java.lang.Object[] objArray48 = null;
        pilha41.item = objArray48;
        boolean boolean50 = pilha41.vazia();
        java.lang.Object[] objArray51 = pilha41.item;
        boolean boolean52 = pilha41.vazia();
        pilha41.topo = 0;
        pilha31.empilha((java.lang.Object) pilha41);
        boolean boolean56 = pilha31.vazia();
        pilha15.empilha((java.lang.Object) boolean56);
        boolean boolean58 = pilha15.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        pilha0.topo = '#';
        java.lang.Object[] objArray14 = pilha0.item;
        int int15 = pilha0.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.topo = 'a';
        int int20 = pilha16.tamanho();
        java.lang.Object[] objArray21 = pilha16.item;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        java.lang.Object[] objArray27 = pilha22.item;
        java.lang.Object obj28 = pilha22.desempilha();
        java.lang.Object[] objArray29 = pilha22.item;
        pilha16.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.empilha((java.lang.Object) true);
        int int35 = pilha31.tamanho();
        java.lang.Object[] objArray36 = pilha31.item;
        pilha31.topo = 1;
        int int39 = pilha31.tamanho();
        java.lang.Object[] objArray40 = pilha31.item;
        pilha22.item = objArray40;
        int int42 = pilha22.tamanho();
        pilha22.topo = 1;
        pilha0.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 'a';
        int int11 = pilha0.topo;
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha4.topo = (byte) -1;
        java.lang.Object[] objArray11 = null;
        pilha4.item = objArray11;
        java.lang.Object[] objArray13 = pilha4.item;
        pilha4.topo = 100;
        java.lang.Object[] objArray16 = pilha4.item;
        pilha4.topo = 35;
        pilha0.empilha((java.lang.Object) pilha4);
        boolean boolean20 = pilha4.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha15.item = objArray22;
        pilha0.item = objArray22;
        int int26 = pilha0.tamanho();
        int int27 = pilha0.topo;
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        int int15 = pilha0.topo;
        boolean boolean16 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        boolean boolean10 = pilha6.vazia();
        java.lang.Object[] objArray11 = pilha6.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        int int16 = pilha12.tamanho();
        boolean boolean17 = pilha12.vazia();
        pilha12.topo = 0;
        pilha12.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        int int24 = pilha22.tamanho();
        boolean boolean25 = pilha22.vazia();
        java.lang.Object[] objArray26 = pilha22.item;
        pilha22.topo = 0;
        java.lang.Object[] objArray29 = pilha22.item;
        pilha12.item = objArray29;
        pilha6.item = objArray29;
        pilha5.item = objArray29;
        pilha0.empilha((java.lang.Object) objArray29);
        java.lang.Class<?> wildcardClass34 = objArray29.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha2.item = objArray5;
        pilha0.item = objArray5;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha8.item = objArray11;
        pilha8.topo = (byte) -1;
        java.lang.Object[] objArray15 = null;
        pilha8.item = objArray15;
        int int17 = pilha8.tamanho();
        int int18 = pilha8.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        boolean boolean28 = pilha19.vazia();
        java.lang.Object[] objArray29 = pilha19.item;
        pilha19.topo = '#';
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.topo = 'a';
        java.lang.Object obj36 = pilha32.desempilha();
        java.lang.Object[] objArray37 = pilha32.item;
        pilha19.item = objArray37;
        pilha8.item = objArray37;
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        java.lang.Object obj44 = pilha40.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        java.lang.Object obj49 = pilha45.desempilha();
        int int50 = pilha45.topo;
        pilha45.topo = 0;
        pilha45.topo = (byte) 10;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.tamanho();
        pilha55.empilha((java.lang.Object) true);
        int int59 = pilha55.tamanho();
        boolean boolean60 = pilha55.vazia();
        int int61 = pilha55.tamanho();
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        pilha62.empilha((java.lang.Object) true);
        int int66 = pilha62.tamanho();
        boolean boolean67 = pilha62.vazia();
        int int68 = pilha62.tamanho();
        int int69 = pilha62.topo;
        java.lang.Object[] objArray70 = pilha62.item;
        pilha55.item = objArray70;
        pilha45.item = objArray70;
        pilha40.item = objArray70;
        pilha8.item = objArray70;
        pilha8.topo = 97;
        int int77 = pilha8.topo;
        pilha0.empilha((java.lang.Object) int77);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[97, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[97, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 96 + "'", int50 == 96);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        boolean boolean73 = pilha0.vazia();
        int int74 = pilha0.tamanho();
        boolean boolean75 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        pilha0.topo = 97;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        pilha0.topo = 0;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        pilha35.empilha((java.lang.Object) true);
        int int39 = pilha35.tamanho();
        boolean boolean40 = pilha35.vazia();
        int int41 = pilha35.tamanho();
        int int42 = pilha35.topo;
        java.lang.Object[] objArray43 = pilha35.item;
        pilha0.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) 97);
        int int6 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        pilha5.topo = (byte) 10;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        int int21 = pilha15.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha15.item = objArray30;
        pilha5.item = objArray30;
        pilha0.item = objArray30;
        pilha0.topo = (byte) 10;
        java.lang.Object[] objArray36 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha4.topo = (byte) -1;
        java.lang.Object[] objArray11 = null;
        pilha4.item = objArray11;
        java.lang.Object[] objArray13 = pilha4.item;
        pilha4.topo = 100;
        java.lang.Object[] objArray16 = pilha4.item;
        pilha4.topo = 35;
        pilha0.empilha((java.lang.Object) pilha4);
        int int20 = pilha4.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.topo = 'a';
        java.lang.Object obj25 = pilha21.desempilha();
        int int26 = pilha21.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        int int29 = pilha27.tamanho();
        int int30 = pilha27.topo;
        pilha21.empilha((java.lang.Object) pilha27);
        boolean boolean32 = pilha21.vazia();
        java.lang.Object obj33 = pilha21.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            pilha4.empilha((java.lang.Object) pilha21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 96 + "'", int26 == 96);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        pilha32.topo = 0;
        pilha32.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        int int44 = pilha42.tamanho();
        boolean boolean45 = pilha42.vazia();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha42.topo = 0;
        java.lang.Object[] objArray49 = pilha42.item;
        pilha32.item = objArray49;
        pilha26.item = objArray49;
        pilha25.item = objArray49;
        pilha20.empilha((java.lang.Object) objArray49);
        pilha0.item = objArray49;
        int int55 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (-1.0f));
        pilha0.topo = 0;
        int int6 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        int int22 = pilha0.topo;
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        java.lang.Object[] objArray14 = pilha10.item;
        pilha0.empilha((java.lang.Object) objArray14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        boolean boolean25 = pilha21.vazia();
        pilha0.empilha((java.lang.Object) pilha21);
        int int27 = pilha21.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (byte) -1);
        boolean boolean32 = pilha28.vazia();
        pilha21.empilha((java.lang.Object) pilha28);
        pilha28.topo = 95;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        pilha0.topo = (byte) 10;
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 0;
        int int31 = pilha0.tamanho();
        java.lang.Object[] objArray32 = null;
        pilha0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        boolean boolean10 = pilha6.vazia();
        java.lang.Object[] objArray11 = pilha6.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        int int16 = pilha12.tamanho();
        boolean boolean17 = pilha12.vazia();
        pilha12.topo = 0;
        pilha12.topo = 100;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        int int24 = pilha22.tamanho();
        boolean boolean25 = pilha22.vazia();
        java.lang.Object[] objArray26 = pilha22.item;
        pilha22.topo = 0;
        java.lang.Object[] objArray29 = pilha22.item;
        pilha12.item = objArray29;
        pilha6.item = objArray29;
        java.lang.Object[] objArray32 = pilha6.item;
        java.lang.Object obj33 = pilha6.desempilha();
        pilha0.empilha(obj33);
        java.lang.Object obj35 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha24 = new ds.Pilha();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.topo = 'a';
        boolean boolean29 = pilha25.vazia();
        java.lang.Object[] objArray30 = pilha25.item;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.empilha((java.lang.Object) true);
        int int35 = pilha31.tamanho();
        boolean boolean36 = pilha31.vazia();
        pilha31.topo = 0;
        pilha31.topo = 100;
        ds.Pilha pilha41 = new ds.Pilha();
        boolean boolean42 = pilha41.vazia();
        int int43 = pilha41.tamanho();
        boolean boolean44 = pilha41.vazia();
        java.lang.Object[] objArray45 = pilha41.item;
        pilha41.topo = 0;
        java.lang.Object[] objArray48 = pilha41.item;
        pilha31.item = objArray48;
        pilha25.item = objArray48;
        pilha24.item = objArray48;
        java.lang.Object[] objArray52 = pilha24.item;
        pilha8.item = objArray52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1), objArray24, (short) 100, (short) 100, 0.0d };
        pilha16.item = objArray29;
        pilha0.item = objArray29;
        java.lang.Object[] objArray32 = pilha0.item;
        boolean boolean33 = pilha0.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.topo = 'a';
        java.lang.Object obj38 = pilha34.desempilha();
        int int39 = pilha34.topo;
        java.lang.Object[] objArray40 = pilha34.item;
        pilha0.item = objArray40;
        boolean boolean42 = pilha0.vazia();
        int int43 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 96 + "'", int39 == 96);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        int int26 = pilha21.topo;
        pilha0.empilha((java.lang.Object) pilha21);
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha28.item = objArray31;
        pilha28.topo = (byte) -1;
        int int35 = pilha28.tamanho();
        boolean boolean36 = pilha28.vazia();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) true);
        int int41 = pilha37.tamanho();
        boolean boolean42 = pilha37.vazia();
        int int43 = pilha37.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray45 = pilha44.item;
        pilha44.topo = 0;
        int int48 = pilha44.tamanho();
        pilha37.empilha((java.lang.Object) pilha44);
        boolean boolean50 = pilha44.vazia();
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        pilha51.empilha((java.lang.Object) true);
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.tamanho();
        java.lang.Object[] objArray57 = pilha55.item;
        pilha51.item = objArray57;
        int int59 = pilha51.tamanho();
        int int60 = pilha51.tamanho();
        java.lang.Object[] objArray61 = pilha51.item;
        pilha44.item = objArray61;
        pilha28.item = objArray61;
        pilha21.empilha((java.lang.Object) pilha28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        boolean boolean15 = pilha0.vazia();
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.tamanho();
        pilha2.topo = (short) -1;
        boolean boolean6 = pilha2.vazia();
        java.lang.Object[] objArray7 = pilha2.item;
        java.lang.Object[] objArray8 = pilha2.item;
        pilha0.item = objArray8;
        java.lang.Object[] objArray10 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (short) 10;
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object[] objArray11 = null;
        pilha0.item = objArray11;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha34.item = objArray37;
        pilha32.item = objArray37;
        pilha28.item = objArray37;
        java.lang.Object obj41 = pilha28.desempilha();
        int int42 = pilha28.topo;
        boolean boolean43 = pilha28.vazia();
        boolean boolean44 = pilha28.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha51.item = objArray54;
        pilha49.item = objArray54;
        pilha45.item = objArray54;
        pilha28.item = objArray54;
        pilha0.item = objArray54;
        int int60 = pilha0.topo;
        int int61 = pilha0.tamanho();
        java.lang.Object[] objArray62 = pilha0.item;
        java.lang.Class<?> wildcardClass63 = objArray62.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 1 + "'", obj41, (short) 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 0;
        java.lang.Object[] objArray31 = pilha0.item;
        pilha0.topo = 99;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1), objArray24, (short) 100, (short) 100, 0.0d };
        pilha16.item = objArray29;
        pilha0.item = objArray29;
        java.lang.Object[] objArray32 = pilha0.item;
        boolean boolean33 = pilha0.vazia();
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object obj10 = pilha0.desempilha();
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.topo = 'a';
        java.lang.Object obj34 = pilha30.desempilha();
        int int35 = pilha30.topo;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        int int38 = pilha36.tamanho();
        int int39 = pilha36.topo;
        pilha30.empilha((java.lang.Object) pilha36);
        int int41 = pilha36.tamanho();
        java.lang.Object[] objArray42 = pilha36.item;
        int int43 = pilha36.tamanho();
        pilha0.empilha((java.lang.Object) int43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 96 + "'", int35 == 96);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        boolean boolean28 = pilha0.vazia();
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        pilha12.topo = (byte) 0;
        java.lang.Object[] objArray31 = pilha12.item;
        java.lang.Object[] objArray32 = pilha12.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        pilha0.topo = 32;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        boolean boolean14 = pilha9.vazia();
        pilha9.topo = 0;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        boolean boolean22 = pilha17.vazia();
        pilha17.topo = 0;
        pilha17.topo = 100;
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        int int29 = pilha27.tamanho();
        boolean boolean30 = pilha27.vazia();
        java.lang.Object[] objArray31 = pilha27.item;
        pilha27.topo = 0;
        java.lang.Object[] objArray34 = pilha27.item;
        pilha17.item = objArray34;
        pilha9.item = objArray34;
        pilha0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        pilha0.topo = 2;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        pilha11.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray15 = pilha11.item;
        pilha0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha10.item = objArray13;
        pilha10.topo = (byte) -1;
        java.lang.Object[] objArray17 = null;
        pilha10.item = objArray17;
        boolean boolean19 = pilha10.vazia();
        java.lang.Object[] objArray20 = pilha10.item;
        boolean boolean21 = pilha10.vazia();
        pilha10.topo = 0;
        pilha0.empilha((java.lang.Object) pilha10);
        pilha0.topo = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        pilha18.empilha((java.lang.Object) (-1));
        pilha18.topo = 1;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) true);
        java.lang.Object obj28 = pilha24.desempilha();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha18.item = objArray29;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = (short) -1;
        boolean boolean9 = pilha5.vazia();
        pilha5.topo = 35;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        pilha12.topo = (byte) 0;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha31.item = objArray34;
        pilha31.topo = (byte) -1;
        java.lang.Object[] objArray38 = null;
        pilha31.item = objArray38;
        pilha12.empilha((java.lang.Object) pilha31);
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha41.item = objArray44;
        pilha41.topo = (byte) -1;
        java.lang.Object[] objArray48 = null;
        pilha41.item = objArray48;
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        pilha50.topo = 'a';
        boolean boolean54 = pilha50.vazia();
        java.lang.Object[] objArray55 = pilha50.item;
        pilha41.item = objArray55;
        java.lang.Object[] objArray57 = pilha41.item;
        pilha12.item = objArray57;
        pilha5.item = objArray57;
        pilha0.item = objArray57;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.topo = 'a';
        int int21 = pilha17.tamanho();
        java.lang.Object[] objArray22 = pilha17.item;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        java.lang.Object obj29 = pilha23.desempilha();
        java.lang.Object[] objArray30 = pilha23.item;
        pilha17.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        java.lang.Object[] objArray37 = pilha32.item;
        pilha32.topo = 1;
        int int40 = pilha32.tamanho();
        java.lang.Object[] objArray41 = pilha32.item;
        pilha23.item = objArray41;
        boolean boolean43 = pilha23.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        pilha44.empilha((java.lang.Object) true);
        java.lang.Object[] objArray48 = pilha44.item;
        int int49 = pilha44.tamanho();
        pilha23.empilha((java.lang.Object) pilha44);
        pilha0.empilha((java.lang.Object) pilha44);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1), objArray21, (short) 100, (short) 100, 0.0d };
        pilha13.item = objArray26;
        java.lang.Object obj28 = pilha13.desempilha();
        java.lang.Object[] objArray29 = pilha13.item;
        pilha13.topo = (byte) 0;
        java.lang.Object[] objArray32 = pilha13.item;
        java.lang.Object[] objArray33 = pilha13.item;
        pilha0.item = objArray33;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        pilha0.item = objArray28;
        pilha0.topo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        int int33 = pilha0.topo;
        boolean boolean34 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        pilha26.topo = 0;
        pilha26.topo = 100;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        int int38 = pilha36.tamanho();
        boolean boolean39 = pilha36.vazia();
        java.lang.Object[] objArray40 = pilha36.item;
        pilha36.topo = 0;
        java.lang.Object[] objArray43 = pilha36.item;
        pilha26.item = objArray43;
        pilha0.item = objArray43;
        java.lang.Object obj46 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha28.item = objArray31;
        pilha28.topo = (byte) -1;
        java.lang.Object[] objArray35 = null;
        pilha28.item = objArray35;
        boolean boolean37 = pilha28.vazia();
        java.lang.Object[] objArray38 = pilha28.item;
        pilha28.topo = '#';
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.topo = 'a';
        java.lang.Object obj45 = pilha41.desempilha();
        java.lang.Object[] objArray46 = pilha41.item;
        pilha28.item = objArray46;
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.topo;
        pilha48.empilha((java.lang.Object) (-1));
        boolean boolean52 = pilha48.vazia();
        int int53 = pilha48.tamanho();
        int int54 = pilha48.tamanho();
        int int55 = pilha48.tamanho();
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.tamanho();
        pilha56.topo = 'a';
        int int60 = pilha56.tamanho();
        java.lang.Object[] objArray61 = pilha56.item;
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        pilha62.empilha((java.lang.Object) true);
        int int66 = pilha62.tamanho();
        java.lang.Object[] objArray67 = pilha62.item;
        java.lang.Object obj68 = pilha62.desempilha();
        java.lang.Object[] objArray69 = pilha62.item;
        pilha56.empilha((java.lang.Object) pilha62);
        ds.Pilha pilha71 = new ds.Pilha();
        int int72 = pilha71.tamanho();
        pilha71.empilha((java.lang.Object) true);
        int int75 = pilha71.tamanho();
        java.lang.Object[] objArray76 = pilha71.item;
        pilha71.topo = 1;
        int int79 = pilha71.tamanho();
        java.lang.Object[] objArray80 = pilha71.item;
        pilha62.item = objArray80;
        boolean boolean82 = pilha62.vazia();
        pilha48.empilha((java.lang.Object) pilha62);
        pilha48.topo = (short) -1;
        pilha28.empilha((java.lang.Object) (short) -1);
        pilha0.empilha((java.lang.Object) pilha28);
        boolean boolean88 = pilha0.vazia();
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + true + "'", obj68, true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.topo;
        boolean boolean11 = pilha0.vazia();
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        int int23 = pilha9.tamanho();
        java.lang.Object[] objArray24 = pilha9.item;
        pilha0.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        pilha26.empilha((java.lang.Object) (-1));
        boolean boolean30 = pilha26.vazia();
        pilha26.topo = (short) 100;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        int int35 = pilha33.tamanho();
        boolean boolean36 = pilha33.vazia();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha33.topo = 0;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha26.item = objArray40;
        pilha0.item = objArray40;
        int int43 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 96 + "'", int43 == 96);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.topo = 'a';
        boolean boolean8 = pilha4.vazia();
        java.lang.Object[] objArray9 = pilha4.item;
        int int10 = pilha4.tamanho();
        java.lang.Object obj11 = pilha4.desempilha();
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        pilha16.item = objArray21;
        pilha12.item = objArray21;
        java.lang.Object[] objArray25 = pilha12.item;
        int int26 = pilha12.tamanho();
        pilha4.empilha((java.lang.Object) pilha12);
        java.lang.Object obj28 = pilha4.desempilha();
        int int29 = pilha4.tamanho();
        java.lang.Object obj30 = pilha4.desempilha();
        int int31 = pilha4.topo;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        java.lang.Object[] objArray37 = pilha32.item;
        pilha32.topo = 1;
        int int40 = pilha32.tamanho();
        java.lang.Object[] objArray41 = pilha32.item;
        pilha4.item = objArray41;
        pilha0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 96 + "'", int29 == 96);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 95 + "'", int31 == 95);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean24 = pilha8.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha8.item = objArray11;
        pilha8.topo = (byte) -1;
        java.lang.Object[] objArray15 = null;
        pilha8.item = objArray15;
        int int17 = pilha8.tamanho();
        int int18 = pilha8.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        boolean boolean28 = pilha19.vazia();
        java.lang.Object[] objArray29 = pilha19.item;
        pilha19.topo = '#';
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.topo = 'a';
        java.lang.Object obj36 = pilha32.desempilha();
        java.lang.Object[] objArray37 = pilha32.item;
        pilha19.item = objArray37;
        pilha8.item = objArray37;
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        java.lang.Object obj44 = pilha40.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        java.lang.Object obj49 = pilha45.desempilha();
        int int50 = pilha45.topo;
        pilha45.topo = 0;
        pilha45.topo = (byte) 10;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.tamanho();
        pilha55.empilha((java.lang.Object) true);
        int int59 = pilha55.tamanho();
        boolean boolean60 = pilha55.vazia();
        int int61 = pilha55.tamanho();
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        pilha62.empilha((java.lang.Object) true);
        int int66 = pilha62.tamanho();
        boolean boolean67 = pilha62.vazia();
        int int68 = pilha62.tamanho();
        int int69 = pilha62.topo;
        java.lang.Object[] objArray70 = pilha62.item;
        pilha55.item = objArray70;
        pilha45.item = objArray70;
        pilha40.item = objArray70;
        pilha8.item = objArray70;
        pilha0.item = objArray70;
        int int76 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 96 + "'", int50 == 96);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        pilha0.topo = (short) 1;
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) true);
        int int8 = pilha4.tamanho();
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        java.lang.Object obj11 = new java.lang.Object();
        pilha0.empilha(obj11);
        java.lang.Class<?> wildcardClass13 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.topo = 'a';
        java.lang.Object[] objArray21 = pilha17.item;
        pilha0.item = objArray21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.topo = 96;
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        java.lang.Object obj30 = pilha0.desempilha();
        pilha0.topo = (byte) -1;
        int int33 = pilha0.topo;
        java.lang.Object[] objArray34 = pilha0.item;
        int int35 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object[] objArray17 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha6.topo = (byte) -1;
        java.lang.Object[] objArray13 = null;
        pilha6.item = objArray13;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.topo = 'a';
        boolean boolean19 = pilha15.vazia();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha6.item = objArray20;
        java.lang.Object[] objArray22 = pilha6.item;
        pilha0.item = objArray22;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        java.lang.Object[] objArray9 = pilha7.item;
        pilha7.topo = 'a';
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        java.lang.Object[] objArray19 = pilha17.item;
        pilha13.item = objArray19;
        pilha7.empilha((java.lang.Object) objArray19);
        int int22 = pilha7.tamanho();
        java.lang.Object obj23 = pilha7.desempilha();
        pilha0.empilha(obj23);
        int int25 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        boolean boolean29 = pilha15.vazia();
        boolean boolean30 = pilha15.vazia();
        boolean boolean31 = pilha15.vazia();
        int int32 = pilha15.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        boolean boolean23 = pilha0.vazia();
        int int24 = pilha0.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) true);
        java.lang.Object obj29 = pilha25.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.topo = 'a';
        boolean boolean34 = pilha30.vazia();
        java.lang.Object[] objArray35 = pilha30.item;
        pilha25.item = objArray35;
        pilha25.topo = '#';
        java.lang.Object[] objArray39 = pilha25.item;
        pilha0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        boolean boolean10 = pilha6.vazia();
        java.lang.Object[] objArray11 = pilha6.item;
        int int12 = pilha6.tamanho();
        java.lang.Object obj13 = pilha6.desempilha();
        java.lang.Object[] objArray14 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object[] objArray16 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        java.lang.Object[] objArray22 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = pilha3.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        boolean boolean9 = pilha7.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) true);
        int int14 = pilha10.tamanho();
        java.lang.Object[] objArray15 = pilha10.item;
        pilha10.topo = 1;
        pilha10.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass20 = pilha10.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass20);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha22.topo = 0;
        int int26 = pilha22.tamanho();
        pilha22.topo = (byte) -1;
        java.lang.Object[] objArray29 = pilha22.item;
        pilha7.item = objArray29;
        pilha3.item = objArray29;
        pilha0.item = objArray29;
        java.lang.Object[] objArray33 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        pilha0.topo = '4';
        pilha0.topo = (-1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) (-1.0f));
        boolean boolean17 = pilha13.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = pilha0.item;
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        int int22 = pilha0.topo;
        pilha0.topo = 100;
        int int25 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        boolean boolean13 = pilha0.vazia();
        java.lang.Object obj14 = pilha0.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray19 = pilha15.item;
        pilha0.item = objArray19;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        pilha16.item = objArray22;
        pilha0.item = objArray22;
        int int25 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha34.item = objArray37;
        pilha32.item = objArray37;
        pilha28.item = objArray37;
        java.lang.Object obj41 = pilha28.desempilha();
        int int42 = pilha28.topo;
        boolean boolean43 = pilha28.vazia();
        boolean boolean44 = pilha28.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha51.item = objArray54;
        pilha49.item = objArray54;
        pilha45.item = objArray54;
        pilha28.item = objArray54;
        pilha0.item = objArray54;
        int int60 = pilha0.topo;
        int int61 = pilha0.tamanho();
        boolean boolean62 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 1 + "'", obj41, (short) 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 0;
        int int31 = pilha0.tamanho();
        int int32 = pilha0.tamanho();
        int int33 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        java.lang.Object[] objArray73 = pilha0.item;
        ds.Pilha pilha74 = new ds.Pilha();
        int int75 = pilha74.tamanho();
        pilha74.topo = 'a';
        int int78 = pilha74.tamanho();
        java.lang.Object[] objArray79 = pilha74.item;
        ds.Pilha pilha80 = new ds.Pilha();
        int int81 = pilha80.tamanho();
        pilha80.empilha((java.lang.Object) true);
        int int84 = pilha80.tamanho();
        java.lang.Object[] objArray85 = pilha80.item;
        java.lang.Object obj86 = pilha80.desempilha();
        java.lang.Object[] objArray87 = pilha80.item;
        pilha74.empilha((java.lang.Object) pilha80);
        boolean boolean89 = pilha80.vazia();
        int int90 = pilha80.tamanho();
        pilha0.empilha((java.lang.Object) int90);
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + true + "'", obj86, true);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        boolean boolean18 = pilha0.vazia();
        java.lang.Object[] objArray19 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(objArray19);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object[] objArray3 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        java.lang.Object obj30 = pilha0.desempilha();
        pilha0.topo = (byte) -1;
        int int33 = pilha0.topo;
        boolean boolean34 = pilha0.vazia();
        java.lang.Object[] objArray35 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        java.lang.Object[] objArray8 = pilha6.item;
        java.lang.Object obj9 = null;
        pilha6.empilha(obj9);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.topo;
        java.lang.Object[] objArray13 = pilha11.item;
        pilha6.item = objArray13;
        boolean boolean15 = pilha6.vazia();
        java.lang.Class<?> wildcardClass16 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        boolean boolean13 = pilha0.vazia();
        java.lang.Object obj14 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        boolean boolean9 = pilha0.vazia();
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        int int13 = pilha5.tamanho();
        pilha0.empilha((java.lang.Object) pilha5);
        int int15 = pilha0.tamanho();
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        boolean boolean65 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.topo;
        pilha0.topo = 'a';
        java.lang.Object[] objArray11 = pilha0.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        java.lang.Object obj16 = pilha12.desempilha();
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        java.lang.Object obj22 = pilha18.desempilha();
        int int23 = pilha18.topo;
        int int24 = pilha18.topo;
        boolean boolean25 = pilha18.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.topo = 'a';
        boolean boolean31 = pilha27.vazia();
        java.lang.Object[] objArray32 = pilha27.item;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        boolean boolean38 = pilha33.vazia();
        pilha33.topo = 0;
        pilha33.topo = 100;
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        int int45 = pilha43.tamanho();
        boolean boolean46 = pilha43.vazia();
        java.lang.Object[] objArray47 = pilha43.item;
        pilha43.topo = 0;
        java.lang.Object[] objArray50 = pilha43.item;
        pilha33.item = objArray50;
        pilha27.item = objArray50;
        pilha26.item = objArray50;
        pilha18.item = objArray50;
        pilha12.item = objArray50;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 96 + "'", int23 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.topo = 'a';
        boolean boolean33 = pilha29.vazia();
        java.lang.Object[] objArray34 = pilha29.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        pilha35.empilha((java.lang.Object) true);
        int int39 = pilha35.tamanho();
        boolean boolean40 = pilha35.vazia();
        pilha35.topo = 0;
        pilha35.topo = 100;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        int int47 = pilha45.tamanho();
        boolean boolean48 = pilha45.vazia();
        java.lang.Object[] objArray49 = pilha45.item;
        pilha45.topo = 0;
        java.lang.Object[] objArray52 = pilha45.item;
        pilha35.item = objArray52;
        pilha29.item = objArray52;
        java.lang.Object[] objArray55 = pilha29.item;
        java.lang.Object obj56 = pilha29.desempilha();
        pilha0.empilha(obj56);
        ds.Pilha pilha58 = new ds.Pilha();
        boolean boolean59 = pilha58.vazia();
        pilha58.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray67 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha64.item = objArray67;
        pilha62.item = objArray67;
        pilha58.item = objArray67;
        java.lang.Object obj71 = pilha58.desempilha();
        int int72 = pilha58.topo;
        ds.Pilha pilha73 = new ds.Pilha();
        int int74 = pilha73.tamanho();
        pilha73.empilha((java.lang.Object) true);
        int int77 = pilha73.tamanho();
        boolean boolean78 = pilha73.vazia();
        pilha73.topo = 0;
        ds.Pilha pilha81 = new ds.Pilha();
        int int82 = pilha81.topo;
        java.lang.Object[] objArray83 = pilha81.item;
        pilha73.empilha((java.lang.Object) pilha81);
        pilha58.empilha((java.lang.Object) pilha73);
        java.lang.Object[] objArray86 = pilha73.item;
        boolean boolean87 = pilha73.vazia();
        boolean boolean88 = pilha73.vazia();
        boolean boolean89 = pilha73.vazia();
        pilha0.empilha((java.lang.Object) boolean89);
        int int91 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (short) 1 + "'", obj71, (short) 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        java.lang.Object[] objArray10 = pilha8.item;
        java.lang.Object obj11 = null;
        pilha8.empilha(obj11);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha8.item = objArray15;
        pilha0.empilha((java.lang.Object) objArray15);
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        java.lang.Object obj22 = pilha18.desempilha();
        int int23 = pilha18.topo;
        pilha18.topo = 0;
        int int26 = pilha18.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        int int31 = pilha27.tamanho();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha27.topo = 1;
        java.lang.Object[] objArray35 = pilha27.item;
        pilha18.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) true);
        int int41 = pilha37.tamanho();
        boolean boolean42 = pilha37.vazia();
        int int43 = pilha37.tamanho();
        int int44 = pilha37.topo;
        int int45 = pilha37.topo;
        java.lang.Object[] objArray46 = pilha37.item;
        pilha18.item = objArray46;
        pilha0.empilha((java.lang.Object) pilha18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 96 + "'", int23 == 96);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        pilha32.topo = 0;
        pilha32.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        int int44 = pilha42.tamanho();
        boolean boolean45 = pilha42.vazia();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha42.topo = 0;
        java.lang.Object[] objArray49 = pilha42.item;
        pilha32.item = objArray49;
        pilha26.item = objArray49;
        pilha25.item = objArray49;
        pilha20.empilha((java.lang.Object) objArray49);
        pilha0.item = objArray49;
        int int55 = pilha0.topo;
        int int56 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        java.lang.Object[] objArray9 = pilha7.item;
        pilha0.item = objArray9;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha11.item = objArray16;
        pilha7.item = objArray16;
        int int20 = pilha7.tamanho();
        java.lang.Object obj21 = null;
        pilha7.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha29.item = objArray32;
        pilha27.item = objArray32;
        pilha23.item = objArray32;
        java.lang.Object[] objArray36 = pilha23.item;
        int int37 = pilha23.tamanho();
        pilha23.topo = 0;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) true);
        int int44 = pilha40.tamanho();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha40.topo = 1;
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        pilha49.empilha((java.lang.Object) true);
        int int53 = pilha49.tamanho();
        boolean boolean54 = pilha49.vazia();
        int int55 = pilha49.tamanho();
        int int56 = pilha49.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        java.lang.Object[] objArray58 = pilha57.item;
        pilha49.item = objArray58;
        ds.Pilha pilha60 = new ds.Pilha();
        boolean boolean61 = pilha60.vazia();
        java.lang.Object[] objArray62 = pilha60.item;
        int int63 = pilha60.topo;
        ds.Pilha pilha64 = new ds.Pilha();
        boolean boolean65 = pilha64.vazia();
        pilha64.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.tamanho();
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha70.item = objArray73;
        pilha68.item = objArray73;
        pilha64.item = objArray73;
        java.lang.Object[] objArray77 = pilha64.item;
        java.lang.Object[] objArray78 = new java.lang.Object[] { pilha23, pilha40, "", objArray58, int63, objArray77 };
        pilha7.item = objArray78;
        java.lang.Object[] objArray80 = pilha7.item;
        java.lang.Object obj81 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha83 = new ds.Pilha();
        int int84 = pilha83.tamanho();
        pilha83.empilha((java.lang.Object) true);
        java.lang.Object obj87 = pilha83.desempilha();
        ds.Pilha pilha88 = new ds.Pilha();
        int int89 = pilha88.tamanho();
        pilha88.topo = 'a';
        boolean boolean92 = pilha88.vazia();
        java.lang.Object[] objArray93 = pilha88.item;
        pilha83.item = objArray93;
        pilha83.topo = '#';
        java.lang.Object[] objArray97 = pilha83.item;
        pilha7.item = objArray97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, null]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + true + "'", obj87, true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(objArray97);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object obj20 = pilha14.desempilha();
        java.lang.Object[] objArray21 = pilha14.item;
        pilha8.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha23.topo = 1;
        int int31 = pilha23.tamanho();
        java.lang.Object[] objArray32 = pilha23.item;
        pilha14.item = objArray32;
        boolean boolean34 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        int int36 = pilha0.topo;
        java.lang.Class<?> wildcardClass37 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        pilha0.topo = 97;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        boolean boolean13 = pilha0.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        pilha14.topo = (byte) 1;
        java.lang.Object[] objArray21 = pilha14.item;
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        int int24 = pilha22.tamanho();
        boolean boolean25 = pilha22.vazia();
        pilha14.empilha((java.lang.Object) boolean25);
        boolean boolean27 = pilha14.vazia();
        java.lang.Object[] objArray28 = pilha14.item;
        pilha0.item = objArray28;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Object[] objArray7 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (short) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha17.topo = 1;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha0.item = objArray25;
        boolean boolean27 = pilha0.vazia();
        java.lang.Object obj28 = pilha0.desempilha();
        java.lang.Object[] objArray29 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = (byte) 1;
        int int22 = pilha0.topo;
        int int23 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        int int20 = pilha16.tamanho();
        boolean boolean21 = pilha16.vazia();
        pilha16.topo = 0;
        pilha16.topo = 100;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        int int28 = pilha26.tamanho();
        boolean boolean29 = pilha26.vazia();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha26.topo = 0;
        java.lang.Object[] objArray33 = pilha26.item;
        pilha16.item = objArray33;
        java.lang.Object[] objArray35 = pilha16.item;
        pilha0.item = objArray35;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) true);
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha42.item = objArray45;
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1), objArray45, (short) 100, (short) 100, 0.0d };
        pilha37.item = objArray50;
        int int52 = pilha37.topo;
        java.lang.Object[] objArray53 = null;
        pilha37.item = objArray53;
        pilha37.topo = 0;
        pilha37.topo = ' ';
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.tamanho();
        pilha59.empilha((java.lang.Object) true);
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray67 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha64.item = objArray67;
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1), objArray67, (short) 100, (short) 100, 0.0d };
        pilha59.item = objArray72;
        java.lang.Object obj74 = pilha59.desempilha();
        java.lang.Object[] objArray75 = pilha59.item;
        pilha59.topo = (byte) 0;
        java.lang.Object[] objArray78 = pilha59.item;
        int int79 = pilha59.tamanho();
        java.lang.Object[] objArray80 = pilha59.item;
        pilha37.item = objArray80;
        pilha0.item = objArray80;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1) + "'", obj74, (-1));
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        boolean boolean17 = pilha15.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) true);
        int int22 = pilha18.tamanho();
        java.lang.Object[] objArray23 = pilha18.item;
        pilha18.topo = 1;
        pilha18.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass28 = pilha18.getClass();
        pilha15.empilha((java.lang.Object) wildcardClass28);
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha30.topo = 0;
        int int34 = pilha30.tamanho();
        pilha30.topo = (byte) -1;
        java.lang.Object[] objArray37 = pilha30.item;
        pilha15.item = objArray37;
        pilha0.item = objArray37;
        int int40 = pilha0.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.empilha((java.lang.Object) true);
        ds.Pilha pilha46 = new ds.Pilha();
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha46.item = objArray49;
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1), objArray49, (short) 100, (short) 100, 0.0d };
        pilha41.item = objArray54;
        java.lang.Object obj56 = pilha41.desempilha();
        java.lang.Object[] objArray57 = pilha41.item;
        pilha41.topo = (byte) 0;
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.tamanho();
        pilha60.topo = 'a';
        java.lang.Object obj64 = pilha60.desempilha();
        int int65 = pilha60.topo;
        pilha60.topo = 0;
        boolean boolean68 = pilha60.vazia();
        pilha41.empilha((java.lang.Object) boolean68);
        pilha41.topo = 0;
        pilha0.empilha((java.lang.Object) 0);
        int int73 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1) + "'", obj56, (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 96 + "'", int65 == 96);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 99 + "'", int73 == 99);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        java.lang.Object[] objArray73 = pilha0.item;
        pilha0.topo = 101;
        ds.Pilha pilha76 = new ds.Pilha();
        java.lang.Object[] objArray79 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha76.item = objArray79;
        pilha76.topo = (byte) -1;
        int int83 = pilha76.tamanho();
        boolean boolean84 = pilha76.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) boolean84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj24 = pilha8.desempilha();
        boolean boolean25 = pilha8.vazia();
        boolean boolean26 = pilha8.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha0.item = objArray14;
        boolean boolean16 = pilha0.vazia();
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        boolean boolean28 = pilha23.vazia();
        pilha23.topo = 0;
        pilha23.topo = 100;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        int int35 = pilha33.tamanho();
        boolean boolean36 = pilha33.vazia();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha33.topo = 0;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha23.item = objArray40;
        java.lang.Object[] objArray42 = pilha23.item;
        pilha7.item = objArray42;
        int int44 = pilha7.topo;
        pilha0.empilha((java.lang.Object) int44);
        java.lang.Object obj46 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj24 = pilha8.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pilha8.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        boolean boolean14 = pilha9.vazia();
        int int15 = pilha9.tamanho();
        int int16 = pilha9.topo;
        java.lang.Object[] objArray17 = pilha9.item;
        pilha0.empilha((java.lang.Object) objArray17);
        java.lang.Object obj19 = pilha0.desempilha();
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        int int11 = pilha9.tamanho();
        boolean boolean12 = pilha9.vazia();
        java.lang.Object[] objArray13 = pilha9.item;
        pilha9.topo = 0;
        pilha9.topo = 97;
        pilha9.topo = (short) 10;
        pilha0.empilha((java.lang.Object) pilha9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        pilha9.topo = 0;
        int int13 = pilha9.tamanho();
        pilha9.topo = (byte) -1;
        pilha9.topo = 96;
        pilha0.empilha((java.lang.Object) 96);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        java.lang.Object obj23 = pilha19.desempilha();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.topo = 'a';
        boolean boolean28 = pilha24.vazia();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha19.item = objArray29;
        pilha0.empilha((java.lang.Object) objArray29);
        java.lang.Object obj32 = pilha0.desempilha();
        boolean boolean33 = pilha0.vazia();
        java.lang.Class<?> wildcardClass34 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        java.lang.Object[] objArray23 = pilha7.item;
        pilha0.item = objArray23;
        boolean boolean25 = pilha0.vazia();
        pilha0.topo = 2;
        java.lang.Object obj28 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha26.topo = (short) 1;
        java.lang.Object obj30 = pilha26.desempilha();
        boolean boolean31 = pilha26.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        pilha32.topo = 0;
        pilha32.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        int int44 = pilha42.tamanho();
        boolean boolean45 = pilha42.vazia();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha42.topo = 0;
        java.lang.Object[] objArray49 = pilha42.item;
        pilha32.item = objArray49;
        java.lang.Object[] objArray51 = pilha32.item;
        ds.Pilha pilha52 = new ds.Pilha();
        int int53 = pilha52.tamanho();
        pilha52.empilha((java.lang.Object) true);
        int int56 = pilha52.tamanho();
        pilha52.topo = (byte) 1;
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.tamanho();
        pilha59.empilha((java.lang.Object) true);
        ds.Pilha pilha64 = new ds.Pilha();
        java.lang.Object[] objArray67 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha64.item = objArray67;
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1), objArray67, (short) 100, (short) 100, 0.0d };
        pilha59.item = objArray72;
        java.lang.Object obj74 = pilha59.desempilha();
        java.lang.Object[] objArray75 = pilha59.item;
        pilha52.item = objArray75;
        java.lang.Object[] objArray77 = pilha52.item;
        pilha32.item = objArray77;
        pilha26.item = objArray77;
        pilha26.topo = 97;
        boolean boolean82 = pilha26.vazia();
        pilha6.empilha((java.lang.Object) pilha26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1) + "'", obj74, (-1));
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        pilha0.topo = (byte) 10;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) true);
        int int14 = pilha10.tamanho();
        boolean boolean15 = pilha10.vazia();
        int int16 = pilha10.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        boolean boolean22 = pilha17.vazia();
        int int23 = pilha17.tamanho();
        int int24 = pilha17.topo;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha10.item = objArray25;
        pilha0.item = objArray25;
        java.lang.Object obj28 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.topo = 'a';
        boolean boolean33 = pilha29.vazia();
        java.lang.Object[] objArray34 = pilha29.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        pilha35.empilha((java.lang.Object) true);
        int int39 = pilha35.tamanho();
        boolean boolean40 = pilha35.vazia();
        pilha35.topo = 0;
        pilha35.topo = 100;
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        int int47 = pilha45.tamanho();
        boolean boolean48 = pilha45.vazia();
        java.lang.Object[] objArray49 = pilha45.item;
        pilha45.topo = 0;
        java.lang.Object[] objArray52 = pilha45.item;
        pilha35.item = objArray52;
        pilha29.item = objArray52;
        java.lang.Object[] objArray55 = pilha29.item;
        java.lang.Object obj56 = pilha29.desempilha();
        pilha0.empilha(obj56);
        pilha0.topo = 35;
        int int60 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object obj27 = pilha0.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        pilha28.empilha((java.lang.Object) true);
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha33.item = objArray36;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (-1), objArray36, (short) 100, (short) 100, 0.0d };
        pilha28.item = objArray41;
        java.lang.Object obj43 = pilha28.desempilha();
        pilha28.topo = (short) 10;
        int int46 = pilha28.tamanho();
        boolean boolean47 = pilha28.vazia();
        pilha28.topo = 98;
        ds.Pilha pilha50 = new ds.Pilha();
        pilha50.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha53 = new ds.Pilha();
        int int54 = pilha53.tamanho();
        pilha53.empilha((java.lang.Object) true);
        java.lang.Object obj57 = pilha53.desempilha();
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.tamanho();
        pilha58.topo = 'a';
        boolean boolean62 = pilha58.vazia();
        java.lang.Object[] objArray63 = pilha58.item;
        pilha53.item = objArray63;
        pilha50.item = objArray63;
        ds.Pilha pilha66 = new ds.Pilha();
        int int67 = pilha66.tamanho();
        pilha66.empilha((java.lang.Object) true);
        ds.Pilha pilha71 = new ds.Pilha();
        java.lang.Object[] objArray74 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha71.item = objArray74;
        java.lang.Object[] objArray79 = new java.lang.Object[] { (-1), objArray74, (short) 100, (short) 100, 0.0d };
        pilha66.item = objArray79;
        pilha50.item = objArray79;
        pilha28.item = objArray79;
        java.lang.Object[] objArray83 = pilha28.item;
        pilha0.empilha((java.lang.Object) pilha28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1) + "'", obj43, (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + true + "'", obj57, true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha0.empilha((java.lang.Object) objArray12);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.topo = 'a';
        boolean boolean18 = pilha14.vazia();
        java.lang.Object[] objArray19 = pilha14.item;
        int int20 = pilha14.tamanho();
        java.lang.Object obj21 = pilha14.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha28.item = objArray31;
        pilha26.item = objArray31;
        pilha22.item = objArray31;
        java.lang.Object[] objArray35 = pilha22.item;
        int int36 = pilha22.tamanho();
        pilha14.empilha((java.lang.Object) pilha22);
        java.lang.Object obj38 = pilha14.desempilha();
        int int39 = pilha14.tamanho();
        java.lang.Object obj40 = pilha14.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.topo = 'a';
        boolean boolean45 = pilha41.vazia();
        java.lang.Object[] objArray46 = pilha41.item;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        ds.Pilha pilha53 = new ds.Pilha();
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha53.item = objArray56;
        pilha51.item = objArray56;
        pilha47.item = objArray56;
        java.lang.Object[] objArray60 = pilha47.item;
        pilha41.item = objArray60;
        pilha14.empilha((java.lang.Object) objArray60);
        boolean boolean63 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        java.lang.Object obj65 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 96 + "'", int39 == 96);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 0;
        int int31 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha7.item = objArray14;
        pilha0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray29 = pilha19.item;
        int int30 = pilha19.topo;
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha19.empilha(obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        java.lang.Object[] objArray23 = pilha7.item;
        pilha0.item = objArray23;
        java.lang.Object[] objArray25 = pilha0.item;
        int int26 = pilha0.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        int int29 = pilha27.tamanho();
        boolean boolean30 = pilha27.vazia();
        pilha0.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        pilha32.topo = (short) 1;
        java.lang.Object obj36 = pilha32.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.topo = 'a';
        java.lang.Object obj41 = pilha37.desempilha();
        int int42 = pilha37.topo;
        pilha37.topo = 0;
        pilha37.topo = (byte) 10;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.tamanho();
        pilha47.empilha((java.lang.Object) true);
        int int51 = pilha47.tamanho();
        boolean boolean52 = pilha47.vazia();
        int int53 = pilha47.tamanho();
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.tamanho();
        pilha54.empilha((java.lang.Object) true);
        int int58 = pilha54.tamanho();
        boolean boolean59 = pilha54.vazia();
        int int60 = pilha54.tamanho();
        int int61 = pilha54.topo;
        java.lang.Object[] objArray62 = pilha54.item;
        pilha47.item = objArray62;
        pilha37.item = objArray62;
        pilha32.item = objArray62;
        pilha27.empilha((java.lang.Object) pilha32);
        boolean boolean67 = pilha32.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 96 + "'", int42 == 96);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        pilha0.topo = 1;
        int int20 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (short) 10;
        boolean boolean6 = pilha0.vazia();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray10 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        pilha14.topo = 1;
        pilha14.empilha((java.lang.Object) (byte) 10);
        int int24 = pilha14.tamanho();
        pilha0.empilha((java.lang.Object) pilha14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        java.lang.Object[] objArray19 = pilha0.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        int int24 = pilha20.tamanho();
        pilha20.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha32.item = objArray35;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1), objArray35, (short) 100, (short) 100, 0.0d };
        pilha27.item = objArray40;
        java.lang.Object obj42 = pilha27.desempilha();
        java.lang.Object[] objArray43 = pilha27.item;
        pilha20.item = objArray43;
        java.lang.Object[] objArray45 = pilha20.item;
        pilha0.item = objArray45;
        int int47 = pilha0.topo;
        pilha0.topo = (byte) 1;
        boolean boolean50 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1) + "'", obj42, (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        pilha0.topo = 95;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        int int3 = pilha2.tamanho();
        pilha2.topo = (short) -1;
        boolean boolean6 = pilha2.vazia();
        java.lang.Object[] objArray7 = pilha2.item;
        java.lang.Object[] objArray8 = pilha2.item;
        pilha0.item = objArray8;
        int int10 = pilha0.topo;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha9.topo = (byte) -1;
        java.lang.Object[] objArray16 = null;
        pilha9.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        boolean boolean22 = pilha18.vazia();
        java.lang.Object[] objArray23 = pilha18.item;
        pilha9.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        int int32 = pilha26.topo;
        int int33 = pilha26.tamanho();
        pilha0.empilha((java.lang.Object) pilha26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = (byte) 100;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.topo = 'a';
        boolean boolean27 = pilha23.vazia();
        java.lang.Object[] objArray28 = pilha23.item;
        int int29 = pilha23.tamanho();
        java.lang.Object obj30 = pilha23.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha37.item = objArray40;
        pilha35.item = objArray40;
        pilha31.item = objArray40;
        java.lang.Object[] objArray44 = pilha31.item;
        int int45 = pilha31.tamanho();
        pilha23.empilha((java.lang.Object) pilha31);
        pilha16.empilha((java.lang.Object) pilha31);
        int int48 = pilha16.topo;
        java.lang.Object[] objArray49 = pilha16.item;
        pilha0.item = objArray49;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 101 + "'", int48 == 101);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.topo = ' ';
        int int8 = pilha0.tamanho();
        pilha0.topo = 95;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.topo = (-1);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        pilha10.item = objArray20;
        pilha6.item = objArray20;
        pilha0.empilha((java.lang.Object) objArray20);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        java.lang.Object obj29 = pilha0.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha30.item = objArray33;
        pilha30.topo = (byte) -1;
        java.lang.Object[] objArray37 = null;
        pilha30.item = objArray37;
        int int39 = pilha30.tamanho();
        int int40 = pilha30.topo;
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha41.item = objArray44;
        pilha41.topo = (byte) -1;
        java.lang.Object[] objArray48 = null;
        pilha41.item = objArray48;
        boolean boolean50 = pilha41.vazia();
        java.lang.Object[] objArray51 = pilha41.item;
        pilha41.topo = '#';
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.tamanho();
        pilha54.topo = 'a';
        java.lang.Object obj58 = pilha54.desempilha();
        java.lang.Object[] objArray59 = pilha54.item;
        pilha41.item = objArray59;
        pilha30.item = objArray59;
        pilha0.item = objArray59;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(objArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.tamanho();
        java.lang.Object obj26 = pilha0.desempilha();
        int int27 = pilha0.topo;
        java.lang.Object obj28 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 96 + "'", int25 == 96);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1), objArray16, (short) 100, (short) 100, 0.0d };
        pilha8.item = objArray21;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha29.item = objArray32;
        pilha27.item = objArray32;
        pilha23.item = objArray32;
        java.lang.Object obj36 = pilha23.desempilha();
        int int37 = pilha23.topo;
        pilha23.topo = 35;
        java.lang.Object[] objArray40 = pilha23.item;
        pilha8.item = objArray40;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 1 + "'", obj36, (short) 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int18 = pilha0.tamanho();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = 97;
        pilha0.topo = 0;
        java.lang.Object[] objArray24 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        int int5 = pilha0.topo;
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 2;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = (byte) 1;
        int int22 = pilha0.topo;
        java.lang.Object obj23 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass24 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1) + "'", obj23, (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = (short) -1;
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.topo = (short) -1;
        boolean boolean18 = pilha14.vazia();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object[] objArray20 = pilha14.item;
        pilha12.item = objArray20;
        pilha0.empilha((java.lang.Object) pilha12);
        pilha12.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        java.lang.Object[] objArray11 = pilha9.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        java.lang.Object obj16 = pilha12.desempilha();
        pilha9.empilha(obj16);
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        java.lang.Object[] objArray20 = pilha18.item;
        pilha18.topo = 'a';
        java.lang.Object[] objArray23 = pilha18.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) true);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        java.lang.Object[] objArray30 = pilha28.item;
        pilha24.item = objArray30;
        pilha18.empilha((java.lang.Object) objArray30);
        pilha9.item = objArray30;
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object[] objArray35 = pilha9.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        pilha0.topo = 1;
        boolean boolean20 = pilha0.vazia();
        java.lang.Object obj21 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1) + "'", obj21, (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Object obj14 = pilha0.desempilha();
        pilha0.topo = 31;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.topo = (short) -1;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        java.lang.Object obj36 = pilha32.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.topo = 'a';
        boolean boolean41 = pilha37.vazia();
        java.lang.Object[] objArray42 = pilha37.item;
        pilha32.item = objArray42;
        pilha29.item = objArray42;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.empilha((java.lang.Object) true);
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha50.item = objArray53;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1), objArray53, (short) 100, (short) 100, 0.0d };
        pilha45.item = objArray58;
        pilha29.item = objArray58;
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        pilha61.empilha((java.lang.Object) true);
        ds.Pilha pilha66 = new ds.Pilha();
        java.lang.Object[] objArray69 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha66.item = objArray69;
        java.lang.Object[] objArray74 = new java.lang.Object[] { (-1), objArray69, (short) 100, (short) 100, 0.0d };
        pilha61.item = objArray74;
        pilha29.item = objArray74;
        pilha15.item = objArray74;
        ds.Pilha pilha78 = new ds.Pilha();
        boolean boolean79 = pilha78.vazia();
        int int80 = pilha78.tamanho();
        boolean boolean81 = pilha78.vazia();
        java.lang.Object[] objArray82 = pilha78.item;
        pilha78.topo = (byte) 100;
        java.lang.Object obj85 = pilha78.desempilha();
        int int86 = pilha78.tamanho();
        java.lang.Class<?> wildcardClass87 = pilha78.getClass();
        pilha15.empilha((java.lang.Object) pilha78);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 99 + "'", int86 == 99);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = (-1);
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        pilha0.topo = (short) -1;
        int int8 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        pilha0.topo = (short) 100;
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        boolean boolean26 = pilha6.vazia();
        boolean boolean27 = pilha6.vazia();
        boolean boolean28 = pilha6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int18 = pilha0.tamanho();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = 98;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) true);
        java.lang.Object obj29 = pilha25.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.topo = 'a';
        boolean boolean34 = pilha30.vazia();
        java.lang.Object[] objArray35 = pilha30.item;
        pilha25.item = objArray35;
        pilha22.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.empilha((java.lang.Object) true);
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha43.item = objArray46;
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1), objArray46, (short) 100, (short) 100, 0.0d };
        pilha38.item = objArray51;
        pilha22.item = objArray51;
        pilha0.item = objArray51;
        int int55 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 98 + "'", int55 == 98);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        int int17 = pilha13.tamanho();
        boolean boolean18 = pilha13.vazia();
        int int19 = pilha13.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha26.item = objArray29;
        pilha20.item = objArray29;
        pilha13.empilha((java.lang.Object) objArray29);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1), objArray21, (short) 100, (short) 100, 0.0d };
        pilha13.item = objArray26;
        java.lang.Object obj28 = pilha13.desempilha();
        java.lang.Object[] objArray29 = pilha13.item;
        int int30 = pilha13.topo;
        pilha0.empilha((java.lang.Object) pilha13);
        java.lang.Class<?> wildcardClass32 = pilha13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        int int22 = pilha20.tamanho();
        boolean boolean23 = pilha20.vazia();
        int int24 = pilha20.topo;
        java.lang.Object[] objArray25 = pilha20.item;
        pilha0.item = objArray25;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        int int2 = pilha1.tamanho();
        pilha1.topo = 'a';
        boolean boolean5 = pilha1.vazia();
        java.lang.Object[] objArray6 = pilha1.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        pilha7.topo = 0;
        pilha7.topo = 100;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = 0;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha7.item = objArray24;
        pilha1.item = objArray24;
        pilha0.item = objArray24;
        int int28 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        java.lang.Object obj12 = pilha8.desempilha();
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        java.lang.Object[] objArray19 = pilha17.item;
        java.lang.Object obj20 = null;
        pilha17.empilha(obj20);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.topo;
        java.lang.Object[] objArray24 = pilha22.item;
        pilha17.item = objArray24;
        java.lang.Object[] objArray26 = pilha17.item;
        int int27 = pilha17.topo;
        int int28 = pilha17.topo;
        pilha0.empilha((java.lang.Object) pilha17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.topo;
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = pilha3.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        boolean boolean9 = pilha7.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) true);
        int int14 = pilha10.tamanho();
        java.lang.Object[] objArray15 = pilha10.item;
        pilha10.topo = 1;
        pilha10.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass20 = pilha10.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass20);
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray23 = pilha22.item;
        pilha22.topo = 0;
        int int26 = pilha22.tamanho();
        pilha22.topo = (byte) -1;
        java.lang.Object[] objArray29 = pilha22.item;
        pilha7.item = objArray29;
        pilha3.item = objArray29;
        pilha0.item = objArray29;
        int int33 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        pilha0.topo = (byte) 10;
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        pilha0.topo = (short) -1;
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        java.lang.Object[] objArray11 = pilha9.item;
        pilha9.topo = 'a';
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        java.lang.Object[] objArray21 = pilha19.item;
        pilha15.item = objArray21;
        pilha9.empilha((java.lang.Object) objArray21);
        pilha0.item = objArray21;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        int int29 = pilha25.topo;
        pilha0.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha31 = new ds.Pilha();
        boolean boolean32 = pilha31.vazia();
        pilha31.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha37.item = objArray40;
        pilha35.item = objArray40;
        pilha31.item = objArray40;
        pilha0.item = objArray40;
        pilha0.topo = ' ';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.topo;
        java.lang.Object[] objArray11 = pilha9.item;
        java.lang.Object[] objArray12 = pilha9.item;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        pilha13.topo = 0;
        int int17 = pilha13.tamanho();
        int int18 = pilha13.tamanho();
        pilha13.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha26.item = objArray29;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), objArray29, (short) 100, (short) 100, 0.0d };
        pilha21.item = objArray34;
        pilha13.item = objArray34;
        pilha9.item = objArray34;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha44.item = objArray47;
        pilha42.item = objArray47;
        pilha38.item = objArray47;
        int int51 = pilha38.tamanho();
        int int52 = pilha38.tamanho();
        int int53 = pilha38.tamanho();
        int int54 = pilha38.tamanho();
        java.lang.Object[] objArray55 = pilha38.item;
        pilha9.item = objArray55;
        pilha0.item = objArray55;
        java.lang.Object[] objArray58 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100.0]");
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        int int2 = pilha1.tamanho();
        pilha1.topo = 'a';
        boolean boolean5 = pilha1.vazia();
        java.lang.Object[] objArray6 = pilha1.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        pilha7.topo = 0;
        pilha7.topo = 100;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = 0;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha7.item = objArray24;
        pilha1.item = objArray24;
        pilha0.item = objArray24;
        java.lang.Object[] objArray28 = pilha0.item;
        pilha0.topo = 2;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        java.lang.Object obj19 = pilha15.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        pilha15.item = objArray25;
        pilha12.item = objArray25;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        java.lang.Object[] objArray30 = pilha28.item;
        int int31 = pilha28.topo;
        int int32 = pilha28.tamanho();
        pilha12.empilha((java.lang.Object) pilha28);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.empilha((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray38 = pilha34.item;
        pilha28.item = objArray38;
        pilha0.item = objArray38;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha0.item = objArray14;
        int int16 = pilha0.topo;
        int int17 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        boolean boolean8 = pilha0.vazia();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        java.lang.Object[] objArray12 = pilha8.item;
        pilha0.item = objArray12;
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        java.lang.Object obj12 = pilha8.desempilha();
        java.lang.Object[] objArray13 = pilha8.item;
        java.lang.Object[] objArray14 = pilha8.item;
        pilha0.item = objArray14;
        int int16 = pilha0.topo;
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        java.lang.Object obj22 = pilha0.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray24 = pilha23.item;
        boolean boolean25 = pilha23.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        java.lang.Object[] objArray31 = pilha26.item;
        pilha26.topo = 1;
        pilha26.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass36 = pilha26.getClass();
        pilha23.empilha((java.lang.Object) wildcardClass36);
        ds.Pilha pilha38 = new ds.Pilha();
        java.lang.Object[] objArray39 = pilha38.item;
        pilha38.topo = 0;
        int int42 = pilha38.tamanho();
        pilha38.topo = (byte) -1;
        java.lang.Object[] objArray45 = pilha38.item;
        pilha23.item = objArray45;
        pilha0.item = objArray45;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.topo;
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = (short) -1;
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (short) 10;
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        pilha7.topo = 0;
        pilha7.topo = 100;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = 0;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha7.item = objArray24;
        pilha7.topo = 96;
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray29 = pilha28.item;
        pilha28.topo = 0;
        int int32 = pilha28.tamanho();
        pilha28.topo = (byte) -1;
        pilha28.topo = 96;
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        pilha37.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha43.item = objArray46;
        pilha41.item = objArray46;
        pilha37.item = objArray46;
        int int50 = pilha37.tamanho();
        int int51 = pilha37.tamanho();
        java.lang.Object[] objArray52 = pilha37.item;
        pilha28.item = objArray52;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.topo;
        pilha54.empilha((java.lang.Object) (-1));
        boolean boolean58 = pilha54.vazia();
        pilha54.topo = (short) 100;
        ds.Pilha pilha61 = new ds.Pilha();
        boolean boolean62 = pilha61.vazia();
        int int63 = pilha61.tamanho();
        boolean boolean64 = pilha61.vazia();
        java.lang.Object[] objArray65 = pilha61.item;
        pilha61.topo = 0;
        java.lang.Object[] objArray68 = pilha61.item;
        pilha54.item = objArray68;
        pilha28.item = objArray68;
        pilha7.item = objArray68;
        pilha0.item = objArray68;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1), objArray21, (short) 100, (short) 100, 0.0d };
        pilha13.item = objArray26;
        java.lang.Object obj28 = pilha13.desempilha();
        java.lang.Object[] objArray29 = pilha13.item;
        int int30 = pilha13.topo;
        pilha0.empilha((java.lang.Object) pilha13);
        pilha13.topo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        pilha5.topo = (byte) 10;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        int int21 = pilha15.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha15.item = objArray30;
        pilha5.item = objArray30;
        pilha0.item = objArray30;
        pilha0.topo = (byte) 10;
        boolean boolean36 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        boolean boolean28 = pilha23.vazia();
        pilha23.topo = 0;
        pilha23.topo = 100;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        int int35 = pilha33.tamanho();
        boolean boolean36 = pilha33.vazia();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha33.topo = 0;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha23.item = objArray40;
        java.lang.Object[] objArray42 = pilha23.item;
        pilha7.item = objArray42;
        int int44 = pilha7.topo;
        pilha0.empilha((java.lang.Object) int44);
        int int46 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        boolean boolean23 = pilha0.vazia();
        int int24 = pilha0.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha25.item = objArray28;
        pilha25.topo = (byte) -1;
        java.lang.Object[] objArray32 = null;
        pilha25.item = objArray32;
        boolean boolean34 = pilha25.vazia();
        java.lang.Object[] objArray35 = pilha25.item;
        pilha25.topo = '#';
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.topo = 'a';
        java.lang.Object obj42 = pilha38.desempilha();
        java.lang.Object[] objArray43 = pilha38.item;
        pilha25.item = objArray43;
        pilha0.item = objArray43;
        int int46 = pilha0.topo;
        java.lang.Object[] objArray47 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object obj20 = pilha14.desempilha();
        java.lang.Object[] objArray21 = pilha14.item;
        pilha8.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha23.topo = 1;
        int int31 = pilha23.tamanho();
        java.lang.Object[] objArray32 = pilha23.item;
        pilha14.item = objArray32;
        boolean boolean34 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        pilha0.topo = (short) -1;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.topo = 'a';
        java.lang.Object obj42 = pilha38.desempilha();
        int int43 = pilha38.topo;
        pilha38.topo = 0;
        pilha38.topo = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 96 + "'", int43 == 96);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray10 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean12 = pilha8.vazia();
        boolean boolean13 = pilha8.vazia();
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        java.lang.Object[] objArray16 = pilha14.item;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.topo = 'a';
        java.lang.Object obj21 = pilha17.desempilha();
        pilha14.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        java.lang.Object[] objArray25 = pilha23.item;
        pilha23.topo = 'a';
        java.lang.Object[] objArray28 = pilha23.item;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) true);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        java.lang.Object[] objArray35 = pilha33.item;
        pilha29.item = objArray35;
        pilha23.empilha((java.lang.Object) objArray35);
        pilha14.item = objArray35;
        pilha8.empilha((java.lang.Object) pilha14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        pilha0.topo = 35;
        int int18 = pilha0.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        int int21 = pilha19.tamanho();
        boolean boolean22 = pilha19.vazia();
        int int23 = pilha19.topo;
        int int24 = pilha19.tamanho();
        boolean boolean25 = pilha19.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        java.lang.Object[] objArray31 = pilha26.item;
        java.lang.Object obj32 = pilha26.desempilha();
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        java.lang.Object[] objArray35 = pilha33.item;
        pilha33.topo = 'a';
        ds.Pilha pilha38 = new ds.Pilha();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        pilha39.topo = 'a';
        boolean boolean43 = pilha39.vazia();
        java.lang.Object[] objArray44 = pilha39.item;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.empilha((java.lang.Object) true);
        int int49 = pilha45.tamanho();
        boolean boolean50 = pilha45.vazia();
        pilha45.topo = 0;
        pilha45.topo = 100;
        ds.Pilha pilha55 = new ds.Pilha();
        boolean boolean56 = pilha55.vazia();
        int int57 = pilha55.tamanho();
        boolean boolean58 = pilha55.vazia();
        java.lang.Object[] objArray59 = pilha55.item;
        pilha55.topo = 0;
        java.lang.Object[] objArray62 = pilha55.item;
        pilha45.item = objArray62;
        pilha39.item = objArray62;
        pilha38.item = objArray62;
        pilha33.empilha((java.lang.Object) objArray62);
        pilha26.item = objArray62;
        pilha19.item = objArray62;
        pilha0.item = objArray62;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.empilha((java.lang.Object) true);
        int int69 = pilha65.tamanho();
        boolean boolean70 = pilha65.vazia();
        pilha65.topo = 0;
        pilha65.topo = 100;
        ds.Pilha pilha75 = new ds.Pilha();
        boolean boolean76 = pilha75.vazia();
        int int77 = pilha75.tamanho();
        boolean boolean78 = pilha75.vazia();
        java.lang.Object[] objArray79 = pilha75.item;
        pilha75.topo = 0;
        java.lang.Object[] objArray82 = pilha75.item;
        pilha65.item = objArray82;
        java.lang.Object[] objArray84 = pilha65.item;
        pilha0.empilha((java.lang.Object) pilha65);
        ds.Pilha pilha86 = new ds.Pilha();
        java.lang.Object[] objArray87 = pilha86.item;
        pilha86.topo = 0;
        int int90 = pilha86.tamanho();
        int int91 = pilha86.tamanho();
        pilha86.topo = ' ';
        boolean boolean94 = pilha86.vazia();
        boolean boolean95 = pilha86.vazia();
        pilha0.empilha((java.lang.Object) boolean95);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 0;
        int int31 = pilha0.tamanho();
        int int32 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        java.lang.Object obj23 = null;
        pilha9.empilha(obj23);
        java.lang.Object obj25 = pilha9.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, null]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.topo = 2;
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        boolean boolean10 = pilha6.vazia();
        java.lang.Object[] objArray11 = pilha6.item;
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Class<?> wildcardClass18 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) pilha6);
        pilha0.topo = '#';
        java.lang.Object obj22 = pilha0.desempilha();
        int int23 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        java.lang.Object obj20 = pilha0.desempilha();
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        pilha21.topo = (short) 1;
        pilha0.empilha((java.lang.Object) pilha21);
        java.lang.Object[] objArray26 = pilha21.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        java.lang.Object obj65 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        java.lang.Object[] objArray19 = pilha0.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        int int24 = pilha20.tamanho();
        pilha20.topo = (byte) 1;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        ds.Pilha pilha32 = new ds.Pilha();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha32.item = objArray35;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1), objArray35, (short) 100, (short) 100, 0.0d };
        pilha27.item = objArray40;
        java.lang.Object obj42 = pilha27.desempilha();
        java.lang.Object[] objArray43 = pilha27.item;
        pilha20.item = objArray43;
        java.lang.Object[] objArray45 = pilha20.item;
        pilha0.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.tamanho();
        pilha47.topo = 'a';
        java.lang.Object obj51 = pilha47.desempilha();
        int int52 = pilha47.topo;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        int int55 = pilha53.tamanho();
        int int56 = pilha53.topo;
        pilha47.empilha((java.lang.Object) pilha53);
        int int58 = pilha53.tamanho();
        int int59 = pilha53.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1) + "'", obj42, (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 96 + "'", int52 == 96);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        pilha0.topo = (short) -1;
        java.lang.Object[] objArray13 = pilha0.item;
        java.lang.Object[] objArray14 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        int int8 = pilha0.topo;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object[] objArray11 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        java.lang.Object obj6 = pilha0.desempilha();
        pilha0.topo = 101;
        java.lang.Object[] objArray9 = pilha0.item;
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha17.topo = 1;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha0.item = objArray25;
        boolean boolean27 = pilha0.vazia();
        java.lang.Object obj28 = pilha0.desempilha();
        int int29 = pilha0.topo;
        int int30 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = 101;
        java.lang.Object obj12 = pilha0.desempilha();
        pilha0.topo = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        java.lang.Object[] objArray23 = pilha7.item;
        pilha0.item = objArray23;
        java.lang.Object[] objArray25 = pilha0.item;
        int int26 = pilha0.topo;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        int int29 = pilha27.tamanho();
        boolean boolean30 = pilha27.vazia();
        pilha0.empilha((java.lang.Object) pilha27);
        int int32 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        int int15 = pilha6.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.topo = (short) -1;
        boolean boolean20 = pilha16.vazia();
        pilha16.topo = 35;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha28.item = objArray31;
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1), objArray31, (short) 100, (short) 100, 0.0d };
        pilha23.item = objArray36;
        java.lang.Object obj38 = pilha23.desempilha();
        java.lang.Object[] objArray39 = pilha23.item;
        pilha23.topo = (byte) 0;
        ds.Pilha pilha42 = new ds.Pilha();
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha42.item = objArray45;
        pilha42.topo = (byte) -1;
        java.lang.Object[] objArray49 = null;
        pilha42.item = objArray49;
        pilha23.empilha((java.lang.Object) pilha42);
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha52.item = objArray55;
        pilha52.topo = (byte) -1;
        java.lang.Object[] objArray59 = null;
        pilha52.item = objArray59;
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        pilha61.topo = 'a';
        boolean boolean65 = pilha61.vazia();
        java.lang.Object[] objArray66 = pilha61.item;
        pilha52.item = objArray66;
        java.lang.Object[] objArray68 = pilha52.item;
        pilha23.item = objArray68;
        pilha16.item = objArray68;
        pilha6.item = objArray68;
        boolean boolean72 = pilha6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1) + "'", obj38, (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = 35;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = 99;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        int int20 = pilha18.tamanho();
        boolean boolean21 = pilha18.vazia();
        int int22 = pilha18.topo;
        pilha0.empilha((java.lang.Object) pilha18);
        pilha18.topo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        boolean boolean23 = pilha0.vazia();
        int int24 = pilha0.topo;
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.topo = 'a';
        boolean boolean29 = pilha25.vazia();
        java.lang.Object[] objArray30 = pilha25.item;
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha31.item = objArray34;
        pilha25.item = objArray34;
        int int37 = pilha25.tamanho();
        pilha0.empilha((java.lang.Object) pilha25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        boolean boolean26 = pilha6.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        int int32 = pilha27.tamanho();
        pilha6.empilha((java.lang.Object) pilha27);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.empilha((java.lang.Object) true);
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        java.lang.Object[] objArray40 = pilha38.item;
        pilha34.item = objArray40;
        pilha6.item = objArray40;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.tamanho();
        pilha43.topo = 'a';
        java.lang.Object obj47 = pilha43.desempilha();
        int int48 = pilha43.topo;
        pilha43.topo = 0;
        java.lang.Object[] objArray51 = pilha43.item;
        pilha6.item = objArray51;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 96 + "'", int48 == 96);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.topo = 'a';
        boolean boolean25 = pilha21.vazia();
        java.lang.Object[] objArray26 = pilha21.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        int int31 = pilha27.tamanho();
        boolean boolean32 = pilha27.vazia();
        pilha27.topo = 0;
        pilha27.topo = 100;
        ds.Pilha pilha37 = new ds.Pilha();
        boolean boolean38 = pilha37.vazia();
        int int39 = pilha37.tamanho();
        boolean boolean40 = pilha37.vazia();
        java.lang.Object[] objArray41 = pilha37.item;
        pilha37.topo = 0;
        java.lang.Object[] objArray44 = pilha37.item;
        pilha27.item = objArray44;
        pilha21.item = objArray44;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.tamanho();
        pilha47.empilha((java.lang.Object) true);
        int int51 = pilha47.tamanho();
        boolean boolean52 = pilha47.vazia();
        pilha47.topo = 0;
        pilha47.topo = 100;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        int int59 = pilha57.tamanho();
        boolean boolean60 = pilha57.vazia();
        java.lang.Object[] objArray61 = pilha57.item;
        pilha57.topo = 0;
        java.lang.Object[] objArray64 = pilha57.item;
        pilha47.item = objArray64;
        pilha21.item = objArray64;
        pilha0.item = objArray64;
        int int68 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        int int26 = pilha6.tamanho();
        pilha6.topo = 1;
        java.lang.Class<?> wildcardClass29 = pilha6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        pilha26.topo = 0;
        pilha26.topo = 100;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        int int38 = pilha36.tamanho();
        boolean boolean39 = pilha36.vazia();
        java.lang.Object[] objArray40 = pilha36.item;
        pilha36.topo = 0;
        java.lang.Object[] objArray43 = pilha36.item;
        pilha26.item = objArray43;
        pilha0.item = objArray43;
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.tamanho();
        pilha46.empilha((java.lang.Object) true);
        int int50 = pilha46.tamanho();
        java.lang.Object[] objArray51 = pilha46.item;
        pilha46.topo = 1;
        int int54 = pilha46.tamanho();
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha55.item = objArray58;
        pilha55.topo = (byte) -1;
        java.lang.Object[] objArray62 = null;
        pilha55.item = objArray62;
        ds.Pilha pilha64 = new ds.Pilha();
        int int65 = pilha64.tamanho();
        pilha64.topo = 'a';
        boolean boolean68 = pilha64.vazia();
        java.lang.Object[] objArray69 = pilha64.item;
        pilha55.item = objArray69;
        pilha46.item = objArray69;
        pilha0.item = objArray69;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        pilha7.topo = (short) 10;
        int int25 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) int25);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        int int31 = pilha27.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        int int34 = pilha32.tamanho();
        boolean boolean35 = pilha32.vazia();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha27.item = objArray36;
        pilha0.item = objArray36;
        int int39 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test844");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        int int15 = pilha6.tamanho();
        java.lang.Object[] objArray16 = pilha6.item;
        int int17 = pilha6.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test845");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        java.lang.Object[] objArray12 = pilha6.item;
        pilha6.topo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test846");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        int int19 = pilha6.tamanho();
        int int20 = pilha6.tamanho();
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object obj22 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test847");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        boolean boolean29 = pilha19.vazia();
        int int30 = pilha19.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test848");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha8.topo = 1;
        int int16 = pilha8.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        pilha17.topo = (byte) -1;
        java.lang.Object[] objArray24 = null;
        pilha17.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        pilha17.item = objArray31;
        pilha8.item = objArray31;
        java.lang.Object obj34 = pilha8.desempilha();
        java.lang.Object[] objArray35 = pilha8.item;
        pilha0.item = objArray35;
        int int37 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test849");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        int int12 = pilha6.topo;
        int int13 = pilha6.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test850");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test851");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        int int9 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test852");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        boolean boolean10 = pilha0.vazia();
        boolean boolean11 = pilha0.vazia();
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test853");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray19 = pilha0.item;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test854");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        pilha22.topo = 0;
        pilha22.topo = 100;
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        int int34 = pilha32.tamanho();
        boolean boolean35 = pilha32.vazia();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha32.topo = 0;
        java.lang.Object[] objArray39 = pilha32.item;
        pilha22.item = objArray39;
        pilha22.topo = 96;
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray44 = pilha43.item;
        pilha43.topo = 0;
        int int47 = pilha43.tamanho();
        pilha43.topo = (byte) -1;
        pilha43.topo = 96;
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha58.item = objArray61;
        pilha56.item = objArray61;
        pilha52.item = objArray61;
        int int65 = pilha52.tamanho();
        int int66 = pilha52.tamanho();
        java.lang.Object[] objArray67 = pilha52.item;
        pilha43.item = objArray67;
        ds.Pilha pilha69 = new ds.Pilha();
        int int70 = pilha69.topo;
        pilha69.empilha((java.lang.Object) (-1));
        boolean boolean73 = pilha69.vazia();
        pilha69.topo = (short) 100;
        ds.Pilha pilha76 = new ds.Pilha();
        boolean boolean77 = pilha76.vazia();
        int int78 = pilha76.tamanho();
        boolean boolean79 = pilha76.vazia();
        java.lang.Object[] objArray80 = pilha76.item;
        pilha76.topo = 0;
        java.lang.Object[] objArray83 = pilha76.item;
        pilha69.item = objArray83;
        pilha43.item = objArray83;
        pilha22.item = objArray83;
        pilha0.item = objArray83;
        int int88 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test855");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        boolean boolean29 = pilha15.vazia();
        int int30 = pilha15.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test856");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.empilha((java.lang.Object) (byte) 10);
        int int10 = pilha0.topo;
        int int11 = pilha0.tamanho();
        pilha0.topo = 97;
        boolean boolean14 = pilha0.vazia();
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test857");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        int int25 = pilha21.tamanho();
        boolean boolean26 = pilha21.vazia();
        int int27 = pilha21.tamanho();
        int int28 = pilha21.topo;
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray30 = pilha29.item;
        pilha21.item = objArray30;
        pilha0.item = objArray30;
        boolean boolean33 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test858");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha15.item = objArray22;
        pilha0.item = objArray22;
        int int26 = pilha0.tamanho();
        int int27 = pilha0.topo;
        java.lang.Object[] objArray28 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test859");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        pilha19.item = objArray24;
        pilha15.item = objArray24;
        pilha0.item = objArray24;
        java.lang.Object[] objArray29 = pilha0.item;
        java.lang.Object[] objArray30 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test860");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        int int19 = pilha0.topo;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test861");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        boolean boolean11 = pilha0.vazia();
        boolean boolean12 = pilha0.vazia();
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        int int19 = pilha14.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha26.item = objArray29;
        pilha24.item = objArray29;
        pilha20.item = objArray29;
        int int33 = pilha20.tamanho();
        int int34 = pilha20.tamanho();
        pilha14.empilha((java.lang.Object) pilha20);
        java.lang.Object[] objArray36 = pilha20.item;
        pilha0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test862");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        ds.Pilha pilha73 = new ds.Pilha();
        int int74 = pilha73.tamanho();
        pilha73.empilha((java.lang.Object) true);
        int int77 = pilha73.tamanho();
        boolean boolean78 = pilha73.vazia();
        pilha73.topo = 0;
        pilha73.topo = 100;
        ds.Pilha pilha83 = new ds.Pilha();
        boolean boolean84 = pilha83.vazia();
        int int85 = pilha83.tamanho();
        boolean boolean86 = pilha83.vazia();
        java.lang.Object[] objArray87 = pilha83.item;
        pilha83.topo = 0;
        java.lang.Object[] objArray90 = pilha83.item;
        pilha73.item = objArray90;
        java.lang.Object[] objArray92 = pilha73.item;
        pilha0.item = objArray92;
        int int94 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 2 + "'", int94 == 2);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test863");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        pilha28.empilha((java.lang.Object) true);
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha33.item = objArray36;
        java.lang.Object[] objArray41 = new java.lang.Object[] { (-1), objArray36, (short) 100, (short) 100, 0.0d };
        pilha28.item = objArray41;
        java.lang.Object obj43 = pilha28.desempilha();
        java.lang.Object[] objArray44 = pilha28.item;
        int int45 = pilha28.tamanho();
        boolean boolean46 = pilha28.vazia();
        java.lang.Class<?> wildcardClass47 = pilha28.getClass();
        pilha0.empilha((java.lang.Object) pilha28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1) + "'", obj43, (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test864");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        java.lang.Object[] objArray9 = pilha7.item;
        pilha7.topo = 'a';
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        java.lang.Object[] objArray19 = pilha17.item;
        pilha13.item = objArray19;
        pilha7.empilha((java.lang.Object) objArray19);
        int int22 = pilha7.tamanho();
        java.lang.Object obj23 = pilha7.desempilha();
        pilha0.empilha(obj23);
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha25.item = objArray28;
        pilha25.topo = (byte) -1;
        java.lang.Object[] objArray32 = null;
        pilha25.item = objArray32;
        boolean boolean34 = pilha25.vazia();
        java.lang.Object[] objArray35 = pilha25.item;
        pilha25.topo = '#';
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.topo = 'a';
        boolean boolean42 = pilha38.vazia();
        java.lang.Object[] objArray43 = pilha38.item;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        pilha44.empilha((java.lang.Object) true);
        int int48 = pilha44.tamanho();
        boolean boolean49 = pilha44.vazia();
        pilha44.topo = 0;
        pilha44.topo = 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha44.item = objArray61;
        pilha38.item = objArray61;
        java.lang.Object[] objArray64 = pilha38.item;
        pilha25.item = objArray64;
        pilha0.item = objArray64;
        int int67 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 98 + "'", int67 == 98);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test865");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test866");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        java.lang.Object[] objArray9 = null;
        pilha0.item = objArray9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test867");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        java.lang.Object[] objArray23 = pilha7.item;
        pilha0.item = objArray23;
        java.lang.Object[] objArray25 = pilha0.item;
        pilha0.topo = 95;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
    }
}


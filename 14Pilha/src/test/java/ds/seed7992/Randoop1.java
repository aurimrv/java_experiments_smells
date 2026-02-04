package ds.seed7992;

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
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        int int9 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        int int8 = pilha4.tamanho();
        boolean boolean9 = pilha4.vazia();
        boolean boolean10 = pilha4.vazia();
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        int int17 = pilha12.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) "hi!");
        pilha12.empilha((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass22 = pilha12.getClass();
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Class<?> wildcardClass24 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        boolean boolean11 = pilha8.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        int int18 = pilha12.tamanho();
        int int19 = pilha12.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        boolean boolean27 = pilha20.vazia();
        boolean boolean28 = pilha20.vazia();
        boolean boolean29 = pilha20.vazia();
        pilha12.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha31 = new ds.Pilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        pilha31.empilha((java.lang.Object) pilha32);
        int int36 = pilha32.tamanho();
        pilha20.empilha((java.lang.Object) int36);
        int int38 = pilha20.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 100.0f);
        boolean boolean42 = pilha39.vazia();
        int int43 = pilha39.tamanho();
        int int44 = pilha39.tamanho();
        pilha20.empilha((java.lang.Object) pilha39);
        pilha8.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 100.0f);
        int int50 = pilha47.tamanho();
        int int51 = pilha47.tamanho();
        int int52 = pilha47.tamanho();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) 100.0f);
        int int56 = pilha53.tamanho();
        int int57 = pilha53.tamanho();
        java.lang.Object obj58 = pilha53.desempilha();
        int int59 = pilha53.tamanho();
        int int60 = pilha53.tamanho();
        pilha47.empilha((java.lang.Object) int60);
        boolean boolean62 = pilha47.vazia();
        pilha8.empilha((java.lang.Object) pilha47);
        boolean boolean64 = pilha47.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        pilha5.empilha((java.lang.Object) 100.0f);
        int int8 = pilha5.tamanho();
        int int9 = pilha5.tamanho();
        java.lang.Class<?> wildcardClass10 = pilha5.getClass();
        pilha0.empilha((java.lang.Object) pilha5);
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = pilha19.desempilha();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        pilha12.empilha((java.lang.Object) wildcardClass27);
        pilha12.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        int int35 = pilha31.tamanho();
        java.lang.Object obj36 = pilha31.desempilha();
        java.lang.Class<?> wildcardClass37 = pilha31.getClass();
        pilha12.empilha((java.lang.Object) pilha31);
        boolean boolean39 = pilha12.vazia();
        pilha0.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 100.0f);
        int int44 = pilha41.tamanho();
        int int45 = pilha41.tamanho();
        boolean boolean46 = pilha41.vazia();
        boolean boolean47 = pilha41.vazia();
        int int48 = pilha41.tamanho();
        int int49 = pilha41.tamanho();
        java.lang.Object obj50 = pilha41.desempilha();
        pilha12.empilha((java.lang.Object) pilha41);
        boolean boolean52 = pilha41.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = null;
        pilha9.empilha(obj13);
        java.lang.Object obj15 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        java.lang.Object obj22 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) (-1.0f));
        boolean boolean25 = pilha18.vazia();
        boolean boolean26 = pilha18.vazia();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        java.lang.Object obj31 = null;
        pilha27.empilha(obj31);
        java.lang.Object obj33 = pilha27.desempilha();
        pilha18.empilha((java.lang.Object) pilha27);
        int int35 = pilha18.tamanho();
        java.lang.Class<?> wildcardClass36 = pilha18.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass36);
        boolean boolean38 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        int int18 = pilha11.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) pilha19);
        java.lang.Object obj21 = pilha11.desempilha();
        pilha0.empilha((java.lang.Object) pilha11);
        int int23 = pilha0.tamanho();
        boolean boolean24 = pilha0.vazia();
        java.lang.Class<?> wildcardClass25 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass15 = pilha8.getClass();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj23 = pilha17.desempilha();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 100.0f);
        int int27 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) 1.0f);
        pilha24.empilha((java.lang.Object) 100.0f);
        pilha17.empilha((java.lang.Object) pilha24);
        java.lang.Object obj33 = pilha17.desempilha();
        ds.Pilha pilha34 = new ds.Pilha();
        boolean boolean35 = pilha34.vazia();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 100.0f);
        int int39 = pilha36.tamanho();
        java.lang.Object obj40 = pilha36.desempilha();
        pilha36.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = pilha36.desempilha();
        int int44 = pilha36.tamanho();
        pilha34.empilha((java.lang.Object) pilha36);
        pilha17.empilha((java.lang.Object) pilha36);
        pilha8.empilha((java.lang.Object) pilha17);
        int int48 = pilha8.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0f) + "'", obj43, (-1.0f));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) "hi!");
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) (-1.0f));
        int int11 = pilha4.tamanho();
        boolean boolean12 = pilha4.vazia();
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj14 = pilha4.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        pilha15.empilha((java.lang.Object) pilha16);
        pilha15.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj22 = pilha15.desempilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 10);
        pilha15.empilha((java.lang.Object) 10);
        int int27 = pilha15.tamanho();
        int int28 = pilha15.tamanho();
        boolean boolean29 = pilha15.vazia();
        pilha4.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        java.lang.Object obj35 = null;
        pilha31.empilha(obj35);
        java.lang.Object obj37 = pilha31.desempilha();
        java.lang.Object obj38 = pilha31.desempilha();
        int int39 = pilha31.tamanho();
        boolean boolean40 = pilha31.vazia();
        int int41 = pilha31.tamanho();
        pilha4.empilha((java.lang.Object) int41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0d + "'", obj22, 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        int int19 = pilha16.tamanho();
        java.lang.Object obj20 = null;
        pilha16.empilha(obj20);
        boolean boolean22 = pilha16.vazia();
        java.lang.Object obj23 = null;
        pilha16.empilha(obj23);
        int int25 = pilha16.tamanho();
        pilha7.empilha((java.lang.Object) pilha16);
        boolean boolean27 = pilha7.vazia();
        boolean boolean28 = pilha7.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        java.lang.Object obj12 = pilha0.desempilha();
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        boolean boolean2 = pilha1.vazia();
        boolean boolean3 = pilha1.vazia();
        pilha0.empilha((java.lang.Object) boolean3);
        boolean boolean5 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        boolean boolean14 = pilha7.vazia();
        boolean boolean15 = pilha7.vazia();
        boolean boolean16 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) pilha7);
        int int18 = pilha0.tamanho();
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj16 = pilha0.desempilha();
        boolean boolean17 = pilha0.vazia();
        java.lang.Object obj18 = null;
        pilha0.empilha(obj18);
        boolean boolean20 = pilha0.vazia();
        boolean boolean21 = pilha0.vazia();
        java.lang.Object obj22 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 100.0f);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        boolean boolean13 = pilha0.vazia();
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 100.0f);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        java.lang.Object obj17 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1L);
        java.lang.Object obj20 = pilha13.desempilha();
        pilha0.empilha((java.lang.Object) pilha13);
        java.lang.Object obj22 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass23 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean8 = pilha0.vazia();
        int int9 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = pilha9.desempilha();
        int int17 = pilha9.tamanho();
        boolean boolean18 = pilha9.vazia();
        int int19 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) int19);
        int int21 = pilha0.tamanho();
        boolean boolean22 = pilha0.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha0.empilha((java.lang.Object) int24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean19 = pilha8.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = null;
        pilha20.empilha(obj24);
        boolean boolean26 = pilha20.vazia();
        int int27 = pilha20.tamanho();
        boolean boolean28 = pilha20.vazia();
        pilha8.empilha((java.lang.Object) pilha20);
        java.lang.Object obj30 = pilha20.desempilha();
        boolean boolean31 = pilha20.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.tamanho();
        boolean boolean18 = pilha0.vazia();
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) "hi!");
        boolean boolean23 = pilha20.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 100.0f);
        int int27 = pilha24.tamanho();
        java.lang.Object obj28 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) (-1.0f));
        int int31 = pilha24.tamanho();
        boolean boolean32 = pilha24.vazia();
        pilha20.empilha((java.lang.Object) pilha24);
        java.lang.Object obj34 = pilha24.desempilha();
        pilha0.empilha(obj34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0f) + "'", obj34, (-1.0f));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1L);
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        boolean boolean10 = pilha0.vazia();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha(obj14);
        java.lang.Object obj17 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        int int26 = pilha8.tamanho();
        int int27 = pilha8.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 100.0f);
        int int33 = pilha30.tamanho();
        java.lang.Object obj34 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj37 = pilha30.desempilha();
        int int38 = pilha30.tamanho();
        pilha28.empilha((java.lang.Object) pilha30);
        java.lang.Object obj40 = pilha28.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 100.0f);
        int int44 = pilha41.tamanho();
        int int45 = pilha41.tamanho();
        java.lang.Object obj46 = pilha41.desempilha();
        int int47 = pilha41.tamanho();
        pilha28.empilha((java.lang.Object) int47);
        java.lang.Class<?> wildcardClass49 = pilha28.getClass();
        pilha8.empilha((java.lang.Object) wildcardClass49);
        boolean boolean51 = pilha8.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 100.0f);
        java.lang.Object obj55 = pilha52.desempilha();
        pilha8.empilha((java.lang.Object) pilha52);
        boolean boolean57 = pilha8.vazia();
        int int58 = pilha8.tamanho();
        java.lang.Object obj59 = pilha8.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0f) + "'", obj37, (-1.0f));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (-1.0f));
        int int17 = pilha10.tamanho();
        int int18 = pilha10.tamanho();
        pilha0.empilha((java.lang.Object) int18);
        int int20 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj16 = null;
        pilha0.empilha(obj16);
        java.lang.Object obj18 = pilha0.desempilha();
        java.lang.Object obj19 = pilha0.desempilha();
        java.lang.Object obj20 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        int int26 = pilha8.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        boolean boolean30 = pilha27.vazia();
        int int31 = pilha27.tamanho();
        int int32 = pilha27.tamanho();
        pilha8.empilha((java.lang.Object) pilha27);
        int int34 = pilha27.tamanho();
        boolean boolean35 = pilha27.vazia();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 100.0f);
        int int39 = pilha36.tamanho();
        int int40 = pilha36.tamanho();
        boolean boolean41 = pilha36.vazia();
        boolean boolean42 = pilha36.vazia();
        int int43 = pilha36.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        boolean boolean46 = pilha44.vazia();
        int int47 = pilha44.tamanho();
        pilha36.empilha((java.lang.Object) pilha44);
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 100.0f);
        java.lang.Object obj52 = pilha49.desempilha();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) 100.0f);
        int int56 = pilha53.tamanho();
        java.lang.Object obj57 = pilha53.desempilha();
        pilha53.empilha((java.lang.Object) 1L);
        java.lang.Object obj60 = pilha53.desempilha();
        int int61 = pilha53.tamanho();
        java.lang.Object obj62 = null;
        pilha53.empilha(obj62);
        pilha49.empilha((java.lang.Object) pilha53);
        pilha44.empilha((java.lang.Object) pilha49);
        pilha27.empilha((java.lang.Object) pilha44);
        boolean boolean67 = pilha44.vazia();
        boolean boolean68 = pilha44.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1L + "'", obj60, 1L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) 100.0f);
        int int5 = pilha2.tamanho();
        java.lang.Object obj6 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = pilha2.desempilha();
        int int10 = pilha2.tamanho();
        pilha0.empilha((java.lang.Object) pilha2);
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        int int17 = pilha13.tamanho();
        java.lang.Object obj18 = pilha13.desempilha();
        int int19 = pilha13.tamanho();
        pilha0.empilha((java.lang.Object) int19);
        boolean boolean21 = pilha0.vazia();
        boolean boolean22 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean7 = pilha0.vazia();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Object obj9 = null;
        pilha0.empilha(obj9);
        int int11 = pilha0.tamanho();
        java.lang.Object obj12 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 100.0f);
        int int9 = pilha6.tamanho();
        int int10 = pilha6.tamanho();
        java.lang.Object obj11 = pilha6.desempilha();
        int int12 = pilha6.tamanho();
        int int13 = pilha6.tamanho();
        pilha0.empilha((java.lang.Object) int13);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 100.0f);
        int int18 = pilha15.tamanho();
        int int19 = pilha15.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        int int24 = pilha20.tamanho();
        java.lang.Class<?> wildcardClass25 = pilha20.getClass();
        pilha15.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        int int31 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 100.0f);
        int int37 = pilha34.tamanho();
        java.lang.Object obj38 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = pilha34.desempilha();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        pilha27.empilha((java.lang.Object) wildcardClass42);
        pilha27.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 100.0f);
        int int49 = pilha46.tamanho();
        int int50 = pilha46.tamanho();
        java.lang.Object obj51 = pilha46.desempilha();
        java.lang.Class<?> wildcardClass52 = pilha46.getClass();
        pilha27.empilha((java.lang.Object) pilha46);
        boolean boolean54 = pilha27.vazia();
        pilha15.empilha((java.lang.Object) pilha27);
        pilha0.empilha((java.lang.Object) pilha27);
        java.lang.Object obj57 = pilha0.desempilha();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 100.0f);
        int int61 = pilha58.tamanho();
        int int62 = pilha58.tamanho();
        int int63 = pilha58.tamanho();
        boolean boolean64 = pilha58.vazia();
        ds.Pilha pilha65 = new ds.Pilha();
        pilha65.empilha((java.lang.Object) 100.0f);
        int int68 = pilha65.tamanho();
        java.lang.Object obj69 = pilha65.desempilha();
        pilha65.empilha((java.lang.Object) (-1.0f));
        boolean boolean72 = pilha65.vazia();
        boolean boolean73 = pilha65.vazia();
        boolean boolean74 = pilha65.vazia();
        pilha58.empilha((java.lang.Object) pilha65);
        ds.Pilha pilha76 = new ds.Pilha();
        pilha76.empilha((java.lang.Object) 100.0f);
        int int79 = pilha76.tamanho();
        java.lang.Object obj80 = pilha76.desempilha();
        pilha76.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj83 = pilha76.desempilha();
        ds.Pilha pilha84 = new ds.Pilha();
        boolean boolean85 = pilha84.vazia();
        pilha76.empilha((java.lang.Object) pilha84);
        pilha58.empilha((java.lang.Object) pilha76);
        int int88 = pilha76.tamanho();
        int int89 = pilha76.tamanho();
        pilha0.empilha((java.lang.Object) pilha76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0f) + "'", obj41, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0f + "'", obj51, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0f + "'", obj69, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 100.0f + "'", obj80, 100.0f);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (-1.0f) + "'", obj83, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1L);
        int int21 = pilha14.tamanho();
        int int22 = pilha14.tamanho();
        pilha11.empilha((java.lang.Object) int22);
        java.lang.Object obj24 = pilha11.desempilha();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1L);
        int int32 = pilha25.tamanho();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) pilha33);
        int int35 = pilha25.tamanho();
        boolean boolean36 = pilha25.vazia();
        pilha11.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 100.0f);
        int int41 = pilha38.tamanho();
        int int42 = pilha38.tamanho();
        int int43 = pilha38.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 100.0f);
        int int47 = pilha44.tamanho();
        int int48 = pilha44.tamanho();
        java.lang.Object obj49 = pilha44.desempilha();
        int int50 = pilha44.tamanho();
        int int51 = pilha44.tamanho();
        pilha38.empilha((java.lang.Object) int51);
        pilha25.empilha((java.lang.Object) pilha38);
        pilha0.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 100.0f);
        int int61 = pilha58.tamanho();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1L);
        int int65 = pilha58.tamanho();
        int int66 = pilha58.tamanho();
        pilha55.empilha((java.lang.Object) int66);
        boolean boolean68 = pilha55.vazia();
        boolean boolean69 = pilha55.vazia();
        pilha0.empilha((java.lang.Object) pilha55);
        java.lang.Object obj71 = pilha55.desempilha();
        ds.Pilha pilha72 = new ds.Pilha();
        pilha72.empilha((java.lang.Object) 100.0f);
        int int75 = pilha72.tamanho();
        int int76 = pilha72.tamanho();
        java.lang.Object obj77 = pilha72.desempilha();
        boolean boolean78 = pilha72.vazia();
        int int79 = pilha72.tamanho();
        int int80 = pilha72.tamanho();
        ds.Pilha pilha81 = new ds.Pilha();
        pilha81.empilha((java.lang.Object) "hi!");
        boolean boolean84 = pilha81.vazia();
        ds.Pilha pilha85 = new ds.Pilha();
        pilha85.empilha((java.lang.Object) 100.0f);
        int int88 = pilha85.tamanho();
        java.lang.Object obj89 = pilha85.desempilha();
        pilha85.empilha((java.lang.Object) (-1.0f));
        int int92 = pilha85.tamanho();
        boolean boolean93 = pilha85.vazia();
        pilha81.empilha((java.lang.Object) pilha85);
        pilha72.empilha((java.lang.Object) pilha85);
        boolean boolean96 = pilha72.vazia();
        pilha55.empilha((java.lang.Object) boolean96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0f + "'", obj62, 100.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1 + "'", obj71, 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 100.0f + "'", obj77, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 100.0f + "'", obj89, 100.0f);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) "hi!");
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) (-1.0f));
        int int11 = pilha4.tamanho();
        boolean boolean12 = pilha4.vazia();
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj14 = pilha4.desempilha();
        java.lang.Object obj15 = null;
        pilha4.empilha(obj15);
        java.lang.Object obj17 = pilha4.desempilha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = pilha8.desempilha();
        int int16 = pilha8.tamanho();
        boolean boolean17 = pilha8.vazia();
        int int18 = pilha8.tamanho();
        java.lang.Class<?> wildcardClass19 = pilha8.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass19);
        int int21 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        int int18 = pilha11.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) pilha19);
        java.lang.Object obj21 = pilha11.desempilha();
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Object obj23 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        boolean boolean10 = pilha8.vazia();
        int int11 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        java.lang.Object obj16 = pilha13.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1L);
        java.lang.Object obj24 = pilha17.desempilha();
        int int25 = pilha17.tamanho();
        java.lang.Object obj26 = null;
        pilha17.empilha(obj26);
        pilha13.empilha((java.lang.Object) pilha17);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj30 = pilha8.desempilha();
        boolean boolean31 = pilha8.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 100.0f);
        int int37 = pilha34.tamanho();
        java.lang.Object obj38 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = pilha34.desempilha();
        int int42 = pilha34.tamanho();
        pilha32.empilha((java.lang.Object) pilha34);
        java.lang.Object obj44 = pilha32.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 100.0f);
        int int48 = pilha45.tamanho();
        int int49 = pilha45.tamanho();
        java.lang.Object obj50 = pilha45.desempilha();
        int int51 = pilha45.tamanho();
        pilha32.empilha((java.lang.Object) int51);
        java.lang.Object obj53 = pilha32.desempilha();
        pilha8.empilha(obj53);
        java.lang.Object obj55 = pilha8.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0f) + "'", obj41, (-1.0f));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0 + "'", obj55, 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object obj9 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = pilha11.desempilha();
        int int19 = pilha11.tamanho();
        pilha9.empilha((java.lang.Object) pilha11);
        java.lang.Object obj21 = pilha9.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        int int25 = pilha22.tamanho();
        int int26 = pilha22.tamanho();
        java.lang.Object obj27 = pilha22.desempilha();
        int int28 = pilha22.tamanho();
        pilha9.empilha((java.lang.Object) int28);
        java.lang.Object obj30 = pilha9.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        int int35 = pilha31.tamanho();
        java.lang.Object obj36 = pilha31.desempilha();
        int int37 = pilha31.tamanho();
        int int38 = pilha31.tamanho();
        pilha9.empilha((java.lang.Object) pilha31);
        boolean boolean40 = pilha31.vazia();
        pilha0.empilha((java.lang.Object) boolean40);
        java.lang.Class<?> wildcardClass42 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1);
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1.0f);
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = pilha0.desempilha();
        boolean boolean18 = pilha0.vazia();
        int int19 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.Float");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        int int8 = pilha4.tamanho();
        boolean boolean9 = pilha4.vazia();
        boolean boolean10 = pilha4.vazia();
        pilha0.empilha((java.lang.Object) pilha4);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        boolean boolean14 = pilha12.vazia();
        int int15 = pilha12.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        int int19 = pilha16.tamanho();
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) (-1.0f));
        boolean boolean23 = pilha16.vazia();
        boolean boolean24 = pilha16.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = null;
        pilha25.empilha(obj29);
        java.lang.Object obj31 = pilha25.desempilha();
        pilha16.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 100.0f);
        int int38 = pilha35.tamanho();
        java.lang.Object obj39 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = pilha35.desempilha();
        int int43 = pilha35.tamanho();
        pilha33.empilha((java.lang.Object) pilha35);
        pilha16.empilha((java.lang.Object) pilha33);
        pilha12.empilha((java.lang.Object) pilha33);
        java.lang.Object obj47 = pilha33.desempilha();
        pilha0.empilha((java.lang.Object) pilha33);
        java.lang.Class<?> wildcardClass49 = pilha33.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1.0f) + "'", obj42, (-1.0f));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        boolean boolean11 = pilha8.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        int int18 = pilha12.tamanho();
        int int19 = pilha12.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        boolean boolean27 = pilha20.vazia();
        boolean boolean28 = pilha20.vazia();
        boolean boolean29 = pilha20.vazia();
        pilha12.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha31 = new ds.Pilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        pilha31.empilha((java.lang.Object) pilha32);
        int int36 = pilha32.tamanho();
        pilha20.empilha((java.lang.Object) int36);
        int int38 = pilha20.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 100.0f);
        boolean boolean42 = pilha39.vazia();
        int int43 = pilha39.tamanho();
        int int44 = pilha39.tamanho();
        pilha20.empilha((java.lang.Object) pilha39);
        pilha8.empilha((java.lang.Object) pilha20);
        java.lang.Object obj47 = pilha20.desempilha();
        int int48 = pilha20.tamanho();
        java.lang.Object obj49 = pilha20.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1 + "'", obj49, 1);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = pilha10.desempilha();
        int int18 = pilha10.tamanho();
        pilha8.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        int int25 = pilha21.tamanho();
        java.lang.Object obj26 = pilha21.desempilha();
        int int27 = pilha21.tamanho();
        int int28 = pilha21.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 100.0f);
        int int32 = pilha29.tamanho();
        java.lang.Object obj33 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) (-1.0f));
        boolean boolean36 = pilha29.vazia();
        boolean boolean37 = pilha29.vazia();
        boolean boolean38 = pilha29.vazia();
        pilha21.empilha((java.lang.Object) pilha29);
        pilha10.empilha((java.lang.Object) pilha21);
        int int41 = pilha10.tamanho();
        int int42 = pilha10.tamanho();
        boolean boolean43 = pilha10.vazia();
        java.lang.Class<?> wildcardClass44 = pilha10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        boolean boolean14 = pilha7.vazia();
        boolean boolean15 = pilha7.vazia();
        boolean boolean16 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj18 = pilha7.desempilha();
        int int19 = pilha7.tamanho();
        int int20 = pilha7.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        boolean boolean11 = pilha8.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        int int18 = pilha12.tamanho();
        int int19 = pilha12.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        boolean boolean27 = pilha20.vazia();
        boolean boolean28 = pilha20.vazia();
        boolean boolean29 = pilha20.vazia();
        pilha12.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha31 = new ds.Pilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        pilha31.empilha((java.lang.Object) pilha32);
        int int36 = pilha32.tamanho();
        pilha20.empilha((java.lang.Object) int36);
        int int38 = pilha20.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 100.0f);
        boolean boolean42 = pilha39.vazia();
        int int43 = pilha39.tamanho();
        int int44 = pilha39.tamanho();
        pilha20.empilha((java.lang.Object) pilha39);
        pilha8.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 100.0f);
        int int50 = pilha47.tamanho();
        int int51 = pilha47.tamanho();
        int int52 = pilha47.tamanho();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) 100.0f);
        int int56 = pilha53.tamanho();
        int int57 = pilha53.tamanho();
        java.lang.Object obj58 = pilha53.desempilha();
        int int59 = pilha53.tamanho();
        int int60 = pilha53.tamanho();
        pilha47.empilha((java.lang.Object) int60);
        boolean boolean62 = pilha47.vazia();
        pilha8.empilha((java.lang.Object) pilha47);
        java.lang.Object obj64 = pilha8.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) 100);
        boolean boolean12 = pilha0.vazia();
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        boolean boolean10 = pilha8.vazia();
        int int11 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        java.lang.Object obj16 = pilha13.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1L);
        java.lang.Object obj24 = pilha17.desempilha();
        int int25 = pilha17.tamanho();
        java.lang.Object obj26 = null;
        pilha17.empilha(obj26);
        pilha13.empilha((java.lang.Object) pilha17);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Class<?> wildcardClass30 = pilha8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = pilha11.desempilha();
        int int19 = pilha11.tamanho();
        pilha9.empilha((java.lang.Object) pilha11);
        boolean boolean21 = pilha9.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        int int25 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj28 = pilha22.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 100.0f);
        int int32 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) 1.0f);
        pilha29.empilha((java.lang.Object) 100.0f);
        pilha22.empilha((java.lang.Object) pilha29);
        boolean boolean38 = pilha22.vazia();
        pilha9.empilha((java.lang.Object) pilha22);
        java.lang.Object obj40 = pilha9.desempilha();
        pilha0.empilha(obj40);
        boolean boolean42 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1L);
        int int17 = pilha10.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) pilha18);
        boolean boolean20 = pilha18.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        java.lang.Object obj25 = pilha21.desempilha();
        pilha21.empilha((java.lang.Object) 1L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        pilha28.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 100.0f);
        int int38 = pilha35.tamanho();
        java.lang.Object obj39 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = pilha35.desempilha();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        pilha28.empilha((java.lang.Object) wildcardClass43);
        pilha28.empilha((java.lang.Object) (byte) -1);
        pilha21.empilha((java.lang.Object) pilha28);
        java.lang.Object obj48 = pilha21.desempilha();
        pilha18.empilha((java.lang.Object) pilha21);
        pilha0.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 100.0f);
        int int54 = pilha51.tamanho();
        int int55 = pilha51.tamanho();
        int int56 = pilha51.tamanho();
        pilha51.empilha((java.lang.Object) 1L);
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.empilha((java.lang.Object) 100.0f);
        boolean boolean62 = pilha59.vazia();
        boolean boolean63 = pilha59.vazia();
        java.lang.Object obj64 = pilha59.desempilha();
        int int65 = pilha59.tamanho();
        pilha51.empilha((java.lang.Object) pilha59);
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) 100.0f);
        boolean boolean70 = pilha67.vazia();
        java.lang.Object obj71 = pilha67.desempilha();
        int int72 = pilha67.tamanho();
        int int73 = pilha67.tamanho();
        boolean boolean74 = pilha67.vazia();
        pilha59.empilha((java.lang.Object) pilha67);
        int int76 = pilha59.tamanho();
        pilha0.empilha((java.lang.Object) int76);
        java.lang.Object obj78 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1.0f) + "'", obj42, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0f + "'", obj71, 100.0f);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 1 + "'", obj78, 1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj18 = pilha12.desempilha();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) 1.0f);
        pilha19.empilha((java.lang.Object) 100.0f);
        pilha12.empilha((java.lang.Object) pilha19);
        java.lang.Object obj28 = pilha12.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        java.lang.Object obj35 = pilha31.desempilha();
        pilha31.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = pilha31.desempilha();
        int int39 = pilha31.tamanho();
        pilha29.empilha((java.lang.Object) pilha31);
        pilha12.empilha((java.lang.Object) pilha31);
        pilha0.empilha((java.lang.Object) pilha12);
        java.lang.Object obj43 = null;
        pilha0.empilha(obj43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1.0f) + "'", obj38, (-1.0f));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = null;
        pilha9.empilha(obj13);
        java.lang.Object obj15 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        int int25 = pilha20.tamanho();
        pilha17.empilha((java.lang.Object) int25);
        pilha9.empilha((java.lang.Object) int25);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        java.lang.Object obj33 = pilha28.desempilha();
        boolean boolean34 = pilha28.vazia();
        int int35 = pilha28.tamanho();
        int int36 = pilha28.tamanho();
        boolean boolean37 = pilha28.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 100.0f);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        boolean boolean43 = pilha38.vazia();
        pilha28.empilha((java.lang.Object) pilha38);
        pilha9.empilha((java.lang.Object) pilha38);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 100.0f);
        int int49 = pilha46.tamanho();
        java.lang.Object obj50 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) (-1.0f));
        boolean boolean53 = pilha46.vazia();
        boolean boolean54 = pilha46.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) 100.0f);
        int int58 = pilha55.tamanho();
        java.lang.Object obj59 = null;
        pilha55.empilha(obj59);
        java.lang.Object obj61 = pilha55.desempilha();
        pilha46.empilha((java.lang.Object) pilha55);
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.empilha((java.lang.Object) 100.0f);
        boolean boolean69 = pilha66.vazia();
        java.lang.Object obj70 = pilha66.desempilha();
        int int71 = pilha66.tamanho();
        pilha63.empilha((java.lang.Object) int71);
        pilha55.empilha((java.lang.Object) int71);
        ds.Pilha pilha74 = new ds.Pilha();
        int int75 = pilha74.tamanho();
        pilha55.empilha((java.lang.Object) int75);
        int int77 = pilha55.tamanho();
        ds.Pilha pilha78 = new ds.Pilha();
        pilha78.empilha((java.lang.Object) 100.0f);
        int int81 = pilha78.tamanho();
        int int82 = pilha78.tamanho();
        pilha78.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj85 = pilha78.desempilha();
        pilha55.empilha((java.lang.Object) pilha78);
        boolean boolean87 = pilha78.vazia();
        boolean boolean88 = pilha78.vazia();
        pilha38.empilha((java.lang.Object) boolean88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0f + "'", obj70, 100.0f);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 1.0d + "'", obj85, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = null;
        pilha17.empilha(obj21);
        java.lang.Object obj23 = pilha17.desempilha();
        pilha8.empilha((java.lang.Object) pilha17);
        int int25 = pilha8.tamanho();
        java.lang.Object obj26 = pilha8.desempilha();
        java.lang.Object obj27 = pilha8.desempilha();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        int int12 = pilha8.tamanho();
        java.lang.Object obj13 = pilha8.desempilha();
        pilha0.empilha(obj13);
        java.lang.Object obj15 = pilha0.desempilha();
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 100.0f);
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        int int14 = pilha10.tamanho();
        boolean boolean15 = pilha10.vazia();
        boolean boolean16 = pilha10.vazia();
        int int17 = pilha10.tamanho();
        int int18 = pilha10.tamanho();
        boolean boolean19 = pilha10.vazia();
        pilha0.empilha((java.lang.Object) pilha10);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        java.lang.Object obj25 = pilha21.desempilha();
        pilha21.empilha((java.lang.Object) 1L);
        int int28 = pilha21.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) pilha29);
        boolean boolean31 = pilha29.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        int int35 = pilha32.tamanho();
        java.lang.Object obj36 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) 1L);
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 100.0f);
        int int42 = pilha39.tamanho();
        int int43 = pilha39.tamanho();
        pilha39.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 100.0f);
        int int49 = pilha46.tamanho();
        java.lang.Object obj50 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj53 = pilha46.desempilha();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        pilha39.empilha((java.lang.Object) wildcardClass54);
        pilha39.empilha((java.lang.Object) (byte) -1);
        pilha32.empilha((java.lang.Object) pilha39);
        java.lang.Object obj59 = pilha32.desempilha();
        pilha29.empilha((java.lang.Object) pilha32);
        pilha10.empilha((java.lang.Object) pilha29);
        boolean boolean62 = pilha29.vazia();
        java.lang.Object obj63 = pilha29.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1.0f) + "'", obj53, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        java.lang.Object obj12 = pilha0.desempilha();
        int int13 = pilha0.tamanho();
        boolean boolean14 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.tamanho();
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass26 = pilha19.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = pilha0.desempilha();
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class ds.Pilha");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        int int13 = pilha9.tamanho();
        java.lang.Object obj14 = pilha9.desempilha();
        int int15 = pilha9.tamanho();
        int int16 = pilha9.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (-1.0f));
        boolean boolean24 = pilha17.vazia();
        boolean boolean25 = pilha17.vazia();
        boolean boolean26 = pilha17.vazia();
        pilha9.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha28 = new ds.Pilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 100.0f);
        pilha28.empilha((java.lang.Object) pilha29);
        int int33 = pilha29.tamanho();
        pilha17.empilha((java.lang.Object) int33);
        int int35 = pilha17.tamanho();
        int int36 = pilha17.tamanho();
        boolean boolean37 = pilha17.vazia();
        pilha0.empilha((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1L);
        int int21 = pilha14.tamanho();
        int int22 = pilha14.tamanho();
        pilha11.empilha((java.lang.Object) int22);
        java.lang.Object obj24 = pilha11.desempilha();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) 1L);
        int int32 = pilha25.tamanho();
        ds.Pilha pilha33 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) pilha33);
        int int35 = pilha25.tamanho();
        boolean boolean36 = pilha25.vazia();
        pilha11.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 100.0f);
        int int41 = pilha38.tamanho();
        int int42 = pilha38.tamanho();
        int int43 = pilha38.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 100.0f);
        int int47 = pilha44.tamanho();
        int int48 = pilha44.tamanho();
        java.lang.Object obj49 = pilha44.desempilha();
        int int50 = pilha44.tamanho();
        int int51 = pilha44.tamanho();
        pilha38.empilha((java.lang.Object) int51);
        pilha25.empilha((java.lang.Object) pilha38);
        pilha0.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 100.0f);
        int int61 = pilha58.tamanho();
        java.lang.Object obj62 = pilha58.desempilha();
        pilha58.empilha((java.lang.Object) 1L);
        int int65 = pilha58.tamanho();
        int int66 = pilha58.tamanho();
        pilha55.empilha((java.lang.Object) int66);
        boolean boolean68 = pilha55.vazia();
        boolean boolean69 = pilha55.vazia();
        pilha0.empilha((java.lang.Object) pilha55);
        java.lang.Object obj71 = pilha55.desempilha();
        java.lang.Object obj72 = pilha55.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0f + "'", obj62, 100.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1 + "'", obj71, 1);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "hi!" + "'", obj72, "hi!");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) 1L);
        int int17 = pilha10.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) pilha18);
        boolean boolean20 = pilha18.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        java.lang.Object obj25 = pilha21.desempilha();
        pilha21.empilha((java.lang.Object) 1L);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        pilha28.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 100.0f);
        int int38 = pilha35.tamanho();
        java.lang.Object obj39 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj42 = pilha35.desempilha();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        pilha28.empilha((java.lang.Object) wildcardClass43);
        pilha28.empilha((java.lang.Object) (byte) -1);
        pilha21.empilha((java.lang.Object) pilha28);
        java.lang.Object obj48 = pilha21.desempilha();
        pilha18.empilha((java.lang.Object) pilha21);
        pilha0.empilha((java.lang.Object) pilha18);
        java.lang.Object obj51 = pilha18.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = pilha18.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1.0f) + "'", obj42, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        int int23 = pilha19.tamanho();
        java.lang.Object obj24 = pilha19.desempilha();
        java.lang.Class<?> wildcardClass25 = pilha19.getClass();
        pilha0.empilha((java.lang.Object) pilha19);
        boolean boolean27 = pilha0.vazia();
        boolean boolean28 = pilha0.vazia();
        java.lang.Object obj29 = pilha0.desempilha();
        int int30 = pilha0.tamanho();
        java.lang.Object obj31 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) "hi!");
        boolean boolean12 = pilha9.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        java.lang.Object obj17 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) (-1.0f));
        int int20 = pilha13.tamanho();
        boolean boolean21 = pilha13.vazia();
        pilha9.empilha((java.lang.Object) pilha13);
        pilha0.empilha((java.lang.Object) pilha13);
        int int24 = pilha0.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (-1.0f));
        boolean boolean32 = pilha25.vazia();
        boolean boolean33 = pilha25.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 100.0f);
        int int37 = pilha34.tamanho();
        java.lang.Object obj38 = null;
        pilha34.empilha(obj38);
        java.lang.Object obj40 = pilha34.desempilha();
        pilha25.empilha((java.lang.Object) pilha34);
        int int42 = pilha25.tamanho();
        java.lang.Object obj43 = pilha25.desempilha();
        boolean boolean44 = pilha25.vazia();
        pilha0.empilha((java.lang.Object) pilha25);
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) 100.0f);
        int int51 = pilha48.tamanho();
        java.lang.Object obj52 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj55 = pilha48.desempilha();
        int int56 = pilha48.tamanho();
        pilha46.empilha((java.lang.Object) pilha48);
        pilha25.empilha((java.lang.Object) pilha46);
        java.lang.Object obj59 = pilha46.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1.0f) + "'", obj55, (-1.0f));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj15 = pilha9.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        int int19 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) 1.0f);
        pilha16.empilha((java.lang.Object) 100.0f);
        pilha9.empilha((java.lang.Object) pilha16);
        boolean boolean25 = pilha9.vazia();
        int int26 = pilha9.tamanho();
        boolean boolean27 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj29 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0f + "'", obj15, 1.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 10);
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 100.0f);
        boolean boolean6 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) pilha3);
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        int int12 = pilha8.tamanho();
        int int13 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) 1L);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        boolean boolean19 = pilha16.vazia();
        boolean boolean20 = pilha16.vazia();
        java.lang.Object obj21 = pilha16.desempilha();
        int int22 = pilha16.tamanho();
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        int int14 = pilha10.tamanho();
        int int15 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) 1L);
        int int18 = pilha10.tamanho();
        int int19 = pilha10.tamanho();
        java.lang.Object obj20 = pilha10.desempilha();
        pilha8.empilha((java.lang.Object) pilha10);
        int int22 = pilha8.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.empilha((java.lang.Object) (-1.0f));
        boolean boolean11 = pilha4.vazia();
        boolean boolean12 = pilha4.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        java.lang.Object obj17 = null;
        pilha13.empilha(obj17);
        java.lang.Object obj19 = pilha13.desempilha();
        pilha4.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 100.0f);
        int int26 = pilha23.tamanho();
        java.lang.Object obj27 = pilha23.desempilha();
        pilha23.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = pilha23.desempilha();
        int int31 = pilha23.tamanho();
        pilha21.empilha((java.lang.Object) pilha23);
        pilha4.empilha((java.lang.Object) pilha21);
        pilha0.empilha((java.lang.Object) pilha21);
        boolean boolean35 = pilha21.vazia();
        java.lang.Object obj36 = pilha21.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = pilha10.desempilha();
        int int18 = pilha10.tamanho();
        pilha8.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        java.lang.Object obj21 = pilha0.desempilha();
        int int22 = pilha0.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 100.0f);
        int int26 = pilha23.tamanho();
        int int27 = pilha23.tamanho();
        boolean boolean28 = pilha23.vazia();
        boolean boolean29 = pilha23.vazia();
        int int30 = pilha23.tamanho();
        int int31 = pilha23.tamanho();
        boolean boolean32 = pilha23.vazia();
        int int33 = pilha23.tamanho();
        int int34 = pilha23.tamanho();
        java.lang.Object obj35 = pilha23.desempilha();
        pilha0.empilha((java.lang.Object) pilha23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = pilha23.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        int int13 = pilha9.tamanho();
        java.lang.Object obj14 = pilha9.desempilha();
        int int15 = pilha9.tamanho();
        int int16 = pilha9.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) (-1.0f));
        boolean boolean24 = pilha17.vazia();
        boolean boolean25 = pilha17.vazia();
        boolean boolean26 = pilha17.vazia();
        pilha9.empilha((java.lang.Object) pilha17);
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        java.lang.Object obj33 = pilha28.desempilha();
        int int34 = pilha28.tamanho();
        pilha9.empilha((java.lang.Object) int34);
        java.lang.Object obj36 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj38 = pilha0.desempilha();
        int int39 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) "hi!");
        boolean boolean12 = pilha9.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        java.lang.Object obj17 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) (-1.0f));
        int int20 = pilha13.tamanho();
        boolean boolean21 = pilha13.vazia();
        pilha9.empilha((java.lang.Object) pilha13);
        pilha0.empilha((java.lang.Object) pilha13);
        boolean boolean24 = pilha0.vazia();
        boolean boolean25 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        java.lang.Object obj26 = pilha8.desempilha();
        int int27 = pilha8.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = pilha0.desempilha();
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.Float");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = pilha11.desempilha();
        int int19 = pilha11.tamanho();
        pilha9.empilha((java.lang.Object) pilha11);
        boolean boolean21 = pilha9.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        int int25 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj28 = pilha22.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 100.0f);
        int int32 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) 1.0f);
        pilha29.empilha((java.lang.Object) 100.0f);
        pilha22.empilha((java.lang.Object) pilha29);
        boolean boolean38 = pilha22.vazia();
        pilha9.empilha((java.lang.Object) pilha22);
        pilha0.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        boolean boolean10 = pilha8.vazia();
        int int11 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        java.lang.Object obj16 = pilha13.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = pilha17.desempilha();
        pilha17.empilha((java.lang.Object) 1L);
        java.lang.Object obj24 = pilha17.desempilha();
        int int25 = pilha17.tamanho();
        java.lang.Object obj26 = null;
        pilha17.empilha(obj26);
        pilha13.empilha((java.lang.Object) pilha17);
        pilha8.empilha((java.lang.Object) pilha13);
        java.lang.Object obj30 = pilha8.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        int int35 = pilha31.tamanho();
        boolean boolean36 = pilha31.vazia();
        boolean boolean37 = pilha31.vazia();
        int int38 = pilha31.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        boolean boolean41 = pilha39.vazia();
        int int42 = pilha39.tamanho();
        pilha31.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 100.0f);
        java.lang.Object obj47 = pilha44.desempilha();
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) 100.0f);
        int int51 = pilha48.tamanho();
        java.lang.Object obj52 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) 1L);
        java.lang.Object obj55 = pilha48.desempilha();
        int int56 = pilha48.tamanho();
        java.lang.Object obj57 = null;
        pilha48.empilha(obj57);
        pilha44.empilha((java.lang.Object) pilha48);
        pilha39.empilha((java.lang.Object) pilha44);
        java.lang.Object obj61 = pilha39.desempilha();
        pilha8.empilha(obj61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1L + "'", obj55, 1L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1L);
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        int int13 = pilha9.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        int int18 = pilha14.tamanho();
        java.lang.Class<?> wildcardClass19 = pilha14.getClass();
        pilha9.empilha((java.lang.Object) pilha14);
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        int int25 = pilha22.tamanho();
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        boolean boolean28 = pilha22.vazia();
        int int29 = pilha22.tamanho();
        int int30 = pilha22.tamanho();
        boolean boolean31 = pilha22.vazia();
        int int32 = pilha22.tamanho();
        int int33 = pilha22.tamanho();
        boolean boolean34 = pilha22.vazia();
        pilha14.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = null;
        pilha9.empilha(obj13);
        java.lang.Object obj15 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        boolean boolean23 = pilha20.vazia();
        java.lang.Object obj24 = pilha20.desempilha();
        int int25 = pilha20.tamanho();
        pilha17.empilha((java.lang.Object) int25);
        pilha9.empilha((java.lang.Object) int25);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        pilha9.empilha((java.lang.Object) int29);
        int int31 = pilha9.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        int int35 = pilha32.tamanho();
        int int36 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj39 = pilha32.desempilha();
        pilha9.empilha((java.lang.Object) pilha32);
        int int41 = pilha9.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0d + "'", obj39, 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = null;
        pilha8.empilha(obj12);
        boolean boolean14 = pilha8.vazia();
        java.lang.Object obj15 = null;
        pilha8.empilha(obj15);
        java.lang.Object obj17 = pilha8.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = pilha20.desempilha();
        int int28 = pilha20.tamanho();
        pilha18.empilha((java.lang.Object) pilha20);
        java.lang.Object obj30 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) '#');
        pilha8.empilha((java.lang.Object) '#');
        int int34 = pilha8.tamanho();
        int int35 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) int35);
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        boolean boolean39 = pilha37.vazia();
        boolean boolean40 = pilha37.vazia();
        java.lang.Class<?> wildcardClass41 = pilha37.getClass();
        pilha0.empilha((java.lang.Object) pilha37);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (short) 100);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = pilha8.desempilha();
        int int16 = pilha8.tamanho();
        boolean boolean17 = pilha8.vazia();
        int int18 = pilha8.tamanho();
        int int19 = pilha8.tamanho();
        int int20 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        int int25 = pilha22.tamanho();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = pilha22.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        int int35 = pilha32.tamanho();
        java.lang.Object obj36 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = pilha32.desempilha();
        int int40 = pilha32.tamanho();
        pilha30.empilha((java.lang.Object) pilha32);
        pilha22.empilha((java.lang.Object) pilha32);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 100.0f);
        int int46 = pilha43.tamanho();
        int int47 = pilha43.tamanho();
        java.lang.Object obj48 = pilha43.desempilha();
        int int49 = pilha43.tamanho();
        int int50 = pilha43.tamanho();
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 100.0f);
        int int54 = pilha51.tamanho();
        java.lang.Object obj55 = pilha51.desempilha();
        pilha51.empilha((java.lang.Object) (-1.0f));
        boolean boolean58 = pilha51.vazia();
        boolean boolean59 = pilha51.vazia();
        boolean boolean60 = pilha51.vazia();
        pilha43.empilha((java.lang.Object) pilha51);
        pilha32.empilha((java.lang.Object) pilha43);
        int int63 = pilha32.tamanho();
        int int64 = pilha32.tamanho();
        pilha8.empilha((java.lang.Object) pilha32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0f) + "'", obj29, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0f) + "'", obj39, (-1.0f));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        int int23 = pilha19.tamanho();
        java.lang.Object obj24 = pilha19.desempilha();
        java.lang.Class<?> wildcardClass25 = pilha19.getClass();
        pilha0.empilha((java.lang.Object) pilha19);
        boolean boolean27 = pilha0.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) "hi!");
        pilha0.empilha((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass32 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        boolean boolean17 = pilha0.vazia();
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean19 = pilha8.vazia();
        int int20 = pilha8.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 10);
        java.lang.Object obj3 = pilha0.desempilha();
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 10 + "'", obj3, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) 100.0f);
        int int5 = pilha2.tamanho();
        java.lang.Object obj6 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = pilha2.desempilha();
        int int10 = pilha2.tamanho();
        pilha0.empilha((java.lang.Object) pilha2);
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha13.empilha((java.lang.Object) pilha20);
        boolean boolean29 = pilha13.vazia();
        pilha0.empilha((java.lang.Object) pilha13);
        int int31 = pilha0.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.tamanho();
        pilha0.empilha((java.lang.Object) pilha32);
        java.lang.Object obj39 = pilha0.desempilha();
        boolean boolean40 = pilha0.vazia();
        boolean boolean41 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 10);
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        int int8 = pilha4.tamanho();
        java.lang.Object obj9 = pilha4.desempilha();
        int int10 = pilha4.tamanho();
        int int11 = pilha4.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) (-1.0f));
        boolean boolean19 = pilha12.vazia();
        boolean boolean20 = pilha12.vazia();
        boolean boolean21 = pilha12.vazia();
        pilha4.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha23 = new ds.Pilha();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 100.0f);
        pilha23.empilha((java.lang.Object) pilha24);
        int int28 = pilha24.tamanho();
        pilha12.empilha((java.lang.Object) int28);
        int int30 = pilha12.tamanho();
        int int31 = pilha12.tamanho();
        pilha0.empilha((java.lang.Object) int31);
        java.lang.Class<?> wildcardClass33 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = pilha9.desempilha();
        pilha9.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = pilha9.desempilha();
        int int17 = pilha9.tamanho();
        boolean boolean18 = pilha9.vazia();
        int int19 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) int19);
        int int21 = pilha0.tamanho();
        java.lang.Object obj22 = pilha0.desempilha();
        boolean boolean23 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        int int18 = pilha11.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) pilha19);
        java.lang.Object obj21 = pilha11.desempilha();
        pilha0.empilha((java.lang.Object) pilha11);
        boolean boolean23 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        int int15 = pilha11.tamanho();
        boolean boolean16 = pilha11.vazia();
        boolean boolean17 = pilha11.vazia();
        int int18 = pilha11.tamanho();
        int int19 = pilha11.tamanho();
        int int20 = pilha11.tamanho();
        int int21 = pilha11.tamanho();
        boolean boolean22 = pilha11.vazia();
        boolean boolean23 = pilha11.vazia();
        pilha8.empilha((java.lang.Object) pilha11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass15 = pilha8.getClass();
        pilha0.empilha((java.lang.Object) pilha8);
        int int17 = pilha0.tamanho();
        int int18 = pilha0.tamanho();
        int int19 = pilha0.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        boolean boolean27 = pilha20.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (short) 100);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        int int14 = pilha10.tamanho();
        int int15 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass18 = pilha10.getClass();
        pilha0.empilha((java.lang.Object) pilha10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = null;
        pilha9.empilha(obj13);
        java.lang.Object obj15 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj17 = pilha0.desempilha();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        int int22 = pilha18.tamanho();
        boolean boolean23 = pilha18.vazia();
        boolean boolean24 = pilha18.vazia();
        java.lang.Object obj25 = pilha18.desempilha();
        pilha0.empilha(obj25);
        java.lang.Object obj27 = pilha0.desempilha();
        boolean boolean28 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) 1L);
        int int14 = pilha7.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) pilha15);
        boolean boolean17 = pilha15.vazia();
        pilha0.empilha((java.lang.Object) boolean17);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        java.lang.Object obj23 = null;
        pilha19.empilha(obj23);
        boolean boolean25 = pilha19.vazia();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 100.0f);
        int int29 = pilha26.tamanho();
        java.lang.Object obj30 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) 1L);
        int int33 = pilha26.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) pilha34);
        boolean boolean36 = pilha34.vazia();
        pilha19.empilha((java.lang.Object) boolean36);
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object obj39 = pilha19.desempilha();
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 100.0f);
        int int43 = pilha40.tamanho();
        int int44 = pilha40.tamanho();
        ds.Pilha pilha45 = new ds.Pilha();
        pilha45.empilha((java.lang.Object) 100.0f);
        int int48 = pilha45.tamanho();
        int int49 = pilha45.tamanho();
        java.lang.Class<?> wildcardClass50 = pilha45.getClass();
        pilha40.empilha((java.lang.Object) pilha45);
        ds.Pilha pilha52 = new ds.Pilha();
        pilha52.empilha((java.lang.Object) 100.0f);
        int int55 = pilha52.tamanho();
        int int56 = pilha52.tamanho();
        pilha52.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.empilha((java.lang.Object) 100.0f);
        int int62 = pilha59.tamanho();
        java.lang.Object obj63 = pilha59.desempilha();
        pilha59.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = pilha59.desempilha();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        pilha52.empilha((java.lang.Object) wildcardClass67);
        pilha52.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha71 = new ds.Pilha();
        pilha71.empilha((java.lang.Object) 100.0f);
        int int74 = pilha71.tamanho();
        int int75 = pilha71.tamanho();
        java.lang.Object obj76 = pilha71.desempilha();
        java.lang.Class<?> wildcardClass77 = pilha71.getClass();
        pilha52.empilha((java.lang.Object) pilha71);
        boolean boolean79 = pilha52.vazia();
        pilha40.empilha((java.lang.Object) pilha52);
        pilha19.empilha((java.lang.Object) pilha40);
        java.lang.Object obj82 = pilha19.desempilha();
        int int83 = pilha19.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + true + "'", obj39, true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1.0f) + "'", obj66, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 100.0f + "'", obj76, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) 100);
        java.lang.Object obj12 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 100 + "'", obj12, (byte) 100);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 10);
        pilha0.empilha((java.lang.Object) 10);
        int int12 = pilha0.tamanho();
        int int13 = pilha0.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        int int19 = pilha16.tamanho();
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = pilha16.desempilha();
        int int24 = pilha16.tamanho();
        pilha14.empilha((java.lang.Object) pilha16);
        java.lang.Object obj26 = pilha14.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        int int31 = pilha27.tamanho();
        java.lang.Object obj32 = pilha27.desempilha();
        int int33 = pilha27.tamanho();
        pilha14.empilha((java.lang.Object) int33);
        java.lang.Object obj35 = pilha14.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 100.0f);
        int int39 = pilha36.tamanho();
        int int40 = pilha36.tamanho();
        java.lang.Object obj41 = pilha36.desempilha();
        int int42 = pilha36.tamanho();
        int int43 = pilha36.tamanho();
        pilha14.empilha((java.lang.Object) pilha36);
        pilha0.empilha((java.lang.Object) pilha14);
        boolean boolean46 = pilha0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        int int20 = pilha0.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        int int25 = pilha21.tamanho();
        boolean boolean26 = pilha21.vazia();
        boolean boolean27 = pilha21.vazia();
        int int28 = pilha21.tamanho();
        int int29 = pilha21.tamanho();
        boolean boolean30 = pilha21.vazia();
        java.lang.Object obj31 = pilha21.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        int int35 = pilha32.tamanho();
        java.lang.Object obj36 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = pilha32.desempilha();
        int int40 = pilha32.tamanho();
        boolean boolean41 = pilha32.vazia();
        java.lang.Class<?> wildcardClass42 = pilha32.getClass();
        pilha21.empilha((java.lang.Object) wildcardClass42);
        pilha0.empilha((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0f) + "'", obj39, (-1.0f));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) "hi!");
        boolean boolean12 = pilha9.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        java.lang.Object obj17 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) (-1.0f));
        int int20 = pilha13.tamanho();
        boolean boolean21 = pilha13.vazia();
        pilha9.empilha((java.lang.Object) pilha13);
        pilha0.empilha((java.lang.Object) pilha13);
        int int24 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass25 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = null;
        pilha17.empilha(obj21);
        java.lang.Object obj23 = pilha17.desempilha();
        pilha8.empilha((java.lang.Object) pilha17);
        boolean boolean25 = pilha17.vazia();
        java.lang.Object obj26 = pilha17.desempilha();
        pilha0.empilha(obj26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj13 = pilha7.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) 1.0f);
        pilha14.empilha((java.lang.Object) 100.0f);
        pilha7.empilha((java.lang.Object) pilha14);
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 100.0f);
        int int27 = pilha24.tamanho();
        java.lang.Object obj28 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = pilha24.desempilha();
        java.lang.Class<?> wildcardClass32 = pilha24.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0f) + "'", obj31, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class ds.Pilha");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Pilha pilha0 = new ds.Pilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        java.lang.Object obj8 = pilha0.desempilha();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 100.0f);
        int int6 = pilha3.tamanho();
        java.lang.Object obj7 = pilha3.desempilha();
        pilha3.empilha((java.lang.Object) 1L);
        int int10 = pilha3.tamanho();
        int int11 = pilha3.tamanho();
        pilha0.empilha((java.lang.Object) int11);
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1L);
        int int21 = pilha14.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) pilha22);
        int int24 = pilha14.tamanho();
        boolean boolean25 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        int int31 = pilha27.tamanho();
        int int32 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) 1L);
        int int35 = pilha27.tamanho();
        int int36 = pilha27.tamanho();
        java.lang.Object obj37 = pilha27.desempilha();
        pilha0.empilha((java.lang.Object) pilha27);
        java.lang.Object obj39 = pilha27.desempilha();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1L + "'", obj37, 1L);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.tamanho();
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass26 = pilha19.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = pilha0.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 100.0f);
        int int32 = pilha29.tamanho();
        java.lang.Object obj33 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1L);
        int int36 = pilha29.tamanho();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) pilha37);
        java.lang.Class<?> wildcardClass39 = pilha29.getClass();
        pilha0.empilha((java.lang.Object) pilha29);
        boolean boolean41 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class ds.Pilha");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean19 = pilha8.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = null;
        pilha20.empilha(obj24);
        boolean boolean26 = pilha20.vazia();
        int int27 = pilha20.tamanho();
        boolean boolean28 = pilha20.vazia();
        pilha8.empilha((java.lang.Object) pilha20);
        java.lang.Object obj30 = pilha20.desempilha();
        int int31 = pilha20.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        int int11 = pilha9.tamanho();
        boolean boolean12 = pilha9.vazia();
        java.lang.Class<?> wildcardClass13 = pilha9.getClass();
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 10);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        boolean boolean21 = pilha18.vazia();
        pilha15.empilha((java.lang.Object) pilha18);
        java.lang.Class<?> wildcardClass23 = pilha15.getClass();
        pilha9.empilha((java.lang.Object) pilha15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 100.0f);
        int int9 = pilha6.tamanho();
        int int10 = pilha6.tamanho();
        java.lang.Object obj11 = pilha6.desempilha();
        int int12 = pilha6.tamanho();
        int int13 = pilha6.tamanho();
        pilha0.empilha((java.lang.Object) int13);
        boolean boolean15 = pilha0.vazia();
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = pilha19.desempilha();
        int int27 = pilha19.tamanho();
        pilha17.empilha((java.lang.Object) pilha19);
        pilha0.empilha((java.lang.Object) pilha19);
        boolean boolean30 = pilha19.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 100.0f);
        int int6 = pilha3.tamanho();
        java.lang.Object obj7 = pilha3.desempilha();
        pilha3.empilha((java.lang.Object) 1L);
        int int10 = pilha3.tamanho();
        int int11 = pilha3.tamanho();
        pilha0.empilha((java.lang.Object) int11);
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1L);
        int int21 = pilha14.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) pilha22);
        int int24 = pilha14.tamanho();
        boolean boolean25 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        int int27 = pilha14.tamanho();
        java.lang.Object obj28 = pilha14.desempilha();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = pilha10.desempilha();
        int int18 = pilha10.tamanho();
        pilha8.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        int int21 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        int int16 = pilha0.tamanho();
        java.lang.Object obj17 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass15 = pilha8.getClass();
        pilha0.empilha((java.lang.Object) pilha8);
        int int17 = pilha0.tamanho();
        java.lang.Object obj18 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        boolean boolean2 = pilha0.vazia();
        int int3 = pilha0.tamanho();
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) 100.0f);
        int int7 = pilha4.tamanho();
        int int8 = pilha4.tamanho();
        boolean boolean9 = pilha4.vazia();
        boolean boolean10 = pilha4.vazia();
        pilha0.empilha((java.lang.Object) pilha4);
        java.lang.Object obj12 = pilha0.desempilha();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        java.lang.Object obj17 = pilha13.desempilha();
        pilha13.empilha((java.lang.Object) 1L);
        int int20 = pilha13.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) pilha21);
        boolean boolean23 = pilha21.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 100.0f);
        int int27 = pilha24.tamanho();
        java.lang.Object obj28 = pilha24.desempilha();
        pilha24.empilha((java.lang.Object) 1L);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        int int35 = pilha31.tamanho();
        pilha31.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 100.0f);
        int int41 = pilha38.tamanho();
        java.lang.Object obj42 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj45 = pilha38.desempilha();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        pilha31.empilha((java.lang.Object) wildcardClass46);
        pilha31.empilha((java.lang.Object) (byte) -1);
        pilha24.empilha((java.lang.Object) pilha31);
        java.lang.Object obj51 = pilha24.desempilha();
        pilha21.empilha((java.lang.Object) pilha24);
        pilha0.empilha((java.lang.Object) pilha24);
        int int54 = pilha24.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (short) 100);
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        java.lang.Object obj5 = pilha0.desempilha();
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        int int8 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        int int12 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 100.0f);
        int int18 = pilha15.tamanho();
        java.lang.Object obj19 = pilha15.desempilha();
        pilha15.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = pilha15.desempilha();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        pilha8.empilha((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = pilha8.desempilha();
        pilha0.empilha((java.lang.Object) pilha8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.Float");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        int int5 = pilha1.tamanho();
        int int6 = pilha1.tamanho();
        int int7 = pilha1.tamanho();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        int int15 = pilha11.tamanho();
        int int16 = pilha11.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) "hi!");
        pilha11.empilha((java.lang.Object) "hi!");
        pilha0.empilha((java.lang.Object) pilha11);
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        boolean boolean10 = pilha0.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        boolean boolean13 = pilha11.vazia();
        int int14 = pilha11.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        pilha15.empilha((java.lang.Object) 100.0f);
        int int18 = pilha15.tamanho();
        java.lang.Object obj19 = pilha15.desempilha();
        pilha15.empilha((java.lang.Object) (-1.0f));
        boolean boolean22 = pilha15.vazia();
        boolean boolean23 = pilha15.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        pilha24.empilha((java.lang.Object) 100.0f);
        int int27 = pilha24.tamanho();
        java.lang.Object obj28 = null;
        pilha24.empilha(obj28);
        java.lang.Object obj30 = pilha24.desempilha();
        pilha15.empilha((java.lang.Object) pilha24);
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        ds.Pilha pilha34 = new ds.Pilha();
        pilha34.empilha((java.lang.Object) 100.0f);
        int int37 = pilha34.tamanho();
        java.lang.Object obj38 = pilha34.desempilha();
        pilha34.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = pilha34.desempilha();
        int int42 = pilha34.tamanho();
        pilha32.empilha((java.lang.Object) pilha34);
        pilha15.empilha((java.lang.Object) pilha32);
        pilha11.empilha((java.lang.Object) pilha32);
        java.lang.Object obj46 = pilha32.desempilha();
        int int47 = pilha32.tamanho();
        boolean boolean48 = pilha32.vazia();
        int int49 = pilha32.tamanho();
        pilha0.empilha((java.lang.Object) pilha32);
        java.lang.Class<?> wildcardClass51 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0f) + "'", obj41, (-1.0f));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        java.lang.Object obj10 = null;
        pilha0.empilha(obj10);
        int int12 = pilha0.tamanho();
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        java.lang.Object obj13 = null;
        pilha9.empilha(obj13);
        java.lang.Object obj15 = pilha9.desempilha();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj17 = pilha0.desempilha();
        boolean boolean18 = pilha0.vazia();
        java.lang.Object obj19 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        int int11 = pilha7.tamanho();
        int int12 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1);
        java.lang.Object obj15 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = null;
        pilha17.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 100.0f);
        int int26 = pilha23.tamanho();
        int int27 = pilha23.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        java.lang.Class<?> wildcardClass33 = pilha28.getClass();
        pilha23.empilha((java.lang.Object) pilha28);
        pilha17.empilha((java.lang.Object) pilha23);
        int int36 = pilha17.tamanho();
        pilha0.empilha((java.lang.Object) int36);
        java.lang.Class<?> wildcardClass38 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        java.lang.Object obj9 = pilha0.desempilha();
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean16 = pilha0.vazia();
        boolean boolean17 = pilha0.vazia();
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        java.lang.Object obj22 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) 1L);
        int int25 = pilha18.tamanho();
        int int26 = pilha18.tamanho();
        boolean boolean27 = pilha18.vazia();
        java.lang.Object obj28 = null;
        pilha18.empilha(obj28);
        pilha0.empilha((java.lang.Object) pilha18);
        boolean boolean31 = pilha18.vazia();
        int int32 = pilha18.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        boolean boolean8 = pilha0.vazia();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 100.0f);
        int int9 = pilha6.tamanho();
        java.lang.Object obj10 = pilha6.desempilha();
        pilha6.empilha((java.lang.Object) 1L);
        int int13 = pilha6.tamanho();
        int int14 = pilha6.tamanho();
        boolean boolean15 = pilha6.vazia();
        java.lang.Object obj16 = null;
        pilha6.empilha(obj16);
        java.lang.Object obj18 = pilha6.desempilha();
        java.lang.Object obj19 = pilha6.desempilha();
        pilha0.empilha((java.lang.Object) pilha6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = pilha6.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 10);
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 100.0f);
        boolean boolean6 = pilha3.vazia();
        pilha0.empilha((java.lang.Object) pilha3);
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        java.lang.Object obj14 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = pilha10.desempilha();
        int int18 = pilha10.tamanho();
        pilha8.empilha((java.lang.Object) pilha10);
        pilha0.empilha((java.lang.Object) pilha10);
        boolean boolean21 = pilha0.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        boolean boolean25 = pilha22.vazia();
        java.lang.Object obj26 = pilha22.desempilha();
        boolean boolean27 = pilha22.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        java.lang.Object obj32 = pilha28.desempilha();
        pilha28.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj35 = pilha28.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        pilha28.empilha((java.lang.Object) pilha36);
        pilha22.empilha((java.lang.Object) pilha28);
        pilha0.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0f) + "'", obj35, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        int int11 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = pilha14.desempilha();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass22);
        pilha7.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha7);
        int int27 = pilha7.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        int int18 = pilha11.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) pilha19);
        java.lang.Object obj21 = pilha11.desempilha();
        pilha0.empilha((java.lang.Object) pilha11);
        int int23 = pilha0.tamanho();
        int int24 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 100.0f);
        int int6 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj9 = pilha3.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        pilha10.empilha((java.lang.Object) 100.0f);
        int int13 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) 1.0f);
        pilha10.empilha((java.lang.Object) 100.0f);
        pilha3.empilha((java.lang.Object) pilha10);
        boolean boolean19 = pilha3.vazia();
        int int20 = pilha3.tamanho();
        boolean boolean21 = pilha3.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) 100.0f);
        int int25 = pilha22.tamanho();
        java.lang.Object obj26 = pilha22.desempilha();
        pilha22.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass29 = pilha22.getClass();
        pilha3.empilha((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = pilha3.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        int int35 = pilha32.tamanho();
        java.lang.Object obj36 = pilha32.desempilha();
        pilha32.empilha((java.lang.Object) 1L);
        int int39 = pilha32.tamanho();
        int int40 = pilha32.tamanho();
        int int41 = pilha32.tamanho();
        java.lang.Object obj42 = pilha32.desempilha();
        pilha3.empilha((java.lang.Object) pilha32);
        pilha0.empilha((java.lang.Object) pilha3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0f + "'", obj9, 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class ds.Pilha");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1L + "'", obj42, 1L);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) 100.0f);
        int int5 = pilha2.tamanho();
        java.lang.Object obj6 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = pilha2.desempilha();
        int int10 = pilha2.tamanho();
        pilha0.empilha((java.lang.Object) pilha2);
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha13.empilha((java.lang.Object) pilha20);
        boolean boolean29 = pilha13.vazia();
        pilha0.empilha((java.lang.Object) pilha13);
        int int31 = pilha0.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        boolean boolean35 = pilha32.vazia();
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.tamanho();
        pilha0.empilha((java.lang.Object) pilha32);
        int int39 = pilha32.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        int int11 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = pilha14.desempilha();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass22);
        pilha7.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        java.lang.Object obj31 = pilha27.desempilha();
        pilha27.empilha((java.lang.Object) 1L);
        pilha7.empilha((java.lang.Object) pilha27);
        java.lang.Class<?> wildcardClass35 = pilha27.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        boolean boolean14 = pilha7.vazia();
        boolean boolean15 = pilha7.vazia();
        boolean boolean16 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        int int22 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = pilha25.desempilha();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        pilha18.empilha((java.lang.Object) wildcardClass33);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha11.empilha((java.lang.Object) pilha18);
        java.lang.Object obj38 = pilha11.desempilha();
        pilha8.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 100.0f);
        int int43 = pilha40.tamanho();
        int int44 = pilha40.tamanho();
        boolean boolean45 = pilha40.vazia();
        boolean boolean46 = pilha40.vazia();
        int int47 = pilha40.tamanho();
        int int48 = pilha40.tamanho();
        boolean boolean49 = pilha40.vazia();
        int int50 = pilha40.tamanho();
        int int51 = pilha40.tamanho();
        java.lang.Object obj52 = pilha40.desempilha();
        int int53 = pilha40.tamanho();
        pilha8.empilha((java.lang.Object) int53);
        int int55 = pilha8.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0f) + "'", obj32, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        int int11 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = pilha14.desempilha();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass22);
        pilha7.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean27 = pilha0.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        int int33 = pilha28.tamanho();
        boolean boolean34 = pilha28.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 100.0f);
        int int38 = pilha35.tamanho();
        java.lang.Object obj39 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) (-1.0f));
        boolean boolean42 = pilha35.vazia();
        boolean boolean43 = pilha35.vazia();
        boolean boolean44 = pilha35.vazia();
        pilha28.empilha((java.lang.Object) pilha35);
        pilha0.empilha((java.lang.Object) pilha35);
        ds.Pilha pilha47 = new ds.Pilha();
        pilha47.empilha((java.lang.Object) 100.0f);
        int int50 = pilha47.tamanho();
        int int51 = pilha47.tamanho();
        java.lang.Object obj52 = pilha47.desempilha();
        int int53 = pilha47.tamanho();
        int int54 = pilha47.tamanho();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) 100.0f);
        int int58 = pilha55.tamanho();
        java.lang.Object obj59 = pilha55.desempilha();
        pilha55.empilha((java.lang.Object) (-1.0f));
        boolean boolean62 = pilha55.vazia();
        boolean boolean63 = pilha55.vazia();
        boolean boolean64 = pilha55.vazia();
        pilha47.empilha((java.lang.Object) pilha55);
        boolean boolean66 = pilha55.vazia();
        java.lang.Object obj67 = pilha55.desempilha();
        pilha0.empilha((java.lang.Object) pilha55);
        java.lang.Class<?> wildcardClass69 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0f + "'", obj59, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1.0f) + "'", obj67, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        boolean boolean14 = pilha7.vazia();
        boolean boolean15 = pilha7.vazia();
        boolean boolean16 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj18 = pilha7.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pilha7.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        boolean boolean11 = pilha8.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        java.lang.Object obj17 = pilha12.desempilha();
        int int18 = pilha12.tamanho();
        int int19 = pilha12.tamanho();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        boolean boolean27 = pilha20.vazia();
        boolean boolean28 = pilha20.vazia();
        boolean boolean29 = pilha20.vazia();
        pilha12.empilha((java.lang.Object) pilha20);
        ds.Pilha pilha31 = new ds.Pilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        pilha31.empilha((java.lang.Object) pilha32);
        int int36 = pilha32.tamanho();
        pilha20.empilha((java.lang.Object) int36);
        int int38 = pilha20.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 100.0f);
        boolean boolean42 = pilha39.vazia();
        int int43 = pilha39.tamanho();
        int int44 = pilha39.tamanho();
        pilha20.empilha((java.lang.Object) pilha39);
        pilha8.empilha((java.lang.Object) pilha20);
        java.lang.Object obj47 = pilha20.desempilha();
        int int48 = pilha20.tamanho();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 100.0f);
        int int52 = pilha49.tamanho();
        int int53 = pilha49.tamanho();
        boolean boolean54 = pilha49.vazia();
        boolean boolean55 = pilha49.vazia();
        int int56 = pilha49.tamanho();
        int int57 = pilha49.tamanho();
        java.lang.Object obj58 = pilha49.desempilha();
        pilha20.empilha((java.lang.Object) pilha49);
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) 100.0f);
        int int63 = pilha60.tamanho();
        int int64 = pilha60.tamanho();
        boolean boolean65 = pilha60.vazia();
        boolean boolean66 = pilha60.vazia();
        int int67 = pilha60.tamanho();
        int int68 = pilha60.tamanho();
        int int69 = pilha60.tamanho();
        pilha49.empilha((java.lang.Object) pilha60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        java.lang.Object obj9 = null;
        pilha0.empilha(obj9);
        int int11 = pilha0.tamanho();
        java.lang.Object obj12 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = pilha8.desempilha();
        int int16 = pilha8.tamanho();
        boolean boolean17 = pilha8.vazia();
        int int18 = pilha8.tamanho();
        java.lang.Class<?> wildcardClass19 = pilha8.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass19);
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        java.lang.Object obj25 = null;
        pilha21.empilha(obj25);
        java.lang.Object obj27 = pilha21.desempilha();
        int int28 = pilha21.tamanho();
        pilha0.empilha((java.lang.Object) int28);
        int int30 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        boolean boolean7 = pilha0.vazia();
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 1.0f);
        pilha9.empilha((java.lang.Object) 100.0f);
        int int17 = pilha9.tamanho();
        boolean boolean18 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean18);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = pilha20.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 100.0f);
        int int33 = pilha30.tamanho();
        java.lang.Object obj34 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj37 = pilha30.desempilha();
        int int38 = pilha30.tamanho();
        pilha28.empilha((java.lang.Object) pilha30);
        pilha20.empilha((java.lang.Object) pilha30);
        int int41 = pilha30.tamanho();
        pilha0.empilha((java.lang.Object) pilha30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0f) + "'", obj37, (-1.0f));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        boolean boolean10 = pilha8.vazia();
        int int11 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean13 = pilha8.vazia();
        java.lang.Object obj14 = null;
        pilha8.empilha(obj14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj13 = pilha7.desempilha();
        java.lang.Object obj14 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) "hi!");
        boolean boolean19 = pilha16.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        int int27 = pilha20.tamanho();
        boolean boolean28 = pilha20.vazia();
        pilha16.empilha((java.lang.Object) pilha20);
        java.lang.Object obj30 = pilha20.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        pilha31.empilha((java.lang.Object) pilha32);
        pilha31.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj38 = pilha31.desempilha();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 10);
        pilha31.empilha((java.lang.Object) 10);
        int int43 = pilha31.tamanho();
        int int44 = pilha31.tamanho();
        boolean boolean45 = pilha31.vazia();
        pilha20.empilha((java.lang.Object) pilha31);
        pilha7.empilha((java.lang.Object) pilha20);
        int int48 = pilha20.tamanho();
        boolean boolean49 = pilha20.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0d + "'", obj38, 1.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        boolean boolean14 = pilha7.vazia();
        boolean boolean15 = pilha7.vazia();
        boolean boolean16 = pilha7.vazia();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        java.lang.Object obj22 = pilha18.desempilha();
        pilha18.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = pilha18.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        pilha18.empilha((java.lang.Object) pilha26);
        pilha0.empilha((java.lang.Object) pilha18);
        int int30 = pilha18.tamanho();
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        int int35 = pilha31.tamanho();
        java.lang.Object obj36 = pilha31.desempilha();
        int int37 = pilha31.tamanho();
        int int38 = pilha31.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        pilha39.empilha((java.lang.Object) 100.0f);
        int int42 = pilha39.tamanho();
        java.lang.Object obj43 = pilha39.desempilha();
        pilha39.empilha((java.lang.Object) (-1.0f));
        boolean boolean46 = pilha39.vazia();
        boolean boolean47 = pilha39.vazia();
        boolean boolean48 = pilha39.vazia();
        pilha31.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha50 = new ds.Pilha();
        ds.Pilha pilha51 = new ds.Pilha();
        pilha51.empilha((java.lang.Object) 100.0f);
        pilha50.empilha((java.lang.Object) pilha51);
        int int55 = pilha51.tamanho();
        pilha39.empilha((java.lang.Object) int55);
        int int57 = pilha39.tamanho();
        int int58 = pilha39.tamanho();
        int int59 = pilha39.tamanho();
        pilha39.empilha((java.lang.Object) (short) 1);
        int int62 = pilha39.tamanho();
        pilha18.empilha((java.lang.Object) pilha39);
        java.lang.Class<?> wildcardClass64 = pilha18.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0f) + "'", obj25, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        boolean boolean10 = pilha8.vazia();
        int int11 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        int int13 = pilha8.tamanho();
        int int14 = pilha8.tamanho();
        java.lang.Class<?> wildcardClass15 = pilha8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 10);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        java.lang.Object obj9 = pilha0.desempilha();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = pilha12.desempilha();
        int int20 = pilha12.tamanho();
        pilha10.empilha((java.lang.Object) pilha12);
        java.lang.Object obj22 = pilha10.desempilha();
        pilha10.empilha((java.lang.Object) '#');
        pilha0.empilha((java.lang.Object) '#');
        int int26 = pilha0.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        java.lang.Object obj31 = null;
        pilha27.empilha(obj31);
        boolean boolean33 = pilha27.vazia();
        int int34 = pilha27.tamanho();
        boolean boolean35 = pilha27.vazia();
        pilha0.empilha((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 100.0f);
        int int9 = pilha6.tamanho();
        int int10 = pilha6.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        int int15 = pilha11.tamanho();
        java.lang.Class<?> wildcardClass16 = pilha11.getClass();
        pilha6.empilha((java.lang.Object) pilha11);
        pilha0.empilha((java.lang.Object) pilha6);
        int int19 = pilha0.tamanho();
        int int20 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        java.lang.Object obj5 = pilha0.desempilha();
        ds.Pilha pilha6 = new ds.Pilha();
        pilha6.empilha((java.lang.Object) 100.0f);
        int int9 = pilha6.tamanho();
        java.lang.Object obj10 = null;
        pilha6.empilha(obj10);
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object obj13 = pilha6.desempilha();
        java.lang.Class<?> wildcardClass14 = pilha6.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass14);
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        int int11 = pilha7.tamanho();
        int int12 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1);
        java.lang.Object obj15 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha17 = new ds.Pilha();
        pilha17.empilha((java.lang.Object) 100.0f);
        int int20 = pilha17.tamanho();
        java.lang.Object obj21 = null;
        pilha17.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 100.0f);
        int int26 = pilha23.tamanho();
        int int27 = pilha23.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        java.lang.Class<?> wildcardClass33 = pilha28.getClass();
        pilha23.empilha((java.lang.Object) pilha28);
        pilha17.empilha((java.lang.Object) pilha23);
        int int36 = pilha17.tamanho();
        pilha0.empilha((java.lang.Object) int36);
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 100.0f);
        boolean boolean41 = pilha38.vazia();
        java.lang.Object obj42 = pilha38.desempilha();
        boolean boolean43 = pilha38.vazia();
        ds.Pilha pilha44 = new ds.Pilha();
        pilha44.empilha((java.lang.Object) 100.0f);
        int int47 = pilha44.tamanho();
        java.lang.Object obj48 = pilha44.desempilha();
        pilha44.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = pilha44.desempilha();
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha44.empilha((java.lang.Object) pilha52);
        pilha38.empilha((java.lang.Object) pilha44);
        pilha0.empilha((java.lang.Object) pilha44);
        ds.Pilha pilha57 = new ds.Pilha();
        pilha57.empilha((java.lang.Object) 100.0f);
        int int60 = pilha57.tamanho();
        int int61 = pilha57.tamanho();
        java.lang.Object obj62 = pilha57.desempilha();
        boolean boolean63 = pilha57.vazia();
        int int64 = pilha57.tamanho();
        int int65 = pilha57.tamanho();
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.empilha((java.lang.Object) "hi!");
        boolean boolean69 = pilha66.vazia();
        ds.Pilha pilha70 = new ds.Pilha();
        pilha70.empilha((java.lang.Object) 100.0f);
        int int73 = pilha70.tamanho();
        java.lang.Object obj74 = pilha70.desempilha();
        pilha70.empilha((java.lang.Object) (-1.0f));
        int int77 = pilha70.tamanho();
        boolean boolean78 = pilha70.vazia();
        pilha66.empilha((java.lang.Object) pilha70);
        pilha57.empilha((java.lang.Object) pilha70);
        int int81 = pilha57.tamanho();
        java.lang.Object obj82 = pilha57.desempilha();
        pilha0.empilha((java.lang.Object) pilha57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1.0f) + "'", obj51, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0f + "'", obj62, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 100.0f + "'", obj74, 100.0f);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        int int11 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = pilha14.desempilha();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        pilha7.empilha((java.lang.Object) wildcardClass22);
        pilha7.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean27 = pilha0.vazia();
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) 100.0f);
        int int31 = pilha28.tamanho();
        int int32 = pilha28.tamanho();
        int int33 = pilha28.tamanho();
        boolean boolean34 = pilha28.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        pilha35.empilha((java.lang.Object) 100.0f);
        int int38 = pilha35.tamanho();
        java.lang.Object obj39 = pilha35.desempilha();
        pilha35.empilha((java.lang.Object) (-1.0f));
        boolean boolean42 = pilha35.vazia();
        boolean boolean43 = pilha35.vazia();
        boolean boolean44 = pilha35.vazia();
        pilha28.empilha((java.lang.Object) pilha35);
        pilha0.empilha((java.lang.Object) pilha35);
        int int47 = pilha35.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = pilha8.desempilha();
        int int16 = pilha8.tamanho();
        boolean boolean17 = pilha8.vazia();
        int int18 = pilha8.tamanho();
        java.lang.Class<?> wildcardClass19 = pilha8.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass19);
        boolean boolean21 = pilha0.vazia();
        ds.Pilha pilha22 = new ds.Pilha();
        ds.Pilha pilha23 = new ds.Pilha();
        pilha23.empilha((java.lang.Object) 100.0f);
        pilha22.empilha((java.lang.Object) pilha23);
        pilha22.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj29 = pilha22.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 10);
        pilha22.empilha((java.lang.Object) 10);
        int int34 = pilha22.tamanho();
        int int35 = pilha22.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        ds.Pilha pilha38 = new ds.Pilha();
        pilha38.empilha((java.lang.Object) 100.0f);
        int int41 = pilha38.tamanho();
        java.lang.Object obj42 = pilha38.desempilha();
        pilha38.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj45 = pilha38.desempilha();
        int int46 = pilha38.tamanho();
        pilha36.empilha((java.lang.Object) pilha38);
        java.lang.Object obj48 = pilha36.desempilha();
        ds.Pilha pilha49 = new ds.Pilha();
        pilha49.empilha((java.lang.Object) 100.0f);
        int int52 = pilha49.tamanho();
        int int53 = pilha49.tamanho();
        java.lang.Object obj54 = pilha49.desempilha();
        int int55 = pilha49.tamanho();
        pilha36.empilha((java.lang.Object) int55);
        java.lang.Object obj57 = pilha36.desempilha();
        ds.Pilha pilha58 = new ds.Pilha();
        pilha58.empilha((java.lang.Object) 100.0f);
        int int61 = pilha58.tamanho();
        int int62 = pilha58.tamanho();
        java.lang.Object obj63 = pilha58.desempilha();
        int int64 = pilha58.tamanho();
        int int65 = pilha58.tamanho();
        pilha36.empilha((java.lang.Object) pilha58);
        pilha22.empilha((java.lang.Object) pilha36);
        pilha0.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0d + "'", obj29, 1.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0f + "'", obj54, 100.0f);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0 + "'", obj57, 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        java.lang.Object obj22 = null;
        pilha18.empilha(obj22);
        java.lang.Object obj24 = pilha18.desempilha();
        java.lang.Object obj25 = pilha18.desempilha();
        ds.Pilha pilha26 = new ds.Pilha();
        pilha26.empilha((java.lang.Object) 100.0f);
        int int29 = pilha26.tamanho();
        java.lang.Object obj30 = pilha26.desempilha();
        pilha26.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass33 = pilha26.getClass();
        pilha18.empilha((java.lang.Object) pilha26);
        java.lang.Class<?> wildcardClass35 = pilha18.getClass();
        pilha0.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 100.0f);
        int int40 = pilha37.tamanho();
        int int41 = pilha37.tamanho();
        java.lang.Object obj42 = pilha37.desempilha();
        int int43 = pilha37.tamanho();
        int int44 = pilha37.tamanho();
        boolean boolean45 = pilha37.vazia();
        ds.Pilha pilha46 = new ds.Pilha();
        pilha46.empilha((java.lang.Object) 100.0f);
        int int49 = pilha46.tamanho();
        java.lang.Object obj50 = pilha46.desempilha();
        pilha46.empilha((java.lang.Object) (-1.0f));
        boolean boolean53 = pilha46.vazia();
        boolean boolean54 = pilha46.vazia();
        ds.Pilha pilha55 = new ds.Pilha();
        pilha55.empilha((java.lang.Object) 100.0f);
        int int58 = pilha55.tamanho();
        java.lang.Object obj59 = null;
        pilha55.empilha(obj59);
        java.lang.Object obj61 = pilha55.desempilha();
        pilha46.empilha((java.lang.Object) pilha55);
        ds.Pilha pilha63 = new ds.Pilha();
        pilha63.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha66 = new ds.Pilha();
        pilha66.empilha((java.lang.Object) 100.0f);
        boolean boolean69 = pilha66.vazia();
        java.lang.Object obj70 = pilha66.desempilha();
        int int71 = pilha66.tamanho();
        pilha63.empilha((java.lang.Object) int71);
        pilha55.empilha((java.lang.Object) int71);
        ds.Pilha pilha74 = new ds.Pilha();
        pilha74.empilha((java.lang.Object) 100.0f);
        int int77 = pilha74.tamanho();
        int int78 = pilha74.tamanho();
        java.lang.Object obj79 = pilha74.desempilha();
        boolean boolean80 = pilha74.vazia();
        int int81 = pilha74.tamanho();
        int int82 = pilha74.tamanho();
        boolean boolean83 = pilha74.vazia();
        ds.Pilha pilha84 = new ds.Pilha();
        pilha84.empilha((java.lang.Object) 100.0f);
        boolean boolean87 = pilha84.vazia();
        java.lang.Object obj88 = pilha84.desempilha();
        boolean boolean89 = pilha84.vazia();
        pilha74.empilha((java.lang.Object) pilha84);
        pilha55.empilha((java.lang.Object) pilha84);
        pilha37.empilha((java.lang.Object) pilha84);
        java.lang.Object obj93 = pilha37.desempilha();
        java.lang.Class<?> wildcardClass94 = obj93.getClass();
        pilha0.empilha(obj93);
        int int96 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0f + "'", obj70, 100.0f);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0f + "'", obj79, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + 100.0f + "'", obj88, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 5 + "'", int96 == 5);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        int int26 = pilha8.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        boolean boolean30 = pilha27.vazia();
        int int31 = pilha27.tamanho();
        int int32 = pilha27.tamanho();
        pilha8.empilha((java.lang.Object) pilha27);
        boolean boolean34 = pilha8.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = null;
        pilha0.empilha(obj4);
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        int int9 = pilha0.tamanho();
        java.lang.Object obj10 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        int int13 = pilha9.tamanho();
        pilha0.empilha((java.lang.Object) int13);
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        int int17 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj6 = pilha0.desempilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) 1.0f);
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Object obj16 = pilha0.desempilha();
        java.lang.Object obj17 = pilha0.desempilha();
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        int int23 = pilha19.tamanho();
        int int24 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) 1);
        java.lang.Object obj27 = pilha19.desempilha();
        int int28 = pilha19.tamanho();
        int int29 = pilha19.tamanho();
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        boolean boolean34 = pilha31.vazia();
        java.lang.Object obj35 = pilha31.desempilha();
        boolean boolean36 = pilha31.vazia();
        pilha19.empilha((java.lang.Object) pilha31);
        int int38 = pilha19.tamanho();
        int int39 = pilha19.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1 + "'", obj27, 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        int int10 = pilha7.tamanho();
        java.lang.Object obj11 = pilha7.desempilha();
        pilha7.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = pilha7.desempilha();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass15);
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        int int23 = pilha19.tamanho();
        java.lang.Object obj24 = pilha19.desempilha();
        java.lang.Class<?> wildcardClass25 = pilha19.getClass();
        pilha0.empilha((java.lang.Object) pilha19);
        boolean boolean27 = pilha0.vazia();
        boolean boolean28 = pilha0.vazia();
        java.lang.Object obj29 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        boolean boolean7 = pilha0.vazia();
        boolean boolean8 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) 0.0f);
        int int11 = pilha0.tamanho();
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        int int17 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        java.lang.Object obj24 = pilha20.desempilha();
        pilha20.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = pilha20.desempilha();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        pilha13.empilha((java.lang.Object) wildcardClass28);
        pilha13.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha32 = new ds.Pilha();
        pilha32.empilha((java.lang.Object) 100.0f);
        int int35 = pilha32.tamanho();
        int int36 = pilha32.tamanho();
        java.lang.Object obj37 = pilha32.desempilha();
        java.lang.Class<?> wildcardClass38 = pilha32.getClass();
        pilha13.empilha((java.lang.Object) pilha32);
        boolean boolean40 = pilha13.vazia();
        boolean boolean41 = pilha13.vazia();
        java.lang.Object obj42 = pilha13.desempilha();
        pilha0.empilha((java.lang.Object) pilha13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 10);
        pilha0.empilha((java.lang.Object) 10);
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        int int16 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha19 = new ds.Pilha();
        pilha19.empilha((java.lang.Object) 100.0f);
        int int22 = pilha19.tamanho();
        java.lang.Object obj23 = pilha19.desempilha();
        pilha19.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = pilha19.desempilha();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        pilha12.empilha((java.lang.Object) wildcardClass27);
        pilha12.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) pilha12);
        boolean boolean32 = pilha12.vazia();
        java.lang.Object obj33 = pilha12.desempilha();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        int int26 = pilha8.tamanho();
        int int27 = pilha8.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 100.0f);
        int int33 = pilha30.tamanho();
        java.lang.Object obj34 = pilha30.desempilha();
        pilha30.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj37 = pilha30.desempilha();
        int int38 = pilha30.tamanho();
        pilha28.empilha((java.lang.Object) pilha30);
        java.lang.Object obj40 = pilha28.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        pilha41.empilha((java.lang.Object) 100.0f);
        int int44 = pilha41.tamanho();
        int int45 = pilha41.tamanho();
        java.lang.Object obj46 = pilha41.desempilha();
        int int47 = pilha41.tamanho();
        pilha28.empilha((java.lang.Object) int47);
        java.lang.Class<?> wildcardClass49 = pilha28.getClass();
        pilha8.empilha((java.lang.Object) wildcardClass49);
        boolean boolean51 = pilha8.vazia();
        java.lang.Object obj52 = pilha8.desempilha();
        ds.Pilha pilha53 = new ds.Pilha();
        pilha53.empilha((java.lang.Object) 100.0f);
        int int56 = pilha53.tamanho();
        java.lang.Object obj57 = pilha53.desempilha();
        pilha53.empilha((java.lang.Object) 1L);
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) 100.0f);
        int int63 = pilha60.tamanho();
        int int64 = pilha60.tamanho();
        pilha60.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha67 = new ds.Pilha();
        pilha67.empilha((java.lang.Object) 100.0f);
        int int70 = pilha67.tamanho();
        java.lang.Object obj71 = pilha67.desempilha();
        pilha67.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj74 = pilha67.desempilha();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        pilha60.empilha((java.lang.Object) wildcardClass75);
        pilha60.empilha((java.lang.Object) (byte) -1);
        pilha53.empilha((java.lang.Object) pilha60);
        int int80 = pilha53.tamanho();
        pilha8.empilha((java.lang.Object) int80);
        java.lang.Object obj82 = pilha8.desempilha();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0f) + "'", obj37, (-1.0f));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class ds.Pilha");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class ds.Pilha");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0f + "'", obj71, 100.0f);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1.0f) + "'", obj74, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 2 + "'", obj82, 2);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        int int26 = pilha8.tamanho();
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        boolean boolean30 = pilha27.vazia();
        int int31 = pilha27.tamanho();
        int int32 = pilha27.tamanho();
        pilha8.empilha((java.lang.Object) pilha27);
        int int34 = pilha27.tamanho();
        boolean boolean35 = pilha27.vazia();
        java.lang.Class<?> wildcardClass36 = pilha27.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        int int22 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = pilha25.desempilha();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        pilha18.empilha((java.lang.Object) wildcardClass33);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha11.empilha((java.lang.Object) pilha18);
        java.lang.Object obj38 = pilha11.desempilha();
        pilha8.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 100.0f);
        int int43 = pilha40.tamanho();
        java.lang.Object obj44 = null;
        pilha40.empilha(obj44);
        boolean boolean46 = pilha40.vazia();
        int int47 = pilha40.tamanho();
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) 100.0f);
        int int51 = pilha48.tamanho();
        java.lang.Object obj52 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) (-1.0f));
        boolean boolean55 = pilha48.vazia();
        boolean boolean56 = pilha48.vazia();
        pilha40.empilha((java.lang.Object) pilha48);
        pilha8.empilha((java.lang.Object) pilha48);
        ds.Pilha pilha59 = new ds.Pilha();
        pilha59.empilha((java.lang.Object) 100.0f);
        int int62 = pilha59.tamanho();
        java.lang.Object obj63 = pilha59.desempilha();
        pilha59.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = pilha59.desempilha();
        ds.Pilha pilha67 = new ds.Pilha();
        boolean boolean68 = pilha67.vazia();
        ds.Pilha pilha69 = new ds.Pilha();
        pilha69.empilha((java.lang.Object) 100.0f);
        int int72 = pilha69.tamanho();
        java.lang.Object obj73 = pilha69.desempilha();
        pilha69.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj76 = pilha69.desempilha();
        int int77 = pilha69.tamanho();
        pilha67.empilha((java.lang.Object) pilha69);
        pilha59.empilha((java.lang.Object) pilha69);
        java.lang.Object obj80 = pilha59.desempilha();
        pilha48.empilha((java.lang.Object) pilha59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0f) + "'", obj32, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1.0f) + "'", obj66, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0f + "'", obj73, 100.0f);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (-1.0f) + "'", obj76, (-1.0f));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(obj80);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        ds.Pilha pilha2 = new ds.Pilha();
        pilha2.empilha((java.lang.Object) 100.0f);
        int int5 = pilha2.tamanho();
        java.lang.Object obj6 = pilha2.desempilha();
        pilha2.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = pilha2.desempilha();
        int int10 = pilha2.tamanho();
        pilha0.empilha((java.lang.Object) pilha2);
        boolean boolean12 = pilha0.vazia();
        ds.Pilha pilha13 = new ds.Pilha();
        pilha13.empilha((java.lang.Object) 100.0f);
        int int16 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj19 = pilha13.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        int int23 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) 1.0f);
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha13.empilha((java.lang.Object) pilha20);
        boolean boolean29 = pilha13.vazia();
        pilha0.empilha((java.lang.Object) pilha13);
        ds.Pilha pilha31 = new ds.Pilha();
        pilha31.empilha((java.lang.Object) 100.0f);
        int int34 = pilha31.tamanho();
        java.lang.Object obj35 = null;
        pilha31.empilha(obj35);
        boolean boolean37 = pilha31.vazia();
        java.lang.Object obj38 = null;
        pilha31.empilha(obj38);
        java.lang.Object obj40 = pilha31.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        boolean boolean42 = pilha41.vazia();
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 100.0f);
        int int46 = pilha43.tamanho();
        java.lang.Object obj47 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj50 = pilha43.desempilha();
        int int51 = pilha43.tamanho();
        pilha41.empilha((java.lang.Object) pilha43);
        java.lang.Object obj53 = pilha41.desempilha();
        pilha41.empilha((java.lang.Object) '#');
        pilha31.empilha((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass57 = pilha31.getClass();
        pilha13.empilha((java.lang.Object) pilha31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0f) + "'", obj50, (-1.0f));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        pilha1.empilha((java.lang.Object) 100.0f);
        pilha0.empilha((java.lang.Object) pilha1);
        pilha0.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 10);
        pilha0.empilha((java.lang.Object) 10);
        ds.Pilha pilha12 = new ds.Pilha();
        pilha12.empilha((java.lang.Object) 100.0f);
        int int15 = pilha12.tamanho();
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.empilha((java.lang.Object) (-1.0f));
        boolean boolean19 = pilha12.vazia();
        boolean boolean20 = pilha12.vazia();
        ds.Pilha pilha21 = new ds.Pilha();
        pilha21.empilha((java.lang.Object) 100.0f);
        int int24 = pilha21.tamanho();
        java.lang.Object obj25 = null;
        pilha21.empilha(obj25);
        java.lang.Object obj27 = pilha21.desempilha();
        pilha12.empilha((java.lang.Object) pilha21);
        pilha0.empilha((java.lang.Object) pilha21);
        ds.Pilha pilha30 = new ds.Pilha();
        pilha30.empilha((java.lang.Object) 100.0f);
        int int33 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj36 = pilha30.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        pilha37.empilha((java.lang.Object) 100.0f);
        int int40 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) 1.0f);
        pilha37.empilha((java.lang.Object) 100.0f);
        pilha30.empilha((java.lang.Object) pilha37);
        java.lang.Object obj46 = pilha30.desempilha();
        boolean boolean47 = pilha30.vazia();
        java.lang.Class<?> wildcardClass48 = pilha30.getClass();
        pilha21.empilha((java.lang.Object) pilha30);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1.0f + "'", obj36, 1.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) 1.0f);
        pilha0.empilha((java.lang.Object) 100.0f);
        int int8 = pilha0.tamanho();
        boolean boolean9 = pilha0.vazia();
        int int10 = pilha0.tamanho();
        java.lang.Object obj11 = pilha0.desempilha();
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        boolean boolean12 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) pilha8);
        boolean boolean10 = pilha8.vazia();
        ds.Pilha pilha11 = new ds.Pilha();
        pilha11.empilha((java.lang.Object) 100.0f);
        int int14 = pilha11.tamanho();
        java.lang.Object obj15 = pilha11.desempilha();
        pilha11.empilha((java.lang.Object) 1L);
        ds.Pilha pilha18 = new ds.Pilha();
        pilha18.empilha((java.lang.Object) 100.0f);
        int int21 = pilha18.tamanho();
        int int22 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha25 = new ds.Pilha();
        pilha25.empilha((java.lang.Object) 100.0f);
        int int28 = pilha25.tamanho();
        java.lang.Object obj29 = pilha25.desempilha();
        pilha25.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = pilha25.desempilha();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        pilha18.empilha((java.lang.Object) wildcardClass33);
        pilha18.empilha((java.lang.Object) (byte) -1);
        pilha11.empilha((java.lang.Object) pilha18);
        java.lang.Object obj38 = pilha11.desempilha();
        pilha8.empilha((java.lang.Object) pilha11);
        ds.Pilha pilha40 = new ds.Pilha();
        pilha40.empilha((java.lang.Object) 100.0f);
        int int43 = pilha40.tamanho();
        java.lang.Object obj44 = null;
        pilha40.empilha(obj44);
        boolean boolean46 = pilha40.vazia();
        int int47 = pilha40.tamanho();
        ds.Pilha pilha48 = new ds.Pilha();
        pilha48.empilha((java.lang.Object) 100.0f);
        int int51 = pilha48.tamanho();
        java.lang.Object obj52 = pilha48.desempilha();
        pilha48.empilha((java.lang.Object) (-1.0f));
        boolean boolean55 = pilha48.vazia();
        boolean boolean56 = pilha48.vazia();
        pilha40.empilha((java.lang.Object) pilha48);
        pilha8.empilha((java.lang.Object) pilha48);
        java.lang.Object obj59 = pilha8.desempilha();
        ds.Pilha pilha60 = new ds.Pilha();
        pilha60.empilha((java.lang.Object) 100.0f);
        int int63 = pilha60.tamanho();
        java.lang.Object obj64 = pilha60.desempilha();
        pilha60.empilha((java.lang.Object) 1L);
        java.lang.Object obj67 = pilha60.desempilha();
        int int68 = pilha60.tamanho();
        java.lang.Object obj69 = null;
        pilha60.empilha(obj69);
        int int71 = pilha60.tamanho();
        java.lang.Class<?> wildcardClass72 = pilha60.getClass();
        pilha8.empilha((java.lang.Object) wildcardClass72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0f) + "'", obj32, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 1L + "'", obj67, 1L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        ds.Pilha pilha6 = new ds.Pilha();
        ds.Pilha pilha7 = new ds.Pilha();
        pilha7.empilha((java.lang.Object) 100.0f);
        pilha6.empilha((java.lang.Object) pilha7);
        pilha6.empilha((java.lang.Object) 1.0d);
        java.lang.Object obj13 = pilha6.desempilha();
        java.lang.Object obj14 = pilha6.desempilha();
        pilha0.empilha((java.lang.Object) pilha6);
        int int16 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 1L);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        pilha9.empilha((java.lang.Object) 100.0f);
        int int12 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) 1.0f);
        java.lang.Object obj15 = pilha9.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        pilha16.empilha((java.lang.Object) 100.0f);
        int int19 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) 1.0f);
        pilha16.empilha((java.lang.Object) 100.0f);
        pilha9.empilha((java.lang.Object) pilha16);
        boolean boolean25 = pilha9.vazia();
        int int26 = pilha9.tamanho();
        boolean boolean27 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) pilha9);
        java.lang.Object obj29 = pilha0.desempilha();
        int int30 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0f + "'", obj15, 1.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) "hi!");
        ds.Pilha pilha3 = new ds.Pilha();
        pilha3.empilha((java.lang.Object) 100.0f);
        int int6 = pilha3.tamanho();
        java.lang.Object obj7 = pilha3.desempilha();
        pilha3.empilha((java.lang.Object) 1L);
        int int10 = pilha3.tamanho();
        int int11 = pilha3.tamanho();
        pilha0.empilha((java.lang.Object) int11);
        java.lang.Object obj13 = pilha0.desempilha();
        ds.Pilha pilha14 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) 100.0f);
        int int17 = pilha14.tamanho();
        java.lang.Object obj18 = pilha14.desempilha();
        pilha14.empilha((java.lang.Object) 1L);
        int int21 = pilha14.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        pilha14.empilha((java.lang.Object) pilha22);
        int int24 = pilha14.tamanho();
        boolean boolean25 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha27 = new ds.Pilha();
        pilha27.empilha((java.lang.Object) 100.0f);
        int int30 = pilha27.tamanho();
        int int31 = pilha27.tamanho();
        int int32 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) 1L);
        int int35 = pilha27.tamanho();
        int int36 = pilha27.tamanho();
        java.lang.Object obj37 = pilha27.desempilha();
        pilha0.empilha((java.lang.Object) pilha27);
        int int39 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1L + "'", obj37, 1L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) 100.0f);
        int int3 = pilha0.tamanho();
        int int4 = pilha0.tamanho();
        java.lang.Object obj5 = pilha0.desempilha();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        pilha8.empilha((java.lang.Object) 100.0f);
        int int11 = pilha8.tamanho();
        java.lang.Object obj12 = pilha8.desempilha();
        pilha8.empilha((java.lang.Object) (-1.0f));
        boolean boolean15 = pilha8.vazia();
        boolean boolean16 = pilha8.vazia();
        boolean boolean17 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) pilha8);
        ds.Pilha pilha19 = new ds.Pilha();
        ds.Pilha pilha20 = new ds.Pilha();
        pilha20.empilha((java.lang.Object) 100.0f);
        pilha19.empilha((java.lang.Object) pilha20);
        int int24 = pilha20.tamanho();
        pilha8.empilha((java.lang.Object) int24);
        int int26 = pilha8.tamanho();
        int int27 = pilha8.tamanho();
        java.lang.Object obj28 = pilha8.desempilha();
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) 100.0f);
        int int32 = pilha29.tamanho();
        java.lang.Object obj33 = pilha29.desempilha();
        pilha29.empilha((java.lang.Object) 1L);
        ds.Pilha pilha36 = new ds.Pilha();
        pilha36.empilha((java.lang.Object) 100.0f);
        int int39 = pilha36.tamanho();
        int int40 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) 1.0d);
        ds.Pilha pilha43 = new ds.Pilha();
        pilha43.empilha((java.lang.Object) 100.0f);
        int int46 = pilha43.tamanho();
        java.lang.Object obj47 = pilha43.desempilha();
        pilha43.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj50 = pilha43.desempilha();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        pilha36.empilha((java.lang.Object) wildcardClass51);
        pilha36.empilha((java.lang.Object) (byte) -1);
        pilha29.empilha((java.lang.Object) pilha36);
        pilha8.empilha((java.lang.Object) pilha29);
        boolean boolean57 = pilha29.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1 + "'", obj28, 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0f) + "'", obj50, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }
}

